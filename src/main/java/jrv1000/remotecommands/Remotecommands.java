package jrv1000.remotecommands;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public final class Remotecommands extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("runCommands").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
