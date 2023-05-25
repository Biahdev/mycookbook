package dev.abeatriz.mycookbook.repository;


import dev.abeatriz.mycookbook.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository  extends JpaRepository<Recipe, Long> { }
