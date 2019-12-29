package Animal;

public class Dog extends Animal{
        public Dog (int jump_hight, int run_length, int swim_length) {
            this.jump_hight = jump_hight;
            this.run_length = run_length;
            this.swim_length = swim_length;
        }
    public void jump(int jump_hight) {
        if (jump_hight <= this.jump_hight) {
            System.out.println("Собака прыгнула");
        } else {
            System.out.println("Собака не может прыгнуть так высоко");
        }

    }

    public void run(int run_length) {
        if (run_length <= this.run_length) {
            System.out.println("Собака добежала");
        } else {
            System.out.println("Собака не может так долго бежать");
        }
    }
    public void swim(int swim_length) {
        if (swim_length <= this.swim_length) {
            System.out.println("Собака доплыла");
        } else {
            System.out.println("Собака утонула");
        }
    }
}
