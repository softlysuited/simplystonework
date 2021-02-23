
package net.mcreator.simplystonework.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.simplystonework.itemgroup.SimplystoneworkItemGroup;
import net.mcreator.simplystonework.Simplystonework7513ModElements;

import java.util.List;
import java.util.Collections;

@Simplystonework7513ModElements.ModElement.Tag
public class NoritePolishedStairsBlock extends Simplystonework7513ModElements.ModElement {
	@ObjectHolder("simplystonework7513:norite_polished_stairs")
	public static final Block block = null;
	public NoritePolishedStairsBlock(Simplystonework7513ModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(SimplystoneworkItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends StairsBlock {
		public CustomBlock() {
			super(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 10f)).getDefaultState(),
					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5f, 10f).setLightLevel(s -> 0)
							.harvestLevel(1).harvestTool(ToolType.PICKAXE));
			setRegistryName("norite_polished_stairs");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
