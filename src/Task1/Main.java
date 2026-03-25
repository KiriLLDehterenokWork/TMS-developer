package Task1;

public class Main {
    public static void main(String[] args){
        Boss boss = new Boss("Владимир","Директор");
        Employee employee = new Employee("Иван","Рабочий");
        Accountant accountant = new Accountant("Анна","Бухгалтер");

        boss.printPosition();
        employee.printPosition();
        accountant.printPosition();
    }
}
