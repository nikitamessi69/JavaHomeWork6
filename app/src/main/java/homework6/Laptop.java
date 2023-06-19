package homework6;

public class Laptop {
    private String color;
    private String brand;
    private String model;
    private double price;

    public Laptop(String color, String brand, String model, double price) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Предлагаем Ноутбук[" +
                "цвет='" + color + '\'' +
                ", бренд='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", цена=" + price + 
                ']';
    }
}