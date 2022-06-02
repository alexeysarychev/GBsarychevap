package HomeWorkApp;

public class employer {
    // ФИО, должность, email, телефон, зарплата, возраст.
    public final String FIO;
    public final String jobTitle;
    public final String email;
    public final String phone;
    public final int salary;
    public final int age;

        public employer(String FIO, String jobTitle, String email, String phone, int salary, int age) {
            this.FIO = FIO;
            this.jobTitle = jobTitle;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public void info() {
            System.out.println("\nФИО:       " + FIO +
                    "\nДолжность: " + jobTitle +
                    "\nemail:     " + email +
                    "\nphone:     " + phone +
                    "\nsalary:    $" + salary +
                    "\nage:       " + age + "\n");
        }
}
