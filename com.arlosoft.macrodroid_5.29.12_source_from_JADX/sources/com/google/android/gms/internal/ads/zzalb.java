package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzalb {

    /* renamed from: a */
    private final int f24937a;

    /* renamed from: b */
    private final List f24938b;

    /* renamed from: c */
    private final int f24939c;
    @Nullable

    /* renamed from: d */
    private final InputStream f24940d;

    public zzalb(int i, List list, int i2, InputStream inputStream) {
        this.f24937a = i;
        this.f24938b = list;
        this.f24939c = i2;
        this.f24940d = inputStream;
    }

    /* renamed from: a */
    public final int mo41621a() {
        return this.f24939c;
    }

    /* renamed from: b */
    public final int mo41622b() {
        return this.f24937a;
    }

    @Nullable
    /* renamed from: c */
    public final InputStream mo41623c() {
        InputStream inputStream = this.f24940d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    /* renamed from: d */
    public final List mo41624d() {
        return Collections.unmodifiableList(this.f24938b);
    }
}
