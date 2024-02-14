package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzftk {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzfsj f36361a;

    /* renamed from: b */
    private final zzftj f36362b;

    private zzftk(zzftj zzftj) {
        zzfsi zzfsi = zzfsi.f36336c;
        this.f36362b = zzftj;
        this.f36361a = zzfsi;
    }

    /* renamed from: b */
    public static zzftk m50963b(int i) {
        return new zzftk(new zzftg(4000));
    }

    /* renamed from: c */
    public static zzftk m50964c(zzfsj zzfsj) {
        return new zzftk(new zzfte(zzfsj));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final Iterator m50966g(CharSequence charSequence) {
        return this.f36362b.mo46181a(this, charSequence);
    }

    /* renamed from: d */
    public final Iterable mo46184d(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new zzfth(this, charSequence);
    }

    /* renamed from: f */
    public final List mo46185f(CharSequence charSequence) {
        Iterator g = m50966g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g.hasNext()) {
            arrayList.add((String) g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
