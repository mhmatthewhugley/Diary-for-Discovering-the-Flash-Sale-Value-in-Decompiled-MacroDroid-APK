package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.apache.http.client.methods.HttpHead;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcbm extends zzcbn {

    /* renamed from: a */
    private final Object f28196a = new Object();

    /* renamed from: b */
    private final Context f28197b;
    @Nullable

    /* renamed from: c */
    private SharedPreferences f28198c;

    /* renamed from: d */
    private final zzbua f28199d;

    public zzcbm(Context context, zzbua zzbua) {
        this.f28197b = context.getApplicationContext();
        this.f28199d = zzbua;
    }

    /* renamed from: c */
    public static JSONObject m44804c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzcgv.m45239l2().f28446a);
            jSONObject.put("mf", zzbks.f27463a.mo42728e());
            jSONObject.put("cl", "474357726");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", HttpHead.METHOD_NAME);
            jSONObject.put("admob_module_version", GooglePlayServicesUtilLight.f3065a);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.m5095c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", GooglePlayServicesUtilLight.f3065a);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final zzfzp mo43289a() {
        synchronized (this.f28196a) {
            if (this.f28198c == null) {
                this.f28198c = this.f28197b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (zzt.m2889b().mo21950a() - this.f28198c.getLong("js_last_update", 0) < ((Long) zzbks.f27464b.mo42728e()).longValue()) {
            return zzfzg.m51414i((Object) null);
        }
        return zzfzg.m51418m(this.f28199d.mo42995c(m44804c(this.f28197b)), new zzcbl(this), zzchc.f28461f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Void mo43290b(JSONObject jSONObject) {
        zzbjc.m43543d(this.f28197b, 1, jSONObject);
        this.f28198c.edit().putLong("js_last_update", zzt.m2889b().mo21950a()).apply();
        return null;
    }
}
