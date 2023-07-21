package vehicles.water;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.IWaterVehicle;
import vehicles.Vehicle;

public class Speedboat extends Vehicle implements IMotorised, IWaterVehicle {

     private String hullType;
     private IMotorised motor;

     public Speedboat(float weight, int maxSpeed, IProduct baseProduct, IMotorised motor, String hullType) {
          super(weight, maxSpeed, baseProduct);
          this.hullType = hullType;
          this.motor = motor;
     }

     @Override
     public String getHullType() {
          return hullType;
     }

     public void setHullType(String hullType) {
         this.hullType = hullType;

     }

     public IMotorised getMotor() {
          return motor;
     }

     public void setMotor(IMotorised motor) {
          this.motor = motor;
     }


     @Override
     public void startEngine() {
         this.motor.startEngine();

     }

     @Override
     public void stopEngine() {
         this.motor.stopEngine();

     }

     @Override
     public int getHp() {
          return this.motor.getHp();
     }

     @Override
     public void setHp(int hp) {
         this.motor.setHp(hp);

     }

     @Override
     public int getFuel() {
          return this.motor.getFuel();
     }

     @Override
     public void setFuel(int fuel) {
         this.motor.setFuel(fuel);

     }

     @Override
     public float getWeight() {
          return this.weight;
     }

     @Override
     public int getMaxSpeed() {
          return this.maxSpeed;
     }

     @Override
     public void setWeight(float weight) {
          this.weight = weight;
     }

     @Override
     public void setMaxSpeed(int maxSpeed) {
          this.maxSpeed = maxSpeed;
     }

     @Override
     public float getPrice() {
          return this.baseProduct.getPrice();
     }

     @Override
     public long getInventory() {
          return this.baseProduct.getInventory();
     }

     @Override
     public void setPrice(float price) {
          this.baseProduct.setPrice(price);
     }

     @Override
     public void setInventory(long amount) {
          this.baseProduct.setInventory(amount);
     }

     @Override
     public void setTitle(String title) {
          this.baseProduct.setTitle(title);
     }

     @Override
     public String getTitle() {
          return this.baseProduct.getTitle();
     }

     @Override
     public void addInventory(long amount) {
          this.baseProduct.addInventory(amount);
     }

     @Override
     public void removeInventory(long amount) throws Exception {
          this.baseProduct.removeInventory(amount);
     }
}
