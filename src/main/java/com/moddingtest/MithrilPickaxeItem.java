package com.moddingtest;

import com.mojang.authlib.minecraft.client.MinecraftClient;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.minecraft.world.level.Level;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


public class MithrilPickaxeItem extends Item {
    public MithrilPickaxeItem(Properties properties) {
        super(properties);
    }
    public static final String MOD_ID = "modding-test";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public InteractionResult use(Level level, Player user, InteractionHand hand) {
        ItemStack itemStack = user.getItemInHand(hand);

        if (level.isClientSide()) {
            return InteractionResult.PASS;
        }

        LOGGER.info("RIGHT CLICK PRESSED RIGHT CLICK PRESSED");

        user.addEffect(new MobEffectInstance(ModdingTest.FAST_MINE, 300, 4, false, false, false));
        user.getCooldowns().addCooldown(this.getDefaultInstance(), 600);
        return InteractionResult.SUCCESS;
    }

}