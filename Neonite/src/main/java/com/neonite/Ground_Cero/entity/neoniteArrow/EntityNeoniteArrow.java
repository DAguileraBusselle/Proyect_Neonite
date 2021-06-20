package com.neonite.Ground_Cero.entity.neoniteArrow;

import java.util.Random;

import com.neonite.Ground_Cero.init.ItemInit;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class EntityNeoniteArrow extends EntityArrow {

	
	public EntityNeoniteArrow(World worldIn) {
		super(worldIn);
		
	}
		
	
	public EntityNeoniteArrow(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
		
	}
	
	
	public EntityNeoniteArrow(World worldIn, EntityLivingBase shooter) {
		super(worldIn, shooter);
		
	}
	@Override
	protected ItemStack getArrowStack() {
	
		return new ItemStack(ItemInit.NEONITE_ARROW);	
		
	}
	
	@Override
	protected void arrowHit(EntityLivingBase living) {
		super.arrowHit(living);
		
		living.setFire(5);
		
		

	}
	
	@Override
	public void onUpdate() {
		super.onUpdate();
		
		if (this.world.isRemote) {
			if (this.inGround) {
				if (this.timeInGround % 5 == 0) {
					this.spawnParticles(1);
				}
			}
			else {
				this.spawnParticles(2);
			}
		}
	}
	
	private void spawnParticles(int particleCount) {
		Random rd = new Random();
		
		int i = rd.nextInt(15);
		
		double d0 = (double)(i >> 16 & 255) / 255.0D;
		double d1 = (double)(i >> 8 & 255) / 255.0D;
		double d2 = (double)(i >> 0 & 255) / 255.0D;
		
		for (int n = 0; n < particleCount; n++) {
			this.world.spawnParticle(EnumParticleTypes.DRAGON_BREATH, this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + this.rand.nextDouble() * (double)this.height, this.posZ + (this.rand.nextDouble() - 0.5D) * (double)this.width, d0, d1, d2);
			
		}
	}
}
