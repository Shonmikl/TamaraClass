package tamara.enums;

import tamara.db.DataBase;

public class Employee {
    String name;
    PositionType positionType;

    public Employee(String name, PositionType positionType) {
        this.name = name;
        this.positionType = positionType;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("", PositionType.EMPLOYEE);
        DataBase dataBase = new DataBase();
       // dataBase.addCountries("II");
    }
}
