package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzpk {

    /* renamed from: a */
    public final int f38186a;
    @Nullable

    /* renamed from: b */
    public final zzsi f38187b;

    /* renamed from: c */
    private final CopyOnWriteArrayList f38188c;

    public zzpk() {
        this(new CopyOnWriteArrayList(), 0, (zzsi) null);
    }

    private zzpk(CopyOnWriteArrayList copyOnWriteArrayList, int i, @Nullable zzsi zzsi) {
        this.f38188c = copyOnWriteArrayList;
        this.f38186a = i;
        this.f38187b = zzsi;
    }

    @CheckResult
    /* renamed from: a */
    public final zzpk mo48012a(int i, @Nullable zzsi zzsi) {
        return new zzpk(this.f38188c, i, zzsi);
    }

    /* renamed from: b */
    public final void mo48013b(Handler handler, zzpl zzpl) {
        Objects.requireNonNull(zzpl);
        this.f38188c.add(new zzpj(handler, zzpl));
    }

    /* renamed from: c */
    public final void mo48014c(zzpl zzpl) {
        Iterator it = this.f38188c.iterator();
        while (it.hasNext()) {
            zzpj zzpj = (zzpj) it.next();
            if (zzpj.f38185b == zzpl) {
                this.f38188c.remove(zzpj);
            }
        }
    }
}
