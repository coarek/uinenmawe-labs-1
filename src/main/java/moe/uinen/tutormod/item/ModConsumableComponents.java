package moe.uinen.tutormod.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import static net.minecraft.component.type.ConsumableComponents.food;

public class ModConsumableComponents {
    public static final ConsumableComponent JERKY = food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 100, 0), 1F))
            .build();

    public static void registerModConsumableComponents() {

    }
}
