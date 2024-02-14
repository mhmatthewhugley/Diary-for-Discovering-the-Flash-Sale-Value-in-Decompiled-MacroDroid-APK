package p344o6;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o6.b */
/* compiled from: DeviceName */
public class C15804b {

    /* renamed from: a */
    private static Context f65212a;

    /* renamed from: o6.b$b */
    /* compiled from: DeviceName */
    public static final class C15806b {
        @Deprecated

        /* renamed from: a */
        public final String f65213a;

        /* renamed from: b */
        public final String f65214b;

        /* renamed from: c */
        public final String f65215c;

        /* renamed from: d */
        public final String f65216d;

        /* renamed from: a */
        public String mo75574a() {
            if (!TextUtils.isEmpty(this.f65214b)) {
                return this.f65214b;
            }
            return C15804b.m95362b(this.f65216d);
        }

        public C15806b(String str, String str2, String str3) {
            this((String) null, str, str2, str3);
        }

        public C15806b(String str, String str2, String str3, String str4) {
            this.f65213a = str;
            this.f65214b = str2;
            this.f65215c = str3;
            this.f65216d = str4;
        }

        private C15806b(JSONObject jSONObject) throws JSONException {
            this.f65213a = jSONObject.getString("manufacturer");
            this.f65214b = jSONObject.getString("market_name");
            this.f65215c = jSONObject.getString("codename");
            this.f65216d = jSONObject.getString("model");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m95362b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (char c : charArray) {
            if (!z || !Character.isLetter(c)) {
                if (Character.isWhitespace(c)) {
                    z = true;
                }
                sb.append(c);
            } else {
                sb.append(Character.toUpperCase(c));
                z = false;
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    private static Context m95363c() {
        Context context = f65212a;
        if (context != null) {
            return context;
        }
        try {
            return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            try {
                return (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke((Object) null, (Object[]) null);
            } catch (Exception unused2) {
                throw new RuntimeException("DeviceName must be initialized before usage.");
            }
        }
    }

    @WorkerThread
    /* renamed from: d */
    public static C15806b m95364d(Context context) {
        return m95365e(context.getApplicationContext(), Build.DEVICE, Build.MODEL);
    }

    @WorkerThread
    /* renamed from: e */
    public static C15806b m95365e(Context context, String str, String str2) {
        C15803a aVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_names", 0);
        String format = String.format("%s:%s", new Object[]{str, str2});
        String string = sharedPreferences.getString(format, (String) null);
        if (string != null) {
            try {
                return new C15806b(new JSONObject(string));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        try {
            aVar = new C15803a(context);
            C15806b e2 = aVar.mo75571e(str, str2);
            if (e2 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("manufacturer", e2.f65213a);
                jSONObject.put("codename", e2.f65215c);
                jSONObject.put("model", e2.f65216d);
                jSONObject.put("market_name", e2.f65214b);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(format, jSONObject.toString());
                edit.apply();
                aVar.close();
                return e2;
            }
            aVar.close();
            if (!str.equals(Build.DEVICE) || !Build.MODEL.equals(str2)) {
                return new C15806b((String) null, (String) null, str, str2);
            }
            return new C15806b(Build.MANUFACTURER, str, str, str2);
        } catch (Exception e3) {
            e3.printStackTrace();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: f */
    public static String m95366f() {
        String str = Build.DEVICE;
        String str2 = Build.MODEL;
        return m95367g(str, str2, m95362b(str2));
    }

    /* renamed from: g */
    public static String m95367g(String str, String str2, String str3) {
        String str4 = m95365e(m95363c(), str, str2).f65214b;
        return str4 == null ? str3 : str4;
    }
}
