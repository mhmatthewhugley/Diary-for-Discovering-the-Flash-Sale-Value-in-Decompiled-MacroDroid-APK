package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzbk extends zzaw {
    protected zzbk() {
        this.f41212a.add(zzbl.ASSIGN);
        this.f41212a.add(zzbl.CONST);
        this.f41212a.add(zzbl.CREATE_ARRAY);
        this.f41212a.add(zzbl.CREATE_OBJECT);
        this.f41212a.add(zzbl.EXPRESSION_LIST);
        this.f41212a.add(zzbl.GET);
        this.f41212a.add(zzbl.GET_INDEX);
        this.f41212a.add(zzbl.GET_PROPERTY);
        this.f41212a.add(zzbl.NULL);
        this.f41212a.add(zzbl.SET_PROPERTY);
        this.f41212a.add(zzbl.TYPEOF);
        this.f41212a.add(zzbl.UNDEFINED);
        this.f41212a.add(zzbl.VAR);
    }

    /* renamed from: a */
    public final zzap mo50760a(String str, zzg zzg, List list) {
        String str2;
        zzbl zzbl = zzbl.ADD;
        int ordinal = zzh.m60247e(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            zzh.m60250h(zzbl.ASSIGN.name(), 2, list);
            zzap b = zzg.mo51055b((zzap) list.get(0));
            if (!(b instanceof zzat)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{b.getClass().getCanonicalName()}));
            } else if (zzg.mo51061h(b.mo50707g())) {
                zzap b2 = zzg.mo51055b((zzap) list.get(1));
                zzg.mo51060g(b.mo50707g(), b2);
                return b2;
            } else {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{b.mo50707g()}));
            }
        } else if (ordinal == 14) {
            zzh.m60251i(zzbl.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                int i2 = 0;
                while (i2 < list.size() - 1) {
                    zzap b3 = zzg.mo51055b((zzap) list.get(i2));
                    if (b3 instanceof zzat) {
                        zzg.mo51059f(b3.mo50707g(), zzg.mo51055b((zzap) list.get(i2 + 1)));
                        i2 += 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{b3.getClass().getCanonicalName()}));
                    }
                }
                return zzap.f41197i;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
        } else if (ordinal == 24) {
            zzh.m60251i(zzbl.EXPRESSION_LIST.name(), 1, list);
            zzap zzap = zzap.f41197i;
            while (i < list.size()) {
                zzap = zzg.mo51055b((zzap) list.get(i));
                if (!(zzap instanceof zzag)) {
                    i++;
                } else {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
            }
            return zzap;
        } else if (ordinal == 33) {
            zzh.m60250h(zzbl.GET.name(), 1, list);
            zzap b4 = zzg.mo51055b((zzap) list.get(0));
            if (b4 instanceof zzat) {
                return zzg.mo51057d(b4.mo50707g());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{b4.getClass().getCanonicalName()}));
        } else if (ordinal == 49) {
            zzh.m60250h(zzbl.NULL.name(), 0, list);
            return zzap.f41198j;
        } else if (ordinal == 58) {
            zzh.m60250h(zzbl.SET_PROPERTY.name(), 3, list);
            zzap b5 = zzg.mo51055b((zzap) list.get(0));
            zzap b6 = zzg.mo51055b((zzap) list.get(1));
            zzap b7 = zzg.mo51055b((zzap) list.get(2));
            if (b5 == zzap.f41197i || b5 == zzap.f41198j) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{b6.mo50707g(), b5.mo50707g()}));
            }
            if ((b5 instanceof zzae) && (b6 instanceof zzah)) {
                ((zzae) b5).mo50723u(b6.mo50704e().intValue(), b7);
            } else if (b5 instanceof zzal) {
                ((zzal) b5).mo50710i(b6.mo50707g(), b7);
            }
            return b7;
        } else if (ordinal != 17) {
            if (ordinal != 18) {
                if (ordinal == 35 || ordinal == 36) {
                    zzh.m60250h(zzbl.GET_PROPERTY.name(), 2, list);
                    zzap b8 = zzg.mo51055b((zzap) list.get(0));
                    zzap b9 = zzg.mo51055b((zzap) list.get(1));
                    if ((b8 instanceof zzae) && zzh.m60253k(b9)) {
                        return ((zzae) b8).mo50715m(b9.mo50704e().intValue());
                    }
                    if (b8 instanceof zzal) {
                        return ((zzal) b8).mo50701W(b9.mo50707g());
                    }
                    if (b8 instanceof zzat) {
                        if ("length".equals(b9.mo50707g())) {
                            return new zzah(Double.valueOf((double) b8.mo50707g().length()));
                        }
                        if (zzh.m60253k(b9) && b9.mo50704e().doubleValue() < ((double) b8.mo50707g().length())) {
                            return new zzat(String.valueOf(b8.mo50707g().charAt(b9.mo50704e().intValue())));
                        }
                    }
                    return zzap.f41197i;
                }
                switch (ordinal) {
                    case 62:
                        zzh.m60250h(zzbl.TYPEOF.name(), 1, list);
                        zzap b10 = zzg.mo51055b((zzap) list.get(0));
                        if (b10 instanceof zzau) {
                            str2 = "undefined";
                        } else if (b10 instanceof zzaf) {
                            str2 = TypedValues.Custom.S_BOOLEAN;
                        } else if (b10 instanceof zzah) {
                            str2 = "number";
                        } else if (b10 instanceof zzat) {
                            str2 = TypedValues.Custom.S_STRING;
                        } else if (b10 instanceof zzao) {
                            str2 = "function";
                        } else if ((b10 instanceof zzaq) || (b10 instanceof zzag)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{b10}));
                        } else {
                            str2 = "object";
                        }
                        return new zzat(str2);
                    case 63:
                        zzh.m60250h(zzbl.UNDEFINED.name(), 0, list);
                        return zzap.f41197i;
                    case 64:
                        zzh.m60251i(zzbl.VAR.name(), 1, list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            zzap b11 = zzg.mo51055b((zzap) it.next());
                            if (b11 instanceof zzat) {
                                zzg.mo51058e(b11.mo50707g(), zzap.f41197i);
                            } else {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{b11.getClass().getCanonicalName()}));
                            }
                        }
                        return zzap.f41197i;
                    default:
                        return super.mo50761b(str);
                }
            } else if (list.isEmpty()) {
                return new zzam();
            } else {
                if (list.size() % 2 == 0) {
                    zzam zzam = new zzam();
                    while (i < list.size() - 1) {
                        zzap b12 = zzg.mo51055b((zzap) list.get(i));
                        zzap b13 = zzg.mo51055b((zzap) list.get(i + 1));
                        if ((b12 instanceof zzag) || (b13 instanceof zzag)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        zzam.mo50710i(b12.mo50707g(), b13);
                        i += 2;
                    }
                    return zzam;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            }
        } else if (list.isEmpty()) {
            return new zzae();
        } else {
            zzae zzae = new zzae();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                zzap b14 = zzg.mo51055b((zzap) it2.next());
                if (!(b14 instanceof zzag)) {
                    zzae.mo50723u(i, b14);
                    i++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return zzae;
        }
    }
}
