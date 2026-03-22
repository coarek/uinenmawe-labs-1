package moe.uinen.tutormod.item;

import moe.uinen.tutormod.TutorialMod;
import moe.uinen.tutormod.item.custom.ChiselItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import static net.minecraft.item.Items.register;

public class ModItems {
    public static final Item GUINNESS_CAN = registerItem(
            "guinness_can",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID,
                    "guinness_can")))
    ));
    public static final Item MILLER_CAN = registerItem(
            "miller_can",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID,
                    "miller_can")))));

    public static final Item PIECE_OF_JUNK = registerItem(
            "piece_of_junk",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID,
                    "piece_of_junk")))));

    public static final Item CHISEL = registerItem(
            "chisel",
            new ChiselItem(new Item.Settings().maxDamage(32).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID,
                    "chisel")))));

    public static final Item JERKY = registerItem("jerky",
            new Item(new Item.Settings().food(ModFoodComponents.JERKY, ModConsumableComponents.JERKY).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID,
                    "jerky")))));

    public static final Item PEAT = registerItem(
            "peat",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID,
            "peat")))));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TutorialMod.LOGGER.info("register mod items for" + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(GUINNESS_CAN);
            entries.add(MILLER_CAN);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PIECE_OF_JUNK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(CHISEL);
        });
    }
}
