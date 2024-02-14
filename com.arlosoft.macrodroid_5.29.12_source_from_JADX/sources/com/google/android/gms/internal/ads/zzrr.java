package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzrr extends zzrj {

    /* renamed from: h */
    private final HashMap f38377h = new HashMap();
    @Nullable

    /* renamed from: i */
    private Handler f38378i;
    @Nullable

    /* renamed from: j */
    private zzfz f38379j;

    protected zzrr() {
    }

    @CallSuper
    /* renamed from: K */
    public void mo48143K() throws IOException {
        for (zzrq zzrq : this.f38377h.values()) {
            zzrq.f38374a.mo48143K();
        }
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: q */
    public final void mo48110q() {
        for (zzrq zzrq : this.f38377h.values()) {
            zzrq.f38374a.mo48102i(zzrq.f38375b);
        }
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: r */
    public final void mo48111r() {
        for (zzrq zzrq : this.f38377h.values()) {
            zzrq.f38374a.mo48100f(zzrq.f38375b);
        }
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: s */
    public void mo48112s(@Nullable zzfz zzfz) {
        this.f38379j = zzfz;
        this.f38378i = zzen.m49158d((Handler.Callback) null);
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: v */
    public void mo48115v() {
        for (zzrq zzrq : this.f38377h.values()) {
            zzrq.f38374a.mo48097a(zzrq.f38375b);
            zzrq.f38374a.mo48099e(zzrq.f38376c);
            zzrq.f38374a.mo48098d(zzrq.f38376c);
        }
        this.f38377h.clear();
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: x */
    public zzsi mo48144x(Object obj, zzsi zzsi) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo48145y(Object obj, zzsk zzsk, zzcn zzcn);

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo48146z(Object obj, zzsk zzsk) {
        zzdd.m47210d(!this.f38377h.containsKey(obj));
        zzro zzro = new zzro(this, obj);
        zzrp zzrp = new zzrp(this, obj);
        this.f38377h.put(obj, new zzrq(zzsk, zzro, zzrp));
        Handler handler = this.f38378i;
        Objects.requireNonNull(handler);
        zzsk.mo48101h(handler, zzrp);
        Handler handler2 = this.f38378i;
        Objects.requireNonNull(handler2);
        zzsk.mo48104k(handler2, zzrp);
        zzsk.mo48103j(zzro, this.f38379j, mo48105l());
        if (!mo48116w()) {
            zzsk.mo48102i(zzro);
        }
    }
}
