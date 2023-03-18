package br.com.dio.academia.interfaces.service;

import java.util.List;
import br.com.dio.academia.entity.Aluno;
import br.com.dio.academia.entity.AlunoForm;

public interface IAlunoService {
	Aluno create(AlunoForm form);
	Aluno get(Long id);
	List<Aluno> getAll();
	Aluno update(Long id, AlunoForm form);
	void delete(Long id);
}
