class Main {
    public static void main(String[] args) {
        Product p1  = new Product(1, "Nike", 200.00);
        Product p2  = new Product(2, "Adidas", 190.80);
        Product p3  = new Product(3, "Puma", 195.90);
        Cart c1    = new Cart();
        c1.calculateSubtotal(p1, 3);
    }
}