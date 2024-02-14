package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdt {

    /* renamed from: a */
    private final zzde f33021a;

    /* renamed from: b */
    private final zzdn f33022b;

    /* renamed from: c */
    private final zzdr f33023c;

    /* renamed from: d */
    private final CopyOnWriteArraySet f33024d;

    /* renamed from: e */
    private final ArrayDeque f33025e;

    /* renamed from: f */
    private final ArrayDeque f33026f;

    /* renamed from: g */
    private boolean f33027g;

    public zzdt(Looper looper, zzde zzde, zzdr zzdr) {
        this(new CopyOnWriteArraySet(), looper, zzde, zzdr);
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m48108g(zzdt zzdt, Message message) {
        Iterator it = zzdt.f33024d.iterator();
        while (it.hasNext()) {
            ((zzds) it.next()).mo44947b(zzdt.f33023c);
            if (zzdt.f33022b.mo44720y(0)) {
                return true;
            }
        }
        return true;
    }

    @CheckResult
    /* renamed from: a */
    public final zzdt mo44965a(Looper looper, zzdr zzdr) {
        return new zzdt(this.f33024d, looper, this.f33021a, zzdr);
    }

    /* renamed from: b */
    public final void mo44966b(Object obj) {
        if (!this.f33027g) {
            this.f33024d.add(new zzds(obj));
        }
    }

    /* renamed from: c */
    public final void mo44967c() {
        if (!this.f33026f.isEmpty()) {
            if (!this.f33022b.mo44720y(0)) {
                zzdn zzdn = this.f33022b;
                zzdn.mo44715g(zzdn.mo44719v(0));
            }
            boolean isEmpty = this.f33025e.isEmpty();
            this.f33025e.addAll(this.f33026f);
            this.f33026f.clear();
            if (!(!isEmpty)) {
                while (!this.f33025e.isEmpty()) {
                    ((Runnable) this.f33025e.peekFirst()).run();
                    this.f33025e.removeFirst();
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo44968d(int i, zzdq zzdq) {
        this.f33026f.add(new zzdp(new CopyOnWriteArraySet(this.f33024d), i, zzdq));
    }

    /* renamed from: e */
    public final void mo44969e() {
        Iterator it = this.f33024d.iterator();
        while (it.hasNext()) {
            ((zzds) it.next()).mo44948c(this.f33023c);
        }
        this.f33024d.clear();
        this.f33027g = true;
    }

    /* renamed from: f */
    public final void mo44970f(Object obj) {
        Iterator it = this.f33024d.iterator();
        while (it.hasNext()) {
            zzds zzds = (zzds) it.next();
            if (zzds.f32938a.equals(obj)) {
                zzds.mo44948c(this.f33023c);
                this.f33024d.remove(zzds);
            }
        }
    }

    private zzdt(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzde zzde, zzdr zzdr) {
        this.f33021a = zzde;
        this.f33024d = copyOnWriteArraySet;
        this.f33023c = zzdr;
        this.f33025e = new ArrayDeque();
        this.f33026f = new ArrayDeque();
        this.f33022b = zzde.mo44586a(looper, new zzdo(this));
    }
}
