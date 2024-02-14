package com.google.android.gms.internal.mlkit_translate;

import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final /* synthetic */ class zzqr implements Iterable {

    /* renamed from: a */
    public final /* synthetic */ JSONObject f44481a;

    public /* synthetic */ zzqr(JSONObject jSONObject) {
        this.f44481a = jSONObject;
    }

    public final Iterator iterator() {
        JSONObject jSONObject = this.f44481a;
        long j = zzqt.f44490n;
        return jSONObject.keys();
    }
}
