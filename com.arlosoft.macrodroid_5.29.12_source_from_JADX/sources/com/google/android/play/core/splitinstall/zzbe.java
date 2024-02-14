package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import java.util.HashSet;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzbe {

    /* renamed from: a */
    private final Context f51921a;

    public zzbe(@NonNull Context context) {
        this.f51921a = context;
    }

    /* renamed from: c */
    private final SharedPreferences m71215c() {
        return this.f51921a.getSharedPreferences("playcore_split_install_internal", 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r1 = new java.util.HashSet();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set mo60007a() {
        /*
            r4 = this;
            java.lang.Class<com.google.android.play.core.splitinstall.zzbe> r0 = com.google.android.play.core.splitinstall.zzbe.class
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r4.m71215c()     // Catch:{ Exception -> 0x001c }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ Exception -> 0x001c }
            r2.<init>()     // Catch:{ Exception -> 0x001c }
            java.lang.String r3 = "modules_to_uninstall_if_emulated"
            java.util.Set r1 = r1.getStringSet(r3, r2)     // Catch:{ Exception -> 0x001c }
            if (r1 != 0) goto L_0x0021
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ Exception -> 0x001c }
            r1.<init>()     // Catch:{ Exception -> 0x001c }
            goto L_0x0021
        L_0x001a:
            r1 = move-exception
            goto L_0x0023
        L_0x001c:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x001a }
            r1.<init>()     // Catch:{ all -> 0x001a }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.zzbe.mo60007a():java.util.Set");
    }

    /* renamed from: b */
    public final void mo60008b() {
        synchronized (zzbe.class) {
            m71215c().edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }
}
