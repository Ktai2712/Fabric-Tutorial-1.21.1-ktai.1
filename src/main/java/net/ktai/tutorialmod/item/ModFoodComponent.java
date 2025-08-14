package net.ktai.tutorialmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponent {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200),0.15f).build();

    public static final FoodComponent SPAGHETTOS = new FoodComponent.Builder().nutrition(5).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200,1),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 2),1f)
            .build();


}
