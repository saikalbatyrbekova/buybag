package com.example.buybag.repositories;

import com.example.buybag.models.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository <Product, Long>{
    List<Product> findByTitle(String title);

}
