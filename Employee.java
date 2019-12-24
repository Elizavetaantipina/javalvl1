package employee;
//Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//Конструктор класса должен заполнять эти поля при создании объекта.
//Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//Создать массив из 5 сотрудников.
public class Employee {
    private String Initials;
    private String Position;
    private String Email;
    private String Phonenumb;
    private int Salary;
    private int Age;

    public Employee(String Initials, String Position, String Email, String Phonenumb, int Salary, int Age) {
        this.Initials = Initials;
        this.Position = Position;
        this.Email = Email;
        this.Phonenumb = Phonenumb;
        this.Salary = Salary;
        this.Age = Age;
    }

    public void Printinfo() {
        System.out.println("Инициалы: " + this.Initials);
        System.out.println("Должность: " + this.Position);
        System.out.println("Email: " + this.Email);
        System.out.println("Номер телефона: " + this.Phonenumb);
        System.out.println("Зарплата: " + this.Salary);
        System.out.println("Возраст: " + this.Age);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Жмышенко Валерий Альбертович", "Слесарь", "top_slesar@mail.ru", "8-800-555-35-35", 100000, 54);
        employee1.Printinfo();


        Employee[] mass = new Employee[5];
        mass[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        mass[1] = new Employee("Ivanova Ivana", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 45);
        mass[2] = new Employee("Iva Iva", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 50);
        mass[3] = new Employee("Ivan Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 22);
        mass[4] = new Employee("Iv Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 20);
        for (int i = 0; i < 5; i++) {
            if (mass[i].Age > 30) {
            mass[i].Printinfo();
        }
        }
    }
}