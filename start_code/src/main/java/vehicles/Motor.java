package vehicles;

public class Motor implements IMotorised {

    private int hp;
    private IMotorised engine;

    public Motor(int hp) {
        this.hp = hp;
    }

    @Override
    public void startEngine() {
        this.engine.startEngine();

    }

    @Override
    public void stopEngine() {
        this.engine.stopEngine();

    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getFuel() {
        return this.engine.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.engine.setFuel(fuel);

    }


}
