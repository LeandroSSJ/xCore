package net.helydev.com;


import net.helydev.com.commands.*;
import net.helydev.com.commands.broadcast.BroadcastCommand;
import net.helydev.com.commands.broadcast.BroadcastRawCommand;
import net.helydev.com.commands.chat.ChatClearCommand;
import net.helydev.com.commands.ClearInventoryCommand;
import net.helydev.com.commands.teleport.TeleportCommand;
import net.helydev.com.commands.teleport.TeleportHereCommand;
import net.helydev.com.commands.teleport.TpAllCommand;
import net.helydev.com.commands.time.DayCommand;
import net.helydev.com.commands.time.NightCommand;
import net.helydev.com.utils.commands.CommandFramework;
import org.bukkit.plugin.java.JavaPlugin;


public class xCore extends JavaPlugin {


    private static xCore plugin;


    @Override
    public void onEnable() {
        plugin = this;
        this.saveDefaultConfig();
        this.reloadConfig();
        this.registerCommand();


    }
    @Override

    public void onDisable() {
        plugin = null;
    }




    public void registerCommand() {

        CommandFramework commandFramework = new CommandFramework(this);
        commandFramework.registerCommands(new GamemodeCommand());
        commandFramework.registerCommands(new EnderChestCommand());
        commandFramework.registerCommands(new CraftCommand());
        commandFramework.registerCommands(new FeedCommand());
        commandFramework.registerCommands(new HubCommand());
        commandFramework.registerCommands(new InvseeCommand());
        commandFramework.registerCommands(new ClearInventoryCommand());
        commandFramework.registerCommands(new CoreCommand());

        commandFramework.registerCommands(new DayCommand());
        commandFramework.registerCommands(new NightCommand());

        commandFramework.registerCommands(new BroadcastCommand());
        commandFramework.registerCommands(new BroadcastRawCommand());

        commandFramework.registerCommands(new ChatClearCommand());

        commandFramework.registerCommands(new TeleportCommand());
        commandFramework.registerCommands(new TeleportHereCommand());
        commandFramework.registerCommands(new TpAllCommand());

        commandFramework.registerHelp();
    }






    public static xCore getPlugin() {
        return plugin;
    }


}
