package mods.storemore.items.tools;

import mods.storemore.StoreMore;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class hardenedWoodAxeI extends ItemAxe{

	public hardenedWoodAxeI(int id, EnumToolMaterial hardenedWoodI) {
		super(id, hardenedWoodI);
		this.setCreativeTab(StoreMore.StoreMoreTab);
	}
	
	public void updateIcons(IconRegister par1IconRegister)
	{
	    this.iconIndex = par1IconRegister.registerIcon(StoreMore.MODtextures + ":" + this.getUnlocalizedName());
	}


}