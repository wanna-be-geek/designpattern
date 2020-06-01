package pattern.builder;

public class Client {
    public static void main(String[] args) {
        Directer directer=new Directer();
        Product product1 = directer.getAProduct();
        product1.showProduct();

        Product product2 = directer.getBProduct();
        product2.showProduct();
    }
}
