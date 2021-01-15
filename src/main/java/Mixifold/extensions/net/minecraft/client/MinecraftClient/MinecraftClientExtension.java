package Mixifold.extensions.net.minecraft.client.MinecraftClient;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;
import net.fabricmc.example.mixin.MinecraftClientAccessor;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.WindowProvider;
import org.apache.logging.log4j.Logger;

@Extension
public class MinecraftClientExtension {
  @Extension
  public static Logger getLogger(){
    return MinecraftClientAccessor.getLOGGER();
  }
  
  public static WindowProvider getWindowProvider(@This MinecraftClient client){
    return ((MinecraftClientAccessor)client).getWindowProvider();
  }
}