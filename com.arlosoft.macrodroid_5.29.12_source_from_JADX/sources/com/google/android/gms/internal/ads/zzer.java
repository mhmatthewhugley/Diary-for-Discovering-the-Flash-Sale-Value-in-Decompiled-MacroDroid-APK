package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzer implements zzex {

    /* renamed from: a */
    private final boolean f34746a;

    /* renamed from: b */
    private final ArrayList f34747b = new ArrayList(1);

    /* renamed from: c */
    private int f34748c;
    @Nullable

    /* renamed from: d */
    private zzfc f34749d;

    protected zzer(boolean z) {
        this.f34746a = z;
    }

    /* renamed from: b */
    public /* synthetic */ Map mo43925b() {
        return Collections.emptyMap();
    }

    /* renamed from: k */
    public final void mo43952k(zzfz zzfz) {
        Objects.requireNonNull(zzfz);
        if (!this.f34747b.contains(zzfz)) {
            this.f34747b.add(zzfz);
            this.f34748c++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo45436o() {
        zzfc zzfc = this.f34749d;
        int i = zzen.f34500a;
        for (int i2 = 0; i2 < this.f34748c; i2++) {
            ((zzfz) this.f34747b.get(i2)).mo43960B(this, zzfc, this.f34746a);
        }
        this.f34749d = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo45437p(zzfc zzfc) {
        for (int i = 0; i < this.f34748c; i++) {
            ((zzfz) this.f34747b.get(i)).mo43961E(this, zzfc, this.f34746a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo45438q(zzfc zzfc) {
        this.f34749d = zzfc;
        for (int i = 0; i < this.f34748c; i++) {
            ((zzfz) this.f34747b.get(i)).mo43983y(this, zzfc, this.f34746a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo45439x(int i) {
        zzfc zzfc = this.f34749d;
        int i2 = zzen.f34500a;
        for (int i3 = 0; i3 < this.f34748c; i3++) {
            ((zzfz) this.f34747b.get(i3)).mo43969j(this, zzfc, this.f34746a, i);
        }
    }
}
