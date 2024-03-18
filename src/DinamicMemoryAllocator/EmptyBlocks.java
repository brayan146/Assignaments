package DinamicMemoryAllocator;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.List;


class EmptyBlocks
{

    public static List<MemoryBlock> emptyBlocks(List<MemoryBlock> blocks){
        List<MemoryBlock> emptyBlocks = new ArrayList<MemoryBlock>();
        for (MemoryBlock b : blocks) {
            if (b.IsFree()) {
                emptyBlocks.add(b);
            }
        }
        return emptyBlocks;
    }

}