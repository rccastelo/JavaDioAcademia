package br.com.dio.academia.interfaces.service;

import java.util.List;
import br.com.dio.academia.entity.Matricula;
import br.com.dio.academia.entity.MatriculaForm;

public interface IMatriculaService {
	Matricula create(MatriculaForm form);
	Matricula get(Long id);
	List<Matricula> getAll();
	void delete(Long id);
}
