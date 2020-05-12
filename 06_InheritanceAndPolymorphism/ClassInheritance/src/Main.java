import figures.CardAccount;
import figures.CheckingAccount;
import figures.DepositAccount;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Обычный счет
        CardAccount card = new CardAccount(100.);
        System.out.print("Было: " + card.getMoney() + " ");

        card.takeMoney(47);
        System.out.println("Стало: " + card.getMoney());
        // Карточный счет
        CheckingAccount check = new CheckingAccount(100.);
        System.out.print("Было: " + check.getMoney() + " ");

        check.takeMoney(47);
        System.out.println("Стало: " + check.getMoney());

        //Депозитарный счет
        DepositAccount deposit = new DepositAccount(1000.);
        deposit.putMoney(50.);
        deposit.takeMoney(15.);
        System.out.println(deposit.getMoney());
    }
}