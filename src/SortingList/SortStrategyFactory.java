package SortingList;

public class SortStrategyFactory implements ISortStrategyFactory{
    @Override
    public SortStrategy createSortStrategy(String Type) {
        if(Type.equals("Age")){
            return new AgeSort();
        }
        else if(Type.equals("Name")){
            return new NameSort();
        }
        else if(Type.equals("Grade")){
            return new GradeSort();
        }
        return null;
    }
}
