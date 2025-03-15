public class Main {
    public static void main(String[] args) {
//აქ ვქმნი ობიექტს იმ კონსტრუქტორით რომელსაც არ გადავეცი არგუმენტები და ვანიჭებ მნიშვნელობებს სეთერების მეშვეობით.
        Car car1 = new Car();
        car1.setMake("Mercedes Benz");
        car1.setModel("CLS AMG");
        car1.setReleaseDate(2007);
        car1.setType("Coupe Sedan");
        car1.setEngine(6.2f);
        car1.setMaxSpeed(360);

// აქ ვქმნი ობიექტს იმ კონსტრუქტორის გამოყენებით, რომელსაც ყველა არგუმენტი გადავეცი და ვბეჭდავ გეთერების გამოყენებით ფილდებს.
        Car car = new Car("Bmw","M6", 2010, "Coupe", 360, 5.0f);
        System.out.println("Make: "+car.getMake());
        System.out.println("Model: "+car.getModel());
        System.out.println("Release date: "+car.getReleaseDate());
        System.out.println("Type: "+car.getType());
        System.out.println("Max speed: "+car.getMaxSpeed());
        System.out.println("Engine: "+car.getEngine());



    }
}
