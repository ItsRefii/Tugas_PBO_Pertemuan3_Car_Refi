public class Car {
    String color;
    String noPlate;
    double width;
    double height;
    String brand;
    boolean isEngineOn;
    boolean isHeadlampOn;

    public Car() {
        this.color = "Red";
        this.noPlate = "B 1234 CD";
        this.width = 1.8;
        this.height = 1.5;
        this.brand = "Toyota";
        this.isEngineOn = false;
        this.isHeadlampOn = false;
    }

    public void startEngine() {
        this.isEngineOn = true;
        System.out.println("Mesin menyala.");
    }

    public void throttle() {
        if (isEngineOn) {
            System.out.println("Mobil melaju.");
        } else {
            System.out.println("Tidak bisa melaju, mesin mati.");
        }
    }

    public void brake() {
        System.out.println("Mobil berhenti.");
    }

    public void turnOnHeadlamp() {
        this.isHeadlampOn = true;
        System.out.println("Lampu menyala.");
    }

    public void turnOffHeadlamp() {
        this.isHeadlampOn = false;
        System.out.println("Lampu mati.");
    }
}