package dev.abeatriz.mycookbook.service;

import dev.abeatriz.mycookbook.dto.recipe.RegisterDateRecipe;
import dev.abeatriz.mycookbook.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    @Autowired
    RecipeRepository repository;

    public RegisterDateRecipe register( RegisterDateRecipe dados ){
        return repository.save(dados);

    }

}
