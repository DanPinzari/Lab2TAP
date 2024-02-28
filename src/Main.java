// Clasa de bază
class Car {
    private String brand;
    private String model;
    private int year;

    // Constructor 1
    public Car() {
        this("Unknown", "Unknown", 2010);
    }

    // Constructor 2
    public Car(String brand) {
        this(brand, "Unknown", 2010);
    }

    // Constructor 3
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Metoda 1
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    // Metoda 2
    public void startEngine() {
        System.out.println("Engine started");
    }
}

// Clasa derivată
class SportsCar extends Car {
    private boolean isConvertible;

    // Constructor 1
    public SportsCar() {
        super();   // Apelăm constructorul implicit al clasei de bază
        this.isConvertible = false;
    }

    // Constructor 2
    public SportsCar(String brand, String model, boolean isConvertible) {
        super(brand, model, 2010);
        this.isConvertible = isConvertible;
    }

    // Metoda 1
    @Override
    public void displayInfo() {
        super.displayInfo();  // Apelează metoda displayInfo() din clasa de bază
        System.out.println("Convertible: " + isConvertible);
    }

    // Metoda 2
    public void accelerate() {
        System.out.println("SportsCar accelerating");
    }

    // Metoda 3
    public void openRoof() {
        if (isConvertible) {
            System.out.println("Roof opened");
        } else {
            System.out.println("This is not a convertible");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // a) Obiectul clasei de bază folosind DOAR constructorul clasei de bază
        Car car1 = new Car("Toyota", "Camry", 2020);
        car1.displayInfo();
        car1.startEngine();
        System.out.println();

        // b) Obiectul clasei derivate folosind DOAR constructorul clasei de bază
        SportsCar sportsCar1 = new SportsCar("Ferrari", "458 Italia", true);
        sportsCar1.displayInfo();
        sportsCar1.startEngine();
        sportsCar1.accelerate();
        sportsCar1.openRoof();
        System.out.println();

        // c) Obiectul clasei derivate folosind DOAR constructorul clasei derivate
        SportsCar sportsCar2 = new SportsCar("Porsche", "911 Turbo", true);
        sportsCar2.displayInfo();
        sportsCar2.startEngine();
        sportsCar2.accelerate();
        sportsCar2.openRoof();
        System.out.println();

        // d) Obiectul clasei de bază folosind DOAR constructorul clasei derivate
        Car car2 = new SportsCar("Lamborghini", "Huracan", true);
        car2.displayInfo();
        car2.startEngine();
    }
}
