package com.arlosoft.macrodroid.common;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.content.ContextCompat;
import androidx.webkit.ProxyConfig;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.data.NotificationContextInfo;
import com.arlosoft.macrodroid.data.WeatherContextInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.ApplicationInstalledRemovedTrigger;
import com.arlosoft.macrodroid.triggers.ApplicationLaunchedTrigger;
import com.arlosoft.macrodroid.triggers.BluetoothTrigger;
import com.arlosoft.macrodroid.triggers.CalendarTrigger;
import com.arlosoft.macrodroid.triggers.CallActiveTrigger;
import com.arlosoft.macrodroid.triggers.CallEndedTrigger;
import com.arlosoft.macrodroid.triggers.CallMissedTrigger;
import com.arlosoft.macrodroid.triggers.IncomingCallTrigger;
import com.arlosoft.macrodroid.triggers.IncomingSMSTrigger;
import com.arlosoft.macrodroid.triggers.LocationTrigger;
import com.arlosoft.macrodroid.triggers.LogcatTrigger;
import com.arlosoft.macrodroid.triggers.NotificationTrigger;
import com.arlosoft.macrodroid.triggers.OutgoingCallTrigger;
import com.arlosoft.macrodroid.triggers.SMSSentTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.UsbDeviceConnectionTrigger;
import com.arlosoft.macrodroid.triggers.WeatherTrigger;
import com.arlosoft.macrodroid.utils.StringManipulation;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import org.apache.commons.p353io.FileUtils;
import org.apache.commons.p353io.FilenameUtils;
import p112j2.C7439d0;
import p135n1.C7967d;
import p183w2.C10330a;
import p319lc.C15626c;

/* renamed from: com.arlosoft.macrodroid.common.j0 */
/* compiled from: MagicText */
public class C4023j0 {

    /* renamed from: a */
    public static int f10422a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C4029f f10423b;

    /* renamed from: com.arlosoft.macrodroid.common.j0$a */
    /* compiled from: MagicText */
    class C4024a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AppCompatDialog f10424a;

        /* renamed from: c */
        final /* synthetic */ Activity f10425c;

        /* renamed from: d */
        final /* synthetic */ Macro f10426d;

        /* renamed from: f */
        final /* synthetic */ C4028e f10427f;

        /* renamed from: g */
        final /* synthetic */ int f10428g;

        /* renamed from: o */
        final /* synthetic */ C7967d f10429o;

        C4024a(AppCompatDialog appCompatDialog, Activity activity, Macro macro, C4028e eVar, int i, C7967d dVar) {
            this.f10424a = appCompatDialog;
            this.f10425c = activity;
            this.f10426d = macro;
            this.f10427f = eVar;
            this.f10428g = i;
            this.f10429o = dVar;
        }

        public void onClick(View view) {
            this.f10424a.dismiss();
            C4023j0.m15695B(this.f10425c, this.f10426d, this.f10427f, this.f10428g, this.f10429o);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.common.j0$b */
    /* compiled from: MagicText */
    class C4025b implements View.OnClickListener {

        /* renamed from: A */
        final /* synthetic */ C7967d f10430A;

        /* renamed from: a */
        final /* synthetic */ AppCompatDialog f10431a;

        /* renamed from: c */
        final /* synthetic */ Activity f10432c;

        /* renamed from: d */
        final /* synthetic */ C4028e f10433d;

        /* renamed from: f */
        final /* synthetic */ Macro f10434f;

        /* renamed from: g */
        final /* synthetic */ boolean f10435g;

        /* renamed from: o */
        final /* synthetic */ boolean f10436o;

        /* renamed from: p */
        final /* synthetic */ boolean f10437p;

        /* renamed from: s */
        final /* synthetic */ int f10438s;

        /* renamed from: z */
        final /* synthetic */ boolean f10439z;

        C4025b(AppCompatDialog appCompatDialog, Activity activity, C4028e eVar, Macro macro, boolean z, boolean z2, boolean z3, int i, boolean z4, C7967d dVar) {
            this.f10431a = appCompatDialog;
            this.f10432c = activity;
            this.f10433d = eVar;
            this.f10434f = macro;
            this.f10435g = z;
            this.f10436o = z2;
            this.f10437p = z3;
            this.f10438s = i;
            this.f10439z = z4;
            this.f10430A = dVar;
        }

        public void onClick(View view) {
            this.f10431a.dismiss();
            C4023j0.m15702H(this.f10432c, this.f10433d, this.f10434f, this.f10435g, this.f10436o, this.f10437p, this.f10438s, this.f10439z, this.f10430A);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.common.j0$c */
    /* compiled from: MagicText */
    enum C4026c {
        VALUE,
        STRING_LENGTH,
        STRING_VALUE,
        ARRAY_DICTIONARY_SIZE
    }

    /* renamed from: com.arlosoft.macrodroid.common.j0$d */
    /* compiled from: MagicText */
    static class C4027d {
        /* access modifiers changed from: private */

        /* renamed from: A */
        public final C4029f f10445A = new C4029f("[not_sub_text]", C4023j0.m15722a0(C17541R$string.notification_subtext));
        /* access modifiers changed from: private */

        /* renamed from: A0 */
        public final C4029f f10446A0;
        /* access modifiers changed from: private */

        /* renamed from: B */
        public final C4029f f10447B = new C4029f("[not_app_name]", C4023j0.m15722a0(C17541R$string.notification_app_name));
        /* access modifiers changed from: private */

        /* renamed from: B0 */
        public final C4029f f10448B0;
        /* access modifiers changed from: private */

        /* renamed from: C */
        public final C4029f f10449C = new C4029f("[not_app_package]", C4023j0.m15722a0(C17541R$string.notification_app_package));
        /* access modifiers changed from: private */

        /* renamed from: C0 */
        public final C4029f f10450C0;
        /* access modifiers changed from: private */

        /* renamed from: D */
        public final C4029f f10451D = new C4029f("[not_text_lines]", C4023j0.m15722a0(C17541R$string.notification_text_lines));
        /* access modifiers changed from: private */

        /* renamed from: D0 */
        public final C4029f f10452D0;
        /* access modifiers changed from: private */

        /* renamed from: E */
        public final C4029f f10453E = new C4029f("[not_text_big]", C4023j0.m15722a0(C17541R$string.notification_big_text));
        /* access modifiers changed from: private */

        /* renamed from: E0 */
        public final C4029f f10454E0;
        /* access modifiers changed from: private */

        /* renamed from: F */
        public final C4029f f10455F = new C4029f("[not_action_names]", C4023j0.m15722a0(C17541R$string.notification_magic_text_action_names));
        /* access modifiers changed from: private */

        /* renamed from: F0 */
        public final C4029f f10456F0;
        /* access modifiers changed from: private */

        /* renamed from: G */
        public final C4029f f10457G = new C4029f("[sms_name]", C4023j0.m15722a0(C17541R$string.incoming_sms_contact));
        /* access modifiers changed from: private */

        /* renamed from: G0 */
        public final C4029f f10458G0;
        /* access modifiers changed from: private */

        /* renamed from: H */
        public final C4029f f10459H = new C4029f("[sms_message]", C4023j0.m15722a0(C17541R$string.incoming_sms_message));
        /* access modifiers changed from: private */

        /* renamed from: H0 */
        public final C4029f f10460H0;
        /* access modifiers changed from: private */

        /* renamed from: I */
        public final C4029f f10461I = new C4029f("[sms_number]", C4023j0.m15722a0(C17541R$string.incoming_sms_number));
        /* access modifiers changed from: private */

        /* renamed from: I0 */
        public final C4029f f10462I0;
        /* access modifiers changed from: private */

        /* renamed from: J */
        public final C4029f f10463J = new C4029f("[sms_name]", C4023j0.m15722a0(C17541R$string.outgoing_sms_contact));
        /* access modifiers changed from: private */

        /* renamed from: J0 */
        public final C4029f f10464J0;
        /* access modifiers changed from: private */

        /* renamed from: K */
        public final C4029f f10465K = new C4029f("[sms_message]", C4023j0.m15722a0(C17541R$string.outgoing_sms_message));
        /* access modifiers changed from: private */

        /* renamed from: K0 */
        public final C4029f f10466K0;
        /* access modifiers changed from: private */

        /* renamed from: L */
        public final C4029f f10467L = new C4029f("[sms_number]", C4023j0.m15722a0(C17541R$string.outgoing_sms_number));
        /* access modifiers changed from: private */

        /* renamed from: L0 */
        public final C4029f f10468L0;
        /* access modifiers changed from: private */

        /* renamed from: M */
        public final C4029f f10469M = new C4029f("[app_name]", C4023j0.m15722a0(C17541R$string.application_name));
        /* access modifiers changed from: private */

        /* renamed from: M0 */
        public final C4029f f10470M0;
        /* access modifiers changed from: private */

        /* renamed from: N */
        public final C4029f f10471N = new C4029f("[app_package]", C4023j0.m15722a0(C17541R$string.application_package));
        /* access modifiers changed from: private */

        /* renamed from: N0 */
        public final C4029f f10472N0;
        /* access modifiers changed from: private */

        /* renamed from: O */
        public final C4029f f10473O = new C4029f("[lat_long]", C4023j0.m15722a0(C17541R$string.location_lat_lng));
        /* access modifiers changed from: private */

        /* renamed from: O0 */
        public final C4029f f10474O0;
        /* access modifiers changed from: private */

        /* renamed from: P */
        public final C4029f f10475P = new C4029f("[call_number]", C4023j0.m15722a0(C17541R$string.call_number));
        /* access modifiers changed from: private */

        /* renamed from: P0 */
        public final C4029f f10476P0;
        /* access modifiers changed from: private */

        /* renamed from: Q */
        public final C4029f f10477Q = new C4029f("[call_name]", C4023j0.m15722a0(C17541R$string.call_name));
        /* access modifiers changed from: private */

        /* renamed from: Q0 */
        public final C4029f f10478Q0;
        /* access modifiers changed from: private */

        /* renamed from: R */
        public final C4029f f10479R = new C4029f("[cell_connection_type]", C4023j0.m15722a0(C17541R$string.cell_connection_type));
        /* access modifiers changed from: private */

        /* renamed from: R0 */
        public final C4029f f10480R0;
        /* access modifiers changed from: private */

        /* renamed from: S */
        public final C4029f f10481S = new C4029f("[mcc]", C4023j0.m15722a0(C17541R$string.mobile_country_code));
        /* access modifiers changed from: private */

        /* renamed from: S0 */
        public final C4029f f10482S0;
        /* access modifiers changed from: private */

        /* renamed from: T */
        public final C4029f f10483T = new C4029f("[mnc]", C4023j0.m15722a0(C17541R$string.mobile_network_code));
        /* access modifiers changed from: private */

        /* renamed from: T0 */
        public final C4029f f10484T0;
        /* access modifiers changed from: private */

        /* renamed from: U */
        public final C4029f f10485U = new C4029f("[lac]", C4023j0.m15722a0(C17541R$string.location_area_code));
        /* access modifiers changed from: private */

        /* renamed from: U0 */
        public final C4029f f10486U0;
        /* access modifiers changed from: private */

        /* renamed from: V */
        public final C4029f f10487V = new C4029f("[cell_id]", C4023j0.m15722a0(C17541R$string.cell_id));
        /* access modifiers changed from: private */

        /* renamed from: V0 */
        public final C4029f f10488V0;
        /* access modifiers changed from: private */

        /* renamed from: W */
        public final C4029f f10489W = new C4029f("[imei]", C4023j0.m15722a0(C17541R$string.internation_mobil_equipment_identity));
        /* access modifiers changed from: private */

        /* renamed from: W0 */
        public final C4029f f10490W0;
        /* access modifiers changed from: private */

        /* renamed from: X */
        public final C4029f f10491X = new C4029f("[meid]", C4023j0.m15722a0(C17541R$string.mobile_equipment_identifier));
        /* access modifiers changed from: private */

        /* renamed from: X0 */
        public final C4029f f10492X0;
        /* access modifiers changed from: private */

        /* renamed from: Y */
        public final C4029f f10493Y = new C4029f("[weather_temperature_c]", C4023j0.m15722a0(C17541R$string.temp_c));
        /* access modifiers changed from: private */

        /* renamed from: Y0 */
        public final C4029f f10494Y0;
        /* access modifiers changed from: private */

        /* renamed from: Z */
        public final C4029f f10495Z = new C4029f("[weather_temperature_farenheit]", C4023j0.m15722a0(C17541R$string.temp_f));
        /* access modifiers changed from: private */

        /* renamed from: Z0 */
        public final C4029f f10496Z0;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C4029f f10497a = new C4029f("[mode]", C4023j0.m15722a0(C17541R$string.constraint_mode));
        /* access modifiers changed from: private */

        /* renamed from: a0 */
        public final C4029f f10498a0 = new C4029f("[weather_wind_speed]", C4023j0.m15722a0(C17541R$string.wind_speed) + " " + C4023j0.m15722a0(C17541R$string.trigger_weather_m_s));

        /* renamed from: a1 */
        private final C4029f f10499a1;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C4029f f10500b = new C4029f("[battery]", C4023j0.m15722a0(C17541R$string.current_battery_percent));
        /* access modifiers changed from: private */

        /* renamed from: b0 */
        public final C4029f f10501b0 = new C4029f("[weather_wind_speed_mph]", C4023j0.m15722a0(C17541R$string.wind_speed) + " (" + C4023j0.m15722a0(C17541R$string.trigger_weather_miles_per_hour) + ")");
        /* access modifiers changed from: private */

        /* renamed from: b1 */
        public final C4029f f10502b1;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C4029f f10503c = new C4029f("[battery_temp]", C4023j0.m15722a0(C17541R$string.battery_temp_c));
        /* access modifiers changed from: private */

        /* renamed from: c0 */
        public final C4029f f10504c0 = new C4029f("[weather_wind_speed_kmh]", C4023j0.m15722a0(C17541R$string.wind_speed) + " (" + C4023j0.m15722a0(C17541R$string.trigger_weather_kilometres_per_hour) + ")");
        /* access modifiers changed from: private */

        /* renamed from: c1 */
        public final C4029f f10505c1;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C4029f f10506d = new C4029f("[power]", C4023j0.m15722a0(C17541R$string.power_on_off));
        /* access modifiers changed from: private */

        /* renamed from: d0 */
        public final C4029f f10507d0 = new C4029f("[weather_wind_direction]", C4023j0.m15722a0(C17541R$string.trigger_weather_wind_direction) + " (" + C4023j0.m15722a0(C17541R$string.trigger_wind_direction_degrees) + ")");
        /* access modifiers changed from: private */

        /* renamed from: d1 */
        public final C4029f f10508d1;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C4029f f10509e = new C4029f("[clipboard]", C4023j0.m15722a0(C17541R$string.clipboard_text));
        /* access modifiers changed from: private */

        /* renamed from: e0 */
        public final C4029f f10510e0 = new C4029f("[weather_humidity]", C4023j0.m15722a0(C17541R$string.humidity));
        /* access modifiers changed from: private */

        /* renamed from: e1 */
        public final C4029f f10511e1;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final C4029f f10512f = new C4029f("[ip]", C4023j0.m15722a0(C17541R$string.current_ip_address));
        /* access modifiers changed from: private */

        /* renamed from: f0 */
        public final C4029f f10513f0 = new C4029f("[weather_conditions]", C4023j0.m15722a0(C17541R$string.weather_conditions));
        /* access modifiers changed from: private */

        /* renamed from: f1 */
        public final C4029f f10514f1;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final C4029f f10515g = new C4029f("[ip6]", C4023j0.m15722a0(C17541R$string.current_ip_address_v6));
        /* access modifiers changed from: private */

        /* renamed from: g0 */
        public final C4029f f10516g0 = new C4029f("[last_loc_latlong]", C4023j0.m15722a0(C17541R$string.last_known_location) + " (" + C4023j0.m15722a0(C17541R$string.lat_lon) + ")");
        /* access modifiers changed from: private */

        /* renamed from: g1 */
        public final C4029f f10517g1;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final C4029f f10518h = new C4029f("[ssid]", C4023j0.m15722a0(C17541R$string.wifi_ssid));
        /* access modifiers changed from: private */

        /* renamed from: h0 */
        public final C4029f f10519h0 = new C4029f("[last_loc_lat]", C4023j0.m15722a0(C17541R$string.last_known_location) + " (" + C4023j0.m15722a0(C17541R$string.latitude_short) + ")");
        /* access modifiers changed from: private */

        /* renamed from: h1 */
        public final C4029f f10520h1;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public final C4029f f10521i = new C4029f("[wifi_strength]", C4023j0.m15722a0(C17541R$string.wifi_signal_strength));
        /* access modifiers changed from: private */

        /* renamed from: i0 */
        public final C4029f f10522i0 = new C4029f("[last_loc_long]", C4023j0.m15722a0(C17541R$string.last_known_location) + " (" + C4023j0.m15722a0(C17541R$string.longitude_short) + ")");
        /* access modifiers changed from: private */

        /* renamed from: i1 */
        public final C4029f f10523i1;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public final C4029f f10524j = new C4029f("[cell_signal_strength]", C4023j0.m15722a0(C17541R$string.cell_tower_signal_strength));
        /* access modifiers changed from: private */

        /* renamed from: j0 */
        public final C4029f f10525j0 = new C4029f("[last_loc_alt]", C4023j0.m15722a0(C17541R$string.last_known_location) + " (" + C4023j0.m15722a0(C17541R$string.altitude) + ")");
        /* access modifiers changed from: private */

        /* renamed from: j1 */
        public final C4029f f10526j1;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public final C4029f f10527k = new C4029f("[dayofweek]", C4023j0.m15722a0(C17541R$string.day_of_the_week));
        /* access modifiers changed from: private */

        /* renamed from: k0 */
        public final C4029f f10528k0 = new C4029f("[last_loc_accuracy]", C4023j0.m15722a0(C17541R$string.last_known_location) + " (" + C4023j0.m15722a0(C17541R$string.accuracy_meters) + ")");
        /* access modifiers changed from: private */

        /* renamed from: k1 */
        public final C4029f f10529k1;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public final C4029f f10530l = new C4029f("[dayofmonth]", C4023j0.m15722a0(C17541R$string.day_of_the_month));
        /* access modifiers changed from: private */

        /* renamed from: l0 */
        public final C4029f f10531l0 = new C4029f("[last_loc_link]", C4023j0.m15722a0(C17541R$string.last_known_location) + " (" + C4023j0.m15722a0(C17541R$string.link) + ")");
        /* access modifiers changed from: private */

        /* renamed from: l1 */
        public final C4029f f10532l1;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public final C4029f f10533m = new C4029f("[month]", C4023j0.m15722a0(2131954316));
        /* access modifiers changed from: private */

        /* renamed from: m0 */
        public final C4029f f10534m0 = new C4029f("[last_loc_age_timestamp]", C4023j0.m15722a0(C17541R$string.last_known_location) + " (" + C4023j0.m15722a0(2131955100) + ")");
        /* access modifiers changed from: private */

        /* renamed from: m1 */
        public final C4029f f10535m1;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public final C4029f f10536n = new C4029f("[month_digit]", C4023j0.m15722a0(C17541R$string.month_as_digit));
        /* access modifiers changed from: private */

        /* renamed from: n0 */
        public final C4029f f10537n0 = new C4029f("[last_loc_speed_kmh]", C4023j0.m15722a0(C17541R$string.last_known_location_speed) + " (" + C4023j0.m15722a0(C17541R$string.trigger_weather_kilometres_per_hour) + ")");
        /* access modifiers changed from: private */

        /* renamed from: n1 */
        public final C4029f f10538n1;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public final C4029f f10539o = new C4029f("[year]", C4023j0.m15722a0(2131955900));
        /* access modifiers changed from: private */

        /* renamed from: o0 */
        public final C4029f f10540o0 = new C4029f("[last_loc_speed_mph]", C4023j0.m15722a0(C17541R$string.last_known_location_speed) + " (" + C4023j0.m15722a0(C17541R$string.trigger_weather_miles_per_hour) + ")");
        /* access modifiers changed from: private */

        /* renamed from: o1 */
        public final C4029f f10541o1;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public final C4029f f10542p = new C4029f("[hour]", C4023j0.m15722a0(C17541R$string.hour_of_day));
        /* access modifiers changed from: private */

        /* renamed from: p0 */
        public final C4029f f10543p0 = new C4029f("\\n", C4023j0.m15722a0(C17541R$string.new_line));
        /* access modifiers changed from: private */

        /* renamed from: p1 */
        public final C4029f f10544p1;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public final C4029f f10545q = new C4029f("[hour_0]", C4023j0.m15722a0(C17541R$string.hour_of_day_leading_zero));
        /* access modifiers changed from: private */

        /* renamed from: q0 */
        public final C4029f f10546q0 = new C4029f("[peb_battery]", C4023j0.m15722a0(C17541R$string.pebble_battery_level));
        /* access modifiers changed from: private */

        /* renamed from: q1 */
        public final C4029f f10547q1;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public final C4029f f10548r = new C4029f("[hour12]", C4023j0.m15722a0(C17541R$string.hour_of_day_12));

        /* renamed from: r0 */
        public C4029f f10549r0 = new C4029f("[owner_info]", "Owner Info");
        /* access modifiers changed from: private */

        /* renamed from: r1 */
        public final C4029f f10550r1;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public final C4029f f10551s = new C4029f("[minute]", C4023j0.m15759t(C4023j0.m15722a0(C17541R$string.minute)));
        /* access modifiers changed from: private */

        /* renamed from: s0 */
        public final C4029f f10552s0 = new C4029f("[uptime]", C4023j0.m15722a0(C17541R$string.device_uptime));
        /* access modifiers changed from: private */

        /* renamed from: s1 */
        public final C4029f f10553s1;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public final C4029f f10554t = new C4029f("[second]", C4023j0.m15759t(C4023j0.m15722a0(C17541R$string.second)));
        /* access modifiers changed from: private */

        /* renamed from: t0 */
        public final C4029f f10555t0 = new C4029f("[uptime_secs]", C4023j0.m15722a0(C17541R$string.device_uptime_seconds));
        /* access modifiers changed from: private */

        /* renamed from: t1 */
        public final C4029f f10556t1;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public final C4029f f10557u = new C4029f("[week_of_year]", C4023j0.m15722a0(C17541R$string.week_of_year));
        /* access modifiers changed from: private */

        /* renamed from: u0 */
        public final C4029f f10558u0 = new C4029f("[current_brightness]", C4023j0.m15722a0(C17541R$string.current_brightness));
        /* access modifiers changed from: private */

        /* renamed from: u1 */
        public final C4029f f10559u1;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public final C4029f f10560v = new C4029f("[am_pm]", C4023j0.m15722a0(C17541R$string.before_midday_am) + "/" + C4023j0.m15722a0(C17541R$string.after_midday_pm));
        /* access modifiers changed from: private */

        /* renamed from: v0 */
        public final C4029f f10561v0 = new C4029f("[current_brightness_alternative]", C4023j0.m15722a0(C17541R$string.current_brightness_alternative));
        /* access modifiers changed from: private */

        /* renamed from: v1 */
        public final C4029f f10562v1;
        /* access modifiers changed from: private */

        /* renamed from: w */
        public final C4029f f10563w = new C4029f("[system_time]", C4023j0.m15722a0(C17541R$string.system_time));
        /* access modifiers changed from: private */

        /* renamed from: w0 */
        public final C4029f f10564w0 = new C4029f("[battery_int]", C4023j0.m15722a0(C17541R$string.current_battery_percent));
        /* access modifiers changed from: private */

        /* renamed from: w1 */
        public final C4029f f10565w1;
        /* access modifiers changed from: private */

        /* renamed from: x */
        public final C4029f f10566x = new C4029f("[not_title]", C4023j0.m15722a0(C17541R$string.notification_title));
        /* access modifiers changed from: private */

        /* renamed from: x0 */
        public final C4029f f10567x0 = new C4029f("[screen_timeout]", C4023j0.m15722a0(C17541R$string.screen_timeout_seconds));
        /* access modifiers changed from: private */

        /* renamed from: x1 */
        public final C4029f f10568x1;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public final C4029f f10569y = new C4029f("[not_ticker]", C4023j0.m15722a0(C17541R$string.notification_ticker_text));

        /* renamed from: y0 */
        private final String f10570y0;
        /* access modifiers changed from: private */

        /* renamed from: y1 */
        public final C4029f f10571y1;
        /* access modifiers changed from: private */

        /* renamed from: z */
        public final C4029f f10572z = new C4029f("[notification]", C4023j0.m15722a0(C17541R$string.notification_text));
        /* access modifiers changed from: private */

        /* renamed from: z0 */
        public final C4029f f10573z0;
        /* access modifiers changed from: private */

        /* renamed from: z1 */
        public final C4029f f10574z1;

        C4027d() {
            String o = C4023j0.m15722a0(C17541R$string.current_volume);
            this.f10570y0 = o;
            this.f10573z0 = new C4029f("[vol_alarm]", o + " (" + C4023j0.m15722a0(C17541R$string.action_set_volume_alarm) + ")");
            this.f10446A0 = new C4029f("[vol_music]", o + " (" + C4023j0.m15722a0(C17541R$string.action_set_volume_music) + ")");
            this.f10448B0 = new C4029f("[vol_ring]", o + " (" + C4023j0.m15722a0(C17541R$string.action_set_volume_ringer) + ")");
            this.f10450C0 = new C4029f("[vol_notif]", o + " (" + C4023j0.m15722a0(C17541R$string.action_set_volume_notification) + ")");
            this.f10452D0 = new C4029f("[vol_system]", o + " (" + C4023j0.m15722a0(C17541R$string.action_set_volume_system_sounds) + ")");
            this.f10454E0 = new C4029f("[vol_call]", o + " (" + C4023j0.m15722a0(C17541R$string.action_set_volume_voice_call) + ")");
            this.f10456F0 = new C4029f("[vol_bt_voice]", o + " (" + C4023j0.m15722a0(C17541R$string.action_set_volume_bluetooth_voice) + ")");
            this.f10458G0 = new C4029f("[macro_name]", C4023j0.m15722a0(C17541R$string.macro_name));
            this.f10460H0 = new C4029f("[macro_category]", C4023j0.m15722a0(C17541R$string.macro_category));
            this.f10462I0 = new C4029f("[device_serial]", C4023j0.m15722a0(C17541R$string.device_serial));
            this.f10464J0 = new C4029f("[device_name]", C4023j0.m15722a0(C17541R$string.device_name));
            this.f10466K0 = new C4029f("[device_manufacturer]", C4023j0.m15722a0(C17541R$string.magic_text_device_manufacturer));
            this.f10468L0 = new C4029f("[device_model]", C4023j0.m15722a0(C17541R$string.magic_text_device_model));
            this.f10470M0 = new C4029f("[android_version]", C4023j0.m15722a0(C17541R$string.magic_text_android_version));
            this.f10472N0 = new C4029f("[android_version_sdk]", C4023j0.m15722a0(C17541R$string.magic_text_android_version_sdk_level));
            this.f10474O0 = new C4029f("[sim_operator_name]", C4023j0.m15722a0(C17541R$string.sim_operator_name));
            this.f10476P0 = new C4029f("[calendar_title]", C4023j0.m15722a0(C17541R$string.calendar_title));
            this.f10478Q0 = new C4029f("[calendar_detail]", C4023j0.m15722a0(C17541R$string.calendar_detail));
            this.f10480R0 = new C4029f("[calendar_location]", C4023j0.m15722a0(C17541R$string.calendar_location));
            this.f10482S0 = new C4029f("[calendar_start_date]", C4023j0.m15722a0(C17541R$string.calendar_start_date));
            this.f10484T0 = new C4029f("[calendar_start_date_us]", C4023j0.m15722a0(C17541R$string.calendar_start_date) + " (USA)");
            this.f10486U0 = new C4029f("[calendar_start_time]", C4023j0.m15722a0(C17541R$string.calendar_start_time));
            this.f10488V0 = new C4029f("[calendar_end_date]", C4023j0.m15722a0(C17541R$string.calendar_end_date));
            this.f10490W0 = new C4029f("[calendar_end_date_us]", C4023j0.m15722a0(C17541R$string.calendar_end_date) + " (USA)");
            this.f10492X0 = new C4029f("[calendar_end_time]", C4023j0.m15722a0(C17541R$string.calendar_end_time));
            this.f10494Y0 = new C4029f("[bluetooth_device_name]", C4023j0.m15722a0(C17541R$string.bluetooth_device_name));
            this.f10496Z0 = new C4029f("[size=%s]", C4023j0.m15722a0(C17541R$string.dictionary_array_size));
            this.f10499a1 = new C4029f("[stringmanipulation]", C4023j0.m15722a0(C17541R$string.string_manipulation));
            this.f10502b1 = new C4029f("[strlen=%s]", C4023j0.m15722a0(C17541R$string.string_var_length));
            this.f10505c1 = new C4029f("[strval=%s]", C4023j0.m15722a0(C17541R$string.string_var_value));
            this.f10508d1 = new C4029f("[setting_system=%s]", C4023j0.m15722a0(C17541R$string.action_system_setting) + " (System)");
            this.f10511e1 = new C4029f("[setting_global=%s]", C4023j0.m15722a0(C17541R$string.action_system_setting) + " (Global)");
            this.f10514f1 = new C4029f("[setting_secure=%s]", C4023j0.m15722a0(C17541R$string.action_system_setting) + " (Secure)");
            this.f10517g1 = new C4029f("[ram_total]", C4023j0.m15722a0(C17541R$string.ram_total_magic_text));
            this.f10520h1 = new C4029f("[ram_available]", C4023j0.m15722a0(C17541R$string.ram_available_magic_text));
            this.f10523i1 = new C4029f("[storage_external_total]", C4023j0.m15722a0(C17541R$string.external_storage_total_magic_text));
            this.f10526j1 = new C4029f("[storage_external_free]", C4023j0.m15722a0(C17541R$string.external_storage_free_magic_text));
            this.f10529k1 = new C4029f("[storage_internal_total]", C4023j0.m15722a0(C17541R$string.internal_storage_total_magic_text));
            this.f10532l1 = new C4029f("[storage_internal_free]", C4023j0.m15722a0(C17541R$string.internal_storage_free_magic_text));
            this.f10535m1 = new C4029f("[usb_product_name]", C4023j0.m15722a0(C17541R$string.usb_device_product_name_magic_text));
            this.f10538n1 = new C4029f("[usb_manufacturer_name]", C4023j0.m15722a0(C17541R$string.usb_device_manufacturer_magic_text));
            this.f10541o1 = new C4029f("[fg_app_name]", C4023j0.m15722a0(C17541R$string.foreground_app_name_magic_text));
            this.f10544p1 = new C4029f("[fg_app_package]", C4023j0.m15722a0(C17541R$string.foreground_app_package_magic_text));
            this.f10547q1 = new C4029f("[logcat_line]", C4023j0.m15722a0(C17541R$string.logcat_entry_line_magic_text));
            this.f10550r1 = new C4029f("[macrodroid_version]", C4023j0.m15722a0(C17541R$string.magic_text_macrodroid_version));
            this.f10553s1 = new C4029f("[macrodroid_is_pro]", C4023j0.m15722a0(C17541R$string.magic_text_macrodroid_is_pro));
            this.f10556t1 = new C4029f("[screen_res]", C4023j0.m15722a0(C17541R$string.screen_resolution));
            this.f10559u1 = new C4029f("[screen_res_x]", C4023j0.m15722a0(C17541R$string.magic_text_screen_resolution_x));
            this.f10562v1 = new C4029f("[screen_res_y]", C4023j0.m15722a0(C17541R$string.magic_text_screen_resolution_y));
            this.f10565w1 = new C4029f("[webhook_url]", C4023j0.m15722a0(C17541R$string.magic_text_webhook_url));
            this.f10568x1 = new C4029f("[iterator_array_index]", C4023j0.m15722a0(C17541R$string.magic_text_iterator_array_index));
            this.f10571y1 = new C4029f("[iterator_dictionary_key]", C4023j0.m15722a0(C17541R$string.magic_text_iterator_dictionary_key));
            this.f10574z1 = new C4029f("[iterator_value]", C4023j0.m15722a0(C17541R$string.magic_text_iterator_value));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.common.j0$e */
    /* compiled from: MagicText */
    public interface C4028e {
        /* renamed from: a */
        void mo25564a(C4029f fVar);
    }

    /* renamed from: com.arlosoft.macrodroid.common.j0$f */
    /* compiled from: MagicText */
    public static class C4029f {

        /* renamed from: a */
        public String f10575a;

        /* renamed from: b */
        public String f10576b;

        public C4029f(String str, String str2) {
            this.f10575a = str;
            this.f10576b = str2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4029f)) {
                return false;
            }
            C4029f fVar = (C4029f) obj;
            if (!fVar.f10576b.equals(this.f10576b) || !fVar.f10575a.equals(this.f10575a)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: A */
    public static void m15693A(Activity activity, Macro macro, C4028e eVar, int i, C7967d dVar) {
        if (!C5163j2.m20084W1(activity)) {
            AppCompatDialog appCompatDialog = new AppCompatDialog(activity, i);
            appCompatDialog.setContentView((int) C17535R$layout.dialog_simple_text_message);
            appCompatDialog.setTitle((int) C17541R$string.magic_text_title);
            ((TextView) appCompatDialog.findViewById(2131363972)).setText(C17541R$string.magic_text_brackets_information);
            ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C4024a(appCompatDialog, activity, macro, eVar, i, dVar));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
            layoutParams.width = -1;
            appCompatDialog.getWindow().setAttributes(layoutParams);
            appCompatDialog.show();
            C5163j2.m19997J5(activity, true);
            return;
        }
        m15695B(activity, macro, eVar, i, dVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:33|34|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r3 = java.lang.Double.valueOf(r10.mo27736I().replaceAll(",", ".")).doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r3 = java.lang.Double.valueOf(r10.mo27736I().replaceAll(",", ".")).doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0124, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0103 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0114 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x000c A[SYNTHETIC] */
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m15694A0(java.util.List<com.arlosoft.macrodroid.common.MacroDroidVariable> r19, java.lang.String r20, boolean r21, java.lang.String r22) {
        /*
            r6 = r21
            java.lang.String r7 = ","
            java.lang.String r8 = "."
            java.util.Iterator r9 = r19.iterator()
            r2 = r20
        L_0x000c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01c7
            java.lang.Object r0 = r9.next()
            r10 = r0
            com.arlosoft.macrodroid.common.MacroDroidVariable r10 = (com.arlosoft.macrodroid.common.MacroDroidVariable) r10
            r11 = 1
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r1 = r10.getName()
            r12 = 0
            r0[r12] = r1
            r13 = r22
            java.lang.String r0 = java.lang.String.format(r13, r0)
            boolean r1 = m15765w(r2, r0)
            java.lang.String r14 = ""
            if (r1 == 0) goto L_0x004a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            java.lang.String r3 = r10.mo27735H()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = m15770y0(r2, r0, r1, r6)
        L_0x0048:
            r2 = r0
            goto L_0x0069
        L_0x004a:
            boolean r0 = r10.mo27751a0()
            if (r0 != 0) goto L_0x0056
            boolean r0 = r10.mo27748X()
            if (r0 == 0) goto L_0x0069
        L_0x0056:
            com.arlosoft.macrodroid.variables.VariableValue$Dictionary r0 = r10.mo27770n()
            java.lang.String r1 = r10.getName()
            com.arlosoft.macrodroid.common.j0$c r4 = com.arlosoft.macrodroid.common.C4023j0.C4026c.VALUE
            r3 = r22
            r5 = r21
            java.lang.String r0 = m15761u(r0, r1, r2, r3, r4, r5)
            goto L_0x0048
        L_0x0069:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r1 = r10.getName()
            r0[r12] = r1
            java.lang.String r1 = "[strlen=%s]"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            boolean r1 = m15765w(r2, r0)
            if (r1 == 0) goto L_0x009a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            java.lang.String r3 = r10.mo27736I()
            int r3 = r3.length()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = m15770y0(r2, r0, r1, r6)
        L_0x0098:
            r2 = r0
            goto L_0x00b9
        L_0x009a:
            boolean r0 = r10.mo27751a0()
            if (r0 != 0) goto L_0x00a6
            boolean r0 = r10.mo27748X()
            if (r0 == 0) goto L_0x00b9
        L_0x00a6:
            com.arlosoft.macrodroid.variables.VariableValue$Dictionary r0 = r10.mo27770n()
            java.lang.String r1 = r10.getName()
            com.arlosoft.macrodroid.common.j0$c r4 = com.arlosoft.macrodroid.common.C4023j0.C4026c.STRING_LENGTH
            java.lang.String r3 = "[strlen=%s]"
            r5 = r21
            java.lang.String r0 = m15761u(r0, r1, r2, r3, r4, r5)
            goto L_0x0098
        L_0x00b9:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r1 = r10.getName()
            r0[r12] = r1
            java.lang.String r1 = "[strval=%s]"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            boolean r1 = m15765w(r2, r0)
            if (r1 == 0) goto L_0x0151
            r3 = 0
            r15 = 0
            java.lang.String r1 = r10.mo27736I()     // Catch:{ NumberFormatException -> 0x0103 }
            boolean r1 = r1.contains(r8)     // Catch:{ NumberFormatException -> 0x0103 }
            if (r1 != 0) goto L_0x00f2
            java.lang.String r1 = r10.mo27736I()     // Catch:{ NumberFormatException -> 0x0103 }
            boolean r1 = r1.contains(r7)     // Catch:{ NumberFormatException -> 0x0103 }
            if (r1 != 0) goto L_0x00f2
            java.lang.String r1 = r10.mo27736I()     // Catch:{ NumberFormatException -> 0x0103 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0103 }
            long r17 = r1.longValue()     // Catch:{ NumberFormatException -> 0x0103 }
            goto L_0x0100
        L_0x00f2:
            java.lang.String r1 = r10.mo27736I()     // Catch:{ NumberFormatException -> 0x0103 }
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0103 }
            double r3 = r1.doubleValue()     // Catch:{ NumberFormatException -> 0x0103 }
            r17 = r15
        L_0x0100:
            r12 = r17
            goto L_0x0125
        L_0x0103:
            java.lang.String r1 = r10.mo27736I()     // Catch:{ NumberFormatException -> 0x0114 }
            java.lang.String r1 = r1.replaceAll(r7, r8)     // Catch:{ NumberFormatException -> 0x0114 }
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0114 }
            double r3 = r1.doubleValue()     // Catch:{ NumberFormatException -> 0x0114 }
            goto L_0x0124
        L_0x0114:
            java.lang.String r1 = r10.mo27736I()     // Catch:{ Exception -> 0x0124 }
            java.lang.String r1 = r1.replaceAll(r7, r8)     // Catch:{ Exception -> 0x0124 }
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch:{ Exception -> 0x0124 }
            double r3 = r1.doubleValue()     // Catch:{ Exception -> 0x0124 }
        L_0x0124:
            r12 = r15
        L_0x0125:
            int r1 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r1 == 0) goto L_0x013d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = m15770y0(r2, r0, r1, r6)
            goto L_0x016f
        L_0x013d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = m15770y0(r2, r0, r1, r6)
            goto L_0x016f
        L_0x0151:
            boolean r0 = r10.mo27751a0()
            if (r0 != 0) goto L_0x015d
            boolean r0 = r10.mo27748X()
            if (r0 == 0) goto L_0x0170
        L_0x015d:
            com.arlosoft.macrodroid.variables.VariableValue$Dictionary r0 = r10.mo27770n()
            java.lang.String r1 = r10.getName()
            com.arlosoft.macrodroid.common.j0$c r4 = com.arlosoft.macrodroid.common.C4023j0.C4026c.STRING_VALUE
            java.lang.String r3 = "[strval=%s]"
            r5 = r21
            java.lang.String r0 = m15761u(r0, r1, r2, r3, r4, r5)
        L_0x016f:
            r2 = r0
        L_0x0170:
            boolean r0 = r10.mo27748X()
            if (r0 != 0) goto L_0x017c
            boolean r0 = r10.mo27751a0()
            if (r0 == 0) goto L_0x000c
        L_0x017c:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r1 = r10.getName()
            r3 = 0
            r0[r3] = r1
            java.lang.String r1 = "[size=%s]"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            boolean r1 = m15765w(r2, r0)
            if (r1 == 0) goto L_0x01a8
            com.arlosoft.macrodroid.variables.VariableValue$Dictionary r1 = r10.mo27770n()
            java.util.List r1 = r1.getEntries()
            int r1 = r1.size()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = m15770y0(r2, r0, r1, r6)
        L_0x01a5:
            r2 = r0
            goto L_0x000c
        L_0x01a8:
            boolean r0 = r10.mo27751a0()
            if (r0 != 0) goto L_0x01b4
            boolean r0 = r10.mo27748X()
            if (r0 == 0) goto L_0x000c
        L_0x01b4:
            com.arlosoft.macrodroid.variables.VariableValue$Dictionary r0 = r10.mo27770n()
            java.lang.String r1 = r10.getName()
            com.arlosoft.macrodroid.common.j0$c r4 = com.arlosoft.macrodroid.common.C4023j0.C4026c.ARRAY_DICTIONARY_SIZE
            java.lang.String r3 = "[size=%s]"
            r5 = r21
            java.lang.String r0 = m15761u(r0, r1, r2, r3, r4, r5)
            goto L_0x01a5
        L_0x01c7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.common.C4023j0.m15694A0(java.util.List, java.lang.String, boolean, java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static void m15695B(Activity activity, Macro macro, C4028e eVar, int i, C7967d dVar) {
        List<C4029f> W = m15717W(macro, dVar);
        if (C5163j2.m20055S0(activity) == f10422a) {
            for (C4029f next : W) {
                next.f10575a = next.f10575a.replace("[", "{").replace("]", "}");
            }
        }
        f10423b = W.get(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, i);
        builder.setTitle((int) C17541R$string.action_set_variable_select);
        builder.setSingleChoiceItems((CharSequence[]) m15716V(W), 0, (DialogInterface.OnClickListener) new C4003d0(W));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C4017h0.f10412a);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4069v(activity, macro, eVar, i));
        builder.create().show();
    }

    /* renamed from: B0 */
    private static boolean m15696B0(String str, String str2) {
        return str.startsWith(str2) || str.startsWith(str2.replace("[", "{").replace("]", "}"));
    }

    /* renamed from: C */
    public static void m15697C(@NonNull Activity activity, Macro macro, @NonNull C4028e eVar, int i) {
        List list;
        if (macro == null) {
            list = C4064u.m16048t().mo27990o();
        } else if (macro.getTriggerList().size() > 0) {
            list = macro.getTriggerList().get(0).mo27867t0();
        } else {
            list = C4064u.m16048t().mo27990o();
        }
        if (list.size() == 0) {
            C15626c.makeText(activity, C17541R$string.no_integer_variables_defined, 0).show();
            return;
        }
        String[] strArr = new String[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            strArr[i2] = ((MacroDroidVariable) list.get(i2)).getName();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, i);
        builder.setTitle((int) C17541R$string.variable);
        builder.setSingleChoiceItems((CharSequence[]) strArr, 0, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3994a0(eVar));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C4074x.f10651a);
        builder.create().show();
    }

    /* renamed from: D */
    public static void m15698D(Activity activity, C4028e eVar, Macro macro, int i, C7967d dVar) {
        m15700F(activity, eVar, macro, false, true, true, i, dVar);
    }

    /* renamed from: E */
    public static void m15699E(Activity activity, C4028e eVar, Macro macro, int i, boolean z, C7967d dVar) {
        m15701G(activity, eVar, macro, false, true, true, i, z, dVar);
    }

    /* renamed from: F */
    public static void m15700F(Activity activity, C4028e eVar, @Nullable Macro macro, boolean z, boolean z2, boolean z3, int i, C7967d dVar) {
        m15701G(activity, eVar, macro, z, z2, z3, i, false, dVar);
    }

    /* renamed from: G */
    public static void m15701G(Activity activity, C4028e eVar, @Nullable Macro macro, boolean z, boolean z2, boolean z3, int i, boolean z4, C7967d dVar) {
        Activity activity2 = activity;
        if (!C5163j2.m20084W1(activity)) {
            int i2 = i;
            AppCompatDialog appCompatDialog = new AppCompatDialog(activity, i2);
            appCompatDialog.setContentView((int) C17535R$layout.dialog_simple_text_message);
            appCompatDialog.setTitle((int) C17541R$string.magic_text_title);
            ((TextView) appCompatDialog.findViewById(2131363972)).setText(C17541R$string.magic_text_brackets_information);
            ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C4025b(appCompatDialog, activity, eVar, macro, z, z2, z3, i2, z4, dVar));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
            layoutParams.width = -1;
            appCompatDialog.getWindow().setAttributes(layoutParams);
            appCompatDialog.show();
            C5163j2.m19997J5(activity, true);
            return;
        }
        int i3 = i;
        m15702H(activity, eVar, macro, z, z2, z3, i, z4, dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static void m15702H(Activity activity, C4028e eVar, @Nullable Macro macro, boolean z, boolean z2, boolean z3, int i, boolean z4, C7967d dVar) {
        boolean z5;
        List<C4029f> d0;
        Activity activity2 = activity;
        Macro macro2 = macro;
        int i2 = i;
        List<C4029f> U = m15715U(z, z3, macro2, dVar);
        int i3 = 0;
        if (!(!z2 || macro2 == null || (d0 = m15728d0(macro.getTriggerList(), z4)) == null)) {
            for (int size = d0.size() - 1; size >= 0; size--) {
                U.add(0, d0.get(size));
            }
        }
        if (macro2 != null) {
            int i4 = 0;
            z5 = false;
            while (i4 < macro.getTriggerList().size()) {
                Trigger trigger = macro.getTriggerList().get(i4);
                i4++;
                int i5 = i4;
                while (true) {
                    if (i5 >= macro.getTriggerList().size()) {
                        break;
                    } else if (!trigger.getClass().equals(macro.getTriggerList().get(i5).getClass())) {
                        z5 = true;
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        } else {
            z5 = false;
        }
        if (C5163j2.m20055S0(activity) == f10422a) {
            for (C4029f next : U) {
                next.f10575a = next.f10575a.replace("[", "{").replace("]", "}");
            }
        }
        AppCompatDialog appCompatDialog = new AppCompatDialog(activity2, i2);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_magic_text_selection);
        appCompatDialog.setTitle((int) C17541R$string.select_option);
        ListView listView = (ListView) appCompatDialog.findViewById(C17532R$id.listView);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.multiTriggerWarning);
        listView.setAdapter(new ArrayAdapter(new ContextThemeWrapper(activity2, i2), C17535R$layout.single_choice_list_item, m15716V(U)));
        listView.setItemChecked(0, true);
        f10423b = U.get(0);
        if (!z5) {
            i3 = 8;
        }
        textView.setVisibility(i3);
        button2.setOnClickListener(new C4076y(appCompatDialog));
        button.setOnClickListener(new C4078z(U, listView, activity, i, eVar, macro, appCompatDialog));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        appCompatDialog.show();
        appCompatDialog.getWindow().setAttributes(layoutParams);
    }

    /* renamed from: I */
    public static void m15703I(@NonNull Activity activity, @NonNull String str, @NonNull C4028e eVar, int i) {
        String[] strArr = {activity.getString(C17541R$string.seconds), activity.getString(C17541R$string.hours_minutes_seconds)};
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, i);
        builder.setTitle((int) C17541R$string.action_stop_watch);
        builder.setSingleChoiceItems((CharSequence[]) strArr, 0, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3997b0(eVar, str));
        builder.create().show();
    }

    /* renamed from: J */
    public static void m15704J(@NonNull Activity activity, Macro macro, @NonNull String str, @NonNull C4028e eVar, int i) {
        ArrayList arrayList = new ArrayList();
        if (macro != null) {
            for (MacroDroidVariable next : macro.getLocalVariablesSorted()) {
                if (next.mo27756d0() || next.mo27780y()) {
                    arrayList.add(next);
                }
            }
            for (MacroDroidVariable next2 : C4064u.m16048t().mo27993r(true)) {
                if (next2.mo27756d0() || next2.mo27780y()) {
                    arrayList.add(next2);
                }
            }
        } else {
            for (MacroDroidVariable next3 : C4064u.m16048t().mo27993r(true)) {
                if (next3.mo27756d0() || next3.mo27780y()) {
                    arrayList.add(next3);
                }
            }
        }
        if (arrayList.size() == 0) {
            C15626c.makeText(activity, C17541R$string.no_string_variables_defined, 1).show();
            return;
        }
        String[] strArr = new String[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            strArr[i2] = ((MacroDroidVariable) arrayList.get(i2)).getName();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, i);
        builder.setTitle((int) C17541R$string.action_set_variable_select);
        builder.setSingleChoiceItems((CharSequence[]) strArr, 0, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4011f0(arrayList, activity, str, eVar, i));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C4020i0.f10417a);
        builder.create().show();
    }

    /* renamed from: K */
    private static int m15705K(String str) {
        if (str.startsWith("[")) {
            return str.indexOf("]");
        }
        return str.indexOf("}");
    }

    /* renamed from: L */
    private static boolean m15706L(String str, String str2) {
        return str.equals(str2) || str.equals(str2.replace("[", "{").replace("]", "}"));
    }

    /* renamed from: M */
    private static boolean m15707M() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    /* renamed from: N */
    private static String m15708N(long j) {
        String str;
        if (j >= FileUtils.ONE_KB) {
            j /= FileUtils.ONE_KB;
            if (j >= FileUtils.ONE_KB) {
                j /= FileUtils.ONE_KB;
                str = "MB";
            } else {
                str = "KB";
            }
        } else {
            str = null;
        }
        StringBuilder sb = new StringBuilder(Long.toString(j));
        for (int length = sb.length() - 3; length > 0; length -= 3) {
            sb.insert(length, ',');
        }
        if (str != null) {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: O */
    private static String m15709O(long j) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator(FilenameUtils.EXTENSION_SEPARATOR);
        new DecimalFormat("#.#######", decimalFormatSymbols);
        return new DecimalFormat("0.00##", decimalFormatSymbols).format(((double) j) / 1000.0d);
    }

    /* renamed from: P */
    private static String m15710P(long j) {
        long j2 = j / 1000;
        return String.format("%02d", new Object[]{Long.valueOf(j2 / 3600)}) + ":" + String.format("%02d", new Object[]{Long.valueOf((j2 / 60) % 60)}) + ":" + String.format("%02d", new Object[]{Long.valueOf(j2 % 60)});
    }

    /* renamed from: Q */
    private static String m15711Q(Context context) {
        if (m15730e0(context)) {
            return m15708N(m15720Z(context).getFreeSpace());
        }
        if (!m15707M()) {
            return "?";
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return m15708N(((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()));
    }

    /* renamed from: R */
    private static String m15712R() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return m15708N(((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()));
    }

    /* renamed from: S */
    private static String m15713S(long j) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            return simpleDateFormat.format(instance.getTime());
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: T */
    private static DecimalFormat m15714T(String str) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat(str);
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return decimalFormat;
    }

    /* renamed from: U */
    private static List<C4029f> m15715U(boolean z, boolean z2, Macro macro, C7967d dVar) {
        C4027d dVar2 = new C4027d();
        ArrayList arrayList = new ArrayList();
        if (dVar == C7967d.ARRAY) {
            arrayList.add(dVar2.f10568x1);
            arrayList.add(dVar2.f10574z1);
        } else if (dVar == C7967d.DICTIONARY) {
            arrayList.add(dVar2.f10571y1);
            arrayList.add(dVar2.f10574z1);
        }
        arrayList.add(dVar2.f10497a);
        for (String next : C10330a.m40553e(MacroDroidApplication.m14845u())) {
            String format = String.format("[stopwatch=%s]", new Object[]{next});
            arrayList.add(new C4029f(format, m15722a0(C17541R$string.action_stop_watch) + ": " + next));
        }
        if (macro != null) {
            for (MacroDroidVariable next2 : macro.getLocalVariables()) {
                String format2 = String.format("[lv=%s]", new Object[]{next2.getName()});
                arrayList.add(new C4029f(format2, m15722a0(C17541R$string.local_variable_short_name) + ": " + next2.getName()));
            }
        }
        for (MacroDroidVariable next3 : C4064u.m16048t().mo27993r(true)) {
            String format3 = String.format("[v=%s]", new Object[]{next3.getName()});
            arrayList.add(new C4029f(format3, m15722a0(C17541R$string.variable_short_name) + ": " + next3.getName()));
        }
        if (C4064u.m16048t().mo27991p().size() > 0 || (macro != null && macro.getLocalVariables().size() > 0)) {
            arrayList.add(dVar2.f10502b1);
            arrayList.add(dVar2.f10505c1);
        }
        if (C4064u.m16048t().mo27987l().size() > 0 || (macro != null && macro.getLocalVariables().size() > 0)) {
            arrayList.add(dVar2.f10496Z0);
        }
        if (z) {
            arrayList.add(dVar2.f10543p0);
        }
        arrayList.add(dVar2.f10541o1);
        arrayList.add(dVar2.f10544p1);
        arrayList.add(dVar2.f10558u0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            arrayList.add(dVar2.f10561v0);
        }
        arrayList.add(dVar2.f10567x0);
        arrayList.add(dVar2.f10500b);
        arrayList.add(dVar2.f10503c);
        arrayList.add(dVar2.f10506d);
        arrayList.add(dVar2.f10509e);
        arrayList.add(dVar2.f10512f);
        arrayList.add(dVar2.f10515g);
        arrayList.add(dVar2.f10518h);
        arrayList.add(dVar2.f10521i);
        arrayList.add(dVar2.f10524j);
        arrayList.add(dVar2.f10527k);
        arrayList.add(dVar2.f10530l);
        arrayList.add(dVar2.f10557u);
        arrayList.add(dVar2.f10533m);
        arrayList.add(dVar2.f10536n);
        arrayList.add(dVar2.f10539o);
        arrayList.add(dVar2.f10542p);
        arrayList.add(dVar2.f10545q);
        arrayList.add(dVar2.f10548r);
        arrayList.add(dVar2.f10551s);
        arrayList.add(dVar2.f10554t);
        arrayList.add(dVar2.f10560v);
        arrayList.add(dVar2.f10563w);
        arrayList.add(dVar2.f10565w1);
        arrayList.add(dVar2.f10508d1);
        arrayList.add(dVar2.f10511e1);
        arrayList.add(dVar2.f10514f1);
        if (C4031k.m15911k()) {
            arrayList.add(dVar2.f10546q0);
        }
        arrayList.add(dVar2.f10479R);
        TelephonyManager telephonyManager = (TelephonyManager) MacroDroidApplication.m14845u().getSystemService("phone");
        if (telephonyManager.getPhoneType() == 1) {
            arrayList.add(dVar2.f10481S);
            arrayList.add(dVar2.f10483T);
            arrayList.add(dVar2.f10485U);
            if (i < 29) {
                arrayList.add(dVar2.f10489W);
            }
        } else if (telephonyManager.getPhoneType() == 2) {
            arrayList.add(dVar2.f10491X);
        }
        if (telephonyManager.getPhoneType() == 1 || telephonyManager.getPhoneType() == 2) {
            arrayList.add(dVar2.f10487V);
        }
        arrayList.add(dVar2.f10516g0);
        arrayList.add(dVar2.f10519h0);
        arrayList.add(dVar2.f10522i0);
        arrayList.add(dVar2.f10525j0);
        arrayList.add(dVar2.f10528k0);
        arrayList.add(dVar2.f10531l0);
        arrayList.add(dVar2.f10534m0);
        arrayList.add(dVar2.f10537n0);
        arrayList.add(dVar2.f10540o0);
        arrayList.add(dVar2.f10573z0);
        arrayList.add(dVar2.f10446A0);
        arrayList.add(dVar2.f10448B0);
        arrayList.add(dVar2.f10450C0);
        arrayList.add(dVar2.f10452D0);
        arrayList.add(dVar2.f10454E0);
        arrayList.add(dVar2.f10456F0);
        if (z2) {
            arrayList.add(dVar2.f10458G0);
            arrayList.add(dVar2.f10460H0);
        }
        if (i <= 28) {
            arrayList.add(dVar2.f10462I0);
        }
        if (i >= 25) {
            arrayList.add(dVar2.f10464J0);
        }
        arrayList.add(dVar2.f10552s0);
        arrayList.add(dVar2.f10555t0);
        arrayList.add(dVar2.f10466K0);
        arrayList.add(dVar2.f10468L0);
        arrayList.add(dVar2.f10550r1);
        arrayList.add(dVar2.f10553s1);
        arrayList.add(dVar2.f10470M0);
        arrayList.add(dVar2.f10472N0);
        arrayList.add(dVar2.f10474O0);
        arrayList.add(dVar2.f10556t1);
        arrayList.add(dVar2.f10559u1);
        arrayList.add(dVar2.f10562v1);
        arrayList.add(dVar2.f10517g1);
        arrayList.add(dVar2.f10520h1);
        arrayList.add(dVar2.f10523i1);
        arrayList.add(dVar2.f10526j1);
        arrayList.add(dVar2.f10529k1);
        arrayList.add(dVar2.f10532l1);
        return arrayList;
    }

    /* renamed from: V */
    private static String[] m15716V(List<C4029f> list) {
        String[] strArr = new String[list.size()];
        int i = 0;
        for (C4029f fVar : list) {
            strArr[i] = fVar.f10576b;
            i++;
        }
        return strArr;
    }

    /* renamed from: W */
    private static List<C4029f> m15717W(Macro macro, C7967d dVar) {
        C4027d dVar2 = new C4027d();
        ArrayList arrayList = new ArrayList();
        if (dVar == C7967d.ARRAY) {
            arrayList.add(dVar2.f10568x1);
            arrayList.add(dVar2.f10574z1);
        } else if (dVar == C7967d.DICTIONARY) {
            arrayList.add(dVar2.f10571y1);
            arrayList.add(dVar2.f10574z1);
        }
        for (String next : C10330a.m40553e(MacroDroidApplication.m14845u())) {
            String format = String.format("[stopwatch=%s]", new Object[]{next});
            arrayList.add(new C4029f(format, m15722a0(C17541R$string.action_stop_watch) + ": " + next));
        }
        if (macro != null) {
            for (MacroDroidVariable next2 : macro.getLocalVariables()) {
                if (next2.mo27779x() || next2.mo27777w()) {
                    String format2 = String.format("[lv=%s]", new Object[]{next2.getName()});
                    arrayList.add(new C4029f(format2, m15722a0(C17541R$string.local_variable_short_name) + ": " + next2.getName()));
                }
            }
        }
        for (MacroDroidVariable next3 : C4064u.m16048t().mo27993r(true)) {
            if (next3.mo27779x() || next3.mo27777w()) {
                String format3 = String.format("[v=%s]", new Object[]{next3.getName()});
                arrayList.add(new C4029f(format3, m15722a0(C17541R$string.variable_short_name) + ": " + next3.getName()));
            }
        }
        if (C4064u.m16048t().mo27991p().size() > 0 || (macro != null && macro.getLocalVariables().size() > 0)) {
            arrayList.add(dVar2.f10502b1);
            arrayList.add(dVar2.f10505c1);
        }
        if (C4064u.m16048t().mo27987l().size() > 0 || (macro != null && macro.getLocalVariables().size() > 0)) {
            arrayList.add(dVar2.f10496Z0);
        }
        arrayList.add(dVar2.f10558u0);
        arrayList.add(dVar2.f10567x0);
        arrayList.add(dVar2.f10564w0);
        arrayList.add(dVar2.f10503c);
        arrayList.add(dVar2.f10519h0);
        arrayList.add(dVar2.f10522i0);
        arrayList.add(dVar2.f10525j0);
        arrayList.add(dVar2.f10573z0);
        arrayList.add(dVar2.f10454E0);
        arrayList.add(dVar2.f10446A0);
        arrayList.add(dVar2.f10450C0);
        arrayList.add(dVar2.f10448B0);
        arrayList.add(dVar2.f10452D0);
        arrayList.add(dVar2.f10456F0);
        arrayList.add(dVar2.f10521i);
        arrayList.add(dVar2.f10524j);
        arrayList.add(dVar2.f10530l);
        arrayList.add(dVar2.f10557u);
        arrayList.add(dVar2.f10533m);
        arrayList.add(dVar2.f10536n);
        arrayList.add(dVar2.f10539o);
        arrayList.add(dVar2.f10542p);
        arrayList.add(dVar2.f10548r);
        arrayList.add(dVar2.f10551s);
        arrayList.add(dVar2.f10554t);
        arrayList.add(dVar2.f10563w);
        arrayList.add(dVar2.f10555t0);
        arrayList.add(dVar2.f10472N0);
        arrayList.add(dVar2.f10559u1);
        arrayList.add(dVar2.f10562v1);
        return arrayList;
    }

    /* renamed from: X */
    private static String m15718X(Context context, boolean z) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return String.format("%.2fGB", new Object[]{Double.valueOf(((double) (z ? memoryInfo.totalMem : memoryInfo.availMem)) / 1.0E9d)});
    }

    /* renamed from: Y */
    private static Point m15719Y(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point;
    }

    /* renamed from: Z */
    private static File m15720Z(Context context) {
        File[] externalFilesDirs = ContextCompat.getExternalFilesDirs(context, (String) null);
        if (externalFilesDirs.length >= 2) {
            return externalFilesDirs[1];
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public static String m15722a0(int i) {
        return MacroDroidApplication.m14845u().getString(i);
    }

    /* renamed from: b0 */
    private static String m15724b0(Context context) {
        if (m15730e0(context)) {
            return m15708N(m15720Z(context).getTotalSpace());
        }
        if (!m15707M()) {
            return "?";
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return m15708N(((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()));
    }

    /* renamed from: c0 */
    private static String m15726c0() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return m15708N(((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()));
    }

    /* renamed from: d0 */
    private static List<C4029f> m15728d0(List<Trigger> list, boolean z) {
        if (list == null || list.size() == 0) {
            return null;
        }
        C4027d dVar = new C4027d();
        ArrayList<C4029f> arrayList = new ArrayList<>();
        int i = 0;
        boolean z2 = false;
        while (i < list.size()) {
            Trigger trigger = list.get(i);
            i++;
            for (int i2 = i; i2 < list.size(); i2++) {
                if (!trigger.getClass().equals(list.get(i2).getClass())) {
                    z2 = true;
                }
            }
            if (trigger instanceof NotificationTrigger) {
                m15757s(arrayList, dVar.f10566x);
                m15757s(arrayList, dVar.f10569y);
                m15757s(arrayList, dVar.f10572z);
                m15757s(arrayList, dVar.f10445A);
                m15757s(arrayList, dVar.f10451D);
                m15757s(arrayList, dVar.f10453E);
                m15757s(arrayList, dVar.f10455F);
                m15757s(arrayList, dVar.f10447B);
                m15757s(arrayList, dVar.f10449C);
            } else if (trigger instanceof IncomingSMSTrigger) {
                m15757s(arrayList, dVar.f10457G);
                m15757s(arrayList, dVar.f10459H);
                m15757s(arrayList, dVar.f10461I);
            } else if (trigger instanceof SMSSentTrigger) {
                m15757s(arrayList, dVar.f10463J);
                m15757s(arrayList, dVar.f10465K);
                m15757s(arrayList, dVar.f10467L);
            } else if ((trigger instanceof IncomingCallTrigger) || (trigger instanceof OutgoingCallTrigger) || (trigger instanceof CallEndedTrigger) || (trigger instanceof CallActiveTrigger) || (trigger instanceof CallMissedTrigger)) {
                m15757s(arrayList, dVar.f10475P);
                m15757s(arrayList, dVar.f10477Q);
            } else if (trigger instanceof ApplicationLaunchedTrigger) {
                m15757s(arrayList, dVar.f10469M);
            } else if (trigger instanceof ApplicationInstalledRemovedTrigger) {
                if (((ApplicationInstalledRemovedTrigger) trigger).mo30914p3()) {
                    m15757s(arrayList, dVar.f10469M);
                }
                m15757s(arrayList, dVar.f10471N);
            } else if (trigger instanceof LocationTrigger) {
                m15757s(arrayList, dVar.f10473O);
            } else if (trigger instanceof WeatherTrigger) {
                m15757s(arrayList, dVar.f10493Y);
                m15757s(arrayList, dVar.f10495Z);
                m15757s(arrayList, dVar.f10498a0);
                m15757s(arrayList, dVar.f10501b0);
                m15757s(arrayList, dVar.f10504c0);
                m15757s(arrayList, dVar.f10507d0);
                m15757s(arrayList, dVar.f10510e0);
                m15757s(arrayList, dVar.f10513f0);
            } else if (trigger instanceof CalendarTrigger) {
                m15757s(arrayList, dVar.f10476P0);
                m15757s(arrayList, dVar.f10478Q0);
                m15757s(arrayList, dVar.f10480R0);
                m15757s(arrayList, dVar.f10482S0);
                m15757s(arrayList, dVar.f10484T0);
                m15757s(arrayList, dVar.f10486U0);
                m15757s(arrayList, dVar.f10488V0);
                m15757s(arrayList, dVar.f10490W0);
                m15757s(arrayList, dVar.f10492X0);
            } else if (trigger instanceof BluetoothTrigger) {
                BluetoothTrigger bluetoothTrigger = (BluetoothTrigger) trigger;
                if (bluetoothTrigger.mo30975m3() == 2 || bluetoothTrigger.mo30975m3() == 3) {
                    m15757s(arrayList, dVar.f10494Y0);
                }
            } else if (trigger instanceof UsbDeviceConnectionTrigger) {
                m15757s(arrayList, dVar.f10535m1);
                m15757s(arrayList, dVar.f10538n1);
            } else if (!z && (trigger instanceof LogcatTrigger)) {
                m15757s(arrayList, dVar.f10547q1);
            }
        }
        if (z2) {
            for (C4029f fVar : arrayList) {
                if (!fVar.f10576b.startsWith(ProxyConfig.MATCH_ALL_SCHEMES)) {
                    fVar.f10576b = ProxyConfig.MATCH_ALL_SCHEMES + fVar.f10576b;
                }
            }
        } else {
            for (C4029f fVar2 : arrayList) {
                if (fVar2.f10576b.startsWith(ProxyConfig.MATCH_ALL_SCHEMES)) {
                    fVar2.f10576b = fVar2.f10576b.substring(1);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e0 */
    private static boolean m15730e0(Context context) {
        File[] externalFilesDirs = ContextCompat.getExternalFilesDirs(context, (String) null);
        return externalFilesDirs.length >= 2 && externalFilesDirs[1] != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public static /* synthetic */ void m15732f0(boolean z, C4028e eVar, String str, String str2, boolean z2, VariableValue.DictionaryEntry[] dictionaryEntryArr, Activity activity, boolean z3, boolean z4, int i, String[] strArr, DialogInterface dialogInterface, int i2) {
        C4028e eVar2 = eVar;
        String str3 = str;
        String str4 = str2;
        int checkedItemPosition = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        if (z && checkedItemPosition == 0) {
            eVar.mo25564a(new C4029f(str.replace("%s", str2), ""));
        } else if (!z2 || checkedItemPosition != 0) {
            int i3 = checkedItemPosition - ((z || z2) ? 1 : 0);
            VariableValue variable = dictionaryEntryArr[i3].getVariable();
            if (variable == null || !(variable instanceof VariableValue.Dictionary)) {
                eVar.mo25564a(new C4029f(str.replace("%s", strArr[checkedItemPosition]), ""));
                return;
            }
            m15767x(activity, str, str2 + "[" + dictionaryEntryArr[i3].getKey() + "]", (VariableValue.Dictionary) variable, eVar, z3, z4, z, z2, i);
        } else {
            eVar.mo25564a(new C4029f(str.replace("%s", str2), ""));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public static /* synthetic */ void m15736h0(List list, Activity activity, String str, C4028e eVar, int i, DialogInterface dialogInterface, int i2) {
        ListView listView = ((AlertDialog) dialogInterface).getListView();
        String str2 = (String) listView.getAdapter().getItem(listView.getCheckedItemPosition());
        List list2 = list;
        MacroDroidVariable macroDroidVariable = (MacroDroidVariable) list.get(listView.getCheckedItemPosition());
        if (macroDroidVariable == null || (!macroDroidVariable.mo27776v() && !macroDroidVariable.mo27773s())) {
            Object[] objArr = {str2};
            String str3 = str;
            eVar.mo25564a(new C4029f(String.format(str, objArr), ""));
            return;
        }
        m15767x(activity, str, macroDroidVariable.getName(), macroDroidVariable.mo27770n(), eVar, false, true, false, true, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public static /* synthetic */ void m15744l0(Activity activity, Macro macro, C4028e eVar, int i, DialogInterface dialogInterface, int i2) {
        if (m15706L(f10423b.f10575a, "[strval=%s]") || m15706L(f10423b.f10575a, "[strlen=%s]")) {
            m15704J(activity, macro, f10423b.f10575a, eVar, i);
        } else if (m15706L(f10423b.f10575a, "[size=%s]")) {
            m15771z(activity, macro, f10423b.f10575a, eVar, i);
        } else if (m15696B0(f10423b.f10575a, "[v=")) {
            String str = f10423b.f10575a;
            MacroDroidVariable w = C4064u.m16048t().mo27996w(str.substring(str.indexOf(61) + 1, m15705K(f10423b.f10575a)));
            if (w == null || (!w.mo27751a0() && !w.mo27748X())) {
                eVar.mo25564a(f10423b);
                return;
            }
            m15767x(activity, "[v=%s]", w.getName(), w.mo27770n(), eVar, true, false, true, false, i);
        } else if (m15696B0(f10423b.f10575a, "[lv=")) {
            String str2 = f10423b.f10575a;
            MacroDroidVariable variableByName = macro.getVariableByName(str2.substring(str2.indexOf(61) + 1, m15705K(f10423b.f10575a)));
            if (variableByName == null || (!variableByName.mo27751a0() && !variableByName.mo27748X())) {
                eVar.mo25564a(f10423b);
                return;
            }
            m15767x(activity, "[lv=%s]", variableByName.getName(), variableByName.mo27770n(), eVar, true, false, true, false, i);
        } else {
            eVar.mo25564a(f10423b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public static /* synthetic */ void m15746m0(C4028e eVar, DialogInterface dialogInterface, int i) {
        ListView listView = ((AlertDialog) dialogInterface).getListView();
        eVar.mo25564a(new C4029f((String) listView.getAdapter().getItem(listView.getCheckedItemPosition()), ""));
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public static /* synthetic */ void m15752p0(List list, ListView listView, Activity activity, int i, C4028e eVar, Macro macro, AppCompatDialog appCompatDialog, View view) {
        Activity activity2 = activity;
        int i2 = i;
        C4028e eVar2 = eVar;
        Macro macro2 = macro;
        List list2 = list;
        C4029f fVar = (C4029f) list.get(listView.getCheckedItemPosition());
        f10423b = fVar;
        if (m15706L(fVar.f10575a, "[stringmanipulation]")) {
            StringManipulation.m24587a(activity, i, eVar);
        } else if (m15696B0(f10423b.f10575a, "[stopwatch=")) {
            m15703I(activity, f10423b.f10575a, eVar, i);
        } else if (m15696B0(f10423b.f10575a, "[setting_")) {
            m15769y(activity, f10423b.f10575a, eVar, i);
        } else if (m15706L(f10423b.f10575a, "[strval=%s]") || m15706L(f10423b.f10575a, "[strlen=%s]")) {
            m15704J(activity, macro2, f10423b.f10575a, eVar, i);
        } else if (m15706L(f10423b.f10575a, "[size=%s]")) {
            m15771z(activity, macro2, f10423b.f10575a, eVar, i);
        } else if (m15706L(f10423b.f10575a, "[fg_app_name]") || m15706L(f10423b.f10575a, "[fg_app_package]")) {
            if (!C4061t1.m15992f0(activity)) {
                C7439d0.m30883b0(activity, false, false, false, false, false);
                eVar.mo25564a(f10423b);
            } else {
                eVar.mo25564a(f10423b);
            }
        } else if (m15696B0(f10423b.f10575a, "[v=")) {
            String str = f10423b.f10575a;
            MacroDroidVariable w = C4064u.m16048t().mo27996w(str.substring(str.indexOf(61) + 1, m15705K(f10423b.f10575a)));
            if (w == null || (!w.mo27751a0() && !w.mo27748X())) {
                eVar.mo25564a(f10423b);
            } else {
                m15767x(activity, "[v=%s]", w.getName(), w.mo27770n(), eVar, false, false, true, false, i);
            }
        } else if (m15696B0(f10423b.f10575a, "[lv=")) {
            String str2 = f10423b.f10575a;
            MacroDroidVariable variableByName = macro2.getVariableByName(str2.substring(str2.indexOf(61) + 1, m15705K(f10423b.f10575a)));
            if (variableByName == null || (!variableByName.mo27751a0() && !variableByName.mo27748X())) {
                eVar.mo25564a(f10423b);
            } else {
                m15767x(activity, "[lv=%s]", variableByName.getName(), variableByName.mo27770n(), eVar, false, false, true, false, i);
            }
        } else {
            eVar.mo25564a(f10423b);
        }
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public static /* synthetic */ void m15754q0(C4028e eVar, String str, DialogInterface dialogInterface, int i) {
        int checkedItemPosition = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        if (checkedItemPosition == 0) {
            eVar.mo25564a(new C4029f(str, ""));
        } else if (checkedItemPosition == 1) {
            eVar.mo25564a(new C4029f(str.replace("stopwatch=", "stopwatchtime="), ""));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public static /* synthetic */ void m15756r0(List list, Activity activity, String str, C4028e eVar, int i, DialogInterface dialogInterface, int i2) {
        ListView listView = ((AlertDialog) dialogInterface).getListView();
        String str2 = (String) listView.getAdapter().getItem(listView.getCheckedItemPosition());
        List list2 = list;
        MacroDroidVariable macroDroidVariable = (MacroDroidVariable) list.get(listView.getCheckedItemPosition());
        if (macroDroidVariable == null || (!macroDroidVariable.mo27751a0() && !macroDroidVariable.mo27748X())) {
            Object[] objArr = {str2};
            String str3 = str;
            eVar.mo25564a(new C4029f(String.format(str, objArr), ""));
            return;
        }
        m15767x(activity, str, macroDroidVariable.getName(), macroDroidVariable.mo27770n(), eVar, false, false, false, false, i);
    }

    /* renamed from: s */
    private static void m15757s(List<C4029f> list, C4029f fVar) {
        if (!list.contains(fVar)) {
            list.add(fVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static String m15759t(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    /* renamed from: t0 */
    public static String m15760t0(Context context, String str, TriggerContextInfo triggerContextInfo, Macro macro) {
        return m15762u0(context, str, triggerContextInfo, macro, false);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:33|34) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r14 = java.lang.Double.valueOf(r11.replaceAll(",", ".")).doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r14 = java.lang.Double.valueOf(r11.replaceAll(",", ".")).doubleValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00f1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00fe */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0126  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m15761u(com.arlosoft.macrodroid.variables.VariableValue.Dictionary r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.arlosoft.macrodroid.common.C4023j0.C4026c r23, boolean r24) {
        /*
            r0 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            java.lang.String r1 = ","
            java.lang.String r6 = "."
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r9 = 0
            r8[r9] = r0
            java.lang.String r8 = java.lang.String.format(r3, r8)
            boolean r10 = m15706L(r2, r8)
            if (r10 == 0) goto L_0x0027
            java.lang.String r0 = r19.toString()
            java.lang.String r0 = m15770y0(r2, r8, r0, r5)
            return r0
        L_0x0027:
            java.util.List r8 = r19.getEntries()
            java.util.Iterator r8 = r8.iterator()
            r10 = r2
        L_0x0030:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x013c
            java.lang.Object r11 = r8.next()
            com.arlosoft.macrodroid.variables.VariableValue$DictionaryEntry r11 = (com.arlosoft.macrodroid.variables.VariableValue.DictionaryEntry) r11
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r0)
            java.lang.String r13 = "["
            r12.append(r13)
            java.lang.String r13 = r11.getKey()
            r12.append(r13)
            java.lang.String r13 = "]"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            boolean r13 = m15765w(r2, r12)
            if (r13 == 0) goto L_0x0139
            java.lang.Object[] r13 = new java.lang.Object[r7]
            r13[r9] = r12
            java.lang.String r13 = java.lang.String.format(r3, r13)
            com.arlosoft.macrodroid.variables.VariableValue r11 = r11.getVariable()
            boolean r14 = r11 instanceof com.arlosoft.macrodroid.variables.VariableValue.Dictionary
            if (r14 == 0) goto L_0x00a3
            com.arlosoft.macrodroid.common.j0$c r0 = com.arlosoft.macrodroid.common.C4023j0.C4026c.ARRAY_DICTIONARY_SIZE
            if (r4 != r0) goto L_0x0092
            r0 = r11
            com.arlosoft.macrodroid.variables.VariableValue$Dictionary r0 = (com.arlosoft.macrodroid.variables.VariableValue.Dictionary) r0
            java.util.List r1 = r0.getEntries()
            int r1 = r1.size()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = m15770y0(r10, r13, r1, r5)
            r1 = r12
            r3 = r22
            r4 = r23
            r5 = r24
            java.lang.String r0 = m15761u(r0, r1, r2, r3, r4, r5)
            return r0
        L_0x0092:
            r0 = r11
            com.arlosoft.macrodroid.variables.VariableValue$Dictionary r0 = (com.arlosoft.macrodroid.variables.VariableValue.Dictionary) r0
            r1 = r12
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            java.lang.String r0 = m15761u(r0, r1, r2, r3, r4, r5)
            return r0
        L_0x00a3:
            com.arlosoft.macrodroid.common.j0$c r12 = com.arlosoft.macrodroid.common.C4023j0.C4026c.VALUE
            if (r4 != r12) goto L_0x00b1
            java.lang.String r11 = r11.getValueAsText()
            java.lang.String r10 = m15770y0(r10, r13, r11, r5)
            goto L_0x0139
        L_0x00b1:
            com.arlosoft.macrodroid.common.j0$c r12 = com.arlosoft.macrodroid.common.C4023j0.C4026c.STRING_LENGTH
            if (r4 != r12) goto L_0x00c7
            java.lang.String r11 = r11.getValueAsText()
            int r11 = r11.length()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r10 = m15770y0(r10, r13, r11, r5)
            goto L_0x0139
        L_0x00c7:
            com.arlosoft.macrodroid.common.j0$c r12 = com.arlosoft.macrodroid.common.C4023j0.C4026c.STRING_VALUE
            if (r4 != r12) goto L_0x0139
            r14 = 0
            java.lang.String r11 = r11.getValueAsText()
            r16 = 0
            boolean r12 = r11.contains(r6)     // Catch:{ NumberFormatException -> 0x00f1 }
            if (r12 != 0) goto L_0x00e8
            boolean r12 = r11.contains(r1)     // Catch:{ NumberFormatException -> 0x00f1 }
            if (r12 != 0) goto L_0x00e8
            java.lang.Long r12 = java.lang.Long.valueOf(r11)     // Catch:{ NumberFormatException -> 0x00f1 }
            long r11 = r12.longValue()     // Catch:{ NumberFormatException -> 0x00f1 }
            goto L_0x010c
        L_0x00e8:
            java.lang.Double r12 = java.lang.Double.valueOf(r11)     // Catch:{ NumberFormatException -> 0x00f1 }
            double r14 = r12.doubleValue()     // Catch:{ NumberFormatException -> 0x00f1 }
            goto L_0x010a
        L_0x00f1:
            java.lang.String r12 = r11.replaceAll(r1, r6)     // Catch:{ NumberFormatException -> 0x00fe }
            java.lang.Double r12 = java.lang.Double.valueOf(r12)     // Catch:{ NumberFormatException -> 0x00fe }
            double r14 = r12.doubleValue()     // Catch:{ NumberFormatException -> 0x00fe }
            goto L_0x010a
        L_0x00fe:
            java.lang.String r11 = r11.replaceAll(r1, r6)     // Catch:{ Exception -> 0x010a }
            java.lang.Double r11 = java.lang.Double.valueOf(r11)     // Catch:{ Exception -> 0x010a }
            double r14 = r11.doubleValue()     // Catch:{ Exception -> 0x010a }
        L_0x010a:
            r11 = r16
        L_0x010c:
            java.lang.String r7 = ""
            int r18 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r18 == 0) goto L_0x0126
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r7)
            r14.append(r11)
            java.lang.String r7 = r14.toString()
            java.lang.String r10 = m15770y0(r10, r13, r7, r5)
            goto L_0x0139
        L_0x0126:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r7)
            r11.append(r14)
            java.lang.String r7 = r11.toString()
            java.lang.String r10 = m15770y0(r10, r13, r7, r5)
        L_0x0139:
            r7 = 1
            goto L_0x0030
        L_0x013c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.common.C4023j0.m15761u(com.arlosoft.macrodroid.variables.VariableValue$Dictionary, java.lang.String, java.lang.String, java.lang.String, com.arlosoft.macrodroid.common.j0$c, boolean):java.lang.String");
    }

    /* renamed from: u0 */
    public static String m15762u0(Context context, String str, TriggerContextInfo triggerContextInfo, Macro macro, boolean z) {
        return m15766w0(context, str, triggerContextInfo, false, macro, z);
    }

    /* renamed from: v */
    private static boolean m15763v(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (!wifiManager.isWifiEnabled() || wifiManager.getConnectionInfo().getNetworkId() == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: v0 */
    public static String m15764v0(Context context, String str, TriggerContextInfo triggerContextInfo, boolean z, Macro macro) {
        return m15766w0(context, str, triggerContextInfo, z, macro, false);
    }

    /* renamed from: w */
    private static boolean m15765w(String str, String str2) {
        return str.contains(str2) || str.contains(str2.replace("[", "{").replace("]", "}"));
    }

    /* renamed from: w0 */
    public static String m15766w0(Context context, String str, TriggerContextInfo triggerContextInfo, boolean z, Macro macro, boolean z2) {
        return m15768x0(context, str, triggerContextInfo, z, macro, z2, Locale.getDefault());
    }

    /* renamed from: x */
    public static void m15767x(@NonNull Activity activity, @NonNull String str, @NonNull String str2, @NonNull VariableValue.Dictionary dictionary, @NonNull C4028e eVar, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        VariableValue.DictionaryEntry[] dictionaryEntryArr;
        String[] strArr;
        Activity activity2 = activity;
        String str3 = str2;
        if (z) {
            dictionaryEntryArr = (VariableValue.DictionaryEntry[]) dictionary.getNumEntriesOnly().toArray(new VariableValue.DictionaryEntry[0]);
        } else if (z2) {
            dictionaryEntryArr = (VariableValue.DictionaryEntry[]) dictionary.getDictionaryOrArryEntriesOnly().toArray(new VariableValue.DictionaryEntry[0]);
        } else {
            dictionaryEntryArr = (VariableValue.DictionaryEntry[]) dictionary.getEntries().toArray(new VariableValue.DictionaryEntry[0]);
        }
        VariableValue.DictionaryEntry[] dictionaryEntryArr2 = dictionaryEntryArr;
        String replace = C5163j2.m20055S0(activity) == f10422a ? str.replace("[", "{").replace("]", "}") : str;
        if (z3) {
            strArr = new String[(dictionaryEntryArr2.length + 1)];
            strArr[0] = activity.getString(C17541R$string.variable_output_all_entries);
            int i2 = 0;
            while (i2 < dictionaryEntryArr2.length) {
                int i3 = i2 + 1;
                strArr[i3] = str3 + "[" + dictionaryEntryArr2[i2].getKey() + "]";
                i2 = i3;
            }
        } else if (z4) {
            strArr = new String[(dictionaryEntryArr2.length + 1)];
            strArr[0] = activity.getString(dictionary.isArray() ? C17541R$string.variable_this_array : C17541R$string.variable_this_dictionary);
            int i4 = 0;
            while (i4 < dictionaryEntryArr2.length) {
                int i5 = i4 + 1;
                strArr[i5] = str3 + "[" + dictionaryEntryArr2[i4].getKey() + "]";
                i4 = i5;
            }
        } else {
            strArr = new String[dictionaryEntryArr2.length];
            for (int i6 = 0; i6 < dictionaryEntryArr2.length; i6++) {
                strArr[i6] = str3 + "[" + dictionaryEntryArr2[i6].getKey() + "]";
            }
        }
        String[] strArr2 = strArr;
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, i);
        if (dictionary.isArray()) {
            builder.setTitle((CharSequence) m15722a0(C17541R$string.variable_array_index));
        } else {
            builder.setTitle((CharSequence) m15722a0(C17541R$string.variable_select_dictionary_entry));
        }
        builder.setSingleChoiceItems((CharSequence[]) strArr2, 0, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4014g0(z3, eVar, replace, str2, z4, dictionaryEntryArr2, activity, z, z2, i, strArr2));
        AlertDialog create = builder.create();
        create.show();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(create.getWindow().getAttributes());
        layoutParams.width = -1;
        create.getWindow().setAttributes(layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:211:0x0574  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x05da  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0611  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x064c  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0687  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x06fe  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x070a  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x073a  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0833  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0898  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x08a9  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x08ca A[SYNTHETIC, Splitter:B:316:0x08ca] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0908 A[SYNTHETIC, Splitter:B:322:0x0908] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0939  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0958  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x09a0  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x09b9  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x09d4  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0a0e  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0a47  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0a81  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0abb  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0aed  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0af6  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0b2e  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0b61  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0b92  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0bc7  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0bd9  */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0be2  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x0bf2  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x0c02  */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x0c12  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0c26  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x0c3e  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0c60  */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0c69  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0c81  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0c99  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0cac  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0cbe  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0cd0  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0ce2  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0cf4  */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x0d06  */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x0d3e  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0d6d  */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x0d76  */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x0d94  */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x0ea1  */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x0ee5  */
    /* JADX WARNING: Removed duplicated region for block: B:514:0x0f2c  */
    /* JADX WARNING: Removed duplicated region for block: B:541:? A[RETURN, SYNTHETIC] */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m15768x0(android.content.Context r22, java.lang.String r23, com.arlosoft.macrodroid.triggers.TriggerContextInfo r24, boolean r25, com.arlosoft.macrodroid.macro.Macro r26, boolean r27, java.util.Locale r28) {
        /*
            r1 = r22
            r2 = r25
            java.lang.String r0 = m15772z0(r22, r23, r24, r25)
            java.lang.String r3 = ""
            if (r0 != 0) goto L_0x000d
            return r3
        L_0x000d:
            java.lang.String r4 = "[iterator_array_index]"
            boolean r5 = m15765w(r0, r4)
            if (r5 == 0) goto L_0x002e
            com.arlosoft.macrodroid.action.IterateDictionaryAction r5 = p064c2.C2267a.m9334c(r26)
            if (r5 == 0) goto L_0x0028
            int r5 = r5.mo25244c4()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = m15770y0(r0, r4, r5, r2)
            goto L_0x002e
        L_0x0028:
            java.lang.String r5 = "-1"
            java.lang.String r0 = m15770y0(r0, r4, r5, r2)
        L_0x002e:
            java.lang.String r4 = "[iterator_value]"
            boolean r5 = m15765w(r0, r4)
            java.lang.String r6 = "?"
            if (r5 == 0) goto L_0x0051
            com.arlosoft.macrodroid.action.IterateDictionaryAction r5 = p064c2.C2267a.m9334c(r26)
            if (r5 == 0) goto L_0x0047
            java.lang.String r5 = r5.mo25247f4()
            java.lang.String r0 = m15770y0(r0, r4, r5, r2)
            goto L_0x0051
        L_0x0047:
            if (r27 == 0) goto L_0x004c
            java.lang.String r5 = "0"
            goto L_0x004d
        L_0x004c:
            r5 = r6
        L_0x004d:
            java.lang.String r0 = m15770y0(r0, r4, r5, r2)
        L_0x0051:
            java.lang.String r4 = "[iterator_dictionary_key]"
            boolean r5 = m15765w(r0, r4)
            if (r5 == 0) goto L_0x0070
            com.arlosoft.macrodroid.action.IterateDictionaryAction r5 = p064c2.C2267a.m9334c(r26)
            if (r5 == 0) goto L_0x006c
            java.lang.String r5 = r5.mo25245d4()
            if (r5 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r5 = r3
        L_0x0067:
            java.lang.String r0 = m15770y0(r0, r4, r5, r2)
            goto L_0x0070
        L_0x006c:
            java.lang.String r0 = m15770y0(r0, r4, r3, r2)
        L_0x0070:
            java.lang.String r4 = "[mode]"
            boolean r4 = m15765w(r0, r4)
            if (r4 == 0) goto L_0x0082
            java.lang.String r4 = com.arlosoft.macrodroid.settings.C5163j2.m20083W0(r22)
            java.lang.String r5 = "[mode]"
            java.lang.String r0 = m15770y0(r0, r5, r4, r2)
        L_0x0082:
            java.lang.String r4 = "[battery]"
            boolean r4 = m15765w(r0, r4)
            java.lang.String r5 = "android.intent.action.BATTERY_CHANGED"
            r7 = 0
            r9 = -1
            r10 = 4636737291354636288(0x4059000000000000, double:100.0)
            r12 = 0
            if (r4 != 0) goto L_0x009a
            java.lang.String r4 = "[battery_temp]"
            boolean r4 = m15765w(r0, r4)
            if (r4 == 0) goto L_0x00e7
        L_0x009a:
            android.content.Context r4 = r22.getApplicationContext()
            android.content.IntentFilter r14 = new android.content.IntentFilter
            r14.<init>(r5)
            android.content.Intent r4 = r4.registerReceiver(r12, r14)
            java.lang.String r14 = "level"
            int r14 = r4.getIntExtra(r14, r9)
            java.lang.String r15 = "scale"
            int r15 = r4.getIntExtra(r15, r9)
            double r12 = (double) r15
            if (r14 < 0) goto L_0x00bf
            int r15 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r15 <= 0) goto L_0x00bf
            double r14 = (double) r14
            double r14 = r14 / r12
            double r14 = r14 * r10
            goto L_0x00c0
        L_0x00bf:
            r14 = r7
        L_0x00c0:
            java.lang.String r12 = "temperature"
            r13 = 0
            int r4 = r4.getIntExtra(r12, r13)
            java.text.NumberFormat r12 = java.text.DecimalFormat.getInstance(r28)
            java.text.DecimalFormat r12 = (java.text.DecimalFormat) r12
            double r10 = (double) r4
            r16 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r10 = r10 / r16
            java.lang.String r4 = r12.format(r10)
            int r10 = (int) r14
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r11 = "[battery]"
            java.lang.String r0 = m15770y0(r0, r11, r10, r2)
            java.lang.String r10 = "[battery_temp]"
            java.lang.String r0 = m15770y0(r0, r10, r4, r2)
        L_0x00e7:
            java.lang.String r4 = "[power]"
            boolean r4 = m15765w(r0, r4)
            r10 = 1
            if (r4 == 0) goto L_0x0123
            android.content.IntentFilter r4 = new android.content.IntentFilter
            r4.<init>(r5)
            r11 = 0
            android.content.Intent r4 = r1.registerReceiver(r11, r4)
            java.lang.String r11 = "plugged"
            int r4 = r4.getIntExtra(r11, r9)
            if (r4 == r10) goto L_0x010b
            r11 = 2
            if (r4 == r11) goto L_0x010b
            r11 = 4
            if (r4 != r11) goto L_0x0109
            goto L_0x010b
        L_0x0109:
            r4 = 0
            goto L_0x010c
        L_0x010b:
            r4 = 1
        L_0x010c:
            if (r4 == 0) goto L_0x0116
            r4 = 2131954511(0x7f130b4f, float:1.9545523E38)
            java.lang.String r4 = r1.getString(r4)
            goto L_0x011d
        L_0x0116:
            r4 = 2131954502(0x7f130b46, float:1.9545505E38)
            java.lang.String r4 = m15722a0(r4)
        L_0x011d:
            java.lang.String r11 = "[power]"
            java.lang.String r0 = m15770y0(r0, r11, r4, r2)
        L_0x0123:
            r4 = r0
            java.lang.String r0 = "[clipboard]"
            boolean r11 = m15765w(r4, r0)
            if (r11 == 0) goto L_0x019e
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 29
            if (r11 < r12) goto L_0x0161
            java.lang.String r11 = "clipboard"
            java.lang.Object r11 = r1.getSystemService(r11)
            android.content.ClipboardManager r11 = (android.content.ClipboardManager) r11
            android.content.ClipData r11 = r11.getPrimaryClip()
            if (r11 == 0) goto L_0x0152
            r12 = 0
            android.content.ClipData$Item r11 = r11.getItemAt(r12)
            if (r11 == 0) goto L_0x0150
            java.lang.CharSequence r11 = r11.coerceToText(r1)
            java.lang.String r11 = r11.toString()
            goto L_0x015c
        L_0x0150:
            r11 = r3
            goto L_0x015c
        L_0x0152:
            java.lang.String r11 = p105i1.C7394a.m30554a()
            if (r11 == 0) goto L_0x0150
            java.lang.String r11 = p105i1.C7394a.m30554a()
        L_0x015c:
            java.lang.String r4 = m15770y0(r4, r0, r11, r2)
            goto L_0x019e
        L_0x0161:
            java.lang.String r11 = "clipboard"
            java.lang.Object r11 = r1.getSystemService(r11)     // Catch:{ Exception -> 0x0185 }
            android.content.ClipboardManager r11 = (android.content.ClipboardManager) r11     // Catch:{ Exception -> 0x0185 }
            android.content.ClipData r11 = r11.getPrimaryClip()     // Catch:{ Exception -> 0x0185 }
            if (r11 == 0) goto L_0x017f
            r12 = 0
            android.content.ClipData$Item r11 = r11.getItemAt(r12)     // Catch:{ Exception -> 0x0185 }
            if (r11 == 0) goto L_0x017f
            java.lang.CharSequence r11 = r11.coerceToText(r1)     // Catch:{ Exception -> 0x0185 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0185 }
            goto L_0x0180
        L_0x017f:
            r11 = r3
        L_0x0180:
            java.lang.String r4 = m15770y0(r4, r0, r11, r2)     // Catch:{ Exception -> 0x0185 }
            goto L_0x019e
        L_0x0185:
            r0 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Failed to create clipboard manager: "
            r11.append(r12)
            java.lang.String r0 = r0.toString()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
        L_0x019e:
            java.lang.String r0 = "[ip]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x01b0
            java.lang.String r0 = com.arlosoft.macrodroid.common.C4061t1.m15967M()
            java.lang.String r11 = "[ip]"
            java.lang.String r4 = m15770y0(r4, r11, r0, r2)
        L_0x01b0:
            java.lang.String r0 = "[ip6]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x01c2
            java.lang.String r0 = com.arlosoft.macrodroid.common.C4061t1.m15969O()
            java.lang.String r11 = "[ip6]"
            java.lang.String r4 = m15770y0(r4, r11, r0, r2)
        L_0x01c2:
            java.lang.String r0 = "[ssid]"
            boolean r11 = m15765w(r4, r0)
            java.lang.String r12 = "android.permission.ACCESS_FINE_LOCATION"
            if (r11 == 0) goto L_0x024a
            int r11 = android.os.Build.VERSION.SDK_INT
            r13 = 27
            if (r11 < r13) goto L_0x01e1
            int r13 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r12)
            if (r13 == 0) goto L_0x01e1
            java.lang.String r13 = "Could not get SSID, location access/permission is required on Android 8.1+"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r13)
            r13 = 0
            p112j2.C7439d0.m30909o0(r1, r12, r0, r10, r13)
        L_0x01e1:
            boolean r13 = m15763v(r22)
            if (r13 == 0) goto L_0x023f
            android.content.Context r13 = r22.getApplicationContext()
            java.lang.String r14 = "wifi"
            java.lang.Object r13 = r13.getSystemService(r14)
            android.net.wifi.WifiManager r13 = (android.net.wifi.WifiManager) r13
            android.net.wifi.WifiInfo r13 = r13.getConnectionInfo()
            java.lang.String r13 = r13.getSSID()
            if (r13 == 0) goto L_0x0232
            java.lang.String r14 = "unknown ssid"
            boolean r14 = r13.contains(r14)
            if (r14 == 0) goto L_0x0214
            r14 = 27
            if (r11 < r14) goto L_0x0214
            boolean r11 = com.arlosoft.macrodroid.utils.C6407n0.m24663a(r22)
            if (r11 != 0) goto L_0x0214
            java.lang.String r11 = "Could not get SSID, location services must be enabled on Android 8.1+"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r11)
        L_0x0214:
            java.lang.String r11 = "\""
            boolean r11 = r13.startsWith(r11)
            if (r11 == 0) goto L_0x022d
            java.lang.String r11 = "\""
            boolean r11 = r13.endsWith(r11)
            if (r11 == 0) goto L_0x022d
            int r11 = r13.length()
            int r11 = r11 - r10
            java.lang.String r13 = r13.substring(r10, r11)
        L_0x022d:
            java.lang.String r0 = m15770y0(r4, r0, r13, r2)
            goto L_0x023d
        L_0x0232:
            r11 = 2131954420(0x7f130af4, float:1.9545339E38)
            java.lang.String r11 = r1.getString(r11)
            java.lang.String r0 = m15770y0(r4, r0, r11, r2)
        L_0x023d:
            r4 = r0
            goto L_0x024a
        L_0x023f:
            r11 = 2131954420(0x7f130af4, float:1.9545339E38)
            java.lang.String r11 = r1.getString(r11)
            java.lang.String r4 = m15770y0(r4, r0, r11, r2)
        L_0x024a:
            java.lang.String r0 = "[wifi_strength]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0270
            android.content.Context r0 = r22.getApplicationContext()
            java.lang.String r11 = "wifi"
            java.lang.Object r0 = r0.getSystemService(r11)
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()
            int r0 = r0.getRssi()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r11 = "[wifi_strength]"
            java.lang.String r4 = m15770y0(r4, r11, r0, r2)
        L_0x0270:
            java.lang.String r0 = "[cell_signal_strength]"
            boolean r0 = m15765w(r4, r0)
            java.lang.String r11 = "phone"
            if (r0 == 0) goto L_0x02a4
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r12)
            if (r0 == 0) goto L_0x028c
            r0 = 2131952614(0x7f1303e6, float:1.9541676E38)
            java.lang.String r0 = m15722a0(r0)
            r13 = 0
            p112j2.C7439d0.m30909o0(r1, r12, r0, r10, r13)
            goto L_0x02a4
        L_0x028c:
            android.content.Context r0 = r22.getApplicationContext()
            java.lang.Object r0 = r0.getSystemService(r11)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r0 = com.arlosoft.macrodroid.celltowers.C3943v.m15318b(r22)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r13 = "[cell_signal_strength]"
            java.lang.String r4 = m15770y0(r4, r13, r0, r2)
        L_0x02a4:
            java.lang.String r0 = "[dayofweek]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x02c2
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r13 = "EEEE"
            r0.<init>(r13)
            java.util.Date r13 = new java.util.Date
            r13.<init>()
            java.lang.String r0 = r0.format(r13)
            java.lang.String r13 = "[dayofweek]"
            java.lang.String r4 = m15770y0(r4, r13, r0, r2)
        L_0x02c2:
            java.lang.String r0 = "[dayofmonth]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x02e8
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r13 = 5
            int r0 = r0.get(r13)
            java.lang.Object[] r13 = new java.lang.Object[r10]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14 = 0
            r13[r14] = r0
            java.lang.String r0 = "%02d"
            java.lang.String r0 = java.lang.String.format(r0, r13)
            java.lang.String r13 = "[dayofmonth]"
            java.lang.String r4 = m15770y0(r4, r13, r0, r2)
        L_0x02e8:
            java.lang.String r0 = "[week_of_year]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0304
            oe.e r0 = p352oe.C15861e.m95542r0()
            se.h r13 = p392se.C16542c.f67319c
            int r0 = r0.mo75647q(r13)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r13 = "[week_of_year]"
            java.lang.String r4 = m15770y0(r4, r13, r0, r2)
        L_0x0304:
            java.lang.String r0 = "[month]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0325
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.text.SimpleDateFormat r13 = new java.text.SimpleDateFormat
            java.lang.String r14 = "MMMM"
            r13.<init>(r14)
            java.util.Date r0 = r0.getTime()
            java.lang.String r0 = r13.format(r0)
            java.lang.String r13 = "[month]"
            java.lang.String r4 = m15770y0(r4, r13, r0, r2)
        L_0x0325:
            java.lang.String r0 = "[month_digit]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0346
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.text.SimpleDateFormat r13 = new java.text.SimpleDateFormat
            java.lang.String r14 = "MM"
            r13.<init>(r14)
            java.util.Date r0 = r0.getTime()
            java.lang.String r0 = r13.format(r0)
            java.lang.String r13 = "[month_digit]"
            java.lang.String r4 = m15770y0(r4, r13, r0, r2)
        L_0x0346:
            java.lang.String r0 = "[year]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0360
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            int r0 = r0.get(r10)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r13 = "[year]"
            java.lang.String r4 = m15770y0(r4, r13, r0, r2)
        L_0x0360:
            java.lang.String r0 = "[hour]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0392
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r13 = 11
            int r0 = r0.get(r13)
            java.lang.String r13 = "0"
            java.text.DecimalFormat r13 = m15714T(r13)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r3)
            long r7 = (long) r0
            java.lang.String r0 = r13.format(r7)
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            java.lang.String r7 = "[hour]"
            java.lang.String r4 = m15770y0(r4, r7, r0, r2)
        L_0x0392:
            java.lang.String r0 = "[hour_0]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x03c4
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r7 = 11
            int r0 = r0.get(r7)
            java.lang.String r7 = "00"
            java.text.DecimalFormat r7 = m15714T(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            long r13 = (long) r0
            java.lang.String r0 = r7.format(r13)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            java.lang.String r7 = "[hour_0]"
            java.lang.String r4 = m15770y0(r4, r7, r0, r2)
        L_0x03c4:
            java.lang.String r0 = "[hour12]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x03ef
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r7 = 10
            int r0 = r0.get(r7)
            if (r0 != 0) goto L_0x03da
            r0 = 12
        L_0x03da:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            java.lang.String r7 = "[hour12]"
            java.lang.String r4 = m15770y0(r4, r7, r0, r2)
        L_0x03ef:
            java.lang.String r0 = "[minute]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0421
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r7 = 12
            int r0 = r0.get(r7)
            java.lang.String r7 = "00"
            java.text.DecimalFormat r7 = m15714T(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            long r13 = (long) r0
            java.lang.String r0 = r7.format(r13)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            java.lang.String r7 = "[minute]"
            java.lang.String r4 = m15770y0(r4, r7, r0, r2)
        L_0x0421:
            java.lang.String r0 = "[second]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0456
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r7 = 13
            int r0 = r0.get(r7)
            java.lang.String r7 = "00"
            java.text.DecimalFormat r7 = m15714T(r7)
            long r13 = (long) r0
            r7.format(r13)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r7 = r7.format(r13)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r7 = "[second]"
            java.lang.String r4 = m15770y0(r4, r7, r0, r2)
        L_0x0456:
            java.lang.String r0 = "[am_pm]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x047d
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r7 = 11
            int r0 = r0.get(r7)
            r7 = 12
            if (r0 >= r7) goto L_0x0470
            r0 = 2131952513(0x7f130381, float:1.954147E38)
            goto L_0x0473
        L_0x0470:
            r0 = 2131952414(0x7f13031e, float:1.954127E38)
        L_0x0473:
            java.lang.String r0 = m15722a0(r0)
            java.lang.String r7 = "[am_pm]"
            java.lang.String r4 = m15770y0(r4, r7, r0, r2)
        L_0x047d:
            java.lang.String r0 = "[system_time]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0496
            long r7 = java.lang.System.currentTimeMillis()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r13
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r7 = "[system_time]"
            java.lang.String r4 = m15770y0(r4, r7, r0, r2)
        L_0x0496:
            java.lang.String r0 = "[cell_connection_type]"
            boolean r0 = m15765w(r4, r0)
            java.lang.String r7 = "android.permission.READ_PHONE_STATE"
            if (r0 == 0) goto L_0x04c5
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r7)
            if (r0 == 0) goto L_0x04b2
            r0 = 2131952608(0x7f1303e0, float:1.9541664E38)
            java.lang.String r0 = m15722a0(r0)
            r8 = 0
            p112j2.C7439d0.m30909o0(r1, r7, r0, r10, r8)
            goto L_0x04c5
        L_0x04b2:
            java.lang.Object r0 = r1.getSystemService(r11)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            r0.getDataNetworkType()
            java.lang.String r0 = com.arlosoft.macrodroid.utils.C6439u0.m24742a(r22)
            java.lang.String r8 = "[cell_connection_type]"
            java.lang.String r4 = m15770y0(r4, r8, r0, r2)
        L_0x04c5:
            java.lang.String r0 = "[mcc]"
            boolean r0 = m15765w(r4, r0)
            r8 = 3
            java.lang.String r13 = "android.permission.ACCESS_COARSE_LOCATION"
            if (r0 != 0) goto L_0x04d8
            java.lang.String r0 = "[mnc]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x04e8
        L_0x04d8:
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r13)
            if (r0 == 0) goto L_0x04ec
            java.lang.String r0 = "Could not access magic text for MCC/MNC, location permission is required."
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            r14 = 0
            r15 = 0
            p112j2.C7439d0.m30909o0(r1, r13, r14, r10, r15)
        L_0x04e8:
            r8 = 0
            r14 = 0
            goto L_0x056c
        L_0x04ec:
            java.lang.Object r0 = r1.getSystemService(r11)     // Catch:{ Exception -> 0x0562 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0562 }
            android.telephony.CellLocation r14 = r0.getCellLocation()     // Catch:{ Exception -> 0x0562 }
            boolean r14 = r14 instanceof android.telephony.gsm.GsmCellLocation     // Catch:{ Exception -> 0x0562 }
            if (r14 == 0) goto L_0x054f
            java.lang.String r0 = r0.getNetworkOperator()     // Catch:{ Exception -> 0x0562 }
            if (r0 == 0) goto L_0x0518
            int r14 = r0.length()     // Catch:{ Exception -> 0x0562 }
            if (r14 <= r8) goto L_0x0518
            r14 = 0
            java.lang.String r15 = r0.substring(r14, r8)     // Catch:{ Exception -> 0x0562 }
            int r14 = java.lang.Integer.parseInt(r15)     // Catch:{ Exception -> 0x0562 }
            java.lang.String r0 = r0.substring(r8)     // Catch:{ Exception -> 0x0562 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0562 }
            goto L_0x051a
        L_0x0518:
            r0 = 0
            r14 = 0
        L_0x051a:
            java.lang.String r15 = "[mcc]"
            if (r14 == 0) goto L_0x052e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0562 }
            r8.<init>()     // Catch:{ Exception -> 0x0562 }
            r8.append(r3)     // Catch:{ Exception -> 0x0562 }
            r8.append(r14)     // Catch:{ Exception -> 0x0562 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0562 }
            goto L_0x0530
        L_0x052e:
            java.lang.String r8 = "MCC UNKNOWN"
        L_0x0530:
            java.lang.String r4 = m15770y0(r4, r15, r8, r2)     // Catch:{ Exception -> 0x0562 }
            java.lang.String r8 = "[mnc]"
            if (r0 == 0) goto L_0x0548
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0562 }
            r14.<init>()     // Catch:{ Exception -> 0x0562 }
            r14.append(r3)     // Catch:{ Exception -> 0x0562 }
            r14.append(r0)     // Catch:{ Exception -> 0x0562 }
            java.lang.String r0 = r14.toString()     // Catch:{ Exception -> 0x0562 }
            goto L_0x054a
        L_0x0548:
            java.lang.String r0 = "MNC UNKNOWN"
        L_0x054a:
            java.lang.String r0 = m15770y0(r4, r8, r0, r2)     // Catch:{ Exception -> 0x0562 }
            goto L_0x055f
        L_0x054f:
            java.lang.String r0 = "[mcc]"
            java.lang.String r8 = "MCC UNKNOWN"
            java.lang.String r0 = m15770y0(r4, r0, r8, r2)     // Catch:{ Exception -> 0x0562 }
            java.lang.String r4 = "[mnc]"
            java.lang.String r8 = "MNC UNKNOWN"
            java.lang.String r0 = m15770y0(r0, r4, r8, r2)     // Catch:{ Exception -> 0x0561 }
        L_0x055f:
            r4 = r0
            goto L_0x04e8
        L_0x0561:
            r4 = r0
        L_0x0562:
            java.lang.String r0 = "Could not access magic text for MCC/MNC, location permission is required."
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            r8 = 0
            r14 = 0
            p112j2.C7439d0.m30909o0(r1, r12, r8, r10, r14)
        L_0x056c:
            java.lang.String r0 = "[lac]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x05d2
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r13)
            if (r0 == 0) goto L_0x057e
            p112j2.C7439d0.m30909o0(r1, r13, r8, r10, r14)
            goto L_0x05d2
        L_0x057e:
            java.lang.Object r0 = r1.getSystemService(r11)     // Catch:{ SecurityException -> 0x05b4 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ SecurityException -> 0x05b4 }
            android.telephony.CellLocation r0 = r0.getCellLocation()     // Catch:{ SecurityException -> 0x05b4 }
            boolean r8 = r0 instanceof android.telephony.gsm.GsmCellLocation     // Catch:{ SecurityException -> 0x05b4 }
            if (r8 == 0) goto L_0x05a8
            android.telephony.gsm.GsmCellLocation r0 = (android.telephony.gsm.GsmCellLocation) r0     // Catch:{ SecurityException -> 0x05b4 }
            java.lang.String r8 = "[lac]"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x05b4 }
            r14.<init>()     // Catch:{ SecurityException -> 0x05b4 }
            r14.append(r3)     // Catch:{ SecurityException -> 0x05b4 }
            int r0 = r0.getLac()     // Catch:{ SecurityException -> 0x05b4 }
            r14.append(r0)     // Catch:{ SecurityException -> 0x05b4 }
            java.lang.String r0 = r14.toString()     // Catch:{ SecurityException -> 0x05b4 }
            java.lang.String r0 = m15770y0(r4, r8, r0, r2)     // Catch:{ SecurityException -> 0x05b4 }
            goto L_0x05b0
        L_0x05a8:
            java.lang.String r0 = "[lac]"
            java.lang.String r8 = "LAC UNKNOWN"
            java.lang.String r0 = m15770y0(r4, r0, r8, r2)     // Catch:{ SecurityException -> 0x05b4 }
        L_0x05b0:
            r4 = r0
            r8 = 0
            r14 = 0
            goto L_0x05d2
        L_0x05b4:
            r0 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r14 = "Could not access magic text for LAC: "
            r8.append(r14)
            java.lang.String r0 = r0.getMessage()
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            r8 = 0
            r14 = 0
            p112j2.C7439d0.m30909o0(r1, r12, r8, r10, r14)
        L_0x05d2:
            java.lang.String r0 = "[cell_id]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0609
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r13)
            if (r0 == 0) goto L_0x05e4
            p112j2.C7439d0.m30909o0(r1, r13, r8, r10, r14)
            goto L_0x0609
        L_0x05e4:
            java.util.List r0 = com.arlosoft.macrodroid.celltowers.C3943v.m15317a(r22)
            int r8 = r0.size()
            if (r8 != 0) goto L_0x05f7
            java.lang.String r0 = "[cell_id]"
            java.lang.String r8 = "No CID"
            java.lang.String r4 = m15770y0(r4, r0, r8, r2)
            goto L_0x0609
        L_0x05f7:
            java.lang.Object r0 = r0.get(r14)
            com.arlosoft.macrodroid.celltowers.v$a r0 = (com.arlosoft.macrodroid.celltowers.C3943v.C3944a) r0
            long r14 = r0.f10256a
            java.lang.String r0 = java.lang.String.valueOf(r14)
            java.lang.String r8 = "[cell_id]"
            java.lang.String r4 = m15770y0(r4, r8, r0, r2)
        L_0x0609:
            java.lang.String r0 = "[imei]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0644
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r7)
            if (r0 == 0) goto L_0x061e
            java.lang.String r0 = "IMEI"
            r8 = 0
            p112j2.C7439d0.m30909o0(r1, r7, r0, r10, r8)
            goto L_0x0644
        L_0x061e:
            java.lang.Object r0 = r1.getSystemService(r11)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x063f }
            r14 = 26
            if (r8 < r14) goto L_0x062f
            java.lang.String r0 = r0.getImei()     // Catch:{ Exception -> 0x063f }
            goto L_0x0633
        L_0x062f:
            java.lang.String r0 = r0.getDeviceId()     // Catch:{ Exception -> 0x063f }
        L_0x0633:
            java.lang.String r8 = "[imei]"
            if (r0 == 0) goto L_0x0638
            goto L_0x063a
        L_0x0638:
            java.lang.String r0 = "IMEI unavailable"
        L_0x063a:
            java.lang.String r4 = m15770y0(r4, r8, r0, r2)     // Catch:{ Exception -> 0x063f }
            goto L_0x0644
        L_0x063f:
            java.lang.String r0 = "IMEI can no longer be read on Android 10+"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
        L_0x0644:
            java.lang.String r0 = "[meid]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x067f
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r7)
            if (r0 == 0) goto L_0x0659
            java.lang.String r0 = "MEID"
            r8 = 0
            p112j2.C7439d0.m30909o0(r1, r7, r0, r10, r8)
            goto L_0x067f
        L_0x0659:
            java.lang.Object r0 = r1.getSystemService(r11)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x067a }
            r14 = 26
            if (r8 < r14) goto L_0x066a
            java.lang.String r0 = r0.getMeid()     // Catch:{ Exception -> 0x067a }
            goto L_0x066e
        L_0x066a:
            java.lang.String r0 = r0.getDeviceId()     // Catch:{ Exception -> 0x067a }
        L_0x066e:
            java.lang.String r8 = "[meid]"
            if (r0 == 0) goto L_0x0673
            goto L_0x0675
        L_0x0673:
            java.lang.String r0 = "MEID unavailable"
        L_0x0675:
            java.lang.String r4 = m15770y0(r4, r8, r0, r2)     // Catch:{ Exception -> 0x067a }
            goto L_0x067f
        L_0x067a:
            java.lang.String r0 = "MEID can no longer be read on Android 10+"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
        L_0x067f:
            java.lang.String r0 = "[peb_battery]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x06a0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            int r8 = com.arlosoft.macrodroid.triggers.receivers.PebbleBatteryUpdateReceiver.m24039b()
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = "[peb_battery]"
            java.lang.String r4 = m15770y0(r4, r8, r0, r2)
        L_0x06a0:
            java.lang.String r0 = "[last_loc_latlong]"
            boolean r0 = m15765w(r4, r0)
            java.lang.String r8 = ","
            if (r0 != 0) goto L_0x06ea
            java.lang.String r0 = "[last_loc_link]"
            boolean r0 = m15765w(r4, r0)
            if (r0 != 0) goto L_0x06ea
            java.lang.String r0 = "[last_loc_accuracy]"
            boolean r0 = m15765w(r4, r0)
            if (r0 != 0) goto L_0x06ea
            java.lang.String r0 = "[last_loc_age_timestamp]"
            boolean r0 = m15765w(r4, r0)
            if (r0 != 0) goto L_0x06ea
            java.lang.String r0 = "[last_loc_lat]"
            boolean r0 = m15765w(r4, r0)
            if (r0 != 0) goto L_0x06ea
            java.lang.String r0 = "[last_loc_long]"
            boolean r0 = m15765w(r4, r0)
            if (r0 != 0) goto L_0x06ea
            java.lang.String r0 = "[last_loc_alt]"
            boolean r0 = m15765w(r4, r0)
            if (r0 != 0) goto L_0x06ea
            java.lang.String r0 = "[last_loc_speed_kmh]"
            boolean r0 = m15765w(r4, r0)
            if (r0 != 0) goto L_0x06ea
            java.lang.String r0 = "[last_loc_speed_mph]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0890
        L_0x06ea:
            java.lang.String r0 = "location"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.location.LocationManager r0 = (android.location.LocationManager) r0
            int r14 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r12)
            if (r14 == 0) goto L_0x070a
            int r13 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r13)
            if (r13 == 0) goto L_0x070a
            r0 = 2131954028(0x7f13096c, float:1.9544544E38)
            java.lang.String r0 = m15722a0(r0)
            r13 = 0
            p112j2.C7439d0.m30909o0(r1, r12, r0, r10, r13)
            goto L_0x0737
        L_0x070a:
            java.util.List r12 = r0.getProviders(r10)
            if (r12 == 0) goto L_0x0737
            java.util.Iterator r12 = r12.iterator()
            r13 = 0
        L_0x0715:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x0738
            java.lang.Object r14 = r12.next()
            java.lang.String r14 = (java.lang.String) r14
            android.location.Location r14 = r0.getLastKnownLocation(r14)
            if (r14 == 0) goto L_0x0715
            if (r13 == 0) goto L_0x0735
            long r18 = r14.getTime()
            long r20 = r13.getTime()
            int r15 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r15 <= 0) goto L_0x0715
        L_0x0735:
            r13 = r14
            goto L_0x0715
        L_0x0737:
            r13 = 0
        L_0x0738:
            if (r13 == 0) goto L_0x0833
            java.text.DecimalFormatSymbols r0 = new java.text.DecimalFormatSymbols
            java.util.Locale r12 = java.util.Locale.US
            r0.<init>(r12)
            r12 = 46
            r0.setDecimalSeparator(r12)
            java.text.DecimalFormat r12 = new java.text.DecimalFormat
            java.lang.String r14 = "#.#######"
            r12.<init>(r14, r0)
            java.text.DecimalFormat r14 = new java.text.DecimalFormat
            java.lang.String r15 = "#.#"
            r14.<init>(r15, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            double r9 = r13.getLatitude()
            java.lang.String r9 = r12.format(r9)
            r0.append(r9)
            r0.append(r8)
            double r9 = r13.getLongitude()
            java.lang.String r9 = r12.format(r9)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r9 = "[last_loc_latlong]"
            java.lang.String r0 = m15770y0(r4, r9, r0, r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "http://maps.google.com/maps?q="
            r4.append(r9)
            double r9 = r13.getLatitude()
            r4.append(r9)
            r4.append(r8)
            double r9 = r13.getLongitude()
            r4.append(r9)
            java.lang.String r9 = "&center="
            r4.append(r9)
            double r9 = r13.getLatitude()
            java.lang.String r9 = r12.format(r9)
            r4.append(r9)
            r4.append(r8)
            double r9 = r13.getLongitude()
            java.lang.String r9 = r12.format(r9)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = "[last_loc_link]"
            java.lang.String r0 = m15770y0(r0, r9, r4, r2)
            long r9 = r13.getTime()
            java.lang.String r4 = m15713S(r9)
            java.lang.String r9 = "[last_loc_age_timestamp]"
            java.lang.String r0 = m15770y0(r0, r9, r4, r2)
            double r9 = r13.getLatitude()
            java.lang.String r4 = r12.format(r9)
            java.lang.String r9 = "[last_loc_lat]"
            java.lang.String r0 = m15770y0(r0, r9, r4, r2)
            double r9 = r13.getLongitude()
            java.lang.String r4 = r12.format(r9)
            java.lang.String r9 = "[last_loc_long]"
            java.lang.String r0 = m15770y0(r0, r9, r4, r2)
            double r9 = r13.getAltitude()
            java.lang.String r4 = r14.format(r9)
            java.lang.String r9 = "[last_loc_alt]"
            java.lang.String r0 = m15770y0(r0, r9, r4, r2)
            float r4 = r13.getAccuracy()
            double r9 = (double) r4
            java.lang.String r4 = r12.format(r9)
            java.lang.String r9 = "[last_loc_accuracy]"
            java.lang.String r0 = m15770y0(r0, r9, r4, r2)
            float r4 = r13.getSpeed()
            double r9 = (double) r4
            r18 = 4615288898129284301(0x400ccccccccccccd, double:3.6)
            double r9 = r9 * r18
            java.lang.String r4 = r14.format(r9)
            java.lang.String r9 = "[last_loc_speed_kmh]"
            java.lang.String r0 = m15770y0(r0, r9, r4, r2)
            float r4 = r13.getSpeed()
            double r9 = (double) r4
            r12 = 4612219559875242487(0x4001e540cc78e9f7, double:2.23694)
            double r9 = r9 * r12
            java.lang.String r4 = r14.format(r9)
            java.lang.String r9 = "[last_loc_speed_mph]"
            java.lang.String r4 = m15770y0(r0, r9, r4, r2)
            goto L_0x0890
        L_0x0833:
            r0 = 2131954092(0x7f1309ac, float:1.9544673E38)
            java.lang.String r9 = r1.getString(r0)
            java.lang.String r10 = "[last_loc_latlong]"
            java.lang.String r4 = m15770y0(r4, r10, r9, r2)
            java.lang.String r9 = r1.getString(r0)
            java.lang.String r10 = "[last_loc_link]"
            java.lang.String r4 = m15770y0(r4, r10, r9, r2)
            java.lang.String r9 = r1.getString(r0)
            java.lang.String r10 = "[last_loc_age_timestamp]"
            java.lang.String r4 = m15770y0(r4, r10, r9, r2)
            java.lang.String r9 = r1.getString(r0)
            java.lang.String r10 = "[last_loc_lat]"
            java.lang.String r4 = m15770y0(r4, r10, r9, r2)
            java.lang.String r9 = r1.getString(r0)
            java.lang.String r10 = "[last_loc_long]"
            java.lang.String r4 = m15770y0(r4, r10, r9, r2)
            java.lang.String r9 = r1.getString(r0)
            java.lang.String r10 = "[last_loc_alt]"
            java.lang.String r4 = m15770y0(r4, r10, r9, r2)
            java.lang.String r9 = r1.getString(r0)
            java.lang.String r10 = "[last_loc_accuracy]"
            java.lang.String r4 = m15770y0(r4, r10, r9, r2)
            java.lang.String r9 = r1.getString(r0)
            java.lang.String r10 = "[last_loc_speed_kmh]"
            java.lang.String r4 = m15770y0(r4, r10, r9, r2)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r9 = "[last_loc_speed_mph]"
            java.lang.String r4 = m15770y0(r4, r9, r0, r2)
        L_0x0890:
            java.lang.String r0 = "[macrodroid_version]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x08a1
            java.lang.String r0 = "[macrodroid_version]"
            java.lang.String r9 = "5.29.12"
            r10 = 0
            java.lang.String r4 = m15770y0(r4, r0, r9, r10)
        L_0x08a1:
            java.lang.String r0 = "[macrodroid_is_pro]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x08c2
            com.arlosoft.macrodroid.app.MacroDroidApplication r0 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            com.arlosoft.macrodroid.confirmation.b r0 = r0.f9902p
            com.arlosoft.macrodroid.confirmation.a r0 = r0.mo28009e()
            boolean r0 = r0.mo28008a()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r9 = "[macrodroid_is_pro]"
            r10 = 0
            java.lang.String r4 = m15770y0(r4, r9, r0, r10)
        L_0x08c2:
            java.lang.String r0 = "[current_brightness]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0900
            android.content.ContentResolver r0 = r22.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x08fc }
            java.lang.String r9 = "screen_brightness"
            int r0 = android.provider.Settings.System.getInt(r0, r9)     // Catch:{ SettingNotFoundException -> 0x08fc }
            int r9 = com.arlosoft.macrodroid.utils.C6405m1.m24661a(r22)     // Catch:{ SettingNotFoundException -> 0x08fc }
            int r0 = r0 - r9
            float r0 = (float) r0     // Catch:{ SettingNotFoundException -> 0x08fc }
            int r9 = 255 - r9
            float r9 = (float) r9     // Catch:{ SettingNotFoundException -> 0x08fc }
            float r0 = r0 / r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r9
            int r0 = java.lang.Math.round(r0)     // Catch:{ SettingNotFoundException -> 0x08fc }
            java.lang.String r9 = "[current_brightness]"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ SettingNotFoundException -> 0x08fc }
            r10.<init>()     // Catch:{ SettingNotFoundException -> 0x08fc }
            r10.append(r3)     // Catch:{ SettingNotFoundException -> 0x08fc }
            r10.append(r0)     // Catch:{ SettingNotFoundException -> 0x08fc }
            java.lang.String r0 = r10.toString()     // Catch:{ SettingNotFoundException -> 0x08fc }
            java.lang.String r4 = m15770y0(r4, r9, r0, r2)     // Catch:{ SettingNotFoundException -> 0x08fc }
            goto L_0x0900
        L_0x08fc:
            r0 = move-exception
            p148q0.C8151a.m33873n(r0)
        L_0x0900:
            java.lang.String r0 = "[current_brightness_alternative]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0931
            android.content.ContentResolver r0 = r22.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x092d }
            java.lang.String r9 = "screen_brightness"
            int r0 = android.provider.Settings.System.getInt(r0, r9)     // Catch:{ SettingNotFoundException -> 0x092d }
            r9 = 1
            int r0 = com.arlosoft.macrodroid.utils.C6371c1.m24615b(r0, r9)     // Catch:{ SettingNotFoundException -> 0x092d }
            java.lang.String r9 = "[current_brightness_alternative]"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ SettingNotFoundException -> 0x092d }
            r10.<init>()     // Catch:{ SettingNotFoundException -> 0x092d }
            r10.append(r3)     // Catch:{ SettingNotFoundException -> 0x092d }
            r10.append(r0)     // Catch:{ SettingNotFoundException -> 0x092d }
            java.lang.String r0 = r10.toString()     // Catch:{ SettingNotFoundException -> 0x092d }
            java.lang.String r4 = m15770y0(r4, r9, r0, r2)     // Catch:{ SettingNotFoundException -> 0x092d }
            goto L_0x0931
        L_0x092d:
            r0 = move-exception
            p148q0.C8151a.m33873n(r0)
        L_0x0931:
            java.lang.String r0 = "[screen_timeout]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0950
            android.content.ContentResolver r0 = r22.getContentResolver()
            java.lang.String r9 = "screen_off_timeout"
            r10 = 0
            int r0 = android.provider.Settings.System.getInt(r0, r9, r10)
            int r0 = r0 / 1000
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r9 = "[screen_timeout]"
            java.lang.String r4 = m15770y0(r4, r9, r0, r10)
        L_0x0950:
            java.lang.String r0 = "[battery_int]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0998
            android.content.Context r0 = r22.getApplicationContext()
            android.content.IntentFilter r9 = new android.content.IntentFilter
            r9.<init>(r5)
            r5 = 0
            android.content.Intent r0 = r0.registerReceiver(r5, r9)
            java.lang.String r5 = "level"
            r9 = -1
            int r5 = r0.getIntExtra(r5, r9)
            java.lang.String r10 = "scale"
            int r0 = r0.getIntExtra(r10, r9)
            double r9 = (double) r0
            r12 = 0
            if (r5 < 0) goto L_0x0982
            int r0 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0982
            double r12 = (double) r5
            double r12 = r12 / r9
            r9 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r12 = r12 * r9
        L_0x0982:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            int r5 = (int) r12
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "[battery_int]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r2)
        L_0x0998:
            java.lang.String r0 = "[uptime_secs]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x09b1
            long r9 = android.os.SystemClock.elapsedRealtime()
            r12 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r12
            java.lang.String r0 = java.lang.String.valueOf(r9)
            java.lang.String r5 = "[uptime_secs]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r2)
        L_0x09b1:
            java.lang.String r0 = "[uptime]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x09ca
            long r9 = android.os.SystemClock.elapsedRealtime()
            r12 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r12
            java.lang.String r0 = android.text.format.DateUtils.formatElapsedTime(r9)
            java.lang.String r5 = "[uptime]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r2)
        L_0x09ca:
            java.lang.String r0 = "[vol_alarm]"
            boolean r0 = m15765w(r4, r0)
            java.lang.String r5 = "audio"
            if (r0 == 0) goto L_0x0a06
            java.lang.Object r0 = r1.getSystemService(r5)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r9 = 4
            int r9 = r0.getStreamVolume(r9)
            r10 = 4
            int r0 = r0.getStreamMaxVolume(r10)
            double r9 = (double) r9
            double r12 = (double) r0
            double r9 = r9 / r12
            r12 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r9 = r9 * r12
            double r9 = java.lang.Math.ceil(r9)
            int r0 = (int) r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            java.lang.String r9 = "[vol_alarm]"
            r10 = 0
            java.lang.String r4 = m15770y0(r4, r9, r0, r10)
        L_0x0a06:
            java.lang.String r0 = "[vol_music]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0a3f
            java.lang.Object r0 = r1.getSystemService(r5)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r9 = 3
            int r10 = r0.getStreamVolume(r9)
            int r0 = r0.getStreamMaxVolume(r9)
            double r9 = (double) r10
            double r12 = (double) r0
            double r9 = r9 / r12
            r12 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r9 = r9 * r12
            double r9 = java.lang.Math.ceil(r9)
            int r0 = (int) r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            java.lang.String r9 = "[vol_music]"
            r10 = 0
            java.lang.String r4 = m15770y0(r4, r9, r0, r10)
        L_0x0a3f:
            java.lang.String r0 = "[vol_ring]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0a79
            java.lang.Object r0 = r1.getSystemService(r5)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r9 = 2
            int r9 = r0.getStreamVolume(r9)
            r10 = 2
            int r0 = r0.getStreamMaxVolume(r10)
            double r9 = (double) r9
            double r12 = (double) r0
            double r9 = r9 / r12
            r12 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r9 = r9 * r12
            double r9 = java.lang.Math.ceil(r9)
            int r0 = (int) r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            java.lang.String r9 = "[vol_ring]"
            r10 = 0
            java.lang.String r4 = m15770y0(r4, r9, r0, r10)
        L_0x0a79:
            java.lang.String r0 = "[vol_notif]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0ab3
            java.lang.Object r0 = r1.getSystemService(r5)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r9 = 5
            int r9 = r0.getStreamVolume(r9)
            r10 = 5
            int r0 = r0.getStreamMaxVolume(r10)
            double r9 = (double) r9
            double r12 = (double) r0
            double r9 = r9 / r12
            r12 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r9 = r9 * r12
            double r9 = java.lang.Math.ceil(r9)
            int r0 = (int) r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            java.lang.String r9 = "[vol_notif]"
            r10 = 0
            java.lang.String r4 = m15770y0(r4, r9, r0, r10)
        L_0x0ab3:
            java.lang.String r0 = "[vol_system]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0aed
            java.lang.Object r0 = r1.getSystemService(r5)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r9 = 1
            int r10 = r0.getStreamVolume(r9)
            int r0 = r0.getStreamMaxVolume(r9)
            double r9 = (double) r10
            double r12 = (double) r0
            double r9 = r9 / r12
            r12 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r9 = r9 * r12
            double r9 = java.lang.Math.ceil(r9)
            int r0 = (int) r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            java.lang.String r9 = "[vol_system]"
            r10 = 0
            java.lang.String r4 = m15770y0(r4, r9, r0, r10)
            goto L_0x0aee
        L_0x0aed:
            r10 = 0
        L_0x0aee:
            java.lang.String r0 = "[vol_call]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0b26
            java.lang.Object r0 = r1.getSystemService(r5)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            int r9 = r0.getStreamVolume(r10)
            int r0 = r0.getStreamMaxVolume(r10)
            double r9 = (double) r9
            double r12 = (double) r0
            double r9 = r9 / r12
            r12 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r9 = r9 * r12
            double r9 = java.lang.Math.ceil(r9)
            int r0 = (int) r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            java.lang.String r9 = "[vol_call]"
            r10 = 0
            java.lang.String r4 = m15770y0(r4, r9, r0, r10)
        L_0x0b26:
            java.lang.String r0 = "[vol_bt_voice]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0b61
            java.lang.Object r0 = r1.getSystemService(r5)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r5 = 6
            int r5 = r0.getStreamVolume(r5)
            r9 = 6
            int r0 = r0.getStreamMaxVolume(r9)
            double r9 = (double) r5
            double r12 = (double) r0
            double r9 = r9 / r12
            r12 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r9 = r9 * r12
            double r9 = java.lang.Math.ceil(r9)
            int r0 = (int) r9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r5 = "[vol_bt_voice]"
            r9 = 0
            java.lang.String r4 = m15770y0(r4, r5, r0, r9)
            goto L_0x0b62
        L_0x0b61:
            r9 = 0
        L_0x0b62:
            java.lang.String r0 = "[macro_name]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0b76
            if (r26 == 0) goto L_0x0b76
            java.lang.String r0 = r26.getName()
            java.lang.String r5 = "[macro_name]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r9)
        L_0x0b76:
            java.lang.String r0 = "[macro_category]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0b8a
            if (r26 == 0) goto L_0x0b8a
            java.lang.String r0 = r26.getCategory()
            java.lang.String r5 = "[macro_category]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r9)
        L_0x0b8a:
            java.lang.String r0 = "[device_serial]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0bbf
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r0 >= r5) goto L_0x0ba2
            java.lang.String r0 = android.os.Build.SERIAL
            java.lang.String r5 = "[device_serial]"
            r9 = 0
            java.lang.String r4 = m15770y0(r4, r5, r0, r9)
            goto L_0x0bbf
        L_0x0ba2:
            r9 = 0
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r7)
            if (r0 == 0) goto L_0x0baf
            r5 = 0
            r10 = 1
            p112j2.C7439d0.m30909o0(r1, r7, r5, r10, r9)
            goto L_0x0bbf
        L_0x0baf:
            java.lang.String r0 = "[device_serial]"
            java.lang.String r5 = android.os.Build.getSerial()     // Catch:{ Exception -> 0x0bba }
            java.lang.String r4 = m15770y0(r4, r0, r5, r9)     // Catch:{ Exception -> 0x0bba }
            goto L_0x0bbf
        L_0x0bba:
            java.lang.String r0 = "Device serial can no longer be read on Android 10+"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
        L_0x0bbf:
            java.lang.String r0 = "[device_name]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0bd9
            android.content.ContentResolver r0 = r22.getContentResolver()
            java.lang.String r5 = "device_name"
            java.lang.String r0 = android.provider.Settings.Global.getString(r0, r5)
            java.lang.String r5 = "[device_name]"
            r7 = 0
            java.lang.String r4 = m15770y0(r4, r5, r0, r7)
            goto L_0x0bda
        L_0x0bd9:
            r7 = 0
        L_0x0bda:
            java.lang.String r0 = "[device_manufacturer]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0bea
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r5 = "[device_manufacturer]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r7)
        L_0x0bea:
            java.lang.String r0 = "[device_model]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0bfa
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r5 = "[device_model]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r7)
        L_0x0bfa:
            java.lang.String r0 = "[android_version]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0c0a
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            java.lang.String r5 = "[android_version]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r7)
        L_0x0c0a:
            java.lang.String r0 = "[android_version_sdk]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0c1e
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r5 = "[android_version_sdk]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r7)
        L_0x0c1e:
            java.lang.String r0 = "[sim_operator_name]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0c36
            java.lang.Object r0 = r1.getSystemService(r11)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r0 = r0.getNetworkOperatorName()
            java.lang.String r5 = "[sim_operator_name]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r7)
        L_0x0c36:
            java.lang.String r0 = "[screen_res]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0c60
            android.graphics.Point r0 = m15719Y(r22)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r7 = r0.x
            r5.append(r7)
            r5.append(r8)
            int r0 = r0.y
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r5 = "[screen_res]"
            r7 = 0
            java.lang.String r4 = m15770y0(r4, r5, r0, r7)
            goto L_0x0c61
        L_0x0c60:
            r7 = 0
        L_0x0c61:
            java.lang.String r0 = "[screen_res_x]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0c79
            android.graphics.Point r0 = m15719Y(r22)
            int r0 = r0.x
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r5 = "[screen_res_x]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r7)
        L_0x0c79:
            java.lang.String r0 = "[screen_res_y]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0c91
            android.graphics.Point r0 = m15719Y(r22)
            int r0 = r0.y
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r5 = "[screen_res_y]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r7)
        L_0x0c91:
            java.lang.String r0 = "[ram_total]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0ca4
            r5 = 1
            java.lang.String r0 = m15718X(r1, r5)
            java.lang.String r5 = "[ram_total]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r7)
        L_0x0ca4:
            java.lang.String r0 = "[ram_available]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0cb6
            java.lang.String r0 = m15718X(r1, r7)
            java.lang.String r5 = "[ram_available]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r7)
        L_0x0cb6:
            java.lang.String r0 = "[storage_external_total]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0cc8
            java.lang.String r0 = m15724b0(r22)
            java.lang.String r5 = "[storage_external_total]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r7)
        L_0x0cc8:
            java.lang.String r0 = "[storage_external_free]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0cda
            java.lang.String r0 = m15711Q(r22)
            java.lang.String r5 = "[storage_external_free]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r7)
        L_0x0cda:
            java.lang.String r0 = "[storage_internal_total]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0cec
            java.lang.String r0 = m15726c0()
            java.lang.String r5 = "[storage_internal_total]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r7)
        L_0x0cec:
            java.lang.String r0 = "[storage_internal_free]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0cfe
            java.lang.String r0 = m15712R()
            java.lang.String r5 = "[storage_internal_free]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r7)
        L_0x0cfe:
            java.lang.String r0 = "[webhook_url]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0d36
            java.lang.String r0 = com.arlosoft.macrodroid.settings.C5163j2.m20217n2(r1, r7)
            if (r0 == 0) goto L_0x0d29
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "https://trigger.macrodroid.com/"
            r5.append(r8)
            r5.append(r0)
            java.lang.String r0 = "/"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r5 = "[webhook_url]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r7)
            goto L_0x0d36
        L_0x0d29:
            r0 = 2131954211(0x7f130a23, float:1.9544915E38)
            java.lang.String r0 = m15722a0(r0)
            java.lang.String r5 = "[webhook_url]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r7)
        L_0x0d36:
            java.lang.String r0 = "[fg_app_name]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0d6d
            java.lang.String r0 = com.arlosoft.macrodroid.triggers.services.MacroDroidAccessibilityService.f14497c
            if (r0 == 0) goto L_0x0d60
            android.content.pm.PackageManager r0 = r22.getPackageManager()
            java.lang.String r5 = com.arlosoft.macrodroid.triggers.services.MacroDroidAccessibilityService.f14497c     // Catch:{ Exception -> 0x0d56 }
            r7 = 0
            android.content.pm.ApplicationInfo r5 = r0.getApplicationInfo(r5, r7)     // Catch:{ Exception -> 0x0d56 }
            java.lang.CharSequence r0 = r0.getApplicationLabel(r5)     // Catch:{ Exception -> 0x0d56 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0d56 }
            goto L_0x0d58
        L_0x0d56:
            java.lang.String r0 = com.arlosoft.macrodroid.triggers.services.MacroDroidAccessibilityService.f14497c
        L_0x0d58:
            java.lang.String r5 = "[fg_app_name]"
            r7 = 0
            java.lang.String r4 = m15770y0(r4, r5, r0, r7)
            goto L_0x0d6e
        L_0x0d60:
            r7 = 0
            java.lang.String r0 = "Accesibility service must be enabled to access the foreground app package"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            java.lang.String r0 = "[fg_app_name]"
            java.lang.String r4 = m15770y0(r4, r0, r6, r7)
            goto L_0x0d6e
        L_0x0d6d:
            r7 = 0
        L_0x0d6e:
            java.lang.String r0 = "[fg_app_package]"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0d8c
            java.lang.String r0 = com.arlosoft.macrodroid.triggers.services.MacroDroidAccessibilityService.f14497c
            if (r0 == 0) goto L_0x0d81
            java.lang.String r5 = "[fg_app_package]"
            java.lang.String r4 = m15770y0(r4, r5, r0, r7)
            goto L_0x0d8c
        L_0x0d81:
            java.lang.String r0 = "Accesibility service must be enabled to access the foreground app package"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            java.lang.String r0 = "[fg_app_package]"
            java.lang.String r4 = m15770y0(r4, r0, r6, r7)
        L_0x0d8c:
            java.lang.String r0 = "[setting_"
            boolean r0 = m15765w(r4, r0)
            if (r0 == 0) goto L_0x0e93
            java.lang.String r0 = "[setting_system="
            int r0 = r4.indexOf(r0)     // Catch:{ Exception -> 0x0e93 }
            if (r0 >= 0) goto L_0x0dab
            java.lang.String r0 = "{setting_system="
            int r0 = r4.indexOf(r0)     // Catch:{ Exception -> 0x0e93 }
            java.lang.String r5 = "}"
            int r6 = r0 + 1
            int r5 = r4.indexOf(r5, r6)     // Catch:{ Exception -> 0x0e93 }
            goto L_0x0db3
        L_0x0dab:
            java.lang.String r5 = "]"
            int r6 = r0 + 1
            int r5 = r4.indexOf(r5, r6)     // Catch:{ Exception -> 0x0e93 }
        L_0x0db3:
            if (r0 < 0) goto L_0x0df5
            int r6 = r0 + 16
            java.lang.String r6 = r4.substring(r6, r5)     // Catch:{ Exception -> 0x0e93 }
            java.lang.String r7 = "[setting_system="
            int r0 = r0 + 1
            int r0 = r4.indexOf(r7, r0)     // Catch:{ Exception -> 0x0e93 }
            if (r0 >= 0) goto L_0x0dcd
            java.lang.String r7 = "{setting_system="
            int r0 = r0 + 1
            int r0 = r4.indexOf(r7, r0)     // Catch:{ Exception -> 0x0e93 }
        L_0x0dcd:
            android.content.ContentResolver r7 = r22.getContentResolver()     // Catch:{ Exception -> 0x0e93 }
            java.lang.String r7 = android.provider.Settings.System.getString(r7, r6)     // Catch:{ Exception -> 0x0e93 }
            if (r7 != 0) goto L_0x0dd8
            r7 = r3
        L_0x0dd8:
            java.lang.String r8 = "[setting_system=%s]"
            java.lang.String r9 = "%s"
            java.lang.String r6 = r8.replace(r9, r6)     // Catch:{ Exception -> 0x0e93 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0e93 }
            r8.<init>()     // Catch:{ Exception -> 0x0e93 }
            r8.append(r7)     // Catch:{ Exception -> 0x0e93 }
            r8.append(r3)     // Catch:{ Exception -> 0x0e93 }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x0e93 }
            r8 = 0
            java.lang.String r4 = m15770y0(r4, r6, r7, r8)     // Catch:{ Exception -> 0x0e93 }
            goto L_0x0db3
        L_0x0df5:
            java.lang.String r0 = "[setting_global="
            int r0 = r4.indexOf(r0)     // Catch:{ Exception -> 0x0e93 }
            if (r0 >= 0) goto L_0x0e0c
            java.lang.String r0 = "{setting_global="
            int r0 = r4.indexOf(r0)     // Catch:{ Exception -> 0x0e93 }
            java.lang.String r3 = "}"
            int r5 = r0 + 1
            int r3 = r4.indexOf(r3, r5)     // Catch:{ Exception -> 0x0e93 }
            goto L_0x0e14
        L_0x0e0c:
            java.lang.String r3 = "]"
            int r5 = r0 + 1
            int r3 = r4.indexOf(r3, r5)     // Catch:{ Exception -> 0x0e93 }
        L_0x0e14:
            if (r0 < 0) goto L_0x0e44
            int r5 = r0 + 16
            java.lang.String r5 = r4.substring(r5, r3)     // Catch:{ Exception -> 0x0e93 }
            java.lang.String r6 = "[setting_global="
            int r0 = r0 + 1
            int r0 = r4.indexOf(r6, r0)     // Catch:{ Exception -> 0x0e93 }
            if (r0 >= 0) goto L_0x0e2e
            java.lang.String r6 = "{setting_global="
            int r0 = r0 + 1
            int r0 = r4.indexOf(r6, r0)     // Catch:{ Exception -> 0x0e93 }
        L_0x0e2e:
            android.content.ContentResolver r6 = r22.getContentResolver()     // Catch:{ Exception -> 0x0e93 }
            java.lang.String r6 = android.provider.Settings.Global.getString(r6, r5)     // Catch:{ Exception -> 0x0e93 }
            java.lang.String r7 = "[setting_global=%s]"
            java.lang.String r8 = "%s"
            java.lang.String r5 = r7.replace(r8, r5)     // Catch:{ Exception -> 0x0e93 }
            r7 = 0
            java.lang.String r4 = m15770y0(r4, r5, r6, r7)     // Catch:{ Exception -> 0x0e93 }
            goto L_0x0e14
        L_0x0e44:
            java.lang.String r0 = "[setting_secure="
            int r0 = r4.indexOf(r0)     // Catch:{ Exception -> 0x0e93 }
            if (r0 >= 0) goto L_0x0e5b
            java.lang.String r0 = "{setting_secure="
            int r0 = r4.indexOf(r0)     // Catch:{ Exception -> 0x0e93 }
            java.lang.String r3 = "}"
            int r5 = r0 + 1
            int r3 = r4.indexOf(r3, r5)     // Catch:{ Exception -> 0x0e93 }
            goto L_0x0e63
        L_0x0e5b:
            java.lang.String r3 = "]"
            int r5 = r0 + 1
            int r3 = r4.indexOf(r3, r5)     // Catch:{ Exception -> 0x0e93 }
        L_0x0e63:
            if (r0 < 0) goto L_0x0e93
            int r5 = r0 + 16
            java.lang.String r5 = r4.substring(r5, r3)     // Catch:{ Exception -> 0x0e93 }
            java.lang.String r6 = "[setting_secure="
            int r0 = r0 + 1
            int r0 = r4.indexOf(r6, r0)     // Catch:{ Exception -> 0x0e93 }
            if (r0 >= 0) goto L_0x0e7d
            java.lang.String r6 = "{setting_secure="
            int r0 = r0 + 1
            int r0 = r4.indexOf(r6, r0)     // Catch:{ Exception -> 0x0e93 }
        L_0x0e7d:
            android.content.ContentResolver r6 = r22.getContentResolver()     // Catch:{ Exception -> 0x0e93 }
            java.lang.String r6 = android.provider.Settings.Secure.getString(r6, r5)     // Catch:{ Exception -> 0x0e93 }
            java.lang.String r7 = "[setting_secure=%s]"
            java.lang.String r8 = "%s"
            java.lang.String r5 = r7.replace(r8, r5)     // Catch:{ Exception -> 0x0e93 }
            r7 = 0
            java.lang.String r4 = m15770y0(r4, r5, r6, r7)     // Catch:{ Exception -> 0x0e93 }
            goto L_0x0e63
        L_0x0e93:
            java.util.List r0 = p183w2.C10330a.m40553e(r22)
            java.util.Iterator r0 = r0.iterator()
        L_0x0e9b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0ee3
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r7 = 0
            r6[r7] = r3
            java.lang.String r8 = "[stopwatch=%s]"
            java.lang.String r6 = java.lang.String.format(r8, r6)
            boolean r8 = m15765w(r4, r6)
            if (r8 == 0) goto L_0x0ec5
            long r8 = p183w2.C10330a.m40552d(r1, r3)
            java.lang.String r8 = m15709O(r8)
            java.lang.String r4 = m15770y0(r4, r6, r8, r2)
        L_0x0ec5:
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r7] = r3
            java.lang.String r7 = "[stopwatchtime=%s]"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            boolean r7 = m15765w(r4, r6)
            if (r7 == 0) goto L_0x0e9b
            long r7 = p183w2.C10330a.m40552d(r1, r3)
            java.lang.String r3 = m15710P(r7)
            java.lang.String r3 = m15770y0(r4, r6, r3, r2)
            r4 = r3
            goto L_0x0e9b
        L_0x0ee3:
            if (r26 == 0) goto L_0x0f05
            java.util.List r0 = r26.getLocalVariables()
            java.lang.String r1 = "[lv=%s]"
            java.lang.String r4 = m15694A0(r0, r4, r2, r1)
            java.lang.String r1 = "lv="
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L_0x0eff
            java.lang.String r1 = "size="
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x0f05
        L_0x0eff:
            java.lang.String r1 = "[lv=%s]"
            java.lang.String r4 = m15694A0(r0, r4, r2, r1)
        L_0x0f05:
            com.arlosoft.macrodroid.common.u r0 = com.arlosoft.macrodroid.common.C4064u.m16048t()
            r1 = 0
            java.util.List r0 = r0.mo27993r(r1)
            java.lang.String r1 = "[v=%s]"
            java.lang.String r1 = m15694A0(r0, r4, r2, r1)
            java.lang.String r3 = "v="
            boolean r3 = r1.contains(r3)
            if (r3 != 0) goto L_0x0f24
            java.lang.String r3 = "size="
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x0f2a
        L_0x0f24:
            java.lang.String r3 = "[v=%s]"
            java.lang.String r1 = m15694A0(r0, r1, r2, r3)
        L_0x0f2a:
            if (r26 == 0) goto L_0x0f46
            java.lang.String r0 = "lv="
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0f3c
            java.lang.String r0 = "size="
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0f46
        L_0x0f3c:
            java.util.List r0 = r26.getLocalVariables()
            java.lang.String r3 = "[lv=%s]"
            java.lang.String r1 = m15694A0(r0, r1, r2, r3)
        L_0x0f46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.common.C4023j0.m15768x0(android.content.Context, java.lang.String, com.arlosoft.macrodroid.triggers.TriggerContextInfo, boolean, com.arlosoft.macrodroid.macro.Macro, boolean, java.util.Locale):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        if (r2 != null) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m15769y(@androidx.annotation.NonNull android.app.Activity r10, @androidx.annotation.NonNull java.lang.String r11, @androidx.annotation.NonNull com.arlosoft.macrodroid.common.C4023j0.C4028e r12, int r13) {
        /*
            java.lang.String r0 = "name"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 95
            r3 = 0
            int r2 = r11.indexOf(r2)     // Catch:{ Exception -> 0x005c, all -> 0x0055 }
            int r2 = r2 + 1
            java.lang.String r4 = "="
            int r4 = r11.indexOf(r4)     // Catch:{ Exception -> 0x005c, all -> 0x0055 }
            java.lang.String r2 = r11.substring(r2, r4)     // Catch:{ Exception -> 0x005c, all -> 0x0055 }
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x005c, all -> 0x0055 }
            android.content.ContentResolver r4 = r10.getContentResolver()     // Catch:{ Exception -> 0x005c, all -> 0x0055 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005c, all -> 0x0055 }
            r5.<init>()     // Catch:{ Exception -> 0x005c, all -> 0x0055 }
            java.lang.String r7 = "content://settings/"
            r5.append(r7)     // Catch:{ Exception -> 0x005c, all -> 0x0055 }
            r5.append(r2)     // Catch:{ Exception -> 0x005c, all -> 0x0055 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x005c, all -> 0x0055 }
            android.net.Uri r5 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x005c, all -> 0x0055 }
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x005c, all -> 0x0055 }
        L_0x003e:
            boolean r4 = r2.moveToNext()     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            if (r4 == 0) goto L_0x005f
            int r4 = r2.getColumnIndex(r0)     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            r1.add(r4)     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            goto L_0x003e
        L_0x0050:
            r10 = move-exception
            r3 = r2
            goto L_0x0056
        L_0x0053:
            goto L_0x005d
        L_0x0055:
            r10 = move-exception
        L_0x0056:
            if (r3 == 0) goto L_0x005b
            r3.close()
        L_0x005b:
            throw r10
        L_0x005c:
            r2 = r3
        L_0x005d:
            if (r2 == 0) goto L_0x0062
        L_0x005f:
            r2.close()
        L_0x0062:
            java.util.Collections.sort(r1)
            r0 = 0
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            androidx.appcompat.app.AlertDialog$Builder r2 = new androidx.appcompat.app.AlertDialog$Builder
            r2.<init>(r10, r13)
            r10 = 2131954209(0x7f130a21, float:1.954491E38)
            java.lang.String r10 = m15722a0(r10)
            r2.setTitle((java.lang.CharSequence) r10)
            r2.setSingleChoiceItems((java.lang.CharSequence[]) r1, (int) r0, (android.content.DialogInterface.OnClickListener) r3)
            r10 = 17039370(0x104000a, float:2.42446E-38)
            com.arlosoft.macrodroid.common.c0 r13 = new com.arlosoft.macrodroid.common.c0
            r13.<init>(r12, r11, r1)
            r2.setPositiveButton((int) r10, (android.content.DialogInterface.OnClickListener) r13)
            androidx.appcompat.app.AlertDialog r10 = r2.create()
            r10.show()
            android.view.WindowManager$LayoutParams r11 = new android.view.WindowManager$LayoutParams
            r11.<init>()
            android.view.Window r12 = r10.getWindow()
            android.view.WindowManager$LayoutParams r12 = r12.getAttributes()
            r11.copyFrom(r12)
            r12 = -1
            r11.width = r12
            android.view.Window r10 = r10.getWindow()
            r10.setAttributes(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.common.C4023j0.m15769y(android.app.Activity, java.lang.String, com.arlosoft.macrodroid.common.j0$e, int):void");
    }

    /* renamed from: y0 */
    private static String m15770y0(String str, String str2, String str3, boolean z) {
        int indexOf;
        if (str3 == null) {
            return str;
        }
        String replace = str.replace("[", "{").replace("]", "}");
        String replace2 = str2.replace("[", "{").replace("]", "}");
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!replace.contains(replace2)) {
            return str;
        }
        if (z) {
            try {
                str3 = URLEncoder.encode(str3, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        StringBuffer stringBuffer = new StringBuffer(replace);
        StringBuffer stringBuffer2 = new StringBuffer(str);
        ArrayList arrayList = new ArrayList();
        do {
            indexOf = stringBuffer.indexOf(replace2);
            if (indexOf >= 0) {
                arrayList.add(Integer.valueOf(indexOf));
                int length = replace2.length() + indexOf;
                stringBuffer.delete(indexOf, length);
                stringBuffer2.delete(indexOf, length);
                continue;
            }
        } while (indexOf >= 0);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            stringBuffer2.insert(((Integer) arrayList.get(size)).intValue(), str3);
        }
        return stringBuffer2.toString();
    }

    /* renamed from: z */
    public static void m15771z(@NonNull Activity activity, Macro macro, @NonNull String str, @NonNull C4028e eVar, int i) {
        ArrayList arrayList = new ArrayList();
        if (macro != null) {
            for (MacroDroidVariable next : macro.getLocalVariablesSorted()) {
                if (next.mo27751a0() || next.mo27748X()) {
                    arrayList.add(next);
                }
            }
        }
        for (MacroDroidVariable next2 : C4064u.m16048t().mo27993r(true)) {
            if (next2.mo27751a0() || next2.mo27748X()) {
                arrayList.add(next2);
            }
        }
        if (arrayList.size() == 0) {
            C15626c.makeText(activity, C17541R$string.no_variables_configured, 1).show();
            return;
        }
        String[] strArr = new String[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            strArr[i2] = ((MacroDroidVariable) arrayList.get(i2)).getName();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, i);
        builder.setTitle((int) C17541R$string.action_set_variable_select);
        builder.setSingleChoiceItems((CharSequence[]) strArr, 0, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4006e0(arrayList, activity, str, eVar, i));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C4071w.f10650a);
        builder.create().show();
    }

    /* renamed from: z0 */
    private static String m15772z0(Context context, String str, TriggerContextInfo triggerContextInfo, boolean z) {
        String str2;
        String y0;
        if (str == null) {
            return "";
        }
        if (triggerContextInfo == null || triggerContextInfo.mo31565r() == null) {
            return str;
        }
        String r = triggerContextInfo.mo31565r();
        if (r.equals(NotificationTrigger.class.getSimpleName())) {
            NotificationContextInfo o = triggerContextInfo.mo31562o();
            if (m15765w(str, "[not_title]")) {
                if (o != null) {
                    str = m15770y0(str, "[not_title]", o.mo28543f(), z);
                } else {
                    C4878b.m18868g("Notification context info was null");
                }
            }
            if (m15765w(str, "[not_ticker]")) {
                if (o != null) {
                    str = m15770y0(str, "[not_ticker]", o.mo28546i(), z);
                } else {
                    C4878b.m18868g("Notification context info was null");
                }
            }
            if (m15765w(str, "[notification]")) {
                if (o != null) {
                    str = m15770y0(str, "[notification]", o.mo28542e(), z);
                } else {
                    C4878b.m18868g("Notification context info was null");
                }
            }
            if (m15765w(str, "[not_sub_text]")) {
                if (o != null) {
                    str = m15770y0(str, "[not_sub_text]", o.mo28544g(), z);
                } else {
                    C4878b.m18868g("Notification context info was null");
                }
            }
            if (m15765w(str, "[not_app_name]")) {
                if (o != null) {
                    str = m15770y0(str, "[not_app_name]", o.mo28538b(), z);
                } else {
                    C4878b.m18868g("Notification context info was null");
                }
            }
            if (m15765w(str, "[not_app_package]")) {
                if (o != null) {
                    str = m15770y0(str, "[not_app_package]", o.mo28539c(), z);
                } else {
                    C4878b.m18868g("Notification context info was null");
                }
            }
            if (m15765w(str, "[not_text_lines]")) {
                if (o != null) {
                    str = m15770y0(str, "[not_text_lines]", o.mo28545h(), z);
                } else {
                    C4878b.m18868g("Notification context info was null");
                }
            }
            if (m15765w(str, "[not_text_big]")) {
                if (o != null) {
                    str = m15770y0(str, "[not_text_big]", o.mo28540d(), z);
                } else {
                    C4878b.m18868g("Notification context info was null");
                }
            }
            if (!m15765w(str, "[not_action_names]")) {
                return str;
            }
            if (o != null) {
                y0 = m15770y0(str, "[not_action_names]", o.mo28537a(), z);
            } else {
                C4878b.m18868g("Notification context info was null");
                return str;
            }
        } else if (triggerContextInfo.mo31561n() != null) {
            IncomingSMS n = triggerContextInfo.mo31561n();
            if (m15765w(str, "[sms_name]")) {
                str = m15770y0(str, "[sms_name]", "" + n.mo27722a(), z);
            }
            if (m15765w(str, "[sms_message]")) {
                str = m15770y0(str, "[sms_message]", "" + n.mo27724c(), z);
            }
            if (!m15765w(str, "[sms_number]")) {
                return str;
            }
            y0 = m15770y0(str, "[sms_number]", "" + n.mo27723b(), z);
        } else if (r.equals(IncomingCallTrigger.class.getSimpleName()) || r.equals(OutgoingCallTrigger.class.getSimpleName()) || r.equals(CallEndedTrigger.class.getSimpleName()) || r.equals(CallActiveTrigger.class.getSimpleName()) || r.equals(CallMissedTrigger.class.getSimpleName())) {
            String p = triggerContextInfo.mo31563p();
            if (m15765w(str, "[call_name]")) {
                try {
                    String C = C4061t1.m15948C(MacroDroidApplication.m14845u(), p);
                    if (C != null) {
                        str = m15770y0(str, "[call_name]", C, z);
                    } else {
                        str = m15770y0(str, "[call_name]", MacroDroidApplication.m14845u().getString(C17541R$string.unknown_caller) + " (" + p + ")", z);
                    }
                } catch (Exception unused) {
                    C4878b.m18868g("Could not replace contact name. Missing READ_CONTACTS permission");
                    str = m15770y0(str, "[call_name]", MacroDroidApplication.m14845u().getString(C17541R$string.unknown_caller) + " (" + p + ")", z);
                }
            }
            return m15770y0(str, "[call_number]", p, z);
        } else if (r.equals(ApplicationLaunchedTrigger.class.getSimpleName())) {
            return m15770y0(str, "[app_name]", triggerContextInfo.mo31563p(), z);
        } else {
            if (r.equals(ApplicationInstalledRemovedTrigger.class.getSimpleName())) {
                String p2 = triggerContextInfo.mo31563p();
                PackageManager packageManager = context.getPackageManager();
                try {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(p2, 0);
                    str2 = packageManager.getApplicationLabel(applicationInfo).toString();
                    p2 = applicationInfo.packageName;
                } catch (Exception unused2) {
                    str2 = triggerContextInfo.mo31563p();
                }
                return m15770y0(m15770y0(str, "[app_name]", str2, z), "[app_package]", p2, z);
            } else if (r.equals(LocationTrigger.class.getSimpleName())) {
                return m15770y0(str, "[lat_long]", triggerContextInfo.mo31563p(), z);
            } else {
                if (triggerContextInfo.mo31568u() != null) {
                    WeatherContextInfo u = triggerContextInfo.mo31568u();
                    String format = String.format("%.1f", new Object[]{Double.valueOf(u.mo28593c())});
                    String format2 = String.format("%.1f", new Object[]{Double.valueOf(u.mo28594d())});
                    String format3 = String.format("%.1f", new Object[]{Double.valueOf(u.mo28597f())});
                    String format4 = String.format("%.1f", new Object[]{Double.valueOf(u.mo28597f() * 2.23694d)});
                    String format5 = String.format("%.1f", new Object[]{Double.valueOf(u.mo28597f() * 3.6d)});
                    String y02 = m15770y0(str, "[weather_temperature_c]", "" + format, z);
                    String y03 = m15770y0(y02, "[weather_temperature_farenheit]", "" + format2, z);
                    String y04 = m15770y0(y03, "[weather_wind_speed]", "" + format3, z);
                    String y05 = m15770y0(y04, "[weather_wind_speed_mph]", "" + format4, z);
                    String y06 = m15770y0(y05, "[weather_wind_speed_kmh]", "" + format5, z);
                    String y07 = m15770y0(y06, "[weather_wind_direction]", "" + u.mo28596e(), z);
                    return m15770y0(m15770y0(y07, "[weather_humidity]", "" + u.mo28592b(), z), "[weather_conditions]", u.mo28591a(), z);
                } else if (r.equals(CalendarTrigger.class.getSimpleName())) {
                    return m15770y0(m15770y0(m15770y0(m15770y0(m15770y0(m15770y0(m15770y0(m15770y0(m15770y0(str, "[calendar_title]", String.valueOf(triggerContextInfo.mo31559l()), z), "[calendar_detail]", String.valueOf(triggerContextInfo.mo31550d()), z), "[calendar_location]", String.valueOf(triggerContextInfo.mo31555h()), z), "[calendar_start_date]", String.valueOf(triggerContextInfo.mo31556i()), z), "[calendar_start_date_us]", String.valueOf(triggerContextInfo.mo31557j()), z), "[calendar_start_time]", String.valueOf(triggerContextInfo.mo31558k()), z), "[calendar_end_date]", String.valueOf(triggerContextInfo.mo31552e()), z), "[calendar_end_date_us]", String.valueOf(triggerContextInfo.mo31553f()), z), "[calendar_end_time]", String.valueOf(triggerContextInfo.mo31554g()), z);
                } else {
                    if (r.equals(BluetoothTrigger.class.getSimpleName())) {
                        return m15770y0(str, "[bluetooth_device_name]", triggerContextInfo.mo31563p(), z);
                    }
                    if (r.equals(UsbDeviceConnectionTrigger.class.getSimpleName())) {
                        return m15770y0(m15770y0(str, "[usb_product_name]", triggerContextInfo.mo31567t(), z), "[usb_manufacturer_name]", triggerContextInfo.mo31566s(), z);
                    }
                    if (r.equals(LogcatTrigger.class.getSimpleName())) {
                        return m15770y0(str, "[logcat_line]", triggerContextInfo.mo31563p(), z);
                    }
                    return str;
                }
            }
        }
        return y0;
    }
}
