package br.com.dio.academia.interfaces.service;

import java.util.List;
import br.com.dio.academia.entity.Aluno;
import br.com.dio.academia.entity.AlunoForm;
import br.com.dio.academia.entity.AvaliacaoFisica;

public interface IAlunoService {
	/**
	 * Cria um Aluno e salva no banco de dados.
	 * @param form formulário referente aos dados para criação de um Aluno no banco de dados.
	 * @return Aluno recém-criado.
	 */
	Aluno create(AlunoForm form);
	/**
	 * Retorna um Aluno que está no banco de dados de acordo com seu Id.
	 * @param id id do Aluno que será exibido.
	 * @return Aluno de acordo com o Id fornecido.
	 */
	Aluno get(Long id);
	/**
	 * Retorna os Alunos que estão no banco de dados.
	 * @return Uma lista dos Alunos que foram encontrados no DB.
	 */
	List<Aluno> getAll();
	/**
	 * Retorna os Alunos que estão no banco de dados,
	 * caso a data de nascimento seja informada, filtra pela data.
	 * @param dataDeNascimento data de nascimento a ser utilizada para filtrar os alunos.
	 * @return Uma lista dos Alunos que foram encontrados no DB.
	 */
	List<Aluno> getDataDeNascimento(String dataDeNascimento);
	/**
	 * Retorna os Alunos que estão no banco de dados,
	 * caso a data de nascimento seja informada, filtra pela data.
	 * @param nome data de nascimento a ser utilizada para filtrar os alunos.
	 * @return Uma lista dos Alunos que foram encontrados no DB.
	 */
	List<Aluno> getNome(String nome);
	/**
	 * Atualiza os dados do Aluno.
	 * @param id id do Aluno que será atualizado.
	 * @param form formulário referente aos dados necessários para atualização do Aluno
	 * no banco de dados.
	 * @return Aluno recém-atualizado.
	 */
	Aluno update(Long id, AlunoForm form);
	/**
	 * Deleta um Aluno específico.
	 * @param id id do Aluno que será removido.
	 */
	void delete(Long id);
	/**
	 *
	 * @param id id do aluno que será recuperada a lista de avaliações
	 * @return uma lista com todas as avaliações do aluno de acordo com o Id
	 */
	List<AvaliacaoFisica> getAvaliacoesFisicas(Long id);
}
