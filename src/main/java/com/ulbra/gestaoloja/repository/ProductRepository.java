package com.ulbra.gestaoloja.repository;

import com.ulbra.gestaoloja.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long>{}
