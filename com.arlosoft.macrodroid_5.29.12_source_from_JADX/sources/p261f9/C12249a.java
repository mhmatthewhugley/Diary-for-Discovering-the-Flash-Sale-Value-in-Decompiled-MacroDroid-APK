package p261f9;

import android.os.Build;
import androidx.core.app.AppOpsManagerCompat;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0007"}, mo71668d2 = {"Lf9/a;", "", "", "permission", "a", "<init>", "()V", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: f9.a */
/* compiled from: AppOpCompatConstants.kt */
public final class C12249a {

    /* renamed from: A */
    private static final String f58763A = "android:body_sensors";

    /* renamed from: A0 */
    private static final String f58764A0 = "android:bluetooth_scan";

    /* renamed from: B */
    private static final String f58765B = "android:read_cell_broadcasts";

    /* renamed from: B0 */
    private static final String[] f58766B0 = {"android:coarse_location", "android:fine_location", "android:gps", "android:vibrate", "android:read_contacts", "android:write_contacts", "android:read_call_log", "android:write_call_log", "android:read_calendar", "android:write_calendar", "android:wifi_scan", "android:post_notification", "android:neighboring_cells", "android:call_phone", "android:read_sms", "android:write_sms", "android:receive_sms", "android:receive_emergency_broadcast", "android:receive_mms", "android:receive_wap_push", "android:send_sms", "android:read_icc_sms", "android:write_icc_sms", "android:write_settings", "android:system_alert_window", "android:access_notifications", "android:camera", "android:record_audio", "android:play_audio", "android:read_clipboard", "android:write_clipboard", "android:take_media_buttons", "android:take_audio_focus", "android:audio_master_volume", "android:audio_voice_volume", "android:audio_ring_volume", "android:audio_media_volume", "android:audio_alarm_volume", "android:audio_notification_volume", "android:audio_bluetooth_volume", "android:wake_lock", "android:monitor_location", "android:monitor_location_high_power", "android:get_usage_stats", "android:mute_microphone", "android:toast_window", "android:project_media", "android:activate_vpn", "android:write_wallpaper", "android:assist_structure", "android:assist_screenshot", "android:read_phone_state", "android:add_voicemail", "android:use_sip", "android:process_outgoing_calls", "android:use_fingerprint", "android:body_sensors", "android:read_cell_broadcasts", "android:mock_location", "android:read_external_storage", "android:write_external_storage", "android:turn_screen_on", "android:get_accounts", "android:run_in_background", "android:audio_accessibility_volume", "android:read_phone_numbers", "android:request_install_packages", "android:picture_in_picture", "android:instant_app_start_foreground", "android:answer_phone_calls", "android:run_any_in_background", "android:change_wifi_state", "android:request_delete_packages", "android:bind_accessibility_service", "android:accept_handover", "android:manage_ipsec_tunnels", "android:start_foreground", "android:bluetooth_scan"};

    /* renamed from: C */
    private static final String f58767C = "android:mock_location";

    /* renamed from: C0 */
    private static final String[] f58768C0;

    /* renamed from: D */
    private static final String f58769D = "android:read_external_storage";

    /* renamed from: D0 */
    private static final HashMap<String, String> f58770D0 = new HashMap<>();

    /* renamed from: E */
    private static final String f58771E = "android:write_external_storage";

    /* renamed from: F */
    private static final String f58772F = "android:system_alert_window";

    /* renamed from: G */
    private static final String f58773G = "android:write_settings";

    /* renamed from: H */
    private static final String f58774H = "android:get_accounts";

    /* renamed from: I */
    private static final String f58775I = "android:read_phone_numbers";

    /* renamed from: J */
    private static final String f58776J = "android:picture_in_picture";

    /* renamed from: K */
    private static final String f58777K = "android:instant_app_start_foreground";

    /* renamed from: L */
    private static final String f58778L = "android:answer_phone_calls";

    /* renamed from: M */
    private static final String f58779M = "android:accept_handover";

    /* renamed from: N */
    private static final String f58780N = "android:gps";

    /* renamed from: O */
    private static final String f58781O = "android:vibrate";

    /* renamed from: P */
    private static final String f58782P = "android:wifi_scan";

    /* renamed from: Q */
    private static final String f58783Q = "android:post_notification";

    /* renamed from: R */
    private static final String f58784R = "android:neighboring_cells";

    /* renamed from: S */
    private static final String f58785S = "android:write_sms";

    /* renamed from: T */
    private static final String f58786T = "android:receive_emergency_broadcast";

    /* renamed from: U */
    private static final String f58787U = "android:read_icc_sms";

    /* renamed from: V */
    private static final String f58788V = "android:write_icc_sms";

    /* renamed from: W */
    private static final String f58789W = "android:access_notifications";

    /* renamed from: X */
    private static final String f58790X = "android:play_audio";

    /* renamed from: Y */
    private static final String f58791Y = "android:read_clipboard";

    /* renamed from: Z */
    private static final String f58792Z = "android:write_clipboard";

    /* renamed from: a */
    public static final C12249a f58793a = new C12249a();

    /* renamed from: a0 */
    private static final String f58794a0 = "android:take_media_buttons";

    /* renamed from: b */
    private static final String f58795b = "android:coarse_location";

    /* renamed from: b0 */
    private static final String f58796b0 = "android:take_audio_focus";

    /* renamed from: c */
    private static final String f58797c = "android:fine_location";

    /* renamed from: c0 */
    private static final String f58798c0 = "android:audio_master_volume";

    /* renamed from: d */
    private static final String f58799d = "android:monitor_location";

    /* renamed from: d0 */
    private static final String f58800d0 = "android:audio_voice_volume";

    /* renamed from: e */
    private static final String f58801e = "android:monitor_location_high_power";

    /* renamed from: e0 */
    private static final String f58802e0 = "android:audio_ring_volume";

    /* renamed from: f */
    private static final String f58803f = "android:get_usage_stats";

    /* renamed from: f0 */
    private static final String f58804f0 = "android:audio_media_volume";

    /* renamed from: g */
    private static final String f58805g = "android:activate_vpn";

    /* renamed from: g0 */
    private static final String f58806g0 = "android:audio_alarm_volume";

    /* renamed from: h */
    private static final String f58807h = "android:read_contacts";

    /* renamed from: h0 */
    private static final String f58808h0 = "android:audio_notification_volume";

    /* renamed from: i */
    private static final String f58809i = "android:write_contacts";

    /* renamed from: i0 */
    private static final String f58810i0 = "android:audio_bluetooth_volume";

    /* renamed from: j */
    private static final String f58811j = "android:read_call_log";

    /* renamed from: j0 */
    private static final String f58812j0 = "android:wake_lock";

    /* renamed from: k */
    private static final String f58813k = "android:write_call_log";

    /* renamed from: k0 */
    private static final String f58814k0 = "android:mute_microphone";

    /* renamed from: l */
    private static final String f58815l = "android:read_calendar";

    /* renamed from: l0 */
    private static final String f58816l0 = "android:toast_window";

    /* renamed from: m */
    private static final String f58817m = "android:write_calendar";

    /* renamed from: m0 */
    private static final String f58818m0 = "android:project_media";

    /* renamed from: n */
    private static final String f58819n = "android:call_phone";

    /* renamed from: n0 */
    private static final String f58820n0 = "android:write_wallpaper";

    /* renamed from: o */
    private static final String f58821o = "android:read_sms";

    /* renamed from: o0 */
    private static final String f58822o0 = "android:assist_structure";

    /* renamed from: p */
    private static final String f58823p = "android:receive_sms";

    /* renamed from: p0 */
    private static final String f58824p0 = "android:assist_screenshot";

    /* renamed from: q */
    private static final String f58825q = "android:receive_mms";

    /* renamed from: q0 */
    private static final String f58826q0 = "android:turn_screen_on";

    /* renamed from: r */
    private static final String f58827r = "android:receive_wap_push";

    /* renamed from: r0 */
    private static final String f58828r0 = "android:run_in_background";

    /* renamed from: s */
    private static final String f58829s = "android:send_sms";

    /* renamed from: s0 */
    private static final String f58830s0 = "android:audio_accessibility_volume";

    /* renamed from: t */
    private static final String f58831t = "android:camera";

    /* renamed from: t0 */
    private static final String f58832t0 = "android:request_install_packages";

    /* renamed from: u */
    private static final String f58833u = "android:record_audio";

    /* renamed from: u0 */
    private static final String f58834u0 = "android:run_any_in_background";

    /* renamed from: v */
    private static final String f58835v = "android:read_phone_state";

    /* renamed from: v0 */
    private static final String f58836v0 = "android:change_wifi_state";

    /* renamed from: w */
    private static final String f58837w = "android:add_voicemail";

    /* renamed from: w0 */
    private static final String f58838w0 = "android:request_delete_packages";

    /* renamed from: x */
    private static final String f58839x = "android:use_sip";

    /* renamed from: x0 */
    private static final String f58840x0 = "android:bind_accessibility_service";

    /* renamed from: y */
    private static final String f58841y = "android:process_outgoing_calls";

    /* renamed from: y0 */
    private static final String f58842y0 = "android:manage_ipsec_tunnels";

    /* renamed from: z */
    private static final String f58843z = "android:use_fingerprint";

    /* renamed from: z0 */
    private static final String f58844z0 = "android:start_foreground";

    static {
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", null, "android.permission.VIBRATE", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.READ_CALL_LOG", "android.permission.WRITE_CALL_LOG", "android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR", "android.permission.ACCESS_WIFI_STATE", null, null, "android.permission.CALL_PHONE", "android.permission.READ_SMS", null, "android.permission.RECEIVE_SMS", null, "android.permission.RECEIVE_MMS", "android.permission.RECEIVE_WAP_PUSH", "android.permission.SEND_SMS", "android.permission.READ_SMS", null, "android.permission.WRITE_SETTINGS", "android.permission.SYSTEM_ALERT_WINDOW", null, "android.permission.CAMERA", "android.permission.RECORD_AUDIO", null, null, null, null, null, null, null, null, null, null, null, null, "android.permission.WAKE_LOCK", null, null, "android.permission.PACKAGE_USAGE_STATS", null, null, null, null, null, null, null, "android.permission.READ_PHONE_STATE", "com.android.voicemail.permission.ADD_VOICEMAIL", "android.permission.USE_SIP", "android.permission.PROCESS_OUTGOING_CALLS", "android.permission.USE_FINGERPRINT", "android.permission.BODY_SENSORS", null, null, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", null, "android.permission.GET_ACCOUNTS", null, null, "android.permission.READ_PHONE_NUMBERS", "android.permission.REQUEST_INSTALL_PACKAGES", null, "android.permission.INSTANT_APP_FOREGROUND_SERVICE", "android.permission.ANSWER_PHONE_CALLS", null, "android.permission.CHANGE_WIFI_STATE", "android.permission.REQUEST_DELETE_PACKAGES", "android.permission.BIND_ACCESSIBILITY_SERVICE", "android.permission.ACCEPT_HANDOVER", null, "android.permission.FOREGROUND_SERVICE", null};
        f58768C0 = strArr;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = f58768C0[i];
            if (str != null) {
                f58770D0.put(str, f58766B0[i]);
            }
        }
    }

    private C12249a() {
    }

    /* renamed from: a */
    public final String mo68571a(String str) {
        C13706o.m87929f(str, "permission");
        String permissionToOp = AppOpsManagerCompat.permissionToOp(str);
        if (!(permissionToOp == null || permissionToOp.length() == 0)) {
            return permissionToOp;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return f58770D0.get(str);
        }
        return null;
    }
}
