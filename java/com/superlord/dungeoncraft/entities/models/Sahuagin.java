package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Sahuagin - CodaBear123
 * Created using Tabula 5.0.0
 */
public class Sahuagin extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer LLegBase;
    public ModelRenderer RLegBase;
    public ModelRenderer Head;
    public ModelRenderer RArmBase;
    public ModelRenderer LArmBase;
    public ModelRenderer TailBase;
    public ModelRenderer LLeg;
    public ModelRenderer LFoot;
    public ModelRenderer RLeg;
    public ModelRenderer RFoot;
    public ModelRenderer Nose;
    public ModelRenderer LHeadFin;
    public ModelRenderer RHeadFin;
    public ModelRenderer HeadFin;
    public ModelRenderer RArm;
    public ModelRenderer RShoulder;
    public ModelRenderer RArmFin;
    public ModelRenderer RShoulderSpike;
    public ModelRenderer LArm;
    public ModelRenderer LShoulder;
    public ModelRenderer LArmFin;
    public ModelRenderer LShoulderSpike;
    public ModelRenderer Tail1;
    public ModelRenderer Tail1Fin;
    public ModelRenderer Tail2;
    public ModelRenderer Tail2Fin;
    public ModelRenderer TailFin;

    public Sahuagin() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.LLegBase = new ModelRenderer(this, 24, 0);
        this.LLegBase.setRotationPoint(1.9F, 12.0F, 0.1F);
        this.LLegBase.addBox(-2.0F, 0.0F, -2.0F, 4, 5, 4, 0.0F);
        this.Nose = new ModelRenderer(this, 20, 0);
        this.Nose.setRotationPoint(0.0F, -3.0F, -3.0F);
        this.Nose.addBox(-1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Nose, -0.7853981633974483F, 0.0F, 0.0F);
        this.LArmBase = new ModelRenderer(this, 98, 0);
        this.LArmBase.setRotationPoint(5.0F, 2.0F, -0.0F);
        this.LArmBase.addBox(-1.0F, -2.0F, -2.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(LArmBase, 0.0F, 0.0F, -0.10000736613927509F);
        this.TailBase = new ModelRenderer(this, 24, 9);
        this.TailBase.setRotationPoint(0.0F, 4.0F, 2.0F);
        this.TailBase.addBox(-3.0F, -4.5F, -1.5F, 6, 9, 3, 0.0F);
        this.setRotateAngle(TailBase, 0.2617993877991494F, 0.0F, 0.0F);
        this.Tail1 = new ModelRenderer(this, 110, 16);
        this.Tail1.setRotationPoint(0.0F, 4.0F, -0.3F);
        this.Tail1.addBox(-2.5F, 0.0F, -1.5F, 5, 9, 3, 0.0F);
        this.setRotateAngle(Tail1, 0.20943951023931953F, 0.0F, 0.0F);
        this.LShoulder = new ModelRenderer(this, 0, 16);
        this.LShoulder.setRotationPoint(1.7F, -2.4F, 0.0F);
        this.LShoulder.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F);
        this.Tail1Fin = new ModelRenderer(this, 38, 55);
        this.Tail1Fin.setRotationPoint(0.0F, 4.0F, 1.2F);
        this.Tail1Fin.addBox(0.0F, -4.0F, 0.0F, 0, 8, 6, 0.0F);
        this.RShoulder = new ModelRenderer(this, 52, 14);
        this.RShoulder.setRotationPoint(-1.7F, -2.4F, 0.0F);
        this.RShoulder.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F);
        this.RArm = new ModelRenderer(this, 78, 9);
        this.RArm.setRotationPoint(-1.0F, 3.0F, 0.0F);
        this.RArm.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
        this.Tail2 = new ModelRenderer(this, 76, 20);
        this.Tail2.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.Tail2.addBox(-2.0F, 0.0F, -1.5F, 4, 9, 3, 0.0F);
        this.setRotateAngle(Tail2, 0.47123889803846897F, 0.0F, 0.0F);
        this.RShoulderSpike = new ModelRenderer(this, 3, 53);
        this.RShoulderSpike.setRotationPoint(-1.7F, -0.9F, 0.0F);
        this.RShoulderSpike.addBox(-8.0F, -4.0F, 0.0F, 8, 8, 0, 0.0F);
        this.LArmFin = new ModelRenderer(this, 8, 39);
        this.LArmFin.setRotationPoint(2.0F, 3.0F, 0.0F);
        this.LArmFin.addBox(0.0F, -3.5F, 0.0F, 5, 7, 0, 0.0F);
        this.LLeg = new ModelRenderer(this, 110, 5);
        this.LLeg.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.LLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
        this.Tail2Fin = new ModelRenderer(this, 38, 46);
        this.Tail2Fin.setRotationPoint(0.0F, 4.0F, 1.2F);
        this.Tail2Fin.addBox(0.0F, -4.0F, 0.0F, 0, 8, 5, 0.0F);
        this.LArm = new ModelRenderer(this, 94, 9);
        this.LArm.setRotationPoint(1.0F, 3.0F, 0.0F);
        this.LArm.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
        this.RArmBase = new ModelRenderer(this, 82, 0);
        this.RArmBase.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.RArmBase.addBox(-3.0F, -2.0F, -2.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(RArmBase, 0.0F, 0.0F, 0.10000736613927509F);
        this.RFoot = new ModelRenderer(this, 0, 30);
        this.RFoot.setRotationPoint(-1.0F, 7.0F, 2.0F);
        this.RFoot.addBox(-2.0F, 0.0F, -8.0F, 5, 0, 8, 0.0F);
        this.setRotateAngle(RFoot, 0.0F, -0.0017453292519943296F, 0.0F);
        this.HeadFin = new ModelRenderer(this, 38, 20);
        this.HeadFin.setRotationPoint(1.0F, -4.8F, 0.2F);
        this.HeadFin.addBox(0.0F, -6.0F, -3.0F, 0, 10, 10, 0.0F);
        this.LShoulderSpike = new ModelRenderer(this, 3, 53);
        this.LShoulderSpike.setRotationPoint(1.7F, -0.9F, 0.0F);
        this.LShoulderSpike.addBox(0.0F, -4.0F, 0.0F, 8, 8, 0, 0.0F);
        this.RHeadFin = new ModelRenderer(this, 8, 47);
        this.RHeadFin.setRotationPoint(-1.0F, -2.8F, -2.8F);
        this.RHeadFin.addBox(-4.0F, -2.0F, 0.0F, 4, 4, 0, 0.0F);
        this.setRotateAngle(RHeadFin, 0.0F, -0.2617993877991494F, 0.0F);
        this.RLeg = new ModelRenderer(this, 42, 9);
        this.RLeg.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.RLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
        this.LFoot = new ModelRenderer(this, 0, 30);
        this.LFoot.setRotationPoint(0.0F, 7.0F, 2.0F);
        this.LFoot.addBox(-2.0F, 0.0F, -8.0F, 5, 0, 8, 0.0F);
        this.setRotateAngle(LFoot, 0.0F, -0.0017453292519943296F, 0.0F);
        this.TailFin = new ModelRenderer(this, 38, 35);
        this.TailFin.setRotationPoint(0.0F, 8.0F, 1.0F);
        this.TailFin.addBox(0.0F, 0.0F, -3.5F, 0, 7, 7, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F);
        this.Head = new ModelRenderer(this, 56, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-3.5F, -6.0F, -3.0F, 7, 6, 6, 0.0F);
        this.setRotateAngle(Head, 0.3490658503988659F, 0.0F, 0.0F);
        this.RArmFin = new ModelRenderer(this, 8, 39);
        this.RArmFin.setRotationPoint(-2.0F, 3.0F, 0.0F);
        this.RArmFin.addBox(-5.0F, -3.5F, 0.0F, 5, 7, 0, 0.0F);
        this.LHeadFin = new ModelRenderer(this, 8, 47);
        this.LHeadFin.setRotationPoint(1.0F, -2.8F, -2.8F);
        this.LHeadFin.addBox(0.0F, -2.0F, 0.0F, 4, 4, 0, 0.0F);
        this.setRotateAngle(LHeadFin, 0.0F, 0.2617993877991494F, 0.0F);
        this.RLegBase = new ModelRenderer(this, 40, 0);
        this.RLegBase.setRotationPoint(-1.9F, 12.0F, 0.1F);
        this.RLegBase.addBox(-2.0F, 0.0F, -2.0F, 4, 5, 4, 0.0F);
        this.Body.addChild(this.LLegBase);
        this.Head.addChild(this.Nose);
        this.Body.addChild(this.LArmBase);
        this.Body.addChild(this.TailBase);
        this.TailBase.addChild(this.Tail1);
        this.LArmBase.addChild(this.LShoulder);
        this.Tail1.addChild(this.Tail1Fin);
        this.RArmBase.addChild(this.RShoulder);
        this.RArmBase.addChild(this.RArm);
        this.Tail1.addChild(this.Tail2);
        this.RShoulder.addChild(this.RShoulderSpike);
        this.LArm.addChild(this.LArmFin);
        this.LLegBase.addChild(this.LLeg);
        this.Tail2.addChild(this.Tail2Fin);
        this.LArmBase.addChild(this.LArm);
        this.Body.addChild(this.RArmBase);
        this.RLeg.addChild(this.RFoot);
        this.Head.addChild(this.HeadFin);
        this.LShoulder.addChild(this.LShoulderSpike);
        this.Head.addChild(this.RHeadFin);
        this.RLegBase.addChild(this.RLeg);
        this.LLeg.addChild(this.LFoot);
        this.Tail2.addChild(this.TailFin);
        this.Body.addChild(this.Head);
        this.RArm.addChild(this.RArmFin);
        this.Head.addChild(this.LHeadFin);
        this.Body.addChild(this.RLegBase);
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
    	this.LLegBase.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RLegBase.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.LArmBase.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RArmBase.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
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
