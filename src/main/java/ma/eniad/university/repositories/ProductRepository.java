package ma.eniad.university.repositories;

import ma.eniad.university.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author $ {USER}
 **/
public interface ProductRepository extends JpaRepository<Product, Long> {
    // methode qui permet de chercher les produits dont le nom contient mc
    //way 1 to do it
    List<Product> findByNameContaining(String mc);
    //way 2 to to it
    @Query("SELECT p FROM Product p WHERE p.name LIKE :x")
    public List<Product> search(@Param("x") String mc);




}
