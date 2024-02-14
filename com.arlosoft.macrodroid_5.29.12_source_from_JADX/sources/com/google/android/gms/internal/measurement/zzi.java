package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzi {
    /* renamed from: a */
    public static zzap m60291a(zzgy zzgy) {
        if (zzgy == null) {
            return zzap.f41197i;
        }
        int L = zzgy.mo51256L() - 1;
        if (L != 1) {
            if (L != 2) {
                if (L != 3) {
                    if (L == 4) {
                        List<zzgy> G = zzgy.mo51251G();
                        ArrayList arrayList = new ArrayList();
                        for (zzgy a : G) {
                            arrayList.add(m60291a(a));
                        }
                        return new zzaq(zzgy.mo51249D(), arrayList);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                } else if (zzgy.mo51253I()) {
                    return new zzaf(Boolean.valueOf(zzgy.mo51252H()));
                } else {
                    return new zzaf((Boolean) null);
                }
            } else if (zzgy.mo51254J()) {
                return new zzah(Double.valueOf(zzgy.mo51248B()));
            } else {
                return new zzah((Double) null);
            }
        } else if (zzgy.mo51255K()) {
            return new zzat(zzgy.mo51250E());
        } else {
            return zzap.f41204r;
        }
    }

    /* renamed from: b */
    public static zzap m60292b(Object obj) {
        if (obj == null) {
            return zzap.f41198j;
        }
        if (obj instanceof String) {
            return new zzat((String) obj);
        }
        if (obj instanceof Double) {
            return new zzah((Double) obj);
        }
        if (obj instanceof Long) {
            return new zzah(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new zzah(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new zzaf((Boolean) obj);
        }
        if (obj instanceof Map) {
            zzam zzam = new zzam();
            Map map = (Map) obj;
            for (Object next : map.keySet()) {
                zzap b = m60292b(map.get(next));
                if (next != null) {
                    if (!(next instanceof String)) {
                        next = next.toString();
                    }
                    zzam.mo50710i((String) next, b);
                }
            }
            return zzam;
        } else if (obj instanceof List) {
            zzae zzae = new zzae();
            for (Object b2 : (List) obj) {
                zzae.mo50723u(zzae.mo50714l(), m60292b(b2));
            }
            return zzae;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
