package FakeInventoryAPI.Components.EventsListener;

import FakeInventoryAPI.Components.Utils.FakeChests;
import cn.nukkit.block.Block;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.event.block.BlockBreakEvent;
import cn.nukkit.math.BlockVector3;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor()
public class BlockBreakListener implements Listener {
    private static final FakeChests fakeChests = new FakeChests();

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockBreak(BlockBreakEvent event) {
        Block block = event.getBlock();
        List<BlockVector3> positions = fakeChests.getFakeInventoryPositions(event.getPlayer());
        if (block != null && positions != null) {
            for (BlockVector3 pos : positions) {
                if (pos.getX() == block.getX() && pos.getY() == block.getZ() && pos.z == block.getZ()) {
                    event.setCancelled(true);
                    return;
                }
            }
        }
    }
}