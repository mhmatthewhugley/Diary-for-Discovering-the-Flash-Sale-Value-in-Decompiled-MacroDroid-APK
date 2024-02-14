package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.ProxyConfig;
import com.google.firebase.FirebaseApp;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public class IidStore {

    /* renamed from: c */
    private static final String[] f54881c = {ProxyConfig.MATCH_ALL_SCHEMES, "FCM", KeyPropertiesCompact.BLOCK_MODE_GCM, ""};
    @GuardedBy("iidPrefs")

    /* renamed from: a */
    private final SharedPreferences f54882a;

    /* renamed from: b */
    private final String f54883b;

    public IidStore(@NonNull FirebaseApp firebaseApp) {
        this.f54882a = firebaseApp.mo61950l().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f54883b = m76669b(firebaseApp);
    }

    /* renamed from: a */
    private String m76668a(@NonNull String str, @NonNull String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: b */
    private static String m76669b(FirebaseApp firebaseApp) {
        String d = firebaseApp.mo61952p().mo61963d();
        if (d != null) {
            return d;
        }
        String c = firebaseApp.mo61952p().mo61962c();
        if (!c.startsWith("1:") && !c.startsWith("2:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    @Nullable
    /* renamed from: c */
    private static String m76670c(@NonNull PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: d */
    private String m76671d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: e */
    private PublicKey m76672e(String str) {
        try {
            return KeyFactory.getInstance(KeyPropertiesCompact.KEY_ALGORITHM_RSA).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    @Nullable
    /* renamed from: g */
    private String m76673g() {
        String string;
        synchronized (this.f54882a) {
            string = this.f54882a.getString("|S|id", (String) null);
        }
        return string;
    }

    @Nullable
    /* renamed from: h */
    private String m76674h() {
        synchronized (this.f54882a) {
            String string = this.f54882a.getString("|S||P|", (String) null);
            if (string == null) {
                return null;
            }
            PublicKey e = m76672e(string);
            if (e == null) {
                return null;
            }
            String c = m76670c(e);
            return c;
        }
    }

    @Nullable
    /* renamed from: f */
    public String mo63268f() {
        synchronized (this.f54882a) {
            String g = m76673g();
            if (g != null) {
                return g;
            }
            String h = m76674h();
            return h;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return r4;
     */
    @androidx.annotation.Nullable
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo63269i() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.f54882a
            monitor-enter(r0)
            java.lang.String[] r1 = f54881c     // Catch:{ all -> 0x0033 }
            int r2 = r1.length     // Catch:{ all -> 0x0033 }
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r3 >= r2) goto L_0x0031
            r5 = r1[r3]     // Catch:{ all -> 0x0033 }
            java.lang.String r6 = r7.f54883b     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = r7.m76668a(r6, r5)     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences r6 = r7.f54882a     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = r6.getString(r5, r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002e
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x0033 }
            if (r5 != 0) goto L_0x002e
            java.lang.String r1 = "{"
            boolean r1 = r4.startsWith(r1)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x002c
            java.lang.String r4 = r7.m76671d(r4)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.local.IidStore.mo63269i():java.lang.String");
    }
}
