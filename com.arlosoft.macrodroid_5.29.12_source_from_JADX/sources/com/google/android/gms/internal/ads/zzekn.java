package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzekn implements zzfzc {

    /* renamed from: a */
    final /* synthetic */ long f34286a;

    /* renamed from: b */
    final /* synthetic */ String f34287b;

    /* renamed from: c */
    final /* synthetic */ zzfdk f34288c;

    /* renamed from: d */
    final /* synthetic */ zzfdn f34289d;

    /* renamed from: e */
    final /* synthetic */ zzfki f34290e;

    /* renamed from: f */
    final /* synthetic */ zzfdw f34291f;

    /* renamed from: g */
    final /* synthetic */ zzeko f34292g;

    zzekn(zzeko zzeko, long j, String str, zzfdk zzfdk, zzfdn zzfdn, zzfki zzfki, zzfdw zzfdw) {
        this.f34292g = zzeko;
        this.f34286a = j;
        this.f34287b = str;
        this.f34288c = zzfdk;
        this.f34289d = zzfdn;
        this.f34290e = zzfki;
        this.f34291f = zzfdw;
    }

    /* renamed from: a */
    public final void mo20699a(Throwable th) {
        Integer num;
        zze zze;
        zze b;
        long c = this.f34292g.f34293a.mo21952c() - this.f34286a;
        int i = 6;
        if (th instanceof TimeoutException) {
            num = null;
            i = 2;
        } else if (th instanceof zzekd) {
            num = null;
            i = 3;
        } else if (th instanceof CancellationException) {
            num = null;
            i = 4;
        } else if (th instanceof zzfek) {
            num = null;
            i = 5;
        } else {
            if (th instanceof zzebh) {
                if (zzffe.m50082a(th).f1934a == 3) {
                    i = 1;
                }
                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27263u1)).booleanValue() && (th instanceof zzehg) && (b = ((zzehg) th).mo45301b()) != null) {
                    num = Integer.valueOf(b.f1934a);
                }
            }
            num = null;
        }
        zzeko.m49007g(this.f34292g, this.f34287b, i, c, this.f34288c.f35534h0, num);
        zzeko zzeko = this.f34292g;
        if (zzeko.f34297e) {
            zzeko.f34294b.mo45352a(this.f34289d, this.f34288c, i, th instanceof zzehg ? (zzehg) th : null, c);
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27149i7)).booleanValue()) {
            zzfkm c2 = this.f34292g.f34295c;
            zzfki zzfki = this.f34290e;
            zzfdw zzfdw = this.f34291f;
            zzfdk zzfdk = this.f34288c;
            c2.mo45863d(zzfki.mo45855c(zzfdw, zzfdk, zzfdk.f35547o));
        }
        zze a = zzffe.m50082a(th);
        int i2 = a.f1934a;
        if ((i2 == 3 || i2 == 0) && (zze = a.f1937f) != null && !zze.f1936d.equals("com.google.android.gms.ads")) {
            a = zzffe.m50082a(new zzehg(13, a.f1937f));
        }
        this.f34292g.f34298f.mo45306e(this.f34288c, c, a);
    }

    /* renamed from: c */
    public final void mo20700c(Object obj) {
        long c = this.f34292g.f34293a.mo21952c() - this.f34286a;
        zzeko.m49007g(this.f34292g, this.f34287b, 0, c, this.f34288c.f35534h0, (Integer) null);
        zzeko zzeko = this.f34292g;
        if (zzeko.f34297e) {
            zzeko.f34294b.mo45352a(this.f34289d, this.f34288c, 0, (zzehg) null, c);
        }
        this.f34292g.f34298f.mo45307f(this.f34288c, c, (zze) null);
    }
}
