package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.webkit.ProxyConfig;
import androidx.work.WorkRequest;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzhf;
import com.google.android.gms.internal.measurement.zzhq;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzdu {

    /* renamed from: A */
    public static final zzdt f46570A = m65483a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, zzbg.f46494a);

    /* renamed from: B */
    public static final zzdt f46571B = m65483a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, zzbh.f46495a);

    /* renamed from: C */
    public static final zzdt f46572C = m65483a("measurement.upload.retry_time", 1800000L, 1800000L, zzbi.f46496a);

    /* renamed from: D */
    public static final zzdt f46573D = m65483a("measurement.upload.retry_count", 6, 6, zzbk.f46498a);

    /* renamed from: E */
    public static final zzdt f46574E = m65483a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, zzbl.f46499a);

    /* renamed from: F */
    public static final zzdt f46575F = m65483a("measurement.lifetimevalue.max_currency_tracked", 4, 4, zzbm.f46500a);

    /* renamed from: G */
    public static final zzdt f46576G = m65483a("measurement.audience.filter_result_max_count", 200, 200, zzbo.f46502a);

    /* renamed from: H */
    public static final zzdt f46577H = m65483a("measurement.upload.max_public_user_properties", 25, 25, (zzdq) null);

    /* renamed from: I */
    public static final zzdt f46578I = m65483a("measurement.upload.max_event_name_cardinality", 500, 500, (zzdq) null);

    /* renamed from: J */
    public static final zzdt f46579J = m65483a("measurement.upload.max_public_event_params", 25, 25, (zzdq) null);

    /* renamed from: K */
    public static final zzdt f46580K = m65483a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, zzbp.f46503a);

    /* renamed from: L */
    public static final zzdt f46581L;

    /* renamed from: M */
    public static final zzdt f46582M = m65483a("measurement.test.string_flag", "---", "---", zzbr.f46505a);

    /* renamed from: N */
    public static final zzdt f46583N = m65483a("measurement.test.long_flag", -1L, -1L, zzbs.f46506a);

    /* renamed from: O */
    public static final zzdt f46584O = m65483a("measurement.test.int_flag", -2, -2, zzbt.f46507a);

    /* renamed from: P */
    public static final zzdt f46585P;

    /* renamed from: Q */
    public static final zzdt f46586Q = m65483a("measurement.experiment.max_ids", 50, 50, zzbw.f46510a);

    /* renamed from: R */
    public static final zzdt f46587R = m65483a("measurement.max_bundles_per_iteration", 100, 100, zzbx.f46511a);

    /* renamed from: S */
    public static final zzdt f46588S = m65483a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, zzby.f46512a);

    /* renamed from: T */
    public static final zzdt f46589T = m65483a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, zzca.f46516a);

    /* renamed from: U */
    public static final zzdt f46590U;

    /* renamed from: V */
    public static final zzdt f46591V;

    /* renamed from: W */
    public static final zzdt f46592W;

    /* renamed from: X */
    public static final zzdt f46593X;

    /* renamed from: Y */
    public static final zzdt f46594Y;

    /* renamed from: Z */
    public static final zzdt f46595Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final List f46596a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0 */
    public static final zzdt f46597a0;

    /* renamed from: b */
    private static final Set f46598b = Collections.synchronizedSet(new HashSet());

    /* renamed from: b0 */
    public static final zzdt f46599b0;

    /* renamed from: c */
    public static final zzdt f46600c;

    /* renamed from: c0 */
    public static final zzdt f46601c0;

    /* renamed from: d */
    public static final zzdt f46602d = m65483a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, zzbb.f46489a);

    /* renamed from: d0 */
    public static final zzdt f46603d0;

    /* renamed from: e */
    public static final zzdt f46604e = m65483a("measurement.config.cache_time", 86400000L, 3600000L, zzbn.f46501a);

    /* renamed from: e0 */
    public static final zzdt f46605e0;

    /* renamed from: f */
    public static final zzdt f46606f = m65483a("measurement.config.url_scheme", ProxyConfig.MATCH_HTTPS, ProxyConfig.MATCH_HTTPS, zzbz.f46513a);

    /* renamed from: f0 */
    public static final zzdt f46607f0;

    /* renamed from: g */
    public static final zzdt f46608g = m65483a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", zzcl.f46527a);

    /* renamed from: g0 */
    public static final zzdt f46609g0;

    /* renamed from: h */
    public static final zzdt f46610h = m65483a("measurement.upload.max_bundles", 100, 100, zzcx.f46539a);

    /* renamed from: h0 */
    public static final zzdt f46611h0 = m65483a("measurement.service.storage_consent_support_version", 203600, 203600, zzcp.f46531a);

    /* renamed from: i */
    public static final zzdt f46612i = m65483a("measurement.upload.max_batch_size", 65536, 65536, zzdi.f46553a);

    /* renamed from: i0 */
    public static final zzdt f46613i0;

    /* renamed from: j */
    public static final zzdt f46614j = m65483a("measurement.upload.max_bundle_size", 65536, 65536, zzdj.f46554a);

    /* renamed from: j0 */
    public static final zzdt f46615j0;

    /* renamed from: k */
    public static final zzdt f46616k = m65483a("measurement.upload.max_events_per_bundle", 1000, 1000, zzdk.f46555a);

    /* renamed from: k0 */
    public static final zzdt f46617k0;

    /* renamed from: l */
    public static final zzdt f46618l = m65483a("measurement.upload.max_events_per_day", 100000, 100000, zzdl.f46556a);

    /* renamed from: l0 */
    public static final zzdt f46619l0;

    /* renamed from: m */
    public static final zzdt f46620m = m65483a("measurement.upload.max_error_events_per_day", 1000, 1000, zzbu.f46508a);

    /* renamed from: m0 */
    public static final zzdt f46621m0;

    /* renamed from: n */
    public static final zzdt f46622n = m65483a("measurement.upload.max_public_events_per_day", 50000, 50000, zzcf.f46521a);

    /* renamed from: n0 */
    public static final zzdt f46623n0;

    /* renamed from: o */
    public static final zzdt f46624o;

    /* renamed from: o0 */
    public static final zzdt f46625o0;

    /* renamed from: p */
    public static final zzdt f46626p = m65483a("measurement.upload.max_realtime_events_per_day", 10, 10, zzdb.f46546a);

    /* renamed from: p0 */
    public static final zzdt f46627p0;

    /* renamed from: q */
    public static final zzdt f46628q = m65483a("measurement.store.max_stored_events_per_app", 100000, 100000, zzdm.f46557a);

    /* renamed from: q0 */
    public static final zzdt f46629q0;

    /* renamed from: r */
    public static final zzdt f46630r = m65483a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", zzdn.f46558a);

    /* renamed from: r0 */
    public static final zzdt f46631r0;

    /* renamed from: s */
    public static final zzdt f46632s = m65483a("measurement.upload.backoff_period", 43200000L, 43200000L, zzdo.f46559a);

    /* renamed from: s0 */
    public static final zzdt f46633s0;

    /* renamed from: t */
    public static final zzdt f46634t = m65483a("measurement.upload.window_interval", 3600000L, 3600000L, zzdp.f46560a);

    /* renamed from: t0 */
    public static final zzdt f46635t0;

    /* renamed from: u */
    public static final zzdt f46636u = m65483a("measurement.upload.interval", 3600000L, 3600000L, zzaz.f46484a);

    /* renamed from: u0 */
    public static final zzdt f46637u0;

    /* renamed from: v */
    public static final zzdt f46638v;

    /* renamed from: v0 */
    public static final zzdt f46639v0;

    /* renamed from: w */
    public static final zzdt f46640w = m65483a("measurement.upload.debug_upload_interval", 1000L, 1000L, zzbc.f46490a);

    /* renamed from: w0 */
    public static final zzdt f46641w0;

    /* renamed from: x */
    public static final zzdt f46642x = m65483a("measurement.upload.minimum_delay", 500L, 500L, zzbd.f46491a);

    /* renamed from: y */
    public static final zzdt f46643y = m65483a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, zzbe.f46492a);

    /* renamed from: z */
    public static final zzdt f46644z = m65483a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, zzbf.f46493a);

    static {
        Long valueOf = Long.valueOf(WorkRequest.MIN_BACKOFF_MILLIS);
        f46600c = m65483a("measurement.ad_id_cache_time", valueOf, valueOf, zzbj.f46497a);
        Integer valueOf2 = Integer.valueOf(SamsungIrisUnlockModule.IRIS_ACQUIRED_VENDOR_EVENT_BASE);
        f46624o = m65483a("measurement.upload.max_conversions_per_day", valueOf2, valueOf2, zzcq.f46532a);
        f46638v = m65483a("measurement.upload.realtime_upload_interval", valueOf, valueOf, zzba.f46488a);
        Boolean bool = Boolean.FALSE;
        f46581L = m65483a("measurement.test.boolean_flag", bool, bool, zzbq.f46504a);
        Double valueOf3 = Double.valueOf(-3.0d);
        f46585P = m65483a("measurement.test.double_flag", valueOf3, valueOf3, zzbv.f46509a);
        Boolean bool2 = Boolean.TRUE;
        f46590U = m65483a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, zzcb.f46517a);
        f46591V = m65483a("measurement.quality.checksum", bool, bool, (zzdq) null);
        f46592W = m65483a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, zzcc.f46518a);
        f46593X = m65483a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, zzcd.f46519a);
        f46594Y = m65483a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, zzce.f46520a);
        f46595Z = m65483a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, zzcg.f46522a);
        f46597a0 = m65483a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, zzch.f46523a);
        f46599b0 = m65483a("measurement.lifecycle.app_in_background_parameter", bool, bool, zzci.f46524a);
        f46601c0 = m65483a("measurement.integration.disable_firebase_instance_id", bool, bool, zzcj.f46525a);
        f46603d0 = m65483a("measurement.collection.service.update_with_analytics_fix", bool, bool, zzck.f46526a);
        f46605e0 = m65483a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, zzcm.f46528a);
        f46607f0 = m65483a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, zzcn.f46529a);
        f46609g0 = m65483a("measurement.collection.synthetic_data_mitigation", bool, bool, zzco.f46530a);
        f46613i0 = m65483a("measurement.client.click_identifier_control.dev", bool, bool, zzcr.f46533a);
        f46615j0 = m65483a("measurement.service.click_identifier_control", bool, bool, zzcs.f46534a);
        f46617k0 = m65483a("measurement.service.store_null_safelist", bool2, bool2, zzct.f46535a);
        f46619l0 = m65483a("measurement.service.store_safelist", bool2, bool2, zzcu.f46536a);
        f46621m0 = m65483a("measurement.collection.enable_session_stitching_token.service", bool, bool, zzcv.f46537a);
        f46623n0 = m65483a("measurement.collection.enable_session_stitching_token.service_new", bool2, bool2, zzcw.f46538a);
        f46625o0 = m65483a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, zzcy.f46540a);
        f46627p0 = m65483a("measurement.session_stitching_token_enabled", bool, bool, zzcz.f46541a);
        f46629q0 = m65483a("measurement.redaction.e_tag", bool2, bool2, zzda.f46545a);
        f46631r0 = m65483a("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, zzdc.f46547a);
        f46633s0 = m65483a("measurement.redaction.retain_major_os_version", bool2, bool2, zzdd.f46548a);
        f46635t0 = m65483a("measurement.redaction.scion_payload_generator", bool2, bool2, zzde.f46549a);
        f46637u0 = m65483a("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, zzdf.f46550a);
        f46639v0 = m65483a("measurement.service.clear_global_params_on_uninstall", bool2, bool2, zzdg.f46551a);
        f46641w0 = m65483a("measurement.sessionid.enable_client_session_id", bool2, bool2, zzdh.f46552a);
    }

    @VisibleForTesting
    /* renamed from: a */
    static zzdt m65483a(String str, Object obj, Object obj2, zzdq zzdq) {
        zzdt zzdt = new zzdt(str, obj, obj2, zzdq, (zzds) null);
        f46596a.add(zzdt);
        return zzdt;
    }

    /* renamed from: c */
    public static Map m65485c(Context context) {
        zzhf a = zzhf.m60262a(context.getContentResolver(), zzhq.m60278a("com.google.android.gms.measurement"), zzay.f46483a);
        return a == null ? Collections.emptyMap() : a.mo51265b();
    }
}
