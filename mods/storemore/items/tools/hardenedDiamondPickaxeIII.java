package mods.storemore.items.tools;

import mods.storemore.StoreMore;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class hardenedDiamondPickaxeIII extends ItemPickaxe{

	public hardenedDiamondPickaxeIII(int id, EnumToolMaterial hardenedDiamondIII) {
		super(id, hardenedDiamondIII);
		this.setCreativeTab(StoreMore.StoreMoreTab);		
	}
	
	public void updateIcons(IconRegister par1IconRegister)
	{
	    this.iconIndex = par1IconRegister.registerIcon(StoreMore.MODtextures + ":" + this.getUnlocalizedName());
	}


}
