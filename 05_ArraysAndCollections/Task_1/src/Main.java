public class Main {
    public static void main(String[] args) {
        //task_1
        String radugaColors = "Красный, Оранжевый, Желтый, Зеленый, Голубой, Синий, Фиолетовый";
        String[] listRagugaColors = radugaColors.split(",\\s+");
        for (int i = listRagugaColors.length -1;i >= 0; i-- ){
            System.out.println(listRagugaColors[i]);
        }
        //task_2
        float[] patients = new float[30];
        int healthy = 0;
        for (int i = 0; i < patients.length; i++) {
            patients[i] = (float) (32 + (8 * Math.random()));
            patients[i] = Math.round(patients[i] * 10) / 10f;
            System.out.println(patients[i]);
            if (patients[i] > 36.2 && patients[i] < 36.9) {
                healthy++;
            }
        }
        System.out.println("\tКоличество здоровых: " + healthy);

        //task_3
        String[][] latteX = {
                {"X"," "," "," "," "," ","X"},
                {" ","X"," "," "," ","X"},
                {" "," ","X"," ","X"},
                {" "," "," ","X"},
                {" "," ","X"," ","X"},
                {" ","X"," "," "," ","X"},
                {"X"," "," "," "," "," ","X"},

        };

        for (int i = 0; i < latteX.length; i++){
            for (int j = 0; j < latteX[i].length; j++){
                System.out.print(latteX[i][j]);
            }
            System.out.println();
        }


    }
}

