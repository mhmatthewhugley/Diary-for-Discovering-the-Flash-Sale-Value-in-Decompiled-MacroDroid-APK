package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzafl implements zzzi {

    /* renamed from: E */
    public static final zzzp f24265E = zzafh.f24248b;

    /* renamed from: F */
    private static final byte[] f24266F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: G */
    private static final zzaf f24267G;

    /* renamed from: A */
    private zzzl f24268A;

    /* renamed from: B */
    private zzaap[] f24269B;

    /* renamed from: C */
    private zzaap[] f24270C;

    /* renamed from: D */
    private boolean f24271D;

    /* renamed from: a */
    private final List f24272a;

    /* renamed from: b */
    private final SparseArray f24273b;

    /* renamed from: c */
    private final zzef f24274c;

    /* renamed from: d */
    private final zzef f24275d;

    /* renamed from: e */
    private final zzef f24276e;

    /* renamed from: f */
    private final byte[] f24277f;

    /* renamed from: g */
    private final zzef f24278g;

    /* renamed from: h */
    private final zzacg f24279h;

    /* renamed from: i */
    private final zzef f24280i;

    /* renamed from: j */
    private final ArrayDeque f24281j;

    /* renamed from: k */
    private final ArrayDeque f24282k;

    /* renamed from: l */
    private int f24283l;

    /* renamed from: m */
    private int f24284m;

    /* renamed from: n */
    private long f24285n;

    /* renamed from: o */
    private int f24286o;
    @Nullable

    /* renamed from: p */
    private zzef f24287p;

    /* renamed from: q */
    private long f24288q;

    /* renamed from: r */
    private int f24289r;

    /* renamed from: s */
    private long f24290s;

    /* renamed from: t */
    private long f24291t;

    /* renamed from: u */
    private long f24292u;
    @Nullable

    /* renamed from: v */
    private zzafk f24293v;

    /* renamed from: w */
    private int f24294w;

    /* renamed from: x */
    private int f24295x;

    /* renamed from: y */
    private int f24296y;

    /* renamed from: z */
    private boolean f24297z;

    static {
        zzad zzad = new zzad();
        zzad.mo41343s("application/x-emsg");
        f24267G = zzad.mo41349y();
    }

    public zzafl() {
        this(0, (zzel) null);
    }

    /* renamed from: b */
    private static int m41265b(int i) throws zzbu {
        if (i >= 0) {
            return i;
        }
        throw zzbu.m44135a("Unexpected negative value: " + i, (Throwable) null);
    }

    @Nullable
    /* renamed from: c */
    private static zzx m41266c(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            zzaew zzaew = (zzaew) list.get(i);
            if (zzaew.f24180a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] h = zzaew.f24179b.mo45232h();
                UUID a = zzafs.m41294a(h);
                if (a == null) {
                    zzdw.m48255e("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzw(a, (String) null, "video/mp4", h));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzx((List) arrayList);
    }

    /* renamed from: e */
    private final void m41267e() {
        this.f24283l = 0;
        this.f24286o = 0;
    }

    /* renamed from: f */
    private static void m41268f(zzef zzef, int i, zzafx zzafx) throws zzbu {
        zzef.mo45230f(i + 8);
        int m = zzef.mo45237m() & ViewCompat.MEASURED_SIZE_MASK;
        if ((m & 1) == 0) {
            boolean z = (m & 2) != 0;
            int v = zzef.mo45246v();
            if (v == 0) {
                Arrays.fill(zzafx.f24364l, 0, zzafx.f24357e, false);
                return;
            }
            int i2 = zzafx.f24357e;
            if (v == i2) {
                Arrays.fill(zzafx.f24364l, 0, v, z);
                zzafx.mo41441a(zzef.mo45233i());
                zzef zzef2 = zzafx.f24366n;
                zzef.mo45226b(zzef2.mo45232h(), 0, zzef2.mo45236l());
                zzafx.f24366n.mo45230f(0);
                zzafx.f24367o = false;
                return;
            }
            throw zzbu.m44135a("Senc sample count " + v + " is different from fragment sample count" + i2, (Throwable) null);
        }
        throw zzbu.m44137c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* renamed from: i */
    private final void m41269i(long j) throws zzbu {
        zzafl zzafl;
        int i;
        zzaev zzaev;
        int i2;
        SparseArray sparseArray;
        byte[] bArr;
        int i3;
        byte[] bArr2;
        byte[] bArr3;
        int i4;
        boolean z;
        zzafx zzafx;
        zzaev zzaev2;
        int i5;
        int i6;
        byte[] bArr4;
        zzaev zzaev3;
        int i7;
        int i8;
        List list;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j2;
        zzafg zzafg;
        int i19;
        int i20;
        int i21;
        int i22;
        zzafl zzafl2 = this;
        while (!zzafl2.f24281j.isEmpty() && ((zzaev) zzafl2.f24281j.peek()).f24176b == j) {
            zzaev zzaev4 = (zzaev) zzafl2.f24281j.pop();
            int i23 = zzaev4.f24180a;
            int i24 = 12;
            int i25 = 8;
            if (i23 == 1836019574) {
                zzx c = m41266c(zzaev4.f24177c);
                zzaev c2 = zzaev4.mo41415c(1836475768);
                Objects.requireNonNull(c2);
                SparseArray sparseArray2 = new SparseArray();
                int size = c2.f24177c.size();
                long j3 = -9223372036854775807L;
                int i26 = 0;
                while (i26 < size) {
                    zzaew zzaew = (zzaew) c2.f24177c.get(i26);
                    int i27 = zzaew.f24180a;
                    if (i27 == 1953654136) {
                        zzef zzef = zzaew.f24179b;
                        zzef.mo45230f(i24);
                        Pair create = Pair.create(Integer.valueOf(zzef.mo45237m()), new zzafg(zzef.mo45237m() - 1, zzef.mo45237m(), zzef.mo45237m(), zzef.mo45237m()));
                        sparseArray2.put(((Integer) create.first).intValue(), (zzafg) create.second);
                    } else if (i27 == 1835362404) {
                        zzef zzef2 = zzaew.f24179b;
                        zzef2.mo45230f(8);
                        j3 = zzaex.m41221a(zzef2.mo45237m()) == 0 ? zzef2.mo45217A() : zzef2.mo45218B();
                    }
                    i26++;
                    i24 = 12;
                }
                List c3 = zzaff.m41240c(zzaev4, new zzzx(), j3, c, false, false, new zzafi(zzafl2));
                int size2 = c3.size();
                if (zzafl2.f24273b.size() == 0) {
                    for (int i28 = 0; i28 < size2; i28++) {
                        zzafy zzafy = (zzafy) c3.get(i28);
                        zzafv zzafv = zzafy.f24370a;
                        zzafl2.f24273b.put(zzafv.f24337a, new zzafk(zzafl2.f24268A.mo41256k(i28, zzafv.f24338b), zzafy, m41270j(sparseArray2, zzafv.f24337a)));
                        zzafl2.f24291t = Math.max(zzafl2.f24291t, zzafv.f24341e);
                    }
                    zzafl2.f24268A.mo41255j0();
                } else {
                    zzdd.m47212f(zzafl2.f24273b.size() == size2);
                    for (int i29 = 0; i29 < size2; i29++) {
                        zzafy zzafy2 = (zzafy) c3.get(i29);
                        zzafv zzafv2 = zzafy2.f24370a;
                        ((zzafk) zzafl2.f24273b.get(zzafv2.f24337a)).mo41437h(zzafy2, m41270j(sparseArray2, zzafv2.f24337a));
                    }
                }
            } else {
                if (i23 == 1836019558) {
                    SparseArray sparseArray3 = zzafl2.f24273b;
                    byte[] bArr5 = zzafl2.f24277f;
                    int size3 = zzaev4.f24178d.size();
                    int i30 = 0;
                    while (i30 < size3) {
                        zzaev zzaev5 = (zzaev) zzaev4.f24178d.get(i30);
                        if (zzaev5.f24180a == 1953653094) {
                            zzaew d = zzaev5.mo41416d(1952868452);
                            Objects.requireNonNull(d);
                            zzef zzef3 = d.f24179b;
                            zzef3.mo45230f(i25);
                            int m = zzef3.mo45237m() & ViewCompat.MEASURED_SIZE_MASK;
                            zzafk zzafk = (zzafk) sparseArray3.get(zzef3.mo45237m());
                            if (zzafk == null) {
                                zzafk = null;
                            } else {
                                if ((m & 1) != 0) {
                                    long B = zzef3.mo45218B();
                                    zzafx zzafx2 = zzafk.f24254b;
                                    zzafx2.f24354b = B;
                                    zzafx2.f24355c = B;
                                }
                                zzafg zzafg2 = zzafk.f24257e;
                                if ((m & 2) != 0) {
                                    i19 = zzef3.mo45237m() - 1;
                                } else {
                                    i19 = zzafg2.f24244a;
                                }
                                if ((m & 8) != 0) {
                                    i20 = zzef3.mo45237m();
                                } else {
                                    i20 = zzafg2.f24245b;
                                }
                                if ((m & 16) != 0) {
                                    i21 = zzef3.mo45237m();
                                } else {
                                    i21 = zzafg2.f24246c;
                                }
                                if ((m & 32) != 0) {
                                    i22 = zzef3.mo45237m();
                                } else {
                                    i22 = zzafg2.f24247d;
                                }
                                zzafk.f24254b.f24353a = new zzafg(i19, i20, i21, i22);
                            }
                            if (zzafk != null) {
                                zzafx zzafx3 = zzafk.f24254b;
                                long j4 = zzafx3.f24368p;
                                boolean z2 = zzafx3.f24369q;
                                zzafk.mo41438i();
                                zzafk.f24264l = true;
                                zzaew d2 = zzaev5.mo41416d(1952867444);
                                if (d2 != null) {
                                    zzef zzef4 = d2.f24179b;
                                    zzef4.mo45230f(i25);
                                    zzafx3.f24368p = zzaex.m41221a(zzef4.mo45237m()) == 1 ? zzef4.mo45218B() : zzef4.mo45217A();
                                    zzafx3.f24369q = true;
                                } else {
                                    zzafx3.f24368p = j4;
                                    zzafx3.f24369q = z2;
                                }
                                List list2 = zzaev5.f24177c;
                                int size4 = list2.size();
                                int i31 = 0;
                                int i32 = 0;
                                int i33 = 0;
                                while (true) {
                                    i3 = 1953658222;
                                    if (i31 >= size4) {
                                        break;
                                    }
                                    zzaew zzaew2 = (zzaew) list2.get(i31);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (zzaew2.f24180a == 1953658222) {
                                        zzef zzef5 = zzaew2.f24179b;
                                        zzef5.mo45230f(12);
                                        int v = zzef5.mo45246v();
                                        if (v > 0) {
                                            i33 += v;
                                            i32++;
                                        }
                                    }
                                    i31++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                zzafk.f24260h = 0;
                                zzafk.f24259g = 0;
                                zzafk.f24258f = 0;
                                zzafx zzafx4 = zzafk.f24254b;
                                zzafx4.f24356d = i32;
                                zzafx4.f24357e = i33;
                                if (zzafx4.f24359g.length < i32) {
                                    zzafx4.f24358f = new long[i32];
                                    zzafx4.f24359g = new int[i32];
                                }
                                if (zzafx4.f24360h.length < i33) {
                                    int i34 = (i33 * 125) / 100;
                                    zzafx4.f24360h = new int[i34];
                                    zzafx4.f24361i = new long[i34];
                                    zzafx4.f24362j = new boolean[i34];
                                    zzafx4.f24364l = new boolean[i34];
                                }
                                int i35 = 0;
                                int i36 = 0;
                                int i37 = 0;
                                while (true) {
                                    long j5 = 0;
                                    if (i35 >= size4) {
                                        break;
                                    }
                                    zzaew zzaew3 = (zzaew) list2.get(i35);
                                    if (zzaew3.f24180a == i3) {
                                        zzef zzef6 = zzaew3.f24179b;
                                        zzef6.mo45230f(8);
                                        int m2 = zzef6.mo45237m() & ViewCompat.MEASURED_SIZE_MASK;
                                        list = list2;
                                        zzafv zzafv3 = zzafk.f24256d.f24370a;
                                        i8 = size3;
                                        zzafx zzafx5 = zzafk.f24254b;
                                        i7 = size4;
                                        zzafg zzafg3 = zzafx5.f24353a;
                                        int i38 = zzen.f34500a;
                                        int i39 = i37 + 1;
                                        zzafx5.f24359g[i37] = zzef6.mo45246v();
                                        long[] jArr = zzafx5.f24358f;
                                        zzaev3 = zzaev4;
                                        bArr4 = bArr5;
                                        long j6 = zzafx5.f24354b;
                                        jArr[i37] = j6;
                                        if ((m2 & 1) != 0) {
                                            i6 = i35;
                                            jArr[i37] = j6 + ((long) zzef6.mo45237m());
                                        } else {
                                            i6 = i35;
                                        }
                                        int i40 = m2 & 4;
                                        int i41 = zzafg3.f24247d;
                                        if (i40 != 0) {
                                            i41 = zzef6.mo45237m();
                                        }
                                        int i42 = m2 & 256;
                                        int i43 = m2 & 512;
                                        int i44 = m2 & 1024;
                                        int i45 = m2 & 2048;
                                        int i46 = i41;
                                        long[] jArr2 = zzafv3.f24344h;
                                        if (jArr2 != null) {
                                            i5 = i30;
                                            zzaev2 = zzaev5;
                                            if (jArr2.length == 1 && jArr2[0] == 0) {
                                                j5 = ((long[]) zzen.m49166h(zzafv3.f24345i))[0];
                                            }
                                        } else {
                                            i5 = i30;
                                            zzaev2 = zzaev5;
                                        }
                                        int[] iArr = zzafx5.f24360h;
                                        long[] jArr3 = zzafx5.f24361i;
                                        boolean[] zArr = zzafx5.f24362j;
                                        zzafx = zzafx3;
                                        int i47 = zzafx5.f24359g[i37] + i36;
                                        boolean[] zArr2 = zArr;
                                        long j7 = zzafv3.f24339c;
                                        int i48 = i36;
                                        long[] jArr4 = jArr3;
                                        long j8 = zzafx5.f24368p;
                                        while (i48 < i47) {
                                            if (i42 != 0) {
                                                i9 = i42;
                                                i10 = zzef6.mo45237m();
                                            } else {
                                                i9 = i42;
                                                i10 = zzafg3.f24245b;
                                            }
                                            m41265b(i10);
                                            if (i43 != 0) {
                                                i11 = i43;
                                                i12 = zzef6.mo45237m();
                                            } else {
                                                i11 = i43;
                                                i12 = zzafg3.f24246c;
                                            }
                                            m41265b(i12);
                                            if (i44 != 0) {
                                                i13 = i40;
                                                i14 = zzef6.mo45237m();
                                            } else {
                                                i13 = i40;
                                                if (i48 == 0) {
                                                    if (i40 != 0) {
                                                        i14 = i46;
                                                        i48 = 0;
                                                    } else {
                                                        i48 = 0;
                                                    }
                                                }
                                                i14 = zzafg3.f24247d;
                                            }
                                            if (i45 != 0) {
                                                i17 = i47;
                                                i16 = i44;
                                                i15 = i45;
                                                i18 = zzef6.mo45237m();
                                            } else {
                                                i17 = i47;
                                                i16 = i44;
                                                i15 = i45;
                                                i18 = 0;
                                            }
                                            long g0 = zzen.m49165g0((((long) i18) + j8) - j5, 1000000, j7);
                                            jArr4[i48] = g0;
                                            if (!zzafx5.f24369q) {
                                                zzafg = zzafg3;
                                                j2 = j7;
                                                jArr4[i48] = g0 + zzafk.f24256d.f24377h;
                                            } else {
                                                zzafg = zzafg3;
                                                j2 = j7;
                                            }
                                            iArr[i48] = i12;
                                            zArr2[i48] = 1 == (((i14 >> 16) & 1) ^ 1);
                                            j8 += (long) i10;
                                            i48++;
                                            zzafg3 = zzafg;
                                            j7 = j2;
                                            i42 = i9;
                                            i43 = i11;
                                            i40 = i13;
                                            i47 = i17;
                                            i44 = i16;
                                            i45 = i15;
                                        }
                                        zzafx5.f24368p = j8;
                                        i37 = i39;
                                        i36 = i47;
                                    } else {
                                        i6 = i35;
                                        zzaev3 = zzaev4;
                                        bArr4 = bArr5;
                                        zzafx = zzafx3;
                                        list = list2;
                                        i8 = size3;
                                        int i49 = i36;
                                        i5 = i30;
                                        i7 = size4;
                                        zzaev2 = zzaev5;
                                    }
                                    i35 = i6 + 1;
                                    list2 = list;
                                    size3 = i8;
                                    size4 = i7;
                                    zzaev4 = zzaev3;
                                    bArr5 = bArr4;
                                    i30 = i5;
                                    zzaev5 = zzaev2;
                                    zzafx3 = zzafx;
                                    i3 = 1953658222;
                                }
                                zzaev = zzaev4;
                                byte[] bArr6 = bArr5;
                                i2 = size3;
                                i = i30;
                                zzafv zzafv4 = zzafk.f24256d.f24370a;
                                zzafx zzafx6 = zzafx3;
                                zzafg zzafg4 = zzafx6.f24353a;
                                Objects.requireNonNull(zzafg4);
                                zzafw a = zzafv4.mo41440a(zzafg4.f24244a);
                                zzaev zzaev6 = zzaev5;
                                zzaew d3 = zzaev6.mo41416d(1935763834);
                                if (d3 != null) {
                                    Objects.requireNonNull(a);
                                    zzef zzef7 = d3.f24179b;
                                    int i50 = a.f24351d;
                                    zzef7.mo45230f(8);
                                    if ((zzef7.mo45237m() & 1) == 1) {
                                        zzef7.mo45231g(8);
                                    }
                                    int s = zzef7.mo45243s();
                                    int v2 = zzef7.mo45246v();
                                    int i51 = zzafx6.f24357e;
                                    if (v2 <= i51) {
                                        if (s == 0) {
                                            boolean[] zArr3 = zzafx6.f24364l;
                                            i4 = 0;
                                            for (int i52 = 0; i52 < v2; i52++) {
                                                int s2 = zzef7.mo45243s();
                                                i4 += s2;
                                                zArr3[i52] = s2 > i50;
                                            }
                                            z = false;
                                        } else {
                                            boolean z3 = s > i50;
                                            i4 = s * v2;
                                            z = false;
                                            Arrays.fill(zzafx6.f24364l, 0, v2, z3);
                                        }
                                        Arrays.fill(zzafx6.f24364l, v2, zzafx6.f24357e, z);
                                        if (i4 > 0) {
                                            zzafx6.mo41441a(i4);
                                        }
                                    } else {
                                        throw zzbu.m44135a("Saiz sample count " + v2 + " is greater than fragment sample count" + i51, (Throwable) null);
                                    }
                                }
                                zzaew d4 = zzaev6.mo41416d(1935763823);
                                if (d4 != null) {
                                    zzef zzef8 = d4.f24179b;
                                    zzef8.mo45230f(8);
                                    int m3 = zzef8.mo45237m();
                                    if ((m3 & 1) == 1) {
                                        zzef8.mo45231g(8);
                                    }
                                    int v3 = zzef8.mo45246v();
                                    if (v3 == 1) {
                                        zzafx6.f24355c += zzaex.m41221a(m3) == 0 ? zzef8.mo45217A() : zzef8.mo45218B();
                                    } else {
                                        throw zzbu.m44135a("Unexpected saio entry count: " + v3, (Throwable) null);
                                    }
                                }
                                zzaew d5 = zzaev6.mo41416d(1936027235);
                                if (d5 != null) {
                                    m41268f(d5.f24179b, 0, zzafx6);
                                }
                                String str = a != null ? a.f24349b : null;
                                zzef zzef9 = null;
                                zzef zzef10 = null;
                                for (int i53 = 0; i53 < zzaev6.f24177c.size(); i53++) {
                                    zzaew zzaew4 = (zzaew) zzaev6.f24177c.get(i53);
                                    zzef zzef11 = zzaew4.f24179b;
                                    int i54 = zzaew4.f24180a;
                                    if (i54 == 1935828848) {
                                        zzef11.mo45230f(12);
                                        if (zzef11.mo45237m() == 1936025959) {
                                            zzef9 = zzef11;
                                        }
                                    } else if (i54 == 1936158820) {
                                        zzef11.mo45230f(12);
                                        if (zzef11.mo45237m() == 1936025959) {
                                            zzef10 = zzef11;
                                        }
                                    }
                                }
                                if (zzef9 != null && zzef10 != null) {
                                    zzef9.mo45230f(8);
                                    int m4 = zzef9.mo45237m();
                                    zzef9.mo45231g(4);
                                    if (zzaex.m41221a(m4) == 1) {
                                        zzef9.mo45231g(4);
                                    }
                                    if (zzef9.mo45237m() == 1) {
                                        zzef10.mo45230f(8);
                                        int a2 = zzaex.m41221a(zzef10.mo45237m());
                                        zzef10.mo45231g(4);
                                        if (a2 == 1) {
                                            if (zzef10.mo45217A() == 0) {
                                                throw zzbu.m44137c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (a2 >= 2) {
                                            zzef10.mo45231g(4);
                                        }
                                        if (zzef10.mo45217A() == 1) {
                                            zzef10.mo45231g(1);
                                            int s3 = zzef10.mo45243s();
                                            int i55 = (s3 & 240) >> 4;
                                            int i56 = s3 & 15;
                                            if (zzef10.mo45243s() == 1) {
                                                int s4 = zzef10.mo45243s();
                                                byte[] bArr7 = new byte[16];
                                                zzef10.mo45226b(bArr7, 0, 16);
                                                if (s4 == 0) {
                                                    int s5 = zzef10.mo45243s();
                                                    byte[] bArr8 = new byte[s5];
                                                    zzef10.mo45226b(bArr8, 0, s5);
                                                    bArr3 = bArr8;
                                                } else {
                                                    bArr3 = null;
                                                }
                                                zzafx6.f24363k = true;
                                                zzafx6.f24365m = new zzafw(true, str, s4, bArr7, i55, i56, bArr3);
                                            }
                                        } else {
                                            throw zzbu.m44137c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                    } else {
                                        throw zzbu.m44137c("Entry count in sbgp != 1 (unsupported).");
                                    }
                                }
                                int size5 = zzaev6.f24177c.size();
                                int i57 = 0;
                                while (i57 < size5) {
                                    zzaew zzaew5 = (zzaew) zzaev6.f24177c.get(i57);
                                    if (zzaew5.f24180a == 1970628964) {
                                        zzef zzef12 = zzaew5.f24179b;
                                        zzef12.mo45230f(8);
                                        bArr2 = bArr6;
                                        zzef12.mo45226b(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, f24266F)) {
                                            m41268f(zzef12, 16, zzafx6);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i57++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                bArr5 = bArr;
                                size3 = i2;
                                zzaev4 = zzaev;
                                i25 = 8;
                                i30 = i + 1;
                                sparseArray3 = sparseArray;
                            }
                        }
                        sparseArray = sparseArray3;
                        zzaev = zzaev4;
                        i2 = size3;
                        i = i30;
                        bArr = bArr5;
                        bArr5 = bArr;
                        size3 = i2;
                        zzaev4 = zzaev;
                        i25 = 8;
                        i30 = i + 1;
                        sparseArray3 = sparseArray;
                    }
                    zzx c4 = m41266c(zzaev4.f24177c);
                    zzafl = this;
                    if (c4 != null) {
                        int size6 = zzafl.f24273b.size();
                        for (int i58 = 0; i58 < size6; i58++) {
                            zzafk zzafk2 = (zzafk) zzafl.f24273b.valueAt(i58);
                            zzafv zzafv5 = zzafk2.f24256d.f24370a;
                            zzafg zzafg5 = zzafk2.f24254b.f24353a;
                            int i59 = zzen.f34500a;
                            zzafw a3 = zzafv5.mo41440a(zzafg5.f24244a);
                            zzx b = c4.mo48362b(a3 != null ? a3.f24349b : null);
                            zzad b2 = zzafk2.f24256d.f24370a.f24342f.mo41422b();
                            b2.mo41320b(b);
                            zzafk2.f24253a.mo41214d(b2.mo41349y());
                        }
                    }
                    if (zzafl.f24290s != -9223372036854775807L) {
                        int size7 = zzafl.f24273b.size();
                        for (int i60 = 0; i60 < size7; i60++) {
                            zzafk zzafk3 = (zzafk) zzafl.f24273b.valueAt(i60);
                            long j9 = zzafl.f24290s;
                            int i61 = zzafk3.f24258f;
                            while (true) {
                                zzafx zzafx7 = zzafk3.f24254b;
                                if (i61 >= zzafx7.f24357e || zzafx7.f24361i[i61] >= j9) {
                                } else {
                                    if (zzafx7.f24362j[i61]) {
                                        zzafk3.f24261i = i61;
                                    }
                                    i61++;
                                }
                            }
                        }
                        zzafl.f24290s = -9223372036854775807L;
                    }
                } else {
                    zzafl = zzafl2;
                    zzaev zzaev7 = zzaev4;
                    if (!zzafl.f24281j.isEmpty()) {
                        ((zzaev) zzafl.f24281j.peek()).mo41417e(zzaev7);
                    }
                }
                zzafl2 = zzafl;
            }
        }
        zzafl zzafl3 = zzafl2;
        m41267e();
    }

    /* renamed from: j */
    private static final zzafg m41270j(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzafg) sparseArray.valueAt(0);
        }
        zzafg zzafg = (zzafg) sparseArray.get(i);
        Objects.requireNonNull(zzafg);
        return zzafg;
    }

    /* renamed from: a */
    public final boolean mo41227a(zzzj zzzj) throws IOException {
        return zzafu.m41295a(zzzj);
    }

    /* renamed from: d */
    public final void mo41228d(zzzl zzzl) {
        this.f24268A = zzzl;
        m41267e();
        zzaap[] zzaapArr = new zzaap[2];
        this.f24269B = zzaapArr;
        int i = 0;
        zzaap[] zzaapArr2 = (zzaap[]) zzen.m49131F(zzaapArr, 0);
        this.f24269B = zzaapArr2;
        for (zzaap d : zzaapArr2) {
            d.mo41214d(f24267G);
        }
        this.f24270C = new zzaap[this.f24272a.size()];
        int i2 = 100;
        while (i < this.f24270C.length) {
            int i3 = i2 + 1;
            zzaap k = this.f24268A.mo41256k(i2, 3);
            k.mo41214d((zzaf) this.f24272a.get(i));
            this.f24270C[i] = k;
            i++;
            i2 = i3;
        }
    }

    /* renamed from: g */
    public final void mo41229g(long j, long j2) {
        int size = this.f24273b.size();
        for (int i = 0; i < size; i++) {
            ((zzafk) this.f24273b.valueAt(i)).mo41438i();
        }
        this.f24282k.clear();
        this.f24289r = 0;
        this.f24290s = j2;
        this.f24281j.clear();
        m41267e();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: com.google.android.gms.internal.ads.zzafk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v73, resolved type: com.google.android.gms.internal.ads.zzafk} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo41230h(com.google.android.gms.internal.ads.zzzj r34, com.google.android.gms.internal.ads.zzaai r35) throws java.io.IOException {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
        L_0x0004:
            int r2 = r0.f24283l
            r3 = 1701671783(0x656d7367, float:7.0083103E22)
            r4 = 1936286840(0x73696478, float:1.8491255E31)
            r5 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L_0x053b
            java.lang.String r10 = "FragmentedMp4Extractor"
            if (r2 == r8) goto L_0x02fb
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 3
            if (r2 == r5) goto L_0x029b
            com.google.android.gms.internal.ads.zzafk r2 = r0.f24293v
            if (r2 != 0) goto L_0x0099
            android.util.SparseArray r2 = r0.f24273b
            int r13 = r2.size()
            r14 = r3
            r3 = r7
            r4 = 0
        L_0x002b:
            if (r4 >= r13) goto L_0x0061
            java.lang.Object r16 = r2.valueAt(r4)
            r5 = r16
            com.google.android.gms.internal.ads.zzafk r5 = (com.google.android.gms.internal.ads.zzafk) r5
            boolean r16 = r5.f24264l
            if (r16 != 0) goto L_0x0043
            int r11 = r5.f24258f
            com.google.android.gms.internal.ads.zzafy r6 = r5.f24256d
            int r6 = r6.f24371b
            if (r11 == r6) goto L_0x005d
        L_0x0043:
            boolean r6 = r5.f24264l
            if (r6 == 0) goto L_0x0052
            int r6 = r5.f24260h
            com.google.android.gms.internal.ads.zzafx r11 = r5.f24254b
            int r11 = r11.f24356d
            if (r6 != r11) goto L_0x0052
            goto L_0x005d
        L_0x0052:
            long r18 = r5.mo41434d()
            int r6 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r6 >= 0) goto L_0x005d
            r3 = r5
            r14 = r18
        L_0x005d:
            int r4 = r4 + 1
            r5 = 2
            goto L_0x002b
        L_0x0061:
            if (r3 != 0) goto L_0x007e
            long r2 = r0.f24288q
            long r4 = r34.mo41252c()
            long r2 = r2 - r4
            int r3 = (int) r2
            if (r3 < 0) goto L_0x0077
            r2 = r1
            com.google.android.gms.internal.ads.zzyy r2 = (com.google.android.gms.internal.ads.zzyy) r2
            r2.mo48459p(r3, r9)
            r33.m41267e()
            goto L_0x0004
        L_0x0077:
            java.lang.String r1 = "Offset to end of mdat was negative."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r7)
            throw r1
        L_0x007e:
            long r4 = r3.mo41434d()
            long r13 = r34.mo41252c()
            long r4 = r4 - r13
            int r2 = (int) r4
            if (r2 >= 0) goto L_0x0090
            java.lang.String r2 = "Ignoring negative offset to sample data."
            com.google.android.gms.internal.ads.zzdw.m48255e(r10, r2)
            r2 = 0
        L_0x0090:
            r4 = r1
            com.google.android.gms.internal.ads.zzyy r4 = (com.google.android.gms.internal.ads.zzyy) r4
            r4.mo48459p(r2, r9)
            r0.f24293v = r3
            r2 = r3
        L_0x0099:
            int r3 = r0.f24283l
            r4 = 6
            if (r3 != r12) goto L_0x0134
            int r3 = r2.mo41432b()
            r0.f24294w = r3
            int r5 = r2.f24258f
            int r6 = r2.f24261i
            if (r5 >= r6) goto L_0x00e1
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r1.mo48459p(r3, r9)
            com.google.android.gms.internal.ads.zzafw r1 = r2.mo41436f()
            if (r1 != 0) goto L_0x00b6
            goto L_0x00d4
        L_0x00b6:
            com.google.android.gms.internal.ads.zzafx r3 = r2.f24254b
            com.google.android.gms.internal.ads.zzef r3 = r3.f24366n
            int r1 = r1.f24351d
            if (r1 == 0) goto L_0x00c1
            r3.mo45231g(r1)
        L_0x00c1:
            com.google.android.gms.internal.ads.zzafx r1 = r2.f24254b
            int r5 = r2.f24258f
            boolean r1 = r1.mo41442b(r5)
            if (r1 == 0) goto L_0x00d4
            int r1 = r3.mo45247w()
            int r1 = r1 * 6
            r3.mo45231g(r1)
        L_0x00d4:
            boolean r1 = r2.mo41439k()
            if (r1 != 0) goto L_0x00dc
            r0.f24293v = r7
        L_0x00dc:
            r0.f24283l = r12
        L_0x00de:
            r1 = 0
            goto L_0x029a
        L_0x00e1:
            com.google.android.gms.internal.ads.zzafy r5 = r2.f24256d
            com.google.android.gms.internal.ads.zzafv r5 = r5.f24370a
            int r5 = r5.f24343g
            if (r5 != r8) goto L_0x00f5
            int r3 = r3 + -8
            r0.f24294w = r3
            r3 = r1
            com.google.android.gms.internal.ads.zzyy r3 = (com.google.android.gms.internal.ads.zzyy) r3
            r5 = 8
            r3.mo48459p(r5, r9)
        L_0x00f5:
            com.google.android.gms.internal.ads.zzafy r3 = r2.f24256d
            com.google.android.gms.internal.ads.zzafv r3 = r3.f24370a
            com.google.android.gms.internal.ads.zzaf r3 = r3.f24342f
            java.lang.String r3 = r3.f24213l
            java.lang.String r5 = "audio/ac4"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0122
            int r3 = r0.f24294w
            r5 = 7
            int r3 = r2.mo41433c(r3, r5)
            r0.f24295x = r3
            int r3 = r0.f24294w
            com.google.android.gms.internal.ads.zzef r6 = r0.f24278g
            com.google.android.gms.internal.ads.zzym.m55434b(r3, r6)
            com.google.android.gms.internal.ads.zzaap r3 = r2.f24253a
            com.google.android.gms.internal.ads.zzef r6 = r0.f24278g
            r3.mo41215e(r6, r5)
            int r3 = r0.f24295x
            int r3 = r3 + r5
            r0.f24295x = r3
            goto L_0x012a
        L_0x0122:
            int r3 = r0.f24294w
            int r3 = r2.mo41433c(r3, r9)
            r0.f24295x = r3
        L_0x012a:
            int r5 = r0.f24294w
            int r5 = r5 + r3
            r0.f24294w = r5
            r3 = 4
            r0.f24283l = r3
            r0.f24296y = r9
        L_0x0134:
            com.google.android.gms.internal.ads.zzafy r3 = r2.f24256d
            com.google.android.gms.internal.ads.zzafv r3 = r3.f24370a
            com.google.android.gms.internal.ads.zzaap r5 = r2.f24253a
            long r10 = r2.mo41435e()
            int r6 = r3.f24346j
            if (r6 != 0) goto L_0x0153
        L_0x0142:
            int r3 = r0.f24295x
            int r4 = r0.f24294w
            if (r3 >= r4) goto L_0x0237
            int r4 = r4 - r3
            int r3 = r5.mo41211a(r1, r4, r9)
            int r4 = r0.f24295x
            int r4 = r4 + r3
            r0.f24295x = r4
            goto L_0x0142
        L_0x0153:
            com.google.android.gms.internal.ads.zzef r13 = r0.f24275d
            byte[] r13 = r13.mo45232h()
            r13[r9] = r9
            r13[r8] = r9
            r14 = 2
            r13[r14] = r9
            int r14 = r6 + 1
            r15 = 4
            int r6 = 4 - r6
        L_0x0165:
            int r15 = r0.f24295x
            int r12 = r0.f24294w
            if (r15 >= r12) goto L_0x0237
            int r12 = r0.f24296y
            java.lang.String r15 = "video/hevc"
            if (r12 != 0) goto L_0x01d8
            r12 = r1
            com.google.android.gms.internal.ads.zzyy r12 = (com.google.android.gms.internal.ads.zzyy) r12
            r12.mo48453i(r13, r6, r14, r9)
            com.google.android.gms.internal.ads.zzef r12 = r0.f24275d
            r12.mo45230f(r9)
            com.google.android.gms.internal.ads.zzef r12 = r0.f24275d
            int r12 = r12.mo45237m()
            if (r12 <= 0) goto L_0x01d1
            int r12 = r12 + -1
            r0.f24296y = r12
            com.google.android.gms.internal.ads.zzef r12 = r0.f24274c
            r12.mo45230f(r9)
            com.google.android.gms.internal.ads.zzef r12 = r0.f24274c
            r9 = 4
            r5.mo41215e(r12, r9)
            com.google.android.gms.internal.ads.zzef r12 = r0.f24275d
            r5.mo41215e(r12, r8)
            com.google.android.gms.internal.ads.zzaap[] r12 = r0.f24270C
            int r12 = r12.length
            if (r12 <= 0) goto L_0x01c2
            com.google.android.gms.internal.ads.zzaf r12 = r3.f24342f
            java.lang.String r12 = r12.f24213l
            byte r17 = r13[r9]
            byte[] r9 = com.google.android.gms.internal.ads.zzaaf.f23725a
            java.lang.String r9 = "video/avc"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x01b4
            r9 = r17 & 31
            if (r9 == r4) goto L_0x01b2
            goto L_0x01b4
        L_0x01b2:
            r9 = 1
            goto L_0x01c3
        L_0x01b4:
            boolean r9 = r15.equals(r12)
            if (r9 == 0) goto L_0x01c2
            r9 = r17 & 126(0x7e, float:1.77E-43)
            int r9 = r9 >> r8
            r12 = 39
            if (r9 != r12) goto L_0x01c2
            goto L_0x01b2
        L_0x01c2:
            r9 = 0
        L_0x01c3:
            r0.f24297z = r9
            int r9 = r0.f24295x
            int r9 = r9 + 5
            r0.f24295x = r9
            int r9 = r0.f24294w
            int r9 = r9 + r6
            r0.f24294w = r9
            goto L_0x0233
        L_0x01d1:
            java.lang.String r1 = "Invalid NAL length"
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r7)
            throw r1
        L_0x01d8:
            boolean r9 = r0.f24297z
            if (r9 == 0) goto L_0x0221
            com.google.android.gms.internal.ads.zzef r9 = r0.f24276e
            r9.mo45227c(r12)
            com.google.android.gms.internal.ads.zzef r9 = r0.f24276e
            byte[] r9 = r9.mo45232h()
            int r12 = r0.f24296y
            r4 = r1
            com.google.android.gms.internal.ads.zzyy r4 = (com.google.android.gms.internal.ads.zzyy) r4
            r8 = 0
            r4.mo48453i(r9, r8, r12, r8)
            com.google.android.gms.internal.ads.zzef r4 = r0.f24276e
            int r8 = r0.f24296y
            r5.mo41215e(r4, r8)
            int r4 = r0.f24296y
            com.google.android.gms.internal.ads.zzef r8 = r0.f24276e
            byte[] r9 = r8.mo45232h()
            int r8 = r8.mo45236l()
            int r8 = com.google.android.gms.internal.ads.zzaaf.m40915b(r9, r8)
            com.google.android.gms.internal.ads.zzef r9 = r0.f24276e
            com.google.android.gms.internal.ads.zzaf r12 = r3.f24342f
            java.lang.String r12 = r12.f24213l
            boolean r12 = r15.equals(r12)
            r9.mo45230f(r12)
            com.google.android.gms.internal.ads.zzef r9 = r0.f24276e
            r9.mo45229e(r8)
            com.google.android.gms.internal.ads.zzef r8 = r0.f24276e
            com.google.android.gms.internal.ads.zzaap[] r9 = r0.f24270C
            com.google.android.gms.internal.ads.zzyv.m55470a(r10, r8, r9)
            goto L_0x0227
        L_0x0221:
            r4 = 0
            int r8 = r5.mo41211a(r1, r12, r4)
            r4 = r8
        L_0x0227:
            int r8 = r0.f24295x
            int r8 = r8 + r4
            r0.f24295x = r8
            int r8 = r0.f24296y
            int r8 = r8 - r4
            r0.f24296y = r8
            r4 = 6
            r8 = 1
        L_0x0233:
            r9 = 0
            r12 = 3
            goto L_0x0165
        L_0x0237:
            int r20 = r2.mo41431a()
            com.google.android.gms.internal.ads.zzafw r1 = r2.mo41436f()
            if (r1 == 0) goto L_0x0246
            com.google.android.gms.internal.ads.zzaao r1 = r1.f24350c
            r23 = r1
            goto L_0x0248
        L_0x0246:
            r23 = r7
        L_0x0248:
            int r1 = r0.f24294w
            r22 = 0
            r17 = r5
            r18 = r10
            r21 = r1
            r17.mo41216f(r18, r20, r21, r22, r23)
        L_0x0255:
            java.util.ArrayDeque r1 = r0.f24282k
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x028d
            java.util.ArrayDeque r1 = r0.f24282k
            java.lang.Object r1 = r1.removeFirst()
            com.google.android.gms.internal.ads.zzafj r1 = (com.google.android.gms.internal.ads.zzafj) r1
            int r3 = r0.f24289r
            int r4 = r1.f24252c
            int r3 = r3 - r4
            r0.f24289r = r3
            long r3 = r1.f24250a
            boolean r5 = r1.f24251b
            if (r5 == 0) goto L_0x0273
            long r3 = r3 + r10
        L_0x0273:
            com.google.android.gms.internal.ads.zzaap[] r5 = r0.f24269B
            int r6 = r5.length
            r8 = 0
        L_0x0277:
            if (r8 >= r6) goto L_0x0255
            r12 = r5[r8]
            r15 = 1
            int r9 = r1.f24252c
            int r13 = r0.f24289r
            r18 = 0
            r17 = r13
            r13 = r3
            r16 = r9
            r12.mo41216f(r13, r15, r16, r17, r18)
            int r8 = r8 + 1
            goto L_0x0277
        L_0x028d:
            boolean r1 = r2.mo41439k()
            if (r1 != 0) goto L_0x0295
            r0.f24293v = r7
        L_0x0295:
            r1 = 3
            r0.f24283l = r1
            goto L_0x00de
        L_0x029a:
            return r1
        L_0x029b:
            android.util.SparseArray r2 = r0.f24273b
            int r2 = r2.size()
            r6 = r7
            r5 = 0
        L_0x02a3:
            if (r5 >= r2) goto L_0x02c6
            android.util.SparseArray r8 = r0.f24273b
            java.lang.Object r8 = r8.valueAt(r5)
            com.google.android.gms.internal.ads.zzafk r8 = (com.google.android.gms.internal.ads.zzafk) r8
            com.google.android.gms.internal.ads.zzafx r8 = r8.f24254b
            boolean r9 = r8.f24367o
            if (r9 == 0) goto L_0x02c3
            long r8 = r8.f24355c
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 >= 0) goto L_0x02c3
            android.util.SparseArray r3 = r0.f24273b
            java.lang.Object r3 = r3.valueAt(r5)
            r6 = r3
            com.google.android.gms.internal.ads.zzafk r6 = (com.google.android.gms.internal.ads.zzafk) r6
            r3 = r8
        L_0x02c3:
            int r5 = r5 + 1
            goto L_0x02a3
        L_0x02c6:
            if (r6 != 0) goto L_0x02cd
            r2 = 3
            r0.f24283l = r2
            goto L_0x0004
        L_0x02cd:
            long r8 = r34.mo41252c()
            long r3 = r3 - r8
            int r2 = (int) r3
            if (r2 < 0) goto L_0x02f4
            r3 = r1
            com.google.android.gms.internal.ads.zzyy r3 = (com.google.android.gms.internal.ads.zzyy) r3
            r4 = 0
            r3.mo48459p(r2, r4)
            com.google.android.gms.internal.ads.zzafx r2 = r6.f24254b
            com.google.android.gms.internal.ads.zzef r5 = r2.f24366n
            byte[] r6 = r5.mo45232h()
            int r5 = r5.mo45236l()
            r3.mo48453i(r6, r4, r5, r4)
            com.google.android.gms.internal.ads.zzef r3 = r2.f24366n
            r3.mo45230f(r4)
            r2.f24367o = r4
            goto L_0x0004
        L_0x02f4:
            java.lang.String r1 = "Offset to encryption data was negative."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r7)
            throw r1
        L_0x02fb:
            long r5 = r0.f24285n
            int r2 = (int) r5
            int r5 = r0.f24286o
            int r2 = r2 - r5
            com.google.android.gms.internal.ads.zzef r5 = r0.f24287p
            if (r5 == 0) goto L_0x052b
            byte[] r6 = r5.mo45232h()
            r8 = r1
            com.google.android.gms.internal.ads.zzyy r8 = (com.google.android.gms.internal.ads.zzyy) r8
            r9 = 8
            r11 = 0
            r8.mo48453i(r6, r9, r2, r11)
            com.google.android.gms.internal.ads.zzaew r2 = new com.google.android.gms.internal.ads.zzaew
            int r6 = r0.f24284m
            r2.<init>(r6, r5)
            long r5 = r34.mo41252c()
            java.util.ArrayDeque r8 = r0.f24281j
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0332
            java.util.ArrayDeque r3 = r0.f24281j
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.zzaev r3 = (com.google.android.gms.internal.ads.zzaev) r3
            r3.mo41418f(r2)
            goto L_0x0532
        L_0x0332:
            int r8 = r2.f24180a
            if (r8 != r4) goto L_0x03fc
            com.google.android.gms.internal.ads.zzef r2 = r2.f24179b
            r3 = 8
            r2.mo45230f(r3)
            int r3 = r2.mo45237m()
            r4 = 4
            r2.mo45231g(r4)
            long r14 = r2.mo45217A()
            int r3 = com.google.android.gms.internal.ads.zzaex.m41221a(r3)
            if (r3 != 0) goto L_0x0358
            long r3 = r2.mo45217A()
            long r8 = r2.mo45217A()
            goto L_0x0360
        L_0x0358:
            long r3 = r2.mo45218B()
            long r8 = r2.mo45218B()
        L_0x0360:
            long r5 = r5 + r8
            r10 = 1000000(0xf4240, double:4.940656E-318)
            r8 = r3
            r12 = r14
            long r19 = com.google.android.gms.internal.ads.zzen.m49165g0(r8, r10, r12)
            r8 = 2
            r2.mo45231g(r8)
            int r12 = r2.mo45247w()
            int[] r13 = new int[r12]
            long[] r10 = new long[r12]
            long[] r11 = new long[r12]
            long[] r8 = new long[r12]
            r21 = r19
            r9 = 0
        L_0x037d:
            if (r9 >= r12) goto L_0x03d3
            int r17 = r2.mo45237m()
            r23 = -2147483648(0xffffffff80000000, float:-0.0)
            r23 = r17 & r23
            if (r23 != 0) goto L_0x03cb
            long r23 = r2.mo45217A()
            r25 = 2147483647(0x7fffffff, float:NaN)
            r17 = r17 & r25
            r13[r9] = r17
            r10[r9] = r5
            r8[r9] = r21
            long r3 = r3 + r23
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r7 = r8
            r24 = r9
            r8 = r3
            r25 = r3
            r3 = r10
            r4 = r11
            r10 = r21
            r17 = r12
            r1 = r13
            r12 = r14
            long r21 = com.google.android.gms.internal.ads.zzen.m49165g0(r8, r10, r12)
            r8 = r7[r24]
            long r8 = r21 - r8
            r4[r24] = r8
            r8 = 4
            r2.mo45231g(r8)
            r9 = r1[r24]
            long r9 = (long) r9
            long r5 = r5 + r9
            int r9 = r24 + 1
            r13 = r1
            r10 = r3
            r11 = r4
            r8 = r7
            r12 = r17
            r3 = r25
            r7 = 0
            r1 = r34
            goto L_0x037d
        L_0x03cb:
            java.lang.String r1 = "Unhandled indirect reference"
            r2 = 0
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r2)
            throw r1
        L_0x03d3:
            r7 = r8
            r3 = r10
            r4 = r11
            r1 = r13
            java.lang.Long r2 = java.lang.Long.valueOf(r19)
            com.google.android.gms.internal.ads.zzyw r5 = new com.google.android.gms.internal.ads.zzyw
            r5.<init>(r1, r3, r4, r7)
            android.util.Pair r1 = android.util.Pair.create(r2, r5)
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.f24292u = r2
            com.google.android.gms.internal.ads.zzzl r2 = r0.f24268A
            java.lang.Object r1 = r1.second
            com.google.android.gms.internal.ads.zzaal r1 = (com.google.android.gms.internal.ads.zzaal) r1
            r2.mo41254h(r1)
            r1 = 1
            r0.f24271D = r1
            goto L_0x0528
        L_0x03fc:
            if (r8 != r3) goto L_0x0528
            com.google.android.gms.internal.ads.zzef r1 = r2.f24179b
            com.google.android.gms.internal.ads.zzaap[] r2 = r0.f24269B
            int r2 = r2.length
            if (r2 == 0) goto L_0x0528
            r2 = 8
            r1.mo45230f(r2)
            int r2 = r1.mo45237m()
            int r2 = com.google.android.gms.internal.ads.zzaex.m41221a(r2)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x046a
            r5 = 1
            if (r2 == r5) goto L_0x0432
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Skipping unsupported emsg version: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.ads.zzdw.m48255e(r10, r1)
            goto L_0x0528
        L_0x0432:
            long r5 = r1.mo45217A()
            long r11 = r1.mo45218B()
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r5
            long r7 = com.google.android.gms.internal.ads.zzen.m49165g0(r11, r13, r15)
            long r11 = r1.mo45217A()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r5 = com.google.android.gms.internal.ads.zzen.m49165g0(r11, r13, r15)
            long r9 = r1.mo45217A()
            r2 = 0
            java.lang.String r11 = r1.mo45220D(r2)
            java.util.Objects.requireNonNull(r11)
            java.lang.String r12 = r1.mo45220D(r2)
            java.util.Objects.requireNonNull(r12)
            r28 = r5
            r30 = r9
            r26 = r11
            r27 = r12
            r5 = r3
            r12 = r7
            goto L_0x04af
        L_0x046a:
            r2 = 0
            java.lang.String r11 = r1.mo45220D(r2)
            java.util.Objects.requireNonNull(r11)
            java.lang.String r12 = r1.mo45220D(r2)
            java.util.Objects.requireNonNull(r12)
            long r13 = r1.mo45217A()
            long r5 = r1.mo45217A()
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r9 = r13
            long r15 = com.google.android.gms.internal.ads.zzen.m49165g0(r5, r7, r9)
            long r5 = r0.f24292u
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0493
            long r5 = r5 + r15
            r19 = r5
            goto L_0x0495
        L_0x0493:
            r19 = r3
        L_0x0495:
            long r5 = r1.mo45217A()
            r7 = 1000(0x3e8, double:4.94E-321)
            r9 = r13
            long r5 = com.google.android.gms.internal.ads.zzen.m49165g0(r5, r7, r9)
            long r9 = r1.mo45217A()
            r28 = r5
            r30 = r9
            r26 = r11
            r27 = r12
            r5 = r15
            r12 = r19
        L_0x04af:
            int r2 = r1.mo45233i()
            byte[] r2 = new byte[r2]
            int r7 = r1.mo45233i()
            r8 = 0
            r1.mo45226b(r2, r8, r7)
            com.google.android.gms.internal.ads.zzacf r1 = new com.google.android.gms.internal.ads.zzacf
            r25 = r1
            r32 = r2
            r25.<init>(r26, r27, r28, r30, r32)
            com.google.android.gms.internal.ads.zzef r2 = new com.google.android.gms.internal.ads.zzef
            com.google.android.gms.internal.ads.zzacg r7 = r0.f24279h
            byte[] r1 = r7.mo41265a(r1)
            r2.<init>((byte[]) r1)
            int r1 = r2.mo45233i()
            com.google.android.gms.internal.ads.zzaap[] r7 = r0.f24269B
            int r8 = r7.length
            r9 = 0
        L_0x04d9:
            if (r9 >= r8) goto L_0x04e7
            r10 = r7[r9]
            r11 = 0
            r2.mo45230f(r11)
            r10.mo41215e(r2, r1)
            int r9 = r9 + 1
            goto L_0x04d9
        L_0x04e7:
            int r2 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x04fc
            java.util.ArrayDeque r2 = r0.f24282k
            com.google.android.gms.internal.ads.zzafj r3 = new com.google.android.gms.internal.ads.zzafj
            r4 = 1
            r3.<init>(r5, r4, r1)
            r2.addLast(r3)
            int r2 = r0.f24289r
            int r2 = r2 + r1
            r0.f24289r = r2
            goto L_0x0528
        L_0x04fc:
            java.util.ArrayDeque r2 = r0.f24282k
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0515
            java.util.ArrayDeque r2 = r0.f24282k
            com.google.android.gms.internal.ads.zzafj r3 = new com.google.android.gms.internal.ads.zzafj
            r4 = 0
            r3.<init>(r12, r4, r1)
            r2.addLast(r3)
            int r2 = r0.f24289r
            int r2 = r2 + r1
            r0.f24289r = r2
            goto L_0x0528
        L_0x0515:
            com.google.android.gms.internal.ads.zzaap[] r2 = r0.f24269B
            int r3 = r2.length
            r4 = 0
        L_0x0519:
            if (r4 >= r3) goto L_0x0528
            r5 = r2[r4]
            r8 = 1
            r10 = 0
            r11 = 0
            r6 = r12
            r9 = r1
            r5.mo41216f(r6, r8, r9, r10, r11)
            int r4 = r4 + 1
            goto L_0x0519
        L_0x0528:
            r1 = r34
            goto L_0x0532
        L_0x052b:
            r3 = r1
            com.google.android.gms.internal.ads.zzyy r3 = (com.google.android.gms.internal.ads.zzyy) r3
            r5 = 0
            r3.mo48459p(r2, r5)
        L_0x0532:
            long r2 = r34.mo41252c()
            r0.m41269i(r2)
            goto L_0x0004
        L_0x053b:
            r5 = 0
            int r2 = r0.f24286o
            if (r2 != 0) goto L_0x0568
            com.google.android.gms.internal.ads.zzef r2 = r0.f24280i
            byte[] r2 = r2.mo45232h()
            r6 = 8
            r7 = 1
            boolean r2 = r1.mo48453i(r2, r5, r6, r7)
            if (r2 != 0) goto L_0x0551
            r1 = -1
            return r1
        L_0x0551:
            r0.f24286o = r6
            com.google.android.gms.internal.ads.zzef r2 = r0.f24280i
            r2.mo45230f(r5)
            com.google.android.gms.internal.ads.zzef r2 = r0.f24280i
            long r5 = r2.mo45217A()
            r0.f24285n = r5
            com.google.android.gms.internal.ads.zzef r2 = r0.f24280i
            int r2 = r2.mo45237m()
            r0.f24284m = r2
        L_0x0568:
            long r5 = r0.f24285n
            r7 = 1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x058d
            com.google.android.gms.internal.ads.zzef r2 = r0.f24280i
            byte[] r2 = r2.mo45232h()
            r5 = r1
            com.google.android.gms.internal.ads.zzyy r5 = (com.google.android.gms.internal.ads.zzyy) r5
            r6 = 8
            r7 = 0
            r5.mo48453i(r2, r6, r6, r7)
            int r2 = r0.f24286o
            int r2 = r2 + r6
            r0.f24286o = r2
            com.google.android.gms.internal.ads.zzef r2 = r0.f24280i
            long r5 = r2.mo45218B()
            r0.f24285n = r5
            goto L_0x05c0
        L_0x058d:
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x05c0
            long r5 = r34.mo41253d()
            r7 = -1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x05b1
            java.util.ArrayDeque r2 = r0.f24281j
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x05b0
            java.util.ArrayDeque r2 = r0.f24281j
            java.lang.Object r2 = r2.peek()
            com.google.android.gms.internal.ads.zzaev r2 = (com.google.android.gms.internal.ads.zzaev) r2
            long r5 = r2.f24176b
            goto L_0x05b1
        L_0x05b0:
            r5 = r7
        L_0x05b1:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x05c0
            long r7 = r34.mo41252c()
            long r5 = r5 - r7
            int r2 = r0.f24286o
            long r7 = (long) r2
            long r5 = r5 + r7
            r0.f24285n = r5
        L_0x05c0:
            long r5 = r0.f24285n
            int r2 = r0.f24286o
            long r7 = (long) r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0743
            long r5 = r34.mo41252c()
            long r5 = r5 - r7
            int r2 = r0.f24284m
            r7 = 1835295092(0x6d646174, float:4.4175247E27)
            r8 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 == r8) goto L_0x05da
            if (r2 != r7) goto L_0x05ed
        L_0x05da:
            boolean r2 = r0.f24271D
            if (r2 != 0) goto L_0x05ed
            com.google.android.gms.internal.ads.zzzl r2 = r0.f24268A
            com.google.android.gms.internal.ads.zzaak r9 = new com.google.android.gms.internal.ads.zzaak
            long r10 = r0.f24291t
            r9.<init>(r10, r5)
            r2.mo41254h(r9)
            r2 = 1
            r0.f24271D = r2
        L_0x05ed:
            int r2 = r0.f24284m
            if (r2 != r8) goto L_0x060b
            android.util.SparseArray r2 = r0.f24273b
            int r2 = r2.size()
            r9 = 0
        L_0x05f8:
            if (r9 >= r2) goto L_0x060b
            android.util.SparseArray r10 = r0.f24273b
            java.lang.Object r10 = r10.valueAt(r9)
            com.google.android.gms.internal.ads.zzafk r10 = (com.google.android.gms.internal.ads.zzafk) r10
            com.google.android.gms.internal.ads.zzafx r10 = r10.f24254b
            r10.f24355c = r5
            r10.f24354b = r5
            int r9 = r9 + 1
            goto L_0x05f8
        L_0x060b:
            int r2 = r0.f24284m
            if (r2 != r7) goto L_0x061c
            r7 = 0
            r0.f24293v = r7
            long r2 = r0.f24285n
            long r5 = r5 + r2
            r0.f24288q = r5
            r2 = 2
            r0.f24283l = r2
            goto L_0x0004
        L_0x061c:
            r5 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 == r5) goto L_0x071c
            r5 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r5) goto L_0x071c
            r5 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r2 == r5) goto L_0x071c
            r5 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r2 == r5) goto L_0x071c
            r5 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r2 == r5) goto L_0x071c
            if (r2 == r8) goto L_0x071c
            r5 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 == r5) goto L_0x071c
            r5 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r2 == r5) goto L_0x071c
            r5 = 1701082227(0x65647473, float:6.742798E22)
            if (r2 != r5) goto L_0x0648
            goto L_0x071c
        L_0x0648:
            r5 = 1751411826(0x68646c72, float:4.3148E24)
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == r5) goto L_0x06e7
            r5 = 1835296868(0x6d646864, float:4.418049E27)
            if (r2 == r5) goto L_0x06e7
            r5 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r2 == r5) goto L_0x06e7
            if (r2 == r4) goto L_0x06e7
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1952867444(0x74666474, float:7.3014264E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1952868452(0x74666864, float:7.301914E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r4) goto L_0x06e7
            r4 = 1935763834(0x7361697a, float:1.785898E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 == r4) goto L_0x06e7
            r4 = 1935828848(0x73626770, float:1.7937577E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r2 == r4) goto L_0x06e7
            r4 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 == r4) goto L_0x06e7
            if (r2 != r3) goto L_0x06d2
            goto L_0x06e7
        L_0x06d2:
            long r2 = r0.f24285n
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x06e0
            r2 = 0
            r0.f24287p = r2
            r2 = 1
            r0.f24283l = r2
            goto L_0x0004
        L_0x06e0:
            java.lang.String r1 = "Skipping atom with length > 2147483647 (unsupported)."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44137c(r1)
            throw r1
        L_0x06e7:
            int r2 = r0.f24286o
            r3 = 8
            if (r2 != r3) goto L_0x0715
            long r4 = r0.f24285n
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x070e
            com.google.android.gms.internal.ads.zzef r2 = new com.google.android.gms.internal.ads.zzef
            int r5 = (int) r4
            r2.<init>((int) r5)
            com.google.android.gms.internal.ads.zzef r4 = r0.f24280i
            byte[] r4 = r4.mo45232h()
            byte[] r5 = r2.mo45232h()
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r5, r6, r3)
            r0.f24287p = r2
            r2 = 1
            r0.f24283l = r2
            goto L_0x0004
        L_0x070e:
            java.lang.String r1 = "Leaf atom with length > 2147483647 (unsupported)."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44137c(r1)
            throw r1
        L_0x0715:
            java.lang.String r1 = "Leaf atom defines extended atom size (unsupported)."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44137c(r1)
            throw r1
        L_0x071c:
            long r3 = r34.mo41252c()
            long r5 = r0.f24285n
            long r3 = r3 + r5
            r5 = -8
            long r3 = r3 + r5
            java.util.ArrayDeque r5 = r0.f24281j
            com.google.android.gms.internal.ads.zzaev r6 = new com.google.android.gms.internal.ads.zzaev
            r6.<init>(r2, r3)
            r5.push(r6)
            long r5 = r0.f24285n
            int r2 = r0.f24286o
            long r7 = (long) r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x073e
            r0.m41269i(r3)
            goto L_0x0004
        L_0x073e:
            r33.m41267e()
            goto L_0x0004
        L_0x0743:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44137c(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafl.mo41230h(com.google.android.gms.internal.ads.zzzj, com.google.android.gms.internal.ads.zzaai):int");
    }

    public zzafl(int i, @Nullable zzel zzel) {
        this.f24272a = Collections.unmodifiableList(Collections.emptyList());
        this.f24279h = new zzacg();
        this.f24280i = new zzef(16);
        this.f24274c = new zzef(zzaaf.f23725a);
        this.f24275d = new zzef(5);
        this.f24276e = new zzef();
        byte[] bArr = new byte[16];
        this.f24277f = bArr;
        this.f24278g = new zzef(bArr);
        this.f24281j = new ArrayDeque();
        this.f24282k = new ArrayDeque();
        this.f24273b = new SparseArray();
        this.f24291t = -9223372036854775807L;
        this.f24290s = -9223372036854775807L;
        this.f24292u = -9223372036854775807L;
        this.f24268A = zzzl.f39041e;
        this.f24269B = new zzaap[0];
        this.f24270C = new zzaap[0];
    }
}
