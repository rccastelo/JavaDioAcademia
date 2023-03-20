package br.com.dio.academia.service;

import br.com.dio.academia.entity.Aluno;
import br.com.dio.academia.entity.Matricula;
import br.com.dio.academia.entity.MatriculaForm;
import br.com.dio.academia.interfaces.repository.IAlunoRepository;
import br.com.dio.academia.interfaces.repository.IMatriculaRepository;
import br.com.dio.academia.interfaces.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MatriculaService implements IMatriculaService {

    @Autowired
    private IMatriculaRepository matriculaRepository;

    @Autowired
    private IAlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return matriculaRepository.findById(id).get();
    }

    @Override
    public List<Matricula> getAlunoId(Long aluno_id) {
        return matriculaRepository.findMatriculasAlunoId(aluno_id);
    }

    @Override
    public List<Matricula> getAll(String bairro) {
        if(bairro == null){
            return matriculaRepository.findAll();
        }else{
            return matriculaRepository.findMatriculasBairro(bairro);
        }
    }

    @Override
    public void deleteAlunoId(Long aluno_id) {
        List<Matricula> matriculas = matriculaRepository.findMatriculasAlunoId(aluno_id);

        if (matriculas != null) {
            for (Matricula m : matriculas) {
                matriculaRepository.deleteById(m.getId());
            }
        }
    }

    @Override
    public void delete(Long id) {
        matriculaRepository.deleteById(id);
    }
}
