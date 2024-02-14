package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.p353io.IOUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzffr implements zzffq {

    /* renamed from: a */
    private final ConcurrentHashMap f35700a;

    /* renamed from: b */
    private final zzffx f35701b;

    /* renamed from: c */
    private final zzfft f35702c = new zzfft();

    public zzffr(zzffx zzffx) {
        this.f35700a = new ConcurrentHashMap(zzffx.f35724o);
        this.f35701b = zzffx;
    }

    /* renamed from: e */
    private final void m50108e() {
        Parcelable.Creator<zzffx> creator = zzffx.CREATOR;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27277v5)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f35701b.f35722f);
            sb.append(" PoolCollection");
            sb.append(this.f35702c.mo45695b());
            int i = 0;
            for (Map.Entry entry : this.f35700a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfga) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzffp) entry.getValue()).mo45680b(); i2++) {
                    sb.append("[O]");
                }
                for (int b = ((zzffp) entry.getValue()).mo45680b(); b < this.f35701b.f35724o; b++) {
                    sb.append("[ ]");
                }
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb.append(((zzffp) entry.getValue()).mo45685g());
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            while (i < this.f35701b.f35723g) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            zzcgp.m45224b(sb.toString());
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo45687a(zzfga zzfga, zzffz zzffz) {
        boolean h;
        zzffp zzffp = (zzffp) this.f35700a.get(zzfga);
        zzffz.f35731d = zzt.m2889b().mo21950a();
        if (zzffp == null) {
            zzffx zzffx = this.f35701b;
            zzffp = new zzffp(zzffx.f35724o, zzffx.f35725p * 1000);
            int size = this.f35700a.size();
            zzffx zzffx2 = this.f35701b;
            if (size == zzffx2.f35723g) {
                int i = zzffx2.f35718D;
                int i2 = i - 1;
                zzfga zzfga2 = null;
                if (i != 0) {
                    long j = LocationRequestCompat.PASSIVE_INTERVAL;
                    if (i2 == 0) {
                        for (Map.Entry entry : this.f35700a.entrySet()) {
                            if (((zzffp) entry.getValue()).mo45681c() < j) {
                                j = ((zzffp) entry.getValue()).mo45681c();
                                zzfga2 = (zzfga) entry.getKey();
                            }
                        }
                        if (zzfga2 != null) {
                            this.f35700a.remove(zzfga2);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry entry2 : this.f35700a.entrySet()) {
                            if (((zzffp) entry2.getValue()).mo45682d() < j) {
                                j = ((zzffp) entry2.getValue()).mo45682d();
                                zzfga2 = (zzfga) entry2.getKey();
                            }
                        }
                        if (zzfga2 != null) {
                            this.f35700a.remove(zzfga2);
                        }
                    } else if (i2 == 2) {
                        int i3 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : this.f35700a.entrySet()) {
                            if (((zzffp) entry3.getValue()).mo45679a() < i3) {
                                i3 = ((zzffp) entry3.getValue()).mo45679a();
                                zzfga2 = (zzfga) entry3.getKey();
                            }
                        }
                        if (zzfga2 != null) {
                            this.f35700a.remove(zzfga2);
                        }
                    }
                    this.f35702c.mo45700g();
                } else {
                    throw null;
                }
            }
            this.f35700a.put(zzfga, zzffp);
            this.f35702c.mo45697d();
        }
        h = zzffp.mo45686h(zzffz);
        this.f35702c.mo45696c();
        zzffs a = this.f35702c.mo45694a();
        zzfgn f = zzffp.mo45684f();
        zzbfe F = zzbfk.m43295F();
        zzbfc F2 = zzbfd.m43270F();
        F2.mo42565v(2);
        zzbfi F3 = zzbfj.m43289F();
        F3.mo42569n(a.f35703a);
        F3.mo42570o(a.f35704c);
        F3.mo42571u(f.f35751c);
        F2.mo42564u(F3);
        F.mo42566n(F2);
        zzffz.f35728a.zzb().mo44525c().mo44536W((zzbfk) F.mo47341h());
        m50108e();
        return h;
    }

    /* renamed from: b */
    public final synchronized boolean mo45688b(zzfga zzfga) {
        zzffp zzffp = (zzffp) this.f35700a.get(zzfga);
        if (zzffp == null) {
            return true;
        }
        if (zzffp.mo45680b() < this.f35701b.f35724o) {
            return true;
        }
        return false;
    }

    @Deprecated
    /* renamed from: c */
    public final zzfga mo45689c(zzl zzl, String str, zzw zzw) {
        return new zzfgb(zzl, str, new zzcbg(this.f35701b.f35720c).mo43286a().f28183k, this.f35701b.f35726s, zzw);
    }

    @Nullable
    /* renamed from: d */
    public final synchronized zzffz mo45690d(zzfga zzfga) {
        zzffz zzffz;
        zzffp zzffp = (zzffp) this.f35700a.get(zzfga);
        if (zzffp != null) {
            zzffz = zzffp.mo45683e();
            if (zzffz == null) {
                this.f35702c.mo45698e();
            }
            zzfgn f = zzffp.mo45684f();
            if (zzffz != null) {
                zzbfe F = zzbfk.m43295F();
                zzbfc F2 = zzbfd.m43270F();
                F2.mo42565v(2);
                zzbfg F3 = zzbfh.m43280F();
                F3.mo42567n(f.f35750a);
                F3.mo42568o(f.f35751c);
                F2.mo42562n(F3);
                F.mo42566n(F2);
                zzffz.f35728a.zzb().mo44525c().mo44539c0((zzbfk) F.mo47341h());
            }
            m50108e();
        } else {
            this.f35702c.mo45699f();
            m50108e();
            zzffz = null;
        }
        return zzffz;
    }

    public final zzffx zza() {
        return this.f35701b;
    }
}
