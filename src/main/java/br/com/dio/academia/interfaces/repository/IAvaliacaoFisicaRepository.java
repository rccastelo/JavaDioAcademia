package br.com.dio.academia.interfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.dio.academia.entity.AvaliacaoFisica;

@Repository
public interface IAvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long> {
	
}
