package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * Lamia - superlord9362
 * Created using Tabula 5.0.0
 */
public class Lamia extends ModelBase {
    public ModelRenderer LBody;
    public ModelRenderer LHips;
    public ModelRenderer FRLeg1;
    public ModelRenderer FLLeg1;
    public ModelRenderer Body;
    public ModelRenderer RRLeg1;
    public ModelRenderer Tail1;
    public ModelRenderer RLLeg1;
    public ModelRenderer RRLeg2;
    public ModelRenderer Tail2;
    public ModelRenderer Tail3;
    public ModelRenderer RLLeg2;
    public ModelRenderer FRLeg2;
    public ModelRenderer FLLeg2;
    public ModelRenderer Head;
    public ModelRenderer RArm;
    public ModelRenderer LArm;

    public Lamia() {
        this.textureWidth = 200;
        this.textureHeight = 200;
        this.FRLeg2 = new ModelRenderer(this, 0, 189);
        this.FRLeg2.setRotationPoint(0.0F, 4.7F, 0.0F);
        this.FRLeg2.addBox(-1.5F, -1.5F, 0.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(FRLeg2, -0.15812683023068624F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 16, 32);
        this.Body.setRotationPoint(0.0F, -15.0F, 1.5F);
        this.Body.addBox(-3.5F, 0.0F, -2.0F, 7, 12, 4, 0.0F);
        this.setRotateAngle(Body, 0.045553093477052F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 32, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.FLLeg2 = new ModelRenderer(this, 0, 189);
        this.FLLeg2.setRotationPoint(0.0F, 4.7F, 0.0F);
        this.FLLeg2.addBox(-1.5F, -1.5F, 0.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(FLLeg2, -0.15812683023068624F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 30, 16);
        this.Tail2.setRotationPoint(0.0F, 3.0F, -0.3F);
        this.Tail2.addBox(-1.0F, -0.6F, -0.1F, 2, 6, 2, 0.0F);
        this.setRotateAngle(Tail2, -0.27314402793711257F, 0.0F, 0.0F);
        this.LBody = new ModelRenderer(this, 0, 104);
        this.LBody.setRotationPoint(0.0F, 10.8F, -14.0F);
        this.LBody.addBox(-3.5F, -4.0F, 0.0F, 7, 8, 14, 0.0F);
        this.setRotateAngle(LBody, -0.045553093477052F, 0.0F, 0.0F);
        this.LHips = new ModelRenderer(this, 0, 133);
        this.LHips.setRotationPoint(0.0F, 0.0F, 14.0F);
        this.LHips.addBox(-3.0F, -4.0F, -0.5F, 6, 7, 9, 0.0F);
        this.setRotateAngle(LHips, 0.045553093477052F, 0.0F, 0.0F);
        this.RRLeg1 = new ModelRenderer(this, 0, 156);
        this.RRLeg1.setRotationPoint(2.5F, 0.0F, 3.5F);
        this.RRLeg1.addBox(-2.0F, -3.0F, -1.0F, 3, 8, 5, 0.0F);
        this.FLLeg1 = new ModelRenderer(this, 0, 175);
        this.FLLeg1.setRotationPoint(-2.0F, 2.0F, 2.0F);
        this.FLLeg1.addBox(-2.0F, 0.0F, 0.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(FLLeg1, 0.2033308578573394F, 0.0F, 0.0F);
        this.Tail1 = new ModelRenderer(this, 30, 16);
        this.Tail1.setRotationPoint(0.0F, -0.5F, 8.0F);
        this.Tail1.addBox(-1.0F, -3.0F, -0.3F, 2, 6, 2, 0.0F);
        this.setRotateAngle(Tail1, 0.4745550236172582F, 0.0F, 0.0F);
        this.RLLeg2 = new ModelRenderer(this, 0, 189);
        this.RLLeg2.setRotationPoint(-0.5F, 5.0F, 1.5F);
        this.RLLeg2.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 3, 0.0F);
        this.LArm = new ModelRenderer(this, 48, 48);
        this.LArm.setRotationPoint(4.5F, 2.0F, -0.0F);
        this.LArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(LArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.RArm = new ModelRenderer(this, 40, 32);
        this.RArm.setRotationPoint(-4.5F, 2.0F, 0.0F);
        this.RArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(RArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.RLLeg1 = new ModelRenderer(this, 0, 156);
        this.RLLeg1.setRotationPoint(-1.5F, 0.0F, 3.5F);
        this.RLLeg1.addBox(-2.0F, -3.0F, -1.0F, 3, 8, 5, 0.0F);
        this.Tail3 = new ModelRenderer(this, 32, 55);
        this.Tail3.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.Tail3.addBox(-1.0F, 0.0F, -0.1F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Tail3, 0.24853488548399255F, 0.0F, 0.0F);
        this.FRLeg1 = new ModelRenderer(this, 0, 175);
        this.FRLeg1.setRotationPoint(3.0F, 2.0F, 2.0F);
        this.FRLeg1.addBox(-2.0F, 0.0F, 0.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(FRLeg1, 0.2033308578573394F, 0.0F, 0.0F);
        this.RRLeg2 = new ModelRenderer(this, 0, 189);
        this.RRLeg2.setRotationPoint(-0.5F, 5.0F, 1.5F);
        this.RRLeg2.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 3, 0.0F);
        this.FRLeg1.addChild(this.FRLeg2);
        this.LBody.addChild(this.Body);
        this.Body.addChild(this.Head);
        this.FLLeg1.addChild(this.FLLeg2);
        this.Tail1.addChild(this.Tail2);
        this.LBody.addChild(this.LHips);
        this.LHips.addChild(this.RRLeg1);
        this.LBody.addChild(this.FLLeg1);
        this.LHips.addChild(this.Tail1);
        this.RLLeg1.addChild(this.RLLeg2);
        this.Body.addChild(this.LArm);
        this.Body.addChild(this.RArm);
        this.LHips.addChild(this.RLLeg1);
        this.Tail2.addChild(this.Tail3);
        this.LBody.addChild(this.FRLeg1);
        this.RRLeg1.addChild(this.RRLeg2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.LBody.offsetX, this.LBody.offsetY, this.LBody.offsetZ);
        GlStateManager.translate(this.LBody.rotationPointX * f5, this.LBody.rotationPointY * f5, this.LBody.rotationPointZ * f5);
        GlStateManager.scale(1.1D, 1.1D, 1.1D);
        GlStateManager.translate(-this.LBody.offsetX, -this.LBody.offsetY, -this.LBody.offsetZ);
        GlStateManager.translate(-this.LBody.rotationPointX * f5, -this.LBody.rotationPointY * f5, -this.LBody.rotationPointZ * f5);
        this.LBody.render(f5);
        GlStateManager.popMatrix();
    }
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
    	float XAngle = headPitch / 57.29578F;
    	float YAngle = netHeadYaw / 57.29578F;
    	this.Head.rotateAngleX= (0.2617794F + XAngle);
    	this.Head.rotateAngleY= YAngle;
    	this.RLLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RRLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.FRLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.FLLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
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
