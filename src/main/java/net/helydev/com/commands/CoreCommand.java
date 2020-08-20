package net.helydev.com.commands;

import net.helydev.com.utils.Color;
import net.helydev.com.utils.commands.Command;
import net.helydev.com.utils.commands.CommandArgs;
import net.helydev.com.xCore;
import org.bukkit.entity.Player;

public class CoreCommand {

    @Command(name = "core", permission = "", inGameOnly = true)
    public void sendMessage(CommandArgs command) {
        Player player = command.getPlayer();
        String[] args = command.getArgs();
        player.sendMessage(Color.translate("&7&m-----------------------------"));
        player.sendMessage(Color.translate("&7» &ePlugin: &fxCore"));
        player.sendMessage("");
        player.sendMessage(Color.translate("&7» &eVersion: &f" + xCore.getPlugin().getDescription().getVersion()));
        player.sendMessage(Color.translate("&7» &eDescription: &f" + xCore.getPlugin().getDescription().getDescription()));
        player.sendMessage(Color.translate("&7» &eAuthor: &fLeandroSSJ"));
        player.sendMessage(Color.translate("&7&m-----------------------------"));
    }
}
