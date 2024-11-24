package ma.eniad.university.web;

import ma.eniad.university.entities.Product;
import ma.eniad.university.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
