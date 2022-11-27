package tamara.enums;

public class PermissionCard {
    Employee employee;

    void permit(Employee employee) {
        if(employee.positionType == PositionType.EMPLOYEE) {
            System.out.println("Допуск уровня 1");
        }
    }
}
