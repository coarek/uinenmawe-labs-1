package moe.uinen.tutormod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent JERKY = new FoodComponent.Builder().nutrition(2).saturationModifier(1.2F)
            .alwaysEdible().build();


    public static void registerModFoodComponents() {

    }
}
