package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcez {
    @GuardedBy("this")

    /* renamed from: a */
    private final Map f28331a = new HashMap();
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: b */
    public final List f28332b = new ArrayList();

    /* renamed from: c */
    private final Context f28333c;

    /* renamed from: d */
    private final zzcdw f28334d;

    zzcez(Context context, zzcdw zzcdw) {
        this.f28333c = context;
        this.f28334d = zzcdw;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo43451b(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.f28334d.mo43411e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo43452c(String str) {
        SharedPreferences sharedPreferences;
        if (!this.f28331a.containsKey(str)) {
            if ("__default__".equals(str)) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f28333c);
            } else {
                sharedPreferences = this.f28333c.getSharedPreferences(str, 0);
            }
            zzcey zzcey = new zzcey(this, str);
            this.f28331a.put(str, zzcey);
            sharedPreferences.registerOnSharedPreferenceChangeListener(zzcey);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo43453d(zzcex zzcex) {
        this.f28332b.add(zzcex);
    }
}
