package br.com.dio.academia.interfaces.service;

import java.util.List;
import br.com.dio.academia.entity.AvaliacaoFisica;
import br.com.dio.academia.entity.AvaliacaoFisicaForm;

public interface IAvaliacaoFisicaService {
	AvaliacaoFisica create(AvaliacaoFisicaForm form);
	AvaliacaoFisica get(Long id);
	List<AvaliacaoFisica> getAll();
	AvaliacaoFisica update(Long id, AvaliacaoFisicaForm form);
	void delete(Long id);
}
