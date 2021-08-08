import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        Employee[] emplArray = {
                new Employee("Петров Пётр Петрович", "Директор", "petrov@gmail.com", "7-911-111-11-11", 150000, 50),
                new Employee("Васильев Василий Васильевич", "Бухгалтер", "vasilev@gmail.com", "7-922-222-22-22", 100000, 45),
                new Employee("Фёдоров Фёдр Фёдорович", "Кладовщик", "fedorov@gmail.com", "7-933-333-33-33", 40000, 30),
                new Employee("Иванов Иван Иванович", "Товаровед", "ivanov@gmail.com", "7-944-444-44-44", 60000, 35),
                new Employee("Степанов Степан Степанович", "Завхоз", "stepanov@gmail.com", "7-955-555-55-55", 35000, 45)
        };

        int minimalAge = 40;
        for (Employee employee : emplArray) {
            if (employee.age > minimalAge) {
                employee.employeeInfo();
               System.out.println();
            }
        }

    }
}