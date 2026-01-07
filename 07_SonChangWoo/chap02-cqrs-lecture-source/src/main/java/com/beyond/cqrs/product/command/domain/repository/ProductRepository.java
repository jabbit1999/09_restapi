package com.beyond.cqrs.product.command.domain.repository;

import com.beyond.cqrs.product.command.domain.aggregate.Product;

public interface ProductRepository {

  Product save(Product product);
}
