package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.tencent.soter.core.biometric.FaceManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdwk implements zzdfv, zzdeo, zzddd, zzddu, zza, zzdig {

    /* renamed from: a */
    private final zzbep f33264a;

    /* renamed from: c */
    private boolean f33265c = false;

    public zzdwk(zzbep zzbep, zzfbf zzfbf) {
        this.f33264a = zzbep;
        zzbep.mo42551c(2);
        if (zzfbf != null) {
            zzbep.mo42551c(FaceManager.FACE_ACQUIRED_GOOD);
        }
    }

    /* renamed from: E */
    public final void mo44534E(zzbfk zzbfk) {
        this.f33264a.mo42550b(new zzdwh(zzbfk));
        this.f33264a.mo42551c(FaceManager.FACE_ACQUIRED_TOO_SLOW);
    }

    /* renamed from: N0 */
    public final void mo44535N0(boolean z) {
        this.f33264a.mo42551c(true != z ? FaceManager.FACE_ACQUIRED_NO_FACE : FaceManager.FACE_ACQUIRED_NEAR_FACE);
    }

    /* renamed from: W */
    public final void mo44536W(zzbfk zzbfk) {
        this.f33264a.mo42550b(new zzdwi(zzbfk));
        this.f33264a.mo42551c(FaceManager.FACE_ACQUIRED_INSUFFICIENT);
    }

    /* renamed from: c0 */
    public final void mo44539c0(zzbfk zzbfk) {
        this.f33264a.mo42550b(new zzdwj(zzbfk));
        this.f33264a.mo42551c(FaceManager.FACE_ACQUIRED_IMAGER_DIRTY);
    }

    /* renamed from: d */
    public final void mo44540d() {
        this.f33264a.mo42551c(FaceManager.FACE_ACQUIRED_SHIFTING);
    }

    /* renamed from: g */
    public final void mo44489g(zzfdw zzfdw) {
        this.f33264a.mo42550b(new zzdwg(zzfdw));
    }

    /* renamed from: j */
    public final synchronized void mo44390j() {
        this.f33264a.mo42551c(6);
    }

    /* renamed from: n */
    public final void mo44393n() {
        this.f33264a.mo42551c(3);
    }

    public final synchronized void onAdClicked() {
        if (!this.f33265c) {
            this.f33264a.mo42551c(7);
            this.f33265c = true;
            return;
        }
        this.f33264a.mo42551c(8);
    }

    /* renamed from: r */
    public final void mo44382r(zze zze) {
        switch (zze.f1934a) {
            case 1:
                this.f33264a.mo42551c(101);
                return;
            case 2:
                this.f33264a.mo42551c(102);
                return;
            case 3:
                this.f33264a.mo42551c(5);
                return;
            case 4:
                this.f33264a.mo42551c(103);
                return;
            case 5:
                this.f33264a.mo42551c(104);
                return;
            case 6:
                this.f33264a.mo42551c(105);
                return;
            case 7:
                this.f33264a.mo42551c(106);
                return;
            default:
                this.f33264a.mo42551c(4);
                return;
        }
    }

    /* renamed from: u */
    public final void mo44490u(zzcbc zzcbc) {
    }

    /* renamed from: v0 */
    public final void mo44541v0(boolean z) {
        this.f33264a.mo42551c(true != z ? FaceManager.FACE_ACQUIRED_FAR_FACE : FaceManager.FACE_ACQUIRED_TOO_FAST);
    }
}
