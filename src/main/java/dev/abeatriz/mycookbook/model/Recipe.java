package dev.abeatriz.mycookbook.model;


import dev.abeatriz.mycookbook.dto.recipe.RegisterDateRecipe;
import dev.abeatriz.mycookbook.enums.Difficulty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "recipes")
@Entity(name = "Recipe")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 100)
    private String author;

    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    @Column(name = "preparation_time", nullable = false)
    private int preparationTime;

    @Column(nullable = false)
    private int servings;

    @Column(nullable = false)
    private String ingredients;

    @Column(nullable = false)
    private String method;

    public Recipe( RegisterDateRecipe dados) {
        this.title = dados.title();
        this.author = dados.author();
        this.difficulty = dados.difficulty();
        this.preparationTime = dados.preparationTime();
        this.servings = dados.servings();
        this.ingredients = dados.ingredients();
        this.method = dados.method();
    }



}
