package br.com.dio.academia.interfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import br.com.dio.academia.entity.Matricula;

import java.util.List;

@Repository
public interface IMatriculaRepository extends JpaRepository<Matricula, Long> {
    /**
     * @param bairro bairro a ser consultado
     * @return lista de alunos matriculados que residem no bairro passado como parâmetro
     */
    @Query(value = "SELECT m.id, m.data_da_matricula, m.aluno_id, a.bairro, a.cpf, a.data_de_nascimento, a.nome " +
            "FROM tb_matriculas m " +
            "INNER JOIN tb_alunos a ON m.aluno_id = a.id " +
            "WHERE a.bairro = :bairro", nativeQuery = true)
    List<Matricula> findMatriculasBairro(String bairro);

    /**
     * @param aluno_id id do aluno
     * @return lista de matriculas do aluno informado
     */
    @Query(value = "SELECT m.id, m.data_da_matricula, m.aluno_id, a.bairro, a.cpf, a.data_de_nascimento, a.nome " +
            "FROM tb_matriculas m " +
            "INNER JOIN tb_alunos a ON m.aluno_id = a.id " +
            "WHERE a.id = :aluno_id", nativeQuery = true)
    List<Matricula> findMatriculasAlunoId(Long aluno_id);
}
