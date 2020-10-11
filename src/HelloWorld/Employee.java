package HelloWorld;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

public Employee(String name, String position, String email, String telephone, int salary, int age)
{
    this.name = name;
    this.position = position;
    this.email = email;
    this.telephone = telephone;
    this.salary = salary;
    this.age = 29;
}

    public int getAge()
    {
        return age;
    }
       public void getInfo()
        {
                System.out.println("Имя: " + name + "; Должность : " + position + "; Mail: " + email + "; Tel: " + telephone + "; Salary: " + salary + "; Age: " + age);
        }



}
