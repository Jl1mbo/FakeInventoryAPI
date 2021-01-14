package FakeInventoryAPI.FakeInventoryAPI;

import FakeInventoryAPI.FakeInventoryAPI.Utils.FakeChests;
import FakeInventoryAPI.Main;
import cn.nukkit.Player;
import cn.nukkit.inventory.Inventory;
import cn.nukkit.scheduler.NukkitRunnable;

public class FakeInventoryAPI {
    private static final FakeChests fakeChests = new FakeChests();

    public static void openInventory(Player player, Inventory inventory) {
        new NukkitRunnable() {

            @Override()
            public void run() {
                if (player != null && inventory != null && !fakeChests.getFakeInventory(player).isPresent()) {
                    player.addWindow(inventory);
                }
            }
        }.runTaskLater(Main.getInstance(), 10);
    }

    public static void openDoubleChestInventory(Player player, Inventory inventory) {
        new NukkitRunnable() {

            @Override()
            public void run() {
                if (player != null && inventory != null && !fakeChests.getFakeInventory(player).isPresent()) {
                    player.addWindow(inventory);
                }
            }
        }.runTaskLater(Main.getInstance(), 12);
    }

    public static void closeDoubleChestInventory(Player player, Inventory inventory) {
        new NukkitRunnable() {

            @Override()
            public void run() {
                if (player != null && inventory != null && fakeChests.getFakeInventory(player).isPresent()) {
                    player.removeWindow(inventory);
                }
            }
        }.runTaskLater(Main.getInstance(), 10);
    }

    public static void closeInventory(Player player, Inventory inventory) {
        if (player != null && inventory != null && fakeChests.getFakeInventory(player).isPresent()) {
            player.removeWindow(inventory);
        }
    }
}