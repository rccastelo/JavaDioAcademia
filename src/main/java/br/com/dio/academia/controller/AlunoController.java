package br.com.dio.academia.controller;

import java.util.List;
import br.com.dio.academia.entity.AvaliacaoFisica;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.dio.academia.entity.Aluno;
import br.com.dio.academia.entity.AlunoForm;
import br.com.dio.academia.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoService service;
	
	@GetMapping
	public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false) String dataDeNascimento) {
		return service.getAll(dataDeNascimento);
	}
	
	@PostMapping
	public Aluno create(@Valid @RequestBody AlunoForm form) {
		return service.create(form);
	}

	@GetMapping("/avaliacoes/{id}")
	public List<AvaliacaoFisica> getAvaliacoesFisicas(@PathVariable Long id) {
		return service.getAvaliacoesFisicas(id);
	}

	@GetMapping("/{id}")
	public Aluno get(@PathVariable Long id) {
		return service.get(id);
	}
}
