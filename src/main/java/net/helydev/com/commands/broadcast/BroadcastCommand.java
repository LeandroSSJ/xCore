package net.helydev.com.commands.broadcast;

import net.helydev.com.utils.Color;
import net.helydev.com.utils.commands.Command;
import net.helydev.com.utils.commands.CommandArgs;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class BroadcastCommand {

    @Command(name = "broadcast", permission = "core.command.broadcast", inGameOnly = false, aliases = {"bc"})
    public void sendBroadcast(CommandArgs command) {
        Player player = command.getPlayer();
        String[] args = command.getArgs();
        String r = "";
        if (args.length < 1) {
            player.sendMessage(Color.translate("&cCorrect Usage: /broadcast <message>"));
        } else {
            for (int i = 0; i < args.length; ++i) {
                r = String.valueOf(r) + args[i] + " ";
            }
            r = r.replace("&", "§");
            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&8[&4Alert&8] &f" + r));
        }
    }

}
