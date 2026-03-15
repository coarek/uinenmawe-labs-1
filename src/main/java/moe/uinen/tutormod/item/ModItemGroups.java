package moe.uinen.tutormod.item;

import moe.uinen.tutormod.TutorialMod;
import moe.uinen.tutormod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup UNRELEVANT_SHIT = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "unrelevant_shit"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GUINNESS_CAN))
                    .displayName(Text.translatable("itemgroup.uinenmod.unrelevant_shit"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.GUINNESS_CAN);
                        entries.add(ModItems.MILLER_CAN);
                        entries.add(ModBlocks.TIN_HEAP_BLOCK);
                        entries.add(ModItems.PIECE_OF_JUNK);
                    }).build());

    public static void registerGroups() {
        TutorialMod.LOGGER.info("registering item groups for" + TutorialMod.MOD_ID);
    }
}
