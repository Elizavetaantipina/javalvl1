package Animal;

public class Cat extends Animal {
    public Cat(int jump_hight, int run_length) {
        this.jump_hight = jump_hight;
        this.run_length = run_length;
    }

    public void jump(int jump_hight) {
        if (jump_hight <= this.jump_hight) {
            System.out.println("Кот прыгнул");
        } else {
            System.out.println("Кот не может прыгнуть так высоко");
        }

    }

    public void run(int run_length) {
        if (run_length <= this.run_length) {
            System.out.println("Кот добежал");
        } else {
            System.out.println("Кот не может так долго бежать");
        }
    }
    public void swim(int swim_length){
        System.out.println("Кот не умеет плавать");
    }
}
