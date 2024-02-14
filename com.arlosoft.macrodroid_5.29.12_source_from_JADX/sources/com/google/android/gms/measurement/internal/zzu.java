package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfq;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zznz;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzu {

    /* renamed from: a */
    private String f47336a;

    /* renamed from: b */
    private boolean f47337b;

    /* renamed from: c */
    private zzgi f47338c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public BitSet f47339d;

    /* renamed from: e */
    private BitSet f47340e;

    /* renamed from: f */
    private Map f47341f;

    /* renamed from: g */
    private Map f47342g;

    /* renamed from: h */
    final /* synthetic */ zzaa f47343h;

    /* synthetic */ zzu(zzaa zzaa, String str, zzt zzt) {
        this.f47343h = zzaa;
        this.f47336a = str;
        this.f47337b = true;
        this.f47339d = new BitSet();
        this.f47340e = new BitSet();
        this.f47341f = new ArrayMap();
        this.f47342g = new ArrayMap();
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public final zzfp mo55629a(int i) {
        ArrayList arrayList;
        List list;
        zzfo C = zzfp.m59814C();
        C.mo50985t(i);
        C.mo50987v(this.f47337b);
        zzgi zzgi = this.f47338c;
        if (zzgi != null) {
            C.mo50988x(zzgi);
        }
        zzgh H = zzgi.m60151H();
        H.mo51203u(zzkv.m66086H(this.f47339d));
        H.mo51205x(zzkv.m66086H(this.f47340e));
        Map map = this.f47341f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer intValue : this.f47341f.keySet()) {
                int intValue2 = intValue.intValue();
                Long l = (Long) this.f47341f.get(Integer.valueOf(intValue2));
                if (l != null) {
                    zzfq D = zzfr.m59830D();
                    D.mo50997u(intValue2);
                    D.mo50996t(l.longValue());
                    arrayList2.add((zzfr) D.mo51441o());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            H.mo51202t(arrayList);
        }
        Map map2 = this.f47342g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.f47342g.keySet()) {
                zzgj E = zzgk.m60179E();
                E.mo51219u(num.intValue());
                List list2 = (List) this.f47342g.get(num);
                if (list2 != null) {
                    Collections.sort(list2);
                    E.mo51218t(list2);
                }
                arrayList3.add((zzgk) E.mo51441o());
            }
            list = arrayList3;
        }
        H.mo51204v(list);
        C.mo50986u(H);
        return (zzfp) C.mo51441o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo55630c(@NonNull zzy zzy) {
        int a = zzy.mo55632a();
        Boolean bool = zzy.f47352c;
        if (bool != null) {
            this.f47340e.set(a, bool.booleanValue());
        }
        Boolean bool2 = zzy.f47353d;
        if (bool2 != null) {
            this.f47339d.set(a, bool2.booleanValue());
        }
        if (zzy.f47354e != null) {
            Map map = this.f47341f;
            Integer valueOf = Integer.valueOf(a);
            Long l = (Long) map.get(valueOf);
            long longValue = zzy.f47354e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f47341f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (zzy.f47355f != null) {
            Map map2 = this.f47342g;
            Integer valueOf2 = Integer.valueOf(a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f47342g.put(valueOf2, list);
            }
            if (zzy.mo55634c()) {
                list.clear();
            }
            zznz.m61044b();
            zzag x = this.f47343h.f46899a.mo55219x();
            String str = this.f47336a;
            zzdt zzdt = zzdu.f46594Y;
            if (x.mo54919A(str, zzdt) && zzy.mo55633b()) {
                list.clear();
            }
            zznz.m61044b();
            if (this.f47343h.f46899a.mo55219x().mo54919A(this.f47336a, zzdt)) {
                Long valueOf3 = Long.valueOf(zzy.f47355f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(zzy.f47355f.longValue() / 1000));
        }
    }

    /* synthetic */ zzu(zzaa zzaa, String str, zzgi zzgi, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzt zzt) {
        this.f47343h = zzaa;
        this.f47336a = str;
        this.f47339d = bitSet;
        this.f47340e = bitSet2;
        this.f47341f = map;
        this.f47342g = new ArrayMap();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f47342g.put(num, arrayList);
        }
        this.f47337b = false;
        this.f47338c = zzgi;
    }
}
