package com.google.android.gms.internal.measurement;

import androidx.webkit.ProxyConfig;
import androidx.work.WorkRequest;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zznp implements zzno {

    /* renamed from: A */
    public static final zzib f41785A;

    /* renamed from: B */
    public static final zzib f41786B;

    /* renamed from: C */
    public static final zzib f41787C;

    /* renamed from: D */
    public static final zzib f41788D;

    /* renamed from: E */
    public static final zzib f41789E;

    /* renamed from: F */
    public static final zzib f41790F;

    /* renamed from: G */
    public static final zzib f41791G;

    /* renamed from: H */
    public static final zzib f41792H;

    /* renamed from: I */
    public static final zzib f41793I;

    /* renamed from: J */
    public static final zzib f41794J;

    /* renamed from: K */
    public static final zzib f41795K;

    /* renamed from: L */
    public static final zzib f41796L;

    /* renamed from: M */
    public static final zzib f41797M;

    /* renamed from: a */
    public static final zzib f41798a;

    /* renamed from: b */
    public static final zzib f41799b;

    /* renamed from: c */
    public static final zzib f41800c;

    /* renamed from: d */
    public static final zzib f41801d;

    /* renamed from: e */
    public static final zzib f41802e;

    /* renamed from: f */
    public static final zzib f41803f;

    /* renamed from: g */
    public static final zzib f41804g;

    /* renamed from: h */
    public static final zzib f41805h;

    /* renamed from: i */
    public static final zzib f41806i;

    /* renamed from: j */
    public static final zzib f41807j;

    /* renamed from: k */
    public static final zzib f41808k;

    /* renamed from: l */
    public static final zzib f41809l;

    /* renamed from: m */
    public static final zzib f41810m;

    /* renamed from: n */
    public static final zzib f41811n;

    /* renamed from: o */
    public static final zzib f41812o;

    /* renamed from: p */
    public static final zzib f41813p;

    /* renamed from: q */
    public static final zzib f41814q;

    /* renamed from: r */
    public static final zzib f41815r;

    /* renamed from: s */
    public static final zzib f41816s;

    /* renamed from: t */
    public static final zzib f41817t;

    /* renamed from: u */
    public static final zzib f41818u;

    /* renamed from: v */
    public static final zzib f41819v;

    /* renamed from: w */
    public static final zzib f41820w;

    /* renamed from: x */
    public static final zzib f41821x;

    /* renamed from: y */
    public static final zzib f41822y;

    /* renamed from: z */
    public static final zzib f41823z;

    static {
        zzhy a = new zzhy(zzhq.m60278a("com.google.android.gms.measurement")).mo51277a();
        f41798a = a.mo51280d("measurement.ad_id_cache_time", WorkRequest.MIN_BACKOFF_MILLIS);
        f41799b = a.mo51280d("measurement.max_bundles_per_iteration", 100);
        f41800c = a.mo51280d("measurement.config.cache_time", 86400000);
        f41801d = a.mo51281e("measurement.log_tag", "FA");
        f41802e = a.mo51281e("measurement.config.url_authority", "app-measurement.com");
        f41803f = a.mo51281e("measurement.config.url_scheme", ProxyConfig.MATCH_HTTPS);
        f41804g = a.mo51280d("measurement.upload.debug_upload_interval", 1000);
        f41805h = a.mo51280d("measurement.lifetimevalue.max_currency_tracked", 4);
        f41806i = a.mo51280d("measurement.store.max_stored_events_per_app", 100000);
        f41807j = a.mo51280d("measurement.experiment.max_ids", 50);
        f41808k = a.mo51280d("measurement.audience.filter_result_max_count", 200);
        f41809l = a.mo51280d("measurement.alarm_manager.minimum_interval", 60000);
        f41810m = a.mo51280d("measurement.upload.minimum_delay", 500);
        f41811n = a.mo51280d("measurement.monitoring.sample_period_millis", 86400000);
        f41812o = a.mo51280d("measurement.upload.realtime_upload_interval", WorkRequest.MIN_BACKOFF_MILLIS);
        f41813p = a.mo51280d("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        f41814q = a.mo51280d("measurement.config.cache_time.service", 3600000);
        f41815r = a.mo51280d("measurement.service_client.idle_disconnect_millis", 5000);
        f41816s = a.mo51281e("measurement.log_tag.service", "FA-SVC");
        f41817t = a.mo51280d("measurement.upload.stale_data_deletion_interval", 86400000);
        f41818u = a.mo51280d("measurement.sdk.attribution.cache.ttl", 604800000);
        f41819v = a.mo51280d("measurement.redaction.app_instance_id.ttl", 7200000);
        f41820w = a.mo51280d("measurement.upload.backoff_period", 43200000);
        f41821x = a.mo51280d("measurement.upload.initial_upload_delay_time", 15000);
        f41822y = a.mo51280d("measurement.upload.interval", 3600000);
        f41823z = a.mo51280d("measurement.upload.max_bundle_size", 65536);
        f41785A = a.mo51280d("measurement.upload.max_bundles", 100);
        f41786B = a.mo51280d("measurement.upload.max_conversions_per_day", 500);
        f41787C = a.mo51280d("measurement.upload.max_error_events_per_day", 1000);
        f41788D = a.mo51280d("measurement.upload.max_events_per_bundle", 1000);
        f41789E = a.mo51280d("measurement.upload.max_events_per_day", 100000);
        f41790F = a.mo51280d("measurement.upload.max_public_events_per_day", 50000);
        f41791G = a.mo51280d("measurement.upload.max_queue_time", 2419200000L);
        f41792H = a.mo51280d("measurement.upload.max_realtime_events_per_day", 10);
        f41793I = a.mo51280d("measurement.upload.max_batch_size", 65536);
        f41794J = a.mo51280d("measurement.upload.retry_count", 6);
        f41795K = a.mo51280d("measurement.upload.retry_time", 1800000);
        f41796L = a.mo51281e("measurement.upload.url", "https://app-measurement.com/a");
        f41797M = a.mo51280d("measurement.upload.window_interval", 3600000);
    }

    /* renamed from: D */
    public final long mo51619D() {
        return ((Long) f41787C.mo51283b()).longValue();
    }

    /* renamed from: F */
    public final long mo51620F() {
        return ((Long) f41790F.mo51283b()).longValue();
    }

    /* renamed from: H */
    public final long mo51621H() {
        return ((Long) f41788D.mo51283b()).longValue();
    }

    /* renamed from: I */
    public final long mo51622I() {
        return ((Long) f41789E.mo51283b()).longValue();
    }

    /* renamed from: J */
    public final long mo51623J() {
        return ((Long) f41797M.mo51283b()).longValue();
    }

    /* renamed from: K */
    public final long mo51624K() {
        return ((Long) f41786B.mo51283b()).longValue();
    }

    /* renamed from: P */
    public final long mo51625P() {
        return ((Long) f41794J.mo51283b()).longValue();
    }

    /* renamed from: Q */
    public final String mo51626Q() {
        return (String) f41796L.mo51283b();
    }

    /* renamed from: R */
    public final String mo51627R() {
        return (String) f41802e.mo51283b();
    }

    /* renamed from: S */
    public final String mo51628S() {
        return (String) f41803f.mo51283b();
    }

    /* renamed from: V */
    public final long mo51629V() {
        return ((Long) f41791G.mo51283b()).longValue();
    }

    /* renamed from: a */
    public final long mo51630a() {
        return ((Long) f41800c.mo51283b()).longValue();
    }

    /* renamed from: b */
    public final long mo51631b() {
        return ((Long) f41805h.mo51283b()).longValue();
    }

    /* renamed from: c */
    public final long mo51632c() {
        return ((Long) f41806i.mo51283b()).longValue();
    }

    /* renamed from: d */
    public final long mo51633d() {
        return ((Long) f41804g.mo51283b()).longValue();
    }

    /* renamed from: e */
    public final long mo51634e() {
        return ((Long) f41808k.mo51283b()).longValue();
    }

    /* renamed from: f */
    public final long mo51635f() {
        return ((Long) f41807j.mo51283b()).longValue();
    }

    /* renamed from: g */
    public final long mo51636g() {
        return ((Long) f41809l.mo51283b()).longValue();
    }

    /* renamed from: h */
    public final long mo51637h() {
        return ((Long) f41810m.mo51283b()).longValue();
    }

    /* renamed from: i */
    public final long mo51638i() {
        return ((Long) f41811n.mo51283b()).longValue();
    }

    /* renamed from: j */
    public final long mo51639j() {
        return ((Long) f41812o.mo51283b()).longValue();
    }

    /* renamed from: j0 */
    public final long mo51640j0() {
        return ((Long) f41792H.mo51283b()).longValue();
    }

    /* renamed from: k */
    public final long mo51641k() {
        return ((Long) f41813p.mo51283b()).longValue();
    }

    /* renamed from: l */
    public final long mo51642l() {
        return ((Long) f41817t.mo51283b()).longValue();
    }

    /* renamed from: m */
    public final long mo51643m() {
        return ((Long) f41818u.mo51283b()).longValue();
    }

    /* renamed from: n */
    public final long mo51644n() {
        return ((Long) f41815r.mo51283b()).longValue();
    }

    /* renamed from: p */
    public final long mo51645p() {
        return ((Long) f41821x.mo51283b()).longValue();
    }

    /* renamed from: p0 */
    public final long mo51646p0() {
        return ((Long) f41793I.mo51283b()).longValue();
    }

    /* renamed from: q */
    public final long mo51647q() {
        return ((Long) f41820w.mo51283b()).longValue();
    }

    /* renamed from: r */
    public final long mo51648r() {
        return ((Long) f41822y.mo51283b()).longValue();
    }

    /* renamed from: s */
    public final long mo51649s() {
        return ((Long) f41819v.mo51283b()).longValue();
    }

    /* renamed from: t */
    public final long mo51650t() {
        return ((Long) f41795K.mo51283b()).longValue();
    }

    /* renamed from: u */
    public final long mo51651u() {
        return ((Long) f41823z.mo51283b()).longValue();
    }

    /* renamed from: w */
    public final long mo51652w() {
        return ((Long) f41785A.mo51283b()).longValue();
    }

    public final long zza() {
        return ((Long) f41798a.mo51283b()).longValue();
    }

    public final long zzb() {
        return ((Long) f41799b.mo51283b()).longValue();
    }
}
