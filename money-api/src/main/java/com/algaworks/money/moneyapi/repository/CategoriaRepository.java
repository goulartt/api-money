package com.algaworks.money.moneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.money.moneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
