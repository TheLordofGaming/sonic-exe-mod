package net.mcreator.sonic_exe_mod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Elementssonic_exe_mod.ModElement.Tag
public class MCreatorRing extends Elementssonic_exe_mod.ModElement {
	@GameRegistry.ObjectHolder("sonic_exe_mod:ring")
	public static final Item block = null;

	public MCreatorRing(Elementssonic_exe_mod instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("sonic_exe_mod:ring", "inventory"));
	}

	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(6, 0.3f, false);
			setUnlocalizedName("ring");
			setRegistryName("ring");
			setAlwaysEdible();
			setCreativeTab(MCreatorSML64Mods.tab);
			setMaxStackSize(64);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}
	}
}
