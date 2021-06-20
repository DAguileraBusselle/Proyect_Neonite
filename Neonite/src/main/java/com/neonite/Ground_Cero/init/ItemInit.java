package com.neonite.Ground_Cero.init;

import java.util.ArrayList;
import java.util.List;

import com.neonite.Ground_Cero.object.items.ItemBase;
import com.neonite.Ground_Cero.object.items.NeoniteArrow;
import com.neonite.Ground_Cero.object.items.NeoniteBow;
import com.neonite.Ground_Cero.object.items.tools.ToolAxe;
import com.neonite.Ground_Cero.object.items.tools.ToolHoe;
import com.neonite.Ground_Cero.object.items.tools.ToolPickaxe;
import com.neonite.Ground_Cero.object.items.tools.ToolShovel;
import com.neonite.Ground_Cero.object.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//materials
	public static final ToolMaterial TOOL_NEONITE = EnumHelper.addToolMaterial("tool neonite", 4, 15000, 15.0f, 40.0f, 30);
	
	//items
	public static final Item COMPACTED_NEONITE = new ItemBase("compacted_neonite");
	public static final Item NEONITE = new ItemBase("neonite");
	public static final Item FRAGMENTED_NEONITE = new ItemBase("fragmented_neonite");
	
	public static final Item DIAMOND_STRING = new ItemBase("diamond_string");
	public static final Item DIAMOND_FEATHER = new ItemBase("diamond_feather");
	
	//tools
	public static final Item SWORD_NEONITE = new ToolSword("neonite_sword", TOOL_NEONITE);
	public static final Item PICKAXE_NEONITE = new ToolPickaxe("neonite_pickaxe", TOOL_NEONITE);
	public static final Item SHOVEL_NEONITE = new ToolShovel("neonite_shovel", TOOL_NEONITE);
	public static final Item HOE_NEONTIE = new ToolHoe("neonite_hoe", TOOL_NEONITE);
	public static final Item AXE_NEONITE = new ToolAxe("neonite_axe", TOOL_NEONITE);
	
	//bow
	public static final Item NEONITE_BOW = new NeoniteBow("neonite_bow");
	public static final Item NEONITE_ARROW = new NeoniteArrow("neonite_arrow");
}
