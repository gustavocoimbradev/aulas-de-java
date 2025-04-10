class Product {
    private int id;
    private String name;
    private Double price;

    Product(int id, String name, Double price) {
        setId(id);
        setName(name);
        setPrice(price);
    }

    private void setId(int id) {
        this.id = id;
    }

    int getId() {
        return(this.id);
    }

    private void setName(String name) {
        this.name = name;
    }

    String getName() {
        return(this.name);
    }

    private void setPrice(Double price) {
        this.price = price;
    }

    Double getPrice() {
        return(this.price);
    }

}