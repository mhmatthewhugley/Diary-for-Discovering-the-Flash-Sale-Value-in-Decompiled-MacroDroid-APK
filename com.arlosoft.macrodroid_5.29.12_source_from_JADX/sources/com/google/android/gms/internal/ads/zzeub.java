package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzeub implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f34919a;

    public /* synthetic */ zzeub(List list) {
        this.f34919a = list;
    }

    public final Object call() {
        List<zzfzp> list = this.f34919a;
        JSONArray jSONArray = new JSONArray();
        for (zzfzp zzfzp : list) {
            if (((JSONObject) zzfzp.get()) != null) {
                jSONArray.put(zzfzp.get());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new zzeuf(jSONArray.toString());
    }
}
