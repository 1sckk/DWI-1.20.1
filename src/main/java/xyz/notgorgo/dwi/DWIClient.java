package xyz.notgorgo.dwi;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.MagmaBlock;
import net.minecraft.client.render.RenderLayer;
import xyz.notgorgo.dwi.block.ModBlocks;

public class DWIClient implements ClientModInitializer {
        @Override
        public void onInitializeClient() {
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUBY_DOOR, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUBY_TRAPDOOR, RenderLayer.getCutout());
        }
    }

