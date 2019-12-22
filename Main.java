package Animal;

public class Main {

    public static void main(String[] args) {
	Cat vasya = new Cat(5,1000);
	vasya.print();
	vasya.jump(5);
	vasya.jump(10);
	vasya.run(50);
	vasya.run(1500);
	vasya.swim(2000);

		System.out.println();
	Dog linda = new Dog(2, 20,10);
		linda.print();
		linda.jump(1);
		linda.jump(10);
		linda.run(10);
		linda.run(1500);
		linda.swim(5);
		linda.swim(50);
    }
}
