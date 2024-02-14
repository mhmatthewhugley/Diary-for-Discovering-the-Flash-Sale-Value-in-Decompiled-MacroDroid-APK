package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdoq {

    /* renamed from: a */
    private int f32645a;

    /* renamed from: b */
    private zzdk f32646b;

    /* renamed from: c */
    private zzblw f32647c;

    /* renamed from: d */
    private View f32648d;

    /* renamed from: e */
    private List f32649e;

    /* renamed from: f */
    private List f32650f = Collections.emptyList();

    /* renamed from: g */
    private zzef f32651g;

    /* renamed from: h */
    private Bundle f32652h;

    /* renamed from: i */
    private zzcmp f32653i;

    /* renamed from: j */
    private zzcmp f32654j;
    @Nullable

    /* renamed from: k */
    private zzcmp f32655k;
    @Nullable

    /* renamed from: l */
    private IObjectWrapper f32656l;

    /* renamed from: m */
    private View f32657m;

    /* renamed from: n */
    private View f32658n;

    /* renamed from: o */
    private IObjectWrapper f32659o;

    /* renamed from: p */
    private double f32660p;

    /* renamed from: q */
    private zzbme f32661q;

    /* renamed from: r */
    private zzbme f32662r;

    /* renamed from: s */
    private String f32663s;

    /* renamed from: t */
    private final SimpleArrayMap f32664t = new SimpleArrayMap();

    /* renamed from: u */
    private final SimpleArrayMap f32665u = new SimpleArrayMap();

    /* renamed from: v */
    private float f32666v;
    @Nullable

    /* renamed from: w */
    private String f32667w;

    @Nullable
    /* renamed from: C */
    public static zzdoq m47711C(zzbvv zzbvv) {
        try {
            zzdop G = m47715G(zzbvv.mo43099Z8(), (zzbvz) null);
            zzblw ia = zzbvv.mo43103ia();
            String l = zzbvv.mo43106l();
            List Kb = zzbvv.mo43095Kb();
            String k = zzbvv.mo43105k();
            Bundle c = zzbvv.mo43102c();
            String n = zzbvv.mo43108n();
            IObjectWrapper j = zzbvv.mo43104j();
            String s = zzbvv.mo43110s();
            String m = zzbvv.mo43107m();
            double b = zzbvv.mo43100b();
            zzbme sb = zzbvv.mo43111sb();
            zzdoq zzdoq = new zzdoq();
            zzdoq.f32645a = 2;
            zzdoq.f32646b = G;
            zzdoq.f32647c = ia;
            zzdoq.f32648d = (View) m47717I(zzbvv.mo43093Ib());
            zzdoq.mo44841u("headline", l);
            zzdoq.f32649e = Kb;
            zzdoq.mo44841u("body", k);
            zzdoq.f32652h = c;
            zzdoq.mo44841u("call_to_action", n);
            zzdoq.f32657m = (View) m47717I(zzbvv.mo43094Jb());
            zzdoq.f32659o = j;
            zzdoq.mo44841u("store", s);
            zzdoq.mo44841u("price", m);
            zzdoq.f32660p = b;
            zzdoq.f32661q = sb;
            return zzdoq;
        } catch (RemoteException e) {
            zzcgp.m45230h("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    @Nullable
    /* renamed from: D */
    public static zzdoq m47712D(zzbvw zzbvw) {
        try {
            zzdop G = m47715G(zzbvw.mo43120Z8(), (zzbvz) null);
            zzblw ia = zzbvw.mo43123ia();
            String l = zzbvw.mo43126l();
            List Kb = zzbvw.mo43115Kb();
            String k = zzbvw.mo43125k();
            Bundle b = zzbvw.mo43121b();
            String n = zzbvw.mo43127n();
            IObjectWrapper Jb = zzbvw.mo43113Jb();
            String j = zzbvw.mo43124j();
            zzbme sb = zzbvw.mo43129sb();
            zzdoq zzdoq = new zzdoq();
            zzdoq.f32645a = 1;
            zzdoq.f32646b = G;
            zzdoq.f32647c = ia;
            zzdoq.f32648d = (View) m47717I(zzbvw.mo43122g());
            zzdoq.mo44841u("headline", l);
            zzdoq.f32649e = Kb;
            zzdoq.mo44841u("body", k);
            zzdoq.f32652h = b;
            zzdoq.mo44841u("call_to_action", n);
            zzdoq.f32657m = (View) m47717I(zzbvw.mo43112Ib());
            zzdoq.f32659o = Jb;
            zzdoq.mo44841u("advertiser", j);
            zzdoq.f32662r = sb;
            return zzdoq;
        } catch (RemoteException e) {
            zzcgp.m45230h("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    @Nullable
    /* renamed from: E */
    public static zzdoq m47713E(zzbvv zzbvv) {
        try {
            return m47716H(m47715G(zzbvv.mo43099Z8(), (zzbvz) null), zzbvv.mo43103ia(), (View) m47717I(zzbvv.mo43093Ib()), zzbvv.mo43106l(), zzbvv.mo43095Kb(), zzbvv.mo43105k(), zzbvv.mo43102c(), zzbvv.mo43108n(), (View) m47717I(zzbvv.mo43094Jb()), zzbvv.mo43104j(), zzbvv.mo43110s(), zzbvv.mo43107m(), zzbvv.mo43100b(), zzbvv.mo43111sb(), (String) null, 0.0f);
        } catch (RemoteException e) {
            zzcgp.m45230h("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    @Nullable
    /* renamed from: F */
    public static zzdoq m47714F(zzbvw zzbvw) {
        try {
            return m47716H(m47715G(zzbvw.mo43120Z8(), (zzbvz) null), zzbvw.mo43123ia(), (View) m47717I(zzbvw.mo43122g()), zzbvw.mo43126l(), zzbvw.mo43115Kb(), zzbvw.mo43125k(), zzbvw.mo43121b(), zzbvw.mo43127n(), (View) m47717I(zzbvw.mo43112Ib()), zzbvw.mo43113Jb(), (String) null, (String) null, -1.0d, zzbvw.mo43129sb(), zzbvw.mo43124j(), 0.0f);
        } catch (RemoteException e) {
            zzcgp.m45230h("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    @Nullable
    /* renamed from: G */
    private static zzdop m47715G(zzdk zzdk, @Nullable zzbvz zzbvz) {
        if (zzdk == null) {
            return null;
        }
        return new zzdop(zzdk, zzbvz);
    }

    /* renamed from: H */
    private static zzdoq m47716H(zzdk zzdk, zzblw zzblw, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbme zzbme, String str6, float f) {
        zzdoq zzdoq = new zzdoq();
        zzdoq.f32645a = 6;
        zzdoq.f32646b = zzdk;
        zzdoq.f32647c = zzblw;
        zzdoq.f32648d = view;
        String str7 = str;
        zzdoq.mo44841u("headline", str);
        zzdoq.f32649e = list;
        String str8 = str2;
        zzdoq.mo44841u("body", str2);
        zzdoq.f32652h = bundle;
        String str9 = str3;
        zzdoq.mo44841u("call_to_action", str3);
        zzdoq.f32657m = view2;
        zzdoq.f32659o = iObjectWrapper;
        String str10 = str4;
        zzdoq.mo44841u("store", str4);
        String str11 = str5;
        zzdoq.mo44841u("price", str5);
        zzdoq.f32660p = d;
        zzdoq.f32661q = zzbme;
        zzdoq.mo44841u("advertiser", str6);
        zzdoq.mo44836p(f);
        return zzdoq;
    }

    /* renamed from: I */
    private static Object m47717I(@Nullable IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.m5050A1(iObjectWrapper);
    }

    @Nullable
    /* renamed from: a0 */
    public static zzdoq m47718a0(zzbvz zzbvz) {
        try {
            return m47716H(m47715G(zzbvz.mo43141h(), zzbvz), zzbvz.mo43142i(), (View) m47717I(zzbvz.mo43144k()), zzbvz.mo43148p(), zzbvz.mo43153w(), zzbvz.mo43151s(), zzbvz.mo43140g(), zzbvz.mo43149q(), (View) m47717I(zzbvz.mo43147n()), zzbvz.mo43145l(), zzbvz.mo43152u(), zzbvz.mo43150r(), zzbvz.mo43135b(), zzbvz.mo43143j(), zzbvz.mo43146m(), zzbvz.mo43137c());
        } catch (RemoteException e) {
            zzcgp.m45230h("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    /* renamed from: A */
    public final synchronized double mo44795A() {
        return this.f32660p;
    }

    /* renamed from: B */
    public final synchronized void mo44796B(IObjectWrapper iObjectWrapper) {
        this.f32656l = iObjectWrapper;
    }

    /* renamed from: J */
    public final synchronized float mo44797J() {
        return this.f32666v;
    }

    /* renamed from: K */
    public final synchronized int mo44798K() {
        return this.f32645a;
    }

    /* renamed from: L */
    public final synchronized Bundle mo44799L() {
        if (this.f32652h == null) {
            this.f32652h = new Bundle();
        }
        return this.f32652h;
    }

    /* renamed from: M */
    public final synchronized View mo44800M() {
        return this.f32648d;
    }

    /* renamed from: N */
    public final synchronized View mo44801N() {
        return this.f32657m;
    }

    /* renamed from: O */
    public final synchronized View mo44802O() {
        return this.f32658n;
    }

    /* renamed from: P */
    public final synchronized SimpleArrayMap mo44803P() {
        return this.f32664t;
    }

    /* renamed from: Q */
    public final synchronized SimpleArrayMap mo44804Q() {
        return this.f32665u;
    }

    /* renamed from: R */
    public final synchronized zzdk mo44805R() {
        return this.f32646b;
    }

    @Nullable
    /* renamed from: S */
    public final synchronized zzef mo44806S() {
        return this.f32651g;
    }

    /* renamed from: T */
    public final synchronized zzblw mo44807T() {
        return this.f32647c;
    }

    @Nullable
    /* renamed from: U */
    public final zzbme mo44808U() {
        List list = this.f32649e;
        if (list != null && !list.isEmpty()) {
            Object obj = this.f32649e.get(0);
            if (obj instanceof IBinder) {
                return zzbmd.m43695Jb((IBinder) obj);
            }
        }
        return null;
    }

    /* renamed from: V */
    public final synchronized zzbme mo44809V() {
        return this.f32661q;
    }

    /* renamed from: W */
    public final synchronized zzbme mo44810W() {
        return this.f32662r;
    }

    /* renamed from: X */
    public final synchronized zzcmp mo44811X() {
        return this.f32654j;
    }

    @Nullable
    /* renamed from: Y */
    public final synchronized zzcmp mo44812Y() {
        return this.f32655k;
    }

    /* renamed from: Z */
    public final synchronized zzcmp mo44813Z() {
        return this.f32653i;
    }

    @Nullable
    /* renamed from: a */
    public final synchronized String mo44814a() {
        return this.f32667w;
    }

    /* renamed from: b */
    public final synchronized String mo44815b() {
        return mo44819d("price");
    }

    /* renamed from: b0 */
    public final synchronized IObjectWrapper mo44816b0() {
        return this.f32659o;
    }

    /* renamed from: c */
    public final synchronized String mo44817c() {
        return mo44819d("store");
    }

    @Nullable
    /* renamed from: c0 */
    public final synchronized IObjectWrapper mo44818c0() {
        return this.f32656l;
    }

    /* renamed from: d */
    public final synchronized String mo44819d(String str) {
        return (String) this.f32665u.get(str);
    }

    /* renamed from: d0 */
    public final synchronized String mo44820d0() {
        return mo44819d("advertiser");
    }

    /* renamed from: e */
    public final synchronized List mo44821e() {
        return this.f32649e;
    }

    /* renamed from: e0 */
    public final synchronized String mo44822e0() {
        return mo44819d("body");
    }

    /* renamed from: f */
    public final synchronized List mo44823f() {
        return this.f32650f;
    }

    /* renamed from: f0 */
    public final synchronized String mo44824f0() {
        return mo44819d("call_to_action");
    }

    /* renamed from: g */
    public final synchronized void mo44825g() {
        zzcmp zzcmp = this.f32653i;
        if (zzcmp != null) {
            zzcmp.destroy();
            this.f32653i = null;
        }
        zzcmp zzcmp2 = this.f32654j;
        if (zzcmp2 != null) {
            zzcmp2.destroy();
            this.f32654j = null;
        }
        zzcmp zzcmp3 = this.f32655k;
        if (zzcmp3 != null) {
            zzcmp3.destroy();
            this.f32655k = null;
        }
        this.f32656l = null;
        this.f32664t.clear();
        this.f32665u.clear();
        this.f32646b = null;
        this.f32647c = null;
        this.f32648d = null;
        this.f32649e = null;
        this.f32652h = null;
        this.f32657m = null;
        this.f32658n = null;
        this.f32659o = null;
        this.f32661q = null;
        this.f32662r = null;
        this.f32663s = null;
    }

    /* renamed from: g0 */
    public final synchronized String mo44826g0() {
        return this.f32663s;
    }

    /* renamed from: h */
    public final synchronized void mo44827h(zzblw zzblw) {
        this.f32647c = zzblw;
    }

    /* renamed from: h0 */
    public final synchronized String mo44828h0() {
        return mo44819d("headline");
    }

    /* renamed from: i */
    public final synchronized void mo44829i(String str) {
        this.f32663s = str;
    }

    /* renamed from: j */
    public final synchronized void mo44830j(@Nullable zzef zzef) {
        this.f32651g = zzef;
    }

    /* renamed from: k */
    public final synchronized void mo44831k(zzbme zzbme) {
        this.f32661q = zzbme;
    }

    /* renamed from: l */
    public final synchronized void mo44832l(String str, zzblq zzblq) {
        if (zzblq == null) {
            this.f32664t.remove(str);
        } else {
            this.f32664t.put(str, zzblq);
        }
    }

    /* renamed from: m */
    public final synchronized void mo44833m(zzcmp zzcmp) {
        this.f32654j = zzcmp;
    }

    /* renamed from: n */
    public final synchronized void mo44834n(List list) {
        this.f32649e = list;
    }

    /* renamed from: o */
    public final synchronized void mo44835o(zzbme zzbme) {
        this.f32662r = zzbme;
    }

    /* renamed from: p */
    public final synchronized void mo44836p(float f) {
        this.f32666v = f;
    }

    /* renamed from: q */
    public final synchronized void mo44837q(List list) {
        this.f32650f = list;
    }

    /* renamed from: r */
    public final synchronized void mo44838r(zzcmp zzcmp) {
        this.f32655k = zzcmp;
    }

    /* renamed from: s */
    public final synchronized void mo44839s(@Nullable String str) {
        this.f32667w = str;
    }

    /* renamed from: t */
    public final synchronized void mo44840t(double d) {
        this.f32660p = d;
    }

    /* renamed from: u */
    public final synchronized void mo44841u(String str, String str2) {
        if (str2 == null) {
            this.f32665u.remove(str);
        } else {
            this.f32665u.put(str, str2);
        }
    }

    /* renamed from: v */
    public final synchronized void mo44842v(int i) {
        this.f32645a = i;
    }

    /* renamed from: w */
    public final synchronized void mo44843w(zzdk zzdk) {
        this.f32646b = zzdk;
    }

    /* renamed from: x */
    public final synchronized void mo44844x(View view) {
        this.f32657m = view;
    }

    /* renamed from: y */
    public final synchronized void mo44845y(zzcmp zzcmp) {
        this.f32653i = zzcmp;
    }

    /* renamed from: z */
    public final synchronized void mo44846z(View view) {
        this.f32658n = view;
    }
}
