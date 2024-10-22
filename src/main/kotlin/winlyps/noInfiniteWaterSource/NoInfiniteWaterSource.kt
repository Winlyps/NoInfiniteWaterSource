package winlyps.noInfiniteWaterSource

import org.bukkit.plugin.java.JavaPlugin

class NoInfiniteWaterSource : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("waterSourceConversion", "false")
        }
        logger.info("NoInfiniteWaterSource plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("NoInfiniteWaterSource plugin has been disabled.")
    }
}