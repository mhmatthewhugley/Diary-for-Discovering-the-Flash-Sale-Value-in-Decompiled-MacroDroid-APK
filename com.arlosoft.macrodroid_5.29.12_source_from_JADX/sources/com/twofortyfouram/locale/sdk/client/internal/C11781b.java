package com.twofortyfouram.locale.sdk.client.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p276h8.C12406a;

/* renamed from: com.twofortyfouram.locale.sdk.client.internal.b */
public final class C11781b {
    @NonNull

    /* renamed from: a */
    private static final Set<String> f57717a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("com.twofortyfouram.locale");
        linkedHashSet.add("com.twofortyfouram.locale.example.host");
        f57717a = Collections.unmodifiableSet(linkedHashSet);
    }

    @Nullable
    /* renamed from: a */
    public static String m81996a(@NonNull PackageManager packageManager) {
        C12406a.m83260d(packageManager, "packageManager");
        List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
        Set<String> set = f57717a;
        if (set.contains((Object) null)) {
            Iterator<PackageInfo> it = installedPackages.iterator();
            if (it.hasNext()) {
                String str = it.next().packageName;
                throw null;
            }
        }
        for (String next : set) {
            if (!next.equals((Object) null)) {
                for (PackageInfo packageInfo : installedPackages) {
                    String str2 = packageInfo.packageName;
                    if (next.equals(str2)) {
                        return str2;
                    }
                }
                continue;
            }
        }
        return null;
    }
}
