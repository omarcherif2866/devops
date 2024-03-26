package tn.esprit.devops_project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.devops_project.entities.Product;
import tn.esprit.devops_project.entities.ProductCategory;
import tn.esprit.devops_project.entities.Stock;
import tn.esprit.devops_project.services.Iservices.IProductService;
import tn.esprit.devops_project.services.Iservices.IStockService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class StockServiceTest {

    @Autowired
    private IStockService stockService;

    @Test
    public void addStockTest() {

        Stock stock = new Stock();
        stock.setTitle("Test Stock");




        Stock result = stockService.addStock(stock);
        assertEquals(stock, result);
        assertNotNull(result.getIdStock());
        assertEquals(stock.getTitle(), result.getTitle());

    }
}
