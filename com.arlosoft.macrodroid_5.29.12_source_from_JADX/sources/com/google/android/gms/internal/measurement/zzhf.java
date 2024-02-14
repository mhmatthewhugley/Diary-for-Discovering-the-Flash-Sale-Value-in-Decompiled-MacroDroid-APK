package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzhf implements zzhk {
    @GuardedBy("ConfigurationContentLoader.class")

    /* renamed from: h */
    private static final Map f41475h = new ArrayMap();

    /* renamed from: i */
    public static final String[] f41476i = {"key", "value"};

    /* renamed from: a */
    private final ContentResolver f41477a;

    /* renamed from: b */
    private final Uri f41478b;

    /* renamed from: c */
    private final Runnable f41479c;

    /* renamed from: d */
    private final ContentObserver f41480d;

    /* renamed from: e */
    private final Object f41481e = new Object();

    /* renamed from: f */
    private volatile Map f41482f;
    @GuardedBy("this")

    /* renamed from: g */
    private final List f41483g = new ArrayList();

    private zzhf(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzhe zzhe = new zzhe(this, (Handler) null);
        this.f41480d = zzhe;
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.f41477a = contentResolver;
        this.f41478b = uri;
        this.f41479c = runnable;
        contentResolver.registerContentObserver(uri, false, zzhe);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0016 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.zzhf m60262a(android.content.ContentResolver r4, android.net.Uri r5, java.lang.Runnable r6) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.zzhf> r0 = com.google.android.gms.internal.measurement.zzhf.class
            monitor-enter(r0)
            java.util.Map r1 = f41475h     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.measurement.zzhf r2 = (com.google.android.gms.internal.measurement.zzhf) r2     // Catch:{ all -> 0x0018 }
            if (r2 != 0) goto L_0x0016
            com.google.android.gms.internal.measurement.zzhf r3 = new com.google.android.gms.internal.measurement.zzhf     // Catch:{ SecurityException -> 0x0016 }
            r3.<init>(r4, r5, r6)     // Catch:{ SecurityException -> 0x0016 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0015 }
        L_0x0015:
            r2 = r3
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r2
        L_0x0018:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhf.m60262a(android.content.ContentResolver, android.net.Uri, java.lang.Runnable):com.google.android.gms.internal.measurement.zzhf");
    }

    /* renamed from: d */
    static synchronized void m60263d() {
        synchronized (zzhf.class) {
            for (zzhf zzhf : f41475h.values()) {
                zzhf.f41477a.unregisterContentObserver(zzhf.f41480d);
            }
            f41475h.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final Map mo51265b() {
        Map map;
        Map map2 = this.f41482f;
        if (map2 == null) {
            synchronized (this.f41481e) {
                map2 = this.f41482f;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) zzhi.m60269a(new zzhd(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        try {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    this.f41482f = map;
                    map2 = map;
                }
            }
        }
        if (map2 != null) {
            return map2;
        }
        return Collections.emptyMap();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Map mo51266c() {
        Map map;
        Cursor query = this.f41477a.query(this.f41478b, f41476i, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new ArrayMap(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }

    /* renamed from: e */
    public final void mo51267e() {
        synchronized (this.f41481e) {
            this.f41482f = null;
            this.f41479c.run();
        }
        synchronized (this) {
            for (zzhg zza : this.f41483g) {
                zza.zza();
            }
        }
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ Object mo51268t(String str) {
        return (String) mo51265b().get(str);
    }
}
