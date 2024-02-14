package com.google.android.play.core.missingsplits;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import com.google.android.play.core.internal.zzag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zza {

    /* renamed from: c */
    private static final zzag f51734c = new zzag("MissingSplitsAppComponentsHelper");

    /* renamed from: a */
    private final Context f51735a;

    /* renamed from: b */
    private final PackageManager f51736b;

    zza(Context context, PackageManager packageManager) {
        this.f51735a = context;
        this.f51736b = packageManager;
    }

    /* renamed from: d */
    private final List m71037d() {
        try {
            ArrayList arrayList = new ArrayList();
            PackageInfo packageInfo = this.f51736b.getPackageInfo(this.f51735a.getPackageName(), 526);
            ProviderInfo[] providerInfoArr = packageInfo.providers;
            if (providerInfoArr != null) {
                Collections.addAll(arrayList, providerInfoArr);
            }
            ActivityInfo[] activityInfoArr = packageInfo.receivers;
            if (activityInfoArr != null) {
                Collections.addAll(arrayList, activityInfoArr);
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                Collections.addAll(arrayList, serviceInfoArr);
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            f51734c.mo59809e("Failed to resolve own package : %s", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: e */
    private final void m71038e(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ComponentInfo componentInfo = (ComponentInfo) it.next();
            this.f51736b.setComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name), i, 1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo59920a() {
        f51734c.mo59808d("Disabling all non-activity components", new Object[0]);
        m71038e(m71037d(), 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo59921b() {
        f51734c.mo59808d("Resetting enabled state of all non-activity components", new Object[0]);
        m71038e(m71037d(), 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo59922c() {
        for (ComponentInfo componentInfo : m71037d()) {
            if (this.f51736b.getComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name)) != 2) {
                f51734c.mo59805a("Not all non-activity components are disabled", new Object[0]);
                return false;
            }
        }
        f51734c.mo59805a("All non-activity components are disabled", new Object[0]);
        return true;
    }
}
