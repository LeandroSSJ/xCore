package net.helydev.com.commands;

import net.helydev.com.utils.Color;
import net.helydev.com.utils.Utils;
import net.helydev.com.utils.commands.Command;
import net.helydev.com.utils.commands.CommandArgs;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class EnderChestCommand {

    @Command(name = "enderchest", permission = "core.command.enderchest", inGameOnly = true, aliases = {"ec"})

    public void openEnderchest(CommandArgs command) {
        Player player = command.getPlayer();
        String[] args = command.getArgs();
        if (args.length < 1) {
            player.openInventory(player.getEnderChest());
        } else if (player.hasPermission("core.command.enderchest.others")) {
            Player target = Bukkit.getPlayer(args[0]);
            if (!Utils.isOnline(player, target)) {
                Utils.PLAYER_NOT_FOUND(player, args[0]);
                return;
            }
            if (target.equals(player)) {
                player.sendMessage(Color.translate("&cYou can not open your own ender chest."));
                return;
            }
            player.sendMessage(Color.translate("&6Opening enderchest of &f" + target.getName() + "&6."));
            player.openInventory(target.getEnderChest());

        }
    }
}
