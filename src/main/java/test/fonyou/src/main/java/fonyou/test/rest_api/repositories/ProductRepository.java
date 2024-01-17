package fonyou.test.rest_api.repositories;

import fonyou.test.rest_api.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
