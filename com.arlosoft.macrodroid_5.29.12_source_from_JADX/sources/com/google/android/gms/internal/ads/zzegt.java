package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzegt implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ zzego f33979a;

    /* renamed from: c */
    public final /* synthetic */ String f33980c;

    /* renamed from: d */
    public final /* synthetic */ zzdxq f33981d;

    /* renamed from: f */
    public final /* synthetic */ Activity f33982f;

    /* renamed from: g */
    public final /* synthetic */ zzfir f33983g;

    /* renamed from: o */
    public final /* synthetic */ zzl f33984o;

    public /* synthetic */ zzegt(zzego zzego, String str, zzdxq zzdxq, Activity activity, zzfir zzfir, zzl zzl) {
        this.f33979a = zzego;
        this.f33980c = str;
        this.f33981d = zzdxq;
        this.f33982f = activity;
        this.f33983g = zzfir;
        this.f33984o = zzl;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzego zzego = this.f33979a;
        String str = this.f33980c;
        zzdxq zzdxq = this.f33981d;
        Activity activity = this.f33982f;
        zzfir zzfir = this.f33983g;
        zzl zzl = this.f33984o;
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
