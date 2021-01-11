package relayr.challenge.demo.services;

import relayr.challenge.demo.Bean.ProductBean;

import java.util.ArrayList;
import java.util.List;

public class FakeDataPlatformConnector implements DataPlatformConnector {


    private static ArrayList<ProductBean> pb_list = new ArrayList<>();

    @Override
    public void createDataEndClient() {
        // no need to implement here
    }

    @Override
    public void fetchDataFromSource(String fakeSource) {
        pb_list.add(new ProductBean("p1", "c1", fakeSource));
        pb_list.add(new ProductBean("p2", "c2", fakeSource));
        pb_list.add(new ProductBean("p3", "c3", fakeSource));
    }

    public List<String> searchProduct(String product_name, String category) {
        List<String> rtnList = new ArrayList<>();
        for (ProductBean pb: pb_list) {
            if (pb.getProduct_name().equals(product_name) && pb.getCategory().equals(category)) {
                rtnList.add(pb.toString());
            }
        }
        return rtnList;
    }
}
