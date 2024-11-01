package xd.arkosammy.complementaryWhitelist.commands

import com.mojang.brigadier.Command
import com.mojang.brigadier.arguments.StringArgumentType
import com.mojang.brigadier.builder.LiteralArgumentBuilder
import com.mojang.brigadier.builder.RequiredArgumentBuilder
import com.mojang.brigadier.tree.ArgumentCommandNode
import com.mojang.brigadier.tree.LiteralCommandNode
import com.velocitypowered.api.command.BrigadierCommand
import com.velocitypowered.api.command.CommandSource
import com.velocitypowered.api.event.player.GameProfileRequestEvent
import com.velocitypowered.api.proxy.ProxyServer
import com.velocitypowered.api.util.GameProfile
import java.util.UUID

object WhitelistCommands {

    @JvmStatic
    fun createCommands(server: ProxyServer) : BrigadierCommand {

        val complementaryWhitelistNode: LiteralArgumentBuilder<CommandSource> = BrigadierCommand.literalArgumentBuilder("cwhitelist")
            .requires { s -> s.hasPermission("complementarywhitelist.whitelist")}


        val whitelistAddNode: RequiredArgumentBuilder<CommandSource?, String?>? = BrigadierCommand.requiredArgumentBuilder("username", StringArgumentType.word())
            .requires { s -> s.hasPermission("complementarywhitelist.whitelist") }
            .executes { ctx ->

                Command.SINGLE_SUCCESS
            }

        val brigadierCommand: BrigadierCommand = BrigadierCommand(complementaryWhitelistNode.then(whitelistAddNode))
        return brigadierCommand
    }

}