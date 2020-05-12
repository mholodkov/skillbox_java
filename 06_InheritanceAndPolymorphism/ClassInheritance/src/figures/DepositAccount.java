package figures;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends CheckingAccount {

    protected LocalDate datePut;
    protected LocalDate dateTake;
    protected LocalDate dateNewPut;

    public DepositAccount(double money) {
        super(money);
    }

    public void putMoney(double putMoney) {
        this.money = money + putMoney;

        datePut = LocalDate.now();
        /**Для проверки
         datePut = LocalDate.now().minusDays(45);
         **/
        System.out.println("Время внесения на депозит: " + datePut);

    }

    public void takeMoney(double sum) {
        dateTake = LocalDate.now();
        dateNewPut = datePut.plusDays(30);
        if (datePut.isAfter(dateTake.minusDays(30))) {
            long differenceDate = ChronoUnit.DAYS.between(dateTake, dateNewPut);
            System.out.println("Отказано!" + "\n" +
                    "Время нового съема с депозита: " + dateNewPut + "\n" +
                    "Вы сможете снять деньги через: " + differenceDate + " дней\n"
            );
        } else {
            this.money = money - sum;
            System.out.println("Время съема: " + dateTake);
        }
    }
}
