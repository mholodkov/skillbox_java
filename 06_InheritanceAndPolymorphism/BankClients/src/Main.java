import bank.*;

public class Main {
    public static void main(String[] args) {

        //Физическое лицо
        System.out.println("Физическое лицо");
        Client individual = new Individual(1500.);
        individual.putMoney(500);
        System.out.println(individual.getMoney());
        individual.takeMoney(850.);
        System.out.println(individual.getMoney() + "\n");

        //Юридическое лицо
        System.out.println("Юридическое лицо");
        Client entity = new Entity(1500.);
        entity.putMoney(500);
        System.out.println(entity.getMoney());
        entity.takeMoney(1000.);
        System.out.println(entity.getMoney() + "\n");

        //Индивидуальный предприниматель
        System.out.println("Инидивидуальный предприниматель");
        IndividualBusinessman businessman = new IndividualBusinessman(1500.);
        businessman.putMoney(1000);
        System.out.println(businessman.getMoney());
        businessman.putMoney(500);
        System.out.println(businessman.getMoney());
    }
}
