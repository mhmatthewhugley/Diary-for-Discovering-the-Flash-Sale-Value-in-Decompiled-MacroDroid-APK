package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzab {

    /* renamed from: a */
    private zzaa f41177a;

    /* renamed from: b */
    private zzaa f41178b;

    /* renamed from: c */
    private final List f41179c;

    public zzab() {
        this.f41177a = new zzaa("", 0, (Map) null);
        this.f41178b = new zzaa("", 0, (Map) null);
        this.f41179c = new ArrayList();
    }

    /* renamed from: a */
    public final zzaa mo50690a() {
        return this.f41177a;
    }

    /* renamed from: b */
    public final zzaa mo50691b() {
        return this.f41178b;
    }

    /* renamed from: c */
    public final List mo50692c() {
        return this.f41179c;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzab zzab = new zzab(this.f41177a.clone());
        for (zzaa b : this.f41179c) {
            zzab.f41179c.add(b.clone());
        }
        return zzab;
    }

    /* renamed from: d */
    public final void mo50694d(zzaa zzaa) {
        this.f41177a = zzaa;
        this.f41178b = zzaa.clone();
        this.f41179c.clear();
    }

    /* renamed from: e */
    public final void mo50695e(String str, long j, Map map) {
        this.f41179c.add(new zzaa(str, j, map));
    }

    /* renamed from: f */
    public final void mo50696f(zzaa zzaa) {
        this.f41178b = zzaa;
    }

    public zzab(zzaa zzaa) {
        this.f41177a = zzaa;
        this.f41178b = zzaa.clone();
        this.f41179c = new ArrayList();
    }
}
