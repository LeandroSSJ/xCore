package net.helydev.com.commands.disguise;

import me.libraryaddict.disguise.DisguiseAPI;
import me.libraryaddict.disguise.disguisetypes.PlayerDisguise;
import net.helydev.com.utils.Color;
import net.helydev.com.utils.commands.Command;
import net.helydev.com.utils.commands.CommandArgs;
import org.bukkit.entity.Player;

public class DisguiseCommand {

    @Command(name = "disguise", permission = "core.command.disguise", inGameOnly = true)
    public void setSkinDisguise(CommandArgs command) {
        Player player = command.getPlayer();
        String[] args = command.getArgs();
        if (args.length < 1) {
            player.sendMessage(Color.translate("&cUsage: /disguise player <name>"));
        }
        if (args.length < 2) {
            player.sendMessage(Color.translate("&cUsage: /disguise player <name>"));
        } if(args[0].equalsIgnoreCase("player")){
            String skin = args[1];
            DisguiseAPI.disguiseToAll(player, new PlayerDisguise(skin).setViewSelfDisguise(false));
            player.sendMessage(Color.translate("&eYou disguised as &f"+ skin +"&e."));
        }
    }
}
