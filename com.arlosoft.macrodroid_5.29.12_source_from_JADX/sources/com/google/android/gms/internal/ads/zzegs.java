package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzbr;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzegs implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ zzdxq f33970a;

    /* renamed from: c */
    public final /* synthetic */ Activity f33971c;

    /* renamed from: d */
    public final /* synthetic */ zzfir f33972d;

    /* renamed from: f */
    public final /* synthetic */ zzego f33973f;

    /* renamed from: g */
    public final /* synthetic */ String f33974g;

    /* renamed from: o */
    public final /* synthetic */ zzbr f33975o;

    /* renamed from: p */
    public final /* synthetic */ String f33976p;

    /* renamed from: s */
    public final /* synthetic */ Resources f33977s;

    /* renamed from: z */
    public final /* synthetic */ zzl f33978z;

    public /* synthetic */ zzegs(zzdxq zzdxq, Activity activity, zzfir zzfir, zzego zzego, String str, zzbr zzbr, String str2, Resources resources, zzl zzl) {
        this.f33970a = zzdxq;
        this.f33971c = activity;
        this.f33972d = zzfir;
        this.f33973f = zzego;
        this.f33974g = str;
        this.f33975o = zzbr;
        this.f33976p = str2;
        this.f33977s = resources;
        this.f33978z = zzl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
        if (r0.zzf(com.google.android.gms.dynamic.ObjectWrapper.m5051g8(r10), r14, r13) == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r19, int r20) {
        /*
            r18 = this;
            r1 = r18
            com.google.android.gms.internal.ads.zzdxq r9 = r1.f33970a
            android.app.Activity r10 = r1.f33971c
            com.google.android.gms.internal.ads.zzfir r11 = r1.f33972d
            com.google.android.gms.internal.ads.zzego r12 = r1.f33973f
            java.lang.String r13 = r1.f33974g
            com.google.android.gms.ads.internal.util.zzbr r0 = r1.f33975o
            java.lang.String r14 = r1.f33976p
            android.content.res.Resources r15 = r1.f33977s
            com.google.android.gms.ads.internal.overlay.zzl r8 = r1.f33978z
            if (r9 == 0) goto L_0x0034
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.String r2 = "dialog_action"
            java.lang.String r3 = "confirm"
            r7.put(r2, r3)
            java.lang.String r16 = "dialog_click"
            r2 = r10
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r17 = r7
            r7 = r16
            r1 = r8
            r8 = r17
            com.google.android.gms.internal.ads.zzegw.m48814Lb(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0035
        L_0x0034:
            r1 = r8
        L_0x0035:
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.m5051g8(r10)     // Catch:{ RemoteException -> 0x0040 }
            boolean r0 = r0.zzf(r2, r14, r13)     // Catch:{ RemoteException -> 0x0040 }
            if (r0 != 0) goto L_0x0055
            goto L_0x0046
        L_0x0040:
            r0 = move-exception
            java.lang.String r2 = "Failed to schedule offline notification poster."
            com.google.android.gms.internal.ads.zzcgp.m45227e(r2, r0)
        L_0x0046:
            r12.mo45278e(r13)
            if (r9 == 0) goto L_0x0055
            java.lang.String r7 = "offline_notification_worker_not_scheduled"
            r2 = r10
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            com.google.android.gms.internal.ads.zzegw.m48813Kb(r2, r3, r4, r5, r6, r7)
        L_0x0055:
            com.google.android.gms.ads.internal.zzt.m2905r()
            android.app.AlertDialog$Builder r0 = com.google.android.gms.ads.internal.util.zzs.m2756g(r10)
            if (r15 != 0) goto L_0x0061
            java.lang.String r2 = "You'll get a notification with the link when you're back online"
            goto L_0x0067
        L_0x0061:
            int r2 = com.google.android.gms.ads.impl.C1721R.string.offline_opt_in_confirmation
            java.lang.String r2 = r15.getString(r2)
        L_0x0067:
            android.app.AlertDialog$Builder r2 = r0.setMessage(r2)
            com.google.android.gms.internal.ads.zzegr r3 = new com.google.android.gms.internal.ads.zzegr
            r3.<init>(r1)
            r2.setOnCancelListener(r3)
            android.app.AlertDialog r0 = r0.create()
            r0.show()
            java.util.Timer r2 = new java.util.Timer
            r2.<init>()
            com.google.android.gms.internal.ads.zzegv r3 = new com.google.android.gms.internal.ads.zzegv
            r3.<init>(r0, r2, r1)
            r0 = 3000(0xbb8, double:1.482E-320)
            r2.schedule(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegs.onClick(android.content.DialogInterface, int):void");
    }
}
