package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcnl extends zzdj {

    /* renamed from: A */
    private float f29128A;

    /* renamed from: B */
    private float f29129B;

    /* renamed from: C */
    private boolean f29130C;

    /* renamed from: D */
    private boolean f29131D;

    /* renamed from: E */
    private zzbnm f29132E;

    /* renamed from: a */
    private final zzciy f29133a;

    /* renamed from: c */
    private final Object f29134c = new Object();

    /* renamed from: d */
    private final boolean f29135d;

    /* renamed from: f */
    private final boolean f29136f;

    /* renamed from: g */
    private int f29137g;
    @Nullable

    /* renamed from: o */
    private zzdn f29138o;

    /* renamed from: p */
    private boolean f29139p;

    /* renamed from: s */
    private boolean f29140s = true;

    /* renamed from: z */
    private float f29141z;

    public zzcnl(zzciy zzciy, float f, boolean z, boolean z2) {
        this.f29133a = zzciy;
        this.f29141z = f;
        this.f29135d = z;
        this.f29136f = z2;
    }

    /* renamed from: Qb */
    private final void m46145Qb(int i, int i2, boolean z, boolean z2) {
        zzchc.f28460e.execute(new zzcnk(this, i, i2, z, z2));
    }

    /* renamed from: Rb */
    private final void m46146Rb(String str, @Nullable Map map) {
        HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("action", str);
        zzchc.f28460e.execute(new zzcnj(this, hashMap));
    }

    /* renamed from: E6 */
    public final void mo19998E6(@Nullable zzdn zzdn) {
        synchronized (this.f29134c) {
            this.f29138o = zzdn;
        }
    }

    /* renamed from: Kb */
    public final void mo44164Kb(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.f29134c) {
            z2 = true;
            if (f2 == this.f29141z) {
                if (f3 == this.f29129B) {
                    z2 = false;
                }
            }
            this.f29141z = f2;
            this.f29128A = f;
            z3 = this.f29140s;
            this.f29140s = z;
            i2 = this.f29137g;
            this.f29137g = i;
            float f4 = this.f29129B;
            this.f29129B = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.f29133a.mo44027R().invalidate();
            }
        }
        if (z2) {
            try {
                zzbnm zzbnm = this.f29132E;
                if (zzbnm != null) {
                    zzbnm.mo42824b();
                }
            } catch (RemoteException e) {
                zzcgp.m45231i("#007 Could not call remote method.", e);
            }
        }
        m46145Qb(i2, i, z3, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Lb */
    public final /* synthetic */ void mo44165Lb(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        int i3;
        boolean z4;
        zzdn zzdn;
        zzdn zzdn2;
        zzdn zzdn3;
        synchronized (this.f29134c) {
            boolean z5 = this.f29139p;
            boolean z6 = false;
            if (z5 || i2 != 1) {
                i3 = i2;
                z3 = false;
            } else {
                i3 = 1;
                z3 = true;
            }
            if (i == i2 || i3 != 1) {
                z4 = false;
            } else {
                i3 = 1;
                z4 = true;
            }
            boolean z7 = i != i2 && i3 == 2;
            boolean z8 = i != i2 && i3 == 3;
            if (z5 || z3) {
                z6 = true;
            }
            this.f29139p = z6;
            if (z3) {
                try {
                    zzdn zzdn4 = this.f29138o;
                    if (zzdn4 != null) {
                        zzdn4.mo20015g();
                    }
                } catch (RemoteException e) {
                    zzcgp.m45231i("#007 Could not call remote method.", e);
                }
            }
            if (z4 && (zzdn3 = this.f29138o) != null) {
                zzdn3.mo20013e();
            }
            if (z7 && (zzdn2 = this.f29138o) != null) {
                zzdn2.mo20014f();
            }
            if (z8) {
                zzdn zzdn5 = this.f29138o;
                if (zzdn5 != null) {
                    zzdn5.mo20012b();
                }
                this.f29133a.mo43745H();
            }
            if (!(z == z2 || (zzdn = this.f29138o) == null)) {
                zzdn.mo20011A5(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Mb */
    public final /* synthetic */ void mo44166Mb(Map map) {
        this.f29133a.mo42954y("pubVideoCmd", map);
    }

    /* renamed from: Nb */
    public final void mo44167Nb(zzff zzff) {
        boolean z = zzff.f1974a;
        boolean z2 = zzff.f1975c;
        boolean z3 = zzff.f1976d;
        synchronized (this.f29134c) {
            this.f29130C = z2;
            this.f29131D = z3;
        }
        m46146Rb("initialState", CollectionUtils.m4864d("muteStart", true != z ? "0" : "1", "customControlsRequested", true != z2 ? "0" : "1", "clickToExpandRequested", true != z3 ? "0" : "1"));
    }

    /* renamed from: Ob */
    public final void mo44168Ob(float f) {
        synchronized (this.f29134c) {
            this.f29128A = f;
        }
    }

    /* renamed from: Pb */
    public final void mo44169Pb(zzbnm zzbnm) {
        synchronized (this.f29134c) {
            this.f29132E = zzbnm;
        }
    }

    /* renamed from: b */
    public final float mo19999b() {
        float f;
        synchronized (this.f29134c) {
            f = this.f29129B;
        }
        return f;
    }

    /* renamed from: c */
    public final float mo20000c() {
        float f;
        synchronized (this.f29134c) {
            f = this.f29128A;
        }
        return f;
    }

    /* renamed from: d8 */
    public final void mo20003d8(boolean z) {
        m46146Rb(true != z ? "unmute" : "mute", (Map) null);
    }

    /* renamed from: e */
    public final int mo20004e() {
        int i;
        synchronized (this.f29134c) {
            i = this.f29137g;
        }
        return i;
    }

    /* renamed from: f */
    public final float mo20001f() {
        float f;
        synchronized (this.f29134c) {
            f = this.f29141z;
        }
        return f;
    }

    @Nullable
    /* renamed from: g */
    public final zzdn mo20002g() throws RemoteException {
        zzdn zzdn;
        synchronized (this.f29134c) {
            zzdn = this.f29138o;
        }
        return zzdn;
    }

    /* renamed from: i */
    public final void mo20005i() {
        m46146Rb("pause", (Map) null);
    }

    /* renamed from: j */
    public final void mo20006j() {
        m46146Rb("play", (Map) null);
    }

    /* renamed from: l */
    public final boolean mo20007l() {
        boolean z;
        boolean m = mo20008m();
        synchronized (this.f29134c) {
            z = false;
            if (!m) {
                try {
                    if (this.f29131D && this.f29136f) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z;
    }

    /* renamed from: m */
    public final boolean mo20008m() {
        boolean z;
        synchronized (this.f29134c) {
            z = false;
            if (this.f29135d && this.f29130C) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: n */
    public final void mo20009n() {
        m46146Rb("stop", (Map) null);
    }

    /* renamed from: s */
    public final boolean mo20010s() {
        boolean z;
        synchronized (this.f29134c) {
            z = this.f29140s;
        }
        return z;
    }

    /* renamed from: u */
    public final void mo44170u() {
        boolean z;
        int i;
        synchronized (this.f29134c) {
            z = this.f29140s;
            i = this.f29137g;
            this.f29137g = 3;
        }
        m46145Qb(i, 3, z, z);
    }
}
