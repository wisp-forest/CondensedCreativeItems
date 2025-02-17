package io.wispforest.condensed_creative.mixins.client;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(CreativeModeTabs.class)
public interface CreativeModeTabsAccessor {
    @Accessor("HOTBAR")
    static ResourceKey<CreativeModeTab> HOTBAR() {
        throw new UnsupportedOperationException();
    }
}
