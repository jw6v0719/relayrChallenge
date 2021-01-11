package relayr.challenge.demo.Bean;

public class ProductBean {

    private String product_name;
    private String category;
    private String dataSource;


    public ProductBean(String product_name, String category, String dataSource) {
        setProduct_name(product_name);
        setCategory(category);
        setDataSource(dataSource);
    }

    private void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    private void setCategory(String category) {
        this.category = category;
    }

    private void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getCategory() {
        return category;
    }

    public String getDataSource() {
        return dataSource;
    }

    public String toString() {
        return "{product_name:{product_name}, category:{category}, DataSource:{data_source}}"
                .replace("{product_name}", getProduct_name())
                .replace("{category}", getCategory())
                .replace("{data_source}", getDataSource());
    }


}
