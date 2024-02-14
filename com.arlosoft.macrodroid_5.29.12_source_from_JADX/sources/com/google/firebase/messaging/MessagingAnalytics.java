package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.concurrent.ExecutionException;

public class MessagingAnalytics {
    /* renamed from: A */
    public static boolean m76920A(Intent intent) {
        if (intent == null || m76939r(intent)) {
            return false;
        }
        return m76921B(intent.getExtras());
    }

    /* renamed from: B */
    public static boolean m76921B(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* renamed from: a */
    static boolean m76922a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            FirebaseApp.m74383m();
            Context l = FirebaseApp.m74383m().mo61950l();
            SharedPreferences sharedPreferences = l.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = l.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(l.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("delivery_metrics_exported_to_big_query_enabled"))) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* renamed from: b */
    static MessagingClientEvent m76923b(MessagingClientEvent.Event event, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        MessagingClientEvent.Builder h = MessagingClientEvent.m77112p().mo63483m(m76937p(extras)).mo63475e(event).mo63476f(m76927f(extras)).mo63479i(m76934m()).mo63481k(MessagingClientEvent.SDKPlatform.ANDROID).mo63478h(m76932k(extras));
        String h2 = m76929h(extras);
        if (h2 != null) {
            h.mo63477g(h2);
        }
        String o = m76936o(extras);
        if (o != null) {
            h.mo63482l(o);
        }
        String c = m76924c(extras);
        if (c != null) {
            h.mo63473c(c);
        }
        String i = m76930i(extras);
        if (i != null) {
            h.mo63472b(i);
        }
        String e = m76926e(extras);
        if (e != null) {
            h.mo63474d(e);
        }
        long n = m76935n(extras);
        if (n > 0) {
            h.mo63480j(n);
        }
        return h.mo63471a();
    }

    @Nullable
    /* renamed from: c */
    static String m76924c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    @Nullable
    /* renamed from: d */
    static String m76925d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    @Nullable
    /* renamed from: e */
    static String m76926e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    @NonNull
    /* renamed from: f */
    static String m76927f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.m66662a(FirebaseInstallations.m76613q(FirebaseApp.m74383m()).getId());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    @Nullable
    /* renamed from: g */
    static String m76928g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    @Nullable
    /* renamed from: h */
    static String m76929h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    @Nullable
    /* renamed from: i */
    static String m76930i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    @Nullable
    /* renamed from: j */
    static String m76931j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    @NonNull
    /* renamed from: k */
    static MessagingClientEvent.MessageType m76932k(Bundle bundle) {
        if (bundle == null || !NotificationParams.m76958t(bundle)) {
            return MessagingClientEvent.MessageType.DATA_MESSAGE;
        }
        return MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION;
    }

    @NonNull
    /* renamed from: l */
    static String m76933l(Bundle bundle) {
        return (bundle == null || !NotificationParams.m76958t(bundle)) ? Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA : "display";
    }

    @NonNull
    /* renamed from: m */
    static String m76934m() {
        return FirebaseApp.m74383m().mo61950l().getPackageName();
    }

    @Nullable
    /* renamed from: n */
    static long m76935n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "error parsing project number", e);
            }
        }
        FirebaseApp m = FirebaseApp.m74383m();
        String d = m.mo61952p().mo61963d();
        if (d != null) {
            try {
                return Long.parseLong(d);
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e2);
            }
        }
        String c = m.mo61952p().mo61962c();
        if (!c.startsWith("1:")) {
            try {
                return Long.parseLong(c);
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "error parsing app ID", e3);
                return 0;
            }
        } else {
            String[] split = c.split(":");
            if (split.length < 2) {
                return 0;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e4) {
                Log.w("FirebaseMessaging", "error parsing app ID", e4);
                return 0;
            }
        }
    }

    @Nullable
    /* renamed from: o */
    static String m76936o(Bundle bundle) {
        String string = bundle.getString(TypedValues.Transition.S_FROM);
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    @NonNull
    /* renamed from: p */
    static int m76937p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    @Nullable
    /* renamed from: q */
    static String m76938q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    /* renamed from: r */
    private static boolean m76939r(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    /* renamed from: s */
    public static void m76940s(Intent intent) {
        m76945x("_nd", intent.getExtras());
    }

    /* renamed from: t */
    public static void m76941t(Intent intent) {
        m76945x("_nf", intent.getExtras());
    }

    /* renamed from: u */
    public static void m76942u(Bundle bundle) {
        m76946y(bundle);
        m76945x("_no", bundle);
    }

    /* renamed from: v */
    public static void m76943v(Intent intent) {
        if (m76920A(intent)) {
            m76945x("_nr", intent.getExtras());
        }
        if (m76947z(intent)) {
            m76944w(MessagingClientEvent.Event.MESSAGE_DELIVERED, intent, FirebaseMessaging.m76865s());
        }
    }

    /* renamed from: w */
    private static void m76944w(MessagingClientEvent.Event event, Intent intent, @Nullable TransportFactory transportFactory) {
        if (transportFactory == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        MessagingClientEvent b = m76923b(event, intent);
        if (b != null) {
            try {
                transportFactory.mo19274a("FCM_CLIENT_EVENT_LOGGING", MessagingClientEventExtension.class, Encoding.m954b("proto"), C11320u.f55166a).mo19273b(Event.m956d(MessagingClientEventExtension.m77144b().mo63487b(b).mo63486a()));
            } catch (RuntimeException e) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: x */
    static void m76945x(String str, Bundle bundle) {
        try {
            FirebaseApp.m74383m();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d = m76925d(bundle);
            if (d != null) {
                bundle2.putString("_nmid", d);
            }
            String e = m76926e(bundle);
            if (e != null) {
                bundle2.putString("_nmn", e);
            }
            String i = m76930i(bundle);
            if (!TextUtils.isEmpty(i)) {
                bundle2.putString("label", i);
            }
            String g = m76928g(bundle);
            if (!TextUtils.isEmpty(g)) {
                bundle2.putString("message_channel", g);
            }
            String o = m76936o(bundle);
            if (o != null) {
                bundle2.putString("_nt", o);
            }
            String j = m76931j(bundle);
            if (j != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(j));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            String q = m76938q(bundle);
            if (q != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(q));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
                }
            }
            String l = m76933l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", l);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Logging to scion event=");
                sb.append(str);
                sb.append(" scionPayload=");
                sb.append(bundle2);
            }
            AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.m74383m().mo61949j(AnalyticsConnector.class);
            if (analyticsConnector != null) {
                analyticsConnector.mo61993b("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* renamed from: y */
    private static void m76946y(Bundle bundle) {
        if (bundle != null) {
            if ("1".equals(bundle.getString("google.c.a.tc"))) {
                AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.m74383m().mo61949j(AnalyticsConnector.class);
                Log.isLoggable("FirebaseMessaging", 3);
                if (analyticsConnector != null) {
                    String string = bundle.getString("google.c.a.c_id");
                    analyticsConnector.mo61994c("fcm", "_ln", string);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", "Firebase");
                    bundle2.putString("medium", "notification");
                    bundle2.putString("campaign", string);
                    analyticsConnector.mo61993b("fcm", "_cmp", bundle2);
                    return;
                }
                Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                return;
            }
            Log.isLoggable("FirebaseMessaging", 3);
        }
    }

    /* renamed from: z */
    public static boolean m76947z(Intent intent) {
        if (intent == null || m76939r(intent)) {
            return false;
        }
        return m76922a();
    }
}
