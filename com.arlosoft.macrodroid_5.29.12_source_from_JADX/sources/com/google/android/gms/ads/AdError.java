package com.google.android.gms.ads;

import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.p023dx.p024cf.attrib.AttCode;
import com.google.android.gms.ads.internal.client.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class AdError {

    /* renamed from: a */
    private final int f1657a;
    @NonNull

    /* renamed from: b */
    private final String f1658b;
    @NonNull

    /* renamed from: c */
    private final String f1659c;
    @Nullable

    /* renamed from: d */
    private final AdError f1660d;

    public AdError(int i, @NonNull String str, @NonNull String str2) {
        this(i, str, str2, (AdError) null);
    }

    public AdError(int i, @NonNull String str, @NonNull String str2, @Nullable AdError adError) {
        this.f1657a = i;
        this.f1658b = str;
        this.f1659c = str2;
        this.f1660d = adError;
    }

    /* renamed from: a */
    public int mo19645a() {
        return this.f1657a;
    }

    @NonNull
    /* renamed from: b */
    public String mo19646b() {
        return this.f1659c;
    }

    @NonNull
    /* renamed from: c */
    public String mo19647c() {
        return this.f1658b;
    }

    @NonNull
    /* renamed from: d */
    public final zze mo19648d() {
        zze zze;
        if (this.f1660d == null) {
            zze = null;
        } else {
            AdError adError = this.f1660d;
            zze = new zze(adError.f1657a, adError.f1658b, adError.f1659c, (zze) null, (IBinder) null);
        }
        return new zze(this.f1657a, this.f1658b, this.f1659c, zze, (IBinder) null);
    }

    @NonNull
    /* renamed from: e */
    public JSONObject mo19649e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AttCode.ATTRIBUTE_NAME, this.f1657a);
        jSONObject.put("Message", this.f1658b);
        jSONObject.put("Domain", this.f1659c);
        AdError adError = this.f1660d;
        if (adError == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", adError.mo19649e());
        }
        return jSONObject;
    }

    @NonNull
    public String toString() {
        try {
            return mo19649e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
