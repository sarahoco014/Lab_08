package water;

import products.IProduct;
import vehicles.IWaterVehicle;
import vehicles.Vehicle;

public class Kayak extends Vehicle implements IWaterVehicle {

    private String hullType;

    public Kayak(float weight, int maxSpeed, IProduct baseProduct, String hullType) {
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
    }

    @Override
    public String getHullType() {
        return hullType;
    }


    public void setHullType(String hullType) {
        this.hullType = hullType;
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
}
