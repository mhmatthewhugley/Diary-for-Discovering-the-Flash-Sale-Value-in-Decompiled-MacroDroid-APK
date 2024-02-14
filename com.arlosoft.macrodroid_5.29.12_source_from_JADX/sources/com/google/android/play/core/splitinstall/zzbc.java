package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.internal.zzam;
import com.google.android.play.core.internal.zzas;
import com.google.android.play.core.internal.zzce;
import com.google.android.play.core.internal.zzch;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzbc {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final zzag f51916c = new zzag("SplitInstallService");

    /* renamed from: d */
    private static final Intent f51917d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f51918a;
    @VisibleForTesting
    @Nullable

    /* renamed from: b */
    zzas f51919b;

    zzbc(Context context, String str) {
        this.f51918a = str;
        if (zzch.m70928b(context)) {
            this.f51919b = new zzas(zzce.m70925a(context), f51916c, "SplitInstallService", f51917d, zzak.f51889a, (zzam) null);
        }
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ Bundle m71210a() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11003);
        return bundle;
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ ArrayList m71213d(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("language", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ ArrayList m71214e(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }
}
