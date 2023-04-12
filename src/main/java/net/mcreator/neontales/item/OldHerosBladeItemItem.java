
package net.mcreator.neontales.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class OldHerosBladeItemItem extends Item {
	public OldHerosBladeItemItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.COMMON));
	}
}
