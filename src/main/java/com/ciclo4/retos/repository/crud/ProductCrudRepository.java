package com.ciclo4.retos.repository.crud;

import com.ciclo4.retos.model.Product;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCrudRepository extends MongoRepository<Product, String> {
    public List<Product> findByPrice(double price);
    public List<Product> findByDescriptionContainingIgnoreCase(String description);
   

}
