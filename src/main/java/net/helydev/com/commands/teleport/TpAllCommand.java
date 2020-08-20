package net.helydev.com.commands.teleport;

import net.helydev.com.utils.Color;
import net.helydev.com.utils.commands.Command;
import net.helydev.com.utils.commands.CommandArgs;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class TpAllCommand {

    @Command(name = "tpall", permission = "core.command.teleportall", inGameOnly = true)

    public void teleportAll(CommandArgs command) {
        Player player = command.getPlayer();
        String[] args = command.getArgs();
        for (Player online : Bukkit.getOnlinePlayers()) {
            if (online == player) continue;
            online.teleport(player);
            online.sendMessage(Color.translate("&eYou have been teleported to &c" + player.getName()));
        }
        player.sendMessage(Color.translate("&aAll players have been teleported to you."));
    }
}
