
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.chapmanmedia.glaciersadditions.init;

import org.chapmanmedia.glaciersadditions.block.SesbianLexBlock;
import org.chapmanmedia.glaciersadditions.block.AftextBlock;
import org.chapmanmedia.glaciersadditions.block.AfBlock;
import org.chapmanmedia.glaciersadditions.GlaciersAdditionsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class GlaciersAdditionsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GlaciersAdditionsMod.MODID);
	public static final RegistryObject<Block> AF = REGISTRY.register("af", () -> new AfBlock());
	public static final RegistryObject<Block> AFTEXT = REGISTRY.register("aftext", () -> new AftextBlock());
	public static final RegistryObject<Block> SESBIAN_LEX = REGISTRY.register("sesbian_lex", () -> new SesbianLexBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			AfBlock.registerRenderLayer();
			AftextBlock.registerRenderLayer();
			SesbianLexBlock.registerRenderLayer();
		}
	}
}
