package com.arlosoft.macrodroid.troubleshooting.problem;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.StringRes;
import androidx.core.content.IntentCompat;
import androidx.fragment.app.FragmentActivity;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.settings.notificationbar.NotificationBarPreferencesActivity;
import com.arlosoft.macrodroid.triggers.receivers.MacroDroidDeviceAdminReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import p112j2.C7439d0;
import p215b8.C11102b;
import p319lc.C15626c;
import p440y9.C16971a;

/* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c */
/* compiled from: Problem.kt */
public abstract class C6255c {

    /* renamed from: a */
    private final int f14806a;

    /* renamed from: b */
    private final Integer f14807b;

    /* renamed from: c */
    private final int f14808c;

    /* renamed from: d */
    private final Integer f14809d;

    /* renamed from: e */
    private final List<Macro> f14810e;

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c$a */
    /* compiled from: Problem.kt */
    public static final class C6256a extends C6255c {
        public C6256a() {
            super(C17541R$string.troubleshoot_battery_optimization_is_enabled, Integer.valueOf(C17541R$string.ignore_battery_optimisations), 0, (Integer) null, 12, (C13695i) null);
        }

        /* renamed from: f */
        public void mo32283f(Activity activity) {
            C13706o.m87929f(activity, "activity");
            try {
                Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                intent.setData(Uri.parse("package:" + activity.getPackageName()));
                activity.startActivity(intent);
            } catch (Exception unused) {
                activity.startActivity(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"));
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c$b */
    /* compiled from: Problem.kt */
    public static final class C6257b extends C6255c {
        public C6257b() {
            super(C17541R$string.troubleshoot_dont_keep_activities_enabled, Integer.valueOf(C17541R$string.configure), 0, (Integer) null, 12, (C13695i) null);
        }

        /* renamed from: f */
        public void mo32283f(Activity activity) {
            C13706o.m87929f(activity, "activity");
            activity.startActivity(new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS"));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c$c */
    /* compiled from: Problem.kt */
    public static final class C6258c extends C6255c {
        public C6258c() {
            super(C17541R$string.troubleshoot_force_hide_icon_enabled, Integer.valueOf(C17541R$string.configure), 0, (Integer) null, 12, (C13695i) null);
        }

        /* renamed from: f */
        public void mo32283f(Activity activity) {
            C13706o.m87929f(activity, "activity");
            activity.startActivity(new Intent(activity, NotificationBarPreferencesActivity.class));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c$d */
    /* compiled from: Problem.kt */
    public static final class C6259d extends C6255c {
        public C6259d() {
            super(C17541R$string.all_notifications_disabled_warning, Integer.valueOf(C17541R$string.configure_notifications), 0, (Integer) null, 12, (C13695i) null);
        }

        /* renamed from: f */
        public void mo32283f(Activity activity) {
            C13706o.m87929f(activity, "activity");
            Intent putExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
            C13706o.m87928e(putExtra, "Intent(Settings.ACTION_A…GE, activity.packageName)");
            activity.startActivity(putExtra);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c$e */
    /* compiled from: Problem.kt */
    public static final class C6260e extends C6255c {
        public C6260e() {
            super(C17541R$string.troubleshoot_permissions_can_be_auto_disabled, Integer.valueOf(C17541R$string.troubleshoot_go_to_permissions_settings), 0, Integer.valueOf(C17541R$string.troubleshoot_hide_warning), 4, (C13695i) null);
        }

        /* renamed from: f */
        public void mo32283f(Activity activity) {
            C13706o.m87929f(activity, "activity");
            activity.startActivityForResult(IntentCompat.createManageUnusedAppRestrictionsIntent(activity, activity.getPackageName()), 0);
        }

        /* renamed from: g */
        public void mo32284g(Activity activity) {
            C13706o.m87929f(activity, "activity");
            C5163j2.m20115a4(activity, true);
            activity.finish();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c$f */
    /* compiled from: Problem.kt */
    public static final class C6261f extends C6255c {
        public C6261f() {
            super(C17541R$string.troubleshoot_accessibility_required, Integer.valueOf(C17541R$string.enable), 0, (Integer) null, 12, (C13695i) null);
        }

        /* renamed from: f */
        public void mo32283f(Activity activity) {
            C13706o.m87929f(activity, "activity");
            try {
                activity.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
            } catch (Exception unused) {
                C15626c.m94876a(activity.getApplicationContext(), activity.getString(C17541R$string.cannot_launch_accessibility_settings), 1).show();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c$g */
    /* compiled from: Problem.kt */
    public static final class C6262g extends C6255c {
        public C6262g() {
            super(C17541R$string.background_location_permission_required, Integer.valueOf(C17541R$string.enable), 0, Integer.valueOf(C17541R$string.settings), (C13695i) null);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m24369i(boolean z) {
        }

        /* renamed from: f */
        public void mo32283f(Activity activity) {
            C13706o.m87929f(activity, "activity");
            new C11102b((FragmentActivity) activity).mo62231o("android.permission.ACCESS_BACKGROUND_LOCATION").mo79679I(C16971a.m100210a()).mo79685P(C6276d.f14814a);
        }

        /* renamed from: g */
        public void mo32284g(Activity activity) {
            C13706o.m87929f(activity, "activity");
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.parse("package:" + activity.getPackageName()));
                activity.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                C15626c.m94876a(activity.getApplicationContext(), "DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN not supported on this device", 1).show();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c$h */
    /* compiled from: Problem.kt */
    public static final class C6263h extends C6255c {
        public C6263h() {
            super(C17541R$string.requires_assist_and_voice_input, Integer.valueOf(C17541R$string.enable), 0, (Integer) null, 12, (C13695i) null);
        }

        /* renamed from: f */
        public void mo32283f(Activity activity) {
            C13706o.m87929f(activity, "activity");
            try {
                activity.startActivity(new Intent("android.settings.VOICE_INPUT_SETTINGS"));
            } catch (Exception unused) {
                C15626c.m94876a(activity.getApplicationContext(), activity.getString(C17541R$string.cannot_launch_settings), 1).show();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c$i */
    /* compiled from: Problem.kt */
    public static final class C6264i extends C6255c {
        public C6264i() {
            super(C17541R$string.required_device_administrator, Integer.valueOf(C17541R$string.enable), 0, (Integer) null, 12, (C13695i) null);
        }

        /* renamed from: f */
        public void mo32283f(Activity activity) {
            C13706o.m87929f(activity, "activity");
            try {
                ComponentName componentName = new ComponentName(activity, MacroDroidDeviceAdminReceiver.class);
                Intent intent = new Intent("android.app.action.ADD_DEVICE_ADMIN");
                intent.putExtra("android.app.extra.DEVICE_ADMIN", componentName);
                activity.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                C15626c.m94876a(activity.getApplicationContext(), "DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN not supported on this device", 1).show();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c$j */
    /* compiled from: Problem.kt */
    public static final class C6265j extends C6255c {
        public C6265j() {
            super(C17541R$string.requires_draw_overlays, Integer.valueOf(C17541R$string.enable), 0, (Integer) null, 12, (C13695i) null);
        }

        /* renamed from: f */
        public void mo32283f(Activity activity) {
            C13706o.m87929f(activity, "activity");
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.setData(Uri.parse(activity.getPackageName()));
            try {
                activity.startActivity(intent);
            } catch (Exception unused) {
                C15626c.m94876a(activity.getApplicationContext(), activity.getString(C17541R$string.cannot_launch_settings), 1).show();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c$k */
    /* compiled from: Problem.kt */
    public static final class C6266k extends C6255c {

        /* renamed from: f */
        private final String f14811f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6266k(String str) {
            super(0, (Integer) null, 0, (Integer) null, 12, (C13695i) null);
            C13706o.m87929f(str, "actionName");
            this.f14811f = str;
        }

        /* renamed from: c */
        public String mo32280c(Context context) {
            C13706o.m87929f(context, "context");
            try {
                C13696i0 i0Var = C13696i0.f61931a;
                String string = context.getString(C17541R$string.troubleshoot_requires_file_path_reconfiguration, new Object[]{this.f14811f});
                C13706o.m87928e(string, "context.getString(R.stri…onfiguration, actionName)");
                String format = String.format(string, Arrays.copyOf(new Object[0], 0));
                C13706o.m87928e(format, "format(format, *args)");
                return format;
            } catch (Exception unused) {
                return this.f14811f;
            }
        }

        /* renamed from: e */
        public String mo32282e(Context context) {
            C13706o.m87929f(context, "context");
            return this.f14811f;
        }

        /* renamed from: f */
        public void mo32283f(Activity activity) {
            C13706o.m87929f(activity, "activity");
            activity.startActivityForResult(IntentCompat.createManageUnusedAppRestrictionsIntent(activity, activity.getPackageName()), 0);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c$l */
    /* compiled from: Problem.kt */
    public static final class C6267l extends C6255c {
        public C6267l() {
            super(C17541R$string.accessibility_fingerprint_description, Integer.valueOf(C17541R$string.enable), 0, (Integer) null, 12, (C13695i) null);
        }

        /* renamed from: f */
        public void mo32283f(Activity activity) {
            C13706o.m87929f(activity, "activity");
            try {
                activity.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
            } catch (Exception unused) {
                C15626c.m94876a(activity.getApplicationContext(), activity.getString(C17541R$string.cannot_launch_accessibility_settings), 1).show();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c$m */
    /* compiled from: Problem.kt */
    public static final class C6268m extends C6255c {
        public C6268m() {
            super(C17541R$string.location_services_disabled, Integer.valueOf(C17541R$string.enable), 0, (Integer) null, 12, (C13695i) null);
        }

        /* renamed from: f */
        public void mo32283f(Activity activity) {
            C13706o.m87929f(activity, "activity");
            try {
                activity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            } catch (ActivityNotFoundException unused) {
                C15626c.m94876a(activity.getApplicationContext(), "DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN not supported on this device", 1).show();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c$n */
    /* compiled from: Problem.kt */
    public static final class C6269n extends C6255c {

        /* renamed from: f */
        private final String f14812f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6269n(String str) {
            super(C17541R$string.helper_file_required, Integer.valueOf(C17541R$string.get_helper_file), 0, (Integer) null, 12, (C13695i) null);
            C13706o.m87929f(str, "dialogTitle");
            this.f14812f = str;
        }

        /* renamed from: f */
        public void mo32283f(Activity activity) {
            C13706o.m87929f(activity, "activity");
            C7439d0.m30903l0(activity, false, false, this.f14812f);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c$o */
    /* compiled from: Problem.kt */
    public static final class C6270o extends C6255c {
        public C6270o() {
            super(C17541R$string.notification_access_required, Integer.valueOf(C17541R$string.enable), 0, (Integer) null, 12, (C13695i) null);
        }

        /* renamed from: f */
        public void mo32283f(Activity activity) {
            C13706o.m87929f(activity, "activity");
            try {
                activity.startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
            } catch (Exception unused) {
                C15626c.m94876a(activity.getApplicationContext(), activity.getString(C17541R$string.cannot_launch_notification_settings), 1).show();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c$p */
    /* compiled from: Problem.kt */
    public static final class C6271p extends C6255c {

        /* renamed from: f */
        private final String f14813f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6271p(String str) {
            super(0, Integer.valueOf(C17541R$string.enable), C17541R$string.troubleshoot_missing_permission, (Integer) null, 8, (C13695i) null);
            C13706o.m87929f(str, "permission");
            this.f14813f = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m24383i(boolean z) {
        }

        /* renamed from: c */
        public String mo32280c(Context context) {
            C13706o.m87929f(context, "context");
            try {
                C13696i0 i0Var = C13696i0.f61931a;
                String string = context.getString(C17541R$string.troubleshoot_macros_require_permissions);
                C13706o.m87928e(string, "context.getString(R.stri…cros_require_permissions)");
                String substring = this.f14813f.substring(19);
                C13706o.m87928e(substring, "this as java.lang.String).substring(startIndex)");
                String format = String.format(string, Arrays.copyOf(new Object[]{substring}, 1));
                C13706o.m87928e(format, "format(format, *args)");
                return format;
            } catch (Exception unused) {
                return this.f14813f;
            }
        }

        /* renamed from: f */
        public void mo32283f(Activity activity) {
            C13706o.m87929f(activity, "activity");
            new C11102b((FragmentActivity) activity).mo62231o(this.f14813f).mo79679I(C16971a.m100210a()).mo79685P(C6277e.f14815a);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c$q */
    /* compiled from: Problem.kt */
    public static final class C6272q extends C6255c {
        public C6272q() {
            super(C17541R$string.troubleshoot_accessibility_ui_interaction_required, Integer.valueOf(C17541R$string.enable), 0, (Integer) null, 12, (C13695i) null);
        }

        /* renamed from: f */
        public void mo32283f(Activity activity) {
            C13706o.m87929f(activity, "activity");
            try {
                activity.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
            } catch (Exception unused) {
                C15626c.m94876a(activity.getApplicationContext(), activity.getString(C17541R$string.cannot_launch_accessibility_settings), 1).show();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c$r */
    /* compiled from: Problem.kt */
    public static final class C6273r extends C6255c {
        public C6273r() {
            super(C17541R$string.usage_access_required, Integer.valueOf(C17541R$string.enable), 0, (Integer) null, 12, (C13695i) null);
        }

        /* renamed from: f */
        public void mo32283f(Activity activity) {
            C13706o.m87929f(activity, "activity");
            try {
                activity.startActivity(new Intent("android.settings.USAGE_ACCESS_SETTINGS"));
            } catch (Exception unused) {
                C15626c.m94876a(activity.getApplicationContext(), activity.getString(C17541R$string.cannot_launch_settings), 1).show();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c$s */
    /* compiled from: Problem.kt */
    public static final class C6274s extends C6255c {
        public C6274s() {
            super(C17541R$string.troubleshoot_accessibility_volume_required, Integer.valueOf(C17541R$string.enable), 0, (Integer) null, 12, (C13695i) null);
        }

        /* renamed from: f */
        public void mo32283f(Activity activity) {
            C13706o.m87929f(activity, "activity");
            try {
                activity.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
            } catch (Exception unused) {
                C15626c.m94876a(activity.getApplicationContext(), activity.getString(C17541R$string.cannot_launch_accessibility_settings), 1).show();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.c$t */
    /* compiled from: Problem.kt */
    public static final class C6275t extends C6255c {
        public C6275t() {
            super(C17541R$string.requires_write_settings, Integer.valueOf(C17541R$string.enable), 0, (Integer) null, 12, (C13695i) null);
        }

        /* renamed from: f */
        public void mo32283f(Activity activity) {
            C13706o.m87929f(activity, "activity");
            Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
            intent.setData(Uri.parse(activity.getPackageName()));
            try {
                activity.startActivity(intent);
            } catch (Exception unused) {
                C15626c.m94876a(activity.getApplicationContext(), activity.getString(C17541R$string.cannot_launch_settings), 1).show();
            }
        }
    }

    private C6255c(@StringRes int i, @StringRes Integer num, @StringRes int i2, @StringRes Integer num2) {
        this.f14806a = i;
        this.f14807b = num;
        this.f14808c = i2;
        this.f14809d = num2;
        this.f14810e = new ArrayList();
    }

    public /* synthetic */ C6255c(int i, Integer num, int i2, Integer num2, C13695i iVar) {
        this(i, num, i2, num2);
    }

    /* renamed from: a */
    public final Integer mo32278a() {
        return this.f14809d;
    }

    /* renamed from: b */
    public final Integer mo32279b() {
        return this.f14807b;
    }

    /* renamed from: c */
    public String mo32280c(Context context) {
        C13706o.m87929f(context, "context");
        String string = context.getString(this.f14806a);
        C13706o.m87928e(string, "context.getString(description)");
        return string;
    }

    /* renamed from: d */
    public final List<Macro> mo32281d() {
        return this.f14810e;
    }

    /* renamed from: e */
    public String mo32282e(Context context) {
        C13706o.m87929f(context, "context");
        int i = this.f14808c;
        if (i == 0) {
            return null;
        }
        return context.getString(i);
    }

    /* renamed from: f */
    public abstract void mo32283f(Activity activity);

    /* renamed from: g */
    public void mo32284g(Activity activity) {
        C13706o.m87929f(activity, "activity");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6255c(int i, Integer num, int i2, Integer num2, int i3, C13695i iVar) {
        this(i, num, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : num2, (C13695i) null);
    }
}
