package SortingList;

import java.util.Comparator;
import java.util.List;

public class GradeSort implements SortStrategy{
    @Override
    public void sort(List<Student> students) {
        students.sort(Comparator.comparingDouble(Student::getGrade));
    }
}
