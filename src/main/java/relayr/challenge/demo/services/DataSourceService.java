package relayr.challenge.demo.services;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class DataSourceService {

    @Autowired
    private static List<String> dataSources = new ArrayList<>();

    public void addDataSources(String dataSource) {
        dataSources.add(dataSource);
    }

    public List<String> getDataSources() {
        return dataSources;
    }

}
