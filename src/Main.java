import java.util.Arrays;

//        3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
//        4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
//        5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
//        6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
//        7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
//        8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
//        1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
//        2. Посчитать сумму затрат на зарплаты в месяц.
//        3. Найти сотрудника с минимальной зарплатой.
//        4. Найти сотрудника с максимальной зарплатой.
//        5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
//        6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
public class Main {
    private static Employee[] employees;


    public static void main(String[] args) {
        employees = new Employee[10];
        employees[0] = new Employee("Иванов Илья Васильевич", "1", 22500);
        employees[1] = new Employee("Семёнов Игнат Петрович", "1", 13330);
        employees[8] = new Employee("Захаров Влад Юрьевич", "3", 18020);
        employees[5] = new Employee("Орлова Ольга Олеговна", "5", 10500);
        employees[2] = new Employee("Воронина Анна Владимировна", "2", 18555);
        printAllEmployees();
        System.out.println("Сумма зарплат за месяц: "+allSalariesPerMonth());
        System.out.println("Сотрудник с минимальной зарплатой: "+minSalary());
        System.out.println("Сотрудник с максимальной "+maxSalary());
        System.out.println("Средняя зарплата " +averageSalary());
        printFullNameAllEmployees();
    }

    public static void printAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public static double allSalariesPerMonth() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }

        }
        return sum;
    }

    public static Employee minSalary() {
        Employee result = employees [0];
        double min = 200000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                result = employees[i];
            }
        }
        return result;
    }

    public static Employee maxSalary() {
        Employee result = employees[0];
        double max = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                result = employees[i];
            }
        }
        return result;
    }

    public static double averageSalary() {
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                counter++;
            }
        }
        return allSalariesPerMonth() /counter;
    }
    public static void printFullNameAllEmployees(){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
                System.out.println(employees[i].getFullName());
            }

        }
    }
}



