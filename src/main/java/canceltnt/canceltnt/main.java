package canceltnt.canceltnt;

import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    public static main plugin;
    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        getServer().getPluginManager().registerEvents(new EventListener(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
