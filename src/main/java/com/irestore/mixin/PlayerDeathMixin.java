package com.irestore.mixin;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.server.network.ServerPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayerEntity.class)
public class PlayerDeathMixin {

  @Inject(method = "onDeath", at = @At("HEAD"))
  private void onDeath(DamageSource damageSource, CallbackInfo ci) {
    System.out.println("Player has died! Running PlayerDeathMixin.");
    // Store dead player's inventory
  }
}
