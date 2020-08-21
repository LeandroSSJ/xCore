package net.helydev.com.commands.teleport;

import net.helydev.com.utils.Color;
import net.helydev.com.utils.commands.Command;
import net.helydev.com.utils.commands.CommandArgs;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class TopCommand {

    @Command(name = "top", permission = "core.command.top", inGameOnly = true)

    public void openInvsee(CommandArgs command) {
        Player player = command.getPlayer();
        String[] args = command.getArgs();
        Location location = player.getLocation();
        int highest = location.getWorld().getHighestBlockYAt(location.getBlockX(), location.getBlockZ());

        if (location.getBlockY() >= highest) {
            player.sendMessage(Color.translate("&cYou're already at or above the highest block at your location."));
            return;
        }

        player.teleport(new Location(location.getWorld(), location.getX(), highest + 1.0, location.getZ(), location.getYaw(), location.getPitch()));
        player.sendMessage(Color.translate("&aYou have been teleported to the &fhighest &alocation at your position."));

    }
}
