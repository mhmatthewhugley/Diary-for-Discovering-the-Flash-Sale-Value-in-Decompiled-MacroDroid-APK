package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzej implements zzdn {
    @GuardedBy("messagePool")

    /* renamed from: b */
    private static final List f34154b = new ArrayList(50);

    /* renamed from: a */
    private final Handler f34155a;

    public zzej(Handler handler) {
        this.f34155a = handler;
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m48937b(zzei zzei) {
        List list = f34154b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzei);
            }
        }
    }

    /* renamed from: c */
    private static zzei m48938c() {
        zzei zzei;
        List list = f34154b;
        synchronized (list) {
            if (list.isEmpty()) {
                zzei = new zzei((zzeh) null);
            } else {
                zzei = (zzei) list.remove(list.size() - 1);
            }
        }
        return zzei;
    }

    /* renamed from: A */
    public final void mo44711A(int i) {
        this.f34155a.removeMessages(2);
    }

    /* renamed from: E */
    public final boolean mo44712E(int i) {
        return this.f34155a.sendEmptyMessage(i);
    }

    /* renamed from: a */
    public final void mo44713a(@Nullable Object obj) {
        this.f34155a.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: f */
    public final zzdm mo44714f(int i, @Nullable Object obj) {
        zzei c = m48938c();
        c.mo45315a(this.f34155a.obtainMessage(i, obj), this);
        return c;
    }

    /* renamed from: g */
    public final boolean mo44715g(zzdm zzdm) {
        return ((zzei) zzdm).mo45316b(this.f34155a);
    }

    /* renamed from: h */
    public final boolean mo44716h(Runnable runnable) {
        return this.f34155a.post(runnable);
    }

    /* renamed from: i */
    public final zzdm mo44717i(int i, int i2, int i3) {
        zzei c = m48938c();
        c.mo45315a(this.f34155a.obtainMessage(1, i2, i3), this);
        return c;
    }

    /* renamed from: j */
    public final boolean mo44718j(int i, long j) {
        return this.f34155a.sendEmptyMessageAtTime(2, j);
    }

    /* renamed from: v */
    public final zzdm mo44719v(int i) {
        zzei c = m48938c();
        c.mo45315a(this.f34155a.obtainMessage(i), this);
        return c;
    }

    /* renamed from: y */
    public final boolean mo44720y(int i) {
        return this.f34155a.hasMessages(0);
    }
}
