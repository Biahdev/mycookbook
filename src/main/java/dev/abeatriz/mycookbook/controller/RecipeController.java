package dev.abeatriz.mycookbook.controller;


import dev.abeatriz.mycookbook.dto.recipe.RegisterDateRecipe;
import dev.abeatriz.mycookbook.service.RecipeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("recipes")
public class RecipeController {

    @Autowired
    private RecipeService service;

    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid RegisterDateRecipe dados) {
        service.register(dados);
    }

    @GetMapping
    public ResponseEntity<Page<DadosListagemMedico>> listar( @PageableDefault(size = 10, sort = {"title"})) {
        var page = repository.findAllByAtivoTrue(paginacao).map(DadosListagemMedico::new);
        return ResponseEntity.ok(page);
    }



}
