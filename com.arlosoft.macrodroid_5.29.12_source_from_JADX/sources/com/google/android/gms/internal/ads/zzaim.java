package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaim {

    /* renamed from: a */
    public final int f24763a;
    @Nullable

    /* renamed from: b */
    public final String f24764b;

    /* renamed from: c */
    public final List f24765c;

    /* renamed from: d */
    public final byte[] f24766d;

    public zzaim(int i, @Nullable String str, @Nullable List list, byte[] bArr) {
        List list2;
        this.f24763a = i;
        this.f24764b = str;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.f24765c = list2;
        this.f24766d = bArr;
    }
}
