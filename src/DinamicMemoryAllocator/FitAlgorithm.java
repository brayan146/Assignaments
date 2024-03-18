package DinamicMemoryAllocator;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.List;

class FitAlgorithm implements IAllocationAlgorithm
{
    private BlockSorter blockSorter ;
    public FitAlgorithm(BlockSorter blockSorter){
        this.blockSorter = blockSorter;
    }
    @Override
    public MemoryBlock GetMemoryBlock(List<MemoryBlock> blocks, int size) {
        List<MemoryBlock> emptyBlocks = EmptyBlocks.emptyBlocks(blocks);

        blockSorter.sort(emptyBlocks);

        for (MemoryBlock b : emptyBlocks) {
            if (b.getSize() >= size) {
                return b;
            }
        }
        return null;
    }

}


