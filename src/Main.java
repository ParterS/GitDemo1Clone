public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 23500, 2023,"red", "lx");
        Car car2 = new Car("Honda", 24500, 2022,"fox", "ls");
        Car car3 = new Car("Mazda", 25500, 2021,"black", "ex");

        double totalCost = car1.getPrice()+car2.getPrice()+car3.getPrice();
        System.out.println(totalCost);
    }
}
