package br.com.dio.academia.interfaces.service;

import java.util.List;
import br.com.dio.academia.entity.Matricula;
import br.com.dio.academia.entity.MatriculaForm;

public interface IMatriculaService {
	/**
	 * Cria uma Matrícula e salva no banco de dados.
	 * @param form - formulário referente aos dados para criação da Matrícula no banco de dados.
	 * @return - Matrícula recém-criada.
	 */
	Matricula create(MatriculaForm form);
	/**
	 * Retorna uma Matrícula que está no banco de dados de acordo com seu Id.
	 * @param id - id da Matrícula que será exibida.
	 * @return - Matrícula de acordo com o Id fornecido.
	 */
	Matricula get(Long id);
	/**
	 * Deleta uma Matrícula específica.
	 * @param id - id da Matrícula que será removida.
	 */
	void delete(Long id);
	/**
	 * Retorna todas as Matrículas que estão no banco de dados, caso seja informado um bairro,
	 * é feito um filtro utilizando o bairro informado..
	 * @param bairro - bairro para ser utilizado na seleção das matrículas.
	 * @return - uma lista com todas as Matrículas que estão salvas no DB.
	 */
	List<Matricula> getAll(String bairro);
	/**
	 * Excluir matrícula através do id do aluno.
	 * @param aluno_id id do aluno.
	 */
	void deleteAlunoId(Long aluno_id);
	/**
	 * Retorna a(s) matrícula(s) de acordo com o id do aluno.
	 * @param aluno_id - id do aluno.
	 * @return - Matrícula de acordo com o id do aluno fornecido.
	 */
	List<Matricula> getAlunoId(Long aluno_id);
}
