package com.example.velocityplugin;

import com.google.inject.Inject;
import com.velocitypowered.api.command.CommandManager;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;

@Plugin(id = "pluginforcrypnotic", name = "My First Plugin for Crypnotic", version = "1.0-SNAPSHOT",
        description = "I did it!", authors = {"Me"})

public class VelocityTest {

    private final ProxyServer server;
    private final Logger logger;

    @Inject
    public VelocityTest(ProxyServer server, CommandManager commandManager, Logger logger) {
        this.server = server;
        this.logger = logger;
        commandManager.register(new CommandTest(), "crypnotic");
        logger.info("Hello there, it's a test plugin I made!");
    }

}
