package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * Goblin - superlord9362
 * Created using Tabula 5.0.0
 */
public class Goblin extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer head;
    public ModelRenderer LLeg1;
    public ModelRenderer LArm1;
    public ModelRenderer RArm1;
    public ModelRenderer RLeg1;
    public ModelRenderer LEar;
    public ModelRenderer REar;

    public Goblin() {
        this.textureWidth = 200;
        this.textureHeight = 200;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(-0.5F, 1.0F, 0.0F);
        this.head.addBox(-3.0F, -8.0F, -3.0F, 7, 7, 6, 0.0F);
        this.LEar = new ModelRenderer(this, 50, 0);
        this.LEar.setRotationPoint(-3.0F, -5.0F, 0.0F);
        this.LEar.addBox(-1.0F, -4.0F, 0.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(LEar, -0.5918411493512771F, 0.5009094953223726F, -0.9560913642424937F);
        this.REar = new ModelRenderer(this, 50, 0);
        this.REar.setRotationPoint(4.0F, -5.0F, 0.0F);
        this.REar.addBox(-1.0F, -4.0F, 0.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(REar, -0.5918411493512771F, -0.5009094953223726F, 0.9560913642424937F);
        this.Body = new ModelRenderer(this, 16, 16);
        this.Body.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 10, 4, 0.0F);
        this.RLeg1 = new ModelRenderer(this, 16, 48);
        this.RLeg1.setRotationPoint(1.9F, 10.0F, 0.1F);
        this.RLeg1.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
        this.LLeg1 = new ModelRenderer(this, 0, 16);
        this.LLeg1.setRotationPoint(-1.9F, 10.0F, 0.1F);
        this.LLeg1.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(LLeg1, 0.0F, 0.0F, 0.005235987755982988F);
        this.RArm1 = new ModelRenderer(this, 32, 48);
        this.RArm1.setRotationPoint(5.0F, 2.0F, -0.0F);
        this.RArm1.addBox(-1.0F, -2.0F, -2.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(RArm1, 0.0F, 0.0F, -0.10000736613927509F);
        this.LArm1 = new ModelRenderer(this, 40, 16);
        this.LArm1.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.LArm1.addBox(-3.0F, -2.0F, -2.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(LArm1, 0.0F, 0.0F, 0.10000736613927509F);
        this.Body.addChild(this.head);
        this.head.addChild(this.LEar);
        this.head.addChild(this.REar);
        this.Body.addChild(this.RLeg1);
        this.Body.addChild(this.LLeg1);
        this.Body.addChild(this.RArm1);
        this.Body.addChild(this.LArm1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GlStateManager.scale(0.6D, 0.6D, 0.6D);
        GlStateManager.translate(-this.Body.offsetX, -this.Body.offsetY, -this.Body.offsetZ);
        GlStateManager.translate(-this.Body.rotationPointX * f5, -this.Body.rotationPointY * f5, -this.Body.rotationPointZ * f5);
        this.Body.render(f5);
        GlStateManager.popMatrix();
    }

    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
    	float XAngle = headPitch / 57.29578F;
    	float YAngle = netHeadYaw / 57.29578F;
    	this.head.rotateAngleX= (0.2617794F + XAngle);
    	this.head.rotateAngleY= YAngle;
    	this.LLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.LArm1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RArm1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
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
