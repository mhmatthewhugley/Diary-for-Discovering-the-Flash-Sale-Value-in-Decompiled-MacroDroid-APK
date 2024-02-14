package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzbpb implements zzbpu {

    /* renamed from: a */
    public static final /* synthetic */ zzbpb f27601a = new zzbpb();

    private /* synthetic */ zzbpb() {
    }

    /* renamed from: a */
    public final void mo42867a(Object obj, Map map) {
        zzcnq zzcnq = (zzcnq) obj;
        zzbpu zzbpu = zzbpt.f27603a;
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27089c7)).booleanValue()) {
            zzcgp.m45229g("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            zzcgp.m45229g("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(zzcnq.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        zze.m2645k("/canOpenApp;" + str + ";" + valueOf);
        ((zzbsn) zzcnq).mo42954y("openableApp", hashMap);
    }
}
