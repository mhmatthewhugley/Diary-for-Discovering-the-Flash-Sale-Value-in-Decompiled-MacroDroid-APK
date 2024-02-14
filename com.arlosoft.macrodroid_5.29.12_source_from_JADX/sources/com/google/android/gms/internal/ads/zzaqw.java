package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaqw extends zzarq {
    public zzaqw(zzaqe zzaqe, String str, String str2, zzamk zzamk, int i, int i2) {
        super(zzaqe, "ysEnh8zkgcN8WwINs5FP7vGybZW2TtVSX36HO6emvdUrcCkVbC9hrF5Pe5ZSZx3i", "3LpdW89cIASEFv5WvS5ZDEWsiVGQitP33SL3WZgJ6zE=", zzamk, i, 24);
    }

    /* renamed from: c */
    private final void m42165c() {
        AdvertisingIdClient h = this.f25384c.mo41811h();
        if (h != null) {
            try {
                AdvertisingIdClient.Info b = h.mo19842b();
                String d = zzaqh.m42131d(b.mo19848a());
                if (d != null) {
                    synchronized (this.f25387g) {
                        this.f25387g.mo41656C0(d);
                        this.f25387g.mo41654B0(b.mo19849b());
                        this.f25387g.mo41683a0(6);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41843a() throws IllegalAccessException, InvocationTargetException {
        if (!this.f25384c.mo41818q()) {
            synchronized (this.f25387g) {
                this.f25387g.mo41656C0((String) this.f25388o.invoke((Object) null, new Object[]{this.f25384c.mo41806b()}));
            }
            return;
        }
        m42165c();
    }

    /* renamed from: b */
    public final Void mo41845b() throws Exception {
        if (this.f25384c.mo41819r()) {
            super.mo41845b();
            return null;
        }
        if (this.f25384c.mo41818q()) {
            m42165c();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        mo41845b();
        return null;
    }
}
