package org.aston.course;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1-2");
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee(
                "Ivanov",
                "Ivan",
                "Ivanovich",
                "QA Engineer",
                "test@company.com",
                "88005553535",
                50000f,
                30);
        emplArray[1] = new Employee(
                "Petrov",
                "Petr",
                "Petrovich",
                "Developer",
                "dev@mail.ru",
                "88005553536",
                60000f,
                28
        );
        emplArray[2] = new Employee(
                "Sidorov",
                "Sidr",
                "Sidorovich",
                "System Administrator",
                "sysadmin@mail.ru",
                "88005553537",
                55000f,
                35
        );
        emplArray[3] = new Employee(
                "Kuznetsov",
                "Nikolay",
                "Nikolaevich",
                "Project Manager",
                "pm@mail.ru",
                "88005553538",
                70000f,
                40
        );
        emplArray[4] = new Employee(
                "Smirnov",
                "Alexey",
                "Alexeevich",
                "Business Analyst",
                "ba@mail.ru",
                "88005553539",
                65000f,
                32
        );
        for (Employee e : emplArray) {
            e.printInfo();
        }

        System.out.println("Task 3");
        Park park = new Park("WestPark", "Minsk");
        park.addAtraction("Ferris wheel", 3.00f, "10:00 - 18:00");
        park.addAtraction("Roller coaster", 3.50f, "10:00 - 17:00");
        park.addAtraction("Trampolines", 5.00f, "10:00 - 18:00");
        park.printInfo();
    }
}