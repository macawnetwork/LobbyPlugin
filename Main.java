package net.macaw.lobby;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        getCommand("lobby").setExecutor(this);
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[MacawLobby] Plugin activado.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.GREEN + "Enviándote al lobby principal...");
            player.performCommand("warp lobby");
        }
        return true;
    }
}
