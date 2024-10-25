package com.github.nogueiralegacy.desafio_anota_ai.repository;

import com.github.nogueiralegacy.desafio_anota_ai.domain.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
