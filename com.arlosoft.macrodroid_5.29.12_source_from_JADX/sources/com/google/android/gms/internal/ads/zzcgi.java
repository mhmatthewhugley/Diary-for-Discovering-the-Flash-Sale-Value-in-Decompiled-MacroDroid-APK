package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import androidx.webkit.ProxyConfig;
import com.arlosoft.macrodroid.geofences.GeofenceInfo;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcgi {

    /* renamed from: b */
    public static final Handler f28421b = new zzfpz(Looper.getMainLooper());

    /* renamed from: c */
    private static final String f28422c = AdView.class.getName();

    /* renamed from: d */
    private static final String f28423d = InterstitialAd.class.getName();

    /* renamed from: e */
    private static final String f28424e = AdManagerAdView.class.getName();

    /* renamed from: f */
    private static final String f28425f = AdManagerInterstitialAd.class.getName();

    /* renamed from: g */
    private static final String f28426g = SearchAdView.class.getName();

    /* renamed from: h */
    private static final String f28427h = AdLoader.class.getName();

    /* renamed from: a */
    private float f28428a = -1.0f;

    /* renamed from: a */
    private final void m45173a(JSONObject jSONObject, String str, @Nullable Object obj) throws JSONException {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27231r)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, mo43549h((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, mo43550i((Map) obj));
        } else if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), m45189y((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m45189y(Arrays.asList((Object[]) obj)));
        } else {
            int i = 0;
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    numArr = new Integer[0];
                } else {
                    int length = iArr.length;
                    Integer[] numArr2 = new Integer[length];
                    while (i < length) {
                        numArr2[i] = Integer.valueOf(iArr[i]);
                        i++;
                    }
                    numArr = numArr2;
                }
                jSONObject.put(str, mo43548g(numArr));
            } else if (obj instanceof double[]) {
                double[] dArr2 = (double[]) obj;
                if (dArr2 == null) {
                    dArr = new Double[0];
                } else {
                    int length2 = dArr2.length;
                    Double[] dArr3 = new Double[length2];
                    while (i < length2) {
                        dArr3[i] = Double.valueOf(dArr2[i]);
                        i++;
                    }
                    dArr = dArr3;
                }
                jSONObject.put(str, mo43548g(dArr));
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    lArr = new Long[0];
                } else {
                    int length3 = jArr.length;
                    Long[] lArr2 = new Long[length3];
                    while (i < length3) {
                        lArr2[i] = Long.valueOf(jArr[i]);
                        i++;
                    }
                    lArr = lArr2;
                }
                jSONObject.put(str, mo43548g(lArr));
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    boolArr = new Boolean[0];
                } else {
                    int length4 = zArr.length;
                    Boolean[] boolArr2 = new Boolean[length4];
                    while (i < length4) {
                        boolArr2[i] = Boolean.valueOf(zArr[i]);
                        i++;
                    }
                    boolArr = boolArr2;
                }
                jSONObject.put(str, mo43548g(boolArr));
            } else {
                jSONObject.put(str, obj);
            }
        }
    }

    /* renamed from: b */
    private static final void m45174b(ViewGroup viewGroup, zzq zzq, @Nullable String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int w = m45187w(context, 3);
            frameLayout.addView(textView, new FrameLayout.LayoutParams(zzq.f2030o - w, zzq.f2027d - w, 17));
            viewGroup.addView(frameLayout, zzq.f2030o, zzq.f2027d);
        }
    }

    /* renamed from: d */
    public static String m45175d() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_MD5);
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    @Nullable
    /* renamed from: e */
    public static String m45176e(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_MD5);
                instance.update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i++;
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: f */
    public static Throwable m45177f(Throwable th) {
        if (((Boolean) zzbla.f27488f.mo42728e()).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m45178n(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                        arrayList.add(stackTraceElement);
                    } else {
                        arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    }
                }
            }
            if (z) {
                if (th2 == null) {
                    th2 = new Throwable(th3.getMessage());
                } else {
                    th2 = new Throwable(th3.getMessage(), th2);
                }
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    @VisibleForTesting
    /* renamed from: n */
    public static boolean m45178n(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzbla.f27486d.mo42728e());
    }

    /* renamed from: o */
    public static final int m45179o(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: p */
    public static final String m45180p(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String str2;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className = stackTraceElement.getClassName();
            if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!f28422c.equalsIgnoreCase(className) && !f28423d.equalsIgnoreCase(className) && !f28424e.equalsIgnoreCase(className) && !f28425f.equalsIgnoreCase(className) && !f28426g.equalsIgnoreCase(className) && !f28427h.equalsIgnoreCase(className))) {
                i2 = i;
            }
        }
        str2 = stackTraceElementArr[i].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                int i3 = 2;
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                        str = sb.toString();
                    } else {
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                        i3 = i4;
                    }
                }
                str = sb.toString();
            }
            if (str2 == null || str2.contains(str)) {
                return null;
            }
            return str2;
        }
        return null;
    }

    /* renamed from: q */
    public static final boolean m45181q() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith(GeofenceInfo.GEOFENCE_GENERIC_ID);
        }
        String str = Build.FINGERPRINT;
        return str.contains(GeofenceInfo.GEOFENCE_GENERIC_ID) || str.contains("emulator");
    }

    /* renamed from: r */
    public static final boolean m45182r(Context context, int i) {
        return GoogleApiAvailabilityLight.m3542h().mo21157j(context, i) == 0;
    }

    /* renamed from: s */
    public static final boolean m45183s(Context context) {
        int j = GoogleApiAvailabilityLight.m3542h().mo21157j(context, GooglePlayServicesUtilLight.f3065a);
        return j == 0 || j == 2;
    }

    /* renamed from: t */
    public static final boolean m45184t() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: u */
    public static final int m45185u(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    /* renamed from: v */
    public static final void m45186v(Context context, @Nullable String str, String str2, Bundle bundle, boolean z, zzcgh zzcgh) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = GoogleApiAvailabilityLight.m3542h().mo21171b(context) + ".223104000";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme(ProxyConfig.MATCH_HTTPS).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzcgh.mo20399o(appendQueryParameter.toString());
    }

    /* renamed from: w */
    public static final int m45187w(Context context, int i) {
        return m45179o(context.getResources().getDisplayMetrics(), i);
    }

    @Nullable
    /* renamed from: x */
    public static final String m45188x(Context context) {
        String str;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Settings.Secure.getString(contentResolver, "android_id");
        }
        if (str == null || m45181q()) {
            str = "emulator";
        }
        return m45176e(str);
    }

    /* renamed from: y */
    private final JSONArray m45189y(Collection collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object z : collection) {
            m45190z(jSONArray, z);
        }
        return jSONArray;
    }

    /* renamed from: z */
    private final void m45190z(JSONArray jSONArray, @Nullable Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(mo43549h((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(mo43550i((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(m45189y((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(mo43548g((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    /* renamed from: c */
    public final int mo43547c(Context context, int i) {
        if (this.f28428a < 0.0f) {
            synchronized (this) {
                if (this.f28428a < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f28428a = displayMetrics.density;
                }
            }
        }
        return Math.round(((float) i) / this.f28428a);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: g */
    public final JSONArray mo43548g(Object[] objArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object z : objArr) {
            m45190z(jSONArray, z);
        }
        return jSONArray;
    }

    /* renamed from: h */
    public final JSONObject mo43549h(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m45173a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: i */
    public final JSONObject mo43550i(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m45173a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e.getMessage())));
        }
    }

    /* renamed from: j */
    public final JSONObject mo43551j(@Nullable Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return mo43549h(bundle);
        } catch (JSONException e) {
            zzcgp.m45227e("Error converting Bundle to JSON", e);
            return null;
        }
    }

    /* renamed from: k */
    public final void mo43552k(ViewGroup viewGroup, zzq zzq, @Nullable String str, @Nullable String str2) {
        if (str2 != null) {
            zzcgp.m45229g(str2);
        }
        m45174b(viewGroup, zzq, str, SupportMenu.CATEGORY_MASK, ViewCompat.MEASURED_STATE_MASK);
    }

    /* renamed from: l */
    public final void mo43553l(ViewGroup viewGroup, zzq zzq, @Nullable String str) {
        m45174b(viewGroup, zzq, "Ads by Google", ViewCompat.MEASURED_STATE_MASK, -1);
    }

    /* renamed from: m */
    public final void mo43554m(Context context, @Nullable String str, String str2, Bundle bundle, boolean z) {
        m45186v(context, str, "gmob-apps", bundle, true, new zzcgf(this));
    }
}
