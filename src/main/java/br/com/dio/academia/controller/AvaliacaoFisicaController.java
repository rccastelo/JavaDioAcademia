package br.com.dio.academia.controller;

import br.com.dio.academia.entity.AvaliacaoFisica;
import br.com.dio.academia.entity.AvaliacaoFisicaForm;
import br.com.dio.academia.entity.Matricula;
import br.com.dio.academia.service.AvaliacaoFisicaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaService service;

    @GetMapping
    public List<AvaliacaoFisica> getAll() {
        return service.getAll();
    }

    @PostMapping
    public AvaliacaoFisica create(@Valid @RequestBody AvaliacaoFisicaForm form) {
        return service.create(form);
    }

    @GetMapping("/{id}")
    public AvaliacaoFisica get(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping("/aluno/{aluno_id}")
    public List<AvaliacaoFisica> getAlunoId(@PathVariable Long aluno_id) {
        return service.getAlunoId(aluno_id);
    }

    @DeleteMapping("/aluno/{aluno_id}")
    public void deleteAlunoId(@PathVariable Long aluno_id) {
        service.deleteAlunoId(aluno_id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
