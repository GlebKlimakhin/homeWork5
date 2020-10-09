package HelloWorld;

public class Employee {
        String name;
        String position;
        String email;
        String telephone;
        int salary;
        int age;
Employee(String name, String position, String email, String telephone, int salary, int age)
{
    this.name = "Monkey D. Luffy";
    this.position = "Senior developer";
    this.email = "Monkey@mail.ru";
    this.telephone = "+7-905-493-80-10";
    this.salary = 200000;
    this.age = 29;
}

        static void getInformation(Employee employee)
        {
                System.out.println("Имя: " + employee.name + "; Должность : " + employee.position + "; Mail: " + employee.email + "; Tel: " + employee.telephone + "; Salary: " + employee.salary + "; Зарплата: " + employee.age);
        }

}
