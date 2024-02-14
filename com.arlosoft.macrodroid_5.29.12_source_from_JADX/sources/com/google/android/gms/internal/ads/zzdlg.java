package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdlg extends zzcze {

    /* renamed from: i */
    private final Context f32403i;

    /* renamed from: j */
    private final WeakReference f32404j;

    /* renamed from: k */
    private final zzdjw f32405k;

    /* renamed from: l */
    private final zzdmp f32406l;

    /* renamed from: m */
    private final zzczy f32407m;

    /* renamed from: n */
    private final zzfni f32408n;

    /* renamed from: o */
    private final zzddn f32409o;

    /* renamed from: p */
    private boolean f32410p = false;

    zzdlg(zzczd zzczd, Context context, zzcmp zzcmp, zzdjw zzdjw, zzdmp zzdmp, zzczy zzczy, zzfni zzfni, zzddn zzddn) {
        super(zzczd);
        this.f32403i = context;
        this.f32404j = new WeakReference(zzcmp);
        this.f32405k = zzdjw;
        this.f32406l = zzdmp;
        this.f32407m = zzczy;
        this.f32408n = zzfni;
        this.f32409o = zzddn;
    }

    public final void finalize() throws Throwable {
        try {
            zzcmp zzcmp = (zzcmp) this.f32404j.get();
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26952O5)).booleanValue()) {
                if (!this.f32410p && zzcmp != null) {
                    zzchc.f28460e.execute(new zzdlf(zzcmp));
                }
            } else if (zzcmp != null) {
                zzcmp.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: h */
    public final boolean mo44694h() {
        return this.f32407m.mo44516a();
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    /* renamed from: i */
    public final boolean mo44695i(boolean r5, android.app.Activity r6) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzdjw r0 = r4.f32405k
            r0.zzb()
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f27302y0
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r0 = r1.mo42663b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x004d
            com.google.android.gms.ads.internal.zzt.m2905r()
            android.content.Context r0 = r4.f32403i
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.m2752c(r0)
            if (r0 == 0) goto L_0x004d
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.zzcgp.m45229g(r5)
            com.google.android.gms.internal.ads.zzddn r5 = r4.f32409o
            r5.zzb()
            com.google.android.gms.internal.ads.zzbiu r5 = com.google.android.gms.internal.ads.zzbjc.f27312z0
            com.google.android.gms.internal.ads.zzbja r6 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r5 = r6.mo42663b(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0080
            com.google.android.gms.internal.ads.zzfni r5 = r4.f32408n
            com.google.android.gms.internal.ads.zzfdw r6 = r4.f31895a
            com.google.android.gms.internal.ads.zzfdv r6 = r6.f35590b
            com.google.android.gms.internal.ads.zzfdn r6 = r6.f35587b
            java.lang.String r6 = r6.f35566b
            r5.mo46006a(r6)
            goto L_0x0080
        L_0x004d:
            boolean r0 = r4.f32410p
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = "The interstitial ad has been showed."
            com.google.android.gms.internal.ads.zzcgp.m45229g(r0)
            com.google.android.gms.internal.ads.zzddn r0 = r4.f32409o
            r2 = 10
            r3 = 0
            com.google.android.gms.ads.internal.client.zze r2 = com.google.android.gms.internal.ads.zzffe.m50085d(r2, r3, r3)
            r0.mo44574r(r2)
        L_0x0062:
            boolean r0 = r4.f32410p
            if (r0 != 0) goto L_0x0080
            if (r6 != 0) goto L_0x006a
            android.content.Context r6 = r4.f32403i
        L_0x006a:
            com.google.android.gms.internal.ads.zzdmp r0 = r4.f32406l     // Catch:{ zzdmo -> 0x007a }
            com.google.android.gms.internal.ads.zzddn r2 = r4.f32409o     // Catch:{ zzdmo -> 0x007a }
            r0.mo44707a(r5, r6, r2)     // Catch:{ zzdmo -> 0x007a }
            com.google.android.gms.internal.ads.zzdjw r5 = r4.f32405k     // Catch:{ zzdmo -> 0x007a }
            r5.zza()     // Catch:{ zzdmo -> 0x007a }
            r5 = 1
            r4.f32410p = r5
            return r5
        L_0x007a:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzddn r6 = r4.f32409o
            r6.mo44575y0(r5)
        L_0x0080:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdlg.mo44695i(boolean, android.app.Activity):boolean");
    }
}
