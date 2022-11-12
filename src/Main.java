public class Main {
    private static Employee[] employees = new Employee[10];

        public static void printEmployees() {
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i]);
            }
        }

        public static int calculateTotalSalary() {
            int sum = 0;
            for (int i = 0; i < employees.length; i++) {
                sum += employees[i].getSalary();
            }
            return sum;
        }

            public static Employee findEmployeeWithMinSalary () {
                Employee result = employees[0];
                int minSalary = employees[0].getSalary();
                for (Employee employee : employees) {
                    if (employee.getSalary() < minSalary) {
                        minSalary = employee.getSalary();
                        result = employee;
                    }
                }
                return result;
            }
            public static Employee findEmployeeWithMaxSalary () {
                Employee result = employees[0];
                int maxSalary = employees[0].getSalary();
                for (Employee employee : employees) {
                    if (employee.getSalary() > maxSalary) {
                        maxSalary = employee.getSalary();
                        result = employee;
                    }
                }
                return result;
            }

            public static float calculateAverageSalary () {
                return calculateTotalSalary() / (float) employees.length;
            }

            public static void printFullNames () {
                for (Employee employee : employees) {
                    System.out.println(employee.getName());
                }
            }
            public static void main(String[] args) {
                employees = new Employee[]{
                        new Employee("Иванов Иван Иванович", 50_000, 1),
                        new Employee("Петров Пётр Петрович", 100_000, 2),
                        new Employee("Степанов Степан Степанович", 140_000, 3),
                        new Employee("Константинов Константин Константинович", 170_000, 3),
                        new Employee("Игорев Игорь Игоревич", 200_000, 4),
                        new Employee("Зигизмундов Зигизмунд Зигизмундович", 300_000, 5),
                        new Employee("Максимов Максим Максимович", 450_000, 1),
                        new Employee("Фёдоров Фёдор Фёдорович", 470_000, 1),
                        new Employee("Дмитриев Дмитрий Дмитриевич", 500_000, 2),
                        new Employee("Андреянов Андрей Андреевич", 570_000, 5)
                };

                printEmployees();
                System.out.println(calculateTotalSalary());
                System.out.println(findEmployeeWithMinSalary());
                System.out.println(findEmployeeWithMaxSalary());
                System.out.println(calculateAverageSalary());
                printFullNames();
                System.out.println("Отдел - " + employees[0].getDepartment());
                employees[9].setDepartment(3);
                System.out.println(employees[9].getDepartment());
            }
}