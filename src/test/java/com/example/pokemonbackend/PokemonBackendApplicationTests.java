package com.example.pokemonbackend;

import com.example.pokemonbackend.model.Pokemon;
import com.example.pokemonbackend.repository.PokemonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PokemonBackendApplicationTests {


  @Test
  void testFunc() {
    Assertions.assertEquals(true, true);
  }

}
