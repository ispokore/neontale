
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.neontales.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.neontales.item.OldHerosBladeItemItem;
import net.mcreator.neontales.item.NeonMurasameItem;
import net.mcreator.neontales.NeonTalesMod;

public class NeonTalesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NeonTalesMod.MODID);
	public static final RegistryObject<Item> OLD_HEROS_BLADE_ITEM = REGISTRY.register("old_heros_blade_item", () -> new OldHerosBladeItemItem());
	public static final RegistryObject<Item> NEON_MURASAME = REGISTRY.register("neon_murasame", () -> new NeonMurasameItem());
	public static final RegistryObject<Item> OLD_HEROS_BLADE = block(NeonTalesModBlocks.OLD_HEROS_BLADE, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
