
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.neontales.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.neontales.block.OldHerosBladeBlock;
import net.mcreator.neontales.NeonTalesMod;

public class NeonTalesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NeonTalesMod.MODID);
	public static final RegistryObject<Block> OLD_HEROS_BLADE = REGISTRY.register("old_heros_blade", () -> new OldHerosBladeBlock());
}
