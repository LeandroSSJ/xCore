package net.helydev.com.commands;

import net.helydev.com.utils.Color;
import net.helydev.com.utils.Utils;
import net.helydev.com.utils.commands.Command;
import net.helydev.com.utils.commands.CommandArgs;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class FeedCommand {

    @Command(name = "feed", permission = "core.command.feed", inGameOnly = true)
    public void feed(CommandArgs command) {
        Player player = command.getPlayer();
        String[] args = command.getArgs();
        if (args.length < 1) {
            player.sendMessage(Color.translate("&6You now have full hunger."));
            player.setFoodLevel(20);
         } else if (player.hasPermission("core.command.feed.others")) {
            Player target = Bukkit.getPlayer(args[0]);
            if (!Utils.isOnline(player, target)) {
                Utils.PLAYER_NOT_FOUND(player, args[0]);
                return;
            }
            if (target.getFoodLevel() == 20) {
                player.sendMessage(Color.translate("&c" + target.getName() + " already has full hunger."));
                return;
            }
            if (target.equals(player)) {
                player.sendMessage(Color.translate("&cYou cannot give yourself talk the hunger."));
                return;
            }
            player.sendMessage(Color.translate("&aYou have taken away the hunger&f" + player.getName()));
            target.setFoodLevel(20);
            target.sendMessage(Color.translate("&6You now have full hunger by&f " + player.getName()));
        }
    }
}
