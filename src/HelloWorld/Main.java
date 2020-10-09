package HelloWorld;

class Main {

   public static void main(String[] args) {
        String name = "Dima";
        String position = "Developer";
        String email = "klimakhiny@mail.ru";
        String telephone = "9054938010";
        int salary = 40;
        int age = 2;
        name = "Dima";
        position = "Developer";
        email = "klimakhiny@mail.ru";
        telephone = "9054938010";
        salary = 40;
        age = 20;
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Ivanov Boris", "Junior developer" , "II@mail.ru", "890974356", 20000, 18);
        employeesArray[1] = new Employee("Ivanov Ivan", "Junior developer" , "II@mail.ru", "890974356", 20000, 48);
        employeesArray[2] = new Employee("Ivanov Ivan", "Junior developer" , "II@mail.ru", "890974356", 20000, 56);
        employeesArray[3] = new Employee("Ivanov Ivan", "Junior developer" , "II@mail.ru", "890974356", 20000, 18);
        employeesArray[4] = new Employee("Ivanov Ivan", "Junior developer" , "II@mail.ru", "890974356", 20000, 41);
        getAged(employeesArray);
    }
   static void getInfo(Employee employee)
    {
        System.out.println("Имя: " + employee.name + "; Должность : " + employee.position + "; Mail: " + employee.email + "; Tel: " + employee.telephone + "; Salary: " + employee.salary + "; Зарплата: " + employee.age);
    }
    static void getAged(Employee [] Arr)
    {
        for (int i=0; i< Arr.length;i++)
            if(Arr[i].age>40)
            {
                getInfo(Arr[i]);
            }
    }

}