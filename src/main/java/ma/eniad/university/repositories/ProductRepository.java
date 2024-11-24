package ma.eniad.university.repositories;

import ma.eniad.university.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author $ {USER}
 **/
public interface ProductRepository extends JpaRepository<Product, Long> {
    // methode qui permet de chercher les produits dont le nom contient mc
    List<Product> findByNameContaining(String mc);
}
