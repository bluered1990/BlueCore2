package me.blueb8h.bluecore;

import me.blueb8h.bluecore.commands.*;
import me.blueb8h.bluecore.economy.EconomyManager;
import me.blueb8h.bluecore.ranks.RankManager;
import me.blueb8h.bluecore.tpa.TpaManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BlueCore extends JavaPlugin {
    public static EconomyManager economy = new EconomyManager();
    public static RankManager ranks = new RankManager();
    public static TpaManager tpa = new TpaManager();

    @Override
    public void onEnable() {
        getCommand("balance").setExecutor(new BalanceCommand());
        getCommand("pay").setExecutor(new PayCommand());
        getCommand("rank").setExecutor(new RankCommand());
        getCommand("tpa").setExecutor(new TpaCommand());
        getCommand("tpaccept").setExecutor(new TpAcceptCommand());
        getCommand("tpdeny").setExecutor(new TpDenyCommand());
        getCommand("shop").setExecutor(new ShopCommand());
    }
}
