package Animal;
 //Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
//В качестве параметра каждому методу передается величина, означающая или длину препятствия
// (для бега и плавания), или высоту (для прыжков).

public class Animal {
     int run_length;
     int swim_length;
     int jump_hight;

     public Animal() {
     }

   public Animal (int run_length, int swim_length, int jump_hight) {
         this.run_length = run_length;
         this.jump_hight = jump_hight;
         this.swim_length = swim_length;
     }
public void print () {
    System.out.println("Длина, бег:" + this.run_length);
    System.out.println("Длина, плавание:" + this.swim_length);
    System.out.println("Высота, прыжок:" + this.jump_hight);
}
}
