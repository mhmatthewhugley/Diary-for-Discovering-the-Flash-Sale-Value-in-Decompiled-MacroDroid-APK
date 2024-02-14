package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzj {

    /* renamed from: a */
    private static final zzj f4668a = new zzj();

    private zzj() {
    }

    /* renamed from: b */
    public static zzj m6258b() {
        return f4668a;
    }

    /* renamed from: f */
    private static void m6259f(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String remove : sharedPreferences.getAll().keySet()) {
            edit.remove(remove);
        }
        edit.apply();
    }

    /* renamed from: g */
    private static final SharedPreferences m6260g(Context context, String str) {
        return context.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", new Object[]{str}), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006e, code lost:
        return null;
     */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.firebase.auth.internal.zzi mo22793a(android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            com.google.android.gms.common.internal.Preconditions.m4484g(r12)     // Catch:{ all -> 0x006f }
            com.google.android.gms.common.internal.Preconditions.m4484g(r13)     // Catch:{ all -> 0x006f }
            android.content.SharedPreferences r11 = m6260g(r11, r12)     // Catch:{ all -> 0x006f }
            r12 = 1
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ all -> 0x006f }
            r1 = 0
            r0[r1] = r13     // Catch:{ all -> 0x006f }
            java.lang.String r2 = "com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID"
            java.lang.String r0 = java.lang.String.format(r2, r0)     // Catch:{ all -> 0x006f }
            java.lang.Object[] r2 = new java.lang.Object[r12]     // Catch:{ all -> 0x006f }
            r2[r1] = r13     // Catch:{ all -> 0x006f }
            java.lang.String r3 = "com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION"
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch:{ all -> 0x006f }
            java.lang.Object[] r3 = new java.lang.Object[r12]     // Catch:{ all -> 0x006f }
            r3[r1] = r13     // Catch:{ all -> 0x006f }
            java.lang.String r4 = "com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x006f }
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ all -> 0x006f }
            r12[r1] = r13     // Catch:{ all -> 0x006f }
            java.lang.String r13 = "com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME"
            java.lang.String r12 = java.lang.String.format(r13, r12)     // Catch:{ all -> 0x006f }
            r13 = 0
            java.lang.String r5 = r11.getString(r0, r13)     // Catch:{ all -> 0x006f }
            java.lang.String r6 = r11.getString(r2, r13)     // Catch:{ all -> 0x006f }
            java.lang.String r7 = r11.getString(r3, r13)     // Catch:{ all -> 0x006f }
            java.lang.String r1 = "com.google.firebase.auth.api.gms.config.tenant.id"
            java.lang.String r8 = r11.getString(r1, r13)     // Catch:{ all -> 0x006f }
            java.lang.String r9 = r11.getString(r12, r13)     // Catch:{ all -> 0x006f }
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch:{ all -> 0x006f }
            r11.remove(r0)     // Catch:{ all -> 0x006f }
            r11.remove(r2)     // Catch:{ all -> 0x006f }
            r11.remove(r3)     // Catch:{ all -> 0x006f }
            r11.remove(r12)     // Catch:{ all -> 0x006f }
            r11.apply()     // Catch:{ all -> 0x006f }
            if (r5 == 0) goto L_0x006d
            if (r6 == 0) goto L_0x006d
            if (r7 == 0) goto L_0x006d
            com.google.firebase.auth.internal.zzi r11 = new com.google.firebase.auth.internal.zzi     // Catch:{ all -> 0x006f }
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x006f }
            monitor-exit(r10)
            return r11
        L_0x006d:
            monitor-exit(r10)
            return r13
        L_0x006f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.zzj.mo22793a(android.content.Context, java.lang.String, java.lang.String):com.google.firebase.auth.internal.zzi");
    }

    @Nullable
    /* renamed from: c */
    public final synchronized String mo22794c(Context context, String str, String str2) {
        String string;
        String string2;
        Preconditions.m4484g(str);
        Preconditions.m4484g(str2);
        SharedPreferences g = m6260g(context, str);
        String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{str2});
        string = g.getString(format, (String) null);
        String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{str2});
        string2 = g.getString(format2, (String) null);
        SharedPreferences.Editor edit = g.edit();
        edit.remove(format);
        edit.remove(format2);
        edit.apply();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string2;
    }

    /* renamed from: d */
    public final synchronized void mo22795d(Context context, String str, String str2, String str3, String str4, String str5, @Nullable String str6, String str7) {
        Preconditions.m4484g(str);
        Preconditions.m4484g(str2);
        Preconditions.m4484g(str3);
        Preconditions.m4484g(str7);
        SharedPreferences g = m6260g(context, str);
        m6259f(g);
        SharedPreferences.Editor edit = g.edit();
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", new Object[]{str2}), str3);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{str2}), str4);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", new Object[]{str2}), str5);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{str2}), str7);
        edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", str6);
        edit.apply();
    }

    /* renamed from: e */
    public final synchronized void mo22796e(Context context, String str, String str2, String str3, String str4) {
        Preconditions.m4484g(str);
        Preconditions.m4484g(str2);
        SharedPreferences g = m6260g(context, str);
        m6259f(g);
        SharedPreferences.Editor edit = g.edit();
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{str2}), "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{str2}), str4);
        edit.apply();
    }
}
