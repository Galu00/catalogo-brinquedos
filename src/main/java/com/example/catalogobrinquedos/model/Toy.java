package com.example.catalogobrinquedos.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.AccessLevel;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Toy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @NonNull
    private String description;

    private ToyCategory category;

    @NonNull
    private String brand;

    private String image;

    @NonNull
    private Double price;

    private String details;

    public enum ToyCategory {
        ACTION_FIGURE,
        DOLL,
        PUZZLE
    }
    public Toy(String description, ToyCategory category, String brand, String image, String details, Double price) {
        this.description = description;
        this.category = category;
        this.brand = brand;
        this.image = image;
        this.details = details;
        this.price = price;
    }
}
