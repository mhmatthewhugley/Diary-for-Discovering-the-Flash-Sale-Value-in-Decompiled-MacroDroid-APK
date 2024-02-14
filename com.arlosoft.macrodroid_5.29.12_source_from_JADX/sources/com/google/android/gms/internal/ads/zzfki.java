package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfki {

    /* renamed from: a */
    private final zzeko f35958a;

    /* renamed from: b */
    private final String f35959b;

    /* renamed from: c */
    private final String f35960c;

    /* renamed from: d */
    private final String f35961d;

    /* renamed from: e */
    private final Context f35962e;

    /* renamed from: f */
    private final zzfdx f35963f;

    /* renamed from: g */
    private final zzfdy f35964g;

    /* renamed from: h */
    private final Clock f35965h;

    /* renamed from: i */
    private final zzape f35966i;

    public zzfki(zzeko zzeko, zzcgv zzcgv, String str, String str2, Context context, @Nullable zzfdx zzfdx, @Nullable zzfdy zzfdy, Clock clock, zzape zzape) {
        this.f35958a = zzeko;
        this.f35959b = zzcgv.f28446a;
        this.f35960c = str;
        this.f35961d = str2;
        this.f35962e = context;
        this.f35963f = zzfdx;
        this.f35964g = zzfdy;
        this.f35965h = clock;
        this.f35966i = zzape;
    }

    /* renamed from: f */
    public static final List m50409f(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m50411h((String) it.next(), "@gw_mpe@", "2." + i2));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    @Nullable
    /* renamed from: g */
    public static String m50410g(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return zzcgo.m45209l() ? "fakeForAdDebugLog" : str;
    }

    /* renamed from: h */
    private static String m50411h(String str, String str2, @Nullable String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* renamed from: c */
    public final List mo45855c(zzfdw zzfdw, zzfdk zzfdk, List list) {
        return mo45856d(zzfdw, zzfdk, false, "", "", list);
    }

    /* renamed from: d */
    public final List mo45856d(zzfdw zzfdw, @Nullable zzfdk zzfdk, boolean z, @Nullable String str, @Nullable String str2, List list) {
        ArrayList arrayList = new ArrayList();
        String str3 = true != z ? "0" : "1";
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String h = m50411h(m50411h(m50411h((String) it.next(), "@gw_adlocid@", zzfdw.f35589a.f35583a.f35631f), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.f35959b);
            if (zzfdk != null) {
                h = zzcew.m45060c(m50411h(m50411h(m50411h(h, "@gw_qdata@", zzfdk.f35560z), "@gw_adnetid@", zzfdk.f35559y), "@gw_allocid@", zzfdk.f35558x), this.f35962e, zzfdk.f35516X);
            }
            String h2 = m50411h(m50411h(m50411h(h, "@gw_adnetstatus@", this.f35958a.mo45351f()), "@gw_seqnum@", this.f35960c), "@gw_sessid@", this.f35961d);
            boolean z2 = false;
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26889I2)).booleanValue() && !TextUtils.isEmpty(str)) {
                z2 = true;
            }
            boolean z3 = !TextUtils.isEmpty(str2);
            if (!z2) {
                if (z3) {
                    z3 = true;
                } else {
                    arrayList.add(h2);
                }
            }
            if (this.f35966i.mo41779f(Uri.parse(h2))) {
                Uri.Builder buildUpon = Uri.parse(h2).buildUpon();
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                h2 = buildUpon.build().toString();
            }
            arrayList.add(h2);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f A[LOOP:0: B:12:0x0059->B:14:0x005f, LOOP_END] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo45857e(com.google.android.gms.internal.ads.zzfdk r10, java.util.List r11, com.google.android.gms.internal.ads.zzcbs r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.util.Clock r1 = r9.f35965h
            long r1 = r1.mo21950a()
            java.lang.String r3 = r12.mo43291a()     // Catch:{ RemoteException -> 0x00a8 }
            int r12 = r12.zzb()     // Catch:{ RemoteException -> 0x00a8 }
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch:{ RemoteException -> 0x00a8 }
            com.google.android.gms.internal.ads.zzbiu r4 = com.google.android.gms.internal.ads.zzbjc.f26899J2
            com.google.android.gms.internal.ads.zzbja r5 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r4 = r5.mo42663b(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0035
            com.google.android.gms.internal.ads.zzfdy r4 = r9.f35964g
            if (r4 != 0) goto L_0x0032
            com.google.android.gms.internal.ads.zzfst r4 = com.google.android.gms.internal.ads.zzfst.m50930c()
            goto L_0x003b
        L_0x0032:
            com.google.android.gms.internal.ads.zzfdx r4 = r4.f35593a
            goto L_0x0037
        L_0x0035:
            com.google.android.gms.internal.ads.zzfdx r4 = r9.f35963f
        L_0x0037:
            com.google.android.gms.internal.ads.zzfst r4 = com.google.android.gms.internal.ads.zzfst.m50931d(r4)
        L_0x003b:
            com.google.android.gms.internal.ads.zzfkg r5 = com.google.android.gms.internal.ads.zzfkg.f35956a
            com.google.android.gms.internal.ads.zzfst r5 = r4.mo46157a(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.mo46158b(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzfkh r7 = com.google.android.gms.internal.ads.zzfkh.f35957a
            com.google.android.gms.internal.ads.zzfst r4 = r4.mo46157a(r7)
            java.lang.Object r4 = r4.mo46158b(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r11 = r11.iterator()
        L_0x0059:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x00a7
            java.lang.Object r6 = r11.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = m50411h(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = m50411h(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = m50411h(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = m50411h(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = m50411h(r6, r7, r12)
            java.lang.String r7 = r9.f35959b
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = m50411h(r6, r8, r7)
            android.content.Context r7 = r9.f35962e
            boolean r8 = r10.f35516X
            java.lang.String r6 = com.google.android.gms.internal.ads.zzcew.m45060c(r6, r7, r8)
            r0.add(r6)
            goto L_0x0059
        L_0x00a7:
            return r0
        L_0x00a8:
            r10 = move-exception
            java.lang.String r11 = "Unable to determine award type and amount."
            com.google.android.gms.internal.ads.zzcgp.m45227e(r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfki.mo45857e(com.google.android.gms.internal.ads.zzfdk, java.util.List, com.google.android.gms.internal.ads.zzcbs):java.util.List");
    }
}
