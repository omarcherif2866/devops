package tn.esprit.devops_project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import tn.esprit.devops_project.entities.Product;
import tn.esprit.devops_project.entities.ProductCategory;
import tn.esprit.devops_project.entities.Stock;
import tn.esprit.devops_project.repositories.ProductRepository;
import tn.esprit.devops_project.services.Iservices.IProductService;

import org.mockito.Mock;
import org.mockito.InjectMocks;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;


@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private IProductService productService ;

   
    @Test
    public void addProductTest() {


        Product Produit = new Product();
        Produit.setTitle("pull");
        Produit.setQuantity(23);
        Produit.setPrice(234);
        Produit.setCategory(ProductCategory.CLOTHING);
         Product result = productService.addProduct(Produit,1L);
        assertEquals(Produit, result);
        assertTrue(stock.getProducts().contains(Produit));         }
      /*  Stock stock = new Stock();
        stock.setIdStock(1L);
        stock.setTitle("Test Stock");

        Product Produit = new Product();
        Produit.setTitle("pull");
        Produit.setQuantity(23);
        Produit.setPrice(234);
        Produit.setCategory(ProductCategory.CLOTHING);
      Produit.setStock(null);

        Product result = productService.addProduct(Produit,null);
        assertEquals(Produit, result);
        assertTrue(stock.getProducts().contains(Produit));*/
   


/*    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private IProductService productService ;

    @Test
    public void testGetUserById() {
        // Créer un utilisateur fictif
        Stock stock = new Stock();
        stock.setTitle("Test Stock");

        Product Produit = new Product();
        Produit.setTitle("machine");
        Produit.setQuantity(11);
        Produit.setPrice(111);
        Produit.setCategory(ProductCategory.ELECTRONICS);
        Produit.setStock(stock);

        when(productRepository.findById(Produit.getIdProduct())).thenReturn(Optional.of(Produit));

        Product result = productService.addProduct(Produit,stock.getIdStock());

        assertEquals(Produit, result);
    }
    */
}
