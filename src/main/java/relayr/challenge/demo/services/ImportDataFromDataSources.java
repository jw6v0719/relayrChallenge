package relayr.challenge.demo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImportDataFromDataSources {

    Logger logger = LoggerFactory.getLogger(ImportDataFromDataSources.class);


    public DataPlatformConnector pullProductFromDataSources(String dataSource) {
        if (dataSource.equals("fake")) {
            logger.info("Fetch product from data source");
            FakeDataPlatformConnector connector = new FakeDataPlatformConnector();
            connector.fetchDataFromSource(dataSource);
            return connector;
        } else {
            logger.info("none valid data source");
            return null;
        }
    }
}
