package com.example.pokemonbackend.controller;

import com.example.pokemonbackend.model.Pokemon;
import com.example.pokemonbackend.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class RestControllerPokemon {

    @Autowired
    private PokemonRepository pokemonRepository;

    @PostMapping("/pokemon")
    @ResponseStatus(HttpStatus.CREATED)
    public Pokemon postCounty(@RequestBody Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }


    @GetMapping("/pokemon")
    public List<Pokemon> getAll() {
        return pokemonRepository.findAll();
    }

    @DeleteMapping("/pokemon/{id}")
    public ResponseEntity<String> deletePokemon(@PathVariable Long id) {
        pokemonRepository.deleteById(id);

        Optional<Pokemon> o = pokemonRepository.findById(id);

        if (!o.isPresent()) {
            return new ResponseEntity<>("Pokemon med id = " + id + " er blevet slettet", HttpStatus.OK);
        }
        return new ResponseEntity<>("Kunne ikke finde id = " + id, HttpStatus.NOT_FOUND);

    }

}
