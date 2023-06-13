package com.funni;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class FunniMod implements ModInitializer {
    
    static class FunniStick extends Item {
        
        public FunniStick(Settings settings) {
            super(settings);
        }
        
        @Override
        public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
            playerEntity.playSound(SoundEvents.BLOCK_AMETHYST_CLUSTER_BREAK, 1.0F, 1.0F);
            return TypedActionResult.success(playerEntity.getStackInHand(hand));
        }
    }
    
    public static final FunniStick FUNNI_STICK = Registry.register(Registries.ITEM, new Identifier("funni", "funni_stick"), new FunniStick(new FabricItemSettings().maxCount(1)));
    

    @Override
    public void onInitialize() {
        
        
    }
}