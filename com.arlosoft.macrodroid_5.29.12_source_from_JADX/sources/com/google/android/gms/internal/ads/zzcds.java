package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcds implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final Context f28257a;

    /* renamed from: b */
    private final SharedPreferences f28258b;

    /* renamed from: c */
    private final zzg f28259c;

    /* renamed from: d */
    private final zzceu f28260d;

    /* renamed from: e */
    private String f28261e = "-1";

    /* renamed from: f */
    private int f28262f = -1;

    zzcds(Context context, zzg zzg, zzceu zzceu) {
        this.f28258b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f28259c = zzg;
        this.f28257a = context;
        this.f28260d = zzceu;
    }

    /* renamed from: b */
    private final void m44989b(String str, int i) {
        Context context;
        boolean z = false;
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27252t0)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z = true;
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27232r0)).booleanValue()) {
            this.f28259c.mo20384o0(z);
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27187m5)).booleanValue() && z && (context = this.f28257a) != null) {
                context.deleteDatabase("OfflineUpload.db");
            }
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27182m0)).booleanValue()) {
            this.f28260d.mo43448y();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43404a() {
        this.f28258b.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.f28258b, "gad_has_consent_for_cookies");
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27272v0)).booleanValue()) {
            onSharedPreferenceChanged(this.f28258b, "IABTCF_gdprApplies");
            onSharedPreferenceChanged(this.f28258b, "IABTCF_TCString");
            return;
        }
        onSharedPreferenceChanged(this.f28258b, "IABTCF_PurposeConsents");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f27272v0
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r0 = r1.mo42663b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "-1"
            java.lang.String r2 = "IABTCF_PurposeConsents"
            r3 = 1
            r4 = -1
            java.lang.String r5 = "gad_has_consent_for_cookies"
            if (r0 == 0) goto L_0x007d
            boolean r0 = com.google.android.gms.internal.ads.zzcdr.m44988a(r10, r5)
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.zzbiu r10 = com.google.android.gms.internal.ads.zzbjc.f27252t0
            com.google.android.gms.internal.ads.zzbja r0 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r10 = r0.mo42663b(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x0033
            return
        L_0x0033:
            int r9 = r9.getInt(r5, r4)
            com.google.android.gms.ads.internal.util.zzg r10 = r8.f28259c
            int r10 = r10.zzb()
            if (r9 == r10) goto L_0x0044
            com.google.android.gms.ads.internal.util.zzg r10 = r8.f28259c
            r10.mo20384o0(r3)
        L_0x0044:
            com.google.android.gms.ads.internal.util.zzg r10 = r8.f28259c
            r10.mo20360b0(r9)
            return
        L_0x004a:
            java.lang.String r0 = "IABTCF_gdprApplies"
            boolean r0 = com.google.android.gms.internal.ads.zzcdr.m44988a(r10, r0)
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = "IABTCF_TCString"
            boolean r0 = com.google.android.gms.internal.ads.zzcdr.m44988a(r10, r0)
            if (r0 != 0) goto L_0x0060
            boolean r0 = com.google.android.gms.internal.ads.zzcdr.m44988a(r10, r2)
            if (r0 == 0) goto L_0x00df
        L_0x0060:
            java.lang.String r9 = r9.getString(r10, r1)
            if (r9 == 0) goto L_0x0077
            com.google.android.gms.ads.internal.util.zzg r0 = r8.f28259c
            java.lang.String r0 = r0.mo20356Z(r10)
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0077
            com.google.android.gms.ads.internal.util.zzg r0 = r8.f28259c
            r0.mo20384o0(r3)
        L_0x0077:
            com.google.android.gms.ads.internal.util.zzg r0 = r8.f28259c
            r0.mo20376j0(r10, r9)
            return
        L_0x007d:
            java.lang.String r0 = r9.getString(r2, r1)
            int r9 = r9.getInt(r5, r4)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r6 = r10.hashCode()
            r7 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            if (r6 == r7) goto L_0x00a0
            r2 = -527267622(0xffffffffe09288da, float:-8.447143E19)
            if (r6 == r2) goto L_0x0098
            goto L_0x00a8
        L_0x0098:
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L_0x00a8
            r10 = 1
            goto L_0x00a9
        L_0x00a0:
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x00a8
            r10 = 0
            goto L_0x00a9
        L_0x00a8:
            r10 = -1
        L_0x00a9:
            if (r10 == 0) goto L_0x00cc
            if (r10 == r3) goto L_0x00ae
            return
        L_0x00ae:
            com.google.android.gms.internal.ads.zzbiu r10 = com.google.android.gms.internal.ads.zzbjc.f27252t0
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r10 = r1.mo42663b(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00df
            if (r9 == r4) goto L_0x00df
            int r10 = r8.f28262f
            if (r10 == r9) goto L_0x00df
            r8.f28262f = r9
            r8.m44989b(r0, r9)
            return
        L_0x00cc:
            boolean r10 = r0.equals(r1)
            if (r10 != 0) goto L_0x00df
            java.lang.String r10 = r8.f28261e
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x00df
            r8.f28261e = r0
            r8.m44989b(r0, r9)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcds.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }
}
