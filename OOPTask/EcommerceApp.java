package Lesson5Task.OOPTask;

public class EcommerceApp {
    private String productTitle;
    private int productCode;
    private double unitPrice;
    private int availableStock = 20;

  
    public EcommerceApp(String productTitle, int productCode, double unitPrice) {
        this.productTitle = productTitle;
        this.productCode = productCode;
        this.unitPrice = unitPrice;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String title) {
        this.productTitle = title;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int code) {
        this.productCode = code;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double price) {
        if (price > 0) {
            this.unitPrice = price;
        } else {
            System.out.println("Invalid price: must be greater than zero.");
        }
    }

    public int sellProduct(int qty) {
        this.availableStock -= qty;
        return availableStock;
    }

    public int addStock(int qty) {
        this.availableStock += qty;
        return availableStock;
    }

    public static void main(String[] args) {
        EcommerceApp p1 = new EcommerceApp("Smartphone", 101, 75000);
        System.out.println("Stock after sale: " + p1.sellProduct(8));
        System.out.println("Stock after restock: " + p1.addStock(5));
    }
}