package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzbh extends zzaw {
    protected zzbh() {
        this.f41212a.add(zzbl.FOR_IN);
        this.f41212a.add(zzbl.FOR_IN_CONST);
        this.f41212a.add(zzbl.FOR_IN_LET);
        this.f41212a.add(zzbl.FOR_LET);
        this.f41212a.add(zzbl.FOR_OF);
        this.f41212a.add(zzbl.FOR_OF_CONST);
        this.f41212a.add(zzbl.FOR_OF_LET);
        this.f41212a.add(zzbl.WHILE);
    }

    /* renamed from: c */
    private static zzap m59517c(zzbf zzbf, Iterator it, zzap zzap) {
        if (it != null) {
            while (it.hasNext()) {
                zzap c = zzbf.mo50766a((zzap) it.next()).mo51056c((zzae) zzap);
                if (c instanceof zzag) {
                    zzag zzag = (zzag) c;
                    if ("break".equals(zzag.mo50729b())) {
                        return zzap.f41197i;
                    }
                    if ("return".equals(zzag.mo50729b())) {
                        return zzag;
                    }
                }
            }
        }
        return zzap.f41197i;
    }

    /* renamed from: d */
    private static zzap m59518d(zzbf zzbf, zzap zzap, zzap zzap2) {
        return m59517c(zzbf, zzap.mo50712j(), zzap2);
    }

    /* renamed from: e */
    private static zzap m59519e(zzbf zzbf, zzap zzap, zzap zzap2) {
        if (zzap instanceof Iterable) {
            return m59517c(zzbf, ((Iterable) zzap).iterator(), zzap2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* renamed from: a */
    public final zzap mo50760a(String str, zzg zzg, List list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = zzh.m60247e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    zzh.m60250h(zzbl.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof zzat) {
                        String g = ((zzap) list.get(0)).mo50707g();
                        return m59518d(new zzbg(zzg, g), zzg.mo51055b((zzap) list.get(1)), zzg.mo51055b((zzap) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    zzh.m60250h(zzbl.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof zzat) {
                        String g2 = ((zzap) list.get(0)).mo50707g();
                        return m59518d(new zzbd(zzg, g2), zzg.mo51055b((zzap) list.get(1)), zzg.mo51055b((zzap) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    zzh.m60250h(zzbl.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof zzat) {
                        String g3 = ((zzap) list.get(0)).mo50707g();
                        return m59518d(new zzbe(zzg, g3), zzg.mo51055b((zzap) list.get(1)), zzg.mo51055b((zzap) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    zzh.m60250h(zzbl.FOR_LET.name(), 4, list);
                    zzap b = zzg.mo51055b((zzap) list.get(0));
                    if (b instanceof zzae) {
                        zzae zzae = (zzae) b;
                        zzap zzap = (zzap) list.get(1);
                        zzap zzap2 = (zzap) list.get(2);
                        zzap b2 = zzg.mo51055b((zzap) list.get(3));
                        zzg a = zzg.mo51054a();
                        for (int i = 0; i < zzae.mo50714l(); i++) {
                            String g4 = zzae.mo50715m(i).mo50707g();
                            a.mo51060g(g4, zzg.mo51057d(g4));
                        }
                        while (zzg.mo51055b(zzap).mo50706f().booleanValue()) {
                            zzap c = zzg.mo51056c((zzae) b2);
                            if (c instanceof zzag) {
                                zzag zzag = (zzag) c;
                                if ("break".equals(zzag.mo50729b())) {
                                    return zzap.f41197i;
                                }
                                if ("return".equals(zzag.mo50729b())) {
                                    return zzag;
                                }
                            }
                            zzg a2 = zzg.mo51054a();
                            for (int i2 = 0; i2 < zzae.mo50714l(); i2++) {
                                String g5 = zzae.mo50715m(i2).mo50707g();
                                a2.mo51060g(g5, a.mo51057d(g5));
                            }
                            a2.mo51055b(zzap2);
                            a = a2;
                        }
                        return zzap.f41197i;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    zzh.m60250h(zzbl.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof zzat) {
                        String g6 = ((zzap) list.get(0)).mo50707g();
                        return m59519e(new zzbg(zzg, g6), zzg.mo51055b((zzap) list.get(1)), zzg.mo51055b((zzap) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    zzh.m60250h(zzbl.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof zzat) {
                        String g7 = ((zzap) list.get(0)).mo50707g();
                        return m59519e(new zzbd(zzg, g7), zzg.mo51055b((zzap) list.get(1)), zzg.mo51055b((zzap) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    zzh.m60250h(zzbl.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof zzat) {
                        String g8 = ((zzap) list.get(0)).mo50707g();
                        return m59519e(new zzbe(zzg, g8), zzg.mo51055b((zzap) list.get(1)), zzg.mo51055b((zzap) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.mo50761b(str);
            }
        } else {
            zzh.m60250h(zzbl.WHILE.name(), 4, list);
            zzap zzap3 = (zzap) list.get(0);
            zzap zzap4 = (zzap) list.get(1);
            zzap b3 = zzg.mo51055b((zzap) list.get(3));
            if (zzg.mo51055b((zzap) list.get(2)).mo50706f().booleanValue()) {
                zzap c2 = zzg.mo51056c((zzae) b3);
                if (c2 instanceof zzag) {
                    zzag zzag2 = (zzag) c2;
                    if ("break".equals(zzag2.mo50729b())) {
                        return zzap.f41197i;
                    }
                    if ("return".equals(zzag2.mo50729b())) {
                        return zzag2;
                    }
                }
            }
            while (zzg.mo51055b(zzap3).mo50706f().booleanValue()) {
                zzap c3 = zzg.mo51056c((zzae) b3);
                if (c3 instanceof zzag) {
                    zzag zzag3 = (zzag) c3;
                    if ("break".equals(zzag3.mo50729b())) {
                        return zzap.f41197i;
                    }
                    if ("return".equals(zzag3.mo50729b())) {
                        return zzag3;
                    }
                }
                zzg.mo51055b(zzap4);
            }
            return zzap.f41197i;
        }
    }
}
