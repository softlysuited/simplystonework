
package net.mcreator.simplystonework.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.simplystonework.block.SchistBlock;
import net.mcreator.simplystonework.Simplystonework7513ModElements;

@Simplystonework7513ModElements.ModElement.Tag
public class SimplystoneworkItemGroup extends Simplystonework7513ModElements.ModElement {
	public SimplystoneworkItemGroup(Simplystonework7513ModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsimplystonework") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SchistBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
