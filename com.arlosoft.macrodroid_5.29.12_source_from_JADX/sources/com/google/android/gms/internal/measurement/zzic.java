package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzic implements zzhk {
    @GuardedBy("SharedPreferencesLoader.class")

    /* renamed from: b */
    private static final Map f41518b = new ArrayMap();

    /* renamed from: a */
    private final SharedPreferences f41519a;

    @Nullable
    /* renamed from: a */
    static zzic m60298a(Context context, String str, Runnable runnable) {
        zzic zzic;
        if (!zzhb.m60259b()) {
            synchronized (zzic.class) {
                zzic = (zzic) f41518b.get((Object) null);
                if (zzic == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return zzic;
        }
        throw null;
    }

    /* renamed from: b */
    static synchronized void m60299b() {
        synchronized (zzic.class) {
            Map map = f41518b;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = ((zzic) it.next()).f41519a;
                throw null;
            }
        }
    }

    @Nullable
    /* renamed from: t */
    public final Object mo51268t(String str) {
        throw null;
    }
}
