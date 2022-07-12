
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AddonsModTabs {
	public static CreativeModeTab TAB_ADDON;

	public static void load() {
		TAB_ADDON = new CreativeModeTab("tabaddon") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.RED_WOOL);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
