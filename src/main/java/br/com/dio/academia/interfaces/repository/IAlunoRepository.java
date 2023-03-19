package br.com.dio.academia.interfaces.repository;

import br.com.dio.academia.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface IAlunoRepository extends JpaRepository<Aluno, Long> {
	
    List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);
    
}
