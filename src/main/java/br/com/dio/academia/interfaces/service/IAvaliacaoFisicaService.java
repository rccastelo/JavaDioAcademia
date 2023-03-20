package br.com.dio.academia.interfaces.service;

import java.util.List;
import br.com.dio.academia.entity.AvaliacaoFisica;
import br.com.dio.academia.entity.AvaliacaoFisicaForm;
import br.com.dio.academia.entity.Matricula;

public interface IAvaliacaoFisicaService {
	/**
	 * Cria uma Avaliação Física e salva no banco de dados.
	 * @param form - formulário referente aos dados para criação da Avaliação Física no banco de dados.
	 * @return - Avaliação Física recém-criada.
	 */
	AvaliacaoFisica create(AvaliacaoFisicaForm form);
	/**
	 * Retorna uma Avaliação Física que está no banco de dados de acordo com seu Id.
	 * @param id - id da Avaliação Física que será exibida.
	 * @return - Avaliação Física de acordo com o Id fornecido.
	 */
	AvaliacaoFisica get(Long id);
	/**
	 * Retorna todas as Avaliações Física que estão no banco de dados.
	 * @return - Uma lista com todas as Avaliações Física que estão salvas no DB.
	 */
	List<AvaliacaoFisica> getAll();
	/**
	 * Deleta uma Avaliação Física específica.
	 * @param id - id da Avaliação Física que será removida.
	 */
	void delete(Long id);
	/**
	 * Excluir avaliação física através do id do aluno.
	 * @param aluno_id id do aluno.
	 */
	void deleteAlunoId(Long aluno_id);
	/**
	 * Retorna a(s) avaliação(ões) de acordo com o id do aluno.
	 * @param aluno_id - id do aluno.
	 * @return - Avaliações físicas de acordo com o id do aluno fornecido.
	 */
	List<AvaliacaoFisica> getAlunoId(Long aluno_id);
}
