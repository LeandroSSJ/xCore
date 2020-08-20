package net.helydev.com.commands;

import net.helydev.com.utils.commands.Command;
import net.helydev.com.utils.commands.CommandArgs;
import org.bukkit.entity.Player;

public class CraftCommand {

    @Command(name = "craft", permission = "core.command.craft", inGameOnly = true)

    public void openCraft(CommandArgs command) {
        Player player = command.getPlayer();
        String[] args = command.getArgs();
        player.openWorkbench(null, true);
    }
}
