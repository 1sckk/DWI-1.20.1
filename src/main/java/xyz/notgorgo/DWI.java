package xyz.notgorgo;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.notgorgo.dwi.block.ModBlocks;
import xyz.notgorgo.dwi.item.ModItemGroups;
import xyz.notgorgo.dwi.item.ModItems;

public class DWI implements ModInitializer {
	public static final String MOD_ID = "dwi";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModItemGroups.registerModItemGroups();
		ModBlocks.registerModBlocks();
	}
}