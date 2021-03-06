package com.superlord.dungeoncraft.entities;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntitySahuagin extends EntityMob
{

    public EntitySahuagin(World worldIn) {
        super(worldIn);
        this.setSize(0.6F, 0.95F);
    }

     protected void initEntityAI()
        {
            this.tasks.addTask(0, new EntityAISwimming(this));
            this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
            this.tasks.addTask(7, new EntityAIWanderAvoidWater(this, 1.0D));
            this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
            this.tasks.addTask(8, new EntityAILookIdle(this));
            this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.0F, true));
            this.applyEntityAI();
        }

        protected void applyEntityAI()
        {
            this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
            this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityVillager.class, false));
            this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityIronGolem.class, true));
        }
        
        protected void applyEntityAttributes()
        {
            super.applyEntityAttributes();
            this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
            this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23000000417232513D);
            this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
            this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        }
        
        protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty)
        {
            this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.GOLDEN_SWORD));
        }
 
}