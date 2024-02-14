package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcix {

    /* renamed from: a */
    public final boolean f28582a;

    /* renamed from: b */
    public final int f28583b;

    /* renamed from: c */
    public final int f28584c;

    /* renamed from: d */
    public final int f28585d;

    /* renamed from: e */
    public final String f28586e;

    /* renamed from: f */
    public final int f28587f;

    /* renamed from: g */
    public final int f28588g;

    /* renamed from: h */
    public final int f28589h;

    /* renamed from: i */
    public final int f28590i;

    /* renamed from: j */
    public final boolean f28591j;

    /* renamed from: k */
    public final int f28592k;

    /* renamed from: l */
    public final boolean f28593l;

    /* renamed from: m */
    public final boolean f28594m;

    /* renamed from: n */
    public final boolean f28595n;

    /* renamed from: o */
    public final boolean f28596o;

    /* renamed from: p */
    public final long f28597p;

    /* renamed from: q */
    public final long f28598q;

    public zzcix(String str) {
        String str2;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f28582a = m45433a(jSONObject, "aggressive_media_codec_release", zzbjc.f26866G);
        this.f28583b = m45434b(jSONObject, "byte_buffer_precache_limit", zzbjc.f27151j);
        this.f28584c = m45434b(jSONObject, "exo_cache_buffer_size", zzbjc.f27261u);
        this.f28585d = m45434b(jSONObject, "exo_connect_timeout_millis", zzbjc.f27111f);
        zzbiu zzbiu = zzbjc.f27101e;
        if (jSONObject != null) {
            try {
                str2 = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.f28586e = str2;
            this.f28587f = m45434b(jSONObject, "exo_read_timeout_millis", zzbjc.f27121g);
            this.f28588g = m45434b(jSONObject, "load_check_interval_bytes", zzbjc.f27131h);
            this.f28589h = m45434b(jSONObject, "player_precache_limit", zzbjc.f27141i);
            this.f28590i = m45434b(jSONObject, "socket_receive_buffer_size", zzbjc.f27161k);
            this.f28591j = m45433a(jSONObject, "use_cache_data_source", zzbjc.f27255t3);
            this.f28592k = m45434b(jSONObject, "min_retry_count", zzbjc.f27171l);
            this.f28593l = m45433a(jSONObject, "treat_load_exception_as_non_fatal", zzbjc.f27201o);
            this.f28594m = m45433a(jSONObject, "using_official_simple_exo_player", zzbjc.f26848E1);
            this.f28595n = m45433a(jSONObject, "enable_multiple_video_playback", zzbjc.f26858F1);
            this.f28596o = m45433a(jSONObject, "use_range_http_data_source", zzbjc.f26878H1);
            this.f28597p = m45435c(jSONObject, "range_http_data_source_high_water_mark", zzbjc.f26888I1);
            this.f28598q = m45435c(jSONObject, "range_http_data_source_low_water_mark", zzbjc.f26898J1);
        }
        str2 = (String) zzay.m1924c().mo42663b(zzbiu);
        this.f28586e = str2;
        this.f28587f = m45434b(jSONObject, "exo_read_timeout_millis", zzbjc.f27121g);
        this.f28588g = m45434b(jSONObject, "load_check_interval_bytes", zzbjc.f27131h);
        this.f28589h = m45434b(jSONObject, "player_precache_limit", zzbjc.f27141i);
        this.f28590i = m45434b(jSONObject, "socket_receive_buffer_size", zzbjc.f27161k);
        this.f28591j = m45433a(jSONObject, "use_cache_data_source", zzbjc.f27255t3);
        this.f28592k = m45434b(jSONObject, "min_retry_count", zzbjc.f27171l);
        this.f28593l = m45433a(jSONObject, "treat_load_exception_as_non_fatal", zzbjc.f27201o);
        this.f28594m = m45433a(jSONObject, "using_official_simple_exo_player", zzbjc.f26848E1);
        this.f28595n = m45433a(jSONObject, "enable_multiple_video_playback", zzbjc.f26858F1);
        this.f28596o = m45433a(jSONObject, "use_range_http_data_source", zzbjc.f26878H1);
        this.f28597p = m45435c(jSONObject, "range_http_data_source_high_water_mark", zzbjc.f26888I1);
        this.f28598q = m45435c(jSONObject, "range_http_data_source_low_water_mark", zzbjc.f26898J1);
    }

    /* renamed from: a */
    private static final boolean m45433a(JSONObject jSONObject, String str, zzbiu zzbiu) {
        boolean booleanValue = ((Boolean) zzay.m1924c().mo42663b(zzbiu)).booleanValue();
        if (jSONObject == null) {
            return booleanValue;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            return booleanValue;
        }
    }

    /* renamed from: b */
    private static final int m45434b(JSONObject jSONObject, String str, zzbiu zzbiu) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) zzay.m1924c().mo42663b(zzbiu)).intValue();
    }

    /* renamed from: c */
    private static final long m45435c(JSONObject jSONObject, String str, zzbiu zzbiu) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) zzay.m1924c().mo42663b(zzbiu)).longValue();
    }
}
