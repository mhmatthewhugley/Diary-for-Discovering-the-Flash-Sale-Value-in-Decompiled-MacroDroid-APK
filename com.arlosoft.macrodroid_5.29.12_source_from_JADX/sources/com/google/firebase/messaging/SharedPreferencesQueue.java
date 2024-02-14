package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

final class SharedPreferencesQueue {

    /* renamed from: a */
    private final SharedPreferences f55024a;

    /* renamed from: b */
    private final String f55025b;

    /* renamed from: c */
    private final String f55026c;
    @VisibleForTesting
    @GuardedBy("internalQueue")

    /* renamed from: d */
    final ArrayDeque<String> f55027d = new ArrayDeque<>();

    /* renamed from: e */
    private final Executor f55028e;
    @GuardedBy("internalQueue")

    /* renamed from: f */
    private boolean f55029f = false;

    private SharedPreferencesQueue(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f55024a = sharedPreferences;
        this.f55025b = str;
        this.f55026c = str2;
        this.f55028e = executor;
    }

    @GuardedBy("internalQueue")
    /* renamed from: c */
    private boolean m77010c(boolean z) {
        if (z && !this.f55029f) {
            m77014j();
        }
        return z;
    }

    @WorkerThread
    /* renamed from: d */
    static SharedPreferencesQueue m77011d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        SharedPreferencesQueue sharedPreferencesQueue = new SharedPreferencesQueue(sharedPreferences, str, str2, executor);
        sharedPreferencesQueue.m77012e();
        return sharedPreferencesQueue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        return;
     */
    @androidx.annotation.WorkerThread
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m77012e() {
        /*
            r6 = this;
            java.util.ArrayDeque<java.lang.String> r0 = r6.f55027d
            monitor-enter(r0)
            java.util.ArrayDeque<java.lang.String> r1 = r6.f55027d     // Catch:{ all -> 0x004a }
            r1.clear()     // Catch:{ all -> 0x004a }
            android.content.SharedPreferences r1 = r6.f55024a     // Catch:{ all -> 0x004a }
            java.lang.String r2 = r6.f55025b     // Catch:{ all -> 0x004a }
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ all -> 0x004a }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0048
            java.lang.String r2 = r6.f55026c     // Catch:{ all -> 0x004a }
            boolean r2 = r1.contains(r2)     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0021
            goto L_0x0048
        L_0x0021:
            java.lang.String r2 = r6.f55026c     // Catch:{ all -> 0x004a }
            r3 = -1
            java.lang.String[] r1 = r1.split(r2, r3)     // Catch:{ all -> 0x004a }
            int r2 = r1.length     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0032
            java.lang.String r2 = "FirebaseMessaging"
            java.lang.String r3 = "Corrupted queue. Please check the queue contents and item separator provided"
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x004a }
        L_0x0032:
            int r2 = r1.length     // Catch:{ all -> 0x004a }
            r3 = 0
        L_0x0034:
            if (r3 >= r2) goto L_0x0046
            r4 = r1[r3]     // Catch:{ all -> 0x004a }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x004a }
            if (r5 != 0) goto L_0x0043
            java.util.ArrayDeque<java.lang.String> r5 = r6.f55027d     // Catch:{ all -> 0x004a }
            r5.add(r4)     // Catch:{ all -> 0x004a }
        L_0x0043:
            int r3 = r3 + 1
            goto L_0x0034
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.SharedPreferencesQueue.m77012e():void");
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: i */
    public void m77013i() {
        synchronized (this.f55027d) {
            this.f55024a.edit().putString(this.f55025b, mo63408h()).commit();
        }
    }

    /* renamed from: j */
    private void m77014j() {
        this.f55028e.execute(new C11323x(this));
    }

    /* renamed from: b */
    public boolean mo63405b(@NonNull String str) {
        boolean c;
        if (TextUtils.isEmpty(str) || str.contains(this.f55026c)) {
            return false;
        }
        synchronized (this.f55027d) {
            c = m77010c(this.f55027d.add(str));
        }
        return c;
    }

    @Nullable
    /* renamed from: f */
    public String mo63406f() {
        String peek;
        synchronized (this.f55027d) {
            peek = this.f55027d.peek();
        }
        return peek;
    }

    /* renamed from: g */
    public boolean mo63407g(@Nullable Object obj) {
        boolean c;
        synchronized (this.f55027d) {
            c = m77010c(this.f55027d.remove(obj));
        }
        return c;
    }

    @GuardedBy("internalQueue")
    @NonNull
    /* renamed from: h */
    public String mo63408h() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f55027d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.f55026c);
        }
        return sb.toString();
    }
}
