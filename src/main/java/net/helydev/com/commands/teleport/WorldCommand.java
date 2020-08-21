package net.helydev.com.commands.teleport;

import net.helydev.com.utils.Color;
import net.helydev.com.utils.commands.Command;
import net.helydev.com.utils.commands.CommandArgs;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class WorldCommand {

    @Command(name = "world", permission = "core.command.world", inGameOnly = true)

    public void teleportWorld(CommandArgs command) {
        Player player = command.getPlayer();
        String[] args = command.getArgs();
        if (args.length == 0) {
            player.sendMessage(Color.translate("&cUsage: /world <world>"));
            return;
        }
        World world = Bukkit.getWorld(args[0]);
        if (world == null) {
            player.sendMessage(Color.translate("&cYou have entered invalid world."));
            return;
        }
        if (world.getName().equalsIgnoreCase(player.getWorld().getName())) {
            player.sendMessage(Color.translate("&cYou are already in that world."));
            return;
        }
        player.teleport(new Location(world, 0, world.getHighestBlockYAt(0, 0) + 30, 0));
        player.sendMessage(Color.translate("&aYou've been teleported to &f" + world.getName() + " &aworld."));

    }
}
