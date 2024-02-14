package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfcx implements zzeov {

    /* renamed from: a */
    private final Context f35443a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f35444b;

    /* renamed from: c */
    private final zzcom f35445c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zzfcn f35446d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final zzfaz f35447e;

    /* renamed from: f */
    private final zzfdx f35448f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zzfjw f35449g;

    /* renamed from: h */
    private final zzfed f35450h;

    /* renamed from: i */
    private zzfzp f35451i;

    public zzfcx(Context context, Executor executor, zzcom zzcom, zzfaz zzfaz, zzfcn zzfcn, zzfed zzfed, zzfdx zzfdx) {
        this.f35443a = context;
        this.f35444b = executor;
        this.f35445c = zzcom;
        this.f35447e = zzfaz;
        this.f35446d = zzfcn;
        this.f35450h = zzfed;
        this.f35448f = zzfdx;
        this.f35449g = zzcom.mo44191B();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final zzdug m49882j(zzfax zzfax) {
        zzdug m = this.f35445c.mo44203m();
        zzdck zzdck = new zzdck();
        zzdck.mo44554c(this.f35443a);
        zzdck.mo44557f(((zzfcw) zzfax).f35441a);
        zzdck.mo44556e(this.f35448f);
        m.mo44355a(zzdck.mo44558g());
        m.mo44357d(new zzdik().mo44646q());
        return m;
    }

    /* renamed from: a */
    public final boolean mo45412a(zzl zzl, String str, zzeot zzeot, zzeou zzeou) throws RemoteException {
        zzfju zzfju;
        zzcbz zzcbz = new zzcbz(zzl, str);
        if (zzcbz.f28203c == null) {
            zzcgp.m45226d("Ad unit ID should not be null for rewarded video ad.");
            this.f35444b.execute(new zzfcq(this));
        } else {
            zzfzp zzfzp = this.f35451i;
            if (zzfzp == null || zzfzp.isDone()) {
                if (((Boolean) zzbkl.f27408c.mo42728e()).booleanValue()) {
                    zzfaz zzfaz = this.f35447e;
                    if (zzfaz.mo45555d() != null) {
                        zzfju e = ((zzduh) zzfaz.mo45555d()).mo44266e();
                        e.mo45829h(5);
                        e.mo45823b(zzcbz.f28202a.f1988G);
                        zzfju = e;
                        zzfez.m50041a(this.f35443a, zzcbz.f28202a.f2002o);
                        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26854E7)).booleanValue() && zzcbz.f28202a.f2002o) {
                            this.f35445c.mo44205o().mo45134m(true);
                        }
                        zzfed zzfed = this.f35450h;
                        zzfed.mo45606J(zzcbz.f28203c);
                        zzfed.mo45605I(zzq.m2420o2());
                        zzfed.mo45618e(zzcbz.f28202a);
                        zzfef g = zzfed.mo45620g();
                        zzfjj b = zzfji.m50259b(this.f35443a, zzfjt.m50323f(g), 5, zzcbz.f28202a);
                        zzfcw zzfcw = new zzfcw((zzfcv) null);
                        zzfcw.f35441a = g;
                        zzfcw.f35442b = null;
                        zzfzp a = this.f35447e.mo45552a(new zzfba(zzfcw, (zzcbc) null), new zzfcr(this), (Object) null);
                        this.f35451i = a;
                        zzfzg.m51423r(a, new zzfcu(this, zzeou, zzfju, b, zzfcw), this.f35444b);
                        return true;
                    }
                }
                zzfju = null;
                zzfez.m50041a(this.f35443a, zzcbz.f28202a.f2002o);
                this.f35445c.mo44205o().mo45134m(true);
                zzfed zzfed2 = this.f35450h;
                zzfed2.mo45606J(zzcbz.f28203c);
                zzfed2.mo45605I(zzq.m2420o2());
                zzfed2.mo45618e(zzcbz.f28202a);
                zzfef g2 = zzfed2.mo45620g();
                zzfjj b2 = zzfji.m50259b(this.f35443a, zzfjt.m50323f(g2), 5, zzcbz.f28202a);
                zzfcw zzfcw2 = new zzfcw((zzfcv) null);
                zzfcw2.f35441a = g2;
                zzfcw2.f35442b = null;
                zzfzp a2 = this.f35447e.mo45552a(new zzfba(zzfcw2, (zzcbc) null), new zzfcr(this), (Object) null);
                this.f35451i = a2;
                zzfzg.m51423r(a2, new zzfcu(this, zzeou, zzfju, b2, zzfcw2), this.f35444b);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo45594h() {
        this.f35446d.mo44382r(zzffe.m50085d(6, (String) null, (zze) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo45595i(int i) {
        this.f35450h.mo45602F().mo45601a(i);
    }

    public final boolean zza() {
        throw null;
    }
}
