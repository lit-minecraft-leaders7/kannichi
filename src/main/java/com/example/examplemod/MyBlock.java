package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MyBlock extends Block {
    public MyBlock() {


        super(Material.rock);

        setCreativeTab(CreativeTabs.tabBlock);

        setBlockTextureName(ExampleMod.MODID+":"+"myblock");

        setHardness(10.0f);

        setResistance(30.0f);
    }
}
