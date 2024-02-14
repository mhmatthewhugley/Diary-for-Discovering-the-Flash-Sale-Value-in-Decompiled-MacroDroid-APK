package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

class HeartBeatInfoStorage {

    /* renamed from: a */
    private final SharedPreferences f54814a;

    public HeartBeatInfoStorage(Context context, String str) {
        this.f54814a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    private synchronized void m76557a() {
        long j = this.f54814a.getLong("fire-count", 0);
        String str = null;
        String str2 = "";
        for (Map.Entry next : this.f54814a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String str3 : (Set) next.getValue()) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = (String) next.getKey();
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f54814a.getStringSet(str2, new HashSet()));
        hashSet.remove(str);
        this.f54814a.edit().putStringSet(str2, hashSet).putLong("fire-count", j - 1).commit();
    }

    /* renamed from: d */
    private synchronized String m76558d(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    /* renamed from: e */
    private synchronized String m76559e(String str) {
        for (Map.Entry next : this.f54814a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String equals : (Set) next.getValue()) {
                    if (str.equals(equals)) {
                        return (String) next.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m76560h(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.m76559e(r5)     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r4)
            return
        L_0x0009:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences r2 = r4.f54814a     // Catch:{ all -> 0x003f }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x003f }
            r3.<init>()     // Catch:{ all -> 0x003f }
            java.util.Set r2 = r2.getStringSet(r0, r3)     // Catch:{ all -> 0x003f }
            r1.<init>(r2)     // Catch:{ all -> 0x003f }
            r1.remove(r5)     // Catch:{ all -> 0x003f }
            boolean r5 = r1.isEmpty()     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0030
            android.content.SharedPreferences r5 = r4.f54814a     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.remove(r0)     // Catch:{ all -> 0x003f }
            r5.commit()     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0030:
            android.content.SharedPreferences r5 = r4.f54814a     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.putStringSet(r0, r1)     // Catch:{ all -> 0x003f }
            r5.commit()     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r4)
            return
        L_0x003f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.heartbeatinfo.HeartBeatInfoStorage.m76560h(java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo63205b() {
        SharedPreferences.Editor edit = this.f54814a.edit();
        for (Map.Entry next : this.f54814a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                edit.remove((String) next.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized List<HeartBeatResult> mo63206c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry next : this.f54814a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                arrayList.add(HeartBeatResult.m76569a((String) next.getKey(), new ArrayList((Set) next.getValue())));
            }
        }
        mo63212l(System.currentTimeMillis());
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized boolean mo63207f(long j, long j2) {
        return m76558d(j).equals(m76558d(j2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized void mo63208g() {
        String d = m76558d(System.currentTimeMillis());
        this.f54814a.edit().putString("last-used-date", d).commit();
        m76560h(d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized boolean mo63209i(long j) {
        return mo63210j("fire-global", j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public synchronized boolean mo63210j(String str, long j) {
        if (!this.f54814a.contains(str)) {
            this.f54814a.edit().putLong(str, j).commit();
            return true;
        } else if (mo63207f(this.f54814a.getLong(str, -1), j)) {
            return false;
        } else {
            this.f54814a.edit().putLong(str, j).commit();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized void mo63211k(long j, String str) {
        String d = m76558d(j);
        if (!this.f54814a.getString("last-used-date", "").equals(d)) {
            long j2 = this.f54814a.getLong("fire-count", 0);
            if (j2 + 1 == 30) {
                m76557a();
                j2 = this.f54814a.getLong("fire-count", 0);
            }
            HashSet hashSet = new HashSet(this.f54814a.getStringSet(str, new HashSet()));
            hashSet.add(d);
            this.f54814a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", d).commit();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public synchronized void mo63212l(long j) {
        this.f54814a.edit().putLong("fire-global", j).commit();
    }
}
