package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import androidx.webkit.ProxyConfig;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

class Store {

    /* renamed from: a */
    final SharedPreferences f55030a;

    static class Token {

        /* renamed from: d */
        private static final long f55031d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        final String f55032a;

        /* renamed from: b */
        final String f55033b;

        /* renamed from: c */
        final long f55034c;

        private Token(String str, String str2, long j) {
            this.f55032a = str;
            this.f55033b = str2;
            this.f55034c = j;
        }

        /* renamed from: a */
        static String m77025a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e);
                return null;
            }
        }

        /* renamed from: c */
        static Token m77026c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new Token(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new Token(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e);
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo63413b(String str) {
            return System.currentTimeMillis() > this.f55034c + f55031d || !str.equals(this.f55033b);
        }
    }

    public Store(Context context) {
        this.f55030a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m77019a(context, "com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    private void m77019a(Context context, String str) {
        File file = new File(ContextCompat.getNoBackupFilesDir(context), str);
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !mo63411e()) {
                    Log.i("FirebaseMessaging", "App restored, clearing state");
                    mo63409c();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error creating file in no backup dir: ");
                    sb.append(e.getMessage());
                }
            }
        }
    }

    /* renamed from: b */
    private String m77020b(String str, String str2) {
        return str + "|T|" + str2 + "|" + ProxyConfig.MATCH_ALL_SCHEMES;
    }

    /* renamed from: c */
    public synchronized void mo63409c() {
        this.f55030a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized Token mo63410d(String str, String str2) {
        return Token.m77026c(this.f55030a.getString(m77020b(str, str2), (String) null));
    }

    /* renamed from: e */
    public synchronized boolean mo63411e() {
        return this.f55030a.getAll().isEmpty();
    }

    /* renamed from: f */
    public synchronized void mo63412f(String str, String str2, String str3, String str4) {
        String a = Token.m77025a(str3, str4, System.currentTimeMillis());
        if (a != null) {
            SharedPreferences.Editor edit = this.f55030a.edit();
            edit.putString(m77020b(str, str2), a);
            edit.commit();
        }
    }
}
