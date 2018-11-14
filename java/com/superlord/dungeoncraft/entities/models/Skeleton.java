package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Skeleton - superlord9362
 * Created using Tabula 5.0.0
 */
public class Skeleton extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer LLeg;
    public ModelRenderer Head;
    public ModelRenderer LArm;
    public ModelRenderer RArm;
    public ModelRenderer RLeg;

    public Skeleton() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.RArm = new ModelRenderer(this, 40, 16);
        this.RArm.mirror = true;
        this.RArm.setRotationPoint(5.0F, 2.0F, -0.0F);
        this.RArm.addBox(-1.0F, -2.0F, -1.0F, 2, 12, 2, 0.0F);
        this.setRotateAngle(RArm, 0.0F, 0.0F, -0.091106186954104F);
        this.RLeg = new ModelRenderer(this, 0, 16);
        this.RLeg.mirror = true;
        this.RLeg.setRotationPoint(2.0F, 12.0F, 0.1F);
        this.RLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
        this.LArm = new ModelRenderer(this, 40, 16);
        this.LArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.LArm.addBox(-1.0F, -2.0F, -1.0F, 2, 12, 2, 0.0F);
        this.setRotateAngle(LArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.LLeg = new ModelRenderer(this, 0, 16);
        this.LLeg.setRotationPoint(-2.0F, 12.0F, 0.1F);
        this.LLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.Body = new ModelRenderer(this, 16, 16);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.Body.addChild(this.RArm);
        this.Body.addChild(this.RLeg);
        this.Body.addChild(this.LArm);
        this.Body.addChild(this.LLeg);
        this.Body.addChild(this.Head);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body.render(f5);
    }
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
    	float XAngle = headPitch / 57.29578F;
    	float YAngle = netHeadYaw / 57.29578F;
    	this.Head.rotateAngleX= (0.2617794F + XAngle);
    	this.Head.rotateAngleY= YAngle;
    	this.LLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.LArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
