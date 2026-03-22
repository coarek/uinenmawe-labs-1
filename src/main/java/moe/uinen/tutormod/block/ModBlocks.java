package moe.uinen.tutormod.block;

import moe.uinen.tutormod.TutorialMod;
import moe.uinen.tutormod.block.custom.MagicBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block TIN_HEAP_BLOCK = registerBlock("tin_heap_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.METAL).registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                            Identifier.of(TutorialMod.MOD_ID, "tin_heap_block")))));
    public static final Block GUINNESS_ORE = registerBlock("guinness_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                                    Identifier.of(TutorialMod.MOD_ID, "guinness_ore")))));
    public static final Block MILLER_ORE = registerBlock("miller_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                                    Identifier.of(TutorialMod.MOD_ID, "miller_ore")))));
    public static final Block MAGIC_BLOCK = registerBlock("magic_block",
            new MagicBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().registryKey(RegistryKey.of(
                    RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "magic_block")))));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,
                        Identifier.of(TutorialMod.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("registering mod blocks" + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.TIN_HEAP_BLOCK);

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.GUINNESS_ORE);
            entries.add(ModBlocks.MILLER_ORE);
        });

    }
}
