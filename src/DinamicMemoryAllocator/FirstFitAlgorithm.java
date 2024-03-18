package DinamicMemoryAllocator;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.List;

class FirstFitAlgorithm implements IAllocationAlgorithm
{
    @Override
    public MemoryBlock GetMemoryBlock(List<MemoryBlock> blocks, int size) {

        for (MemoryBlock b : blocks) {
            if (b.IsFree() && b.getSize() >= size) {
                return b;
            }
        }

        return null;
    }
}




