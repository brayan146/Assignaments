package SortingList;

import java.util.Comparator;
import java.util.List;

public class MultipleFieldsSort implements SortStrategy{
    @Override
    public void sort (List<Student> students){
        students.sort(Comparator.comparing(Student::getName)
                .thenComparing(Student::getAge)
                .thenComparing(Student::getGrade));
    }
}
