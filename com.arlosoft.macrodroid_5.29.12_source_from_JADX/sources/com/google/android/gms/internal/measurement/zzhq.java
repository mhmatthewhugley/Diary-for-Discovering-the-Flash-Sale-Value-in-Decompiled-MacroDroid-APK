package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzhq {
    @GuardedBy("PhenotypeConstants.class")

    /* renamed from: a */
    private static final ArrayMap f41493a = new ArrayMap();

    /* renamed from: a */
    public static synchronized Uri m60278a(String str) {
        synchronized (zzhq.class) {
            ArrayMap arrayMap = f41493a;
            Uri uri = (Uri) arrayMap.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            arrayMap.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
