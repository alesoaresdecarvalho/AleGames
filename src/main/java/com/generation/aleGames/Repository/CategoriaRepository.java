package com.generation.aleGames.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.aleGames.model.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria,Long>{

	Optional<Categoria> buscarCategoriaPorNome(String nome);

}
