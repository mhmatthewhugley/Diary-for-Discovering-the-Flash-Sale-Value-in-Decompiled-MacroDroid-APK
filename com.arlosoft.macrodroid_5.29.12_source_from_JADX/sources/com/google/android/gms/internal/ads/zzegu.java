package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzegu implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ zzego f33985a;

    /* renamed from: c */
    public final /* synthetic */ String f33986c;

    /* renamed from: d */
    public final /* synthetic */ zzdxq f33987d;

    /* renamed from: f */
    public final /* synthetic */ Activity f33988f;

    /* renamed from: g */
    public final /* synthetic */ zzfir f33989g;

    /* renamed from: o */
    public final /* synthetic */ zzl f33990o;

    public /* synthetic */ zzegu(zzego zzego, String str, zzdxq zzdxq, Activity activity, zzfir zzfir, zzl zzl) {
        this.f33985a = zzego;
        this.f33986c = str;
        this.f33987d = zzdxq;
        this.f33988f = activity;
        this.f33989g = zzfir;
        this.f33990o = zzl;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        zzego zzego = this.f33985a;
        String str = this.f33986c;
        zzdxq zzdxq = this.f33987d;
        Activity activity = this.f33988f;
        zzfir zzfir = this.f33989g;
        zzl zzl = this.f33990o;
        zzego.mo45278e(str);
        if (zzdxq != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("dialog_action", "dismiss");
            zzegw.m48814Lb(activity, zzdxq, zzfir, zzego, str, "dialog_click", hashMap);
        }
        if (zzl != null) {
            zzl.zzb();
        }
    }
}
