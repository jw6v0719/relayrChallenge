package relayr.challenge.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import relayr.challenge.demo.Bean.ProductBean;
import relayr.challenge.demo.services.DataPlatformConnector;
import relayr.challenge.demo.services.DataSourceService;
import relayr.challenge.demo.services.ImportDataFromDataSources;

import java.util.List;

@RestController
public class SearchEndpoint {

    static ImportDataFromDataSources ds = new ImportDataFromDataSources();
    static DataPlatformConnector connector = ds.pullProductFromDataSources("fake");
    static DataSourceService dataSourceService = new DataSourceService();

    @RequestMapping("/add")
    public String addDataSource(@RequestParam String dataSource) {
        dataSourceService.addDataSources(dataSource);
        if (dataSource.equals("fake")) {
            return "successfully add data source";
        } else {
            return "not a valid data source";
        }

    }

    @RequestMapping("/search")
    public String getProduct(@RequestParam String productName, @RequestParam String category) {
        List<String> pb_list =  connector.searchProduct(productName, category);

        return String.join(",", pb_list);
    }

    @RequestMapping("/")
    public String home() {

        return "Usage: /add?dataSource={data_source} \n" +
                "/search?productName={name}&category={category}";
    }
}
