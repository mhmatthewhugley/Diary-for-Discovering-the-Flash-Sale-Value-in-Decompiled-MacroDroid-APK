package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzay extends zzaw {
    public zzay() {
        this.f41212a.add(zzbl.EQUALS);
        this.f41212a.add(zzbl.GREATER_THAN);
        this.f41212a.add(zzbl.GREATER_THAN_EQUALS);
        this.f41212a.add(zzbl.IDENTITY_EQUALS);
        this.f41212a.add(zzbl.IDENTITY_NOT_EQUALS);
        this.f41212a.add(zzbl.LESS_THAN);
        this.f41212a.add(zzbl.LESS_THAN_EQUALS);
        this.f41212a.add(zzbl.NOT_EQUALS);
    }

    /* renamed from: c */
    private static boolean m59503c(zzap zzap, zzap zzap2) {
        if (zzap.getClass().equals(zzap2.getClass())) {
            if ((zzap instanceof zzau) || (zzap instanceof zzan)) {
                return true;
            }
            if (zzap instanceof zzah) {
                return !Double.isNaN(zzap.mo50704e().doubleValue()) && !Double.isNaN(zzap2.mo50704e().doubleValue()) && zzap.mo50704e().doubleValue() == zzap2.mo50704e().doubleValue();
            }
            if (zzap instanceof zzat) {
                return zzap.mo50707g().equals(zzap2.mo50707g());
            }
            if (zzap instanceof zzaf) {
                return zzap.mo50706f().equals(zzap2.mo50706f());
            }
            return zzap == zzap2;
        } else if (((zzap instanceof zzau) || (zzap instanceof zzan)) && ((zzap2 instanceof zzau) || (zzap2 instanceof zzan))) {
            return true;
        } else {
            boolean z = zzap instanceof zzah;
            if (z && (zzap2 instanceof zzat)) {
                return m59503c(zzap, new zzah(zzap2.mo50704e()));
            }
            boolean z2 = zzap instanceof zzat;
            if (z2 && (zzap2 instanceof zzah)) {
                return m59503c(new zzah(zzap.mo50704e()), zzap2);
            }
            if (zzap instanceof zzaf) {
                return m59503c(new zzah(zzap.mo50704e()), zzap2);
            }
            if (zzap2 instanceof zzaf) {
                return m59503c(zzap, new zzah(zzap2.mo50704e()));
            }
            if ((z2 || z) && (zzap2 instanceof zzal)) {
                return m59503c(zzap, new zzat(zzap2.mo50707g()));
            }
            if (!(zzap instanceof zzal) || (!(zzap2 instanceof zzat) && !(zzap2 instanceof zzah))) {
                return false;
            }
            return m59503c(new zzat(zzap.mo50707g()), zzap2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r0 = (r3 > 0.0d ? 1 : (r3 == 0.0d ? 0 : -1));
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m59504d(com.google.android.gms.internal.measurement.zzap r8, com.google.android.gms.internal.measurement.zzap r9) {
        /*
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.zzal
            if (r0 == 0) goto L_0x000e
            com.google.android.gms.internal.measurement.zzat r0 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r8 = r8.mo50707g()
            r0.<init>(r8)
            r8 = r0
        L_0x000e:
            boolean r0 = r9 instanceof com.google.android.gms.internal.measurement.zzal
            if (r0 == 0) goto L_0x001c
            com.google.android.gms.internal.measurement.zzat r0 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r9 = r9.mo50707g()
            r0.<init>(r9)
            r9 = r0
        L_0x001c:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.zzat
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0037
            boolean r0 = r9 instanceof com.google.android.gms.internal.measurement.zzat
            if (r0 != 0) goto L_0x0027
            goto L_0x0037
        L_0x0027:
            java.lang.String r8 = r8.mo50707g()
            java.lang.String r9 = r9.mo50707g()
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x0036
            return r1
        L_0x0036:
            return r2
        L_0x0037:
            java.lang.Double r8 = r8.mo50704e()
            double r3 = r8.doubleValue()
            java.lang.Double r8 = r9.mo50704e()
            double r8 = r8.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L_0x006d
            boolean r0 = java.lang.Double.isNaN(r8)
            if (r0 == 0) goto L_0x0054
            goto L_0x006d
        L_0x0054:
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0065
        L_0x005e:
            if (r0 != 0) goto L_0x0066
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            return r2
        L_0x0066:
            int r8 = java.lang.Double.compare(r3, r8)
            if (r8 >= 0) goto L_0x006d
            return r1
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzay.m59504d(com.google.android.gms.internal.measurement.zzap, com.google.android.gms.internal.measurement.zzap):boolean");
    }

    /* renamed from: e */
    private static boolean m59505e(zzap zzap, zzap zzap2) {
        if (zzap instanceof zzal) {
            zzap = new zzat(zzap.mo50707g());
        }
        if (zzap2 instanceof zzal) {
            zzap2 = new zzat(zzap2.mo50707g());
        }
        if (((!(zzap instanceof zzat) || !(zzap2 instanceof zzat)) && (Double.isNaN(zzap.mo50704e().doubleValue()) || Double.isNaN(zzap2.mo50704e().doubleValue()))) || m59504d(zzap2, zzap)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final zzap mo50760a(String str, zzg zzg, List list) {
        boolean z;
        boolean c;
        zzh.m60250h(zzh.m60247e(str).name(), 2, list);
        zzap b = zzg.mo51055b((zzap) list.get(0));
        zzap b2 = zzg.mo51055b((zzap) list.get(1));
        int ordinal = zzh.m60247e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                c = m59503c(b, b2);
            } else if (ordinal == 42) {
                z = m59504d(b, b2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        z = m59504d(b2, b);
                        break;
                    case 38:
                        z = m59505e(b2, b);
                        break;
                    case 39:
                        z = zzh.m60254l(b, b2);
                        break;
                    case 40:
                        c = zzh.m60254l(b, b2);
                        break;
                    default:
                        return super.mo50761b(str);
                }
            } else {
                z = m59505e(b, b2);
            }
            z = !c;
        } else {
            z = m59503c(b, b2);
        }
        return z ? zzap.f41202n : zzap.f41203q;
    }
}
