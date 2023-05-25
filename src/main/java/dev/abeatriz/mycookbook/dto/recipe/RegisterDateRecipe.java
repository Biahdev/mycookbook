package dev.abeatriz.mycookbook.dto.recipe;

import dev.abeatriz.mycookbook.enums.Difficulty;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RegisterDateRecipe(
        @NotBlank
        String title,
        @NotBlank
        String author,
        @NotNull
        Difficulty difficulty,
        @NotNull
        int preparationTime,
        @NotNull
        int servings,
        @NotBlank
        String ingredients,
        @NotBlank
        String method

) {}
