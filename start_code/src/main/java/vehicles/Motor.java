package vehicles;

public class Motor implements IMotorised {

    private int hp;
    private int fuel;

    public Motor(int hp, int fuel) {
        this.hp = hp;
        this.fuel = fuel;
    }

    @Override
    public void startEngine() {
        System.out.println("Turning on motor. Let's go explore the big blue!");

    }

    @Override
    public void stopEngine() {
        System.out.println("Turning off motor. Let's just enjoy the sun and sea for a while.");

    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getFuel() {
        return this.fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel = fuel;

    }


}
