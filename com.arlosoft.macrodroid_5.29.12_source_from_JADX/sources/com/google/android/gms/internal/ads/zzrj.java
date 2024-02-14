package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzrj implements zzsk {

    /* renamed from: a */
    private final ArrayList f38350a = new ArrayList(1);

    /* renamed from: b */
    private final HashSet f38351b = new HashSet(1);

    /* renamed from: c */
    private final zzsr f38352c = new zzsr();

    /* renamed from: d */
    private final zzpk f38353d = new zzpk();
    @Nullable

    /* renamed from: e */
    private Looper f38354e;
    @Nullable

    /* renamed from: f */
    private zzcn f38355f;
    @Nullable

    /* renamed from: g */
    private zznb f38356g;

    /* renamed from: J */
    public final /* synthetic */ zzcn mo48096J() {
        return null;
    }

    /* renamed from: a */
    public final void mo48097a(zzsj zzsj) {
        this.f38350a.remove(zzsj);
        if (this.f38350a.isEmpty()) {
            this.f38354e = null;
            this.f38355f = null;
            this.f38356g = null;
            this.f38351b.clear();
            mo48115v();
            return;
        }
        mo48102i(zzsj);
    }

    /* renamed from: d */
    public final void mo48098d(zzpl zzpl) {
        this.f38353d.mo48014c(zzpl);
    }

    /* renamed from: e */
    public final void mo48099e(zzss zzss) {
        this.f38352c.mo48179m(zzss);
    }

    /* renamed from: f */
    public final void mo48100f(zzsj zzsj) {
        Objects.requireNonNull(this.f38354e);
        boolean isEmpty = this.f38351b.isEmpty();
        this.f38351b.add(zzsj);
        if (isEmpty) {
            mo48111r();
        }
    }

    /* renamed from: h */
    public final void mo48101h(Handler handler, zzss zzss) {
        Objects.requireNonNull(zzss);
        this.f38352c.mo48168b(handler, zzss);
    }

    /* renamed from: i */
    public final void mo48102i(zzsj zzsj) {
        boolean isEmpty = this.f38351b.isEmpty();
        this.f38351b.remove(zzsj);
        if ((!isEmpty) && this.f38351b.isEmpty()) {
            mo48110q();
        }
    }

    /* renamed from: j */
    public final void mo48103j(zzsj zzsj, @Nullable zzfz zzfz, zznb zznb) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f38354e;
        boolean z = true;
        if (!(looper == null || looper == myLooper)) {
            z = false;
        }
        zzdd.m47210d(z);
        this.f38356g = zznb;
        zzcn zzcn = this.f38355f;
        this.f38350a.add(zzsj);
        if (this.f38354e == null) {
            this.f38354e = myLooper;
            this.f38351b.add(zzsj);
            mo48112s(zzfz);
        } else if (zzcn != null) {
            mo48100f(zzsj);
            zzsj.mo47730a(this, zzcn);
        }
    }

    /* renamed from: k */
    public final void mo48104k(Handler handler, zzpl zzpl) {
        Objects.requireNonNull(zzpl);
        this.f38353d.mo48013b(handler, zzpl);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final zznb mo48105l() {
        zznb zznb = this.f38356g;
        zzdd.m47208b(zznb);
        return zznb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final zzpk mo48106m(@Nullable zzsi zzsi) {
        return this.f38353d.mo48012a(0, zzsi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final zzpk mo48107n(int i, @Nullable zzsi zzsi) {
        return this.f38353d.mo48012a(i, zzsi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final zzsr mo48108o(@Nullable zzsi zzsi) {
        return this.f38352c.mo48167a(0, zzsi, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final zzsr mo48109p(int i, @Nullable zzsi zzsi, long j) {
        return this.f38352c.mo48167a(i, zzsi, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo48110q() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo48111r() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract void mo48112s(@Nullable zzfz zzfz);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo48113t(zzcn zzcn) {
        this.f38355f = zzcn;
        ArrayList arrayList = this.f38350a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzsj) arrayList.get(i)).mo47730a(this, zzcn);
        }
    }

    /* renamed from: u */
    public final /* synthetic */ boolean mo48114u() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract void mo48115v();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo48116w() {
        return !this.f38351b.isEmpty();
    }
}
