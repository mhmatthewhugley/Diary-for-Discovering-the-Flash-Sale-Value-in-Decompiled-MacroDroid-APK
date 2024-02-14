package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbu;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfdn {

    /* renamed from: a */
    public final List f35565a;

    /* renamed from: b */
    public final String f35566b;

    /* renamed from: c */
    public final int f35567c;

    /* renamed from: d */
    public final String f35568d;

    /* renamed from: e */
    public final int f35569e;

    /* renamed from: f */
    public final long f35570f;

    /* renamed from: g */
    public final boolean f35571g;

    /* renamed from: h */
    public final String f35572h;
    @Nullable

    /* renamed from: i */
    public final zzfdm f35573i;

    /* renamed from: j */
    public final Bundle f35574j;

    /* renamed from: k */
    public final String f35575k;

    /* renamed from: l */
    public final String f35576l;

    zzfdn(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        int i = 0;
        String str = "";
        String str2 = str;
        String str3 = str2;
        long j = 0;
        zzfdm zzfdm = null;
        boolean z = false;
        String str4 = str3;
        String str5 = str4;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = zzbu.m2594d(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str4 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str5 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j = jsonReader.nextLong();
            } else {
                String str6 = str3;
                if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27119f7)).booleanValue() || !"public_error".equals(nextName) || jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
                    JsonReader jsonReader2 = jsonReader;
                    if ("bidding_data".equals(nextName)) {
                        str = jsonReader.nextString();
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27002T5)).booleanValue()) {
                            try {
                                Bundle a = zzbu.m2591a(zzbu.m2598h(jsonReader));
                                if (a != null) {
                                    bundle = a;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27042X7)).booleanValue()) {
                            str3 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(nextName)) {
                        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27042X7)).booleanValue()) {
                            str2 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                } else {
                    zzfdm = new zzfdm(jsonReader);
                }
                str3 = str6;
            }
            JsonReader jsonReader3 = jsonReader;
        }
        JsonReader jsonReader4 = jsonReader;
        jsonReader.endObject();
        this.f35565a = emptyList;
        this.f35567c = i;
        this.f35566b = str4;
        this.f35568d = str5;
        this.f35569e = i2;
        this.f35570f = j;
        this.f35573i = zzfdm;
        this.f35571g = z;
        this.f35572h = str;
        this.f35574j = bundle;
        this.f35575k = str2;
        this.f35576l = str3;
    }
}
