package net.helydev.com.commands.chat;

import net.helydev.com.utils.Color;
import net.helydev.com.utils.commands.Command;
import net.helydev.com.utils.commands.CommandArgs;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ChatClearCommand {

    @Command(name = "chatclear", permission = "core.command.clearchat", inGameOnly = false, aliases = {"cc", "clearchat"})
    public void deleteChat(CommandArgs command) {
        Player player = command.getPlayer();
        String[] args = command.getArgs();
        if (args.length < 1) {
            for (int i = 0; i < 105; ++i) {
                Bukkit.broadcastMessage("");
            }
            Bukkit.broadcastMessage(Color.translate("&aChat has been cleared by&f " + player.getName()));
            return;
        }
    }
}
