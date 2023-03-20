package br.com.dio.academia.service;

import java.time.LocalDate;
import java.util.List;

import br.com.dio.academia.entity.AvaliacaoFisica;
import br.com.dio.academia.infra.utils.JavaTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dio.academia.entity.Aluno;
import br.com.dio.academia.entity.AlunoForm;
import br.com.dio.academia.interfaces.repository.IAlunoRepository;
import br.com.dio.academia.interfaces.service.IAlunoService;

@Service
public class AlunoService implements IAlunoService {

	@Autowired
	private IAlunoRepository repository;
	
	@Override
	public Aluno create(AlunoForm alunoForm) {
		Aluno aluno = new Aluno();
		
		aluno.setNome(alunoForm.getNome());
		aluno.setCpf(alunoForm.getCpf());
		aluno.setBairro(alunoForm.getBairro());
		aluno.setDataDeNascimento(alunoForm.getDataDeNascimento());
		
		repository.save(aluno);
		
		return aluno;
	}

	@Override
	public Aluno get(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Aluno> getAll() {
		return repository.findAll();
	}

	@Override
	public List<Aluno> getDataDeNascimento(String dataDeNascimento) {
		if (dataDeNascimento == null) {
			return repository.findAll();
		} else {
			LocalDate dn = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);

			return repository.findByDataDeNascimento(dn);
		}
	}

	@Override
	public List<Aluno> getNome(String nome) {
		if (nome == null) {
			return repository.findAll();
		} else {
			return repository.findByNome(nome);
		}
	}

	@Override
	public Aluno update(Long id, AlunoForm form) {
		Aluno aluno = repository.getReferenceById(id);

		if (aluno != null) {
			aluno.setNome(form.getNome());
			aluno.setCpf(form.getCpf());
			aluno.setBairro(form.getBairro());
			aluno.setDataDeNascimento(form.getDataDeNascimento());

			repository.save(aluno);
		}

		return aluno;
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

	@Override
	public List<AvaliacaoFisica> getAvaliacoesFisicas(Long id) {
		Aluno aluno = repository.findById(id).get();

		return aluno.getAvaliacoes();
	}
}
