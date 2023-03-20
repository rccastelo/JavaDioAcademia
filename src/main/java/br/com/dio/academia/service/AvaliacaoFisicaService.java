package br.com.dio.academia.service;

import br.com.dio.academia.entity.Aluno;
import br.com.dio.academia.entity.AvaliacaoFisica;
import br.com.dio.academia.entity.AvaliacaoFisicaForm;
import br.com.dio.academia.entity.Matricula;
import br.com.dio.academia.interfaces.repository.IAlunoRepository;
import br.com.dio.academia.interfaces.repository.IAvaliacaoFisicaRepository;
import br.com.dio.academia.interfaces.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AvaliacaoFisicaService implements IAvaliacaoFisicaService {

    @Autowired
    private IAvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private IAlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return avaliacaoFisicaRepository.findById(id).get();
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return avaliacaoFisicaRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        avaliacaoFisicaRepository.deleteById(id);
    }

    @Override
    public void deleteAlunoId(Long aluno_id) {
        List<AvaliacaoFisica> avaliacoes = avaliacaoFisicaRepository.findAvaliacoesAlunoId(aluno_id);

        if (avaliacoes != null) {
            for (AvaliacaoFisica m : avaliacoes) {
                avaliacaoFisicaRepository.deleteById(m.getId());
            }
        }
    }

    @Override
    public List<AvaliacaoFisica> getAlunoId(Long aluno_id) {
        return avaliacaoFisicaRepository.findAvaliacoesAlunoId(aluno_id);
    }
}
