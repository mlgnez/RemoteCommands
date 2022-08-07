package jrv1000.remotecommands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

import java.io.IOException;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(command.getName().equalsIgnoreCase("runCommands")){
            try {

                String[] commands = Remote.getTextFromGithub();

                for(String command1 : commands){

                    System.out.println(Remote.getTextFromGithub());

                    ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();

                    Bukkit.dispatchCommand(console,command1);

                }

            } catch (IOException e) {

                e.printStackTrace();

            }
        }

        return false;
    }
}
