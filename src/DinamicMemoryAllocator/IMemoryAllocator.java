package DinamicMemoryAllocator;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

interface IMemoryAllocator
{
    boolean Allocate(String objectName, int size);
    boolean DeAllocate(String objectName);

    boolean IsEmpty();

    boolean IsFull();

    void ShowMemory();
}






