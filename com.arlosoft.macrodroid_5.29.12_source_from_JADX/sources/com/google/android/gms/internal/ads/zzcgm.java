package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.Base64Utils;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zzcgm implements zzcgn {

    /* renamed from: a */
    public final /* synthetic */ byte[] f28436a;

    public /* synthetic */ zzcgm(byte[] bArr) {
        this.f28436a = bArr;
    }

    /* renamed from: a */
    public final void mo43555a(JsonWriter jsonWriter) {
        byte[] bArr = this.f28436a;
        int i = zzcgo.f28442g;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String c = Base64Utils.m4853c(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(c);
        } else {
            String e = zzcgi.m45176e(c);
            if (e != null) {
                jsonWriter.name("bodydigest").value(e);
            }
        }
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }
}
