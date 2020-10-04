package com.example.velocityplugin;

import com.velocitypowered.api.command.Command;
import com.velocitypowered.api.command.CommandSource;
import net.kyori.text.TextComponent;
import net.kyori.text.format.TextColor;
import org.checkerframework.checker.nullness.qual.NonNull;

public class CommandTest implements Command{

    @Override
    public void execute(@NonNull CommandSource source, String[] args) {
        source.sendMessage(TextComponent.of("Hello Crypnotic!").color(TextColor.AQUA));
    }

}
