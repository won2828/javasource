package poly;

public class ProductEx {
    public static void main(String[] args) {
        // 물건 구입
        Buyer buyer = new Buyer();

        // computer 구입
        buyer.buy(new Computer());
        // Air conditioner 구입
        buyer.buy(new Air());
    }
}
