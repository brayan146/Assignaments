package SortingList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 22, 15));
        students.add(new Student("John", 20, 3));
        students.add(new Student("Alexis", 20, 3));
        students.add(new Student("Jane", 18, 4));
        students.add(new Student("Doe", 19, 5));
        students.add(new Student("Smith", 21, 2));
        students.add(new Student("Alex", 22, 1));
        students.add(new Student("Alex", 23, 353));
        students.add(new Student("John", 22, 43));
        students.add(new Student("Jane", 8, 45));
        students.add(new Student("Doe", 29, 55));
        students.add(new Student("Smith", 25, 27));

        ISortStrategyFactory factory = new SortStrategyFactory();
        List<SortStrategy> sortStrategies = new ArrayList<>();

        String[] fieldsToSortBy = {"Name", "Age", "Grade"};
        for (String field : fieldsToSortBy) {
            SortStrategy newSortStrategy = factory.createSortStrategy(field);
            if (newSortStrategy != null) {
                sortStrategies.add(newSortStrategy);
            }
        }
        if (!sortStrategies.isEmpty()) {
            Collections.reverse(sortStrategies);
            SortStrategy sortStrategy = new SortDecorator(sortStrategies);
            StudentSorter studentSorter = new StudentSorter(sortStrategy);
            studentSorter.sortStudents(students);
            students.forEach(student -> System.out.println(student.getName() + " " + student.getAge() + " " + student.getGrade()));
        } else {
            System.out.println("Invalid choice");
        }
    }
}