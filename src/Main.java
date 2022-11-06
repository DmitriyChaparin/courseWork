import java.util.Arrays;

public class Main {
    private static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[10];
        employees[0] = new Employee("Иванов Илья Васильевич", "2", 22500);
        employees[1] = new Employee("Семёнов Игнат Петрович", "1", 13330);
        employees[2] = new Employee("Захаров Влад Юрьевич", "3", 18020);
        employees[5] = new Employee("Орлова Ольга Олеговна", "5", 10500);
        employees[6] = new Employee("Воронина Анна Владимировна", "1", 18555);
        printAllEmployees();
        System.out.println("Сумма зарплат за месяц: " + allSalariesPerMonth());
        System.out.println("Сотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой " + findEmployeeWithMaxSalary());
        System.out.println("Средняя зарплата " + averageSalary());
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

    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < employees[0].getSalary()) {
                result = employees[i];
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > employees[0].getSalary()) {
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
        return allSalariesPerMonth() / counter;
    }

    public static void printFullNameAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getId() + " " +employees[i].getFullName());
            }

        }
    }
}




