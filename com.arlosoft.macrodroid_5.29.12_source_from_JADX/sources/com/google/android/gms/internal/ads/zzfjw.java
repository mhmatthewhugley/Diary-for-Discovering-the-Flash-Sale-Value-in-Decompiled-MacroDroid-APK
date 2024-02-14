package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfjw implements Runnable {
    @VisibleForTesting
    @GuardedBy("CuiMonitor.class")

    /* renamed from: A */
    public static Boolean f35931A;

    /* renamed from: a */
    private final Context f35932a;

    /* renamed from: c */
    private final zzcgv f35933c;

    /* renamed from: d */
    private final zzfkb f35934d = zzfke.m50390G();

    /* renamed from: f */
    private String f35935f;

    /* renamed from: g */
    private int f35936g;

    /* renamed from: o */
    private final zzdvi f35937o;
    @GuardedBy("this")

    /* renamed from: p */
    private boolean f35938p = false;

    /* renamed from: s */
    private final zzeep f35939s;

    /* renamed from: z */
    private final zzcbo f35940z;

    public zzfjw(Context context, zzcgv zzcgv, zzdvi zzdvi, zzeep zzeep, zzcbo zzcbo, byte[] bArr) {
        this.f35932a = context;
        this.f35933c = zzcgv;
        this.f35937o = zzdvi;
        this.f35939s = zzeep;
        this.f35940z = zzcbo;
    }

    /* renamed from: a */
    public static synchronized boolean m50333a() {
        boolean booleanValue;
        synchronized (zzfjw.class) {
            if (f35931A == null) {
                if (!((Boolean) zzbkl.f27407b.mo42728e()).booleanValue()) {
                    f35931A = Boolean.FALSE;
                } else {
                    f35931A = Boolean.valueOf(Math.random() < ((Double) zzbkl.f27406a.mo42728e()).doubleValue());
                }
            }
            booleanValue = f35931A.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: c */
    private final synchronized void m50334c() {
        if (!this.f35938p) {
            this.f35938p = true;
            if (m50333a()) {
                zzt.m2905r();
                this.f35935f = zzs.m2738L(this.f35932a);
                this.f35936g = GoogleApiAvailabilityLight.m3542h().mo21171b(this.f35932a);
                long intValue = (long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f27299x7)).intValue();
                zzchc.f28459d.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: d */
    private final synchronized void m50335d() {
        try {
            new zzeeo(this.f35932a, this.f35933c.f28446a, this.f35940z, Binder.getCallingUid(), (byte[]) null).mo44523a(new zzeem((String) zzay.m1924c().mo42663b(zzbjc.f27289w7), 60000, new HashMap(), ((zzfke) this.f35934d.mo47341h()).mo47050p(), "application/x-protobuf"));
            this.f35934d.mo45852u();
        } catch (Exception e) {
            if (!(e instanceof zzebh) || ((zzebh) e).mo45152a() != 3) {
                zzt.m2904q().mo43502s(e, "CuiMonitor.sendCuiPing");
            } else {
                this.f35934d.mo45852u();
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo45831b(@Nullable zzfjn zzfjn) {
        if (!this.f35938p) {
            m50334c();
        }
        if (m50333a()) {
            if (zzfjn != null) {
                if (this.f35934d.mo45850n() < ((Integer) zzay.m1924c().mo42663b(zzbjc.f27309y7)).intValue()) {
                    zzfkb zzfkb = this.f35934d;
                    zzfkc F = zzfkd.m50386F();
                    zzfjy F2 = zzfjz.m50354F();
                    F2.mo45841K(zzfjn.mo45819h());
                    F2.mo45838G(zzfjn.mo45818g());
                    F2.mo45848x(zzfjn.mo45813b());
                    F2.mo45843M(3);
                    F2.mo45837E(this.f35933c.f28446a);
                    F2.mo45844n(this.f35935f);
                    F2.mo45835C(Build.VERSION.RELEASE);
                    F2.mo45839H(Build.VERSION.SDK_INT);
                    F2.mo45842L(zzfjn.mo45821j());
                    F2.mo45834B(zzfjn.mo45812a());
                    F2.mo45846u((long) this.f35936g);
                    F2.mo45840J(zzfjn.mo45820i());
                    F2.mo45845o(zzfjn.mo45814c());
                    F2.mo45847v(zzfjn.mo45815d());
                    F2.mo45849y(zzfjn.mo45816e());
                    F2.mo45833A(this.f35937o.mo45012c(zzfjn.mo45816e()));
                    F2.mo45836D(zzfjn.mo45817f());
                    F.mo45853n(F2);
                    zzfkb.mo45851o(F);
                }
            }
        }
    }

    public final synchronized void run() {
        if (m50333a()) {
            if (this.f35934d.mo45850n() != 0) {
                m50335d();
            }
        }
    }
}
