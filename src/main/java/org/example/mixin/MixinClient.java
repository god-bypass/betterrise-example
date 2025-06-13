package org.example.mixin;

import hackclient.rise.a;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(a.class)
public class MixinClient {

    @Inject(method = "init", at = @At("HEAD"))
    public void init(CallbackInfo ci) {
        System.out.println("Hello Rise!");
    }
}