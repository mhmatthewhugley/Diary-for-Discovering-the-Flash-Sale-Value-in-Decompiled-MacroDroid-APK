package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzerz implements zzeve {

    /* renamed from: a */
    private final Context f34816a;

    /* renamed from: b */
    private final zzfzq f34817b;

    zzerz(Context context, zzfzq zzfzq) {
        this.f34816a = context;
        this.f34817b = zzfzq;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzery mo45451a() throws Exception {
        String str;
        Bundle bundle;
        zzt.m2905r();
        Context context = this.f34816a;
        String str2 = "";
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27117f5)).booleanValue()) {
            str = str2;
        } else {
            str = context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", str2);
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27137h5)).booleanValue()) {
            str2 = this.f34816a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", str2);
        }
        zzt.m2905r();
        Context context2 = this.f34816a;
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27127g5)).booleanValue()) {
            bundle = null;
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str3 = strArr[i];
                if (defaultSharedPreferences.contains(str3)) {
                    bundle.putString(str3, defaultSharedPreferences.getString(str3, (String) null));
                }
            }
        }
        return new zzery(str, str2, bundle, (zzerx) null);
    }

    public final int zza() {
        return 18;
    }

    public final zzfzp zzb() {
        return this.f34817b.mo46579F(new zzerw(this));
    }
}
