public class CarBeraksi {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("Mobil pertama dibuat dengan nilai default:");
        System.out.println("Warna: " + myCar.color);
        System.out.println("Plat Nomor: " + myCar.noPlate);
        
        System.out.println("\n--- Aksi Mobil Pertama ---");
        myCar.startEngine();
        myCar.throttle();
        myCar.turnOnHeadlamp();

        System.out.println("\n-------------------------------------");

     
        Car anotherCar = new Car();
        anotherCar.color = "Blue";
        anotherCar.brand = "Honda";
        System.out.println("\nMobil kedua dibuat:");
        System.out.println("Warna: " + anotherCar.color);
        System.out.println("Merek: " + anotherCar.brand);

        System.out.println("\n--- Aksi Mobil Kedua ---");
        anotherCar.startEngine();
        anotherCar.brake();
        anotherCar.turnOffHeadlamp();
    }
}