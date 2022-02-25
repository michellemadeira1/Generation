package com.Game.Crud.lojagame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Game.Crud.lojagame.model.CategoriaModel;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{
    public List<CategoriaModel> findAllByNomeContainingIgnoreCase(String nome);
    
}
