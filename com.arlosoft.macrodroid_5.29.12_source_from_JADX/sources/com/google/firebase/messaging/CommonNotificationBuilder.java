package com.google.firebase.messaging;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import java.util.concurrent.atomic.AtomicInteger;

public final class CommonNotificationBuilder {

    /* renamed from: a */
    private static final AtomicInteger f54956a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class DisplayNotificationInfo {

        /* renamed from: a */
        public final NotificationCompat.Builder f54957a;

        /* renamed from: b */
        public final String f54958b;

        /* renamed from: c */
        public final int f54959c;

        DisplayNotificationInfo(NotificationCompat.Builder builder, String str, int i) {
            this.f54957a = builder;
            this.f54958b = str;
            this.f54959c = i;
        }
    }

    private CommonNotificationBuilder() {
    }

    @Nullable
    /* renamed from: a */
    private static PendingIntent m76791a(Context context, NotificationParams notificationParams, String str, PackageManager packageManager) {
        Intent f = m76796f(str, notificationParams, packageManager);
        if (f == null) {
            return null;
        }
        f.addFlags(67108864);
        f.putExtras(notificationParams.mo63390y());
        if (m76807q(notificationParams)) {
            f.putExtra("gcm.n.analytics_data", notificationParams.mo63389x());
        }
        return PendingIntent.getActivity(context, m76797g(), f, m76802l(BasicMeasure.EXACTLY));
    }

    @Nullable
    /* renamed from: b */
    private static PendingIntent m76792b(Context context, Context context2, NotificationParams notificationParams) {
        if (!m76807q(notificationParams)) {
            return null;
        }
        return m76793c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(notificationParams.mo63389x()));
    }

    /* renamed from: c */
    private static PendingIntent m76793c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, m76797g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), m76802l(BasicMeasure.EXACTLY));
    }

    /* renamed from: d */
    public static DisplayNotificationInfo m76794d(Context context, Context context2, NotificationParams notificationParams, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context2, str);
        String n = notificationParams.mo63384n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(n)) {
            builder.setContentTitle(n);
        }
        String n2 = notificationParams.mo63384n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(n2)) {
            builder.setContentText(n2);
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(n2));
        }
        builder.setSmallIcon(m76803m(packageManager, resources, packageName, notificationParams.mo63386p("gcm.n.icon"), bundle));
        Uri n3 = m76804n(packageName, notificationParams, resources);
        if (n3 != null) {
            builder.setSound(n3);
        }
        builder.setContentIntent(m76791a(context, notificationParams, packageName, packageManager));
        PendingIntent b = m76792b(context, context2, notificationParams);
        if (b != null) {
            builder.setDeleteIntent(b);
        }
        Integer h = m76798h(context2, notificationParams.mo63386p("gcm.n.color"), bundle);
        if (h != null) {
            builder.setColor(h.intValue());
        }
        builder.setAutoCancel(!notificationParams.mo63372a("gcm.n.sticky"));
        builder.setLocalOnly(notificationParams.mo63372a("gcm.n.local_only"));
        String p = notificationParams.mo63386p("gcm.n.ticker");
        if (p != null) {
            builder.setTicker(p);
        }
        Integer m = notificationParams.mo63383m();
        if (m != null) {
            builder.setPriority(m.intValue());
        }
        Integer r = notificationParams.mo63388r();
        if (r != null) {
            builder.setVisibility(r.intValue());
        }
        Integer l = notificationParams.mo63382l();
        if (l != null) {
            builder.setNumber(l.intValue());
        }
        Long j = notificationParams.mo63380j("gcm.n.event_time");
        if (j != null) {
            builder.setShowWhen(true);
            builder.setWhen(j.longValue());
        }
        long[] q = notificationParams.mo63387q();
        if (q != null) {
            builder.setVibrate(q);
        }
        int[] e = notificationParams.mo63375e();
        if (e != null) {
            builder.setLights(e[0], e[1], e[2]);
        }
        builder.setDefaults(m76799i(notificationParams));
        return new DisplayNotificationInfo(builder, m76805o(notificationParams), 0);
    }

    /* renamed from: e */
    static DisplayNotificationInfo m76795e(Context context, NotificationParams notificationParams) {
        Bundle j = m76800j(context.getPackageManager(), context.getPackageName());
        return m76794d(context, context, notificationParams, m76801k(context, notificationParams.mo63381k(), j), j);
    }

    /* renamed from: f */
    private static Intent m76796f(String str, NotificationParams notificationParams, PackageManager packageManager) {
        String p = notificationParams.mo63386p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p)) {
            Intent intent = new Intent(p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f = notificationParams.mo63376f();
        if (f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* renamed from: g */
    private static int m76797g() {
        return f54956a.incrementAndGet();
    }

    /* renamed from: h */
    private static Integer m76798h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i == 0) {
            return null;
        }
        try {
            return Integer.valueOf(ContextCompat.getColor(context, i));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* renamed from: i */
    private static int m76799i(NotificationParams notificationParams) {
        boolean a = notificationParams.mo63372a("gcm.n.default_sound");
        if (notificationParams.mo63372a("gcm.n.default_vibrate_timings")) {
            a |= true;
        }
        return notificationParams.mo63372a("gcm.n.default_light_settings") ? a | true ? 1 : 0 : a ? 1 : 0;
    }

    /* renamed from: j */
    private static Bundle m76800j(PackageManager packageManager, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        return Bundle.EMPTY;
    }

    @VisibleForTesting
    /* renamed from: k */
    public static String m76801k(Context context, String str, Bundle bundle) {
        String str2;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else if (notificationManager.getNotificationChannel(string) != null) {
                return string;
            } else {
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", TypedValues.Custom.S_STRING, context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    str2 = "Misc";
                } else {
                    str2 = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", str2, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: l */
    private static int m76802l(int i) {
        return Build.VERSION.SDK_INT >= 23 ? i | 67108864 : i;
    }

    /* renamed from: m */
    private static int m76803m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m76806p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m76806p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !m76806p(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
            }
        }
        if (i == 0 || !m76806p(resources, i)) {
            return 17301651;
        }
        return i;
    }

    /* renamed from: n */
    private static Uri m76804n(String str, NotificationParams notificationParams, Resources resources) {
        String o = notificationParams.mo63385o();
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        if ("default".equals(o) || resources.getIdentifier(o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + o);
    }

    /* renamed from: o */
    private static String m76805o(NotificationParams notificationParams) {
        String p = notificationParams.mo63386p("gcm.n.tag");
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    /* renamed from: p */
    private static boolean m76806p(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }

    /* renamed from: q */
    static boolean m76807q(@NonNull NotificationParams notificationParams) {
        return notificationParams.mo63372a("google.c.a.e");
    }
}
