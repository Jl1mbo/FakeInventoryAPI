package FakeInventoryAPI;

import FakeInventoryAPI.Components.EventsListener.BlockBreakListener;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase {
    public static Main instance;

    public static Main getInstance() {
        return instance;
    }

    @Override()
    public void onEnable() {
        instance = this;
        this.getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
        this.getLogger().info("§l§fПлагин на §6FakeInventoryAPI §aАктивирован§7!");
    }

    @Override()
    public void onDisable() {
        this.getLogger().info("§l§fПлагин на §6FakeInventoryAPI §cДеактивирован§7!");
    }
}