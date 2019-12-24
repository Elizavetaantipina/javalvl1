package geekbrainshomework;

import org.jetbrains.annotations.NotNull;

public class Cat2 {

    private String name;
    private int appetite;
    private boolean fill;

    public Cat2(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fill = false;
    }

    public void eat(@NotNull Plate plate){
        this.fill = plate.decreaseFood(appetite);
    }
    public void fillornot () {
        System.out.println(this.fill);
    }
}

class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int minus) {
        if (food >= minus) {
            food -= minus;
            return true;
        } else {
            return false;
        }
    }
    public void info() {
        System.out.println("Plate: " + food);
    }
    public void addfood (int plus) {
        food += plus;
    }
}

class Main {
    public static void main(String[] args) {
        Cat2[] cats = new Cat2[3];
        cats[0] = new Cat2("A", 50);
        cats[1] = new Cat2("B", 40);
        cats[2] = new Cat2("C", 200);
        Plate plate = new Plate(1000);
        plate.info();
        for (int i = 0; i < 3; i++) {
            cats[i].fillornot();
            cats[i].eat(plate);
            plate.info();
            cats[i].fillornot();
            plate.addfood(50);
            plate.info();
        }
    }
}
