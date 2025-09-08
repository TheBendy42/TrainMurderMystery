package dev.doctor4t.trainmurdermystery.mixin.client;

import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayerEntity.class)
public class ClientPlayerEntityMixin {
    @Shadow protected int ticksLeftToDoubleTapSprint;

    @Inject(method = "tickMovement", at = @At("HEAD"))
    public void tmm$disableDoubleTapSprint(CallbackInfo ci) {
        this.ticksLeftToDoubleTapSprint = 0;
    }
}
