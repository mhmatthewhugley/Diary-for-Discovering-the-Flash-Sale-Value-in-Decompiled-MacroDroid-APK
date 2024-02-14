package com.google.android.gms.internal.icing;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzbe {
    @GuardedBy("ConfigurationContentLoader.class")

    /* renamed from: a */
    private static final Map<Uri, zzbe> f40773a = new ArrayMap();

    /* renamed from: b */
    public static final String[] f40774b = {"key", "value"};
}
