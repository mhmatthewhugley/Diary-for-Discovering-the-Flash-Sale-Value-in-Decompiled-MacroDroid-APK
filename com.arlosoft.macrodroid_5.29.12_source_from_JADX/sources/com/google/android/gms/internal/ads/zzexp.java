package com.google.android.gms.internal.ads;

import com.google.android.gms.common.GooglePlayServicesUtilLight;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzexp implements zzevd {

    /* renamed from: a */
    public static final /* synthetic */ zzexp f35148a = new zzexp();

    private /* synthetic */ zzexp() {
    }

    /* renamed from: d */
    public final void mo45422d(Object obj) {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", GooglePlayServicesUtilLight.f3065a);
        } catch (JSONException unused) {
        }
    }
}
