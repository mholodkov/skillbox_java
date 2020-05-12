package bank;

public class Entity extends Client {
    public Entity(double money) {
        super(money);
    }

    public void takeMoney(double sum){
        this.money -= 1.01*sum;
    }
}
