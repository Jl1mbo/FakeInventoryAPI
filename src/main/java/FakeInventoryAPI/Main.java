package FakeInventoryAPI;

import FakeInventoryAPI.FakeInventoryAPI.FakeInventoryEventsHandler;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase {
    public static Main plugin;

    @Override()
    public void onEnable() {
        plugin = this;
        this.getServer().getPluginManager().registerEvents(new FakeInventoryEventsHandler(), this);
        this.getServer().getLogger().info("§l§fПлагин на §6FakeInventoryAPI §aАктивирован§7!");
    }

    @Override()
    public void onDisable() {
        this.getServer().getLogger().info("§l§fПлагин на §6FakeInventoryAPI §cДеактивирован§7!");
    }
}