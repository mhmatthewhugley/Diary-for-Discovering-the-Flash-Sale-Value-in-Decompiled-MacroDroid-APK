package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.android.p023dx.rop.code.RegisterSpec;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.DeviceProperties;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfiz {

    /* renamed from: a */
    private final Context f35870a;

    /* renamed from: b */
    private final String f35871b;

    /* renamed from: c */
    private final String f35872c;

    public zzfiz(Context context, zzcgv zzcgv) {
        this.f35870a = context;
        this.f35871b = context.getPackageName();
        this.f35872c = zzcgv.f28446a;
    }

    /* renamed from: a */
    public final void mo45790a(Map map) {
        map.put("s", "gmob_sdk");
        map.put(RegisterSpec.PREFIX, ExifInterface.GPS_MEASUREMENT_3D);
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.m2905r();
        map.put("device", zzs.m2740N());
        map.put("app", this.f35871b);
        zzt.m2905r();
        String str = "0";
        map.put("is_lite_sdk", true != zzs.m2750a(this.f35870a) ? str : "1");
        List b = zzbjc.m43541b();
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27040X5)).booleanValue()) {
            b.addAll(zzt.m2904q().mo43494h().mo20365e().mo43479d());
        }
        map.put("e", TextUtils.join(",", b));
        map.put("sdkVersion", this.f35872c);
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26975Q8)).booleanValue()) {
            if (true == DeviceProperties.m4876b(this.f35870a)) {
                str = "1";
            }
            map.put("is_bstar", str);
        }
    }
}
