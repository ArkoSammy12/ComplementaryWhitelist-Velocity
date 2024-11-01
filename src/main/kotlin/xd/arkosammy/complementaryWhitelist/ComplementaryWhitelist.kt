package xd.arkosammy.complementaryWhitelist;

import com.google.inject.Inject
import com.velocitypowered.api.command.VelocityBrigadierMessage
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin
import com.velocitypowered.api.proxy.server.ServerInfo
import org.slf4j.Logger

@Plugin(
    id = "complementarywhitelist", name = "complementary-whitelist", version = BuildConstants.VERSION
)
class ComplementaryWhitelist @Inject constructor(val logger: Logger) {

    @Subscribe
    fun onProxyInitialization(event: ProxyInitializeEvent) {

    // test change
    }
}
