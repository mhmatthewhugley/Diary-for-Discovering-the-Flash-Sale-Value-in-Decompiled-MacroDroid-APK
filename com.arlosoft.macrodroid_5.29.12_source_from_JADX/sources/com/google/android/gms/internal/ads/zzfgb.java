package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfgb implements zzfga {

    /* renamed from: a */
    private final Object[] f35733a;

    public zzfgb(zzl zzl, String str, int i, String str2, zzw zzw) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzl.f1998c));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(m50125a(zzl.f1999d));
        } else if (hashSet.contains("npa")) {
            arrayList.add(zzl.f1999d.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzl.f2000f));
        }
        if (hashSet.contains("keywords")) {
            List list = zzl.f2001g;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzl.f2002o));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzl.f2003p));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzl.f2004s));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzl.f2005z);
        }
        if (hashSet.contains("location")) {
            Location location = zzl.f1983B;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzl.f1984C);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(m50125a(zzl.f1985D));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(m50125a(zzl.f1986E));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = zzl.f1987F;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzl.f1988G);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzl.f1989H);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzl.f1990I));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(zzl.f1992K));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzl.f1993L);
        }
        if (hashSet.contains("orientation")) {
            if (zzw != null) {
                arrayList.add(Integer.valueOf(zzw.f2046a));
            } else {
                arrayList.add((Object) null);
            }
        }
        this.f35733a = arrayList.toArray();
    }

    @Nullable
    /* renamed from: a */
    private static String m50125a(@Nullable Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                str = "null";
            } else if (obj instanceof Bundle) {
                str = m50125a((Bundle) obj);
            } else {
                str = obj.toString();
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfgb)) {
            return false;
        }
        return Arrays.equals(this.f35733a, ((zzfgb) obj).f35733a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f35733a);
    }

    public final String toString() {
        int hashCode = Arrays.hashCode(this.f35733a);
        String arrays = Arrays.toString(this.f35733a);
        return "[PoolKey#" + hashCode + " " + arrays + "]";
    }
}
