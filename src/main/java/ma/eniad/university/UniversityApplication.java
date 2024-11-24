package ma.eniad.university;

import ma.eniad.university.entities.Product;
import ma.eniad.university.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class UniversityApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {

        SpringApplication.run(UniversityApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product(null, "Computer", 4300, 3));
        productRepository.save(new Product(null, "Smart Phone", 2100, 5));
        productRepository.save(new Product(null, "Car", 45300, 1));
        productRepository.save(new Product(null, "IPhone", 6300, 2));

        List<Product> products = productRepository.findAll();
        //products.forEach(System.out::println);
        products.forEach(p->{
            System.out.println(p.toString());
        });

        Product product = productRepository.findById(Long.valueOf(1)).get();
        System.out.println("******************************");
        System.out.println(product.toString());

        System.out.println("******************************");

        List<Product> listProduits = productRepository.findByNameContaining("Car");
        listProduits.forEach(p->{
            System.out.println(p.toString());
        });
        System.out.println("--------------------------------");
        //using annotation @Query using HQL (JPA QL)
        List<Product> listProduits2 = productRepository.findByNameContaining("%Car%");
        listProduits.forEach(p->{
            System.out.println(p.toString());
        });


    }
}
