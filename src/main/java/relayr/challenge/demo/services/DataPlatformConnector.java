package relayr.challenge.demo.services;

import relayr.challenge.demo.Bean.ProductBean;

import java.util.List;

public interface DataPlatformConnector {

    void createDataEndClient(); // For implement different database/data platform clients
    void fetchDataFromSource(String dataSource); // Fetch/scrape productions to database/data platform
    List<String> searchProduct(String product_name, String category); // search product by name and category
}
