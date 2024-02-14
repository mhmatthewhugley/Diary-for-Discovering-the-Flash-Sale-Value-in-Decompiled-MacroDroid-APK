package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzgd extends zzkf implements zzln {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final zzgd zzd;
    private String zzA = "";
    private long zzB;
    private int zzC;
    private String zzD = "";
    private String zzE = "";
    private boolean zzF;
    /* access modifiers changed from: private */
    public zzkm zzG = zzkf.m60505n();
    private String zzH = "";
    private int zzI;
    private int zzJ;
    private int zzK;
    private String zzL = "";
    private long zzM;
    private long zzN;
    private String zzO = "";
    private String zzP = "";
    private int zzQ;
    private String zzR = "";
    private zzgg zzS;
    private zzkk zzT = zzkf.m60502k();
    private long zzU;
    private long zzV;
    private String zzW = "";
    private String zzX = "";
    private int zzY;
    private boolean zzZ;
    private String zzaa = "";
    private boolean zzab;
    private zzfz zzac;
    private String zzad = "";
    private zzkm zzae = zzkf.m60505n();
    private String zzaf = "";
    private int zze;
    private int zzf;
    private int zzg;
    /* access modifiers changed from: private */
    public zzkm zzh = zzkf.m60505n();
    private zzkm zzi = zzkf.m60505n();
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private int zzs;
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private long zzw;
    private long zzx;
    private String zzy = "";
    private boolean zzz;

    static {
        zzgd zzgd = new zzgd();
        zzd = zzgd;
        zzkf.m60509t(zzgd.class, zzgd);
    }

    private zzgd() {
    }

    /* renamed from: E0 */
    static /* synthetic */ void m60012E0(zzgd zzgd, String str) {
        str.getClass();
        zzgd.zzf |= 8192;
        zzgd.zzad = str;
    }

    /* renamed from: F0 */
    static /* synthetic */ void m60013F0(zzgd zzgd) {
        zzgd.zzf &= -8193;
        zzgd.zzad = zzd.zzad;
    }

    /* renamed from: G0 */
    static /* synthetic */ void m60014G0(zzgd zzgd, Iterable iterable) {
        zzkm zzkm = zzgd.zzae;
        if (!zzkm.mo51307a()) {
            zzgd.zzae = zzkf.m60506o(zzkm);
        }
        zzio.m60316g(iterable, zzgd.zzae);
    }

    /* renamed from: I0 */
    static /* synthetic */ void m60016I0(zzgd zzgd, String str) {
        str.getClass();
        zzgd.zzf |= 16384;
        zzgd.zzaf = str;
    }

    /* renamed from: J0 */
    static /* synthetic */ void m60017J0(zzgd zzgd, int i) {
        zzgd.m60055g1();
        zzgd.zzh.remove(i);
    }

    /* renamed from: K0 */
    static /* synthetic */ void m60018K0(zzgd zzgd, int i, zzgm zzgm) {
        zzgm.getClass();
        zzgd.m60057h1();
        zzgd.zzi.set(i, zzgm);
    }

    /* renamed from: L0 */
    static /* synthetic */ void m60019L0(zzgd zzgd, zzgm zzgm) {
        zzgm.getClass();
        zzgd.m60057h1();
        zzgd.zzi.add(zzgm);
    }

    /* renamed from: M0 */
    static /* synthetic */ void m60020M0(zzgd zzgd, Iterable iterable) {
        zzgd.m60057h1();
        zzio.m60316g(iterable, zzgd.zzi);
    }

    /* renamed from: N0 */
    static /* synthetic */ void m60021N0(zzgd zzgd, int i) {
        zzgd.m60057h1();
        zzgd.zzi.remove(i);
    }

    /* renamed from: O0 */
    static /* synthetic */ void m60022O0(zzgd zzgd, long j) {
        zzgd.zze |= 2;
        zzgd.zzj = j;
    }

    /* renamed from: P0 */
    static /* synthetic */ void m60023P0(zzgd zzgd, long j) {
        zzgd.zze |= 4;
        zzgd.zzk = j;
    }

    /* renamed from: P1 */
    public static zzgc m60024P1() {
        return (zzgc) zzd.mo51459x();
    }

    /* renamed from: Q0 */
    static /* synthetic */ void m60025Q0(zzgd zzgd, long j) {
        zzgd.zze |= 8;
        zzgd.zzl = j;
    }

    /* renamed from: R */
    static /* synthetic */ void m60027R(zzgd zzgd) {
        zzgd.zze &= Integer.MAX_VALUE;
        zzgd.zzO = zzd.zzO;
    }

    /* renamed from: R0 */
    static /* synthetic */ void m60028R0(zzgd zzgd, long j) {
        zzgd.zze |= 16;
        zzgd.zzm = j;
    }

    /* renamed from: S */
    static /* synthetic */ void m60029S(zzgd zzgd, int i) {
        zzgd.zzf |= 2;
        zzgd.zzQ = i;
    }

    /* renamed from: S0 */
    static /* synthetic */ void m60030S0(zzgd zzgd) {
        zzgd.zze &= -17;
        zzgd.zzm = 0;
    }

    /* renamed from: T */
    static /* synthetic */ void m60031T(zzgd zzgd, int i, zzft zzft) {
        zzft.getClass();
        zzgd.m60055g1();
        zzgd.zzh.set(i, zzft);
    }

    /* renamed from: T0 */
    static /* synthetic */ void m60032T0(zzgd zzgd, long j) {
        zzgd.zze |= 32;
        zzgd.zzn = j;
    }

    /* renamed from: U */
    static /* synthetic */ void m60033U(zzgd zzgd, String str) {
        str.getClass();
        zzgd.zzf |= 4;
        zzgd.zzR = str;
    }

    /* renamed from: U0 */
    static /* synthetic */ void m60034U0(zzgd zzgd) {
        zzgd.zze &= -33;
        zzgd.zzn = 0;
    }

    /* renamed from: V */
    static /* synthetic */ void m60035V(zzgd zzgd, zzgg zzgg) {
        zzgg.getClass();
        zzgd.zzS = zzgg;
        zzgd.zzf |= 8;
    }

    /* renamed from: V0 */
    static /* synthetic */ void m60036V0(zzgd zzgd, String str) {
        zzgd.zze |= 64;
        zzgd.zzo = "android";
    }

    /* renamed from: W */
    static /* synthetic */ void m60037W(zzgd zzgd, Iterable iterable) {
        zzkk zzkk = zzgd.zzT;
        if (!zzkk.mo51307a()) {
            int size = zzkk.size();
            zzgd.zzT = zzkk.mo51468x(size == 0 ? 10 : size + size);
        }
        zzio.m60316g(iterable, zzgd.zzT);
    }

    /* renamed from: W0 */
    static /* synthetic */ void m60038W0(zzgd zzgd, String str) {
        str.getClass();
        zzgd.zze |= 128;
        zzgd.zzp = str;
    }

    /* renamed from: X */
    static /* synthetic */ void m60039X(zzgd zzgd, zzft zzft) {
        zzft.getClass();
        zzgd.m60055g1();
        zzgd.zzh.add(zzft);
    }

    /* renamed from: X0 */
    static /* synthetic */ void m60040X0(zzgd zzgd) {
        zzgd.zze &= -129;
        zzgd.zzp = zzd.zzp;
    }

    /* renamed from: Y */
    static /* synthetic */ void m60041Y(zzgd zzgd, long j) {
        zzgd.zzf |= 16;
        zzgd.zzU = j;
    }

    /* renamed from: Y0 */
    static /* synthetic */ void m60042Y0(zzgd zzgd, String str) {
        str.getClass();
        zzgd.zze |= 256;
        zzgd.zzq = str;
    }

    /* renamed from: Z */
    static /* synthetic */ void m60043Z(zzgd zzgd, long j) {
        zzgd.zzf |= 32;
        zzgd.zzV = j;
    }

    /* renamed from: Z0 */
    static /* synthetic */ void m60044Z0(zzgd zzgd) {
        zzgd.zze &= -257;
        zzgd.zzq = zzd.zzq;
    }

    /* renamed from: a0 */
    static /* synthetic */ void m60045a0(zzgd zzgd, String str) {
        zzgd.zzf |= 128;
        zzgd.zzX = str;
    }

    /* renamed from: a1 */
    static /* synthetic */ void m60046a1(zzgd zzgd, String str) {
        str.getClass();
        zzgd.zze |= 512;
        zzgd.zzr = str;
    }

    /* renamed from: b0 */
    static /* synthetic */ void m60047b0(zzgd zzgd, Iterable iterable) {
        zzgd.m60055g1();
        zzio.m60316g(iterable, zzgd.zzh);
    }

    /* renamed from: b1 */
    static /* synthetic */ void m60048b1(zzgd zzgd, int i) {
        zzgd.zze |= 1024;
        zzgd.zzs = i;
    }

    /* renamed from: c1 */
    static /* synthetic */ void m60049c1(zzgd zzgd, String str) {
        str.getClass();
        zzgd.zze |= 2048;
        zzgd.zzt = str;
    }

    /* renamed from: d0 */
    static /* synthetic */ void m60050d0(zzgd zzgd, String str) {
        str.getClass();
        zzgd.zze |= 8192;
        zzgd.zzv = str;
    }

    /* renamed from: e0 */
    static /* synthetic */ void m60051e0(zzgd zzgd, long j) {
        zzgd.zze |= 16384;
        zzgd.zzw = j;
    }

    /* renamed from: e1 */
    static /* synthetic */ void m60052e1(zzgd zzgd, String str) {
        str.getClass();
        zzgd.zze |= 4096;
        zzgd.zzu = str;
    }

    /* renamed from: f0 */
    static /* synthetic */ void m60053f0(zzgd zzgd, long j) {
        zzgd.zze |= 32768;
        zzgd.zzx = 74029;
    }

    /* renamed from: g0 */
    static /* synthetic */ void m60054g0(zzgd zzgd, String str) {
        str.getClass();
        zzgd.zze |= 65536;
        zzgd.zzy = str;
    }

    /* renamed from: g1 */
    private final void m60055g1() {
        zzkm zzkm = this.zzh;
        if (!zzkm.mo51307a()) {
            this.zzh = zzkf.m60506o(zzkm);
        }
    }

    /* renamed from: h0 */
    static /* synthetic */ void m60056h0(zzgd zzgd) {
        zzgd.zze &= -65537;
        zzgd.zzy = zzd.zzy;
    }

    /* renamed from: h1 */
    private final void m60057h1() {
        zzkm zzkm = this.zzi;
        if (!zzkm.mo51307a()) {
            this.zzi = zzkf.m60506o(zzkm);
        }
    }

    /* renamed from: i0 */
    static /* synthetic */ void m60058i0(zzgd zzgd, boolean z) {
        zzgd.zze |= 131072;
        zzgd.zzz = z;
    }

    /* renamed from: j0 */
    static /* synthetic */ void m60059j0(zzgd zzgd) {
        zzgd.zze &= -131073;
        zzgd.zzz = false;
    }

    /* renamed from: k0 */
    static /* synthetic */ void m60060k0(zzgd zzgd, String str) {
        str.getClass();
        zzgd.zze |= 262144;
        zzgd.zzA = str;
    }

    /* renamed from: l0 */
    static /* synthetic */ void m60061l0(zzgd zzgd) {
        zzgd.zze &= -262145;
        zzgd.zzA = zzd.zzA;
    }

    /* renamed from: m0 */
    static /* synthetic */ void m60062m0(zzgd zzgd, long j) {
        zzgd.zze |= 524288;
        zzgd.zzB = j;
    }

    /* renamed from: n0 */
    static /* synthetic */ void m60063n0(zzgd zzgd, int i) {
        zzgd.zze |= 1048576;
        zzgd.zzC = i;
    }

    /* renamed from: o0 */
    static /* synthetic */ void m60064o0(zzgd zzgd, String str) {
        zzgd.zze |= 2097152;
        zzgd.zzD = str;
    }

    /* renamed from: p0 */
    static /* synthetic */ void m60065p0(zzgd zzgd) {
        zzgd.zze &= -2097153;
        zzgd.zzD = zzd.zzD;
    }

    /* renamed from: q0 */
    static /* synthetic */ void m60066q0(zzgd zzgd, String str) {
        str.getClass();
        zzgd.zze |= 4194304;
        zzgd.zzE = str;
    }

    /* renamed from: r0 */
    static /* synthetic */ void m60067r0(zzgd zzgd, boolean z) {
        zzgd.zze |= 8388608;
        zzgd.zzF = z;
    }

    /* renamed from: s0 */
    static /* synthetic */ void m60068s0(zzgd zzgd, Iterable iterable) {
        zzkm zzkm = zzgd.zzG;
        if (!zzkm.mo51307a()) {
            zzgd.zzG = zzkf.m60506o(zzkm);
        }
        zzio.m60316g(iterable, zzgd.zzG);
    }

    /* renamed from: u0 */
    static /* synthetic */ void m60070u0(zzgd zzgd, String str) {
        str.getClass();
        zzgd.zze |= 16777216;
        zzgd.zzH = str;
    }

    /* renamed from: v0 */
    static /* synthetic */ void m60071v0(zzgd zzgd, int i) {
        zzgd.zze |= 33554432;
        zzgd.zzI = i;
    }

    /* renamed from: x0 */
    static /* synthetic */ void m60072x0(zzgd zzgd, int i) {
        zzgd.zze |= 1;
        zzgd.zzg = 1;
    }

    /* renamed from: y0 */
    static /* synthetic */ void m60073y0(zzgd zzgd) {
        zzgd.zze &= -268435457;
        zzgd.zzL = zzd.zzL;
    }

    /* renamed from: z0 */
    static /* synthetic */ void m60074z0(zzgd zzgd, long j) {
        zzgd.zze |= 536870912;
        zzgd.zzM = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zzd, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.", new Object[]{"zze", "zzf", "zzg", "zzh", zzft.class, "zzi", zzgm.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", zzfp.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", zzfl.f41447a, "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf"});
        } else if (i2 == 3) {
            return new zzgd();
        } else {
            if (i2 == 4) {
                return new zzgc((zzfk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzd;
        }
    }

    /* renamed from: A0 */
    public final boolean mo51138A0() {
        return this.zzz;
    }

    /* renamed from: A1 */
    public final int mo51139A1() {
        return this.zzg;
    }

    /* renamed from: B */
    public final String mo51140B() {
        return this.zzv;
    }

    /* renamed from: B0 */
    public final boolean mo51141B0() {
        return this.zzF;
    }

    /* renamed from: B1 */
    public final int mo51142B1() {
        return this.zzQ;
    }

    /* renamed from: C */
    public final String mo51143C() {
        return this.zzX;
    }

    /* renamed from: C0 */
    public final boolean mo51144C0() {
        return (this.zze & 33554432) != 0;
    }

    /* renamed from: C1 */
    public final int mo51145C1() {
        return this.zzs;
    }

    /* renamed from: D */
    public final String mo51146D() {
        return this.zzq;
    }

    /* renamed from: D0 */
    public final boolean mo51147D0() {
        return (this.zze & 1048576) != 0;
    }

    /* renamed from: D1 */
    public final int mo51148D1() {
        return this.zzi.size();
    }

    /* renamed from: E */
    public final String mo51149E() {
        return this.zzO;
    }

    /* renamed from: E1 */
    public final long mo51150E1() {
        return this.zzM;
    }

    /* renamed from: F1 */
    public final long mo51151F1() {
        return this.zzB;
    }

    /* renamed from: G */
    public final String mo51152G() {
        return this.zzH;
    }

    /* renamed from: G1 */
    public final long mo51153G1() {
        return this.zzU;
    }

    /* renamed from: H */
    public final String mo51154H() {
        return this.zzE;
    }

    /* renamed from: H1 */
    public final long mo51155H1() {
        return this.zzl;
    }

    /* renamed from: I */
    public final String mo51156I() {
        return this.zzD;
    }

    /* renamed from: I1 */
    public final long mo51157I1() {
        return this.zzw;
    }

    /* renamed from: J */
    public final String mo51158J() {
        return this.zzp;
    }

    /* renamed from: J1 */
    public final long mo51159J1() {
        return this.zzn;
    }

    /* renamed from: K */
    public final String mo51160K() {
        return this.zzo;
    }

    /* renamed from: K1 */
    public final long mo51161K1() {
        return this.zzm;
    }

    /* renamed from: L */
    public final String mo51162L() {
        return this.zzy;
    }

    /* renamed from: L1 */
    public final long mo51163L1() {
        return this.zzk;
    }

    /* renamed from: M */
    public final String mo51164M() {
        return this.zzad;
    }

    /* renamed from: M1 */
    public final long mo51165M1() {
        return this.zzj;
    }

    /* renamed from: N */
    public final String mo51166N() {
        return this.zzr;
    }

    /* renamed from: N1 */
    public final long mo51167N1() {
        return this.zzx;
    }

    /* renamed from: O */
    public final List mo51168O() {
        return this.zzG;
    }

    /* renamed from: O1 */
    public final zzft mo51169O1(int i) {
        return (zzft) this.zzh.get(i);
    }

    /* renamed from: P */
    public final List mo51170P() {
        return this.zzh;
    }

    /* renamed from: Q */
    public final List mo51171Q() {
        return this.zzi;
    }

    /* renamed from: R1 */
    public final zzgm mo51172R1(int i) {
        return (zzgm) this.zzi.get(i);
    }

    /* renamed from: S1 */
    public final String mo51173S1() {
        return this.zzR;
    }

    /* renamed from: T1 */
    public final String mo51174T1() {
        return this.zzu;
    }

    /* renamed from: U1 */
    public final String mo51175U1() {
        return this.zzA;
    }

    /* renamed from: V1 */
    public final String mo51176V1() {
        return this.zzt;
    }

    /* renamed from: c0 */
    public final int mo51177c0() {
        return this.zzI;
    }

    /* renamed from: f1 */
    public final int mo51178f1() {
        return this.zzC;
    }

    /* renamed from: i1 */
    public final boolean mo51179i1() {
        return (this.zze & 536870912) != 0;
    }

    /* renamed from: j1 */
    public final boolean mo51180j1() {
        return (this.zzf & 128) != 0;
    }

    /* renamed from: k1 */
    public final boolean mo51181k1() {
        return (this.zze & 524288) != 0;
    }

    /* renamed from: l1 */
    public final boolean mo51182l1() {
        return (this.zzf & 16) != 0;
    }

    /* renamed from: m1 */
    public final boolean mo51183m1() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: n1 */
    public final boolean mo51184n1() {
        return (this.zze & 16384) != 0;
    }

    /* renamed from: o1 */
    public final boolean mo51185o1() {
        return (this.zze & 131072) != 0;
    }

    /* renamed from: p1 */
    public final boolean mo51186p1() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: q1 */
    public final boolean mo51187q1() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: r1 */
    public final boolean mo51188r1() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: s1 */
    public final boolean mo51189s1() {
        return (this.zzf & 2) != 0;
    }

    /* renamed from: t1 */
    public final boolean mo51190t1() {
        return (this.zze & 8388608) != 0;
    }

    /* renamed from: u1 */
    public final boolean mo51191u1() {
        return (this.zzf & 8192) != 0;
    }

    /* renamed from: v1 */
    public final boolean mo51192v1() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: w1 */
    public final boolean mo51193w1() {
        return (this.zze & 1024) != 0;
    }

    /* renamed from: x1 */
    public final boolean mo51194x1() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: y1 */
    public final boolean mo51195y1() {
        return (this.zze & 32768) != 0;
    }

    /* renamed from: z1 */
    public final int mo51196z1() {
        return this.zzh.size();
    }
}
