package com.imaginarycode.minecraft.redisbungee.commands;

import com.imaginarycode.minecraft.redisbungee.RedisBungee;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class ServerIdCommand extends Command {

    private final RedisBungee plugin;

    public ServerIdCommand(RedisBungee plugin) {
        super("serverid", "redisbungee.command.serverid", "rserverid");
        this.plugin = plugin;
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        TextComponent textComponent = new TextComponent();
        textComponent.setText("You are on " + RedisBungee.getApi().getServerId() + ".");
        textComponent.setColor(ChatColor.YELLOW);
        sender.sendMessage(textComponent);
    }
}