package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdsu extends zzbmx {

    /* renamed from: a */
    private final Context f33001a;

    /* renamed from: c */
    private final zzdoq f33002c;

    /* renamed from: d */
    private zzdpq f33003d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public zzdol f33004f;

    public zzdsu(Context context, zzdoq zzdoq, zzdpq zzdpq, zzdol zzdol) {
        this.f33001a = context;
        this.f33002c = zzdoq;
        this.f33003d = zzdpq;
        this.f33004f = zzdol;
    }

    /* renamed from: L3 */
    public final void mo42803L3(IObjectWrapper iObjectWrapper) {
        zzdol zzdol;
        Object A1 = ObjectWrapper.m5050A1(iObjectWrapper);
        if ((A1 instanceof View) && this.f33002c.mo44818c0() != null && (zzdol = this.f33004f) != null) {
            zzdol.mo44779j((View) A1);
        }
    }

    /* renamed from: Z */
    public final void mo42804Z(String str) {
        zzdol zzdol = this.f33004f;
        if (zzdol != null) {
            zzdol.mo44775T(str);
        }
    }

    /* renamed from: b */
    public final zzdk mo42805b() {
        return this.f33002c.mo44805R();
    }

    /* renamed from: c */
    public final zzbmb mo42806c() throws RemoteException {
        return this.f33004f.mo44761C().mo44793a();
    }

    /* renamed from: c0 */
    public final boolean mo42800c0(IObjectWrapper iObjectWrapper) {
        zzdpq zzdpq;
        Object A1 = ObjectWrapper.m5050A1(iObjectWrapper);
        if (!(A1 instanceof ViewGroup) || (zzdpq = this.f33003d) == null || !zzdpq.mo44903f((ViewGroup) A1)) {
            return false;
        }
        this.f33002c.mo44813Z().mo44018K0(new zzdst(this));
        return true;
    }

    /* renamed from: e */
    public final IObjectWrapper mo42801e() {
        return ObjectWrapper.m5051g8(this.f33001a);
    }

    /* renamed from: g */
    public final String mo42802g() {
        return this.f33002c.mo44826g0();
    }

    /* renamed from: i */
    public final List mo42807i() {
        SimpleArrayMap P = this.f33002c.mo44803P();
        SimpleArrayMap Q = this.f33002c.mo44804Q();
        String[] strArr = new String[(P.size() + Q.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < P.size()) {
            strArr[i3] = (String) P.keyAt(i2);
            i2++;
            i3++;
        }
        while (i < Q.size()) {
            strArr[i3] = (String) Q.keyAt(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    /* renamed from: j */
    public final void mo42808j() {
        zzdol zzdol = this.f33004f;
        if (zzdol != null) {
            zzdol.mo44439a();
        }
        this.f33004f = null;
        this.f33003d = null;
    }

    /* renamed from: k */
    public final void mo42809k() {
        String a = this.f33002c.mo44814a();
        if ("Google".equals(a)) {
            zzcgp.m45229g("Illegal argument specified for omid partner name.");
        } else if (TextUtils.isEmpty(a)) {
            zzcgp.m45229g("Not starting OMID session. OM partner name has not been configured.");
        } else {
            zzdol zzdol = this.f33004f;
            if (zzdol != null) {
                zzdol.mo44767L(a, false);
            }
        }
    }

    /* renamed from: l */
    public final void mo42810l() {
        zzdol zzdol = this.f33004f;
        if (zzdol != null) {
            zzdol.mo44778i();
        }
    }

    /* renamed from: p */
    public final boolean mo42811p() {
        IObjectWrapper c0 = this.f33002c.mo44818c0();
        if (c0 != null) {
            zzt.m2888a().mo45295d0(c0);
            if (this.f33002c.mo44812Y() == null) {
                return true;
            }
            this.f33002c.mo44812Y().mo42954y("onSdkLoaded", new ArrayMap());
            return true;
        }
        zzcgp.m45229g("Trying to start OMID session before creation.");
        return false;
    }

    /* renamed from: s */
    public final boolean mo42812s() {
        zzdol zzdol = this.f33004f;
        if ((zzdol == null || zzdol.mo44791v()) && this.f33002c.mo44812Y() != null && this.f33002c.mo44813Z() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: z0 */
    public final zzbme mo42813z0(String str) {
        return (zzbme) this.f33002c.mo44803P().get(str);
    }

    /* renamed from: z1 */
    public final String mo42814z1(String str) {
        return (String) this.f33002c.mo44804Q().get(str);
    }
}
