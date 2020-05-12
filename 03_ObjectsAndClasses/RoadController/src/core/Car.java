package core;

public class Car {
    public String number;
    public int height;
    public double weight;
    public boolean hasVehicle;
    public boolean isSpecial;

    public void setNumber(String numder) {
        this.number = number;
    }
    public String getNumber() {
        return number;
    }

    public void setHeight(Integer height){
        this.height = height;
    }
    public Integer getHeight() {
        return height;
    }

    public void setWeight(Double weight){
        this.weight = weight;
    }
    public Double getWeight(){
        return weight;
    }

    public void setVehicle(Boolean hasVehicle){
        this.hasVehicle = hasVehicle;
    }
    public Boolean hasGetVehicle(){
        return hasVehicle;
    }

    public void setSpecial(Boolean isSpecial){
        this.isSpecial = isSpecial;
    }
    public Boolean isGetSpecial(){
        return isSpecial;
    }


    public String toString() {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
                special + "Автомобиль с номером " + number +
                ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}