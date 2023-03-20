package br.com.dio.academia.interfaces.repository;

import br.com.dio.academia.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface IAlunoRepository extends JpaRepository<Aluno, Long> {
    /**
     *
     * @param dataDeNascimento: data de nascimento dos alunos
     * @return lista com todos os alunos com a data de nascimento passada como parâmetro da função
     */
    List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);
    /**
     *
     * @param nome: nome do aluno a ser utilizado no filtro
     * @return lista com todos os alunos com o nome passado como parâmetro
     */
    List<Aluno> findByNome(String nome);
}
