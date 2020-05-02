package HomeTaskOOP;

public class CarSale {
    public static void main(String[] args) {
        CarClassC volkswagenGolf = new CarClassC("Volkswagen", "Golf VIII", 2009, 2500, 1000, 1500, 2000);
        CarClassC skodaOctavia = new CarClassC("Škoda", "Octavia 5E ", 2015, 1500, 1000, 1500, 2000);
        CarClassE mercedesW213 = new CarClassE("Mercedes-Benz", "W213", 2013, 30000, 1000, 1500, 2000);
        CarClassE audiA6 = new CarClassE("Audi", "A6", 2018, 15000, 1000, 1500, 2000);
        CarClassJ bmwX5 = new CarClassJ("BMW", "X5", 2015, 50000, 1000, 1500, 2000);
        CarClassJ mercedesG65AMG = new CarClassJ("Mercedes-Benz", "G 65 AMG", 2019, 70000, 1000, 1500, 2000);


        CarClassJ tooBigCar = new CarClassJ("AAA", "BBB", 2005, 25000, 3000, 2000, 3000);

        Shop shop = new Shop();


            try {
                shop.addCar(volkswagenGolf);
                shop.addCar(skodaOctavia);
                shop.addCar(mercedesW213);
                shop.addCar(audiA6);
                shop.addCar(bmwX5);
                shop.addCar(tooBigCar);
                shop.addCar(mercedesG65AMG);

            } catch (OutOfFreePlaceException e) {
                System.out.println("Количество машин в магазине не может быть больше 5"); }

            finally {
                shop.printCars(); }
            
    }
}
