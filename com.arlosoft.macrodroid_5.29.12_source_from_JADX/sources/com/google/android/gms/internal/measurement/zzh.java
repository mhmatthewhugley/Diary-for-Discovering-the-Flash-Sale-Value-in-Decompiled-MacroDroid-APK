package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.mail.UIDFolder;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzh {
    /* renamed from: a */
    public static double m60243a(double d) {
        int i;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || i == 0) {
            return d;
        }
        return ((double) (i > 0 ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    /* renamed from: b */
    public static int m60244b(double d) {
        int i;
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((long) ((((double) (i > 0 ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d));
    }

    /* renamed from: c */
    public static int m60245c(zzg zzg) {
        int b = m60244b(zzg.mo51057d("runtime.counter").mo50704e().doubleValue() + 1.0d);
        if (b <= 1000000) {
            zzg.mo51060g("runtime.counter", new zzah(Double.valueOf((double) b)));
            return b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    /* renamed from: d */
    public static long m60246d(double d) {
        return ((long) m60244b(d)) & UIDFolder.MAXUID;
    }

    /* renamed from: e */
    public static zzbl m60247e(String str) {
        zzbl zzbl = null;
        if (str != null && !str.isEmpty()) {
            zzbl = zzbl.m59524b(Integer.parseInt(str));
        }
        if (zzbl != null) {
            return zzbl;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    /* renamed from: f */
    public static Object m60248f(zzap zzap) {
        if (zzap.f41198j.equals(zzap)) {
            return null;
        }
        if (zzap.f41197i.equals(zzap)) {
            return "";
        }
        if (zzap instanceof zzam) {
            return m60249g((zzam) zzap);
        }
        if (zzap instanceof zzae) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((zzae) zzap).iterator();
            while (it.hasNext()) {
                Object f = m60248f((zzap) it.next());
                if (f != null) {
                    arrayList.add(f);
                }
            }
            return arrayList;
        } else if (!zzap.mo50704e().isNaN()) {
            return zzap.mo50704e();
        } else {
            return zzap.mo50707g();
        }
    }

    /* renamed from: g */
    public static Map m60249g(zzam zzam) {
        HashMap hashMap = new HashMap();
        for (String str : zzam.mo50741a()) {
            Object f = m60248f(zzam.mo50701W(str));
            if (f != null) {
                hashMap.put(str, f);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public static void m60250h(String str, int i, List list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: i */
    public static void m60251i(String str, int i, List list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: j */
    public static void m60252j(String str, int i, List list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: k */
    public static boolean m60253k(zzap zzap) {
        if (zzap == null) {
            return false;
        }
        Double e = zzap.mo50704e();
        if (e.isNaN() || e.doubleValue() < 0.0d || !e.equals(Double.valueOf(Math.floor(e.doubleValue())))) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m60254l(zzap zzap, zzap zzap2) {
        if (!zzap.getClass().equals(zzap2.getClass())) {
            return false;
        }
        if ((zzap instanceof zzau) || (zzap instanceof zzan)) {
            return true;
        }
        if (zzap instanceof zzah) {
            if (Double.isNaN(zzap.mo50704e().doubleValue()) || Double.isNaN(zzap2.mo50704e().doubleValue())) {
                return false;
            }
            return zzap.mo50704e().equals(zzap2.mo50704e());
        } else if (zzap instanceof zzat) {
            return zzap.mo50707g().equals(zzap2.mo50707g());
        } else {
            if (zzap instanceof zzaf) {
                return zzap.mo50706f().equals(zzap2.mo50706f());
            }
            if (zzap == zzap2) {
                return true;
            }
            return false;
        }
    }
}
