package net.helydev.com.commands.time;

import net.helydev.com.utils.Color;
import net.helydev.com.utils.commands.Command;
import net.helydev.com.utils.commands.CommandArgs;
import org.bukkit.entity.Player;

public class NightCommand {

    @Command(name = "night", permission = "core.command.night", inGameOnly = true)

    public void setNightTime(CommandArgs command) {
        Player player = command.getPlayer();
        player.setPlayerTime(18000L, false);
        player.sendMessage(Color.translate( "&aIt's now night time."));
    }
}

