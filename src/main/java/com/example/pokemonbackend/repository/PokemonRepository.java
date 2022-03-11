package com.example.pokemonbackend.repository;

import com.example.pokemonbackend.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
