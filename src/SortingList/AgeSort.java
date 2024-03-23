package SortingList;

import java.util.Comparator;
import java.util.List;


public class AgeSort implements SortStrategy {
    @Override
    public void sort(List<Student> students) {
        students.sort(Comparator.comparingInt(Student::getAge));
    }


}
