package net.helydev.com.utils;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Utils {
    public static boolean isOnline(CommandSender sender, Player player) {
        return player != null && (!(sender instanceof Player) || ((Player)sender).canSee(player));
    }
    public static void PLAYER_NOT_FOUND(CommandSender sender, String player) {
        sender.sendMessage(Color.translate("&6Player '&f" + player + "&6' not found."));
    }
}
