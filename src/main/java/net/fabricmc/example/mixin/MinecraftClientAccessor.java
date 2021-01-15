package net.fabricmc.example.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.WindowProvider;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(MinecraftClient.class)
public interface MinecraftClientAccessor{
    @SuppressWarnings("ConstantConditions")
    @Accessor static Logger getLOGGER(){ return (Logger)new Object();}
    @Accessor WindowProvider getWindowProvider();
}
