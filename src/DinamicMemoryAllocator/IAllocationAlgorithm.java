package DinamicMemoryAllocator;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.List;


interface IAllocationAlgorithm
{
    MemoryBlock GetMemoryBlock(List<MemoryBlock> blocks, int size);
}






