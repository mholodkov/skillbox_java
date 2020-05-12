package figures;

public class CheckingAccount {
    protected double money;

    public CheckingAccount(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    protected void setMoney(double money) {
        this.money = money;
    }

    public void putMoney(double putMoney) {
        this.money = money + putMoney;
    }

    public void takeMoney(double sum) {
        this.money = money - sum;
    }

}

