package com.google.android.play.core.splitinstall;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzaa implements SplitInstallManager {

    /* renamed from: a */
    private final zzbc f51874a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final zzx f51875b;

    /* renamed from: c */
    private final zzs f51876c;

    /* renamed from: d */
    private final zzbe f51877d;

    /* renamed from: e */
    private final Handler f51878e = new Handler(Looper.getMainLooper());

    zzaa(zzbc zzbc, zzx zzx, zzs zzs, zzbe zzbe) {
        this.f51874a = zzbc;
        this.f51875b = zzx;
        this.f51876c = zzs;
        this.f51877d = zzbe;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static List m71177c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList;
    }
}
