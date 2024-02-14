package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzou implements zzny {

    /* renamed from: W */
    private static final Object f38065W = new Object();
    @GuardedBy("releaseExecutorLock")
    @Nullable

    /* renamed from: X */
    private static ExecutorService f38066X;
    @GuardedBy("releaseExecutorLock")

    /* renamed from: Y */
    private static int f38067Y;

    /* renamed from: A */
    private boolean f38068A;

    /* renamed from: B */
    private boolean f38069B;

    /* renamed from: C */
    private long f38070C;

    /* renamed from: D */
    private float f38071D;

    /* renamed from: E */
    private zzng[] f38072E;

    /* renamed from: F */
    private ByteBuffer[] f38073F;
    @Nullable

    /* renamed from: G */
    private ByteBuffer f38074G;

    /* renamed from: H */
    private int f38075H;
    @Nullable

    /* renamed from: I */
    private ByteBuffer f38076I;

    /* renamed from: J */
    private byte[] f38077J;

    /* renamed from: K */
    private int f38078K;

    /* renamed from: L */
    private int f38079L;

    /* renamed from: M */
    private boolean f38080M;

    /* renamed from: N */
    private boolean f38081N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public boolean f38082O;

    /* renamed from: P */
    private boolean f38083P;

    /* renamed from: Q */
    private int f38084Q;

    /* renamed from: R */
    private zzl f38085R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public long f38086S;

    /* renamed from: T */
    private boolean f38087T;

    /* renamed from: U */
    private boolean f38088U;

    /* renamed from: V */
    private final zzok f38089V;

    /* renamed from: a */
    private final zznd f38090a;

    /* renamed from: b */
    private final zzoe f38091b;

    /* renamed from: c */
    private final zzpf f38092c;

    /* renamed from: d */
    private final zzng[] f38093d;

    /* renamed from: e */
    private final zzng[] f38094e;

    /* renamed from: f */
    private final zzdg f38095f;

    /* renamed from: g */
    private final zzoc f38096g = new zzoc(new zzop(this, (zzoo) null));

    /* renamed from: h */
    private final ArrayDeque f38097h;

    /* renamed from: i */
    private zzos f38098i;

    /* renamed from: j */
    private final zzon f38099j;

    /* renamed from: k */
    private final zzon f38100k;

    /* renamed from: l */
    private final zzoh f38101l;
    @Nullable

    /* renamed from: m */
    private zznb f38102m;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: n */
    public zznv f38103n;
    @Nullable

    /* renamed from: o */
    private zzoj f38104o;

    /* renamed from: p */
    private zzoj f38105p;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: q */
    public AudioTrack f38106q;

    /* renamed from: r */
    private zzk f38107r;
    @Nullable

    /* renamed from: s */
    private zzom f38108s;

    /* renamed from: t */
    private zzom f38109t;

    /* renamed from: u */
    private final zzby f38110u;

    /* renamed from: v */
    private long f38111v;

    /* renamed from: w */
    private long f38112w;

    /* renamed from: x */
    private long f38113x;

    /* renamed from: y */
    private long f38114y;

    /* renamed from: z */
    private int f38115z;

    /* synthetic */ zzou(zzoi zzoi, zzot zzot) {
        this.f38090a = zzoi.f38037a;
        zzok e = zzoi.f38039c;
        this.f38089V = e;
        int i = zzen.f34500a;
        this.f38101l = zzoi.f38038b;
        zzdg zzdg = new zzdg(zzde.f32179a);
        this.f38095f = zzdg;
        zzdg.mo44618e();
        zzoe zzoe = new zzoe();
        this.f38091b = zzoe;
        zzpf zzpf = new zzpf();
        this.f38092c = zzpf;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new zzod[]{new zzpb(), zzoe, zzpf});
        Collections.addAll(arrayList, e.mo47974e());
        this.f38093d = (zzng[]) arrayList.toArray(new zzng[0]);
        this.f38094e = new zzng[]{new zzox()};
        this.f38071D = 1.0f;
        this.f38107r = zzk.f37728c;
        this.f38084Q = 0;
        this.f38085R = new zzl(0, 0.0f);
        zzby zzby = zzby.f27965d;
        this.f38109t = new zzom(zzby, false, 0, 0, (zzol) null);
        this.f38110u = zzby;
        this.f38079L = -1;
        this.f38072E = new zzng[0];
        this.f38073F = new ByteBuffer[0];
        this.f38097h = new ArrayDeque();
        this.f38099j = new zzon(100);
        this.f38100k = new zzon(100);
    }

    /* renamed from: A */
    private final AudioTrack m54423A(zzoj zzoj) throws zznu {
        try {
            return zzoj.mo47968b(false, this.f38107r, this.f38084Q);
        } catch (zznu e) {
            zznv zznv = this.f38103n;
            if (zznv != null) {
                zznv.mo47911a(e);
            }
            throw e;
        }
    }

    /* renamed from: B */
    private final zzom m54424B() {
        zzom zzom = this.f38108s;
        if (zzom != null) {
            return zzom;
        }
        return !this.f38097h.isEmpty() ? (zzom) this.f38097h.getLast() : this.f38109t;
    }

    /* renamed from: C */
    private final void m54425C(long j) {
        zzby zzby;
        boolean z;
        if (m54436O()) {
            zzok zzok = this.f38089V;
            zzby = m54424B().f38052a;
            zzok.mo47972c(zzby);
        } else {
            zzby = zzby.f27965d;
        }
        zzby zzby2 = zzby;
        if (m54436O()) {
            zzok zzok2 = this.f38089V;
            boolean z2 = m54424B().f38053b;
            zzok2.mo47973d(z2);
            z = z2;
        } else {
            z = false;
        }
        this.f38097h.add(new zzom(zzby2, z, Math.max(0, j), this.f38105p.mo47967a(m54446z()), (zzol) null));
        zzng[] zzngArr = this.f38105p.f38048i;
        ArrayList arrayList = new ArrayList();
        for (zzng zzng : zzngArr) {
            if (zzng.mo47878f()) {
                arrayList.add(zzng);
            } else {
                zzng.mo47873a();
            }
        }
        int size = arrayList.size();
        this.f38072E = (zzng[]) arrayList.toArray(new zzng[size]);
        this.f38073F = new ByteBuffer[size];
        m54426D();
        zznv zznv = this.f38103n;
        if (zznv != null) {
            ((zzoz) zznv).f38117a.f38120T0.mo47909s(z);
        }
    }

    /* renamed from: D */
    private final void m54426D() {
        int i = 0;
        while (true) {
            zzng[] zzngArr = this.f38072E;
            if (i < zzngArr.length) {
                zzng zzng = zzngArr[i];
                zzng.mo47873a();
                this.f38073F[i] = zzng.zzb();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: E */
    private final void m54427E() {
        if (this.f38105p.mo47969c()) {
            this.f38087T = true;
        }
    }

    /* renamed from: F */
    private final void m54428F() {
        if (!this.f38081N) {
            this.f38081N = true;
            this.f38096g.mo47947c(m54446z());
            this.f38106q.stop();
        }
    }

    /* renamed from: H */
    private final void m54429H(long j) throws zznx {
        ByteBuffer byteBuffer;
        int length = this.f38072E.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f38073F[i - 1];
            } else {
                byteBuffer = this.f38074G;
                if (byteBuffer == null) {
                    byteBuffer = zzng.f37949a;
                }
            }
            if (i == length) {
                m54432K(byteBuffer, j);
            } else {
                zzng zzng = this.f38072E[i];
                if (i > this.f38079L) {
                    zzng.mo47874b(byteBuffer);
                }
                ByteBuffer zzb = zzng.zzb();
                this.f38073F[i] = zzb;
                if (zzb.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: I */
    private final void m54430I(zzby zzby, boolean z) {
        zzom B = m54424B();
        if (!zzby.equals(B.f38052a) || z != B.f38053b) {
            zzom zzom = new zzom(zzby, z, -9223372036854775807L, -9223372036854775807L, (zzol) null);
            if (m54434M()) {
                this.f38108s = zzom;
            } else {
                this.f38109t = zzom;
            }
        }
    }

    /* renamed from: J */
    private final void m54431J() {
        if (m54434M()) {
            if (zzen.f34500a >= 21) {
                this.f38106q.setVolume(this.f38071D);
                return;
            }
            AudioTrack audioTrack = this.f38106q;
            float f = this.f38071D;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* renamed from: K */
    private final void m54432K(ByteBuffer byteBuffer, long j) throws zznx {
        int i;
        zznv zznv;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f38076I;
            boolean z = true;
            if (byteBuffer2 != null) {
                zzdd.m47210d(byteBuffer2 == byteBuffer);
            } else {
                this.f38076I = byteBuffer;
                if (zzen.f34500a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f38077J;
                    if (bArr == null || bArr.length < remaining) {
                        this.f38077J = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f38077J, 0, remaining);
                    byteBuffer.position(position);
                    this.f38078K = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i2 = zzen.f34500a;
            if (i2 < 21) {
                int a = this.f38096g.mo47945a(this.f38113x);
                if (a > 0) {
                    i = this.f38106q.write(this.f38077J, this.f38078K, Math.min(remaining2, a));
                    if (i > 0) {
                        this.f38078K += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                } else {
                    i = 0;
                }
            } else {
                i = this.f38106q.write(byteBuffer, remaining2, 1);
            }
            this.f38086S = SystemClock.elapsedRealtime();
            if (i < 0) {
                if ((i2 < 24 || i != -6) && i != -32) {
                    z = false;
                }
                if (z) {
                    m54427E();
                }
                zznx zznx = new zznx(i, this.f38105p.f38040a, z);
                zznv zznv2 = this.f38103n;
                if (zznv2 != null) {
                    zznv2.mo47911a(zznx);
                }
                if (!zznx.zzb) {
                    this.f38100k.mo47976b(zznx);
                    return;
                }
                throw zznx;
            }
            this.f38100k.mo47975a();
            if (m54435N(this.f38106q)) {
                if (this.f38114y > 0) {
                    this.f38088U = false;
                }
                if (this.f38082O && (zznv = this.f38103n) != null && i < remaining2 && !this.f38088U) {
                    zzpa zzpa = ((zzoz) zznv).f38117a;
                    if (zzpa.f38129c1 != null) {
                        zzpa.f38129c1.zza();
                    }
                }
            }
            int i3 = this.f38105p.f38042c;
            if (i3 == 0) {
                this.f38113x += (long) i;
            }
            if (i == remaining2) {
                if (i3 != 0) {
                    if (byteBuffer != this.f38074G) {
                        z = false;
                    }
                    zzdd.m47212f(z);
                    this.f38114y += ((long) this.f38115z) * ((long) this.f38075H);
                }
                this.f38076I = null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m54433L() throws com.google.android.gms.internal.ads.zznx {
        /*
            r9 = this;
            int r0 = r9.f38079L
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r9.f38079L = r3
        L_0x0009:
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            int r4 = r9.f38079L
            com.google.android.gms.internal.ads.zzng[] r5 = r9.f38072E
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.mo47876d()
        L_0x001f:
            r9.m54429H(r7)
            boolean r0 = r4.mo47877e()
            if (r0 != 0) goto L_0x0029
            return r3
        L_0x0029:
            int r0 = r9.f38079L
            int r0 = r0 + r2
            r9.f38079L = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.f38076I
            if (r0 == 0) goto L_0x003b
            r9.m54432K(r0, r7)
            java.nio.ByteBuffer r0 = r9.f38076I
            if (r0 == 0) goto L_0x003b
            return r3
        L_0x003b:
            r9.f38079L = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzou.m54433L():boolean");
    }

    /* renamed from: M */
    private final boolean m54434M() {
        return this.f38106q != null;
    }

    /* renamed from: N */
    private static boolean m54435N(AudioTrack audioTrack) {
        return zzen.f34500a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* renamed from: O */
    private final boolean m54436O() {
        if (!"audio/raw".equals(this.f38105p.f38040a.f24213l)) {
            return false;
        }
        int i = this.f38105p.f38040a.f24196A;
        return true;
    }

    /* renamed from: w */
    static /* synthetic */ void m54443w(AudioTrack audioTrack, zzdg zzdg) {
        try {
            audioTrack.flush();
            audioTrack.release();
            zzdg.mo44618e();
            synchronized (f38065W) {
                int i = f38067Y - 1;
                f38067Y = i;
                if (i == 0) {
                    f38066X.shutdown();
                    f38066X = null;
                }
            }
        } catch (Throwable th) {
            zzdg.mo44618e();
            synchronized (f38065W) {
                int i2 = f38067Y - 1;
                f38067Y = i2;
                if (i2 == 0) {
                    f38066X.shutdown();
                    f38066X = null;
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final long m54445y() {
        zzoj zzoj = this.f38105p;
        return zzoj.f38042c == 0 ? this.f38111v / ((long) zzoj.f38041b) : this.f38112w;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final long m54446z() {
        zzoj zzoj = this.f38105p;
        return zzoj.f38042c == 0 ? this.f38113x / ((long) zzoj.f38043d) : this.f38114y;
    }

    /* renamed from: G */
    public final void mo47913G(boolean z) {
        m54430I(m54424B().f38052a, z);
    }

    /* renamed from: I0 */
    public final long mo47914I0(boolean z) {
        long j;
        if (!m54434M() || this.f38069B) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f38096g.mo47946b(z), this.f38105p.mo47967a(m54446z()));
        while (!this.f38097h.isEmpty() && min >= ((zzom) this.f38097h.getFirst()).f38055d) {
            this.f38109t = (zzom) this.f38097h.remove();
        }
        zzom zzom = this.f38109t;
        long j2 = min - zzom.f38055d;
        if (zzom.f38052a.equals(zzby.f27965d)) {
            j = this.f38109t.f38054c + j2;
        } else if (this.f38097h.isEmpty()) {
            j = this.f38089V.mo47970a(j2) + this.f38109t.f38054c;
        } else {
            zzom zzom2 = (zzom) this.f38097h.getFirst();
            j = zzom2.f38054c - zzen.m49157c0(zzom2.f38055d - min, this.f38109t.f38052a.f27967a);
        }
        return j + this.f38105p.mo47967a(this.f38089V.mo47971b());
    }

    /* renamed from: a */
    public final zzby mo47915a() {
        return m54424B().f38052a;
    }

    /* renamed from: b */
    public final void mo47916b() {
        if (m54434M()) {
            this.f38111v = 0;
            this.f38112w = 0;
            this.f38113x = 0;
            this.f38114y = 0;
            this.f38088U = false;
            this.f38115z = 0;
            this.f38109t = new zzom(m54424B().f38052a, m54424B().f38053b, 0, 0, (zzol) null);
            this.f38070C = 0;
            this.f38108s = null;
            this.f38097h.clear();
            this.f38074G = null;
            this.f38075H = 0;
            this.f38076I = null;
            this.f38081N = false;
            this.f38080M = false;
            this.f38079L = -1;
            this.f38092c.mo48010o();
            m54426D();
            if (this.f38096g.mo47952h()) {
                this.f38106q.pause();
            }
            if (m54435N(this.f38106q)) {
                zzos zzos = this.f38098i;
                Objects.requireNonNull(zzos);
                zzos.mo47981b(this.f38106q);
            }
            if (zzen.f34500a < 21 && !this.f38083P) {
                this.f38084Q = 0;
            }
            zzoj zzoj = this.f38104o;
            if (zzoj != null) {
                this.f38105p = zzoj;
                this.f38104o = null;
            }
            this.f38096g.mo47948d();
            AudioTrack audioTrack = this.f38106q;
            zzdg zzdg = this.f38095f;
            zzdg.mo44616c();
            synchronized (f38065W) {
                if (f38066X == null) {
                    f38066X = zzen.m49178q("ExoPlayer:AudioTrackReleaseThread");
                }
                f38067Y++;
                f38066X.execute(new zzof(audioTrack, zzdg));
            }
            this.f38106q = null;
        }
        this.f38100k.mo47975a();
        this.f38099j.mo47975a();
    }

    /* renamed from: c */
    public final void mo47917c() {
        this.f38068A = true;
    }

    /* renamed from: d */
    public final int mo47918d(zzaf zzaf) {
        if (!"audio/raw".equals(zzaf.f24213l)) {
            if (!this.f38087T) {
                int i = zzen.f34500a;
            }
            return this.f38090a.mo47867a(zzaf) != null ? 2 : 0;
        } else if (!zzen.m49183v(zzaf.f24196A)) {
            int i2 = zzaf.f24196A;
            zzdw.m48255e("DefaultAudioSink", "Invalid PCM encoding: " + i2);
            return 0;
        } else if (zzaf.f24196A != 2) {
            return 1;
        } else {
            return 2;
        }
    }

    /* renamed from: e */
    public final void mo47919e() {
        this.f38082O = true;
        if (m54434M()) {
            this.f38096g.mo47950f();
            this.f38106q.play();
        }
    }

    /* renamed from: f */
    public final void mo47920f() {
        this.f38082O = false;
        if (m54434M() && this.f38096g.mo47955k()) {
            this.f38106q.pause();
        }
    }

    /* renamed from: g */
    public final void mo47921g() throws zznx {
        if (!this.f38080M && m54434M() && m54433L()) {
            m54428F();
            this.f38080M = true;
        }
    }

    /* renamed from: h */
    public final void mo47922h() {
        mo47916b();
        for (zzng c : this.f38093d) {
            c.mo47875c();
        }
        zzng[] zzngArr = this.f38094e;
        int length = zzngArr.length;
        for (int i = 0; i <= 0; i++) {
            zzngArr[i].mo47875c();
        }
        this.f38082O = false;
        this.f38087T = false;
    }

    /* renamed from: i */
    public final void mo47923i(zzaf zzaf, int i, @Nullable int[] iArr) throws zznt {
        zzng[] zzngArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr2;
        zzaf zzaf2 = zzaf;
        if ("audio/raw".equals(zzaf2.f24213l)) {
            zzdd.m47210d(zzen.m49183v(zzaf2.f24196A));
            i7 = zzen.m49150Y(zzaf2.f24196A, zzaf2.f24226y);
            zzng[] zzngArr2 = this.f38093d;
            this.f38092c.mo48011p(zzaf2.f24197B, zzaf2.f24198C);
            if (zzen.f34500a < 21 && zzaf2.f24226y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i9 = 0; i9 < 6; i9++) {
                    iArr2[i9] = i9;
                }
            } else {
                iArr2 = iArr;
            }
            this.f38091b.mo47962n(iArr2);
            zzne zzne = new zzne(zzaf2.f24227z, zzaf2.f24226y, zzaf2.f24196A);
            int length = zzngArr2.length;
            int i10 = 0;
            while (i10 < length) {
                zzng zzng = zzngArr2[i10];
                try {
                    zzne g = zzng.mo47879g(zzne);
                    if (true == zzng.mo47878f()) {
                        zzne = g;
                    }
                    i10++;
                } catch (zznf e) {
                    throw new zznt((Throwable) e, zzaf2);
                }
            }
            int i11 = zzne.f37947c;
            int i12 = zzne.f37945a;
            int i13 = zzne.f37946b;
            int T = zzen.m49145T(i13);
            zzngArr = zzngArr2;
            i6 = zzen.m49150Y(i11, i13);
            i5 = i12;
            i3 = 0;
            int i14 = T;
            i2 = i11;
            i4 = i14;
        } else {
            zzng[] zzngArr3 = new zzng[0];
            int i15 = zzaf2.f24227z;
            int i16 = zzen.f34500a;
            Pair a = this.f38090a.mo47867a(zzaf2);
            if (a != null) {
                i3 = 2;
                zzngArr = zzngArr3;
                i2 = ((Integer) a.first).intValue();
                i7 = -1;
                i4 = ((Integer) a.second).intValue();
                i5 = i15;
                i6 = -1;
            } else {
                throw new zznt("Unable to configure passthrough for: ".concat(String.valueOf(zzaf)), zzaf2);
            }
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i5, i4, i2);
        zzdd.m47212f(minBufferSize != -2);
        int i17 = 250000;
        if (i3 == 0) {
            int i18 = i6;
            i8 = zzen.m49141P(minBufferSize * 4, zzow.m54469a(250000, i5, i6), zzow.m54469a(750000, i5, i6));
        } else if (i3 != 1) {
            int i19 = 5;
            if (i2 == 5) {
                i17 = 500000;
                i2 = 5;
            } else {
                i19 = i2;
            }
            i8 = zzfxs.m51254a((((long) i17) * ((long) zzow.m54470b(i2))) / 1000000);
            i6 = i6;
            i2 = i19;
        } else {
            int i20 = i6;
            i8 = zzfxs.m51254a((((long) zzow.m54470b(i2)) * 50000000) / 1000000);
        }
        int max = (((Math.max(minBufferSize, (int) ((double) i8)) + i6) - 1) / i6) * i6;
        if (i2 == 0) {
            String valueOf = String.valueOf(zzaf);
            throw new zznt("Invalid output encoding (mode=" + i3 + ") for: " + valueOf, zzaf);
        } else if (i4 != 0) {
            this.f38087T = false;
            zzoj zzoj = new zzoj(zzaf, i7, i3, i6, i5, i4, i2, max, zzngArr);
            if (m54434M()) {
                this.f38104o = zzoj;
            } else {
                this.f38105p = zzoj;
            }
        } else {
            String valueOf2 = String.valueOf(zzaf);
            throw new zznt("Invalid output channel config (mode=" + i3 + ") for: " + valueOf2, zzaf);
        }
    }

    /* renamed from: j */
    public final void mo47924j(zzl zzl) {
        if (!this.f38085R.equals(zzl)) {
            int i = zzl.f37784a;
            if (this.f38106q != null) {
                int i2 = this.f38085R.f37784a;
            }
            this.f38085R = zzl;
        }
    }

    /* renamed from: k */
    public final void mo47925k(zzby zzby) {
        m54430I(new zzby(zzen.m49126A(zzby.f27967a, 0.1f, 8.0f), zzen.m49126A(zzby.f27968b, 0.1f, 8.0f)), m54424B().f38053b);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:42|43|44|45|(3:47|48|49)|71|72|73) */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0250, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02c3, code lost:
        r1.f38115z = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02c5, code lost:
        if (r0 == 0) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02c8, code lost:
        return r10;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0149 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:50:0x00d2=Splitter:B:50:0x00d2, B:71:0x0149=Splitter:B:71:0x0149} */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47926l(java.nio.ByteBuffer r25, long r26, int r28) throws com.google.android.gms.internal.ads.zznu, com.google.android.gms.internal.ads.zznx {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            r3 = r26
            r5 = r28
            java.nio.ByteBuffer r0 = r1.f38074G
            r6 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0013
            if (r2 != r0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            com.google.android.gms.internal.ads.zzdd.m47210d(r0)
            com.google.android.gms.internal.ads.zzoj r0 = r1.f38104o
            r8 = 0
            if (r0 == 0) goto L_0x007f
            boolean r0 = r24.m54433L()
            if (r0 != 0) goto L_0x0023
            return r7
        L_0x0023:
            com.google.android.gms.internal.ads.zzoj r0 = r1.f38104o
            com.google.android.gms.internal.ads.zzoj r9 = r1.f38105p
            int r10 = r9.f38042c
            int r11 = r0.f38042c
            if (r10 != r11) goto L_0x006f
            int r10 = r9.f38046g
            int r11 = r0.f38046g
            if (r10 != r11) goto L_0x006f
            int r10 = r9.f38044e
            int r11 = r0.f38044e
            if (r10 != r11) goto L_0x006f
            int r10 = r9.f38045f
            int r11 = r0.f38045f
            if (r10 != r11) goto L_0x006f
            int r9 = r9.f38043d
            int r10 = r0.f38043d
            if (r9 != r10) goto L_0x006f
            r1.f38105p = r0
            r1.f38104o = r8
            android.media.AudioTrack r0 = r1.f38106q
            boolean r0 = m54435N(r0)
            if (r0 == 0) goto L_0x007c
            android.media.AudioTrack r0 = r1.f38106q
            int r0 = r0.getPlayState()
            r9 = 3
            if (r0 != r9) goto L_0x005f
            android.media.AudioTrack r0 = r1.f38106q
            r0.setOffloadEndOfStream()
        L_0x005f:
            android.media.AudioTrack r0 = r1.f38106q
            com.google.android.gms.internal.ads.zzoj r9 = r1.f38105p
            com.google.android.gms.internal.ads.zzaf r9 = r9.f38040a
            int r10 = r9.f24197B
            int r9 = r9.f24198C
            r0.setOffloadDelayPadding(r10, r9)
            r1.f38088U = r6
            goto L_0x007c
        L_0x006f:
            r24.m54428F()
            boolean r0 = r24.mo47932r()
            if (r0 == 0) goto L_0x0079
            return r7
        L_0x0079:
            r24.mo47916b()
        L_0x007c:
            r1.m54425C(r3)
        L_0x007f:
            boolean r0 = r24.m54434M()
            r9 = 31
            if (r0 != 0) goto L_0x015a
            com.google.android.gms.internal.ads.zzdg r0 = r1.f38095f     // Catch:{ zznu -> 0x014d }
            boolean r0 = r0.mo44617d()     // Catch:{ zznu -> 0x014d }
            if (r0 != 0) goto L_0x0090
            return r7
        L_0x0090:
            com.google.android.gms.internal.ads.zzoj r0 = r1.f38105p     // Catch:{ zznu -> 0x009a }
            java.util.Objects.requireNonNull(r0)
            android.media.AudioTrack r0 = r1.m54423A(r0)     // Catch:{ zznu -> 0x009a }
            goto L_0x00d2
        L_0x009a:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.internal.ads.zzoj r0 = r1.f38105p     // Catch:{ zznu -> 0x014d }
            int r12 = r0.f38047h     // Catch:{ zznu -> 0x014d }
            r13 = 1000000(0xf4240, float:1.401298E-39)
            if (r12 <= r13) goto L_0x0149
            com.google.android.gms.internal.ads.zzoj r12 = new com.google.android.gms.internal.ads.zzoj     // Catch:{ zznu -> 0x014d }
            com.google.android.gms.internal.ads.zzaf r15 = r0.f38040a     // Catch:{ zznu -> 0x014d }
            int r13 = r0.f38041b     // Catch:{ zznu -> 0x014d }
            int r14 = r0.f38042c     // Catch:{ zznu -> 0x014d }
            int r8 = r0.f38043d     // Catch:{ zznu -> 0x014d }
            int r7 = r0.f38044e     // Catch:{ zznu -> 0x014d }
            int r6 = r0.f38045f     // Catch:{ zznu -> 0x014d }
            int r10 = r0.f38046g     // Catch:{ zznu -> 0x014d }
            r22 = 1000000(0xf4240, float:1.401298E-39)
            com.google.android.gms.internal.ads.zzng[] r0 = r0.f38048i     // Catch:{ zznu -> 0x014d }
            r17 = r14
            r14 = r12
            r16 = r13
            r18 = r8
            r19 = r7
            r20 = r6
            r21 = r10
            r23 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ zznu -> 0x014d }
            android.media.AudioTrack r0 = r1.m54423A(r12)     // Catch:{ zznu -> 0x0130 }
            r1.f38105p = r12     // Catch:{ zznu -> 0x0130 }
        L_0x00d2:
            r1.f38106q = r0     // Catch:{ zznu -> 0x014d }
            boolean r0 = m54435N(r0)     // Catch:{ zznu -> 0x014d }
            if (r0 == 0) goto L_0x00f9
            android.media.AudioTrack r0 = r1.f38106q     // Catch:{ zznu -> 0x014d }
            com.google.android.gms.internal.ads.zzos r6 = r1.f38098i     // Catch:{ zznu -> 0x014d }
            if (r6 != 0) goto L_0x00e7
            com.google.android.gms.internal.ads.zzos r6 = new com.google.android.gms.internal.ads.zzos     // Catch:{ zznu -> 0x014d }
            r6.<init>(r1)     // Catch:{ zznu -> 0x014d }
            r1.f38098i = r6     // Catch:{ zznu -> 0x014d }
        L_0x00e7:
            com.google.android.gms.internal.ads.zzos r6 = r1.f38098i     // Catch:{ zznu -> 0x014d }
            r6.mo47980a(r0)     // Catch:{ zznu -> 0x014d }
            android.media.AudioTrack r0 = r1.f38106q     // Catch:{ zznu -> 0x014d }
            com.google.android.gms.internal.ads.zzoj r6 = r1.f38105p     // Catch:{ zznu -> 0x014d }
            com.google.android.gms.internal.ads.zzaf r6 = r6.f38040a     // Catch:{ zznu -> 0x014d }
            int r7 = r6.f24197B     // Catch:{ zznu -> 0x014d }
            int r6 = r6.f24198C     // Catch:{ zznu -> 0x014d }
            r0.setOffloadDelayPadding(r7, r6)     // Catch:{ zznu -> 0x014d }
        L_0x00f9:
            int r0 = com.google.android.gms.internal.ads.zzen.f34500a     // Catch:{ zznu -> 0x014d }
            if (r0 < r9) goto L_0x0106
            com.google.android.gms.internal.ads.zznb r0 = r1.f38102m     // Catch:{ zznu -> 0x014d }
            if (r0 == 0) goto L_0x0106
            android.media.AudioTrack r6 = r1.f38106q     // Catch:{ zznu -> 0x014d }
            com.google.android.gms.internal.ads.zzog.m54405a(r6, r0)     // Catch:{ zznu -> 0x014d }
        L_0x0106:
            android.media.AudioTrack r0 = r1.f38106q     // Catch:{ zznu -> 0x014d }
            int r0 = r0.getAudioSessionId()     // Catch:{ zznu -> 0x014d }
            r1.f38084Q = r0     // Catch:{ zznu -> 0x014d }
            com.google.android.gms.internal.ads.zzoc r10 = r1.f38096g     // Catch:{ zznu -> 0x014d }
            android.media.AudioTrack r11 = r1.f38106q     // Catch:{ zznu -> 0x014d }
            com.google.android.gms.internal.ads.zzoj r0 = r1.f38105p     // Catch:{ zznu -> 0x014d }
            int r6 = r0.f38042c     // Catch:{ zznu -> 0x014d }
            r7 = 2
            if (r6 != r7) goto L_0x011b
            r12 = 1
            goto L_0x011c
        L_0x011b:
            r12 = 0
        L_0x011c:
            int r13 = r0.f38046g     // Catch:{ zznu -> 0x014d }
            int r14 = r0.f38043d     // Catch:{ zznu -> 0x014d }
            int r15 = r0.f38047h     // Catch:{ zznu -> 0x014d }
            r10.mo47949e(r11, r12, r13, r14, r15)     // Catch:{ zznu -> 0x014d }
            r24.m54431J()     // Catch:{ zznu -> 0x014d }
            com.google.android.gms.internal.ads.zzl r0 = r1.f38085R     // Catch:{ zznu -> 0x014d }
            int r0 = r0.f37784a     // Catch:{ zznu -> 0x014d }
            r6 = 1
            r1.f38069B = r6     // Catch:{ zznu -> 0x014d }
            goto L_0x015a
        L_0x0130:
            r0 = move-exception
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0149 }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            r4 = 0
            r3[r4] = r2     // Catch:{ Exception -> 0x0149 }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r3)     // Catch:{ Exception -> 0x0149 }
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0149 }
            r3[r4] = r0     // Catch:{ Exception -> 0x0149 }
            r2.invoke(r11, r3)     // Catch:{ Exception -> 0x0149 }
        L_0x0149:
            r24.m54427E()     // Catch:{ zznu -> 0x014d }
            throw r11     // Catch:{ zznu -> 0x014d }
        L_0x014d:
            r0 = move-exception
            boolean r2 = r0.zzb
            if (r2 != 0) goto L_0x0159
            com.google.android.gms.internal.ads.zzon r2 = r1.f38099j
            r2.mo47976b(r0)
            r6 = 0
            return r6
        L_0x0159:
            throw r0
        L_0x015a:
            r6 = 0
            com.google.android.gms.internal.ads.zzon r0 = r1.f38099j
            r0.mo47975a()
            boolean r0 = r1.f38069B
            r7 = 0
            if (r0 == 0) goto L_0x017a
            long r10 = java.lang.Math.max(r7, r3)
            r1.f38070C = r10
            r1.f38068A = r6
            r1.f38069B = r6
            r1.m54425C(r3)
            boolean r0 = r1.f38082O
            if (r0 == 0) goto L_0x017a
            r24.mo47919e()
        L_0x017a:
            com.google.android.gms.internal.ads.zzoc r0 = r1.f38096g
            long r10 = r24.m54446z()
            boolean r0 = r0.mo47954j(r10)
            if (r0 != 0) goto L_0x0188
            r6 = 0
            return r6
        L_0x0188:
            java.nio.ByteBuffer r0 = r1.f38074G
            if (r0 != 0) goto L_0x035b
            java.nio.ByteOrder r0 = r25.order()
            java.nio.ByteOrder r6 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r0 != r6) goto L_0x0196
            r0 = 1
            goto L_0x0197
        L_0x0196:
            r0 = 0
        L_0x0197:
            com.google.android.gms.internal.ads.zzdd.m47210d(r0)
            boolean r0 = r25.hasRemaining()
            if (r0 != 0) goto L_0x01a2
            r6 = 1
            return r6
        L_0x01a2:
            com.google.android.gms.internal.ads.zzoj r0 = r1.f38105p
            int r6 = r0.f38042c
            if (r6 == 0) goto L_0x02c9
            int r6 = r1.f38115z
            if (r6 != 0) goto L_0x02c9
            int r0 = r0.f38046g
            r6 = 1024(0x400, float:1.435E-42)
            r10 = -2
            r11 = 16
            r12 = -1
            switch(r0) {
                case 5: goto L_0x02be;
                case 6: goto L_0x02be;
                case 7: goto L_0x0258;
                case 8: goto L_0x0258;
                case 9: goto L_0x0242;
                case 10: goto L_0x023f;
                case 11: goto L_0x023c;
                case 12: goto L_0x023c;
                case 13: goto L_0x01b7;
                case 14: goto L_0x01ec;
                case 15: goto L_0x01e9;
                case 16: goto L_0x023f;
                case 17: goto L_0x01ce;
                case 18: goto L_0x02be;
                default: goto L_0x01b7;
            }
        L_0x01b7:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected audio encoding: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x01ce:
            int r0 = com.google.android.gms.internal.ads.zzym.f38980b
            byte[] r0 = new byte[r11]
            int r6 = r25.position()
            r2.get(r0)
            r2.position(r6)
            com.google.android.gms.internal.ads.zzee r6 = new com.google.android.gms.internal.ads.zzee
            r6.<init>(r0, r11)
            com.google.android.gms.internal.ads.zzyl r0 = com.google.android.gms.internal.ads.zzym.m55433a(r6)
            int r0 = r0.f38978c
            goto L_0x0250
        L_0x01e9:
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x0250
        L_0x01ec:
            int r0 = com.google.android.gms.internal.ads.zzyj.f38975g
            int r0 = r25.position()
            int r6 = r25.limit()
            int r6 = r6 + -10
            r9 = r0
        L_0x01f9:
            if (r9 > r6) goto L_0x020c
            int r13 = r9 + 4
            int r13 = com.google.android.gms.internal.ads.zzen.m49146U(r2, r13)
            r13 = r13 & r10
            r14 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r13 != r14) goto L_0x0209
            int r9 = r9 - r0
            goto L_0x020d
        L_0x0209:
            int r9 = r9 + 1
            goto L_0x01f9
        L_0x020c:
            r9 = -1
        L_0x020d:
            if (r9 != r12) goto L_0x0211
            r0 = 0
            goto L_0x0250
        L_0x0211:
            int r0 = r25.position()
            int r0 = r0 + r9
            int r0 = r0 + 7
            byte r0 = r2.get(r0)
            int r6 = r25.position()
            int r6 = r6 + r9
            r0 = r0 & 255(0xff, float:3.57E-43)
            r9 = 187(0xbb, float:2.62E-43)
            if (r0 != r9) goto L_0x022a
            r0 = 9
            goto L_0x022c
        L_0x022a:
            r0 = 8
        L_0x022c:
            r9 = 40
            int r6 = r6 + r0
            byte r0 = r2.get(r6)
            int r0 = r0 >> 4
            r0 = r0 & 7
            int r0 = r9 << r0
            int r0 = r0 * 16
            goto L_0x0250
        L_0x023c:
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x0250
        L_0x023f:
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x0250
        L_0x0242:
            int r0 = r25.position()
            int r0 = com.google.android.gms.internal.ads.zzen.m49146U(r2, r0)
            int r0 = com.google.android.gms.internal.ads.zzaac.m40903c(r0)
            if (r0 == r12) goto L_0x0252
        L_0x0250:
            r10 = 1
            goto L_0x02c3
        L_0x0252:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0258:
            int r0 = com.google.android.gms.internal.ads.zzzf.f39039d
            int r0 = r25.position()
            byte r6 = r2.get(r0)
            if (r6 == r10) goto L_0x02a5
            if (r6 == r12) goto L_0x028e
            if (r6 == r9) goto L_0x027c
            int r6 = r0 + 4
            byte r6 = r2.get(r6)
            r9 = 1
            r6 = r6 & r9
            int r6 = r6 << 6
            int r0 = r0 + 5
            byte r0 = r2.get(r0)
            r0 = r0 & 252(0xfc, float:3.53E-43)
            r9 = 2
            goto L_0x02a1
        L_0x027c:
            r9 = 2
            int r6 = r0 + 5
            byte r6 = r2.get(r6)
            r6 = r6 & 7
            int r6 = r6 << 4
            int r0 = r0 + 6
            byte r0 = r2.get(r0)
            goto L_0x029f
        L_0x028e:
            r9 = 2
            int r6 = r0 + 4
            byte r6 = r2.get(r6)
            r6 = r6 & 7
            int r6 = r6 << 4
            int r0 = r0 + 7
            byte r0 = r2.get(r0)
        L_0x029f:
            r0 = r0 & 60
        L_0x02a1:
            int r0 = r0 >> r9
            r0 = r0 | r6
            r10 = 1
            goto L_0x02ba
        L_0x02a5:
            r9 = 2
            int r6 = r0 + 5
            byte r6 = r2.get(r6)
            r10 = 1
            r6 = r6 & r10
            int r6 = r6 << 6
            int r0 = r0 + 4
            byte r0 = r2.get(r0)
            r0 = r0 & 252(0xfc, float:3.53E-43)
            int r0 = r0 >> r9
            r0 = r0 | r6
        L_0x02ba:
            int r0 = r0 + r10
            int r0 = r0 * 32
            goto L_0x02c3
        L_0x02be:
            r10 = 1
            int r0 = com.google.android.gms.internal.ads.zzyj.m55427a(r25)
        L_0x02c3:
            r1.f38115z = r0
            if (r0 == 0) goto L_0x02c8
            goto L_0x02c9
        L_0x02c8:
            return r10
        L_0x02c9:
            com.google.android.gms.internal.ads.zzom r0 = r1.f38108s
            if (r0 == 0) goto L_0x02db
            boolean r0 = r24.m54433L()
            if (r0 != 0) goto L_0x02d5
            r6 = 0
            return r6
        L_0x02d5:
            r1.m54425C(r3)
            r6 = 0
            r1.f38108s = r6
        L_0x02db:
            long r9 = r1.f38070C
            com.google.android.gms.internal.ads.zzoj r0 = r1.f38105p
            long r11 = r24.m54445y()
            com.google.android.gms.internal.ads.zzpf r6 = r1.f38092c
            long r13 = r6.mo48009n()
            long r11 = r11 - r13
            r13 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r11 * r13
            com.google.android.gms.internal.ads.zzaf r0 = r0.f38040a
            int r0 = r0.f24227z
            long r13 = (long) r0
            long r11 = r11 / r13
            long r9 = r9 + r11
            boolean r0 = r1.f38068A
            if (r0 != 0) goto L_0x0314
            long r11 = r9 - r3
            long r11 = java.lang.Math.abs(r11)
            r13 = 200000(0x30d40, double:9.8813E-319)
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0314
            com.google.android.gms.internal.ads.zznv r0 = r1.f38103n
            com.google.android.gms.internal.ads.zznw r6 = new com.google.android.gms.internal.ads.zznw
            r6.<init>(r3, r9)
            r0.mo47911a(r6)
            r6 = 1
            r1.f38068A = r6
        L_0x0314:
            boolean r0 = r1.f38068A
            if (r0 == 0) goto L_0x033b
            boolean r0 = r24.m54433L()
            r6 = 0
            if (r0 != 0) goto L_0x0320
            return r6
        L_0x0320:
            long r9 = r3 - r9
            long r11 = r1.f38070C
            long r11 = r11 + r9
            r1.f38070C = r11
            r1.f38068A = r6
            r1.m54425C(r3)
            com.google.android.gms.internal.ads.zznv r0 = r1.f38103n
            if (r0 == 0) goto L_0x033b
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x033b
            com.google.android.gms.internal.ads.zzoz r0 = (com.google.android.gms.internal.ads.zzoz) r0
            com.google.android.gms.internal.ads.zzpa r0 = r0.f38117a
            r0.mo47992k0()
        L_0x033b:
            com.google.android.gms.internal.ads.zzoj r0 = r1.f38105p
            int r0 = r0.f38042c
            if (r0 != 0) goto L_0x034c
            long r6 = r1.f38111v
            int r0 = r25.remaining()
            long r8 = (long) r0
            long r6 = r6 + r8
            r1.f38111v = r6
            goto L_0x0357
        L_0x034c:
            long r6 = r1.f38112w
            int r0 = r1.f38115z
            long r8 = (long) r0
            long r10 = (long) r5
            long r8 = r8 * r10
            long r6 = r6 + r8
            r1.f38112w = r6
        L_0x0357:
            r1.f38074G = r2
            r1.f38075H = r5
        L_0x035b:
            r1.m54429H(r3)
            java.nio.ByteBuffer r0 = r1.f38074G
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x036e
            r2 = 0
            r1.f38074G = r2
            r2 = 0
            r1.f38075H = r2
            r3 = 1
            return r3
        L_0x036e:
            r2 = 0
            r3 = 1
            com.google.android.gms.internal.ads.zzoc r0 = r1.f38096g
            long r4 = r24.m54446z()
            boolean r0 = r0.mo47953i(r4)
            if (r0 == 0) goto L_0x0387
            java.lang.String r0 = "DefaultAudioSink"
            java.lang.String r2 = "Resetting stalled audio track"
            com.google.android.gms.internal.ads.zzdw.m48255e(r0, r2)
            r24.mo47916b()
            return r3
        L_0x0387:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzou.mo47926l(java.nio.ByteBuffer, long, int):boolean");
    }

    /* renamed from: m */
    public final void mo47927m(@Nullable zznb zznb) {
        this.f38102m = zznb;
    }

    /* renamed from: n */
    public final void mo47928n(zznv zznv) {
        this.f38103n = zznv;
    }

    /* renamed from: o */
    public final void mo47929o(zzk zzk) {
        if (!this.f38107r.equals(zzk)) {
            this.f38107r = zzk;
            mo47916b();
        }
    }

    /* renamed from: p */
    public final void mo47930p(int i) {
        if (this.f38084Q != i) {
            this.f38084Q = i;
            this.f38083P = i != 0;
            mo47916b();
        }
    }

    /* renamed from: q */
    public final void mo47931q(float f) {
        if (this.f38071D != f) {
            this.f38071D = f;
            m54431J();
        }
    }

    /* renamed from: r */
    public final boolean mo47932r() {
        return m54434M() && this.f38096g.mo47951g(m54446z());
    }

    /* renamed from: s */
    public final boolean mo47933s(zzaf zzaf) {
        return mo47918d(zzaf) != 0;
    }

    /* renamed from: u */
    public final boolean mo47934u() {
        return !m54434M() || (this.f38080M && !mo47932r());
    }
}
