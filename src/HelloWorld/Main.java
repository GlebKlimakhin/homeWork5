package HelloWorld;

class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Boris", "Junior developer", "II@mail.ru", "890974356", 20000, 18);
        employees[1] = new Employee("Ivanov Nick", "Junior developer", "II@mail.ru", "890974356", 20000, 48);
        employees[2] = new Employee("Ivanov Idris", "Senior developer", "II@mail.ru", "890974356", 20000, 56);
        employees[3] = new Employee("Ivanov Yuri", "Junior developer", "II@mail.ru", "890974356", 20000, 18);
        employees[4] = new Employee("Ivanov Oleg", "CEO", "II@mail.ru", "890974356", 20000, 41);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].getInfo();
            }

        }
    }
}