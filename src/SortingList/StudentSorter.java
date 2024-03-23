package SortingList;
import java.util.List;

public class StudentSorter {
    private SortStrategy sortStrategy;

    public StudentSorter(SortStrategy sortStrategy){
        this.sortStrategy = sortStrategy;
    }

    public void sortStudents(List<Student> students){
        sortStrategy.sort(students);
    }
}
