package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzboo implements zzbpu {

    /* renamed from: a */
    private final zzbop f27591a;

    public zzboo(zzbop zzbop) {
        this.f27591a = zzbop;
    }

    /* renamed from: a */
    public final void mo42867a(Object obj, Map map) {
        if (this.f27591a != null) {
            String str = (String) map.get("name");
            if (str == null) {
                zzcgp.m45228f("Ad metadata with no name parameter.");
                str = "";
            }
            Bundle bundle = null;
            if (map.containsKey("info")) {
                try {
                    bundle = zzbu.m2591a(new JSONObject((String) map.get("info")));
                } catch (JSONException e) {
                    zzcgp.m45227e("Failed to convert ad metadata to JSON.", e);
                }
            }
            if (bundle == null) {
                zzcgp.m45226d("Failed to convert ad metadata to Bundle.");
            } else {
                this.f27591a.mo42868h1(str, bundle);
            }
        }
    }
}
