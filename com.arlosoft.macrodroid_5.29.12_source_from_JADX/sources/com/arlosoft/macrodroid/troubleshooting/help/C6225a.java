package com.arlosoft.macrodroid.troubleshooting.help;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.accessibility.KeepAccessibilityServicesRunningActivity;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.utils.C6417p1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p319lc.C15626c;

/* renamed from: com.arlosoft.macrodroid.troubleshooting.help.a */
/* compiled from: HelpItem.kt */
public abstract class C6225a {

    /* renamed from: a */
    private final int f14793a;

    /* renamed from: b */
    private final int f14794b;

    /* renamed from: c */
    private final Integer f14795c;

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.a$a */
    /* compiled from: HelpItem.kt */
    public static final class C6226a extends C6225a {
        public C6226a() {
            super(C17541R$string.troubleshoot_accessibility_service_disabled_title, C17541R$string.troubleshoot_accessibility_service_disabled_description, Integer.valueOf(C17541R$string.keep_accessibility_services_running), (C13695i) null);
        }

        /* renamed from: g */
        public void mo32249g(Context context) {
            C13706o.m87929f(context, "context");
            try {
                context.startActivity(new Intent(context, KeepAccessibilityServicesRunningActivity.class));
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.a$b */
    /* compiled from: HelpItem.kt */
    public static final class C6227b extends C6225a {
        public C6227b() {
            super(C17541R$string.troubleshoot_accessibility_service_causes_slowdown_title, C17541R$string.troubleshoot_accessibility_service_causes_slowdown_description, Integer.valueOf(C17541R$string.troubleshoot_accessibility_services_link), (C13695i) null);
        }

        /* renamed from: g */
        public void mo32249g(Context context) {
            C13706o.m87929f(context, "context");
            try {
                context.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.a$c */
    /* compiled from: HelpItem.kt */
    public static final class C6228c extends C6225a {
        public C6228c() {
            super(C17541R$string.troubleshoot_app_killed_in_background_title, C17541R$string.troubleshoot_app_killed_in_background_description, Integer.valueOf(C17541R$string.dont_kill_my_app_com), (C13695i) null);
        }

        /* renamed from: d */
        public int mo32246d(Context context) {
            C13706o.m87929f(context, "context");
            return mo32247e(context).size();
        }

        /* renamed from: g */
        public void mo32249g(Context context) {
            C13706o.m87929f(context, "context");
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://dontkillmyapp.com")));
            } catch (ActivityNotFoundException unused) {
            }
        }

        /* renamed from: h */
        public void mo32250h(Context context, int i) {
            C13706o.m87929f(context, "context");
            try {
                List<Intent> e = mo32247e(context);
                if (i < e.size()) {
                    e.get(i).addFlags(268435456);
                    context.startActivity(e.get(i));
                }
            } catch (Exception unused) {
                C15626c.makeText(context.getApplicationContext(), C17541R$string.cannot_launch_settings, 1).show();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.a$d */
    /* compiled from: HelpItem.kt */
    public static final class C6229d extends C6225a {
        public C6229d() {
            super(C17541R$string.troubleshoot_bluetooth_action_prompt_title, C17541R$string.troubleshoot_bluetooth_action_prompt_description, Integer.valueOf(C17541R$string.configure), (C13695i) null);
        }

        /* renamed from: g */
        public void mo32249g(Context context) {
            C13706o.m87929f(context, "context");
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", "com.arlosoft.macrodroid", (String) null));
                context.startActivity(intent);
            } catch (Exception unused) {
            }
        }

        /* renamed from: i */
        public boolean mo32251i() {
            String str = Build.MANUFACTURER;
            C13706o.m87928e(str, "MANUFACTURER");
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (C13706o.m87924a(lowerCase, "xiaomi")) {
                return true;
            }
            C13706o.m87928e(str, "MANUFACTURER");
            String lowerCase2 = str.toLowerCase(locale);
            C13706o.m87928e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return C13706o.m87924a(lowerCase2, "huawei");
        }

        /* renamed from: j */
        public boolean mo32252j() {
            String str = Build.MANUFACTURER;
            C13706o.m87928e(str, "MANUFACTURER");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return C13706o.m87924a(lowerCase, "xiaomi");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.a$e */
    /* compiled from: HelpItem.kt */
    public static final class C6230e extends C6225a {
        public C6230e() {
            super(C17541R$string.troubleshoot_button_bar_style_title, C17541R$string.troubleshoot_button_bar_style_description, (Integer) null, 4, (C13695i) null);
        }

        /* renamed from: i */
        public boolean mo32251i() {
            return Build.VERSION.SDK_INT >= 31;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.a$f */
    /* compiled from: HelpItem.kt */
    public static final class C6231f extends C6225a {
        public C6231f() {
            super(C17541R$string.troubleshoot_dont_understand_feature_title, C17541R$string.troubleshoot_dont_understand_feature_descritption, (Integer) null, 4, (C13695i) null);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.a$g */
    /* compiled from: HelpItem.kt */
    public static final class C6232g extends C6225a {
        public C6232g() {
            super(C17541R$string.troubleshoot_geofence_not_working_title, C17541R$string.troubleshoot_geofence_not_working_description, Integer.valueOf(C17541R$string.action_clear_app_data), (C13695i) null);
        }

        /* renamed from: g */
        public void mo32249g(Context context) {
            C13706o.m87929f(context, "context");
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", "com.google.android.gms", (String) null));
                context.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.a$h */
    /* compiled from: HelpItem.kt */
    public static final class C6233h extends C6225a {
        public C6233h() {
            super(C17541R$string.troubleshoot_how_hide_persistent_notification_title, C17541R$string.troubleshoot_how_hide_persistent_notification_description, Integer.valueOf(C17541R$string.settings), (C13695i) null);
        }

        /* renamed from: g */
        public void mo32249g(Context context) {
            C13706o.m87929f(context, "context");
            try {
                Intent intent = new Intent();
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                context.startActivity(intent);
            } catch (Exception unused) {
            }
        }

        /* renamed from: i */
        public boolean mo32251i() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.a$i */
    /* compiled from: HelpItem.kt */
    public static final class C6234i extends C6225a {
        public C6234i() {
            super(C17541R$string.troubleshoot_high_battery_drain_title, C17541R$string.troubleshoot_high_battery_drain_description, (Integer) null, 4, (C13695i) null);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.a$j */
    /* compiled from: HelpItem.kt */
    public static final class C6235j extends C6225a {
        public C6235j() {
            super(C17541R$string.troubleshoot_ui_interaction_in_games_title, C17541R$string.troubleshoot_ui_interaction_in_games_description, (Integer) null, 4, (C13695i) null);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.a$k */
    /* compiled from: HelpItem.kt */
    public static final class C6236k extends C6225a {
        public C6236k() {
            super(C17541R$string.troubleshoot_app_not_start_on_boot_title, C17541R$string.troubleshoot_app_not_start_on_boot_description, (Integer) null, 4, (C13695i) null);
        }

        /* renamed from: d */
        public int mo32246d(Context context) {
            C13706o.m87929f(context, "context");
            return mo32247e(context).size();
        }

        /* renamed from: h */
        public void mo32250h(Context context, int i) {
            C13706o.m87929f(context, "context");
            try {
                List<Intent> a = mo32243a(context);
                if (i < a.size()) {
                    a.get(i).addFlags(268435456);
                    context.startActivity(a.get(i));
                }
            } catch (Exception unused) {
                C15626c.makeText(context.getApplicationContext(), C17541R$string.cannot_launch_settings, 1).show();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.a$l */
    /* compiled from: HelpItem.kt */
    public static final class C6237l extends C6225a {
        public C6237l() {
            super(C17541R$string.troubleshoot_pro_version_not_applied_title, C17541R$string.troubleshoot_pro_version_not_applied_description, Integer.valueOf(C17541R$string.action_clear_app_data), (C13695i) null);
        }

        /* renamed from: g */
        public void mo32249g(Context context) {
            C13706o.m87929f(context, "context");
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", "com.android.vending", (String) null));
                context.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.a$m */
    /* compiled from: HelpItem.kt */
    public static final class C6238m extends C6225a {
        public C6238m() {
            super(C17541R$string.troubleshoot_accessibility_speak_text_action_not_working_title, C17541R$string.f7065xbf65a476, Integer.valueOf(C17541R$string.open_text_to_speech_settings), (C13695i) null);
        }

        /* renamed from: g */
        public void mo32249g(Context context) {
            C13706o.m87929f(context, "context");
            try {
                Intent intent = new Intent("com.android.settings.TTS_SETTINGS");
                intent.setFlags(268435456);
                context.startActivity(intent);
            } catch (Exception e) {
                C4878b.m18868g("Could not open TTS settings: " + e);
                C15626c.makeText(context.getApplicationContext(), C17541R$string.error, 0).show();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.a$n */
    /* compiled from: HelpItem.kt */
    public static final class C6239n extends C6225a {
        public C6239n() {
            super(C17541R$string.troubleshoot_translations_poor_or_missing_title, C17541R$string.translation_info, Integer.valueOf(C17541R$string.oneskyapp_link), (C13695i) null);
        }

        /* renamed from: g */
        public void mo32249g(Context context) {
            C13706o.m87929f(context, "context");
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://macrodroid.oneskyapp.com/collaboration/project?id=28964")));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.a$o */
    /* compiled from: HelpItem.kt */
    public static final class C6240o extends C6225a {
        public C6240o() {
            super(C17541R$string.troubleshoot_high_ui_interaction_stops_working_title, C17541R$string.troubleshoot_high_ui_interaction_stops_working_description, Integer.valueOf(C17541R$string.troubleshoot_accessibility_services_link), (C13695i) null);
        }

        /* renamed from: g */
        public void mo32249g(Context context) {
            C13706o.m87929f(context, "context");
            try {
                context.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.a$p */
    /* compiled from: HelpItem.kt */
    public static final class C6241p extends C6225a {
        public C6241p() {
            super(C17541R$string.troubleshoot_cant_uninstall_title, C17541R$string.troubleshoot_cant_uninstall_description, Integer.valueOf(C17541R$string.uninstall_macrodroid), (C13695i) null);
        }

        /* renamed from: g */
        public void mo32249g(Context context) {
            C13706o.m87929f(context, "context");
            C6417p1.m24714a(context);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.a$q */
    /* compiled from: HelpItem.kt */
    public static final class C6242q extends C6225a {
        public C6242q() {
            super(C17541R$string.troubleshoot_why_location_permission_title, C17541R$string.troubleshoot_why_location_permission_description, Integer.valueOf(C17541R$string.link_wifi_location), (C13695i) null);
        }

        /* renamed from: g */
        public void mo32249g(Context context) {
            C13706o.m87929f(context, "context");
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(context.getString(C17541R$string.link_wifi_location))));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.a$r */
    /* compiled from: HelpItem.kt */
    public static final class C6243r extends C6225a {
        public C6243r() {
            super(C17541R$string.troubleshoot_why_need_helper_file_title, C17541R$string.troubleshoot_why_need_helper_file_description, (Integer) null, 4, (C13695i) null);
        }
    }

    private C6225a(@StringRes int i, @StringRes int i2, @StringRes Integer num) {
        this.f14793a = i;
        this.f14794b = i2;
        this.f14795c = num;
    }

    public /* synthetic */ C6225a(int i, int i2, Integer num, C13695i iVar) {
        this(i, i2, num);
    }

    /* renamed from: a */
    public final List<Intent> mo32243a(Context context) {
        C13706o.m87929f(context, "context");
        List<Intent> m = C13614t.m87751m(new Intent("miui.intent.action.OP_AUTO_START").addCategory("android.intent.category.DEFAULT"), new Intent().setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity")), new Intent().setComponent(new ComponentName("com.letv.android.letvsafe", "com.letv.android.letvsafe.AutobootManageActivity")), new Intent().setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity")), new Intent().setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.process.ProtectActivity")), new Intent().setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.appcontrol.activity.StartupAppControlActivity")), new Intent().setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.bootstart.BootStartActivity")), new Intent().setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.startup.StartupAppListActivity")), new Intent().setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.startupapp.StartupAppListActivity")), new Intent().setComponent(new ComponentName("com.oppo.safe", "com.oppo.safe.permission.startup.StartupAppListActivity")), new Intent().setComponent(new ComponentName("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.AddWhiteListActivity")), new Intent().setComponent(new ComponentName("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.BgStartUpManager")), new Intent().setComponent(new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.BgStartUpManagerActivity")), new Intent().setComponent(new ComponentName("com.samsung.android.lool", "com.samsung.android.sm.ui.battery.BatteryActivity")), new Intent().setComponent(new ComponentName("com.htc.pitroad", "com.htc.pitroad.landingpage.activity.LandingPageActivity")), new Intent().setComponent(new ComponentName("com.asus.mobilemanager", "com.asus.mobilemanager.MainActivity")), new Intent().setComponent(new ComponentName("com.transsion.phonemanager", "com.itel.autobootmanager.activity.AutoBootMgrActivity")));
        ArrayList arrayList = new ArrayList();
        for (Intent intent : m) {
            if (!(intent == null || intent.resolveActivity(context.getPackageManager()) == null || context.getPackageManager().resolveActivity(intent, 65536) == null)) {
                arrayList.add(intent);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final Integer mo32244b() {
        return this.f14795c;
    }

    /* renamed from: c */
    public final int mo32245c() {
        return this.f14794b;
    }

    /* renamed from: d */
    public int mo32246d(Context context) {
        C13706o.m87929f(context, "context");
        return 0;
    }

    /* renamed from: e */
    public final List<Intent> mo32247e(Context context) {
        C13706o.m87929f(context, "context");
        List<Intent> m = C13614t.m87751m(new Intent("miui.intent.action.POWER_HIDE_MODE_APP_LIST").addCategory("android.intent.category.DEFAULT"), new Intent().setComponent(new ComponentName("com.miui.securitycenter", "com.miui.powercenter.PowerSettings")), new Intent().setComponent(new ComponentName("com.letv.android.letvsafe", "com.letv.android.letvsafe.AutobootManageActivity")), new Intent().setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity")), new Intent().setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.process.ProtectActivity")), new Intent().setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.appcontrol.activity.StartupAppControlActivity")), new Intent().setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.power.ui.HwPowerManagerActivity")), new Intent().setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.startup.StartupAppListActivity")), new Intent().setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.startupapp.StartupAppListActivity")), new Intent().setComponent(new ComponentName("com.oppo.safe", "com.oppo.safe.permission.startup.StartupAppListActivity")), new Intent().setComponent(new ComponentName("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.AddWhiteListActivity")), new Intent().setComponent(new ComponentName("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.BgStartUpManager")), new Intent().setComponent(new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.BgStartUpManagerActivity")), new Intent().setComponent(new ComponentName("com.samsung.android.lool", "com.samsung.android.sm.ui.battery.BatteryActivity")), new Intent().setComponent(new ComponentName("com.htc.pitroad", "com.htc.pitroad.landingpage.activity.LandingPageActivity")), new Intent().setComponent(new ComponentName("com.asus.mobilemanager", "com.asus.mobilemanager.MainActivity")), new Intent().setComponent(new ComponentName("com.transsion.phonemanager", "com.itel.autobootmanager.activity.AutoBootMgrActivity")));
        ArrayList arrayList = new ArrayList();
        for (Intent intent : m) {
            if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
                C13706o.m87928e(intent, "intent");
                arrayList.add(intent);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final int mo32248f() {
        return this.f14793a;
    }

    /* renamed from: g */
    public void mo32249g(Context context) {
        C13706o.m87929f(context, "context");
    }

    /* renamed from: h */
    public void mo32250h(Context context, int i) {
        C13706o.m87929f(context, "context");
    }

    /* renamed from: i */
    public boolean mo32251i() {
        return true;
    }

    /* renamed from: j */
    public boolean mo32252j() {
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6225a(int i, int i2, Integer num, int i3, C13695i iVar) {
        this(i, i2, (i3 & 4) != 0 ? null : num, (C13695i) null);
    }
}
