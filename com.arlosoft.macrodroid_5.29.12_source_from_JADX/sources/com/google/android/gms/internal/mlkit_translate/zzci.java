package com.google.android.gms.internal.mlkit_translate;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzci extends AbstractMap implements Serializable {

    /* renamed from: a */
    private static final Comparator f43187a = new zzcb();
    final Comparator zza;
    zzch zzb;
    int zzc = 0;
    int zzd = 0;
    final zzch zze = new zzch();
    private zzcd zzg;
    private zzcf zzh;

    public zzci() {
        Comparator comparator = f43187a;
        this.zza = comparator;
    }

    /* renamed from: f */
    private final void m61664f(zzch zzch, boolean z) {
        while (zzch != null) {
            zzch zzch2 = zzch.f43180c;
            zzch zzch3 = zzch.f43181d;
            int i = 0;
            int i2 = zzch2 != null ? zzch2.f43186s : 0;
            int i3 = zzch3 != null ? zzch3.f43186s : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                zzch zzch4 = zzch3.f43180c;
                zzch zzch5 = zzch3.f43181d;
                int i5 = zzch5 != null ? zzch5.f43186s : 0;
                if (zzch4 != null) {
                    i = zzch4.f43186s;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    m61666h(zzch);
                } else {
                    m61667i(zzch3);
                    m61666h(zzch);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                zzch zzch6 = zzch2.f43180c;
                zzch zzch7 = zzch2.f43181d;
                int i7 = zzch7 != null ? zzch7.f43186s : 0;
                if (zzch6 != null) {
                    i = zzch6.f43186s;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m61667i(zzch);
                } else {
                    m61666h(zzch2);
                    m61667i(zzch);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                zzch.f43186s = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                zzch.f43186s = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            zzch = zzch.f43179a;
        }
    }

    /* renamed from: g */
    private final void m61665g(zzch zzch, zzch zzch2) {
        zzch zzch3 = zzch.f43179a;
        zzch.f43179a = null;
        if (zzch2 != null) {
            zzch2.f43179a = zzch3;
        }
        if (zzch3 == null) {
            this.zzb = zzch2;
        } else if (zzch3.f43180c == zzch) {
            zzch3.f43180c = zzch2;
        } else {
            zzch3.f43181d = zzch2;
        }
    }

    /* renamed from: h */
    private final void m61666h(zzch zzch) {
        zzch zzch2 = zzch.f43180c;
        zzch zzch3 = zzch.f43181d;
        zzch zzch4 = zzch3.f43180c;
        zzch zzch5 = zzch3.f43181d;
        zzch.f43181d = zzch4;
        if (zzch4 != null) {
            zzch4.f43179a = zzch;
        }
        m61665g(zzch, zzch3);
        zzch3.f43180c = zzch;
        zzch.f43179a = zzch3;
        int i = 0;
        int max = Math.max(zzch2 != null ? zzch2.f43186s : 0, zzch4 != null ? zzch4.f43186s : 0) + 1;
        zzch.f43186s = max;
        if (zzch5 != null) {
            i = zzch5.f43186s;
        }
        zzch3.f43186s = Math.max(max, i) + 1;
    }

    /* renamed from: i */
    private final void m61667i(zzch zzch) {
        zzch zzch2 = zzch.f43180c;
        zzch zzch3 = zzch.f43181d;
        zzch zzch4 = zzch2.f43180c;
        zzch zzch5 = zzch2.f43181d;
        zzch.f43180c = zzch5;
        if (zzch5 != null) {
            zzch5.f43179a = zzch;
        }
        m61665g(zzch, zzch2);
        zzch2.f43181d = zzch;
        zzch.f43179a = zzch2;
        int i = 0;
        int max = Math.max(zzch3 != null ? zzch3.f43186s : 0, zzch5 != null ? zzch5.f43186s : 0) + 1;
        zzch.f43186s = max;
        if (zzch4 != null) {
            i = zzch4.f43186s;
        }
        zzch2.f43186s = Math.max(max, i) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzch mo52153a(Object obj, boolean z) {
        int i;
        zzch zzch;
        Comparator comparator = this.zza;
        zzch zzch2 = this.zzb;
        if (zzch2 != null) {
            Comparable comparable = comparator == f43187a ? (Comparable) obj : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(zzch2.f43184o);
                } else {
                    i = comparator.compare(obj, zzch2.f43184o);
                }
                if (i == 0) {
                    return zzch2;
                }
                zzch zzch3 = i < 0 ? zzch2.f43180c : zzch2.f43181d;
                if (zzch3 == null) {
                    break;
                }
                zzch2 = zzch3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        zzch zzch4 = this.zze;
        if (zzch2 != null) {
            zzch = new zzch(zzch2, obj, zzch4, zzch4.f43183g);
            if (i < 0) {
                zzch2.f43180c = zzch;
            } else {
                zzch2.f43181d = zzch;
            }
            m61664f(zzch2, true);
        } else if (comparator != f43187a || (obj instanceof Comparable)) {
            zzch = new zzch((zzch) null, obj, zzch4, zzch4.f43183g);
            this.zzb = zzch;
        } else {
            throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
        }
        this.zzc++;
        this.zzd++;
        return zzch;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final zzch mo52154b(Map.Entry entry) {
        zzch c = mo52155c(entry.getKey());
        if (c == null) {
            return null;
        }
        Object obj = c.f43185p;
        Object value = entry.getValue();
        if (obj == value || (obj != null && obj.equals(value))) {
            return c;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final zzch mo52155c(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo52153a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final void clear() {
        this.zzb = null;
        this.zzc = 0;
        this.zzd++;
        zzch zzch = this.zze;
        zzch.f43183g = zzch;
        zzch.f43182f = zzch;
    }

    public final boolean containsKey(Object obj) {
        return mo52155c(obj) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final zzch mo52158d(Object obj) {
        zzch c = mo52155c(obj);
        if (c != null) {
            mo52159e(c, true);
        }
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo52159e(zzch zzch, boolean z) {
        zzch zzch2;
        int i;
        zzch zzch3;
        if (z) {
            zzch zzch4 = zzch.f43183g;
            zzch4.f43182f = zzch.f43182f;
            zzch.f43182f.f43183g = zzch4;
        }
        zzch zzch5 = zzch.f43180c;
        zzch zzch6 = zzch.f43181d;
        zzch zzch7 = zzch.f43179a;
        int i2 = 0;
        if (zzch5 == null || zzch6 == null) {
            if (zzch5 != null) {
                m61665g(zzch, zzch5);
                zzch.f43180c = null;
            } else if (zzch6 != null) {
                m61665g(zzch, zzch6);
                zzch.f43181d = null;
            } else {
                m61665g(zzch, (zzch) null);
            }
            m61664f(zzch7, false);
            this.zzc--;
            this.zzd++;
            return;
        }
        if (zzch5.f43186s > zzch6.f43186s) {
            do {
                zzch2 = zzch5;
                zzch5 = zzch5.f43181d;
            } while (zzch5 != null);
        } else {
            do {
                zzch zzch8 = zzch6;
                zzch6 = zzch6.f43180c;
                zzch3 = zzch8;
            } while (zzch6 != null);
            zzch2 = zzch3;
        }
        mo52159e(zzch2, false);
        zzch zzch9 = zzch.f43180c;
        if (zzch9 != null) {
            i = zzch9.f43186s;
            zzch2.f43180c = zzch9;
            zzch9.f43179a = zzch2;
            zzch.f43180c = null;
        } else {
            i = 0;
        }
        zzch zzch10 = zzch.f43181d;
        if (zzch10 != null) {
            i2 = zzch10.f43186s;
            zzch2.f43181d = zzch10;
            zzch10.f43179a = zzch2;
            zzch.f43181d = null;
        }
        zzch2.f43186s = Math.max(i, i2) + 1;
        m61665g(zzch, zzch2);
    }

    public final Set entrySet() {
        zzcd zzcd = this.zzg;
        if (zzcd != null) {
            return zzcd;
        }
        zzcd zzcd2 = new zzcd(this);
        this.zzg = zzcd2;
        return zzcd2;
    }

    public final Object get(Object obj) {
        zzch c = mo52155c(obj);
        if (c != null) {
            return c.f43185p;
        }
        return null;
    }

    public final Set keySet() {
        zzcf zzcf = this.zzh;
        if (zzcf != null) {
            return zzcf;
        }
        zzcf zzcf2 = new zzcf(this);
        this.zzh = zzcf2;
        return zzcf2;
    }

    public final Object put(Object obj, Object obj2) {
        Objects.requireNonNull(obj, "key == null");
        zzch a = mo52153a(obj, true);
        Object obj3 = a.f43185p;
        a.f43185p = obj2;
        return obj3;
    }

    public final Object remove(Object obj) {
        zzch d = mo52158d(obj);
        if (d != null) {
            return d.f43185p;
        }
        return null;
    }

    public final int size() {
        return this.zzc;
    }
}
