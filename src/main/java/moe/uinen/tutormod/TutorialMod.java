package moe.uinen.tutormod;

import moe.uinen.tutormod.block.ModBlocks;
import moe.uinen.tutormod.item.ModConsumableComponents;
import moe.uinen.tutormod.item.ModFoodComponents;
import moe.uinen.tutormod.item.ModItemGroups;
import moe.uinen.tutormod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.item.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "uinenmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModFoodComponents.registerModFoodComponents();
		ModConsumableComponents.registerModConsumableComponents();

		FuelRegistryEvents.BUILD.register(((builder, context) -> {
			builder.add(ModItems.PEAT, 600);
		}
		));
	}
}