package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.google.android.gms.ads.internal.client.zzay;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbjc {

    /* renamed from: A */
    public static final zzbiu f26806A;

    /* renamed from: A0 */
    public static final zzbiu f26807A0;

    /* renamed from: A1 */
    public static final zzbiu f26808A1 = zzbiu.m43511g(1, "gads:adapter_initialization:min_sdk_version", 15301000);

    /* renamed from: A2 */
    public static final zzbiu f26809A2 = zzbiu.m43511g(1, "gads:gestures:as2percentage", 0);

    /* renamed from: A3 */
    public static final zzbiu f26810A3 = zzbiu.m43512h(1, "gads:cache:function_call_timeout", 5000);

    /* renamed from: A4 */
    public static final zzbiu f26811A4;

    /* renamed from: A5 */
    public static final zzbiu f26812A5 = zzbiu.m43514j(1, "gads:rewarded_precache_pool:cache_start_trigger", "onAdClosed");

    /* renamed from: A6 */
    public static final zzbiu f26813A6 = zzbiu.m43514j(1, "gads:scar:google_view_domain_suffixes", ".doubleclick.net,.googleadservices.com,.googlesyndication.com");

    /* renamed from: A7 */
    public static final zzbiu f26814A7 = zzbiu.m43514j(1, "gads:plugin_regex", "^Flutter-GMA-.*|^unity-.*");

    /* renamed from: A8 */
    public static final zzbiu f26815A8;

    /* renamed from: B */
    public static final zzbiu f26816B = zzbiu.m43512h(1, "gads:video:surface_update_min_spacing_ms", 1000);

    /* renamed from: B0 */
    public static final zzbiu f26817B0 = zzbiu.m43511g(1, "gads:show_interstitial_with_context:min_version", 204890000);

    /* renamed from: B1 */
    public static final zzbiu f26818B1 = zzbiu.m43512h(1, "gads:adapter_initialization:timeout", 30);

    /* renamed from: B2 */
    public static final zzbiu f26819B2;

    /* renamed from: B3 */
    public static final zzbiu f26820B3;

    /* renamed from: B4 */
    public static final zzbiu f26821B4;

    /* renamed from: B5 */
    public static final zzbiu f26822B5 = zzbiu.m43514j(1, "gads:interstitial_precache_pool:cache_start_trigger", "onAdClosed");

    /* renamed from: B6 */
    public static final zzbiu f26823B6;

    /* renamed from: B7 */
    public static final zzbiu f26824B7 = zzbiu.m43511g(1, "gads:app_event_queue_size", 20);

    /* renamed from: B8 */
    public static final zzbiu f26825B8;

    /* renamed from: C */
    public static final zzbiu f26826C;

    /* renamed from: C0 */
    public static final zzbiu f26827C0;

    /* renamed from: C1 */
    public static final zzbiu f26828C1 = zzbiu.m43512h(1, "gads:adapter_initialization:cld_timeout", 10);

    /* renamed from: C2 */
    public static final zzbiu f26829C2;

    /* renamed from: C3 */
    public static final zzbiu f26830C3;

    /* renamed from: C4 */
    public static final zzbiu f26831C4;

    /* renamed from: C5 */
    public static final zzbiu f26832C5 = zzbiu.m43511g(1, "gads:rewarded_precache_pool:size", 1);

    /* renamed from: C6 */
    public static final zzbiu f26833C6;

    /* renamed from: C7 */
    public static final zzbiu f26834C7;

    /* renamed from: C8 */
    public static final zzbiu f26835C8;

    /* renamed from: D */
    public static final zzbiu f26836D;

    /* renamed from: D0 */
    public static final zzbiu f26837D0;

    /* renamed from: D1 */
    public static final zzbiu f26838D1;

    /* renamed from: D2 */
    public static final zzbiu f26839D2;

    /* renamed from: D3 */
    public static final zzbiu f26840D3 = zzbiu.m43514j(1, "gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");

    /* renamed from: D4 */
    public static final zzbiu f26841D4;

    /* renamed from: D5 */
    public static final zzbiu f26842D5 = zzbiu.m43511g(1, "gads:interstitial_precache_pool:size", 1);

    /* renamed from: D6 */
    public static final zzbiu f26843D6;

    /* renamed from: D7 */
    public static final zzbiu f26844D7;

    /* renamed from: D8 */
    public static final zzbiu f26845D8;

    /* renamed from: E */
    public static final zzbiu f26846E = zzbiu.m43511g(1, "gads:video:spinner:scale", 4);

    /* renamed from: E0 */
    public static final zzbiu f26847E0;

    /* renamed from: E1 */
    public static final zzbiu f26848E1;

    /* renamed from: E2 */
    public static final zzbiu f26849E2;

    /* renamed from: E3 */
    public static final zzbiu f26850E3 = zzbiu.m43511g(1, "gads:http_assets_cache:time_out", 100);

    /* renamed from: E4 */
    public static final zzbiu f26851E4 = zzbiu.m43511g(1, "gads:nonagon:request_timeout:seconds", 60);

    /* renamed from: E5 */
    public static final zzbiu f26852E5 = zzbiu.m43511g(1, "gads:rewarded_precache_pool:ad_time_limit", 1200);

    /* renamed from: E6 */
    public static final zzbiu f26853E6;

    /* renamed from: E7 */
    public static final zzbiu f26854E7;

    /* renamed from: E8 */
    public static final zzbiu f26855E8;

    /* renamed from: F */
    public static final zzbiu f26856F = zzbiu.m43512h(1, "gads:video:spinner:jank_threshold_ms", 50);

    /* renamed from: F0 */
    public static final zzbiu f26857F0;

    /* renamed from: F1 */
    public static final zzbiu f26858F1;

    /* renamed from: F2 */
    public static final zzbiu f26859F2;

    /* renamed from: F3 */
    public static final zzbiu f26860F3;

    /* renamed from: F4 */
    public static final zzbiu f26861F4;

    /* renamed from: F5 */
    public static final zzbiu f26862F5 = zzbiu.m43511g(1, "gads:interstitial_precache_pool:ad_time_limit", 1200);

    /* renamed from: F6 */
    public static final zzbiu f26863F6;

    /* renamed from: F7 */
    public static final zzbiu f26864F7 = zzbiu.m43514j(1, "gads:inspector:ui_url", "https://admob-gmats.uc.r.appspot.com/");

    /* renamed from: F8 */
    public static final zzbiu f26865F8;

    /* renamed from: G */
    public static final zzbiu f26866G;

    /* renamed from: G0 */
    public static final zzbiu f26867G0;

    /* renamed from: G1 */
    public static final zzbiu f26868G1;

    /* renamed from: G2 */
    public static final zzbiu f26869G2;

    /* renamed from: G3 */
    public static final zzbiu f26870G3;

    /* renamed from: G4 */
    public static final zzbiu f26871G4;

    /* renamed from: G5 */
    public static final zzbiu f26872G5 = zzbiu.m43514j(1, "gads:rewarded_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");

    /* renamed from: G6 */
    public static final zzbiu f26873G6 = zzbiu.m43511g(1, "gads:native_ads_signal:timeout", 1000);

    /* renamed from: G7 */
    public static final zzbiu f26874G7 = zzbiu.m43511g(1, "gads:inspector:max_ad_life_cycles", 1000);

    /* renamed from: G8 */
    public static final zzbiu f26875G8;

    /* renamed from: H */
    public static final zzbiu f26876H;

    /* renamed from: H0 */
    public static final zzbiu f26877H0 = zzbiu.m43514j(1, "gads:webview_cookie_url", "https://googleads.g.doubleclick.net");

    /* renamed from: H1 */
    public static final zzbiu f26878H1;

    /* renamed from: H2 */
    public static final zzbiu f26879H2;

    /* renamed from: H3 */
    public static final zzbiu f26880H3;

    /* renamed from: H4 */
    public static final zzbiu f26881H4;

    /* renamed from: H5 */
    public static final zzbiu f26882H5 = zzbiu.m43514j(1, "gads:interstitial_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");

    /* renamed from: H6 */
    public static final zzbiu f26883H6;

    /* renamed from: H7 */
    public static final zzbiu f26884H7 = zzbiu.m43511g(1, "gads:inspector:ui_invocation_millis", 2000);

    /* renamed from: H8 */
    public static final zzbiu f26885H8;

    /* renamed from: I */
    public static final zzbiu f26886I = zzbiu.m43514j(1, "gads:video:codec_query_mime_types", "");

    /* renamed from: I0 */
    public static final zzbiu f26887I0;

    /* renamed from: I1 */
    public static final zzbiu f26888I1 = zzbiu.m43512h(1, "gads:video:range_http_data_source_high_water_mark", 614400);

    /* renamed from: I2 */
    public static final zzbiu f26889I2;

    /* renamed from: I3 */
    public static final zzbiu f26890I3;

    /* renamed from: I4 */
    public static final zzbiu f26891I4;

    /* renamed from: I5 */
    public static final zzbiu f26892I5 = zzbiu.m43514j(1, "gads:app_open_precache_pool:schema", "orientation,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");

    /* renamed from: I6 */
    public static final zzbiu f26893I6;

    /* renamed from: I7 */
    public static final zzbiu f26894I7;

    /* renamed from: I8 */
    public static final zzbiu f26895I8;

    /* renamed from: J */
    public static final zzbiu f26896J = zzbiu.m43511g(1, "gads:video:codec_query_minimum_version", 16);

    /* renamed from: J0 */
    public static final zzbiu f26897J0;

    /* renamed from: J1 */
    public static final zzbiu f26898J1 = zzbiu.m43512h(1, "gads:video:range_http_data_source_low_water_mark", 102400);

    /* renamed from: J2 */
    public static final zzbiu f26899J2;

    /* renamed from: J3 */
    public static final zzbiu f26900J3;

    /* renamed from: J4 */
    public static final zzbiu f26901J4 = zzbiu.m43514j(1, "gads:uri_query_to_map_bg_thread:types", "/result");

    /* renamed from: J5 */
    public static final zzbiu f26902J5 = zzbiu.m43514j(1, "gads:app_open_precache_pool:discard_strategy", "oldest");

    /* renamed from: J6 */
    public static final zzbiu f26903J6;

    /* renamed from: J7 */
    public static final zzbiu f26904J7 = zzbiu.m43510f(1, "gads:inspector:shake_strength", 2.0f);

    /* renamed from: J8 */
    public static final zzbiu f26905J8;

    /* renamed from: K */
    public static final zzbiu f26906K = zzbiu.m43514j(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_banner.js");

    /* renamed from: K0 */
    public static final zzbiu f26907K0;

    /* renamed from: K1 */
    public static final zzbiu f26908K1;

    /* renamed from: K2 */
    public static final zzbiu f26909K2;

    /* renamed from: K3 */
    public static final zzbiu f26910K3;

    /* renamed from: K4 */
    public static final zzbiu f26911K4 = zzbiu.m43511g(1, "gads:uri_query_to_map_bg_thread:min_length", 1000);

    /* renamed from: K5 */
    public static final zzbiu f26912K5 = zzbiu.m43511g(1, "gads:app_open_precache_pool:count", 0);

    /* renamed from: K6 */
    public static final zzbiu f26913K6;

    /* renamed from: K7 */
    public static final zzbiu f26914K7 = zzbiu.m43511g(1, "gads:inspector:shake_interval", 500);

    /* renamed from: K8 */
    public static final zzbiu f26915K8;

    /* renamed from: L */
    public static final zzbiu f26916L = zzbiu.m43514j(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_expanded_banner.js");

    /* renamed from: L0 */
    public static final zzbiu f26917L0;

    /* renamed from: L1 */
    public static final zzbiu f26918L1;

    /* renamed from: L2 */
    public static final zzbiu f26919L2;

    /* renamed from: L3 */
    public static final zzbiu f26920L3;

    /* renamed from: L4 */
    public static final zzbiu f26921L4;

    /* renamed from: L5 */
    public static final zzbiu f26922L5 = zzbiu.m43514j(1, "gads:app_open_precache_pool:cache_start_trigger", "onAdClosed");

    /* renamed from: L6 */
    public static final zzbiu f26923L6 = zzbiu.m43511g(1, "gads:interscroller:min_width", 300);

    /* renamed from: L7 */
    public static final zzbiu f26924L7 = zzbiu.m43511g(1, "gads:inspector:shake_reset_time_ms", PathInterpolatorCompat.MAX_NUM_POINTS);

    /* renamed from: L8 */
    public static final zzbiu f26925L8;

    /* renamed from: M */
    public static final zzbiu f26926M = zzbiu.m43514j(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_interstitial.js");

    /* renamed from: M0 */
    public static final zzbiu f26927M0 = zzbiu.m43512h(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500);

    /* renamed from: M1 */
    public static final zzbiu f26928M1;

    /* renamed from: M2 */
    public static final zzbiu f26929M2 = zzbiu.m43511g(1, "gads:gass:impression_retry:count", 0);

    /* renamed from: M3 */
    public static final zzbiu f26930M3 = zzbiu.m43514j(1, "gad:publisher_testing:cct_v2:enabled_list", "");

    /* renamed from: M4 */
    public static final zzbiu f26931M4;

    /* renamed from: M5 */
    public static final zzbiu f26932M5 = zzbiu.m43511g(1, "gads:app_open_precache_pool:size", 1);

    /* renamed from: M6 */
    public static final zzbiu f26933M6 = zzbiu.m43511g(1, "gads:interscroller:min_height", ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);

    /* renamed from: M7 */
    public static final zzbiu f26934M7 = zzbiu.m43511g(1, "gads:inspector:shake_count", 3);

    /* renamed from: M8 */
    public static final zzbiu f26935M8;

    /* renamed from: N */
    public static final zzbiu f26936N = zzbiu.m43514j(1, "gad:mraid:version", "3.0");

    /* renamed from: N0 */
    public static final zzbiu f26937N0 = zzbiu.m43512h(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));

    /* renamed from: N1 */
    public static final zzbiu f26938N1;

    /* renamed from: N2 */
    public static final zzbiu f26939N2 = zzbiu.m43511g(1, "gads:gass:impression_retry:delay_ms", 400);

    /* renamed from: N3 */
    public static final zzbiu f26940N3;

    /* renamed from: N4 */
    public static final zzbiu f26941N4;

    /* renamed from: N5 */
    public static final zzbiu f26942N5 = zzbiu.m43511g(1, "gads:app_open_precache_pool:ad_time_limit", 14400);

    /* renamed from: N6 */
    public static final zzbiu f26943N6;

    /* renamed from: N7 */
    public static final zzbiu f26944N7;

    /* renamed from: N8 */
    public static final zzbiu f26945N8 = zzbiu.m43511g(1, "gads:v46_granular_version", 221080000);

    /* renamed from: O */
    public static final zzbiu f26946O;

    /* renamed from: O0 */
    public static final zzbiu f26947O0;

    /* renamed from: O1 */
    public static final zzbiu f26948O1;

    /* renamed from: O2 */
    public static final zzbiu f26949O2 = zzbiu.m43515k(1, "gads:sdk_core_constants:experiment_id");

    /* renamed from: O3 */
    public static final zzbiu f26950O3 = zzbiu.m43512h(1, "gads:debug_hold_gesture:time_millis", 2000);

    /* renamed from: O4 */
    public static final zzbiu f26951O4;

    /* renamed from: O5 */
    public static final zzbiu f26952O5;

    /* renamed from: O6 */
    public static final zzbiu f26953O6;

    /* renamed from: O7 */
    public static final zzbiu f26954O7 = zzbiu.m43510f(1, "gads:inspector:flick_rotation_threshold", 45.0f);

    /* renamed from: O8 */
    public static final zzbiu f26955O8 = zzbiu.m43511g(1, "gads:v48_granular_version", 221909000);

    /* renamed from: P */
    public static final zzbiu f26956P;

    /* renamed from: P0 */
    public static final zzbiu f26957P0 = zzbiu.m43512h(1, "gads:adid_values_in_adrequest:timeout", 2000);

    /* renamed from: P1 */
    public static final zzbiu f26958P1;

    /* renamed from: P2 */
    public static final zzbiu f26959P2 = zzbiu.m43514j(1, "gads:sdk_core_constants:caps", "");

    /* renamed from: P3 */
    public static final zzbiu f26960P3 = zzbiu.m43514j(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");

    /* renamed from: P4 */
    public static final zzbiu f26961P4;

    /* renamed from: P5 */
    public static final zzbiu f26962P5;

    /* renamed from: P6 */
    public static final zzbiu f26963P6;

    /* renamed from: P7 */
    public static final zzbiu f26964P7 = zzbiu.m43511g(1, "gads:inspector:flick_reset_time_ms", PathInterpolatorCompat.MAX_NUM_POINTS);

    /* renamed from: P8 */
    public static final zzbiu f26965P8;

    /* renamed from: Q */
    public static final zzbiu f26966Q = zzbiu.m43511g(1, "gads:content_vertical_fingerprint_number", 100);

    /* renamed from: Q0 */
    public static final zzbiu f26967Q0;

    /* renamed from: Q1 */
    public static final zzbiu f26968Q1;

    /* renamed from: Q2 */
    public static final zzbiu f26969Q2;

    /* renamed from: Q3 */
    public static final zzbiu f26970Q3 = zzbiu.m43514j(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");

    /* renamed from: Q4 */
    public static final zzbiu f26971Q4;

    /* renamed from: Q5 */
    public static final zzbiu f26972Q5;

    /* renamed from: Q6 */
    public static final zzbiu f26973Q6;

    /* renamed from: Q7 */
    public static final zzbiu f26974Q7 = zzbiu.m43511g(1, "gads:inspector:flick_count", 2);

    /* renamed from: Q8 */
    public static final zzbiu f26975Q8;

    /* renamed from: R */
    public static final zzbiu f26976R = zzbiu.m43511g(1, "gads:content_vertical_fingerprint_bits", 23);

    /* renamed from: R0 */
    public static final zzbiu f26977R0 = zzbiu.m43512h(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000);

    /* renamed from: R1 */
    public static final zzbiu f26978R1;

    /* renamed from: R2 */
    public static final zzbiu f26979R2 = zzbiu.m43514j(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");

    /* renamed from: R3 */
    public static final zzbiu f26980R3 = zzbiu.m43514j(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");

    /* renamed from: R4 */
    public static final zzbiu f26981R4;

    /* renamed from: R5 */
    public static final zzbiu f26982R5;

    /* renamed from: R6 */
    public static final zzbiu f26983R6 = zzbiu.m43514j(1, "gad:publisher_testing:policy_validator:enabled_list", "");

    /* renamed from: R7 */
    public static final zzbiu f26984R7 = zzbiu.m43511g(1, "gads:inspector:icon_width_px", 256);

    /* renamed from: R8 */
    public static final zzbiu f26985R8;

    /* renamed from: S */
    public static final zzbiu f26986S = zzbiu.m43511g(1, "gads:content_vertical_fingerprint_ngram", 3);

    /* renamed from: S0 */
    public static final zzbiu f26987S0;

    /* renamed from: S1 */
    public static final zzbiu f26988S1;

    /* renamed from: S2 */
    public static final zzbiu f26989S2 = zzbiu.m43514j(1, "gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");

    /* renamed from: S3 */
    public static final zzbiu f26990S3 = zzbiu.m43514j(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");

    /* renamed from: S4 */
    public static final zzbiu f26991S4;

    /* renamed from: S5 */
    public static final zzbiu f26992S5;

    /* renamed from: S6 */
    public static final zzbiu f26993S6 = zzbiu.m43511g(1, "gads:policy_validator_layoutparam:flags", 808);

    /* renamed from: S7 */
    public static final zzbiu f26994S7 = zzbiu.m43511g(1, "gads:inspector:icon_height_px", 256);

    /* renamed from: S8 */
    public static final zzbiu f26995S8;

    /* renamed from: T */
    public static final zzbiu f26996T = zzbiu.m43514j(1, "gads:content_fetch_view_tag_id", "googlebot");

    /* renamed from: T0 */
    public static final zzbiu f26997T0;

    /* renamed from: T1 */
    public static final zzbiu f26998T1 = zzbiu.m43511g(1, "gads:gestures:a2:enabled", 0);

    /* renamed from: T2 */
    public static final zzbiu f26999T2;

    /* renamed from: T3 */
    public static final zzbiu f27000T3 = zzbiu.m43511g(1, "gads:drx_debug:timeout_ms", SamsungIrisUnlockModule.IRIS_ERROR_NEED_TO_RETRY);

    /* renamed from: T4 */
    public static final zzbiu f27001T4;

    /* renamed from: T5 */
    public static final zzbiu f27002T5;

    /* renamed from: T6 */
    public static final zzbiu f27003T6;

    /* renamed from: T7 */
    public static final zzbiu f27004T7;

    /* renamed from: T8 */
    public static final zzbiu f27005T8;

    /* renamed from: U */
    public static final zzbiu f27006U = zzbiu.m43514j(1, "gads:content_fetch_exclude_view_tag", "none");

    /* renamed from: U0 */
    public static final zzbiu f27007U0;

    /* renamed from: U1 */
    public static final zzbiu f27008U1;

    /* renamed from: U2 */
    public static final zzbiu f27009U2 = zzbiu.m43511g(1, "gads:native_video_load_timeout", 10);

    /* renamed from: U3 */
    public static final zzbiu f27010U3 = zzbiu.m43511g(1, "gad:pixel_dp_comparision_multiplier", 1);

    /* renamed from: U4 */
    public static final zzbiu f27011U4;

    /* renamed from: U5 */
    public static final zzbiu f27012U5;

    /* renamed from: U6 */
    public static final zzbiu f27013U6 = zzbiu.m43511g(1, "gads:policy_validator_overlay_width:dp", 350);

    /* renamed from: U7 */
    public static final zzbiu f27014U7;

    /* renamed from: U8 */
    public static final zzbiu f27015U8;

    /* renamed from: V */
    public static final zzbiu f27016V;

    /* renamed from: V0 */
    public static final zzbiu f27017V0 = zzbiu.m43514j(1, "gads:close_button_asset_name", "default");

    /* renamed from: V1 */
    public static final zzbiu f27018V1;

    /* renamed from: V2 */
    public static final zzbiu f27019V2 = zzbiu.m43514j(1, "gads:ad_choices_content_description", "Ad Choices Icon");

    /* renamed from: V3 */
    public static final zzbiu f27020V3;

    /* renamed from: V4 */
    public static final zzbiu f27021V4;

    /* renamed from: V5 */
    public static final zzbiu f27022V5;

    /* renamed from: V6 */
    public static final zzbiu f27023V6 = zzbiu.m43511g(1, "gads:policy_validator_overlay_height:dp", 140);

    /* renamed from: V7 */
    public static final zzbiu f27024V7;

    /* renamed from: W */
    public static final zzbiu f27025W;

    /* renamed from: W0 */
    public static final zzbiu f27026W0 = zzbiu.m43512h(1, "gads:close_button_fade_in_duration_ms", 0);

    /* renamed from: W1 */
    public static final zzbiu f27027W1;

    /* renamed from: W2 */
    public static final zzbiu f27028W2;

    /* renamed from: W3 */
    public static final zzbiu f27029W3;

    /* renamed from: W4 */
    public static final zzbiu f27030W4;

    /* renamed from: W5 */
    public static final zzbiu f27031W5 = zzbiu.m43514j(1, "gads:csi:error_parsing:regex", "^(\\d+)");

    /* renamed from: W6 */
    public static final zzbiu f27032W6;

    /* renamed from: W7 */
    public static final zzbiu f27033W7;

    /* renamed from: X */
    public static final zzbiu f27034X;

    /* renamed from: X0 */
    public static final zzbiu f27035X0;

    /* renamed from: X1 */
    public static final zzbiu f27036X1;

    /* renamed from: X2 */
    public static final zzbiu f27037X2;

    /* renamed from: X3 */
    public static final zzbiu f27038X3;

    /* renamed from: X4 */
    public static final zzbiu f27039X4;

    /* renamed from: X5 */
    public static final zzbiu f27040X5;

    /* renamed from: X6 */
    public static final zzbiu f27041X6;

    /* renamed from: X7 */
    public static final zzbiu f27042X7;

    /* renamed from: Y */
    public static final zzbiu f27043Y;

    /* renamed from: Y0 */
    public static final zzbiu f27044Y0;

    /* renamed from: Y1 */
    public static final zzbiu f27045Y1;

    /* renamed from: Y2 */
    public static final zzbiu f27046Y2;

    /* renamed from: Y3 */
    public static final zzbiu f27047Y3;

    /* renamed from: Y4 */
    public static final zzbiu f27048Y4;

    /* renamed from: Y5 */
    public static final zzbiu f27049Y5;

    /* renamed from: Y6 */
    public static final zzbiu f27050Y6;

    /* renamed from: Y7 */
    public static final zzbiu f27051Y7;

    /* renamed from: Z */
    public static final zzbiu f27052Z = zzbiu.m43514j(1, "gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");

    /* renamed from: Z0 */
    public static final zzbiu f27053Z0;

    /* renamed from: Z1 */
    public static final zzbiu f27054Z1 = zzbiu.m43514j(1, "gads:msa:experiments:incapi:trusted_cert", "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a");

    /* renamed from: Z2 */
    public static final zzbiu f27055Z2;

    /* renamed from: Z3 */
    public static final zzbiu f27056Z3 = zzbiu.m43511g(1, "gad:interstitial:close_button_padding_dip", 0);

    /* renamed from: Z4 */
    public static final zzbiu f27057Z4;

    /* renamed from: Z5 */
    public static final zzbiu f27058Z5;

    /* renamed from: Z6 */
    public static final zzbiu f27059Z6;

    /* renamed from: Z7 */
    public static final zzbiu f27060Z7;

    /* renamed from: a */
    public static final zzbiu f27061a = zzbiu.m43514j(1, "gads:sdk_core_location:client:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* renamed from: a0 */
    public static final zzbiu f27062a0 = zzbiu.m43514j(1, "gads:sai:impression_ping_schema_v2", "^[^?]*(/adview|/pcs/view).*");

    /* renamed from: a1 */
    public static final zzbiu f27063a1 = zzbiu.m43511g(1, "gads:banner_refresh_time:seconds", 60);

    /* renamed from: a2 */
    public static final zzbiu f27064a2 = zzbiu.m43514j(1, "gads:msa:experiments:incapi:debug_cert", "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b");

    /* renamed from: a3 */
    public static final zzbiu f27065a3;

    /* renamed from: a4 */
    public static final zzbiu f27066a4;

    /* renamed from: a5 */
    public static final zzbiu f27067a5 = zzbiu.m43512h(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000);

    /* renamed from: a6 */
    public static final zzbiu f27068a6;

    /* renamed from: a7 */
    public static final zzbiu f27069a7;

    /* renamed from: a8 */
    public static final zzbiu f27070a8;

    /* renamed from: b */
    public static final zzbiu f27071b = zzbiu.m43514j(1, "gads:active_view_location:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* renamed from: b0 */
    public static final zzbiu f27072b0;

    /* renamed from: b1 */
    public static final zzbiu f27073b1;

    /* renamed from: b2 */
    public static final zzbiu f27074b2;

    /* renamed from: b3 */
    public static final zzbiu f27075b3;

    /* renamed from: b4 */
    public static final zzbiu f27076b4;

    /* renamed from: b5 */
    public static final zzbiu f27077b5 = zzbiu.m43511g(1, "gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);

    /* renamed from: b6 */
    public static final zzbiu f27078b6 = zzbiu.m43511g(1, "gads:maximum_query_json_cache_size", 200);

    /* renamed from: b7 */
    public static final zzbiu f27079b7 = zzbiu.m43514j(1, "gads:server_transaction_source:list", "Network");

    /* renamed from: b8 */
    public static final zzbiu f27080b8;

    /* renamed from: c */
    public static final zzbke f27081c = zzbkx.f27475d;

    /* renamed from: c0 */
    public static final zzbiu f27082c0 = zzbiu.m43514j(1, "gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");

    /* renamed from: c1 */
    public static final zzbiu f27083c1 = zzbiu.m43514j(1, "gads:spherical_video:vertex_shader", "");

    /* renamed from: c2 */
    public static final zzbke f27084c2 = zzbkw.f27471b;

    /* renamed from: c3 */
    public static final zzbiu f27085c3;

    /* renamed from: c4 */
    public static final zzbiu f27086c4;

    /* renamed from: c5 */
    public static final zzbiu f27087c5 = zzbiu.m43511g(1, "gads:adoverlay:b68684796:targeting_sdk:upper_bound", 26);

    /* renamed from: c6 */
    public static final zzbiu f27088c6 = zzbiu.m43512h(1, "gads:timeout_query_json_cache:millis", 3600000);

    /* renamed from: c7 */
    public static final zzbiu f27089c7;

    /* renamed from: c8 */
    public static final zzbiu f27090c8;

    /* renamed from: d */
    public static final zzbiu f27091d = zzbiu.m43511g(1, "gads:http_url_connection_factory:timeout_millis", SamsungIrisUnlockModule.IRIS_ACQUIRED_VENDOR_EVENT_BASE);

    /* renamed from: d0 */
    public static final zzbiu f27092d0 = zzbiu.m43512h(1, "gads:sai:timeout_ms", -1);

    /* renamed from: d1 */
    public static final zzbiu f27093d1 = zzbiu.m43514j(1, "gads:spherical_video:fragment_shader", "");

    /* renamed from: d2 */
    public static final zzbiu f27094d2;

    /* renamed from: d3 */
    public static final zzbiu f27095d3;

    /* renamed from: d4 */
    public static final zzbiu f27096d4 = zzbiu.m43514j(1, "gad:publisher_testing:force_local_request:enabled_list", "");

    /* renamed from: d5 */
    public static final zzbiu f27097d5 = zzbiu.m43511g(1, "gads:adoverlay:b68684796:sdk_int:lower_bound", 27);

    /* renamed from: d6 */
    public static final zzbiu f27098d6;

    /* renamed from: d7 */
    public static final zzbiu f27099d7;

    /* renamed from: d8 */
    public static final zzbiu f27100d8 = zzbiu.m43511g(1, "gads:max_timeout_view_click_ms", 1000);

    /* renamed from: e */
    public static final zzbiu f27101e = zzbiu.m43514j(1, "gads:video_exo_player:version", ExifInterface.GPS_MEASUREMENT_3D);

    /* renamed from: e0 */
    public static final zzbiu f27102e0 = zzbiu.m43511g(1, "gads:sai:scion_thread_pool_size", 5);

    /* renamed from: e1 */
    public static final zzbiu f27103e1;

    /* renamed from: e2 */
    public static final zzbiu f27104e2 = zzbiu.m43512h(1, "gads:gestures:task_timeout", 2000);

    /* renamed from: e3 */
    public static final zzbiu f27105e3;

    /* renamed from: e4 */
    public static final zzbiu f27106e4 = zzbiu.m43514j(1, "gad:publisher_testing:force_local_request:disabled_list", "");

    /* renamed from: e5 */
    public static final zzbiu f27107e5 = zzbiu.m43511g(1, "gads:adoverlay:b68684796:sdk_int:upper_bound", 26);

    /* renamed from: e6 */
    public static final zzbiu f27108e6;

    /* renamed from: e7 */
    public static final zzbiu f27109e7 = zzbiu.m43511g(1, "gads:ad_error_api:min_version", 202006000);

    /* renamed from: e8 */
    public static final zzbiu f27110e8;

    /* renamed from: f */
    public static final zzbiu f27111f = zzbiu.m43511g(1, "gads:video_exo_player:connect_timeout", 8000);

    /* renamed from: f0 */
    public static final zzbiu f27112f0;

    /* renamed from: f1 */
    public static final zzbiu f27113f1 = zzbiu.m43512h(1, "gads:position_watcher:throttle_ms", 200);

    /* renamed from: f2 */
    public static final zzbiu f27114f2;

    /* renamed from: f3 */
    public static final zzbiu f27115f3;

    /* renamed from: f4 */
    public static final zzbiu f27116f4 = zzbiu.m43511g(1, "gad:http_redirect_max_count:times", 8);

    /* renamed from: f5 */
    public static final zzbiu f27117f5;

    /* renamed from: f6 */
    public static final zzbiu f27118f6;

    /* renamed from: f7 */
    public static final zzbiu f27119f7;

    /* renamed from: f8 */
    public static final zzbiu f27120f8;

    /* renamed from: g */
    public static final zzbiu f27121g = zzbiu.m43511g(1, "gads:video_exo_player:read_timeout", 8000);

    /* renamed from: g0 */
    public static final zzbiu f27122g0 = zzbiu.m43511g(1, "gads:sai:app_measurement_min_client_dynamite_version", 20290);

    /* renamed from: g1 */
    public static final zzbiu f27123g1 = zzbiu.m43512h(1, "gads:position_watcher:scroll_aware_throttle_ms", 33);

    /* renamed from: g2 */
    public static final zzbiu f27124g2;

    /* renamed from: g3 */
    public static final zzbiu f27125g3;

    /* renamed from: g4 */
    public static final zzbiu f27126g4;

    /* renamed from: g5 */
    public static final zzbiu f27127g5;

    /* renamed from: g6 */
    public static final zzbiu f27128g6;

    /* renamed from: g7 */
    public static final zzbiu f27129g7;

    /* renamed from: g8 */
    public static final zzbiu f27130g8 = zzbiu.m43511g(1, "gads:h5ads:max_num_ad_objects", 10);

    /* renamed from: h */
    public static final zzbiu f27131h = zzbiu.m43511g(1, "gads:video_exo_player:loading_check_interval", 1048576);

    /* renamed from: h0 */
    public static final zzbiu f27132h0;

    /* renamed from: h1 */
    public static final zzbiu f27133h1;

    /* renamed from: h2 */
    public static final zzbiu f27134h2;

    /* renamed from: h3 */
    public static final zzbiu f27135h3;

    /* renamed from: h4 */
    public static final zzbiu f27136h4 = zzbiu.m43511g(1, "gads:omid:destroy_webview_delay", 1000);

    /* renamed from: h5 */
    public static final zzbiu f27137h5;

    /* renamed from: h6 */
    public static final zzbiu f27138h6;

    /* renamed from: h7 */
    public static final zzbiu f27139h7 = zzbiu.m43511g(1, "gads:mediation_no_fill_error:min_version", 999999999);

    /* renamed from: h8 */
    public static final zzbiu f27140h8 = zzbiu.m43511g(1, "gads:h5ads:max_gmsg_length", SamsungIrisUnlockModule.IRIS_ERROR_NEED_TO_RETRY);

    /* renamed from: i */
    public static final zzbiu f27141i = zzbiu.m43511g(1, "gads:video_exo_player:exo_player_precache_limit", Integer.MAX_VALUE);

    /* renamed from: i0 */
    public static final zzbiu f27142i0;

    /* renamed from: i1 */
    public static final zzbiu f27143i1;

    /* renamed from: i2 */
    public static final zzbiu f27144i2;

    /* renamed from: i3 */
    public static final zzbiu f27145i3 = zzbiu.m43512h(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);

    /* renamed from: i4 */
    public static final zzbiu f27146i4;

    /* renamed from: i5 */
    public static final zzbiu f27147i5 = zzbiu.m43514j(1, "gads:sp:json_string", "");

    /* renamed from: i6 */
    public static final zzbiu f27148i6;

    /* renamed from: i7 */
    public static final zzbiu f27149i7;

    /* renamed from: i8 */
    public static final zzbiu f27150i8 = zzbiu.m43514j(1, "gads:h5ads:afma_prefix", "(window.AFMA_ReceiveMessage||function(msg,params){window.h5_iframe.contentWindow.postMessage({messageName:'receive_message_action',parameters:{messageName:msg,parameters:params}},'*');})");

    /* renamed from: j */
    public static final zzbiu f27151j = zzbiu.m43511g(1, "gads:video_exo_player:byte_buffer_precache_limit", Integer.MAX_VALUE);

    /* renamed from: j0 */
    public static final zzbiu f27152j0;

    /* renamed from: j1 */
    public static final zzbiu f27153j1;

    /* renamed from: j2 */
    public static final zzbiu f27154j2;

    /* renamed from: j3 */
    public static final zzbiu f27155j3 = zzbiu.m43512h(1, "gads:parental_controls:timeout", 2000);

    /* renamed from: j4 */
    public static final zzbiu f27156j4;

    /* renamed from: j5 */
    public static final zzbiu f27157j5;

    /* renamed from: j6 */
    public static final zzbiu f27158j6;

    /* renamed from: j7 */
    public static final zzbiu f27159j7 = zzbiu.m43511g(1, "gads:offline_database_version:version", 1);

    /* renamed from: j8 */
    public static final zzbiu f27160j8;

    /* renamed from: k */
    public static final zzbiu f27161k = zzbiu.m43511g(1, "gads:video_exo_player_socket_receive_buffer_size", 0);

    /* renamed from: k0 */
    public static final zzbiu f27162k0;

    /* renamed from: k1 */
    public static final zzbiu f27163k1 = zzbiu.m43514j(1, "gads:logged_adapter_version_classes", "");

    /* renamed from: k2 */
    public static final zzbiu f27164k2;

    /* renamed from: k3 */
    public static final zzbiu f27165k3 = zzbiu.m43511g(1, "gads:cache:ad_request_timeout_millis", ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);

    /* renamed from: k4 */
    public static final zzbiu f27166k4;

    /* renamed from: k5 */
    public static final zzbiu f27167k5 = zzbiu.m43511g(1, "gads:nativeads:image:sample:pixels", 1048576);

    /* renamed from: k6 */
    public static final zzbiu f27168k6 = zzbiu.m43512h(1, "gads:timeout_signal_collection_in_exp:millis", 1000);

    /* renamed from: k7 */
    public static final zzbiu f27169k7;

    /* renamed from: k8 */
    public static final zzbiu f27170k8;

    /* renamed from: l */
    public static final zzbiu f27171l = zzbiu.m43511g(1, "gads:video_exo_player:min_retry_count", -1);

    /* renamed from: l0 */
    public static final zzbiu f27172l0;

    /* renamed from: l1 */
    public static final zzbiu f27173l1 = zzbiu.m43512h(1, "gads:rtb_v1_1:signal_timeout_ms", 1000);

    /* renamed from: l2 */
    public static final zzbiu f27174l2;

    /* renamed from: l3 */
    public static final zzbiu f27175l3 = zzbiu.m43511g(1, "gads:cache:max_concurrent_downloads", 10);

    /* renamed from: l4 */
    public static final zzbiu f27176l4;

    /* renamed from: l5 */
    public static final zzbiu f27177l5;

    /* renamed from: l6 */
    public static final zzbiu f27178l6;

    /* renamed from: l7 */
    public static final zzbiu f27179l7;

    /* renamed from: l8 */
    public static final zzbiu f27180l8;

    /* renamed from: m */
    public static final zzbiu f27181m;

    /* renamed from: m0 */
    public static final zzbiu f27182m0;

    /* renamed from: m1 */
    public static final zzbiu f27183m1 = zzbiu.m43514j(1, "gads:rtb_logging:regex", "(?!)");

    /* renamed from: m2 */
    public static final zzbiu f27184m2;

    /* renamed from: m3 */
    public static final zzbiu f27185m3;

    /* renamed from: m4 */
    public static final zzbiu f27186m4;

    /* renamed from: m5 */
    public static final zzbiu f27187m5;

    /* renamed from: m6 */
    public static final zzbiu f27188m6;

    /* renamed from: m7 */
    public static final zzbiu f27189m7;

    /* renamed from: m8 */
    public static final zzbiu f27190m8;

    /* renamed from: n */
    public static final zzbiu f27191n;

    /* renamed from: n0 */
    public static final zzbiu f27192n0;

    /* renamed from: n1 */
    public static final zzbiu f27193n1;

    /* renamed from: n2 */
    public static final zzbiu f27194n2;

    /* renamed from: n3 */
    public static final zzbiu f27195n3 = zzbiu.m43512h(1, "gads:cache:javascript_timeout_millis", 5000);

    /* renamed from: n4 */
    public static final zzbiu f27196n4 = zzbiu.m43514j(1, "gads:nonagon:banner:ad_unit_exclusions", "(?!)");

    /* renamed from: n5 */
    public static final zzbiu f27197n5 = zzbiu.m43511g(1, "gads:offline_signaling:log_maximum", 100);

    /* renamed from: n6 */
    public static final zzbiu f27198n6;

    /* renamed from: n7 */
    public static final zzbiu f27199n7;

    /* renamed from: n8 */
    public static final zzbiu f27200n8;

    /* renamed from: o */
    public static final zzbiu f27201o;

    /* renamed from: o0 */
    public static final zzbiu f27202o0;

    /* renamed from: o1 */
    public static final zzbiu f27203o1;

    /* renamed from: o2 */
    public static final zzbiu f27204o2;

    /* renamed from: o3 */
    public static final zzbiu f27205o3;

    /* renamed from: o4 */
    public static final zzbiu f27206o4;

    /* renamed from: o5 */
    public static final zzbiu f27207o5;

    /* renamed from: o6 */
    public static final zzbiu f27208o6;

    /* renamed from: o7 */
    public static final zzbiu f27209o7;

    /* renamed from: o8 */
    public static final zzbiu f27210o8;

    /* renamed from: p */
    public static final zzbiu f27211p;

    /* renamed from: p0 */
    public static final zzbiu f27212p0 = zzbiu.m43512h(1, "gads:sai:server_side_npa:ttl", TimeUnit.DAYS.toMillis(90));

    /* renamed from: p1 */
    public static final zzbiu f27213p1;

    /* renamed from: p2 */
    public static final zzbiu f27214p2 = zzbiu.m43512h(1, "gads:app_set_id_info_signal:timeout:millis", 2000);

    /* renamed from: p3 */
    public static final zzbiu f27215p3;

    /* renamed from: p4 */
    public static final zzbiu f27216p4 = zzbiu.m43511g(1, "gads:app_open_beta:min_version", 999999999);

    /* renamed from: p5 */
    public static final zzbiu f27217p5;

    /* renamed from: p6 */
    public static final zzbiu f27218p6;

    /* renamed from: p7 */
    public static final zzbiu f27219p7;

    /* renamed from: p8 */
    public static final zzbiu f27220p8 = zzbiu.m43511g(1, "gads:msa:visminalpha", 90);

    /* renamed from: q */
    public static final zzbiu f27221q = zzbiu.m43511g(1, "gads:video_exo_player:wait_timeout_ms", 500);

    /* renamed from: q0 */
    public static final zzbiu f27222q0 = zzbiu.m43514j(1, "gads:sai:server_side_npa:shared_preference_key_list", "{  \"__default__\": [    \"IABTCF_TCString\"  ],  \"mobileads_consent\": [    \"consent_string\"  ]}");

    /* renamed from: q1 */
    public static final zzbiu f27223q1;

    /* renamed from: q2 */
    public static final zzbiu f27224q2;

    /* renamed from: q3 */
    public static final zzbiu f27225q3;

    /* renamed from: q4 */
    public static final zzbiu f27226q4 = zzbiu.m43511g(1, "gads:app_open_ad_open_beta_api:min_version", 202490999);

    /* renamed from: q5 */
    public static final zzbiu f27227q5;

    /* renamed from: q6 */
    public static final zzbiu f27228q6;

    /* renamed from: q7 */
    public static final zzbiu f27229q7;

    /* renamed from: q8 */
    public static final zzbiu f27230q8;

    /* renamed from: r */
    public static final zzbiu f27231r;

    /* renamed from: r0 */
    public static final zzbiu f27232r0;

    /* renamed from: r1 */
    public static final zzbiu f27233r1;

    /* renamed from: r2 */
    public static final zzbiu f27234r2;

    /* renamed from: r3 */
    public static final zzbiu f27235r3 = zzbiu.m43512h(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));

    /* renamed from: r4 */
    public static final zzbiu f27236r4;

    /* renamed from: r5 */
    public static final zzbiu f27237r5;

    /* renamed from: r6 */
    public static final zzbiu f27238r6;

    /* renamed from: r7 */
    public static final zzbiu f27239r7;

    /* renamed from: r8 */
    public static final zzbiu f27240r8;

    /* renamed from: s */
    public static final zzbiu f27241s = zzbiu.m43511g(1, "gads:video_stream_cache:limit_count", 5);

    /* renamed from: s0 */
    public static final zzbiu f27242s0;

    /* renamed from: s1 */
    public static final zzbiu f27243s1;

    /* renamed from: s2 */
    public static final zzbiu f27244s2;

    /* renamed from: s3 */
    public static final zzbiu f27245s3;

    /* renamed from: s4 */
    public static final zzbiu f27246s4 = zzbiu.m43514j(1, "gads:nonagon:app_open:ad_unit_exclusions", "(?!)");

    /* renamed from: s5 */
    public static final zzbiu f27247s5;

    /* renamed from: s6 */
    public static final zzbiu f27248s6 = zzbiu.m43514j(1, "gads:scar_v2:user_agent:key", "ua");

    /* renamed from: s7 */
    public static final zzbiu f27249s7;

    /* renamed from: s8 */
    public static final zzbiu f27250s8;

    /* renamed from: t */
    public static final zzbiu f27251t = zzbiu.m43511g(1, "gads:video_stream_cache:limit_space", 8388608);

    /* renamed from: t0 */
    public static final zzbiu f27252t0;

    /* renamed from: t1 */
    public static final zzbiu f27253t1;

    /* renamed from: t2 */
    public static final zzbiu f27254t2;

    /* renamed from: t3 */
    public static final zzbiu f27255t3;

    /* renamed from: t4 */
    public static final zzbiu f27256t4;

    /* renamed from: t5 */
    public static final zzbiu f27257t5;

    /* renamed from: t6 */
    public static final zzbiu f27258t6;

    /* renamed from: t7 */
    public static final zzbiu f27259t7;

    /* renamed from: t8 */
    public static final zzbiu f27260t8 = zzbiu.m43511g(1, "gads:timeout_for_show_call_succeed:ms", PathInterpolatorCompat.MAX_NUM_POINTS);

    /* renamed from: u */
    public static final zzbiu f27261u = zzbiu.m43511g(1, "gads:video_stream_exo_cache:buffer_size", 8388608);

    /* renamed from: u0 */
    public static final zzbiu f27262u0 = zzbiu.m43514j(1, "gads:idless:cookie_modification", "=; Max-Age=-1; path=/; domain=.doubleclick.net");

    /* renamed from: u1 */
    public static final zzbiu f27263u1;

    /* renamed from: u2 */
    public static final zzbiu f27264u2;

    /* renamed from: u3 */
    public static final zzbiu f27265u3;

    /* renamed from: u4 */
    public static final zzbiu f27266u4;

    /* renamed from: u5 */
    public static final zzbiu f27267u5;

    /* renamed from: u6 */
    public static final zzbiu f27268u6 = zzbiu.m43514j(1, "gads:scar_v2:prior_click_count:key", "pcc");

    /* renamed from: u7 */
    public static final zzbiu f27269u7 = zzbiu.m43511g(1, "gads:remote_log_send_rate_ms", 60000);

    /* renamed from: u8 */
    public static final zzbiu f27270u8;

    /* renamed from: v */
    public static final zzbiu f27271v = zzbiu.m43512h(1, "gads:video_stream_cache:limit_time_sec", 300);

    /* renamed from: v0 */
    public static final zzbiu f27272v0;

    /* renamed from: v1 */
    public static final zzbiu f27273v1 = zzbiu.m43511g(1, "gads:native_ad_options_rtb:min_version", 204890000);

    /* renamed from: v2 */
    public static final zzbiu f27274v2 = zzbiu.m43514j(1, "gads:gestures:pk", "");

    /* renamed from: v3 */
    public static final zzbiu f27275v3 = zzbiu.m43512h(1, "gads:cache:connection_timeout", 5000);

    /* renamed from: v4 */
    public static final zzbiu f27276v4 = zzbiu.m43514j(1, "gads:nonagon:interstitial:ad_unit_exclusions", "(?!)");

    /* renamed from: v5 */
    public static final zzbiu f27277v5;

    /* renamed from: v6 */
    public static final zzbiu f27278v6 = zzbiu.m43514j(1, "gads:scar_v2:pings_from_gma:key", "is_gma");

    /* renamed from: v7 */
    public static final zzbiu f27279v7 = zzbiu.m43511g(1, "gads:remote_log_queue_max_entries", 500);

    /* renamed from: v8 */
    public static final zzbiu f27280v8;

    /* renamed from: w */
    public static final zzbiu f27281w = zzbiu.m43512h(1, "gads:video_stream_cache:notify_interval_millis", 125);

    /* renamed from: w0 */
    public static final zzbiu f27282w0;

    /* renamed from: w1 */
    public static final zzbiu f27283w1;

    /* renamed from: w2 */
    public static final zzbiu f27284w2;

    /* renamed from: w3 */
    public static final zzbiu f27285w3 = zzbiu.m43512h(1, "gads:cache:read_only_connection_timeout", 5000);

    /* renamed from: w4 */
    public static final zzbiu f27286w4;

    /* renamed from: w5 */
    public static final zzbiu f27287w5 = zzbiu.m43511g(1, "gads:rewarded_precache_pool:count", 0);

    /* renamed from: w6 */
    public static final zzbiu f27288w6;

    /* renamed from: w7 */
    public static final zzbiu f27289w7 = zzbiu.m43514j(1, "gads:remote_capture_service_url", "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1");

    /* renamed from: w8 */
    public static final zzbiu f27290w8;

    /* renamed from: x */
    public static final zzbiu f27291x = zzbiu.m43511g(1, "gads:video_stream_cache:connect_timeout_millis", SamsungIrisUnlockModule.IRIS_ACQUIRED_VENDOR_EVENT_BASE);

    /* renamed from: x0 */
    public static final zzbiu f27292x0;

    /* renamed from: x1 */
    public static final zzbiu f27293x1;

    /* renamed from: x2 */
    public static final zzbiu f27294x2;

    /* renamed from: x3 */
    public static final zzbiu f27295x3;

    /* renamed from: x4 */
    public static final zzbiu f27296x4;

    /* renamed from: x5 */
    public static final zzbiu f27297x5 = zzbiu.m43511g(1, "gads:interstitial_precache_pool:count", 0);

    /* renamed from: x6 */
    public static final zzbiu f27298x6 = zzbiu.m43514j(1, "gads:scar:google_click_paths", "/aclk,/pcs/click,/dbm/clk");

    /* renamed from: x7 */
    public static final zzbiu f27299x7 = zzbiu.m43511g(1, "gads:cui_monitoring_interval_ms", 300000);

    /* renamed from: x8 */
    public static final zzbiu f27300x8;

    /* renamed from: y */
    public static final zzbiu f27301y = zzbiu.m43514j(1, "gads:video:metric_frame_hash_times", "");

    /* renamed from: y0 */
    public static final zzbiu f27302y0;

    /* renamed from: y1 */
    public static final zzbiu f27303y1;

    /* renamed from: y2 */
    public static final zzbiu f27304y2;

    /* renamed from: y3 */
    public static final zzbiu f27305y3;

    /* renamed from: y4 */
    public static final zzbiu f27306y4 = zzbiu.m43514j(1, "gads:nonagon:rewardedvideo:ad_unit_exclusions", "(?!)");

    /* renamed from: y5 */
    public static final zzbiu f27307y5 = zzbiu.m43514j(1, "gads:rewarded_precache_pool:discard_strategy", "lru");

    /* renamed from: y6 */
    public static final zzbiu f27308y6 = zzbiu.m43514j(1, "gads:scar:google_click_domain_suffixes", ".doubleclick.net,.googleadservices.com");

    /* renamed from: y7 */
    public static final zzbiu f27309y7 = zzbiu.m43511g(1, "gads:cui_buffer_size", 1000);

    /* renamed from: y8 */
    public static final zzbiu f27310y8;

    /* renamed from: z */
    public static final zzbiu f27311z = zzbiu.m43512h(1, "gads:video:metric_frame_hash_time_leniency", 500);

    /* renamed from: z0 */
    public static final zzbiu f27312z0;

    /* renamed from: z1 */
    public static final zzbiu f27313z1;

    /* renamed from: z2 */
    public static final zzbiu f27314z2;

    /* renamed from: z3 */
    public static final zzbiu f27315z3;

    /* renamed from: z4 */
    public static final zzbiu f27316z4;

    /* renamed from: z5 */
    public static final zzbiu f27317z5 = zzbiu.m43514j(1, "gads:interstitial_precache_pool:discard_strategy", "lru");

    /* renamed from: z6 */
    public static final zzbiu f27318z6 = zzbiu.m43514j(1, "gads:scar:google_view_paths", "/pagead/adview,/pcs/view,/pagead/conversion,/dbm/ad");

    /* renamed from: z7 */
    public static final zzbiu f27319z7 = zzbiu.m43511g(1, "gads:cuj_automatic_flush_delay_ms", 30000);

    /* renamed from: z8 */
    public static final zzbiu f27320z8;

    static {
        Boolean bool = Boolean.TRUE;
        f27181m = zzbiu.m43513i(1, "gads:video_exo_player:fmp4_extractor_enabled", bool);
        Boolean bool2 = Boolean.FALSE;
        f27191n = zzbiu.m43513i(1, "gads:video_exo_player:use_play_back_info_for_should_start_play_back", bool2);
        f27201o = zzbiu.m43513i(1, "gads:video_exo_player:treat_load_exception_as_non_fatal", bool);
        f27211p = zzbiu.m43513i(1, "gads:video_exo_player:wait_with_timeout", bool2);
        f27231r = zzbiu.m43513i(1, "gads:null_key_bundle_to_json:enabled", bool2);
        f26806A = zzbiu.m43513i(1, "gads:video:force_watermark", bool2);
        f26826C = zzbiu.m43513i(1, "gads:video:spinner:enabled", bool2);
        f26836D = zzbiu.m43513i(1, "gads:video:shutter:enabled", bool2);
        f26866G = zzbiu.m43513i(1, "gads:video:aggressive_media_codec_release", bool2);
        f26876H = zzbiu.m43513i(1, "gads:memory_bundle:debug_info", bool2);
        f26946O = zzbiu.m43513i(1, "gads:mraid:expanded_interstitial_fix", bool2);
        f26956P = zzbiu.m43513i(1, "gads:mraid:initial_size_fallback", bool2);
        f27016V = zzbiu.m43513i(1, "gads:content_fetch_disable_get_title_from_webview", bool2);
        f27025W = zzbiu.m43513i(1, "gads:content_fetch_enable_new_content_score", bool2);
        f27034X = zzbiu.m43513i(1, "gads:content_fetch_enable_serve_once", bool2);
        f27043Y = zzbiu.m43513i(1, "gads:sai:enabled", bool);
        f27072b0 = zzbiu.m43513i(1, "gads:sai:using_macro:enabled", bool2);
        f27112f0 = zzbiu.m43513i(1, "gads:sai:app_measurement_enabled3", bool2);
        f27132h0 = zzbiu.m43513i(1, "gads:sai:force_through_reflection", bool);
        f27142i0 = zzbiu.m43513i(1, "gads:sai:gmscore_availability_check_disabled", bool2);
        f27152j0 = zzbiu.m43513i(1, "gads:sai:logging_disabled_for_drx", bool2);
        f27162k0 = zzbiu.m43513i(1, "gads:sai:app_measurement_npa_enabled", bool2);
        f27172l0 = zzbiu.m43513i(1, "gads:idless:idless_disables_attestation", bool);
        f27182m0 = zzbiu.m43513i(1, "gads:idless:app_measurement_idless_enabled", bool);
        f27192n0 = zzbiu.m43513i(1, "gads:sai:server_side_npa:disable_writing", bool2);
        f27202o0 = zzbiu.m43513i(1, "gads:sai:server_side_npa:enabled", bool2);
        f27232r0 = zzbiu.m43513i(1, "gads:idless:internal_state_enabled", bool);
        f27242s0 = zzbiu.m43513i(1, "gads:idless:idless_disables_offline_ads_signalling", bool);
        f27252t0 = zzbiu.m43513i(1, "gads:custom_idless:enabled", bool2);
        f27272v0 = zzbiu.m43513i(1, "gads:idless_native_check:disabled", bool2);
        f27282w0 = zzbiu.m43513i(1, "gads:tfcd_deny_ad_storage:enabled", bool2);
        f27292x0 = zzbiu.m43513i(1, "gads:tfua_deny_ad_storage:enabled", bool2);
        f27302y0 = zzbiu.m43513i(1, "gads:interstitial:app_must_be_foreground:enabled", bool2);
        f27312z0 = zzbiu.m43513i(1, "gads:interstitial:foreground_report:enabled", bool2);
        f26807A0 = zzbiu.m43513i(1, "gads:interstitial:default_immersive", bool2);
        f26827C0 = zzbiu.m43513i(1, "gads:interstitial:ad_overlay_omit_ad_html", bool2);
        f26837D0 = zzbiu.m43513i(1, "gads:webview:error_web_response:enabled", bool2);
        f26847E0 = zzbiu.m43513i(1, "gads:webview:set_fixed_text_zoom", bool);
        f26857F0 = zzbiu.m43513i(1, "gads:webviewgone:kill_process:enabled", bool2);
        f26867G0 = zzbiu.m43513i(1, "gads:webviewgone:new_onshow:enabled", bool2);
        f26887I0 = zzbiu.m43513i(1, "gads:webview_cookie_filter:enabled", bool2);
        f26897J0 = zzbiu.m43513i(1, "gads:new_rewarded_ad:enabled", bool);
        f26907K0 = zzbiu.m43513i(1, "gads:rewarded:adapter_initialization_enabled", bool2);
        f26917L0 = zzbiu.m43513i(1, "gads:rewarded:ad_metadata_enabled", bool2);
        f26947O0 = zzbiu.m43513i(1, "gads:adid_values_in_adrequest:enabled", bool2);
        f26967Q0 = zzbiu.m43513i(1, "gads:disable_adid_values_in_ms", bool2);
        f26987S0 = zzbiu.m43513i(1, "gads:custom_close_blocking:enabled", bool2);
        f26997T0 = zzbiu.m43513i(1, "gads:disabling_closable_area:enabled", bool2);
        f27007U0 = zzbiu.m43513i(1, "gads:force_top_right_close_button:enabled", bool2);
        f27035X0 = zzbiu.m43513i(1, "gads:disable_click_during_fade_in", bool2);
        f27044Y0 = zzbiu.m43513i(1, "gads:use_system_ui_for_fullscreen:enabled", bool2);
        f27053Z0 = zzbiu.m43513i(1, "gads:ad_overlay:collect_cutout_info:enabled", bool2);
        f27073b1 = zzbiu.m43513i(1, "gads:server_transaction_for_banner_refresh:enabled", bool2);
        f27103e1 = zzbiu.m43513i(1, "gads:include_local_global_rectangles", bool2);
        f27133h1 = zzbiu.m43513i(1, "gads:position_watcher:enable_scroll_aware_ads", bool2);
        f27143i1 = zzbiu.m43513i(1, "gads:position_watcher:send_scroll_data", bool2);
        f27153j1 = zzbiu.m43513i(1, "gads:gen204_signals:enabled", bool2);
        f27193n1 = zzbiu.m43513i(1, "gads:include_failure_to_instantiate_adapter:enabled", bool2);
        f27203o1 = zzbiu.m43513i(1, "gads:presentation_error:urls_enabled", bool);
        f27213p1 = zzbiu.m43513i(1, "gads:rtb_interstitial:use_fullscreen_monitor", bool);
        f27223q1 = zzbiu.m43513i(1, "gads:native_required_assets:enabled", bool2);
        f27233r1 = zzbiu.m43513i(1, "gads:native_required_assets:check_inner_mediaview:enabled", bool);
        f27243s1 = zzbiu.m43513i(1, "gads:include_timeout_in_rtb_signals:enabled", bool2);
        f27253t1 = zzbiu.m43513i(1, "gads:include_signal_error_code_in_rtb_signals:enabled", bool2);
        f27263u1 = zzbiu.m43513i(1, "gads:include_adapter_error_code_in_ans:enabled", bool2);
        f27283w1 = zzbiu.m43513i(1, "gads:track_view_next_runloop:enabled", bool2);
        f27293x1 = zzbiu.m43513i(1, "gads:synchronize_measurement_listener:enabled", bool2);
        f27303y1 = zzbiu.m43513i(1, "gads:native_required_assets:viewability:enabled", bool2);
        f27313z1 = zzbiu.m43513i(1, "gads:signal_adapters:enabled", bool2);
        f26838D1 = zzbiu.m43513i(1, "gads:additional_video_csi:enabled", bool);
        f26848E1 = zzbiu.m43513i(1, "gads:using_official_simple_exoplayer:enabled", bool2);
        f26858F1 = zzbiu.m43513i(1, "gads:multiple_video_playback:enabled", bool);
        f26868G1 = zzbiu.m43513i(1, "gads:pause_time_update_when_video_completed:enabled", bool2);
        f26878H1 = zzbiu.m43513i(1, "gads:video:use_range_http_data_source", bool2);
        f26908K1 = zzbiu.m43513i(1, "gads:run_exoplayer_video_stream_task_in_ui_thread:enabled", bool);
        f26918L1 = zzbiu.m43513i(1, "gads:csi:enabled_per_sampling", bool2);
        f26928M1 = zzbiu.m43513i(1, "gads:always_set_transfer_listener:enabled", bool2);
        f26938N1 = zzbiu.m43513i(1, "gads:initialization_csi:enabled", bool2);
        f26948O1 = zzbiu.m43513i(1, "gads:csi:enable_csi_latency_reporting", bool2);
        f26958P1 = zzbiu.m43513i(1, "gads:msa:experiments:enabled", bool2);
        f26968Q1 = zzbiu.m43513i(1, "gads:msa:experiments:ps:enabled", bool);
        f26978R1 = zzbiu.m43513i(1, "gads:msa:experiments:fb:enabled", bool);
        f26988S1 = zzbiu.m43513i(1, "gads:msa:experiments:ps:er", bool);
        f27008U1 = zzbiu.m43513i(1, "gads:msa:experiments:a2", bool2);
        f27018V1 = zzbiu.m43513i(1, "gads:msa:experiments:log", bool2);
        f27027W1 = zzbiu.m43513i(1, "gads:msa:experiments:vfb", bool);
        f27036X1 = zzbiu.m43513i(1, "gads:msa:experiments:incapi:enabled", bool);
        f27045Y1 = zzbiu.m43513i(1, "gads:msa:experiments:incapigass:enabled", bool2);
        f27074b2 = zzbiu.m43513i(1, "gads:gestures:clearTd:enabled", bool2);
        f27094d2 = zzbiu.m43513i(1, "gads:gestures:errorlogging:enabled", bool2);
        f27114f2 = zzbiu.m43513i(1, "gads:gestures:asig:enabled", bool2);
        f27124g2 = zzbiu.m43513i(1, "gads:gestures:ans:enabled", bool2);
        f27134h2 = zzbiu.m43513i(1, "gads:gestures:tos:enabled", bool2);
        f27144i2 = zzbiu.m43513i(1, "gads:gestures:imd:enabled", bool2);
        f27154j2 = zzbiu.m43513i(1, "gads:gestures:brt:enabled", bool);
        f27164k2 = zzbiu.m43513i(1, "gads:gestures:fpi:enabled", bool2);
        f27174l2 = zzbiu.m43513i(1, "gads:signal:app_permissions:disabled", bool2);
        f27184m2 = zzbiu.m43513i(1, "gads:signal:app_set_id_info_in_ad_request:enabled", bool2);
        f27194n2 = zzbiu.m43513i(1, "gads:signal:app_set_id_info_signal_latency_fix:enabled", bool2);
        f27204o2 = zzbiu.m43513i(1, "gads:app_set_id_info_signal:timeout:enabled", bool2);
        f27224q2 = zzbiu.m43513i(1, "gads:caching_app_set_id_info:enabled", bool2);
        f27234r2 = zzbiu.m43513i(1, "gads:signal:app_set_id_info_under_gmscore:enabled", bool2);
        f27244s2 = zzbiu.m43513i(1, "gads:signal:app_set_id_info_for_scar:enabled", bool);
        f27254t2 = zzbiu.m43513i(1, "gads:signal:ad_id_permission_signal:enabled", bool2);
        f27264u2 = zzbiu.m43513i(1, "gads:gestures:hpk:enabled", bool);
        f27284w2 = zzbiu.m43513i(1, "gads:gestures:bs:enabled", bool);
        f27294x2 = zzbiu.m43513i(1, "gads:gestures:check_initialization_thread:enabled", bool2);
        f27304y2 = zzbiu.m43513i(1, "gads:gestures:init_new_thread:enabled", bool);
        f27314z2 = zzbiu.m43513i(1, "gads:gestures:pds:enabled", bool);
        f26819B2 = zzbiu.m43513i(1, "gads:gestures:ns:enabled", bool);
        f26829C2 = zzbiu.m43513i(1, "gads:gestures:vtm:enabled", bool2);
        f26839D2 = zzbiu.m43513i(1, "gads:gestures:vdd:enabled", bool2);
        f26849E2 = zzbiu.m43513i(1, "gads:gestures:asvs:enabled", bool2);
        f26859F2 = zzbiu.m43513i(1, "gads:gadsignalsdelegate_ui_thread_fix:enabled", bool2);
        f26869G2 = zzbiu.m43513i(1, "gads:native:asset_view_touch_events", bool2);
        f26879H2 = zzbiu.m43513i(1, "gads:native:set_touch_listener_on_asset_views", bool);
        f26889I2 = zzbiu.m43513i(1, "gads:ais:enabled", bool);
        f26899J2 = zzbiu.m43513i(1, "gads:rewarded:ssv_options_holder_holder:enabled", bool2);
        f26909K2 = zzbiu.m43513i(1, "gads:stav:enabled", bool2);
        f26919L2 = zzbiu.m43513i(1, "gads:spam:impression_ui_idle:enable", bool2);
        f26969Q2 = zzbiu.m43513i(1, "gads:js_flags:disable_phenotype", bool2);
        f26999T2 = zzbiu.m43513i(1, "gads:native:get_native_ad_view_signals", bool2);
        f27028W2 = zzbiu.m43513i(1, "gads:enable_singleton_broadcast_receiver", bool2);
        f27037X2 = zzbiu.m43513i(1, "gads:native:media_view_match_parent:enabled", bool);
        f27046Y2 = zzbiu.m43513i(1, "gads:video:restrict_inside_web_view:enabled", bool2);
        f27055Z2 = zzbiu.m43513i(1, "gads:native:count_impression_for_assets", bool2);
        f27065a3 = zzbiu.m43513i(1, "gads:native:count_impression_on_mediaview_first_visible", bool2);
        f27075b3 = zzbiu.m43513i(1, "gads:native:count_impression_on_mediaview_entirely_visible", bool2);
        f27085c3 = zzbiu.m43513i(1, "gads:native:enable_enigma_watermarking", bool2);
        f27095d3 = zzbiu.m43513i(1, "gads:fluid_ad:use_wrap_content_height", bool2);
        f27105e3 = zzbiu.m43513i(1, "gads:rtb_v1_1:fetch_app_settings_using_cld:enabled", bool);
        f27115f3 = zzbiu.m43513i(1, "gads:get_request_signals_cld:enabled", bool);
        f27125g3 = zzbiu.m43513i(1, "gads:get_request_signals_common_cld:enabled", bool);
        f27135h3 = zzbiu.m43513i(1, "gads:rtb_v1_1:use_manifest_appid_cld:enabled", bool);
        f27185m3 = zzbiu.m43513i(1, "gads:cache:downloader_use_high_priority", bool2);
        f27205o3 = zzbiu.m43513i(1, "gads:cache:bind_on_foreground", bool2);
        f27215p3 = zzbiu.m43513i(1, "gads:cache:bind_on_init", bool2);
        f27225q3 = zzbiu.m43513i(1, "gads:cache:bind_on_request", bool2);
        f27245s3 = zzbiu.m43513i(1, "gads:cache:unbind_on_bg_thread", bool2);
        f27255t3 = zzbiu.m43513i(1, "gads:cache:use_cache_data_source", bool2);
        f27265u3 = zzbiu.m43513i(1, "gads:cache:connection_per_read", bool2);
        f27295x3 = zzbiu.m43513i(1, "gads:cache:read_inner_data_source_if_gcache_miss", bool2);
        f27305y3 = zzbiu.m43513i(1, "gads:cache:read_inner_data_source_if_gcache_not_downloaded", bool2);
        f27315z3 = zzbiu.m43513i(1, "gads:cache:function_call_timeout_v1:enabled", bool2);
        f26820B3 = zzbiu.m43513i(1, "gads:cache:add_itag_to_cache_key:enabled", bool);
        f26830C3 = zzbiu.m43513i(1, "gads:http_assets_cache:enabled", bool2);
        f26860F3 = zzbiu.m43513i(1, "gads:chrome_custom_tabs_browser:enabled", bool2);
        f26870G3 = zzbiu.m43513i(1, "gads:chrome_custom_tabs:disabled", bool2);
        f26880H3 = zzbiu.m43513i(1, "gads:chrome_custom_tabs_browser_v2:enabled", bool2);
        f26890I3 = zzbiu.m43513i(1, "gads:cct_v2_connection:enabled", bool2);
        f26900J3 = zzbiu.m43513i(1, "gads:cct_v2_direct_launch:enabled", bool2);
        f26910K3 = zzbiu.m43513i(1, "gads:chrome_custom_tabs_for_native_ads:enabled", bool2);
        f26920L3 = zzbiu.m43513i(1, "gad:cct_v2_beta:enabled", bool2);
        f26940N3 = zzbiu.m43513i(2, "CHROME_CUSTOM_TAB_OPT_OUT", bool2);
        f27020V3 = zzbiu.m43513i(1, "gad:interstitial_notify_publisher_without_delay", bool2);
        f27029W3 = zzbiu.m43513i(1, "gad:interstitial_for_multi_window", bool2);
        f27038X3 = zzbiu.m43513i(1, "gad:interstitial_ad_stay_active_in_multi_window", bool2);
        f27047Y3 = zzbiu.m43513i(1, "gad:interstitial_multi_window_method", bool2);
        f27066a4 = zzbiu.m43513i(1, "gads:clearcut_logging:enabled", bool2);
        f27076b4 = zzbiu.m43513i(1, "gads:clearcut_logging:write_to_file", bool2);
        f27086c4 = zzbiu.m43513i(1, "gad:publisher_testing:force_local_request:enabled", bool);
        f27126g4 = zzbiu.m43513i(1, "gads:omid:enabled", bool);
        f27146i4 = zzbiu.m43513i(1, "gads:omid_use_admob_impl_dependency:enabled", bool);
        f27156j4 = zzbiu.m43513i(1, "gads:omid_use_base_64_encoding_for_native_html:enabled", bool);
        f27166k4 = zzbiu.m43513i(1, "gads:omid_use_media_type_for_native:enabled", bool2);
        f27176l4 = zzbiu.m43513i(1, "gads:omid_use_impression_listener_full_screen:enabled", bool2);
        f27186m4 = zzbiu.m43513i(1, "gads:nonagon:banner:enabled", bool);
        f27206o4 = zzbiu.m43513i(1, "gads:nonagon:app_open:enabled", bool);
        f27236r4 = zzbiu.m43513i(1, "gads:nonagon:app_open_app_switch_signal:enabled", bool2);
        f27256t4 = zzbiu.m43513i(1, "gads:nonagon:app_open_ad_show_emitter:enabled", bool2);
        f27266u4 = zzbiu.m43513i(1, "gads:nonagon:interstitial:enabled", bool);
        f27286w4 = zzbiu.m43513i(1, "gads:nonagon:rewardedvideo:enabled", bool);
        f27296x4 = zzbiu.m43513i(1, "gads:nonagon:mobile_ads_setting_manager:enabled", bool);
        f27316z4 = zzbiu.m43513i(1, "gads:nonagon:banner:check_dp_size", bool);
        f26811A4 = zzbiu.m43513i(1, "gads:nonagon:rewarded:load_multiple_ads", bool);
        f26821B4 = zzbiu.m43513i(1, "gads:nonagon:return_no_fill_error_code", bool2);
        f26831C4 = zzbiu.m43513i(1, "gads:nonagon:continue_on_no_fill", bool2);
        f26841D4 = zzbiu.m43513i(1, "gads:nonagon:separate_timeout:enabled", bool);
        f26861F4 = zzbiu.m43513i(1, "gads:nonagon:banner_recursive_renderer", bool2);
        f26871G4 = zzbiu.m43513i(1, "gads:nonagon:app_stats_lock:enabled", bool2);
        f26881H4 = zzbiu.m43513i(1, "gads:nonagon:app_stats_main_thread:enabled", bool2);
        f26891I4 = zzbiu.m43513i(1, "gads:uri_query_to_map_bg_thread:enabled", bool2);
        f26921L4 = zzbiu.m43513i(1, "gads:nonagon:active_view_gmsg_background_thread:enabled", bool);
        f26931M4 = zzbiu.m43513i(1, "gads:active_view_gmsg_separate_pool:enabled", bool);
        f26941N4 = zzbiu.m43513i(1, "gads:active_view_audio_signal_audio_mode:enabled", bool2);
        f26951O4 = zzbiu.m43513i(1, "gads:signals:ad_id_info:enabled", bool2);
        f26961P4 = zzbiu.m43513i(1, "gads:signals:app_index:enabled", bool2);
        f26971Q4 = zzbiu.m43513i(1, "gads:signals:attestation_token:enabled", bool2);
        f26981R4 = zzbiu.m43513i(1, "gads:signals:cache:enabled", bool2);
        f26991S4 = zzbiu.m43513i(1, "gads:signals:doritos:enabled", bool2);
        f27001T4 = zzbiu.m43513i(1, "gads:signals:doritos:v1:enabled", bool2);
        f27011U4 = zzbiu.m43513i(1, "gads:signals:doritos:v2:immediate:enabled", bool2);
        f27021V4 = zzbiu.m43513i(1, "gads:signals:parental_control:enabled", bool2);
        f27030W4 = zzbiu.m43513i(1, "gads:signals:video_decoder:enabled", bool2);
        f27039X4 = zzbiu.m43513i(1, "gads:signals:banner_hardware_acceleration:enabled", bool2);
        f27048Y4 = zzbiu.m43513i(1, "gads:signals:native_hardware_acceleration:enabled", bool2);
        f27057Z4 = zzbiu.m43513i(1, "gads:attestation_token:enabled", bool2);
        f27117f5 = zzbiu.m43513i(1, "gads:consent:shared_preference_reading:enabled", bool);
        f27127g5 = zzbiu.m43513i(1, "gads:consent:iab_consent_info:enabled", bool);
        f27137h5 = zzbiu.m43513i(1, "gads:fc_consent:shared_preference_reading:enabled", bool);
        f27157j5 = zzbiu.m43513i(1, "gads:nativeads:image:sample:enabled", bool);
        f27177l5 = zzbiu.m43513i(1, "gads:nativeads:pub_image_scale_type:enabled", bool);
        f27187m5 = zzbiu.m43513i(1, "gads:offline_signaling:enabled", bool2);
        f27207o5 = zzbiu.m43513i(1, "gads:nativeads:template_signal:enabled", bool);
        f27217p5 = zzbiu.m43513i(1, "gads:nativeads:media_content_aspect_ratio:enabled", bool);
        f27227q5 = zzbiu.m43513i(1, "gads:nativeads:media_content_metadata:enabled", bool);
        f27237r5 = zzbiu.m43513i(1, "gads:buffer_click_url_as_ready_to_ping:enabled", bool2);
        f27247s5 = zzbiu.m43513i(1, "gads:predictive_prefetch_from_cld:enabled", bool2);
        f27257t5 = zzbiu.m43513i(1, "gads:cache_layer_from_cld:enabled", bool2);
        f27267u5 = zzbiu.m43513i(1, "gads:cache_layer_wait_for_app_settings:enabled", bool2);
        f27277v5 = zzbiu.m43513i(1, "gads:precache_pool:verbose_logging", bool2);
        f26952O5 = zzbiu.m43513i(1, "gads:memory_leak:b129558083", bool2);
        f26962P5 = zzbiu.m43513i(1, "gads:unhandled_event_reporting:enabled", bool2);
        f26972Q5 = zzbiu.m43513i(1, "gads:response_info:enabled", bool);
        f26982R5 = zzbiu.m43513i(1, "gads:ad_source_response_info:enabled", bool);
        f26992S5 = zzbiu.m43513i(1, "gads:loaded_adapter_response_response_info:enabled", bool);
        f27002T5 = zzbiu.m43513i(1, "gads:response_info_extras:enabled", bool);
        f27012U5 = zzbiu.m43513i(1, "gads:csi:interstitial_failed_to_show:enabled", bool2);
        f27022V5 = zzbiu.m43513i(1, "gads:csi:mediation_failure:enabled", bool2);
        f27040X5 = zzbiu.m43513i(1, "gads:csi:eids_from_cld:enabled", bool2);
        f27049Y5 = zzbiu.m43513i(1, "gads:request_id_check:enabled", bool2);
        f27058Z5 = zzbiu.m43513i(1, "gads:request_id_int32:enabled", bool);
        f27068a6 = zzbiu.m43513i(1, "gads:render_decouple:enabled", bool);
        f27098d6 = zzbiu.m43513i(1, "gads:scar_csi:enabled", bool);
        f27108e6 = zzbiu.m43513i(1, "gads:scar_csi_sampling:enabled", bool2);
        f27118f6 = zzbiu.m43513i(1, "gads:query_map_eviction_fullinfo:enabled", bool2);
        f27128g6 = zzbiu.m43513i(1, "gads:query_map_update_bg_thread:enabled", bool2);
        f27138h6 = zzbiu.m43513i(1, "gads:query_map_eviction_ping:enabled", bool2);
        f27148i6 = zzbiu.m43513i(1, "gads:scar_signal_comparison_experiment:enabled", bool2);
        f27158j6 = zzbiu.m43513i(1, "gads:scar_signal_comparison_format:unknown", bool2);
        f27178l6 = zzbiu.m43513i(1, "gads:scar_trustless_token_for_gbid:enabled", bool2);
        f27188m6 = zzbiu.m43513i(1, "gads:disable_token_under_idless:enabled", bool2);
        f27198n6 = zzbiu.m43513i(1, "gads:scar_encryption_key_for_gbid:enabled", bool2);
        f27208o6 = zzbiu.m43513i(1, "gads:scar_decrypt_csi_for_gbid:enabled", bool2);
        f27218p6 = zzbiu.m43513i(1, "gads:scar_v2:send_click_ping:enabled", bool2);
        f27228q6 = zzbiu.m43513i(1, "gads:scar_v2:send_impression_pings:enabled", bool2);
        f27238r6 = zzbiu.m43513i(1, "gads:scar_v2:user_agent:enabled", bool2);
        f27258t6 = zzbiu.m43513i(1, "gads:scar_v2:prior_click_count:enabled", bool2);
        f27288w6 = zzbiu.m43513i(1, "gads:scar:use_flag_regexes:enabled", bool);
        f26823B6 = zzbiu.m43513i(1, "gads:scar:ping_non_google_urls:enabled", bool2);
        f26833C6 = zzbiu.m43513i(1, "gads:scar_format_fix:enabled", bool2);
        f26843D6 = zzbiu.m43513i(1, "gads:scar_csi_v47:enabled", bool2);
        f26853E6 = zzbiu.m43513i(1, "gads:scar_csi_format_fix:enabled", bool2);
        f26863F6 = zzbiu.m43513i(1, "gads:signal_collection_without_rendering:enabled", bool);
        f26883H6 = zzbiu.m43513i(2, "DISABLE_CRASH_REPORTING", bool2);
        f26893I6 = zzbiu.m43513i(1, "gads:paid_event_listener:enabled", bool);
        f26903J6 = zzbiu.m43513i(1, "gads:interscroller_ad:enabled", bool);
        f26913K6 = zzbiu.m43513i(1, "gads:interscroller_ad:refresh:enabled", bool2);
        f26943N6 = zzbiu.m43513i(1, "gads:is_in_scroll_view_new_api:enabled", bool);
        f26953O6 = zzbiu.m43513i(1, "gads:nas_collect_mediaview_matrix:enabled", bool2);
        f26963P6 = zzbiu.m43513i(1, "gads:nas_collect_layout_params:enabled", bool2);
        f26973Q6 = zzbiu.m43513i(1, "gads:policy_validator_for_all_pubs:enabled", bool);
        f27003T6 = zzbiu.m43513i(2, "NATIVE_AD_DEBUGGER_ENABLED", bool);
        f27032W6 = zzbiu.m43513i(1, "gads:use_wide_viewport:enabled", bool2);
        f27041X6 = zzbiu.m43513i(1, "gads:load_with_overview_mode:enabled", bool2);
        f27050Y6 = zzbiu.m43513i(1, "gads:wire_banner_listener_after_request:enabled", bool2);
        f27059Z6 = zzbiu.m43513i(1, "gads:wire_app_open_listener_after_request:enabled", bool2);
        f27069a7 = zzbiu.m43513i(1, "gads:wire_interstitial_listener_after_request:enabled", bool2);
        f27089c7 = zzbiu.m43513i(1, "gads:can_open_app_and_open_app_action:enabled", bool2);
        f27099d7 = zzbiu.m43513i(1, "gads:open_gmsg:set_uri_data_and_type:enabled", bool2);
        f27119f7 = zzbiu.m43513i(1, "gads:forward_bow_error_string:enabled", bool);
        f27129g7 = zzbiu.m43513i(1, "gads:continue_on_process_response:enabled", bool2);
        f27149i7 = zzbiu.m43513i(1, "gads:line_item_no_fill_conversion:enabled", bool2);
        f27169k7 = zzbiu.m43513i(1, "gads:offline_ads_notification:enabled", bool);
        f27179l7 = zzbiu.m43513i(1, "gads:use_new_network_api:enabled", bool);
        f27189m7 = zzbiu.m43513i(1, "gads:handle_click_recorded_event:enabled", bool2);
        f27199n7 = zzbiu.m43513i(1, "gads:default_network_type_fine_to_unknown:enabled", bool);
        f27209o7 = zzbiu.m43513i(1, "gads:handle_intent_async:enabled", bool);
        f27219p7 = zzbiu.m43513i(1, "gads:skip_deep_link_validation_native_ads:enabled", bool);
        f27229q7 = zzbiu.m43513i(1, "gads:try_deep_link_fallback_native_ads:enabled", bool);
        f27239r7 = zzbiu.m43513i(1, "gads:in_app_link_handling_for_android_11_enabled:enabled", bool);
        f27249s7 = zzbiu.m43513i(1, "gads:new_remote_logging_utils:enabled", bool2);
        f27259t7 = zzbiu.m43513i(1, "gads:remote_logging:enabled", bool2);
        f26834C7 = zzbiu.m43513i(1, "gads:hide_grey_title_bar:enabled", bool2);
        f26844D7 = zzbiu.m43513i(1, "gads:interstitial_ad_parameter_handler:enabled", bool);
        f26854E7 = zzbiu.m43513i(1, "gads:inspector:enabled", bool);
        f26894I7 = zzbiu.m43513i(1, "gads:inspector:shake_enabled", bool);
        f26944N7 = zzbiu.m43513i(1, "gads:inspector:flick_enabled", bool);
        f27004T7 = zzbiu.m43513i(1, "gads:inspector:ad_manager_enabled", bool);
        f27014U7 = zzbiu.m43513i(1, "gads:inspector:policy_violations_enabled", bool2);
        f27024V7 = zzbiu.m43513i(1, "gads:inspector:bidding_data_enabled", bool);
        f27033W7 = zzbiu.m43513i(1, "gads:inspector:credentials_enabled", bool);
        f27042X7 = zzbiu.m43513i(1, "gads:inspector:export_request_logs_enabled", bool2);
        f27051Y7 = zzbiu.m43513i(1, "gads:inspector:sdk_version_enabled", bool2);
        f27060Z7 = zzbiu.m43513i(1, "gads:inspector:adapter_supports_init_enabled", bool2);
        f27070a8 = zzbiu.m43513i(1, "gads:inspector:out_of_context_testing_enabled", bool2);
        f27080b8 = zzbiu.m43513i(1, "gads:paw_register_webview:enabled", bool);
        f27090c8 = zzbiu.m43513i(1, "gads:paw_webview_early_initialization:enabled", bool2);
        f27110e8 = zzbiu.m43513i(1, "gads:as_view_click_latency_logging:enabled", bool2);
        f27120f8 = zzbiu.m43513i(1, "gads:h5ads:enabled", bool);
        f27160j8 = zzbiu.m43513i(1, "gads:native_html_video_asset:enabled", bool);
        f27170k8 = zzbiu.m43513i(1, "gads:native_html_image_asset:enabled", bool);
        f27180l8 = zzbiu.m43513i(1, "gads:leibniz:events:enabled", bool2);
        f27190m8 = zzbiu.m43513i(1, "gads:msa:alphavis_enabled", bool2);
        f27200n8 = zzbiu.m43513i(1, "gads:msa:adutilalphavis_enabled", bool2);
        f27210o8 = zzbiu.m43513i(1, "gads:msa:nativealphavis_enabled", bool2);
        f27230q8 = zzbiu.m43513i(1, "gads:msa:vswfl", bool2);
        f27240r8 = zzbiu.m43513i(1, "gads:msa:poslogger", bool2);
        f27250s8 = zzbiu.m43513i(1, "gads:new_dynamite_module_method:enabled", bool2);
        f27270u8 = zzbiu.m43513i(1, "gads:read_pub_callback_param_open_gmsg:enabled", bool);
        f27280v8 = zzbiu.m43513i(1, "gads:read_pub_callback_param_click_gmsg:enabled", bool);
        f27290w8 = zzbiu.m43513i(1, "gads:forward_physical_click_to_ad_listener:enabled", bool);
        f27300x8 = zzbiu.m43513i(1, "gads:webview_destroy_workaround:enabled", bool);
        f27310y8 = zzbiu.m43513i(1, "gads:appstate_getresource_fix:enabled", bool2);
        f27320z8 = zzbiu.m43513i(1, "gads:convert_ad_unit_lower_case_rtb:enabled", bool2);
        f26815A8 = zzbiu.m43513i(1, "gads:drx_ad_unit_regex_case_insensitive:enabled", bool2);
        f26825B8 = zzbiu.m43513i(1, "gads:csi_ping_for_invalid_dynamite_flags_access:enabled", bool2);
        f26835C8 = zzbiu.m43513i(1, "gads:gestures:paos:enabled", bool2);
        f26845D8 = zzbiu.m43513i(1, "gads:normalized_device_volume:enabled", bool2);
        f26855E8 = zzbiu.m43513i(1, "gads:register_receiver_options:enabled", bool);
        f26865F8 = zzbiu.m43513i(1, "gads:bg_ad_key_signal_gen:enabled", bool2);
        f26875G8 = zzbiu.m43513i(1, "gads:bg_clearcut_provider:enabled", bool2);
        f26885H8 = zzbiu.m43513i(1, "gads:queryInfo_generate_bg:enabled", bool2);
        f26895I8 = zzbiu.m43513i(1, "gads:bg_banner_resume:enabled", bool2);
        f26905J8 = zzbiu.m43513i(1, "gads:bg_banner_destroy:enabled", bool2);
        f26915K8 = zzbiu.m43513i(1, "gads:bg_banner_pause:enabled", bool2);
        f26925L8 = zzbiu.m43513i(2, "OPTIMIZE_INITIALIZATION", bool2);
        f26935M8 = zzbiu.m43513i(2, "OPTIMIZE_AD_LOADING", bool2);
        f26965P8 = zzbiu.m43513i(1, "gads:manifest_flag_collection:enabled", bool2);
        f26975Q8 = zzbiu.m43513i(1, "gads:bstar_csi:enabled", bool2);
        f26985R8 = zzbiu.m43513i(1, "gads:bstar_signals:enabled", bool2);
        f26995S8 = zzbiu.m43513i(1, "gads:full_screen_1px_open:enabled", bool2);
        f27005T8 = zzbiu.m43513i(1, "gads:app_id_as_session_token:enabled", bool2);
        f27015U8 = zzbiu.m43513i(1, "gads:lmd_overlay:enabled", bool2);
    }

    /* renamed from: a */
    public static List m43540a() {
        return zzay.m1922a().mo42653a();
    }

    /* renamed from: b */
    public static List m43541b() {
        return zzay.m1922a().mo42654b();
    }

    /* renamed from: c */
    public static void m43542c(Context context) {
        zzbje.m43547a(new zzbjb(context));
    }

    /* renamed from: d */
    public static void m43543d(Context context, int i, JSONObject jSONObject) {
        zzay.m1923b();
        SharedPreferences.Editor edit = zzbiw.m43529a(context).edit();
        zzay.m1922a();
        zzbke zzbke = zzbkj.f27395a;
        zzay.m1922a().mo42657e(edit, 1, jSONObject);
        zzay.m1923b();
        edit.commit();
    }
}
