class Car{
    private boolean changeOil;
    private int fuelLevel;

    public Car(){
        this.changeOil = false;
        this.fuelLevel = 30;
    }

    public void changeOil(){
        changeOil = true;
        System.out.println("Oil has been changed");
    }
    public void increaseFuel(int amount){
        fuelLevel += amount;
        System.out.printf("New fuel level : %d" , fuelLevel);
    }

    public void displayStatus(){
        System.out.println("Oil Changed : " + changeOil);
        System.out.println("Fuel level : " + fuelLevel);
    }

}

public class CarMaintenance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.displayStatus();
        myCar.changeOil();
        myCar.increaseFuel(40);
        myCar.displayStatus();
    }
}
