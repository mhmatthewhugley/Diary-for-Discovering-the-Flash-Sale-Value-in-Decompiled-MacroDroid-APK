package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzod implements zzng {

    /* renamed from: b */
    protected zzne f38025b;

    /* renamed from: c */
    protected zzne f38026c;

    /* renamed from: d */
    private zzne f38027d;

    /* renamed from: e */
    private zzne f38028e;

    /* renamed from: f */
    private ByteBuffer f38029f;

    /* renamed from: g */
    private ByteBuffer f38030g;

    /* renamed from: h */
    private boolean f38031h;

    public zzod() {
        ByteBuffer byteBuffer = zzng.f37949a;
        this.f38029f = byteBuffer;
        this.f38030g = byteBuffer;
        zzne zzne = zzne.f37944e;
        this.f38027d = zzne;
        this.f38028e = zzne;
        this.f38025b = zzne;
        this.f38026c = zzne;
    }

    /* renamed from: a */
    public final void mo47873a() {
        this.f38030g = zzng.f37949a;
        this.f38031h = false;
        this.f38025b = this.f38027d;
        this.f38026c = this.f38028e;
        mo47958j();
    }

    /* renamed from: c */
    public final void mo47875c() {
        mo47873a();
        this.f38029f = zzng.f37949a;
        zzne zzne = zzne.f37944e;
        this.f38027d = zzne;
        this.f38028e = zzne;
        this.f38025b = zzne;
        this.f38026c = zzne;
        mo47960l();
    }

    /* renamed from: d */
    public final void mo47876d() {
        this.f38031h = true;
        mo47959k();
    }

    @CallSuper
    /* renamed from: e */
    public boolean mo47877e() {
        return this.f38031h && this.f38030g == zzng.f37949a;
    }

    /* renamed from: f */
    public boolean mo47878f() {
        return this.f38028e != zzne.f37944e;
    }

    /* renamed from: g */
    public final zzne mo47879g(zzne zzne) throws zznf {
        this.f38027d = zzne;
        this.f38028e = mo47956h(zzne);
        return mo47878f() ? this.f38028e : zzne.f37944e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public zzne mo47956h(zzne zzne) throws zznf {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final ByteBuffer mo47957i(int i) {
        if (this.f38029f.capacity() < i) {
            this.f38029f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f38029f.clear();
        }
        ByteBuffer byteBuffer = this.f38029f;
        this.f38030g = byteBuffer;
        return byteBuffer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo47958j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo47959k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo47960l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo47961m() {
        return this.f38030g.hasRemaining();
    }

    @CallSuper
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.f38030g;
        this.f38030g = zzng.f37949a;
        return byteBuffer;
    }
}
