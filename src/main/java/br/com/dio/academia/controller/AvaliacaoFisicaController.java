package br.com.dio.academia.controller;

import br.com.dio.academia.entity.AvaliacaoFisica;
import br.com.dio.academia.entity.AvaliacaoFisicaForm;
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

}
