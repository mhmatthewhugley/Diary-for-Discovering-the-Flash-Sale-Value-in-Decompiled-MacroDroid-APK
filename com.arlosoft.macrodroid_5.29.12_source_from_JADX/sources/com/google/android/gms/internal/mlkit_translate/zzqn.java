package com.google.android.gms.internal.mlkit_translate;

import androidx.annotation.Nullable;
import java.util.Date;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzqn {

    /* renamed from: a */
    private final Date f44471a;

    /* renamed from: b */
    private final zzqk f44472b;
    @Nullable

    /* renamed from: c */
    private final String f44473c;

    private zzqn(Date date, int i, zzqk zzqk, @Nullable String str) {
        this.f44471a = date;
        this.f44472b = zzqk;
        this.f44473c = str;
    }

    /* renamed from: b */
    public static zzqn m62213b(Date date) {
        return new zzqn(date, 1, (zzqk) null, (String) null);
    }

    /* renamed from: c */
    public static zzqn m62214c(zzqk zzqk, String str) {
        return new zzqn(zzqk.mo52453c(), 0, zzqk, str);
    }

    /* renamed from: a */
    public final zzqk mo52458a() {
        return this.f44472b;
    }
}
