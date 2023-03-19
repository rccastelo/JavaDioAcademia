package br.com.dio.academia.interfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import br.com.dio.academia.entity.Matricula;

import java.util.List;

@Repository
public interface IMatriculaRepository extends JpaRepository<Matricula, Long> {
//    @Query(value = "SELECT * FROM tb_matriculas m " +
//            "INNER JOIN tb_alunos a ON m.aluno_id = a.id " +
//            "WHERE a.bairro = :bairro", nativeQuery = true)
    @Query("FROM Matricula m WHERE m.aluno.bairro = :bairro ")
    List<Matricula> findAlunosMatriculadosBairro(String bairro);
}
