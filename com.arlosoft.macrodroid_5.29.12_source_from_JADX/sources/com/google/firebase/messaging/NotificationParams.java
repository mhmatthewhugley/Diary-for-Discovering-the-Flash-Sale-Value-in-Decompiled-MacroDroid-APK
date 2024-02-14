package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;

public class NotificationParams {
    @NonNull

    /* renamed from: a */
    private final Bundle f55013a;

    public NotificationParams(@NonNull Bundle bundle) {
        Objects.requireNonNull(bundle, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        this.f55013a = new Bundle(bundle);
    }

    /* renamed from: d */
    private static int m76956d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: s */
    private static boolean m76957s(String str) {
        return str.startsWith("google.c.a.") || str.equals(TypedValues.Transition.S_FROM);
    }

    /* renamed from: t */
    public static boolean m76958t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(m76960v("gcm.n.e")));
    }

    /* renamed from: u */
    private static boolean m76959u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    /* renamed from: v */
    private static String m76960v(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: w */
    private String m76961w(String str) {
        if (!this.f55013a.containsKey(str) && str.startsWith("gcm.n.")) {
            String v = m76960v(str);
            if (this.f55013a.containsKey(v)) {
                return v;
            }
        }
        return str;
    }

    /* renamed from: z */
    private static String m76962z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* renamed from: a */
    public boolean mo63372a(String str) {
        String p = mo63386p(str);
        return "1".equals(p) || Boolean.parseBoolean(p);
    }

    /* renamed from: b */
    public Integer mo63373b(String str) {
        String p = mo63386p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m76962z(str) + "(" + p + ") into an int");
            return null;
        }
    }

    @Nullable
    /* renamed from: c */
    public JSONArray mo63374c(String str) {
        String p = mo63386p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return new JSONArray(p);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + m76962z(str) + ": " + p + ", falling back to default");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: e */
    public int[] mo63375e() {
        JSONArray c = mo63374c("gcm.n.light_settings");
        if (c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c.length() == 3) {
                iArr[0] = m76956d(c.optString(0));
                iArr[1] = c.optInt(1);
                iArr[2] = c.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c + ". Skipping setting LightSettings");
            return null;
        } catch (IllegalArgumentException e) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c + ". " + e.getMessage() + ". Skipping setting LightSettings");
            return null;
        }
    }

    @Nullable
    /* renamed from: f */
    public Uri mo63376f() {
        String p = mo63386p("gcm.n.link_android");
        if (TextUtils.isEmpty(p)) {
            p = mo63386p("gcm.n.link");
        }
        if (!TextUtils.isEmpty(p)) {
            return Uri.parse(p);
        }
        return null;
    }

    @Nullable
    /* renamed from: g */
    public Object[] mo63377g(String str) {
        JSONArray c = mo63374c(str + "_loc_args");
        if (c == null) {
            return null;
        }
        int length = c.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = c.optString(i);
        }
        return strArr;
    }

    @Nullable
    /* renamed from: h */
    public String mo63378h(String str) {
        return mo63386p(str + "_loc_key");
    }

    @Nullable
    /* renamed from: i */
    public String mo63379i(Resources resources, String str, String str2) {
        String h = mo63378h(str2);
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        int identifier = resources.getIdentifier(h, TypedValues.Custom.S_STRING, str);
        if (identifier == 0) {
            Log.w("NotificationParams", m76962z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] g = mo63377g(str2);
        if (g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + m76962z(str2) + ": " + Arrays.toString(g) + " Default value will be used.", e);
            return null;
        }
    }

    /* renamed from: j */
    public Long mo63380j(String str) {
        String p = mo63386p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(p));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m76962z(str) + "(" + p + ") into a long");
            return null;
        }
    }

    /* renamed from: k */
    public String mo63381k() {
        return mo63386p("gcm.n.android_channel_id");
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: l */
    public Integer mo63382l() {
        Integer b = mo63373b("gcm.n.notification_count");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= 0) {
            return b;
        }
        Log.w("FirebaseMessaging", "notificationCount is invalid: " + b + ". Skipping setting notificationCount.");
        return null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: m */
    public Integer mo63383m() {
        Integer b = mo63373b("gcm.n.notification_priority");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -2 && b.intValue() <= 2) {
            return b;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + b + ". Skipping setting notificationPriority.");
        return null;
    }

    /* renamed from: n */
    public String mo63384n(Resources resources, String str, String str2) {
        String p = mo63386p(str2);
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return mo63379i(resources, str, str2);
    }

    @Nullable
    /* renamed from: o */
    public String mo63385o() {
        String p = mo63386p("gcm.n.sound2");
        return TextUtils.isEmpty(p) ? mo63386p("gcm.n.sound") : p;
    }

    /* renamed from: p */
    public String mo63386p(String str) {
        return this.f55013a.getString(m76961w(str));
    }

    @Nullable
    /* renamed from: q */
    public long[] mo63387q() {
        JSONArray c = mo63374c("gcm.n.vibrate_timings");
        if (c == null) {
            return null;
        }
        try {
            if (c.length() > 1) {
                int length = c.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = c.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + c + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer mo63388r() {
        Integer b = mo63373b("gcm.n.visibility");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -1 && b.intValue() <= 1) {
            return b;
        }
        Log.w("NotificationParams", "visibility is invalid: " + b + ". Skipping setting visibility.");
        return null;
    }

    /* renamed from: x */
    public Bundle mo63389x() {
        Bundle bundle = new Bundle(this.f55013a);
        for (String str : this.f55013a.keySet()) {
            if (!m76957s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: y */
    public Bundle mo63390y() {
        Bundle bundle = new Bundle(this.f55013a);
        for (String str : this.f55013a.keySet()) {
            if (m76959u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
