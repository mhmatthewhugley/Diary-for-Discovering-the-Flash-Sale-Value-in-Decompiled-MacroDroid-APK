package com.arlosoft.macrodroid.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4012f1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4034l;
import com.arlosoft.macrodroid.common.NotificationButton;
import com.arlosoft.macrodroid.data.SmtpServerConfig;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.logging.systemlog.LogFilter;
import com.arlosoft.macrodroid.macro.C4917c;
import com.arlosoft.macrodroid.templatestore.model.User;
import com.arlosoft.macrodroid.triggers.LocationTrigger;
import com.arlosoft.macrodroid.triggers.services.C6127g;
import com.google.android.gms.maps.model.LatLng;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.UUID;
import org.apache.commons.cli.HelpFormatter;
import p148q0.C8151a;
import p149q1.C8152a;
import p172u1.C10283c;

/* renamed from: com.arlosoft.macrodroid.settings.j2 */
/* compiled from: Settings */
public class C5163j2 {

    /* renamed from: a */
    public static final Locale[] f12949a = {new Locale("bg"), new Locale("ca"), new Locale("cs"), Locale.GERMAN, Locale.ENGLISH, new Locale("es"), Locale.FRENCH, new Locale("hu"), Locale.ITALIAN, new Locale("nl"), new Locale("pl"), new Locale("pt"), new Locale("ru"), new Locale("ro"), new Locale("sv"), new Locale("tr"), new Locale("uk"), new Locale("ar"), new Locale("fa"), Locale.JAPANESE, new Locale("zh-rCN"), new Locale("vi"), new Locale("ko")};

    /* renamed from: b */
    public static final Locale[] f12950b = {new Locale("en", "us"), new Locale("en", "gb"), new Locale("en", "in"), new Locale("en", "au"), Locale.FRENCH, Locale.GERMAN, Locale.ITALIAN, new Locale("es", "es"), new Locale("pt"), new Locale("pt", "br"), new Locale("da"), new Locale("sv"), new Locale("no"), new Locale("fi"), new Locale("nl"), new Locale("pl"), new Locale("ja"), new Locale("ko"), new Locale("tr"), new Locale("cs"), new Locale("hu"), new Locale("el"), new Locale("ru"), new Locale("es", "mx"), new Locale("in"), new Locale("hu", "HU"), new Locale("ro"), new Locale("sk"), new Locale("zh"), new Locale("vi"), new Locale("ar"), new Locale("el"), new Locale("iw"), new Locale("sr"), new Locale("nb"), new Locale("sl"), new Locale("uk"), new Locale("th"), new Locale("hi"), new Locale("fa"), new Locale("he"), new Locale("bg"), new Locale("ca"), new Locale("bn"), new Locale("he")};

    /* renamed from: com.arlosoft.macrodroid.settings.j2$a */
    /* compiled from: Settings */
    class C5164a extends TypeToken<ArrayList<String>> {
        C5164a() {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.settings.j2$b */
    /* compiled from: Settings */
    class C5165b extends TypeToken<HashMap<String, List<C4034l>>> {
        C5165b() {
        }
    }

    /* renamed from: A */
    public static String m19922A(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("prefernces:cloud_backup_id", (String) null);
    }

    /* renamed from: A0 */
    private static Locale m19923A0(Context context) {
        String d0 = m20135d0(context);
        if (d0 != null) {
            int i = -1;
            String[] stringArray = context.getResources().getStringArray(C17525R$array.languages);
            int i2 = 0;
            while (true) {
                if (i2 >= stringArray.length) {
                    break;
                } else if (stringArray[i2].equals(d0)) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            if (i >= 0) {
                return f12949a[i];
            }
        }
        return null;
    }

    /* renamed from: A1 */
    public static String m19924A1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:shake_detect_frequency", "Normal");
    }

    /* renamed from: A2 */
    public static int m19925A2(Context context) {
        try {
            return Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:wifi_background_scan_rate", "5")).intValue();
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("Failed to convert wifi background scan rate value into integer: " + e.getMessage()));
            return 0;
        }
    }

    /* renamed from: A3 */
    public static void m19926A3(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:constraint_logging", z);
        edit.apply();
    }

    /* renamed from: A4 */
    public static void m19927A4(Context context, int i) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("logcat_enabled_buffers", i).apply();
    }

    /* renamed from: A5 */
    public static void m19928A5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:show_macrodroid_icon", z);
        edit.apply();
    }

    /* renamed from: A6 */
    public static boolean m19929A6(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:hide_info_card_recent_towers", false);
    }

    /* renamed from: B */
    public static boolean m19930B(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:collapseCategoriesDefault", false);
    }

    /* renamed from: B0 */
    public static int m19931B0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("legacy_upgrade_warning_count", 0);
    }

    /* renamed from: B1 */
    public static boolean m19932B1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:shake_screen_off", false);
    }

    /* renamed from: B2 */
    public static boolean m19933B2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:prompt_for_review", false);
    }

    /* renamed from: B3 */
    public static void m19934B3(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("current_fg_package", str);
        edit.apply();
    }

    /* renamed from: B4 */
    public static void m19935B4(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:macrodroid_enabled", z);
        edit.apply();
    }

    /* renamed from: B5 */
    public static void m19936B5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:show_notification_button_bar", z);
        edit.apply();
    }

    /* renamed from: B6 */
    public static boolean m19937B6(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:hide_info_card_system_log", false);
    }

    /* renamed from: C */
    public static boolean m19938C(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:constraint_logging", true);
    }

    /* renamed from: C0 */
    public static int m19939C0(Context context) {
        try {
            return Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:light_sensor_bg_update_rate", "0")).intValue();
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("Failed to convert light sensor bg scan rate value into integer: " + e.getMessage()));
            return 0;
        }
    }

    /* renamed from: C1 */
    public static String m19940C1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:shake_sensitivity", ExifInterface.GPS_MEASUREMENT_3D);
    }

    /* renamed from: C2 */
    public static boolean m19941C2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:shown_5_0_app_launch_warning", false);
    }

    /* renamed from: C3 */
    public static void m19942C3(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:current_language_tag", str);
        edit.apply();
    }

    /* renamed from: C4 */
    public static void m19943C4(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt("preferences:macrodroid_icon_resource", i);
        edit.apply();
    }

    /* renamed from: C5 */
    public static void m19944C5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:show_notification_current_mode", z);
        edit.apply();
    }

    /* renamed from: C6 */
    public static boolean m19945C6(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:hide_info_card_trigger", false);
    }

    /* renamed from: D */
    public static String m19946D(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("current_fg_package", "none");
    }

    /* renamed from: D0 */
    public static int m19947D0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("preferences:list_view_num_lines", 2);
    }

    /* renamed from: D1 */
    public static boolean m19948D1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:shake_vibrate", true);
    }

    /* renamed from: D2 */
    public static boolean m19949D2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:shown_alarm_clock_popup", false);
    }

    /* renamed from: D3 */
    public static void m19950D3(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt("current_upgrade_banner", i);
        edit.apply();
    }

    /* renamed from: D4 */
    public static void m19951D4(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:macrodroid_icon_resource_name", str);
        edit.apply();
    }

    /* renamed from: D5 */
    public static void m19952D5(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:show_plugins_dialog_on_entry", z).apply();
    }

    /* renamed from: D6 */
    public static boolean m19953D6(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:hide_info_card_user_log", false);
    }

    /* renamed from: E */
    public static String m19954E(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:current_language_tag", (String) null);
    }

    /* renamed from: E0 */
    public static int m19955E0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("prefrences:local_vars_display_mode", 2);
    }

    /* renamed from: E1 */
    public static boolean m19956E1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("template_store_show_auto_translate_popup", true);
    }

    /* renamed from: E2 */
    public static boolean m19957E2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("prefernces:shown_multi_trigger_warning", false);
    }

    /* renamed from: E3 */
    public static void m19958E3(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("device_facing_constraint_screen_off", z).apply();
    }

    /* renamed from: E4 */
    public static void m19959E4(Context context, String str) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("preferences:notificationBody", str).apply();
    }

    /* renamed from: E5 */
    public static void m19960E5(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("show_scren_on_off_help", z).apply();
    }

    /* renamed from: E6 */
    public static boolean m19961E6(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:hide_info_card_variables", false);
    }

    /* renamed from: F */
    public static int m19962F(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("preferences:active_log", 1);
    }

    @NonNull
    /* renamed from: F0 */
    public static Locale m19963F0(Context context) {
        Locale locale;
        String e0 = m20143e0(context);
        if (e0 != null) {
            locale = Locale.forLanguageTag(e0);
        } else {
            locale = m19923A0(context);
        }
        return locale == null ? Locale.getDefault() : locale;
    }

    /* renamed from: F1 */
    public static boolean m19964F1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:show_categories_selectable_items", true);
    }

    /* renamed from: F2 */
    public static void m19965F2(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_ignored_cell_towers", true).apply();
    }

    /* renamed from: F3 */
    public static void m19966F3(Context context, Set<String> set) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        StringBuilder sb = new StringBuilder();
        for (String replace : set) {
            sb.append(replace.replace(":", "<>COLON<>"));
            sb.append(":");
        }
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        edit.putString("preferences:disabled_categories", sb.toString());
        edit.apply();
    }

    /* renamed from: F4 */
    public static void m19967F4(Context context, String str) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("preferences:notificationTitle", str).apply();
    }

    /* renamed from: F5 */
    public static void m19968F5(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("svw", z).apply();
    }

    /* renamed from: F6 */
    public static boolean m19969F6(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:hide_info_card_keep_accessibility_running", false);
    }

    /* renamed from: G */
    public static int m19970G(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("current_upgrade_banner", 0);
    }

    /* renamed from: G0 */
    public static C6127g.C6128a m19971G0(Context context, LocationTrigger locationTrigger) {
        return C6127g.C6128a.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:loc_info_" + locationTrigger.mo31288l3().getLatitude() + "_" + locationTrigger.mo31288l3().getLongitude() + "_" + locationTrigger.mo31288l3().getAccuracy() + "_" + locationTrigger.mo31290o3(), C6127g.C6128a.UNKNOWN.toString()));
    }

    /* renamed from: G1 */
    public static boolean m19972G1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:show_descriptions", false);
    }

    /* renamed from: G2 */
    public static void m19973G2(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_action", true).apply();
    }

    /* renamed from: G3 */
    public static void m19974G3(Context context, C8152a aVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String t = new GsonBuilder().mo64004c().mo63985t(aVar, aVar.getClass());
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        edit.putString("preferences:drawer_configuration", t);
        edit.apply();
    }

    /* renamed from: G4 */
    public static void m19975G4(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:macro_list_show_details", z).apply();
    }

    /* renamed from: G5 */
    public static void m19976G5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:shown_5_0_app_launch_warning", z);
        edit.apply();
    }

    /* renamed from: H */
    public static String m19977H(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:dark_mode", String.valueOf(-1));
    }

    /* renamed from: H0 */
    public static int m19978H0(Context context) {
        try {
            return Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:location_update_rate", "10")).intValue();
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("Failed to convert loc update rate value into integer: " + e.getMessage()));
            return 0;
        }
    }

    /* renamed from: H1 */
    public static boolean m19979H1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:drawer_show_on_lock_screen", true);
    }

    /* renamed from: H2 */
    public static void m19980H2(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preference:hide_info_card_action_blocks", true).apply();
    }

    /* renamed from: H3 */
    public static void m19981H3(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:draw_enabled", z);
        edit.apply();
    }

    /* renamed from: H4 */
    public static void m19982H4(Context context, int i) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("preferences:magic_text_default_brackets", String.valueOf(i)).apply();
    }

    /* renamed from: H5 */
    public static void m19983H5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:shown_alarm_clock_popup", z);
        edit.apply();
    }

    /* renamed from: I */
    public static boolean m19984I(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("device_facing_constraint_screen_off", false);
    }

    /* renamed from: I0 */
    public static int m19985I0(Context context) {
        try {
            return Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:location_update_rate_seconds", String.valueOf(m19978H0(context) * 60))).intValue();
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("Failed to convert loc update rate value into integer: " + e.getMessage()));
            return 0;
        }
    }

    /* renamed from: I1 */
    public static boolean m19986I1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("list_favourites_only", false);
    }

    /* renamed from: I2 */
    public static void m19987I2(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_auto_backup", true).apply();
    }

    /* renamed from: I3 */
    public static void m19988I3(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:edit_macro_small_mode", z);
        edit.apply();
    }

    /* renamed from: I4 */
    public static void m19989I4(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:map_satellite", z);
        edit.apply();
    }

    /* renamed from: I5 */
    public static void m19990I5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:shown_notification_busybox", z);
        edit.apply();
    }

    /* renamed from: J */
    public static Set<String> m19991J(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:disabled_categories", "");
        HashSet hashSet = new HashSet();
        StringTokenizer stringTokenizer = new StringTokenizer(string, ":");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.length() > 0) {
                hashSet.add(nextToken.replace("<>COLON<>", ":"));
            }
        }
        return hashSet;
    }

    @Nullable
    /* renamed from: J0 */
    public static String m19992J0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("database_seed", (String) null);
    }

    /* renamed from: J1 */
    public static boolean m19993J1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:show_last_activations", true);
    }

    /* renamed from: J2 */
    public static void m19994J2(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_categories", true).apply();
    }

    /* renamed from: J3 */
    public static void m19995J3(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:edit_modes_card_hide", z);
        edit.apply();
    }

    /* renamed from: J4 */
    public static void m19996J4(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:media_button_pass_through_unhandled", z).apply();
    }

    /* renamed from: J5 */
    public static void m19997J5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:shown_magic_text_bracket_info", z);
        edit.apply();
    }

    /* renamed from: K */
    public static boolean m19998K(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:drawer_auto_close", false);
    }

    /* renamed from: K0 */
    public static int m19999K0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("preferences:macrodroid_log_text_size", 12);
    }

    /* renamed from: K1 */
    public static boolean m20000K1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:show_last_edited_times", true);
    }

    /* renamed from: K2 */
    public static void m20001K2(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_cell_towers", true).apply();
    }

    /* renamed from: K3 */
    public static void m20002K3(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:gmail_account", str);
        edit.apply();
    }

    /* renamed from: K4 */
    public static void m20003K4(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:macro_logging_is_disable", z);
        edit.apply();
    }

    /* renamed from: K5 */
    public static void m20004K5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("prefernces:shown_multi_trigger_warning", z);
        edit.apply();
    }

    /* renamed from: L */
    public static int m20005L(Context context) {
        try {
            return Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:drawer_auto_close_timeout", "5")).intValue();
        } catch (Exception unused) {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: L0 */
    public static int m20006L0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("logcat_enabled_buffers", 15);
    }

    /* renamed from: L1 */
    public static boolean m20007L1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:notification_list_macros", false);
    }

    /* renamed from: L2 */
    public static void m20008L2(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_constraint", true).apply();
    }

    /* renamed from: L3 */
    public static void m20009L3(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:enable_experimental_features", z);
        edit.apply();
    }

    /* renamed from: L4 */
    public static void m20010L4(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:mode", str);
        edit.apply();
    }

    /* renamed from: L5 */
    public static void m20011L5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:shown_notification_light_warning", z);
        edit.apply();
    }

    /* renamed from: M */
    public static C8152a m20012M(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:drawer_configuration", (String) null);
        if (string != null) {
            return (C8152a) C10283c.m40411a().mo63976j(string, C8152a.class);
        }
        return C8152a.getDefaultConfiguration(context);
    }

    /* renamed from: M0 */
    public static boolean m20013M0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:macrodroid_enabled", true);
    }

    /* renamed from: M1 */
    public static boolean m20014M1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:show_location_services_warning", false);
    }

    /* renamed from: M2 */
    public static void m20015M2(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_drawer", true).apply();
    }

    /* renamed from: M3 */
    public static void m20016M3(Context context, long j) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putLong("latest_invocation", j).apply();
    }

    /* renamed from: M4 */
    public static void m20017M4(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:mode_list", str);
        edit.apply();
    }

    /* renamed from: M5 */
    public static void m20018M5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:shown_pebble_info", z);
        edit.apply();
    }

    /* renamed from: N */
    public static int m20019N(Context context) {
        return Integer.parseInt(PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:drawer_text_size", "14"));
    }

    /* renamed from: N0 */
    public static int m20020N0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("preferences:macrodroid_icon_resource", C17530R$drawable.active_icon_new);
    }

    /* renamed from: N1 */
    public static boolean m20021N1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("show_logic_constraint_info", true);
    }

    /* renamed from: N2 */
    public static void m20022N2(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_geofences", true).apply();
    }

    /* renamed from: N3 */
    public static void m20023N3(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:flip_device_screen_off", z);
        edit.apply();
    }

    /* renamed from: N4 */
    public static void m20024N4(Context context, int i) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("inverted_calculation", i).apply();
    }

    /* renamed from: N5 */
    public static void m20025N5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:shown_voluem_button_warning", z);
        edit.apply();
    }

    /* renamed from: O */
    public static boolean m20026O(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:edit_macro_small_mode", false);
    }

    /* renamed from: O0 */
    public static String m20027O0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:macrodroid_icon_resource_name", (String) null);
    }

    /* renamed from: O1 */
    public static boolean m20028O1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:show_macrodroid_icon", true);
    }

    /* renamed from: O2 */
    public static void m20029O2(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_keep_accessibility_running", true).apply();
    }

    /* renamed from: O3 */
    public static void m20030O3(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:flip_device_screen_vibrate", z);
        edit.apply();
    }

    /* renamed from: O4 */
    public static void m20031O4(Context context, long j) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putLong("random_generator_seed_part", j * 107).apply();
    }

    /* renamed from: O5 */
    public static void m20032O5(Context context, int i) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("sleep_fall_asleep_threshold", i).apply();
    }

    /* renamed from: P */
    public static boolean m20033P(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:edit_modes_card_hide", false);
    }

    /* renamed from: P0 */
    public static String m20034P0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:notificationBody", (String) null);
    }

    /* renamed from: P1 */
    public static boolean m20035P1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:show_notification_button_bar", false);
    }

    /* renamed from: P2 */
    public static void m20036P2(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_notification_bar", true).apply();
    }

    /* renamed from: P3 */
    public static void m20037P3(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:force_hide_icon", z);
        edit.apply();
    }

    /* renamed from: P4 */
    public static void m20038P4(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:notification_button_bar_configuration", str);
        edit.apply();
    }

    /* renamed from: P5 */
    public static void m20039P5(Context context, int i) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("sleep_wake_up_threshold", i).apply();
    }

    /* renamed from: Q */
    public static String m20040Q(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:gmail_account", (String) null);
    }

    /* renamed from: Q0 */
    public static String m20041Q0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:notificationTitle", (String) null);
    }

    /* renamed from: Q1 */
    public static boolean m20042Q1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:show_notification_current_mode", true);
    }

    /* renamed from: Q2 */
    public static void m20043Q2(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_quick_settings", true).apply();
    }

    /* renamed from: Q3 */
    public static void m20044Q3(Context context, long j) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putLong("preferences:force_hide_warning_last_displayed", j);
        edit.apply();
    }

    /* renamed from: Q4 */
    public static void m20045Q4(Context context, List<NotificationButton> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            NotificationButton notificationButton = list.get(i);
            sb.append(notificationButton.mo27791a());
            sb.append(",");
            sb.append(notificationButton.mo27793c());
            sb.append(",");
            sb.append(notificationButton.mo27794d());
            sb.append(",");
            sb.append(notificationButton.mo27792b());
            sb.append(",");
            sb.append(notificationButton.mo27796e() != null ? notificationButton.mo27796e().toString() : "");
            if (i < list.size() - 1) {
                sb.append(";");
            }
        }
        m20038P4(context, sb.toString());
    }

    /* renamed from: Q5 */
    public static void m20046Q5(Context context, SmtpServerConfig smtpServerConfig) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:smtp_server_address", smtpServerConfig.getServerAddress()).apply();
        edit.putString("preferences:smtp_server_port", smtpServerConfig.getServerPort()).apply();
        edit.putBoolean("preferences:smtp_use_authentication", smtpServerConfig.getUseAuthentication()).apply();
        edit.putString("preferences:smtp_username", smtpServerConfig.getUsername()).apply();
        edit.putString("preferences:smtp_password", smtpServerConfig.getPassword()).apply();
        edit.putBoolean("preferences:start_tls_enabled", smtpServerConfig.getStartTlsEnabled());
    }

    /* renamed from: R */
    public static boolean m20047R(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:send_email_notify_failure", false);
    }

    /* renamed from: R0 */
    public static boolean m20048R0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:macro_list_show_details", true);
    }

    /* renamed from: R1 */
    public static boolean m20049R1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:show_plugins_dialog_on_entry", true);
    }

    /* renamed from: R2 */
    public static void m20050R2(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_recent_towers", true).apply();
    }

    /* renamed from: R3 */
    public static void m20051R3(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:force_legacy_app_launch", z);
        edit.apply();
    }

    /* renamed from: R4 */
    public static void m20052R4(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:notification_priority", String.valueOf(i));
        edit.apply();
    }

    /* renamed from: R5 */
    public static void m20053R5(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:spoken_langugage", str);
        edit.apply();
    }

    /* renamed from: S */
    public static boolean m20054S(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:send_email_notify_success", false);
    }

    /* renamed from: S0 */
    public static int m20055S0(Context context) {
        return Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:magic_text_default_brackets", String.valueOf(C4023j0.f10422a))).intValue();
    }

    /* renamed from: S1 */
    public static boolean m20056S1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("show_scren_on_off_help", true);
    }

    /* renamed from: S2 */
    public static void m20057S2(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_system_log", true).apply();
    }

    /* renamed from: S3 */
    public static void m20058S3(Context context, String str) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("preferences:force_language_code", str).commit();
    }

    /* renamed from: S4 */
    public static void m20059S4(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:notify_when_failure_udp", z).apply();
    }

    /* renamed from: S5 */
    public static void m20060S5(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:spoke_language_output_channel", "" + i);
        edit.apply();
    }

    /* renamed from: T */
    public static String m20061T(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:email_password", (String) null);
        if (string != null) {
            try {
                return new C4012f1().mo27914a(string);
            } catch (Exception e) {
                C8151a.m33873n(new RuntimeException("Failed to decrypt email password: " + e.getMessage()));
            }
        }
        return "";
    }

    /* renamed from: T0 */
    public static boolean m20062T0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:map_satellite", false);
    }

    /* renamed from: T1 */
    public static boolean m20063T1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("svw", false);
    }

    /* renamed from: T2 */
    public static void m20064T2(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_trigger", true).apply();
    }

    /* renamed from: T3 */
    public static void m20065T3(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:foreground_service_2", z);
        edit.apply();
    }

    /* renamed from: T4 */
    public static void m20066T4(Context context, String str) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("order_id", str).apply();
    }

    /* renamed from: T5 */
    public static void m20067T5(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preference:weather_sunset_sunrise", str);
        edit.apply();
    }

    /* renamed from: U */
    public static boolean m20068U(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:email_use_password", false);
    }

    /* renamed from: U0 */
    public static boolean m20069U0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:media_button_pass_through_unhandled", true);
    }

    /* renamed from: U1 */
    public static boolean m20070U1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:show_what_new_popup", true);
    }

    /* renamed from: U2 */
    public static void m20071U2(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_user_log", true).apply();
    }

    /* renamed from: U3 */
    public static void m20072U3(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("has_accepted_user_generated_content_policy", z).apply();
    }

    /* renamed from: U4 */
    public static void m20073U4(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:password_protect", str);
        edit.apply();
    }

    /* renamed from: U5 */
    public static void m20074U5(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt("preferences:system_helper_version", i);
        edit.apply();
    }

    /* renamed from: V */
    public static String m20075V(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:facebook_auth_token", (String) null);
    }

    /* renamed from: V0 */
    public static boolean m20076V0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:macro_logging_is_disable", true);
    }

    /* renamed from: V1 */
    public static boolean m20077V1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:shown_notification_busybox", false);
    }

    /* renamed from: V2 */
    public static void m20078V2(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_variables", true).apply();
    }

    /* renamed from: V3 */
    public static void m20079V3(Context context, String str, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(str, z).apply();
    }

    /* renamed from: V4 */
    public static void m20080V4(Context context, int i) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("password_check_delay", i).apply();
    }

    /* renamed from: V5 */
    public static void m20081V5(Context context, LogFilter logFilter) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String t = new GsonBuilder().mo64004c().mo63985t(logFilter, logFilter.getClass());
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        edit.putString("system_log_filter", t);
        edit.apply();
    }

    @Nullable
    /* renamed from: W */
    public static long m20082W(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong("latest_invocation", 0);
    }

    /* renamed from: W0 */
    public static String m20083W0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:mode", context.getString(C17541R$string.mode_standard));
    }

    /* renamed from: W1 */
    public static boolean m20084W1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:shown_magic_text_bracket_info", false);
    }

    /* renamed from: W2 */
    public static boolean m20085W2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:draw_enabled", false);
    }

    /* renamed from: W3 */
    public static void m20086W3(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("has_registered", z).apply();
    }

    /* renamed from: W4 */
    public static void m20087W4(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:play_sound_output_channel", "" + i);
        edit.apply();
    }

    /* renamed from: W5 */
    public static void m20088W5(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:texttospeech_engine", str);
        edit.apply();
    }

    /* renamed from: X */
    public static boolean m20089X(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:flip_device_screen_off", false);
    }

    /* renamed from: X0 */
    public static String m20090X0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:mode_list", context.getString(C17541R$string.mode_standard) + "," + context.getString(C17541R$string.mode_night) + "," + context.getString(C17541R$string.mode_work) + "," + context.getString(C17541R$string.mode_home) + "," + context.getString(C17541R$string.mode_car) + "," + context.getString(C17541R$string.mode_commute) + "," + context.getString(C17541R$string.mode_away) + "," + context.getString(C17541R$string.mode_holiday) + "," + context.getString(C17541R$string.mode_photo));
    }

    /* renamed from: X1 */
    public static boolean m20091X1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:shown_pebble_info", false);
    }

    /* renamed from: X2 */
    public static boolean m20092X2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:swipe_down_to_open", false);
    }

    /* renamed from: X3 */
    public static void m20093X3(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("has_shown_forum_external_warning", z).apply();
    }

    /* renamed from: X4 */
    public static void m20094X4(Context context, Set<String> set) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putStringSet("plugin-report-ids", set).apply();
    }

    /* renamed from: X5 */
    public static void m20095X5(Context context, User user) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        if (user == null) {
            edit.putString("preferences:templateStoreAccount", (String) null);
        } else {
            edit.putString("preferences:templateStoreAccount", new GsonBuilder().mo64004c().mo63985t(user, User.class));
        }
        edit.apply();
    }

    /* renamed from: Y */
    public static boolean m20096Y(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:flip_device_screen_vibrate", true);
    }

    @Nullable
    /* renamed from: Y0 */
    public static int m20097Y0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("inverted_calculation", 0);
    }

    /* renamed from: Y1 */
    public static boolean m20098Y1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:shown_voluem_button_warning", false);
    }

    /* renamed from: Y2 */
    public static boolean m20099Y2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:swipe_horizontally_to_open", true);
    }

    /* renamed from: Y3 */
    public static void m20100Y3(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:shown_intro", z);
        edit.apply();
    }

    /* renamed from: Y4 */
    public static void m20101Y4(Context context, String str) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("previous_ip_address", str).apply();
    }

    /* renamed from: Y5 */
    public static void m20102Y5(Context context, @Nullable String str) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("template_store_auto_translate_lang", str).apply();
    }

    /* renamed from: Z */
    public static boolean m20103Z(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return false;
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:force_hide_icon", false);
    }

    /* renamed from: Z0 */
    public static long m20104Z0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong("random_generator_seed_part", 0) / 107;
    }

    /* renamed from: Z1 */
    public static int m20105Z1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("sleep_fall_asleep_threshold", 85);
    }

    /* renamed from: Z2 */
    public static boolean m20106Z2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:swipe_up_to_open", false);
    }

    /* renamed from: Z3 */
    public static void m20107Z3(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:shown_wifi_ssid_warning", z);
        edit.apply();
    }

    /* renamed from: Z4 */
    public static void m20108Z4(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("utc_check_enabled", !z);
        edit.apply();
    }

    /* renamed from: Z5 */
    public static void m20109Z5(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:template_store_compact_mode", z).apply();
    }

    /* renamed from: a0 */
    public static long m20111a0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong("preferences:force_hide_warning_last_displayed", 0);
    }

    /* renamed from: a1 */
    public static String m20112a1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:notification_button_bar_configuration", "");
    }

    /* renamed from: a2 */
    public static int m20113a2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("sleep_wake_up_threshold", 25);
    }

    /* renamed from: a3 */
    public static boolean m20114a3(Context context) {
        boolean z = (context.getApplicationInfo().flags & 2) != 0;
        try {
            context.getPackageManager().getPackageInfo("com.arlosoft.macrodroid", 1);
            if (!z && !C4917c.m18992a(context)) {
                return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:eula_2", false);
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a4 */
    public static void m20115a4(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("hide_permission_remover_warning", z).apply();
    }

    /* renamed from: a5 */
    public static void m20116a5(Context context) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:prompt_for_review", true);
        edit.apply();
    }

    /* renamed from: a6 */
    public static void m20117a6(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("tinyurl", str);
        edit.apply();
    }

    /* renamed from: b */
    public static boolean m20118b(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:enable_experimental_features", false);
    }

    /* renamed from: b0 */
    public static boolean m20119b0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:force_legacy_app_launch", false);
    }

    /* renamed from: b1 */
    public static List<NotificationButton> m20120b1(Context context) {
        String[] split;
        int i;
        String a1 = m20112a1(context);
        ArrayList arrayList = new ArrayList();
        if (a1 != null && a1.length() > 0 && (split = a1.split(";")) != null && split.length > 0) {
            for (String split2 : split) {
                String[] split3 = split2.split(",");
                if (split3 != null && (split3.length == 4 || split3.length == 5)) {
                    int intValue = Integer.valueOf(split3[0]).intValue();
                    String str = split3[1];
                    String str2 = split3[2];
                    if (str2.equals("null")) {
                        str2 = null;
                    }
                    try {
                        i = Integer.valueOf(split3[3]).intValue();
                    } catch (Exception unused) {
                        i = 0;
                    }
                    arrayList.add(new NotificationButton(intValue, str, str2, i, (split3.length <= 4 || TextUtils.isEmpty(split3[4])) ? null : Uri.parse(split3[4])));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b2 */
    public static SmtpServerConfig m20121b2(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return new SmtpServerConfig(defaultSharedPreferences.getString("preferences:smtp_server_address", ""), defaultSharedPreferences.getString("preferences:smtp_server_port", "0"), defaultSharedPreferences.getBoolean("preferences:smtp_use_authentication", true), defaultSharedPreferences.getString("preferences:smtp_username", ""), defaultSharedPreferences.getString("preferences:smtp_password", ""), defaultSharedPreferences.getBoolean("preferences:start_tls_enabled", false));
    }

    /* renamed from: b3 */
    public static boolean m20122b3(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:add_macro_wizard_mode", false);
    }

    /* renamed from: b4 */
    public static void m20123b4(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:icon_select_card_hide", z);
        edit.apply();
    }

    /* renamed from: b5 */
    public static void m20124b5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:proximity_sensor_screen_off", z);
        edit.apply();
    }

    /* renamed from: b6 */
    public static void m20125b6(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:touch_screen_device", str);
        edit.apply();
    }

    /* renamed from: c */
    public static void m20126c(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_trigger", false).apply();
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_notification_bar", false).apply();
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_action", false).apply();
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_constraint", false).apply();
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_variables", false).apply();
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_cell_towers", false).apply();
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_geofences", false).apply();
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_user_log", false).apply();
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_system_log", false).apply();
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preference:hide_info_card_action_blocks", false).apply();
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_quick_settings", false).apply();
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_keep_accessibility_running", false).apply();
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_drawer", false).apply();
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_auto_backup", false).apply();
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_categories", false).apply();
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_recent_towers", false).apply();
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:hide_info_card_ignored_cell_towers", false).apply();
    }

    /* renamed from: c0 */
    public static boolean m20127c0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:force_root_helper_file", false);
    }

    /* renamed from: c1 */
    public static int m20128c1(Context context) {
        try {
            return Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:notification_priority", String.valueOf(2))).intValue();
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("Failed to convert notification priority into integer: " + e.getMessage()));
            return 2;
        }
    }

    /* renamed from: c2 */
    public static Locale m20129c2(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:spoken_langugage", (String) null);
        if (string == null || string.isEmpty()) {
            return Locale.getDefault();
        }
        for (Locale locale : f12950b) {
            String str = locale.getLanguage() + HelpFormatter.DEFAULT_OPT_PREFIX + locale.getCountry();
            if (string.equals(locale.getDisplayName()) || string.equals(str)) {
                return locale;
            }
        }
        return Locale.getDefault();
    }

    /* renamed from: c4 */
    public static void m20131c4(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("ignore_default_assist_warning", z).apply();
    }

    /* renamed from: c5 */
    public static void m20132c5(Context context, boolean z) {
        if (z) {
            byte[] bArr = new byte[6];
            new Random().nextBytes(bArr);
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString("pvc", new String(bArr, Charset.forName("UTF-8"))).apply();
            return;
        }
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("pvc", m20217n2(context, false).substring(3, 8)).apply();
    }

    /* renamed from: c6 */
    public static void m20133c6(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:trigger_logging", z);
        edit.apply();
    }

    /* renamed from: d */
    private static String m20134d() {
        return new BigInteger(UUID.randomUUID().toString().replaceAll(HelpFormatter.DEFAULT_OPT_PREFIX, ""), 16).toString(36);
    }

    /* renamed from: d0 */
    public static String m20135d0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:force_language", (String) null);
    }

    /* renamed from: d1 */
    public static boolean m20136d1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:notify_when_failure_udp", true);
    }

    /* renamed from: d2 */
    public static int m20137d2(Context context) {
        try {
            return Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:spoke_language_output_channel", ExifInterface.GPS_MEASUREMENT_2D)).intValue();
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("Failed to convert audio stream channel into integer: " + e.getMessage()));
            return 2;
        }
    }

    /* renamed from: d3 */
    private static List<String> m20138d3(Context context, int i) {
        ArrayList arrayList = new ArrayList();
        try {
            Camera open = Camera.open(i);
            List<Camera.Size> supportedPictureSizes = open.getParameters().getSupportedPictureSizes();
            for (int i2 = 0; i2 < supportedPictureSizes.size(); i2++) {
                arrayList.add(supportedPictureSizes.get(i2).width + "," + supportedPictureSizes.get(i2).height);
            }
            open.release();
        } catch (Exception e) {
            C4878b.m18868g("Could not look up camera resolutions: " + e.toString());
        }
        return arrayList;
    }

    /* renamed from: d4 */
    public static void m20139d4(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("ignore_do_not_disturb", z).apply();
    }

    /* renamed from: d5 */
    public static void m20140d5(Context context, String str) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("uks", str).apply();
    }

    /* renamed from: d6 */
    public static void m20141d6(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:uid", str);
        edit.apply();
    }

    /* renamed from: e */
    public static boolean m20142e(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:api_22_app_launched_trigger", false);
    }

    /* renamed from: e0 */
    public static String m20143e0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:force_language_code", (String) null);
    }

    @Nullable
    /* renamed from: e1 */
    public static String m20144e1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("order_id", (String) null);
    }

    /* renamed from: e2 */
    public static String m20145e2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preference:weather_sunset_sunrise", "");
    }

    /* renamed from: e3 */
    public static void m20146e3(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:api_22_app_launched_trigger", z);
        edit.apply();
    }

    /* renamed from: e4 */
    public static void m20147e4(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:import_export_dir", str);
        edit.apply();
    }

    /* renamed from: e5 */
    public static void m20148e5(Context context, String str) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("pt", str).apply();
    }

    /* renamed from: e6 */
    public static void m20149e6(Context context, long j) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putLong("upgrade_banner_last_change_time", j);
        edit.apply();
    }

    /* renamed from: f */
    public static List<String> m20150f(Context context) {
        return new ArrayList(PreferenceManager.getDefaultSharedPreferences(context).getStringSet("accessibility_services_to_keep_running", new HashSet()));
    }

    /* renamed from: f0 */
    public static int m20151f0(Context context) {
        return ((PreferenceManager.getDefaultSharedPreferences(context).getInt("preferences:last_event_code", 149) + 7) / 12) - 8;
    }

    /* renamed from: f1 */
    public static String m20152f1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:password_protect", C5124c.f12864b);
    }

    /* renamed from: f2 */
    public static LogFilter m20153f2(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("system_log_filter", (String) null);
        if (string == null) {
            return LogFilter.getDefaultConfig();
        }
        LogFilter logFilter = (LogFilter) new GsonBuilder().mo64004c().mo63976j(string, LogFilter.class);
        if (logFilter.getDisabledMacroIds() == null || logFilter.getDisabledVariableNames() == null) {
            return LogFilter.getDefaultConfig();
        }
        return logFilter;
    }

    /* renamed from: f3 */
    public static void m20154f3(Context context, List<String> list) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putStringSet("accessibility_services_to_keep_running", new HashSet(list)).apply();
    }

    /* renamed from: f4 */
    public static void m20155f4(Context context, Uri uri) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:import_export_uri", uri.toString());
        edit.apply();
    }

    /* renamed from: f5 */
    public static void m20156f5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("prefrences:pushTokenUploadFailed", z);
        edit.apply();
    }

    /* renamed from: f6 */
    public static void m20157f6(Context context, String str) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("hash_code", str).apply();
    }

    /* renamed from: g */
    public static boolean m20158g(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:action_logging", true);
    }

    /* renamed from: g0 */
    public static boolean m20159g0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("has_accepted_user_generated_content_policy", false);
    }

    /* renamed from: g1 */
    public static int m20160g1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("password_check_delay", 0);
    }

    /* renamed from: g2 */
    public static String m20161g2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:texttospeech_engine", (String) null);
    }

    /* renamed from: g3 */
    public static void m20162g3(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:action_logging", z);
        edit.apply();
    }

    /* renamed from: g4 */
    public static void m20163g4(Context context, long j) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putLong("preferences:install_date", j);
        edit.apply();
    }

    /* renamed from: g5 */
    public static void m20164g5(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:pushTokenUploaded", str);
        edit.apply();
    }

    /* renamed from: g6 */
    public static void m20165g6(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("prefrences:use_calendar_alarm", z);
        edit.apply();
    }

    /* renamed from: h */
    public static int m20166h(Context context) {
        try {
            return Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:activity_recognition_update_rate", "120")).intValue();
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("Failed to convert activity recognition rate value into integer: " + e.getMessage()));
            return 120;
        }
    }

    /* renamed from: h0 */
    public static boolean m20167h0(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str, false);
    }

    /* renamed from: h1 */
    public static Camera.Size m20168h1(Context context, Camera camera, Camera.CameraInfo cameraInfo) {
        try {
            List<Camera.Size> supportedPictureSizes = camera.getParameters().getSupportedPictureSizes();
            String str = supportedPictureSizes.get(0).width + "," + supportedPictureSizes.get(0).height;
            String string = PreferenceManager.getDefaultSharedPreferences(context).getString(cameraInfo.facing == 1 ? "preferences:front_camera_resolution" : "preferences:rear_camera_resolution", str);
            if (string.contains(",")) {
                str = string;
            }
            return new Camera.Size(camera, Integer.parseInt(str.substring(0, str.indexOf(44))), Integer.parseInt(str.substring(str.indexOf(44) + 1)));
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("Failed to set camera resolution: " + e.toString()));
            Objects.requireNonNull(camera);
            return new Camera.Size(camera, 9999, 9999);
        }
    }

    /* renamed from: h2 */
    public static User m20169h2(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:templateStoreAccount", (String) null);
        if (string != null) {
            return (User) C10283c.m40413c().mo64004c().mo63976j(string, User.class);
        }
        return null;
    }

    /* renamed from: h3 */
    public static void m20170h3(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:activity_recognition_update_rate", String.valueOf(i));
        edit.apply();
    }

    /* renamed from: h4 */
    public static void m20171h4(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt("preferences:keyguard_state", i);
        edit.apply();
    }

    /* renamed from: h5 */
    public static void m20172h5(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:quick_run_is_expanded", z).apply();
    }

    /* renamed from: h6 */
    public static void m20173h6(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:use_inbox_incoming_sms", z);
        edit.apply();
    }

    /* renamed from: i */
    public static String m20174i(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("user_id", (String) null);
        if (string != null) {
            return string;
        }
        String d = m20134d();
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("user_id", d).apply();
        return d;
    }

    /* renamed from: i0 */
    public static boolean m20175i0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("has_registered", false);
    }

    /* renamed from: i1 */
    public static int m20176i1(Context context) {
        try {
            return Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:play_sound_output_channel", "5")).intValue();
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("Failed to convert audio stream channel into integer: " + e.getMessage()));
            return 5;
        }
    }

    @Nullable
    /* renamed from: i2 */
    public static String m20177i2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("template_store_auto_translate_lang", (String) null);
    }

    /* renamed from: i3 */
    public static void m20178i3(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt("app_launch_count", i);
        edit.apply();
    }

    /* renamed from: i4 */
    public static void m20179i4(Context context, HashMap<String, List<C4034l>> hashMap) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        if (hashMap == null) {
            edit.putString("preference:last_calendar_event_map", (String) null);
        } else {
            edit.putString("preference:last_calendar_event_map", new GsonBuilder().mo64009h("yyyy-MM-dd'T'HH:mm:ssZ").mo64010i().mo64004c().mo63985t(hashMap, HashMap.class));
        }
        edit.apply();
    }

    /* renamed from: i5 */
    public static void m20180i5(Context context, List<Long> list) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("preferences:quick_run_macro_guids", TextUtils.join(",", list)).apply();
    }

    /* renamed from: i6 */
    public static void m20181i6(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:user_log_date_layout", z);
        edit.apply();
    }

    /* renamed from: j */
    public static int m20182j(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("app_launch_count", 0);
    }

    /* renamed from: j0 */
    public static boolean m20183j0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("has_shown_forum_external_warning", false);
    }

    /* renamed from: j1 */
    public static Set<String> m20184j1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getStringSet("plugin-report-ids", new HashSet());
    }

    /* renamed from: j2 */
    public static boolean m20185j2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:template_store_compact_mode", true);
    }

    /* renamed from: j3 */
    public static void m20186j3(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:app_launch_prevent_notifications", z);
        edit.apply();
    }

    /* renamed from: j4 */
    public static void m20187j4(Context context, long j) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putLong("last_edited_macro_id", j).apply();
    }

    /* renamed from: j5 */
    public static void m20188j5(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:read_screen_contents_update_rate", str);
        edit.apply();
    }

    /* renamed from: j6 */
    public static void m20189j6(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt("preferences:macrodroid_user_log_text_size", i);
        edit.apply();
    }

    /* renamed from: k */
    public static boolean m20190k(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:app_launch_prevent_notifications", false);
    }

    /* renamed from: k0 */
    public static boolean m20191k0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:shown_intro", false);
    }

    /* renamed from: k1 */
    public static int m20192k1(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:power_button_toggle_timeout", "3500");
        try {
            return Integer.valueOf(string).intValue();
        } catch (Exception unused) {
            C4878b.m18868g("Invalid power button toggle timeout: " + string + ". Using default value (3500ms)");
            return 3500;
        }
    }

    /* renamed from: k2 */
    public static String m20193k2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("tinyurl", (String) null);
    }

    /* renamed from: k3 */
    public static void m20194k3(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:atomicFileMigrated", z);
        edit.apply();
    }

    /* renamed from: k4 */
    public static void m20195k4(Context context, long j) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putLong("preferences:last_enc_message_date", j);
        edit.apply();
    }

    /* renamed from: k5 */
    public static void m20196k5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:log_reverse_order", z);
        edit.apply();
    }

    /* renamed from: k6 */
    public static void m20197k6(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("status:vpn_enabled", z);
        edit.apply();
    }

    /* renamed from: l */
    public static boolean m20198l(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:atomicFileMigrated", false);
    }

    /* renamed from: l0 */
    public static boolean m20199l0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("hide_permission_remover_warning", false);
    }

    /* renamed from: l1 */
    public static String m20200l1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("previous_ip_address", (String) null);
    }

    /* renamed from: l2 */
    public static String m20201l2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:touch_screen_device", "");
    }

    /* renamed from: l3 */
    public static void m20202l3(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("prefrences:auto_backups_enabled", z);
        edit.apply();
    }

    /* renamed from: l4 */
    public static void m20203l4(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:last_export_name", str);
        edit.apply();
    }

    /* renamed from: l5 */
    public static void m20204l5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:user_log_reverse_order", z);
        edit.apply();
    }

    /* renamed from: l6 */
    public static void m20205l6(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preference:weather_lat_lon", str);
        edit.apply();
    }

    /* renamed from: m */
    public static boolean m20206m(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("prefrences:auto_backups_enabled", true);
    }

    /* renamed from: m0 */
    public static boolean m20207m0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:icon_select_card_hide", false);
    }

    /* renamed from: m1 */
    public static boolean m20208m1(Context context) {
        return !PreferenceManager.getDefaultSharedPreferences(context).getBoolean("utc_check_enabled", !m20114a3(context));
    }

    /* renamed from: m2 */
    public static boolean m20209m2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:trigger_logging", true);
    }

    /* renamed from: m3 */
    public static void m20210m3(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:auto_translate_templates", z).apply();
    }

    /* renamed from: m4 */
    public static void m20211m4(Context context, LatLng latLng) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putFloat("preferences:last_trigger_lat", (float) latLng.f46263a);
        edit.putFloat("preferences:last_trigger_lon", (float) latLng.f46264c);
        edit.apply();
    }

    /* renamed from: m5 */
    public static void m20212m5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:show_root", z);
        edit.apply();
    }

    /* renamed from: m6 */
    public static void m20213m6(Context context, int i) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("preferences:weather_update_rate", String.valueOf(i)).apply();
    }

    /* renamed from: n */
    public static boolean m20214n(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:auto_translate_templates", false);
    }

    /* renamed from: n0 */
    public static boolean m20215n0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("ignore_default_assist_warning", false);
    }

    /* renamed from: n1 */
    public static boolean m20216n1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:proximity_sensor_screen_off", false);
    }

    /* renamed from: n2 */
    public static String m20217n2(Context context, boolean z) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:uid", (String) null);
        if (string != null && !z) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:uid", uuid);
        edit.apply();
        return uuid;
    }

    /* renamed from: n3 */
    public static void m20218n3(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("biometrics_enabled", z).apply();
    }

    /* renamed from: n4 */
    public static void m20219n4(Context context, long j) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putLong("last_opened_macro_id", j).apply();
    }

    /* renamed from: n5 */
    public static void m20220n5(Context context, boolean z) {
        int nextInt = z ? ((new Random().nextInt(771000) + 771) / 771) * 771 : 0;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt("vcp_count", nextInt);
        edit.apply();
    }

    /* renamed from: n6 */
    public static void m20221n6(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:widget_button_vibrate_on_press", z);
        edit.apply();
    }

    /* renamed from: o */
    public static boolean m20222o(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("biometrics_enabled", false);
    }

    /* renamed from: o0 */
    public static boolean m20223o0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("ignore_do_not_disturb", false);
    }

    @Nullable
    /* renamed from: o1 */
    public static boolean m20224o1(Context context) {
        if (PreferenceManager.getDefaultSharedPreferences(context).getString("pvc", m20217n2(context, false).substring(3, 8)).equals(m20217n2(context, false).substring(3, 8))) {
            return false;
        }
        return true;
    }

    /* renamed from: o2 */
    public static long m20225o2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong("upgrade_banner_last_change_time", 0);
    }

    /* renamed from: o3 */
    public static void m20226o3(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:notification_button_bar_black_bg", z);
        edit.apply();
    }

    /* renamed from: o4 */
    public static void m20227o4(Context context, long j) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putLong("preferences:last_review_prompt_time", j);
        edit.apply();
    }

    /* renamed from: o5 */
    public static void m20228o5(Context context, String str) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("preferences:shake_detect_frequency", str).apply();
    }

    /* renamed from: o6 */
    public static void m20229o6(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:wifi_background_scan_rate", "" + i);
        edit.apply();
    }

    /* renamed from: p */
    public static boolean m20230p(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:notification_button_bar_black_bg", false);
    }

    /* renamed from: p0 */
    public static String m20231p0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:import_export_dir", new File(Environment.getExternalStorageDirectory(), "MacroDroid").getAbsolutePath());
    }

    @Nullable
    /* renamed from: p1 */
    public static String m20232p1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("uks", (String) null);
    }

    @Nullable
    /* renamed from: p2 */
    public static String m20233p2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("hash_code", (String) null);
    }

    /* renamed from: p3 */
    public static void m20234p3(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt("preferences:notificaiton_button_bar_icon_tint", i);
        edit.apply();
    }

    /* renamed from: p4 */
    public static void m20235p4(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt("preferences:last_run_version", i);
        edit.apply();
    }

    /* renamed from: p5 */
    public static void m20236p5(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:shake_screen_off", z).apply();
    }

    /* renamed from: p6 */
    public static boolean m20237p6(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:hide_info_card_ignored_cell_towers", false);
    }

    /* renamed from: q */
    public static int m20238q(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("preferences:notificaiton_button_bar_icon_tint", ((context.getResources().getConfiguration().uiMode & 48) == 32 || m20230p(context)) ? -1 : ViewCompat.MEASURED_STATE_MASK);
    }

    /* renamed from: q0 */
    public static Uri m20239q0(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:import_export_uri", (String) null);
        if (string != null) {
            return Uri.parse(string);
        }
        return null;
    }

    @Nullable
    /* renamed from: q1 */
    public static String m20240q1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("pt", (String) null);
    }

    /* renamed from: q2 */
    public static boolean m20241q2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("prefrences:use_calendar_alarm", false);
    }

    /* renamed from: q3 */
    public static void m20242q3(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("can_show_flash", z).apply();
    }

    /* renamed from: q4 */
    public static void m20243q4(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt("preferences:notification_button_bar_id", i);
        edit.apply();
    }

    /* renamed from: q5 */
    public static void m20244q5(Context context, String str) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("preferences:shake_sensitivity", str).apply();
    }

    /* renamed from: q6 */
    public static boolean m20245q6(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:hide_info_card_auto_backup", false);
    }

    /* renamed from: r */
    public static List<String> m20246r(Context context, int i) {
        ArrayList arrayList = new ArrayList();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String string = defaultSharedPreferences.getString("preferences:camera_supported_resolutions" + i, "");
        if (string.length() == 0) {
            List<String> d3 = m20138d3(context, i);
            StringBuilder sb = new StringBuilder();
            for (String append : d3) {
                sb.append(append);
                sb.append(":");
            }
            SharedPreferences.Editor edit = defaultSharedPreferences.edit();
            edit.putString("preferences:camera_supported_resolutions" + i, sb.toString());
            edit.apply();
            return d3;
        }
        try {
            StringTokenizer stringTokenizer = new StringTokenizer(string, ":");
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                if (nextToken.length() > 0) {
                    arrayList.add(nextToken);
                }
            }
            return arrayList;
        } catch (Exception e) {
            List<String> d32 = m20138d3(context, i);
            C8151a.m33873n(new RuntimeException("Exception tokenizing: " + e.getMessage()));
            return d32;
        }
    }

    /* renamed from: r0 */
    public static long m20247r0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong("preferences:install_date", 0);
    }

    /* renamed from: r1 */
    public static boolean m20248r1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("prefrences:pushTokenUploadFailed", false);
    }

    /* renamed from: r2 */
    public static boolean m20249r2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:use_inbox_incoming_sms", false);
    }

    /* renamed from: r3 */
    public static void m20250r3(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("show_upgrade_on_launch", z).apply();
    }

    /* renamed from: r4 */
    public static void m20251r4(Context context, int i) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("legacy_upgrade_warning_count", i).apply();
    }

    /* renamed from: r5 */
    public static void m20252r5(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:shake_vibrate", z).apply();
    }

    /* renamed from: r6 */
    public static boolean m20253r6(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:hide_info_card_action", false);
    }

    @Nullable
    /* renamed from: s */
    public static boolean m20254s(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("can_show_flash", true);
    }

    /* renamed from: s0 */
    public static HashMap<String, List<C4034l>> m20255s0(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("preference:last_calendar_event_map", (String) null);
        if (string == null) {
            return new HashMap<>();
        }
        try {
            return (HashMap) new GsonBuilder().mo64009h("yyyy-MM-dd'T'HH:mm:ssZ").mo64010i().mo64004c().mo63977k(string, new C5165b().mo64307e());
        } catch (Exception unused) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString("preference:last_calendar_event_map", (String) null).apply();
            return new HashMap<>();
        }
    }

    /* renamed from: s1 */
    public static String m20256s1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:pushTokenUploaded", (String) null);
    }

    /* renamed from: s2 */
    public static boolean m20257s2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:user_log_date_layout", false);
    }

    /* renamed from: s3 */
    public static void m20258s3(Context context, List<String> list) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        if (list == null) {
            edit.putString("preferences:user_categories", (String) null).apply();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            if (!arrayList.contains(next)) {
                arrayList.add(next);
            }
        }
        edit.putString("preferences:user_categories", new GsonBuilder().mo64004c().mo63985t(arrayList, ArrayList.class)).apply();
    }

    /* renamed from: s4 */
    public static void m20259s4(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:light_sensor_bg_update_rate", String.valueOf(i));
        edit.apply();
    }

    /* renamed from: s5 */
    public static void m20260s5(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("template_store_show_auto_translate_popup", z).apply();
    }

    /* renamed from: s6 */
    public static boolean m20261s6(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference:hide_info_card_action_blocks", false);
    }

    /* renamed from: t */
    public static boolean m20262t(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("show_upgrade_on_launch", true);
    }

    /* renamed from: t0 */
    public static long m20263t0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong("last_edited_macro_id", 0);
    }

    /* renamed from: t1 */
    public static boolean m20264t1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:quick_run_is_expanded", false);
    }

    /* renamed from: t2 */
    public static int m20265t2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("preferences:macrodroid_user_log_text_size", 12);
    }

    /* renamed from: t3 */
    public static void m20266t3(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:cell_tower_update_rate", "" + i);
        edit.apply();
    }

    /* renamed from: t4 */
    public static void m20267t4(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt("preferences:list_view_num_lines", i);
        edit.apply();
    }

    /* renamed from: t5 */
    public static void m20268t5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:show_categories_selectable_items", z);
        edit.apply();
    }

    /* renamed from: t6 */
    public static boolean m20269t6(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:hide_info_card_categories", false);
    }

    /* renamed from: u */
    public static List<String> m20270u(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences.getString("preferences:user_categories", (String) null) == null) {
            List<String> v = m20278v(context);
            m20258s3(context, v);
            return v;
        }
        String string = defaultSharedPreferences.getString("preferences:user_categories", (String) null);
        if (string != null) {
            try {
                return (List) new GsonBuilder().mo64004c().mo63977k(string, new C5164a().mo64307e());
            } catch (Exception e) {
                C4878b.m18868g("Failed to load category list: " + e.toString());
            }
        }
        List<String> v2 = m20278v(context);
        m20258s3(context, v2);
        return v2;
    }

    /* renamed from: u0 */
    public static long m20271u0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong("preferences:last_enc_message_date", m20247r0(context));
    }

    /* renamed from: u1 */
    public static List<Long> m20272u1(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:quick_run_macro_guids", "");
        ArrayList arrayList = new ArrayList();
        if (!string.isEmpty()) {
            String[] split = string.split(",");
            for (String parseLong : split) {
                arrayList.add(Long.valueOf(Long.parseLong(parseLong)));
            }
        }
        return arrayList;
    }

    /* renamed from: u2 */
    public static boolean m20273u2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:user_prompt_cancel_actions", true);
    }

    /* renamed from: u3 */
    public static void m20274u3(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("preferences:cell_tower_use_alarm", z).apply();
    }

    /* renamed from: u4 */
    public static void m20275u4(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt("prefrences:local_vars_display_mode", i);
        edit.apply();
    }

    /* renamed from: u5 */
    public static void m20276u5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:show_descriptions", z);
        edit.apply();
    }

    /* renamed from: u6 */
    public static boolean m20277u6(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:hide_info_card_cell_towers", false);
    }

    /* renamed from: v */
    public static List<String> m20278v(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:default_categories", context.getString(C17541R$string.uncategorized) + ":" + context.getString(C17541R$string.categories_auto_and_vehicles) + ":" + context.getString(C17541R$string.categories_battery_saving) + ":" + context.getString(C17541R$string.categories_call_handling) + ":" + context.getString(C17541R$string.categories_communication) + ":" + context.getString(C17541R$string.categories_device_config) + ":" + context.getString(C17541R$string.categories_entertainment) + ":" + context.getString(C17541R$string.categories_games) + ":" + context.getString(C17541R$string.categories_health_and_fitness) + ":" + context.getString(C17541R$string.categories_house_and_home) + ":" + context.getString(C17541R$string.categories_location_based) + ":" + context.getString(C17541R$string.categories_maps_and_navigation) + ":" + context.getString(C17541R$string.categories_miscellaneous) + ":" + context.getString(C17541R$string.categories_music_and_audio) + ":" + context.getString(C17541R$string.categories_news) + ":" + context.getString(C17541R$string.categories_notifications) + ":" + context.getString(C17541R$string.categories_personalisation) + ":" + context.getString(C17541R$string.categories_photography) + ":" + context.getString(C17541R$string.categories_productivity) + ":" + context.getString(C17541R$string.categories_quick_setting_tiles) + ":" + context.getString(C17541R$string.categories_security) + ":" + context.getString(C17541R$string.categories_shopping) + ":" + context.getString(C17541R$string.categories_social) + ":" + context.getString(C17541R$string.categories_sport) + ":" + context.getString(C17541R$string.categories_utilities) + ":" + context.getString(C17541R$string.categories_video) + ":" + context.getString(C17541R$string.categories_weather) + ":");
        ArrayList arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(string, ":");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.length() > 0) {
                arrayList.add(nextToken);
            }
        }
        Collator instance = Collator.getInstance(m19963F0(context));
        instance.setStrength(0);
        Collections.sort(arrayList, new C5159i2(instance));
        return arrayList;
    }

    /* renamed from: v0 */
    public static String m20279v0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:last_export_name", "");
    }

    /* renamed from: v1 */
    public static int m20280v1(Context context) {
        double d;
        try {
            d = Double.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:read_screen_contents_update_rate", ExifInterface.GPS_MEASUREMENT_2D)).doubleValue();
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("Failed to convert read screen constent update rate value into double: " + e.getMessage()));
            d = 2.0d;
        }
        return (int) (d * 1000.0d);
    }

    /* renamed from: v2 */
    public static boolean m20281v2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:alternative_configuration", false);
    }

    /* renamed from: v3 */
    public static void m20282v3(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("clipboard_use_logcat", z).apply();
    }

    /* renamed from: v4 */
    public static void m20283v4(Context context, LocationTrigger locationTrigger, C6127g.C6128a aVar) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:loc_info_" + locationTrigger.mo31288l3().getLatitude() + "_" + locationTrigger.mo31288l3().getLongitude() + "_" + locationTrigger.mo31288l3().getAccuracy() + "_" + locationTrigger.mo31290o3(), aVar.toString());
        edit.apply();
    }

    /* renamed from: v5 */
    public static void m20284v5(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("list_favourites_only", z).apply();
    }

    /* renamed from: v6 */
    public static boolean m20285v6(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:hide_info_card_constraint", false);
    }

    /* renamed from: w */
    public static int m20286w(Context context) {
        try {
            return Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:cell_tower_update_rate", ExifInterface.GPS_MEASUREMENT_2D)).intValue();
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("Failed to convert cell tower update rate value into integer: " + e.getMessage()));
            return 0;
        }
    }

    /* renamed from: w0 */
    public static long m20287w0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong("last_opened_macro_id", 0);
    }

    /* renamed from: w1 */
    public static boolean m20288w1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:log_reverse_order", true);
    }

    /* renamed from: w2 */
    public static boolean m20289w2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("status:vpn_enabled", false);
    }

    /* renamed from: w3 */
    public static void m20290w3(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("prefrences:cloud_backups_enabled", z);
        edit.apply();
    }

    /* renamed from: w4 */
    public static void m20291w4(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("preferences:location_update_rate", "" + i).apply();
    }

    /* renamed from: w5 */
    public static void m20292w5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:show_last_activations", z);
        edit.apply();
    }

    /* renamed from: w6 */
    public static boolean m20293w6(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:hide_info_card_drawer", false);
    }

    /* renamed from: x */
    public static boolean m20294x(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:cell_tower_use_alarm", false);
    }

    /* renamed from: x0 */
    public static long m20295x0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong("preferences:last_review_prompt_time", 0);
    }

    /* renamed from: x1 */
    public static boolean m20296x1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:user_log_reverse_order", true);
    }

    /* renamed from: x2 */
    public static String m20297x2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preference:weather_lat_lon", "");
    }

    /* renamed from: x3 */
    public static void m20298x3(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("prefernces:cloud_backup_id", str);
        edit.apply();
    }

    /* renamed from: x4 */
    public static void m20299x4(Context context, int i) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("preferences:location_update_rate_seconds", String.valueOf(i)).apply();
    }

    /* renamed from: x5 */
    public static void m20300x5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:show_last_edited_times", z);
        edit.apply();
    }

    /* renamed from: x6 */
    public static boolean m20301x6(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:hide_info_card_geofences", false);
    }

    /* renamed from: y */
    public static boolean m20302y(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("clipboard_use_logcat", Build.VERSION.SDK_INT >= 29);
    }

    /* renamed from: y0 */
    public static int m20303y0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("preferences:last_run_version", 0);
    }

    /* renamed from: y1 */
    public static boolean m20304y1(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:show_root", true);
    }

    /* renamed from: y2 */
    public static int m20305y2(Context context) {
        try {
            return Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getString("preferences:weather_update_rate", "30")).intValue();
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("Failed to convert weather update rate value into integer: " + e.getMessage()));
            return 30;
        }
    }

    /* renamed from: y3 */
    public static void m20306y3(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:collapseCategoriesDefault", z);
        edit.apply();
    }

    /* renamed from: y4 */
    public static void m20307y4(Context context, String str) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("database_seed", str).apply();
    }

    /* renamed from: y5 */
    public static void m20308y5(Context context, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean("preferences:notification_list_macros", z);
        edit.apply();
    }

    /* renamed from: y6 */
    public static boolean m20309y6(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:hide_info_card_notification_bar", false);
    }

    /* renamed from: z */
    public static boolean m20310z(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("prefrences:cloud_backups_enabled", true);
    }

    /* renamed from: z0 */
    public static int m20311z0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("preferences:notification_button_bar_id", 0);
    }

    /* renamed from: z1 */
    public static boolean m20312z1(Context context) {
        int i = PreferenceManager.getDefaultSharedPreferences(context).getInt("vcp_count", 0);
        if (i <= 0 || i % 771 != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: z2 */
    public static boolean m20313z2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:widget_button_vibrate_on_press", true);
    }

    /* renamed from: z3 */
    public static void m20314z3(Context context, boolean z) {
        if (z) {
            byte[] bArr = new byte[6];
            new Random().nextBytes(bArr);
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString("cps", new String(bArr, Charset.forName("UTF-8"))).apply();
            return;
        }
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("cps", m20217n2(context, false).substring(3, 8)).apply();
    }

    /* renamed from: z4 */
    public static void m20315z4(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt("preferences:macrodroid_log_text_size", i);
        edit.apply();
    }

    /* renamed from: z5 */
    public static void m20316z5(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("show_logic_constraint_info", z).apply();
    }

    /* renamed from: z6 */
    public static boolean m20317z6(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preferences:hide_info_card_quick_settings", false);
    }
}
