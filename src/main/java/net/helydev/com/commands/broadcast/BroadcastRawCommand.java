package net.helydev.com.commands.broadcast;

import net.helydev.com.utils.Color;
import net.helydev.com.utils.commands.Command;
import net.helydev.com.utils.commands.CommandArgs;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class BroadcastRawCommand {

    @Command(name = "broadcastraw", permission = "core.command.broadcastraw", inGameOnly = false, aliases = {"bcraw"})
    public void senBroadcastRaw(CommandArgs command) {
        Player player = command.getPlayer();
        String[] args = command.getArgs();
        String r = "";
        if (args.length < 1) {
            player.sendMessage(Color.translate("&cCorrect Usage: /bcraw <message>"));
        } else {
            for (int i = 0; i < args.length; ++i) {
                r = String.valueOf(r) + args[i] + " ";
            }
            r = r.replace("&", "§");
            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', r));
        }
    }
}
