package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzefw extends zzefx {

    /* renamed from: h */
    private static final SparseArray f33919h;

    /* renamed from: c */
    private final Context f33920c;

    /* renamed from: d */
    private final zzdcg f33921d;

    /* renamed from: e */
    private final TelephonyManager f33922e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final zzefo f33923f;

    /* renamed from: g */
    private int f33924g;

    static {
        SparseArray sparseArray = new SparseArray();
        f33919h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbhc.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbhc zzbhc = zzbhc.CONNECTING;
        sparseArray.put(ordinal, zzbhc);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbhc);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbhc);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbhc.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbhc zzbhc2 = zzbhc.DISCONNECTED;
        sparseArray.put(ordinal2, zzbhc2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbhc2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbhc2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbhc2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbhc2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbhc.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbhc);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbhc);
    }

    zzefw(Context context, zzdcg zzdcg, zzefo zzefo, zzefk zzefk, zzg zzg) {
        super(zzefk, zzg);
        this.f33920c = context;
        this.f33921d = zzdcg;
        this.f33923f = zzefo;
        this.f33922e = (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ zzbgt m48767b(zzefw zzefw, Bundle bundle) {
        zzbgm F = zzbgt.m43362F();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        int i3 = 2;
        if (i == -1) {
            zzefw.f33924g = 2;
        } else {
            zzefw.f33924g = 1;
            if (i == 0) {
                F.mo42594o(2);
            } else if (i != 1) {
                F.mo42594o(1);
            } else {
                F.mo42594o(3);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i3 = 3;
                    break;
                case 13:
                    i3 = 5;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            F.mo42593n(i3);
        }
        return (zzbgt) F.mo47341h();
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ zzbhc m48768c(zzefw zzefw, Bundle bundle) {
        return (zzbhc) f33919h.get(zzfeq.m50020a(zzfeq.m50020a(bundle, "device"), "network").getInt("active_network_state", -1), zzbhc.UNSPECIFIED);
    }

    /* renamed from: f */
    static /* bridge */ /* synthetic */ byte[] m48770f(zzefw zzefw, boolean z, ArrayList arrayList, zzbgt zzbgt, zzbhc zzbhc) {
        zzbgx N = zzbgy.m43390N();
        N.mo42606n(arrayList);
        boolean z2 = false;
        N.mo42601C(m48771g(Settings.Global.getInt(zzefw.f33920c.getContentResolver(), "airplane_mode_on", 0) != 0));
        N.mo42602D(zzt.m2906s().mo20252g(zzefw.f33920c, zzefw.f33922e));
        N.mo42611y(zzefw.f33923f.mo45262e());
        N.mo42610x(zzefw.f33923f.mo45259b());
        N.mo42607o(zzefw.f33923f.mo45258a());
        N.mo42608u(zzbhc);
        N.mo42609v(zzbgt);
        N.mo42603E(zzefw.f33924g);
        N.mo42604G(m48771g(z));
        N.mo42600B(zzefw.f33923f.mo45261d());
        N.mo42599A(zzt.m2889b().mo21950a());
        if (Settings.Global.getInt(zzefw.f33920c.getContentResolver(), "wifi_on", 0) != 0) {
            z2 = true;
        }
        N.mo42605H(m48771g(z2));
        return ((zzbgy) N.mo47341h()).mo47050p();
    }

    /* renamed from: g */
    private static final int m48771g(boolean z) {
        return z ? 2 : 1;
    }

    /* renamed from: e */
    public final void mo45269e(boolean z) {
        zzfzg.m51423r(this.f33921d.mo44551b(), new zzefv(this, z), zzchc.f28461f);
    }
}
