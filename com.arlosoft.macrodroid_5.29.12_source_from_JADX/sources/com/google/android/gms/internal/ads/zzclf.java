package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzclf extends zzclb {
    public zzclf(zzciy zzciy) {
        super(zzciy);
    }

    /* renamed from: i */
    public final void mo43894i() {
    }

    /* renamed from: s */
    public final boolean mo43904s(String str) {
        String e = zzcgi.m45176e(str);
        zzciy zzciy = (zzciy) this.f28832d.get();
        if (!(zzciy == null || e == null)) {
            zzciy.mo43766w(e, this);
        }
        zzcgp.m45229g("VideoStreamNoopCache is doing nothing.");
        mo43895j(str, e, "noop", "Noop cache is a noop.");
        return false;
    }
}
