package ma.eniad.university.web;

import ma.eniad.university.entities.Product;
import ma.eniad.university.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * @author $ {USER}
 **/
@RestController
public class ProductRestService {
    @Autowired  //pour l'injection des dependances
    private ProductRepository productRepository;
    @GetMapping("/products")  //localhost:8085/products
    public List<Product> products() {
        return productRepository.findAll();
    }

    //si je veux un produit specifique par id par exemple
    @GetMapping("/products/{id}")
    //public Product getProduct(@PathVariable int id) {}
    /*public Product product(@PathVariable Long id) {
        return productRepository.findById(id).get();
    }*/
    public Product product(@PathVariable int id) {
        Optional<Product> byId = productRepository.findById((long) id);
        return byId.get();
    }
}
