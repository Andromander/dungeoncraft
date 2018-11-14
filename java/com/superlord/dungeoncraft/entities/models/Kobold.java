package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * Kobold - superlord9362
 * Created using Tabula 5.0.0
 */
public class Kobold extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer LLeg;
    public ModelRenderer RLeg;
    public ModelRenderer Head;
    public ModelRenderer RArm;
    public ModelRenderer LArm;
    public ModelRenderer shape10;
    public ModelRenderer shape7;
    public ModelRenderer shape8;
    public ModelRenderer shape8_1;
    public ModelRenderer shape11;

    public Kobold() {
        this.textureWidth = 200;
        this.textureHeight = 200;
        this.RLeg = new ModelRenderer(this, 48, 48);
        this.RLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
        this.RLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Head = new ModelRenderer(this, 32, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.LArm = new ModelRenderer(this, 48, 32);
        this.LArm.setRotationPoint(5.0F, 2.0F, -0.0F);
        this.LArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(LArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.LLeg = new ModelRenderer(this, 0, 48);
        this.LLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
        this.LLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.shape8 = new ModelRenderer(this, 0, 20);
        this.shape8.setRotationPoint(3.0F, -6.0F, 1.0F);
        this.shape8.addBox(0.0F, -4.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(shape8, -0.40980330836826856F, 0.0F, 0.4553564018453205F);
        this.shape8_1 = new ModelRenderer(this, 0, 20);
        this.shape8_1.setRotationPoint(-4.0F, -5.5F, 1.0F);
        this.shape8_1.addBox(0.0F, -4.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(shape8_1, -0.40980330836826856F, 0.0F, -0.4553564018453205F);
        this.shape7 = new ModelRenderer(this, 0, 0);
        this.shape7.setRotationPoint(0.0F, -4.0F, -4.0F);
        this.shape7.addBox(-2.0F, -1.0F, -4.5F, 4, 4, 5, 0.0F);
        this.setRotateAngle(shape7, 0.091106186954104F, 0.0F, 0.0F);
        this.shape11 = new ModelRenderer(this, 100, 4);
        this.shape11.setRotationPoint(0.0F, 0.0F, 8.5F);
        this.shape11.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 11, 0.0F);
        this.setRotateAngle(shape11, 0.136659280431156F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 19, 32);
        this.Body.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F);
        this.RArm = new ModelRenderer(this, 0, 32);
        this.RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.RArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(RArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.shape10 = new ModelRenderer(this, 80, 0);
        this.shape10.setRotationPoint(0.0F, 11.0F, 1.5F);
        this.shape10.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 9, 0.0F);
        this.setRotateAngle(shape10, -0.27314402793711257F, 0.0F, 0.0F);
        this.Body.addChild(this.RLeg);
        this.Body.addChild(this.Head);
        this.Body.addChild(this.LArm);
        this.Body.addChild(this.LLeg);
        this.Head.addChild(this.shape8);
        this.Head.addChild(this.shape8_1);
        this.Head.addChild(this.shape7);
        this.shape10.addChild(this.shape11);
        this.Body.addChild(this.RArm);
        this.Body.addChild(this.shape10);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GlStateManager.scale(0.5D, 0.5D, 0.5D);
        GlStateManager.translate(-this.Body.offsetX, -this.Body.offsetY, -this.Body.offsetZ);
        GlStateManager.translate(-this.Body.rotationPointX * f5, -this.Body.rotationPointY * f5, -this.Body.rotationPointZ * f5);
        this.Body.render(f5);
        GlStateManager.popMatrix();
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
