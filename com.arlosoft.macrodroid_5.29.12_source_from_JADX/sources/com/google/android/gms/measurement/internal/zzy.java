package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzey;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
abstract class zzy {

    /* renamed from: a */
    final String f47350a;

    /* renamed from: b */
    final int f47351b;

    /* renamed from: c */
    Boolean f47352c;

    /* renamed from: d */
    Boolean f47353d;

    /* renamed from: e */
    Long f47354e;

    /* renamed from: f */
    Long f47355f;

    zzy(String str, int i) {
        this.f47350a = str;
        this.f47351b = i;
    }

    /* renamed from: d */
    private static Boolean m66198d(String str, int i, boolean z, String str2, List list, String str3, zzeh zzeh) {
        if (i == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (zzeh != null) {
                        zzeh.mo55103u().mo55092b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    @VisibleForTesting
    /* renamed from: e */
    static Boolean m66199e(BigDecimal bigDecimal, zzer zzer, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.m4488k(zzer);
        if (zzer.mo50923I()) {
            boolean z = true;
            if (zzer.mo50928N() != 1) {
                if (zzer.mo50928N() == 5) {
                    if (!zzer.mo50927M() || !zzer.mo50926L()) {
                        return null;
                    }
                } else if (!zzer.mo50924J()) {
                    return null;
                }
                int N = zzer.mo50928N();
                if (zzer.mo50928N() == 5) {
                    if (zzkv.m66088N(zzer.mo50921G()) && zzkv.m66088N(zzer.mo50920E())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(zzer.mo50921G());
                            bigDecimal3 = new BigDecimal(zzer.mo50920E());
                            bigDecimal2 = bigDecimal5;
                            bigDecimal4 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                } else if (!zzkv.m66088N(zzer.mo50919D())) {
                    return null;
                } else {
                    try {
                        bigDecimal4 = new BigDecimal(zzer.mo50919D());
                        bigDecimal2 = null;
                        bigDecimal3 = null;
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (N == 5) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                }
                int i = N - 1;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4 || bigDecimal2 == null) {
                                return null;
                            }
                            if (bigDecimal.compareTo(bigDecimal2) < 0 || bigDecimal.compareTo(bigDecimal3) > 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        } else if (bigDecimal4 == null) {
                            return null;
                        } else {
                            if (d != 0.0d) {
                                if (bigDecimal.compareTo(bigDecimal4.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal4.add(new BigDecimal(d).multiply(new BigDecimal(2)))) >= 0) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            }
                            if (bigDecimal.compareTo(bigDecimal4) != 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    } else if (bigDecimal4 == null) {
                        return null;
                    } else {
                        if (bigDecimal.compareTo(bigDecimal4) <= 0) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                } else {
                    if (bigDecimal.compareTo(bigDecimal4) >= 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }
        }
        return null;
    }

    @VisibleForTesting
    /* renamed from: f */
    static Boolean m66200f(String str, zzey zzey, zzeh zzeh) {
        String str2;
        List list;
        Preconditions.m4488k(zzey);
        if (str == null || !zzey.mo50944K() || zzey.mo50945L() == 1) {
            return null;
        }
        if (zzey.mo50945L() == 7) {
            if (zzey.mo50938B() == 0) {
                return null;
            }
        } else if (!zzey.mo50943J()) {
            return null;
        }
        int L = zzey.mo50945L();
        boolean H = zzey.mo50941H();
        if (H || L == 2 || L == 7) {
            str2 = zzey.mo50939E();
        } else {
            str2 = zzey.mo50939E().toUpperCase(Locale.ENGLISH);
        }
        String str3 = str2;
        if (zzey.mo50938B() == 0) {
            list = null;
        } else {
            List<String> G = zzey.mo50940G();
            if (!H) {
                ArrayList arrayList = new ArrayList(G.size());
                for (String upperCase : G) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                G = Collections.unmodifiableList(arrayList);
            }
            list = G;
        }
        return m66198d(str, L, H, str3, list, L == 2 ? str3 : null, zzeh);
    }

    /* renamed from: g */
    static Boolean m66201g(double d, zzer zzer) {
        try {
            return m66199e(new BigDecimal(d), zzer, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    static Boolean m66202h(long j, zzer zzer) {
        try {
            return m66199e(new BigDecimal(j), zzer, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: i */
    static Boolean m66203i(String str, zzer zzer) {
        if (!zzkv.m66088N(str)) {
            return null;
        }
        try {
            return m66199e(new BigDecimal(str), zzer, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @VisibleForTesting
    /* renamed from: j */
    static Boolean m66204j(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo55632a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo55633b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo55634c();
}
