package br.com.dio.academia.interfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import br.com.dio.academia.entity.AvaliacaoFisica;

import java.util.List;

@Repository
public interface IAvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long> {
    /**
     * @param aluno_id id do aluno
     * @return lista de avaliações físicas do aluno informado
     */
    @Query(value = "SELECT af.id, af.data_da_avaliacao, af.altura, af.peso, " +
            "af.aluno_id, a.bairro, a.cpf, a.data_de_nascimento, a.nome " +
            "FROM tb_avaliacoes_fisicas af " +
            "INNER JOIN tb_alunos a ON af.aluno_id = a.id " +
            "WHERE a.id = :aluno_id", nativeQuery = true)
    List<AvaliacaoFisica> findAvaliacoesAlunoId(Long aluno_id);
}
