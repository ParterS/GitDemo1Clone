public class Car {
    String brand;
    double price;
    int year;
    String color;
    String complete_set;

    public Car(String brand, double price, int year, String color, String complete_set) {
        this.brand = brand;
        this.price = price;
        this.year = year;
        this.color = color;
        this.complete_set = complete_set;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getComplete_set() {
        return complete_set;
    }

    public void setComplete_set(String complete_set) {
        this.complete_set = complete_set;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", complete_set='" + complete_set + '\'' +
                '}';
    }
}

