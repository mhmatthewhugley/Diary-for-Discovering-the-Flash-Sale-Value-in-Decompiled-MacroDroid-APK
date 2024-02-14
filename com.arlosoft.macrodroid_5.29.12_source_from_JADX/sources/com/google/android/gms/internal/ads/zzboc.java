package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzboc extends UnifiedNativeAd {

    /* renamed from: a */
    private final zzbob f27574a;

    /* renamed from: b */
    private final List f27575b = new ArrayList();

    /* renamed from: c */
    private final zzbmf f27576c;

    /* renamed from: d */
    private final VideoController f27577d = new VideoController();

    /* renamed from: e */
    private final NativeAd.AdChoicesInfo f27578e;

    /* renamed from: f */
    private final List f27579f = new ArrayList();

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050 A[Catch:{ RemoteException -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00af A[Catch:{ RemoteException -> 0x00bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0027 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzboc(com.google.android.gms.internal.ads.zzbob r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f27575b = r1
            com.google.android.gms.ads.VideoController r1 = new com.google.android.gms.ads.VideoController
            r1.<init>()
            r5.f27577d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f27579f = r1
            r5.f27574a = r6
            r1 = 0
            java.util.List r6 = r6.mo42842u()     // Catch:{ RemoteException -> 0x005b }
            if (r6 == 0) goto L_0x005f
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x005b }
        L_0x0027:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x005b }
            if (r2 == 0) goto L_0x005f
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x005b }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x005b }
            if (r3 == 0) goto L_0x004d
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x005b }
            if (r2 != 0) goto L_0x003a
            goto L_0x004d
        L_0x003a:
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch:{ RemoteException -> 0x005b }
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzbme     // Catch:{ RemoteException -> 0x005b }
            if (r4 == 0) goto L_0x0047
            com.google.android.gms.internal.ads.zzbme r3 = (com.google.android.gms.internal.ads.zzbme) r3     // Catch:{ RemoteException -> 0x005b }
            goto L_0x004e
        L_0x0047:
            com.google.android.gms.internal.ads.zzbmc r3 = new com.google.android.gms.internal.ads.zzbmc     // Catch:{ RemoteException -> 0x005b }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x005b }
            goto L_0x004e
        L_0x004d:
            r3 = r1
        L_0x004e:
            if (r3 == 0) goto L_0x0027
            java.util.List r2 = r5.f27575b     // Catch:{ RemoteException -> 0x005b }
            com.google.android.gms.internal.ads.zzbmf r4 = new com.google.android.gms.internal.ads.zzbmf     // Catch:{ RemoteException -> 0x005b }
            r4.<init>(r3)     // Catch:{ RemoteException -> 0x005b }
            r2.add(r4)     // Catch:{ RemoteException -> 0x005b }
            goto L_0x0027
        L_0x005b:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzcgp.m45227e(r0, r6)
        L_0x005f:
            com.google.android.gms.internal.ads.zzbob r6 = r5.f27574a     // Catch:{ RemoteException -> 0x008e }
            java.util.List r6 = r6.mo42843w()     // Catch:{ RemoteException -> 0x008e }
            if (r6 == 0) goto L_0x0092
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x008e }
        L_0x006b:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x008e }
            if (r2 == 0) goto L_0x0092
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x008e }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x008e }
            if (r3 == 0) goto L_0x0080
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x008e }
            com.google.android.gms.ads.internal.client.zzcu r2 = com.google.android.gms.ads.internal.client.zzct.m2122Jb(r2)     // Catch:{ RemoteException -> 0x008e }
            goto L_0x0081
        L_0x0080:
            r2 = r1
        L_0x0081:
            if (r2 == 0) goto L_0x006b
            java.util.List r3 = r5.f27579f     // Catch:{ RemoteException -> 0x008e }
            com.google.android.gms.ads.internal.client.zzcv r4 = new com.google.android.gms.ads.internal.client.zzcv     // Catch:{ RemoteException -> 0x008e }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x008e }
            r3.add(r4)     // Catch:{ RemoteException -> 0x008e }
            goto L_0x006b
        L_0x008e:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzcgp.m45227e(r0, r6)
        L_0x0092:
            com.google.android.gms.internal.ads.zzbob r6 = r5.f27574a     // Catch:{ RemoteException -> 0x00a0 }
            com.google.android.gms.internal.ads.zzbme r6 = r6.mo42833i()     // Catch:{ RemoteException -> 0x00a0 }
            if (r6 == 0) goto L_0x00a4
            com.google.android.gms.internal.ads.zzbmf r2 = new com.google.android.gms.internal.ads.zzbmf     // Catch:{ RemoteException -> 0x00a0 }
            r2.<init>(r6)     // Catch:{ RemoteException -> 0x00a0 }
            goto L_0x00a5
        L_0x00a0:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzcgp.m45227e(r0, r6)
        L_0x00a4:
            r2 = r1
        L_0x00a5:
            r5.f27576c = r2
            com.google.android.gms.internal.ads.zzbob r6 = r5.f27574a     // Catch:{ RemoteException -> 0x00bc }
            com.google.android.gms.internal.ads.zzblw r6 = r6.mo42832g()     // Catch:{ RemoteException -> 0x00bc }
            if (r6 == 0) goto L_0x00c0
            com.google.android.gms.internal.ads.zzblx r6 = new com.google.android.gms.internal.ads.zzblx     // Catch:{ RemoteException -> 0x00bc }
            com.google.android.gms.internal.ads.zzbob r2 = r5.f27574a     // Catch:{ RemoteException -> 0x00bc }
            com.google.android.gms.internal.ads.zzblw r2 = r2.mo42832g()     // Catch:{ RemoteException -> 0x00bc }
            r6.<init>(r2)     // Catch:{ RemoteException -> 0x00bc }
            r1 = r6
            goto L_0x00c0
        L_0x00bc:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzcgp.m45227e(r0, r6)
        L_0x00c0:
            r5.f27578e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzboc.<init>(com.google.android.gms.internal.ads.zzbob):void");
    }

    @Nullable
    /* renamed from: a */
    public final String mo19815a() {
        try {
            return this.f27574a.mo42838n();
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
            return null;
        }
    }

    @Nullable
    /* renamed from: b */
    public final String mo19816b() {
        try {
            return this.f27574a.mo42836l();
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
            return null;
        }
    }

    @Nullable
    /* renamed from: c */
    public final String mo19817c() {
        try {
            return this.f27574a.mo42837m();
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
            return null;
        }
    }

    @Nullable
    /* renamed from: d */
    public final String mo19818d() {
        try {
            return this.f27574a.mo42841s();
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
            return null;
        }
    }

    /* renamed from: e */
    public final NativeAd.Image mo19819e() {
        return this.f27576c;
    }

    /* renamed from: f */
    public final List<NativeAd.Image> mo19820f() {
        return this.f27575b;
    }

    @Nullable
    /* renamed from: g */
    public final String mo19821g() {
        try {
            return this.f27574a.mo42839p();
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
            return null;
        }
    }

    @Nullable
    /* renamed from: h */
    public final Double mo19822h() {
        try {
            double b = this.f27574a.mo42829b();
            if (b == -1.0d) {
                return null;
            }
            return Double.valueOf(b);
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
            return null;
        }
    }

    @Nullable
    /* renamed from: i */
    public final String mo19823i() {
        try {
            return this.f27574a.mo42840r();
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
            return null;
        }
    }

    /* renamed from: j */
    public final VideoController mo19824j() {
        try {
            if (this.f27574a.mo42830e() != null) {
                this.f27577d.mo19754c(this.f27574a.mo42830e());
            }
        } catch (RemoteException e) {
            zzcgp.m45227e("Exception occurred while getting video controller", e);
        }
        return this.f27577d;
    }

    @Nullable
    /* renamed from: k */
    public final Object mo19825k() {
        try {
            IObjectWrapper j = this.f27574a.mo42834j();
            if (j != null) {
                return ObjectWrapper.m5050A1(j);
            }
            return null;
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
            return null;
        }
    }
}
