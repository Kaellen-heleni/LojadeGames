package com.generation.lojagames.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojagames.model.Categoria;
import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	List<Categoria> findAllByTituloContainingIgnoreCase(@Param ("nome") String nome);

}
