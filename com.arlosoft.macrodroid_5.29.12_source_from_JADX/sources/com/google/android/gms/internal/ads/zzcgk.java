package com.google.android.gms.internal.ads;

import android.util.JsonWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zzcgk implements zzcgn {

    /* renamed from: a */
    public final /* synthetic */ String f28431a;

    public /* synthetic */ zzcgk(String str) {
        this.f28431a = str;
    }

    /* renamed from: a */
    public final void mo43555a(JsonWriter jsonWriter) {
        String str = this.f28431a;
        int i = zzcgo.f28442g;
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}
