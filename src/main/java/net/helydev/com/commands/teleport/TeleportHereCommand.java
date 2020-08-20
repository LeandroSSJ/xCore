package net.helydev.com.commands.teleport;

import net.helydev.com.utils.Color;
import net.helydev.com.utils.Utils;
import net.helydev.com.utils.commands.Command;
import net.helydev.com.utils.commands.CommandArgs;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class TeleportHereCommand {

    @Command(name = "teleporthere", permission = "core.command.teleporthere", inGameOnly = true, aliases = { "s", "tphere", "hereteleport"})

    public void teleportmePlayer(CommandArgs command) {
        Player player = command.getPlayer();
        String[] args = command.getArgs();
        if (args.length < 1) {
            player.sendMessage(Color.translate("&cUsage: /teleporthere <player>"));
        } else {
            Player target = Bukkit.getPlayer(args[0]);
            if (!Utils.isOnline(player, target)) {
                Utils.PLAYER_NOT_FOUND(player, args[0]);
                return;
            }
            target.teleport(player);
            player.sendMessage(Color.translate("&6Teleported&f "+ player.getName() +" &6to &f" + target.getName()));
        }
    }
}
