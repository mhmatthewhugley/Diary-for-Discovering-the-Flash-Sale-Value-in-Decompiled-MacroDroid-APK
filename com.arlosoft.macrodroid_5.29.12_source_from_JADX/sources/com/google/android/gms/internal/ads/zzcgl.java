package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zzcgl implements zzcgn {

    /* renamed from: a */
    public final /* synthetic */ String f28432a;

    /* renamed from: b */
    public final /* synthetic */ String f28433b;

    /* renamed from: c */
    public final /* synthetic */ Map f28434c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f28435d;

    public /* synthetic */ zzcgl(String str, String str2, Map map, byte[] bArr) {
        this.f28432a = str;
        this.f28433b = str2;
        this.f28434c = map;
        this.f28435d = bArr;
    }

    /* renamed from: a */
    public final void mo43555a(JsonWriter jsonWriter) {
        zzcgo.m45204a(this.f28432a, this.f28433b, this.f28434c, this.f28435d, jsonWriter);
    }
}
