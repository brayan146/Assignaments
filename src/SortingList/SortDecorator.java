package SortingList;

import java.util.ArrayList;
import java.util.List;

public class SortDecorator implements SortStrategy {
    private List<SortStrategy> sortStrategies;

    public SortDecorator(List<SortStrategy> sortStrategies) {
        this.sortStrategies = sortStrategies;
    }

    @Override
    public void sort(List<Student> students) {
        List<Student> sortedStudents = new ArrayList<>(students);
        for (SortStrategy sortStrategy : sortStrategies) {
            sortedStudents.sort((s1, s2) -> compare(s1, s2, sortStrategy));
        }
        students.clear();
        students.addAll(sortedStudents);
    }

    private int compare(Student s1, Student s2, SortStrategy sortStrategy) {
        if (sortStrategy instanceof NameSort) {
            return s1.getName().compareTo(s2.getName());
        } else if (sortStrategy instanceof AgeSort) {
            return Integer.compare(s1.getAge(), s2.getAge());
        } else {
            return Double.compare(s1.getGrade(), s2.getGrade());
        }
    }
}