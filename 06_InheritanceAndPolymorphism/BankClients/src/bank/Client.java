package bank;

public abstract class Client {

    protected double money;

    public Client(double money){
        this.money = money;
    }

    protected void setMoney(double money)
    {
        this.money = money;
    }


    public double getMoney() {
        return money;
    }

    public void putMoney(double sum) {
        this.money = money + sum;
    }

    public void takeMoney(double sum){
        this.money = money - sum;
    }

}