package ru.olga.java.basic.homeworks.homework9_col1;

import java.util.ArrayList;
import java.util.Arrays;

public class MainCollections {
    public static void main(String[] args) {
        System.out.println("Задание 1 \n" + listFromRange(-3, 7));
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 6, 2, 7, 4, 1));

        System.out.println("\nЗадание 2 \nВ списке " + list + " сумма элементов больше 5, равна: " + sumListElementLargerFive(list));

        System.out.println("\nЗадание 3 \nСписок " + list);
        rewriteList(5, list);
        System.out.println("Перезаписан " + list);

        System.out.println("\nЗадание 4 \nСписок " + list);
        increaseElementsOfList(5, list);
        System.out.println("Элементы списка увеличены " + list);

        System.out.println("\nЗадание 6");
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Борис", 20));
        empList.add(new Employee("Николай", 30));
        empList.add(new Employee("Пётр", 40));
        empList.add(new Employee("Захар", 50));
        System.out.println(employeeName(empList));

        System.out.println("\nЗадание 7");
        ArrayList<Employee> empOlderThan = employeesOlderThan(empList, 30);
        for (int i = 0; i < empOlderThan.size(); i++) {
            System.out.println(empOlderThan.get(i).getName() + " - " + empOlderThan.get(i).getAge());
        }

        System.out.println("\nЗадание 8");
        System.out.println(isAvgAgeLike(empList, 20));
        System.out.println(isAvgAgeLike(empList, 45));
        System.out.println(isAvgAgeLike(empList, 65));
        System.out.println(isAvgAgeLike(empList, 0));

        System.out.println("\nЗадание 9");
        System.out.println(youngEmp(empList).getName() + " - " + youngEmp(empList).getAge());


    }

    /**
     * 9.9. метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника.
     *
     * @param empList
     * @return
     */
    public static Employee youngEmp(ArrayList<Employee> empList) {
        int minAge = empList.get(0).getAge();
        int index = 0;
        for (int i = 0; i < empList.size(); i++) {
            if (empList.get(i).getAge() < minAge) {
                minAge = empList.get(i).getAge();
                index = i;
            }
        }
        return empList.get(index);
    }

    /**
     * 9.8. метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст, и проверяющий что
     * средний возраст сотрудников превышает указанный аргумент;
     *
     * @param empList
     * @param avgMinAge
     * @return
     */
    public static boolean isAvgAgeLike(ArrayList<Employee> empList, double avgMinAge) {
        double avgAge = 0;
        for (int i = 0; i < empList.size(); i++) {
            avgAge += empList.get(i).getAge();
        }
        avgAge = avgAge / empList.size();
        return avgAge > avgMinAge;
    }

    /**
     * 9.7. метод, принимающий в качестве аргумента список сотрудников и минимальный возраст, и возвращающий список
     * сотрудников, возраст которых больше либо равен указанному аргументу;
     *
     * @param empList
     * @param minAge
     * @return
     */
    public static ArrayList<Employee> employeesOlderThan(ArrayList<Employee> empList, int minAge) {
        ArrayList<Employee> empNewAge = new ArrayList<>();
        for (int i = 0; i < empList.size(); i++) {
            if (empList.get(i).getAge() >= minAge) {
                empNewAge.add(new Employee(empList.get(i).getName(), empList.get(i).getAge()));
            }
        }
        return empNewAge;
    }

    /**
     * 9.6. метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
     *
     * @param empList
     * @return
     */
    public static ArrayList<String> employeeName(ArrayList<Employee> empList) {
        ArrayList<String> nameList = new ArrayList<>();
        for (int i = 0; i < empList.size(); i++) {
            nameList.add(empList.get(i).getName());
        }
        return nameList;
    }

    /**
     * 9.4. метод, принимающий в качестве аргументов целое число и ссылку на список, увеличивающий каждый элемент списка
     * на указанное число;
     *
     * @param number
     * @param list
     */
    public static void increaseElementsOfList(int number, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + number);
        }
    }

    /**
     * 9.3. метод, принимающий в качестве аргументов целое число и ссылку на список, метод должен переписать каждую
     * заполненную ячейку списка указанным числом;
     *
     * @param number
     * @param list
     */
    public static void rewriteList(int number, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
    }

    /**
     * 9.2. метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы, значение которых
     * больше 5, и возвращающий сумму
     *
     * @param list - список элементов
     * @return - возвращает сумму элементов, которые больше 5
     */
    public static int sumListElementLargerFive(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 5) {
                sum += list.get(i);
            }
        }
        return sum;
    }

    /**
     * 9.1. метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList с набором последовательных
     * значений в указанном диапазоне (min и max включительно, шаг - 1);
     *
     * @param min
     * @param max
     * @return
     */
    public static ArrayList<Integer> listFromRange(int min, int max) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int element = min;
        while (element <= max) {
            list.add(element);
            element += 1;
        }
        return list;
    }
}


