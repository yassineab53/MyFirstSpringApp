package ma.eniad.university.repositories;

import ma.eniad.university.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author $ {USER}
 **/
public interface ProductRepository extends JpaRepository<Product, Long> {
}
