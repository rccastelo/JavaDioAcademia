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
}
