package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbuh {

    /* renamed from: a */
    private static final Charset f27783a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final zzbue f27784b = new zzbug();

    /* renamed from: c */
    public static final zzbuc f27785c = zzbuf.f27782a;

    /* renamed from: a */
    static /* synthetic */ InputStream m44147a(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f27783a));
    }
}
