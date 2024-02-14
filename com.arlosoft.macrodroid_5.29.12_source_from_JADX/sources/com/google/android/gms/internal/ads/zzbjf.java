package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.android.p023dx.rop.code.RegisterSpec;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.DeviceProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbjf {

    /* renamed from: a */
    private final String f27321a = ((String) zzbkm.f27412b.mo42728e());

    /* renamed from: b */
    private final Map f27322b;

    /* renamed from: c */
    private final Context f27323c;

    /* renamed from: d */
    private final String f27324d;

    public zzbjf(Context context, String str) {
        String str2;
        this.f27323c = context;
        this.f27324d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f27322b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put(RegisterSpec.PREFIX, ExifInterface.GPS_MEASUREMENT_3D);
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        zzt.m2905r();
        linkedHashMap.put("device", zzs.m2740N());
        if (context.getApplicationContext() != null) {
            str2 = context.getApplicationContext().getPackageName();
        } else {
            str2 = context.getPackageName();
        }
        linkedHashMap.put("app", str2);
        zzt.m2905r();
        String str3 = "0";
        linkedHashMap.put("is_lite_sdk", true != zzs.m2750a(context) ? str3 : "1");
        Future b = zzt.m2902o().mo43288b(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzcbh) b.get()).f28183k));
            linkedHashMap.put("network_fine", Integer.toString(((zzcbh) b.get()).f28184l));
        } catch (Exception e) {
            zzt.m2904q().mo43503t(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26975Q8)).booleanValue()) {
            this.f27322b.put("is_bstar", true == DeviceProperties.m4876b(context) ? "1" : str3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo42668a() {
        return this.f27323c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo42669b() {
        return this.f27324d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo42670c() {
        return this.f27321a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Map mo42671d() {
        return this.f27322b;
    }
}
