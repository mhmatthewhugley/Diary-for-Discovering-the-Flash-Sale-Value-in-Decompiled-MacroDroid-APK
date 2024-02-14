package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.measurement.internal.zzgn;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzid;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
public final class zzc {

    /* renamed from: a */
    private static final Set f53805a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));

    /* renamed from: b */
    private static final List f53806b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"});

    /* renamed from: c */
    private static final List f53807c = Arrays.asList(new String[]{"auto", "app", "am"});

    /* renamed from: d */
    private static final List f53808d = Arrays.asList(new String[]{"_r", "_dbg"});

    /* renamed from: e */
    private static final List f53809e = Arrays.asList((String[]) ArrayUtils.m4841a(zzgq.f46909a, zzgq.f46910b));

    /* renamed from: f */
    private static final List f53810f = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    /* renamed from: a */
    public static Bundle m74474a(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.f53784a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = conditionalUserProperty.f53785b;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = conditionalUserProperty.f53786c;
        if (obj != null) {
            zzgn.m65767b(bundle, obj);
        }
        String str3 = conditionalUserProperty.f53787d;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.f53788e);
        String str4 = conditionalUserProperty.f53789f;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        Bundle bundle2 = conditionalUserProperty.f53790g;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str5 = conditionalUserProperty.f53791h;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        Bundle bundle3 = conditionalUserProperty.f53792i;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.f53793j);
        String str6 = conditionalUserProperty.f53794k;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        Bundle bundle4 = conditionalUserProperty.f53795l;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.f53796m);
        bundle.putBoolean("active", conditionalUserProperty.f53797n);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.f53798o);
        return bundle;
    }

    /* renamed from: b */
    public static AnalyticsConnector.ConditionalUserProperty m74475b(Bundle bundle) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        Preconditions.m4488k(bundle);
        AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
        conditionalUserProperty.f53784a = (String) Preconditions.m4488k((String) zzgn.m65766a(bundle, "origin", cls2, (Object) null));
        conditionalUserProperty.f53785b = (String) Preconditions.m4488k((String) zzgn.m65766a(bundle, "name", cls2, (Object) null));
        conditionalUserProperty.f53786c = zzgn.m65766a(bundle, "value", Object.class, (Object) null);
        conditionalUserProperty.f53787d = (String) zzgn.m65766a(bundle, "trigger_event_name", cls2, (Object) null);
        conditionalUserProperty.f53788e = ((Long) zzgn.m65766a(bundle, "trigger_timeout", cls, 0L)).longValue();
        conditionalUserProperty.f53789f = (String) zzgn.m65766a(bundle, "timed_out_event_name", cls2, (Object) null);
        conditionalUserProperty.f53790g = (Bundle) zzgn.m65766a(bundle, "timed_out_event_params", Bundle.class, (Object) null);
        conditionalUserProperty.f53791h = (String) zzgn.m65766a(bundle, "triggered_event_name", cls2, (Object) null);
        conditionalUserProperty.f53792i = (Bundle) zzgn.m65766a(bundle, "triggered_event_params", Bundle.class, (Object) null);
        conditionalUserProperty.f53793j = ((Long) zzgn.m65766a(bundle, "time_to_live", cls, 0L)).longValue();
        conditionalUserProperty.f53794k = (String) zzgn.m65766a(bundle, "expired_event_name", cls2, (Object) null);
        conditionalUserProperty.f53795l = (Bundle) zzgn.m65766a(bundle, "expired_event_params", Bundle.class, (Object) null);
        conditionalUserProperty.f53797n = ((Boolean) zzgn.m65766a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        conditionalUserProperty.f53796m = ((Long) zzgn.m65766a(bundle, "creation_timestamp", cls, 0L)).longValue();
        conditionalUserProperty.f53798o = ((Long) zzgn.m65766a(bundle, "triggered_timestamp", cls, 0L)).longValue();
        return conditionalUserProperty;
    }

    /* renamed from: c */
    public static String m74476c(String str) {
        String a = zzgo.m65768a(str);
        return a != null ? a : str;
    }

    /* renamed from: d */
    public static void m74477d(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0077  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m74478e(java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
        /*
            java.lang.String r0 = "_cmp"
            boolean r5 = r0.equals(r5)
            r0 = 1
            if (r5 != 0) goto L_0x000a
            return r0
        L_0x000a:
            boolean r5 = m74482i(r4)
            r1 = 0
            if (r5 != 0) goto L_0x0012
            return r1
        L_0x0012:
            if (r6 != 0) goto L_0x0015
            return r1
        L_0x0015:
            java.util.List r5 = f53808d
            java.util.Iterator r5 = r5.iterator()
        L_0x001b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r6.containsKey(r2)
            if (r2 == 0) goto L_0x001b
            return r1
        L_0x002e:
            int r5 = r4.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r5 == r2) goto L_0x0057
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r5 == r2) goto L_0x004d
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r5 == r2) goto L_0x0043
            goto L_0x0061
        L_0x0043:
            java.lang.String r5 = "fiam"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0061
            r4 = 2
            goto L_0x0062
        L_0x004d:
            java.lang.String r5 = "fdl"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0061
            r4 = 1
            goto L_0x0062
        L_0x0057:
            java.lang.String r5 = "fcm"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0061
            r4 = 0
            goto L_0x0062
        L_0x0061:
            r4 = -1
        L_0x0062:
            java.lang.String r5 = "_cis"
            if (r4 == 0) goto L_0x0077
            if (r4 == r0) goto L_0x0071
            if (r4 == r3) goto L_0x006b
            return r1
        L_0x006b:
            java.lang.String r4 = "fiam_integration"
            r6.putString(r5, r4)
            return r0
        L_0x0071:
            java.lang.String r4 = "fdl_integration"
            r6.putString(r5, r4)
            return r0
        L_0x0077:
            java.lang.String r4 = "fcm_integration"
            r6.putString(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.connector.internal.zzc.m74478e(java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }

    /* renamed from: f */
    public static boolean m74479f(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        String str;
        if (conditionalUserProperty == null || (str = conditionalUserProperty.f53784a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = conditionalUserProperty.f53786c;
        if ((obj != null && zzid.m65897a(obj) == null) || !m74482i(str) || !m74483j(str, conditionalUserProperty.f53785b)) {
            return false;
        }
        String str2 = conditionalUserProperty.f53794k;
        if (str2 != null && (!m74480g(str2, conditionalUserProperty.f53795l) || !m74478e(str, conditionalUserProperty.f53794k, conditionalUserProperty.f53795l))) {
            return false;
        }
        String str3 = conditionalUserProperty.f53791h;
        if (str3 != null && (!m74480g(str3, conditionalUserProperty.f53792i) || !m74478e(str, conditionalUserProperty.f53791h, conditionalUserProperty.f53792i))) {
            return false;
        }
        String str4 = conditionalUserProperty.f53789f;
        if (str4 == null) {
            return true;
        }
        if (m74480g(str4, conditionalUserProperty.f53790g) && m74478e(str, conditionalUserProperty.f53789f, conditionalUserProperty.f53790g)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m74480g(String str, Bundle bundle) {
        if (f53806b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        for (String containsKey : f53808d) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m74481h(String str) {
        return !f53805a.contains(str);
    }

    /* renamed from: i */
    public static boolean m74482i(String str) {
        return !f53807c.contains(str);
    }

    /* renamed from: j */
    public static boolean m74483j(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f53809e.contains(str2)) {
            return false;
        }
        for (String matches : f53810f) {
            if (str2.matches(matches)) {
                return false;
            }
        }
        return true;
    }
}
