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
    //way 2 to to it using annotation @Query using HQL (JPA QL)
    @Query("SELECT p FROM Product p WHERE p.name LIKE :x")
    public List<Product> search(@Param("x") String mc);

    //chercher les produit superieur à un prix using first method
    List<Product> findByPriceGreaterThan(Double price);
    //second way : using annotation @Query with HQL (JPA QL)
    @Query("SELECT p FROM Product p WHERE p.price > :x")
    public List<Product> search2(@Param("x") Double price);



}
