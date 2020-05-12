package bank;

public class IndividualBusinessman extends Client {
    public IndividualBusinessman(double money) {
        super(money);
    }

    /**
     * у ИП — пополнение с комиссией 1%, если сумма меньше 1000 рублей, и 0,5%, если сумма больше либо равна 1000 рублей.
     */
    public void putMoney(double sum) {
        if (sum < 1000) {
            this.money += sum - (sum * 0.01);
        } else {
            this.money += sum - (sum * 0.005);
        }

    }
}