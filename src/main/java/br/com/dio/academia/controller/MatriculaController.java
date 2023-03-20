package br.com.dio.academia.controller;

import br.com.dio.academia.entity.Matricula;
import br.com.dio.academia.entity.MatriculaForm;
import br.com.dio.academia.service.MatriculaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    @Autowired
    private MatriculaService service;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
        return service.getAll(bairro);
    }

    @GetMapping("/{id}")
    public Matricula get(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping("/aluno/{aluno_id}")
    public List<Matricula> getAlunoId(@PathVariable Long aluno_id) {
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
