package io.github.eblkinz.mavenplugintest;

import org.bukkit.plugin.java.JavaPlugin;

public final class MavenPluginTest extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		getLogger().info("Enabled");
	}
	
	@Override
	public void onDisable()
	{
		getLogger().info("Disabled");
	}
}
