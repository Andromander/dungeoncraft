package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * Ogre - superlord9362
 * Created using Tabula 5.0.0
 */
public class Ogre extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer LLeg;
    public ModelRenderer RLeg;
    public ModelRenderer Head;
    public ModelRenderer RArm;
    public ModelRenderer LArm;
    public ModelRenderer Stomach;
    public ModelRenderer Mouth;
    public ModelRenderer Tooth1;
    public ModelRenderer Tooth2;

    public Ogre() {
        this.textureWidth = 200;
        this.textureHeight = 200;
        this.Tooth2 = new ModelRenderer(this, 50, 70);
        this.Tooth2.setRotationPoint(0.5F, -0.3F, 0.4F);
        this.Tooth2.addBox(0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Tooth2, 0.40980330836826856F, 0.0F, 0.0F);
        this.Tooth1 = new ModelRenderer(this, 50, 70);
        this.Tooth1.setRotationPoint(-1.5F, -0.3F, 0.4F);
        this.Tooth1.addBox(0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Tooth1, 0.40980330836826856F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 16, 32);
        this.Body.setRotationPoint(0.0F, -19.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F);
        this.LLeg = new ModelRenderer(this, 0, 48);
        this.LLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
        this.LLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.RLeg = new ModelRenderer(this, 0, 32);
        this.RLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
        this.RLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.LArm = new ModelRenderer(this, 48, 48);
        this.LArm.setRotationPoint(5.0F, 2.0F, -0.0F);
        this.LArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(LArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.Head = new ModelRenderer(this, 32, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.RArm = new ModelRenderer(this, 40, 32);
        this.RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.RArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(RArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.Mouth = new ModelRenderer(this, 90, 0);
        this.Mouth.setRotationPoint(0.0F, -3.0F, -5.0F);
        this.Mouth.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 2, 0.0F);
        this.setRotateAngle(Mouth, 0.136659280431156F, 0.0F, 0.0F);
        this.Stomach = new ModelRenderer(this, 50, 90);
        this.Stomach.setRotationPoint(0.0F, 10.0F, -2.5F);
        this.Stomach.addBox(-4.0F, -6.0F, -1.0F, 8, 8, 2, 0.0F);
        this.Mouth.addChild(this.Tooth2);
        this.Mouth.addChild(this.Tooth1);
        this.Body.addChild(this.LLeg);
        this.Body.addChild(this.RLeg);
        this.Body.addChild(this.LArm);
        this.Body.addChild(this.Head);
        this.Body.addChild(this.RArm);
        this.Head.addChild(this.Mouth);
        this.Body.addChild(this.Stomach);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GlStateManager.scale(1.8D, 1.8D, 1.8D);
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
