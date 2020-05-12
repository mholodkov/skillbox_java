
public class Cat {
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private static final int COUNT_EYE = 2;
    public static final double MIN_WEIGHT = 1000.0;
    public static final double MAX_WEIGHT = 9000.0;
    private double newWeight;
    private String name;
    public CatColors color;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Cat(Double newWeight) {
        this();
        this.newWeight = newWeight;
    }

    public Double getNewWeight() {
        return newWeight;
    }

    public void setCatColors(CatColors color) {
        this.color = color;
    }
    public CatColors getCatColor(){
        return color;
    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        weight = weight + amount;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
}