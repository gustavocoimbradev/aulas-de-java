class Cart {

    public void calculateSubtotal(Product product, int quantity) {
        double total = product.getPrice() * quantity;
        System.out.println("Subtotal: " + total);
    }

}