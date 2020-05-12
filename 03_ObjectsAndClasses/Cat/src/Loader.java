
public class Loader {
    public static void main(String[] args) {
        Cat oleg = new Cat();
        oleg.setName("Oleg");
        oleg.setWeight(2300.0);

        System.out.println(oleg.getName());
        System.out.println(oleg.getWeight());

        Cat stepa = clone(oleg);
        System.out.println(stepa.getWeight());
        System.out.println(stepa.getName());

        //Проверка
        Cat newCat = new Cat();
        newCat.setCatColors(CatColors.BLACK);
        System.out.println(newCat.getCatColor());

    }

    private static Cat clone(Cat original) {
        Cat newCat = new Cat();
        newCat.setWeight(original.getWeight());
        newCat.setName(original.getName());
        return newCat;
    }

}