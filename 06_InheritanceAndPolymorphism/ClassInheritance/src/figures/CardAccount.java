package figures;

public class CardAccount extends CheckingAccount {
    public CardAccount(double money) {
        super(money);
    }

    public void takeMoney(double sum) {
        this.money -= 1.01*sum;
//        setMoney(getMoney()-sum - (sum * 0.01));
    }
}
