package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import org.apache.commons.p353io.FileUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaue {

    /* renamed from: A */
    private Method f25582A;

    /* renamed from: B */
    private int f25583B;

    /* renamed from: C */
    private long f25584C;

    /* renamed from: D */
    private long f25585D;

    /* renamed from: E */
    private int f25586E;

    /* renamed from: F */
    private long f25587F;

    /* renamed from: G */
    private long f25588G;

    /* renamed from: H */
    private int f25589H;

    /* renamed from: I */
    private int f25590I;

    /* renamed from: J */
    private long f25591J;

    /* renamed from: K */
    private long f25592K;

    /* renamed from: L */
    private long f25593L;

    /* renamed from: M */
    private float f25594M;

    /* renamed from: N */
    private zzatl[] f25595N;

    /* renamed from: O */
    private ByteBuffer[] f25596O;

    /* renamed from: P */
    private ByteBuffer f25597P;

    /* renamed from: Q */
    private ByteBuffer f25598Q;

    /* renamed from: R */
    private byte[] f25599R;

    /* renamed from: S */
    private int f25600S;

    /* renamed from: T */
    private int f25601T;

    /* renamed from: U */
    private boolean f25602U;

    /* renamed from: V */
    private boolean f25603V;

    /* renamed from: W */
    private int f25604W;

    /* renamed from: X */
    private boolean f25605X;

    /* renamed from: Y */
    private long f25606Y;

    /* renamed from: a */
    private final zzauf f25607a;

    /* renamed from: b */
    private final zzaul f25608b;

    /* renamed from: c */
    private final zzatl[] f25609c;

    /* renamed from: d */
    private final zzaua f25610d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ConditionVariable f25611e = new ConditionVariable(true);

    /* renamed from: f */
    private final long[] f25612f;

    /* renamed from: g */
    private final zzatw f25613g;

    /* renamed from: h */
    private final LinkedList f25614h;

    /* renamed from: i */
    private AudioTrack f25615i;

    /* renamed from: j */
    private int f25616j;

    /* renamed from: k */
    private int f25617k;

    /* renamed from: l */
    private int f25618l;

    /* renamed from: m */
    private int f25619m;

    /* renamed from: n */
    private boolean f25620n;

    /* renamed from: o */
    private int f25621o;

    /* renamed from: p */
    private long f25622p;

    /* renamed from: q */
    private zzata f25623q;

    /* renamed from: r */
    private zzata f25624r;

    /* renamed from: s */
    private long f25625s;

    /* renamed from: t */
    private long f25626t;

    /* renamed from: u */
    private int f25627u;

    /* renamed from: v */
    private int f25628v;

    /* renamed from: w */
    private long f25629w;

    /* renamed from: x */
    private long f25630x;

    /* renamed from: y */
    private boolean f25631y;

    /* renamed from: z */
    private long f25632z;

    public zzaue(zzatj zzatj, zzatl[] zzatlArr, zzaua zzaua) {
        this.f25610d = zzaua;
        if (zzbar.f26418a >= 18) {
            try {
                this.f25582A = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzbar.f26418a >= 19) {
            this.f25613g = new zzatx();
        } else {
            this.f25613g = new zzatw((zzatv) null);
        }
        zzauf zzauf = new zzauf();
        this.f25607a = zzauf;
        zzaul zzaul = new zzaul();
        this.f25608b = zzaul;
        zzatl[] zzatlArr2 = new zzatl[3];
        this.f25609c = zzatlArr2;
        zzatlArr2[0] = new zzauj();
        zzatlArr2[1] = zzauf;
        System.arraycopy(zzatlArr, 0, zzatlArr2, 2, 0);
        zzatlArr2[2] = zzaul;
        this.f25612f = new long[10];
        this.f25594M = 1.0f;
        this.f25590I = 0;
        this.f25604W = 0;
        this.f25624r = zzata.f25533d;
        this.f25601T = -1;
        this.f25595N = new zzatl[0];
        this.f25596O = new ByteBuffer[0];
        this.f25614h = new LinkedList();
    }

    /* renamed from: p */
    private final long m42453p(long j) {
        return (j * ((long) this.f25616j)) / 1000000;
    }

    /* renamed from: q */
    private final long m42454q(long j) {
        return (j * 1000000) / ((long) this.f25616j);
    }

    /* renamed from: r */
    private final long m42455r() {
        return this.f25620n ? this.f25588G : this.f25587F / ((long) this.f25586E);
    }

    /* renamed from: s */
    private final void m42456s(long j) throws zzaud {
        ByteBuffer byteBuffer;
        int length = this.f25595N.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f25596O[i - 1];
            } else {
                byteBuffer = this.f25597P;
                if (byteBuffer == null) {
                    byteBuffer = zzatl.f25551a;
                }
            }
            if (i == length) {
                m42463z(byteBuffer, j);
            } else {
                zzatl zzatl = this.f25595N[i];
                zzatl.mo41998c(byteBuffer);
                ByteBuffer a = zzatl.mo41996a();
                this.f25596O[i] = a;
                if (a.hasRemaining()) {
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

    /* renamed from: t */
    private final void m42457t() {
        ArrayList arrayList = new ArrayList();
        zzatl[] zzatlArr = this.f25609c;
        for (int i = 0; i < 3; i++) {
            zzatl zzatl = zzatlArr[i];
            if (zzatl.mo42002g()) {
                arrayList.add(zzatl);
            } else {
                zzatl.mo41999d();
            }
        }
        int size = arrayList.size();
        this.f25595N = (zzatl[]) arrayList.toArray(new zzatl[size]);
        this.f25596O = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            zzatl zzatl2 = this.f25595N[i2];
            zzatl2.mo41999d();
            this.f25596O[i2] = zzatl2.mo41996a();
        }
    }

    /* renamed from: u */
    private final void m42458u() {
        this.f25629w = 0;
        this.f25628v = 0;
        this.f25627u = 0;
        this.f25630x = 0;
        this.f25631y = false;
        this.f25632z = 0;
    }

    /* renamed from: v */
    private final void m42459v() {
        if (m42461x()) {
            if (zzbar.f26418a >= 21) {
                this.f25615i.setVolume(this.f25594M);
                return;
            }
            AudioTrack audioTrack = this.f25615i;
            float f = this.f25594M;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m42460w() throws com.google.android.gms.internal.ads.zzaud {
        /*
            r9 = this;
            int r0 = r9.f25601T
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.f25620n
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.zzatl[] r0 = r9.f25595N
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r9.f25601T = r0
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r9.f25601T
            com.google.android.gms.internal.ads.zzatl[] r5 = r9.f25595N
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0038
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.mo41997b()
        L_0x0028:
            r9.m42456s(r7)
            boolean r0 = r4.mo42003h()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.f25601T
            int r0 = r0 + r2
            r9.f25601T = r0
            goto L_0x0012
        L_0x0038:
            java.nio.ByteBuffer r0 = r9.f25598Q
            if (r0 == 0) goto L_0x0044
            r9.m42463z(r0, r7)
            java.nio.ByteBuffer r0 = r9.f25598Q
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            r9.f25601T = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaue.m42460w():boolean");
    }

    /* renamed from: x */
    private final boolean m42461x() {
        return this.f25615i != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r4.f25619m;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m42462y() {
        /*
            r4 = this;
            int r0 = com.google.android.gms.internal.ads.zzbar.f26418a
            r1 = 1
            r2 = 0
            r3 = 23
            if (r0 >= r3) goto L_0x0012
            int r0 = r4.f25619m
            r3 = 5
            if (r0 == r3) goto L_0x0013
            r3 = 6
            if (r0 == r3) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaue.m42462y():boolean");
    }

    /* renamed from: z */
    private final boolean m42463z(ByteBuffer byteBuffer, long j) throws zzaud {
        int i;
        if (!byteBuffer.hasRemaining()) {
            return true;
        }
        ByteBuffer byteBuffer2 = this.f25598Q;
        if (byteBuffer2 != null) {
            zzbac.m42924c(byteBuffer2 == byteBuffer);
        } else {
            this.f25598Q = byteBuffer;
            if (zzbar.f26418a < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.f25599R;
                if (bArr == null || bArr.length < remaining) {
                    this.f25599R = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.f25599R, 0, remaining);
                byteBuffer.position(position);
                this.f25600S = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        if (zzbar.f26418a < 21) {
            int a = this.f25621o - ((int) (this.f25587F - (this.f25613g.mo42020a() * ((long) this.f25586E))));
            if (a > 0) {
                i = this.f25615i.write(this.f25599R, this.f25600S, Math.min(remaining2, a));
                if (i > 0) {
                    this.f25600S += i;
                    byteBuffer.position(byteBuffer.position() + i);
                }
            } else {
                i = 0;
            }
        } else {
            i = this.f25615i.write(byteBuffer, remaining2, 1);
        }
        this.f25606Y = SystemClock.elapsedRealtime();
        if (i >= 0) {
            boolean z = this.f25620n;
            if (!z) {
                this.f25587F += (long) i;
            }
            if (i != remaining2) {
                return false;
            }
            if (z) {
                this.f25588G += (long) this.f25589H;
            }
            this.f25598Q = null;
            return true;
        }
        throw new zzaud(i);
    }

    /* renamed from: a */
    public final long mo42028a(boolean z) {
        long j;
        long j2;
        if (!m42461x() || this.f25590I == 0) {
            return Long.MIN_VALUE;
        }
        if (this.f25615i.getPlayState() == 3) {
            long b = this.f25613g.mo42021b();
            if (b != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f25630x >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    long[] jArr = this.f25612f;
                    int i = this.f25627u;
                    jArr[i] = b - nanoTime;
                    this.f25627u = (i + 1) % 10;
                    int i2 = this.f25628v;
                    if (i2 < 10) {
                        this.f25628v = i2 + 1;
                    }
                    this.f25630x = nanoTime;
                    this.f25629w = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f25628v;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f25629w += this.f25612f[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!m42462y() && nanoTime - this.f25632z >= 500000) {
                    boolean h = this.f25613g.mo42027h();
                    this.f25631y = h;
                    if (h) {
                        long d = this.f25613g.mo42023d() / 1000;
                        long c = this.f25613g.mo42022c();
                        if (d < this.f25592K) {
                            this.f25631y = false;
                        } else if (Math.abs(d - nanoTime) > 5000000) {
                            Log.w("AudioTrack", "Spurious audio timestamp (system clock mismatch): " + c + ", " + d + ", " + nanoTime + ", " + b);
                            this.f25631y = false;
                        } else if (Math.abs(m42454q(c) - b) > 5000000) {
                            Log.w("AudioTrack", "Spurious audio timestamp (frame position mismatch): " + c + ", " + d + ", " + nanoTime + ", " + b);
                            this.f25631y = false;
                        }
                    }
                    Method method = this.f25582A;
                    if (method != null && !this.f25620n) {
                        try {
                            long intValue = (((long) ((Integer) method.invoke(this.f25615i, (Object[]) null)).intValue()) * 1000) - this.f25622p;
                            this.f25593L = intValue;
                            long max = Math.max(intValue, 0);
                            this.f25593L = max;
                            if (max > 5000000) {
                                Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + max);
                                this.f25593L = 0;
                            }
                        } catch (Exception unused) {
                            this.f25582A = null;
                        }
                    }
                    this.f25632z = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f25631y) {
            j = m42454q(this.f25613g.mo42022c() + m42453p(nanoTime2 - (this.f25613g.mo42023d() / 1000)));
        } else {
            j = this.f25628v == 0 ? this.f25613g.mo42021b() : nanoTime2 + this.f25629w;
            if (!z) {
                j -= this.f25593L;
            }
        }
        long j3 = this.f25591J;
        while (!this.f25614h.isEmpty() && j >= ((zzauc) this.f25614h.getFirst()).f25581c) {
            zzauc zzauc = (zzauc) this.f25614h.remove();
            this.f25624r = zzauc.f25579a;
            this.f25626t = zzauc.f25581c;
            this.f25625s = zzauc.f25580b - this.f25591J;
        }
        if (this.f25624r.f25534a == 1.0f) {
            j2 = (j + this.f25625s) - this.f25626t;
        } else {
            if (this.f25614h.isEmpty()) {
                zzaul zzaul = this.f25608b;
                if (zzaul.mo42063l() >= FileUtils.ONE_KB) {
                    j2 = zzbar.m42994j(j - this.f25626t, zzaul.mo42062k(), zzaul.mo42063l()) + this.f25625s;
                }
            }
            j2 = ((long) (((double) this.f25624r.f25534a) * ((double) (j - this.f25626t)))) + this.f25625s;
        }
        return j3 + j2;
    }

    /* renamed from: c */
    public final zzata mo42029c() {
        return this.f25624r;
    }

    /* renamed from: d */
    public final zzata mo42030d(zzata zzata) {
        if (this.f25620n) {
            zzata zzata2 = zzata.f25533d;
            this.f25624r = zzata2;
            return zzata2;
        }
        float j = this.f25608b.mo42061j(zzata.f25534a);
        this.f25608b.mo42060i(1.0f);
        zzata zzata3 = new zzata(j, 1.0f);
        zzata zzata4 = this.f25623q;
        if (zzata4 == null) {
            if (!this.f25614h.isEmpty()) {
                zzata4 = ((zzauc) this.f25614h.getLast()).f25579a;
            } else {
                zzata4 = this.f25624r;
            }
        }
        if (!zzata3.equals(zzata4)) {
            if (m42461x()) {
                this.f25623q = zzata3;
            } else {
                this.f25624r = zzata3;
            }
        }
        return this.f25624r;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b3  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42031e(java.lang.String r7, int r8, int r9, int r10, int r11, int[] r12) throws com.google.android.gms.internal.ads.zzaty {
        /*
            r6 = this;
            int r7 = com.google.android.gms.internal.ads.zzbar.m42993i(r10, r8)
            r6.f25583B = r7
            com.google.android.gms.internal.ads.zzauf r7 = r6.f25607a
            r7.mo42042i(r12)
            com.google.android.gms.internal.ads.zzatl[] r7 = r6.f25609c
            r11 = 0
            r12 = 0
            r0 = 0
        L_0x0010:
            r1 = 3
            r2 = 2
            if (r12 >= r1) goto L_0x0033
            r1 = r7[r12]
            boolean r3 = r1.mo42000e(r9, r8, r10)     // Catch:{ zzatk -> 0x002c }
            r0 = r0 | r3
            boolean r3 = r1.mo42002g()
            if (r3 == 0) goto L_0x0029
            int r8 = r1.zza()
            r1.zzb()
            r10 = 2
        L_0x0029:
            int r12 = r12 + 1
            goto L_0x0010
        L_0x002c:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzaty r8 = new com.google.android.gms.internal.ads.zzaty
            r8.<init>((java.lang.Throwable) r7)
            throw r8
        L_0x0033:
            if (r0 == 0) goto L_0x0038
            r6.m42457t()
        L_0x0038:
            r7 = 252(0xfc, float:3.53E-43)
            switch(r8) {
                case 1: goto L_0x0069;
                case 2: goto L_0x0066;
                case 3: goto L_0x0063;
                case 4: goto L_0x0060;
                case 5: goto L_0x005d;
                case 6: goto L_0x005a;
                case 7: goto L_0x0057;
                case 8: goto L_0x0054;
                default: goto L_0x003d;
            }
        L_0x003d:
            com.google.android.gms.internal.ads.zzaty r7 = new com.google.android.gms.internal.ads.zzaty
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Unsupported channel count: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>((java.lang.String) r8)
            throw r7
        L_0x0054:
            int r12 = com.google.android.gms.internal.ads.zzash.f25406a
            goto L_0x006a
        L_0x0057:
            r12 = 1276(0x4fc, float:1.788E-42)
            goto L_0x006a
        L_0x005a:
            r12 = 252(0xfc, float:3.53E-43)
            goto L_0x006a
        L_0x005d:
            r12 = 220(0xdc, float:3.08E-43)
            goto L_0x006a
        L_0x0060:
            r12 = 204(0xcc, float:2.86E-43)
            goto L_0x006a
        L_0x0063:
            r12 = 28
            goto L_0x006a
        L_0x0066:
            r12 = 12
            goto L_0x006a
        L_0x0069:
            r12 = 4
        L_0x006a:
            int r3 = com.google.android.gms.internal.ads.zzbar.f26418a
            r4 = 23
            if (r3 > r4) goto L_0x0090
            java.lang.String r4 = com.google.android.gms.internal.ads.zzbar.f26419b
            java.lang.String r5 = "foster"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0090
            java.lang.String r4 = com.google.android.gms.internal.ads.zzbar.f26420c
            java.lang.String r5 = "NVIDIA"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0090
            if (r8 == r1) goto L_0x0091
            r1 = 5
            if (r8 == r1) goto L_0x0091
            r7 = 7
            if (r8 == r7) goto L_0x008d
            goto L_0x0090
        L_0x008d:
            int r7 = com.google.android.gms.internal.ads.zzash.f25406a
            goto L_0x0091
        L_0x0090:
            r7 = r12
        L_0x0091:
            r12 = 25
            if (r3 > r12) goto L_0x009d
            java.lang.String r12 = com.google.android.gms.internal.ads.zzbar.f26419b
            java.lang.String r1 = "fugu"
            boolean r12 = r1.equals(r12)
        L_0x009d:
            if (r0 != 0) goto L_0x00b3
            boolean r12 = r6.m42461x()
            if (r12 == 0) goto L_0x00b3
            int r12 = r6.f25618l
            if (r12 != r10) goto L_0x00b3
            int r12 = r6.f25616j
            if (r12 != r9) goto L_0x00b3
            int r12 = r6.f25617k
            if (r12 == r7) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            return
        L_0x00b3:
            r6.mo42037k()
            r6.f25618l = r10
            r6.f25620n = r11
            r6.f25616j = r9
            r6.f25617k = r7
            r6.f25619m = r2
            int r8 = com.google.android.gms.internal.ads.zzbar.m42993i(r2, r8)
            r6.f25586E = r8
            int r8 = r6.f25619m
            int r7 = android.media.AudioTrack.getMinBufferSize(r9, r7, r8)
            r8 = -2
            if (r7 == r8) goto L_0x00d0
            r11 = 1
        L_0x00d0:
            com.google.android.gms.internal.ads.zzbac.m42926e(r11)
            int r8 = r7 * 4
            r9 = 250000(0x3d090, double:1.235164E-318)
            long r9 = r6.m42453p(r9)
            int r11 = r6.f25586E
            int r10 = (int) r9
            int r10 = r10 * r11
            long r0 = (long) r7
            r2 = 750000(0xb71b0, double:3.70549E-318)
            long r2 = r6.m42453p(r2)
            long r11 = (long) r11
            long r2 = r2 * r11
            long r11 = java.lang.Math.max(r0, r2)
            int r7 = (int) r11
            if (r8 >= r10) goto L_0x00f5
            r8 = r10
            goto L_0x00f8
        L_0x00f5:
            if (r8 <= r7) goto L_0x00f8
            r8 = r7
        L_0x00f8:
            r6.f25621o = r8
            int r7 = r6.f25586E
            int r8 = r8 / r7
            long r7 = (long) r8
            long r7 = r6.m42454q(r7)
            r6.f25622p = r7
            com.google.android.gms.internal.ads.zzata r7 = r6.f25624r
            r6.mo42030d(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaue.mo42031e(java.lang.String, int, int, int, int, int[]):void");
    }

    /* renamed from: f */
    public final void mo42032f() {
        if (this.f25590I == 1) {
            this.f25590I = 2;
        }
    }

    /* renamed from: g */
    public final void mo42033g() {
        this.f25603V = false;
        if (m42461x()) {
            m42458u();
            this.f25613g.mo42025f();
        }
    }

    /* renamed from: h */
    public final void mo42034h() {
        this.f25603V = true;
        if (m42461x()) {
            this.f25592K = System.nanoTime() / 1000;
            this.f25615i.play();
        }
    }

    /* renamed from: i */
    public final void mo42035i() throws zzaud {
        if (!this.f25602U && m42461x() && m42460w()) {
            this.f25613g.mo42024e(m42455r());
            this.f25602U = true;
        }
    }

    /* renamed from: j */
    public final void mo42036j() {
        mo42037k();
        zzatl[] zzatlArr = this.f25609c;
        for (int i = 0; i < 3; i++) {
            zzatlArr[i].mo42001f();
        }
        this.f25604W = 0;
        this.f25603V = false;
    }

    /* renamed from: k */
    public final void mo42037k() {
        if (m42461x()) {
            this.f25584C = 0;
            this.f25585D = 0;
            this.f25587F = 0;
            this.f25588G = 0;
            this.f25589H = 0;
            zzata zzata = this.f25623q;
            if (zzata != null) {
                this.f25624r = zzata;
                this.f25623q = null;
            } else if (!this.f25614h.isEmpty()) {
                this.f25624r = ((zzauc) this.f25614h.getLast()).f25579a;
            }
            this.f25614h.clear();
            this.f25625s = 0;
            this.f25626t = 0;
            this.f25597P = null;
            this.f25598Q = null;
            int i = 0;
            while (true) {
                zzatl[] zzatlArr = this.f25595N;
                if (i >= zzatlArr.length) {
                    break;
                }
                zzatl zzatl = zzatlArr[i];
                zzatl.mo41999d();
                this.f25596O[i] = zzatl.mo41996a();
                i++;
            }
            this.f25602U = false;
            this.f25601T = -1;
            this.f25590I = 0;
            this.f25593L = 0;
            m42458u();
            if (this.f25615i.getPlayState() == 3) {
                this.f25615i.pause();
            }
            AudioTrack audioTrack = this.f25615i;
            this.f25615i = null;
            this.f25613g.mo42026g((AudioTrack) null, false);
            this.f25611e.close();
            new zzatu(this, audioTrack).start();
        }
    }

    /* renamed from: l */
    public final void mo42038l(float f) {
        if (this.f25594M != f) {
            this.f25594M = f;
            m42459v();
        }
    }

    /* renamed from: m */
    public final boolean mo42039m(ByteBuffer byteBuffer, long j) throws zzatz, zzaud {
        long j2;
        int i;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j3 = j;
        ByteBuffer byteBuffer3 = this.f25597P;
        zzbac.m42924c(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (!m42461x()) {
            this.f25611e.block();
            int i2 = this.f25604W;
            if (i2 == 0) {
                this.f25615i = new AudioTrack(3, this.f25616j, this.f25617k, this.f25619m, this.f25621o, 1);
            } else {
                this.f25615i = new AudioTrack(3, this.f25616j, this.f25617k, this.f25619m, this.f25621o, 1, i2);
            }
            int state = this.f25615i.getState();
            if (state == 1) {
                int audioSessionId = this.f25615i.getAudioSessionId();
                if (this.f25604W != audioSessionId) {
                    this.f25604W = audioSessionId;
                    ((zzauh) this.f25610d).f25641a.f25642Q.mo42012b(audioSessionId);
                }
                this.f25613g.mo42026g(this.f25615i, m42462y());
                m42459v();
                this.f25605X = false;
                if (this.f25603V) {
                    mo42034h();
                }
            } else {
                try {
                    this.f25615i.release();
                } catch (Exception unused) {
                } finally {
                    this.f25615i = null;
                }
                throw new zzatz(state, this.f25616j, this.f25617k, this.f25621o);
            }
        }
        if (m42462y()) {
            if (this.f25615i.getPlayState() == 2) {
                this.f25605X = false;
                return false;
            } else if (this.f25615i.getPlayState() == 1 && this.f25613g.mo42020a() != 0) {
                return false;
            }
        }
        boolean z = this.f25605X;
        boolean n = mo42040n();
        this.f25605X = n;
        if (z && !n && this.f25615i.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j4 = this.f25606Y;
            zzaua zzaua = this.f25610d;
            ((zzauh) zzaua).f25641a.f25642Q.mo42013c(this.f25621o, zzash.m42274b(this.f25622p), elapsedRealtime - j4);
        }
        if (this.f25597P == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f25620n && this.f25589H == 0) {
                int i3 = this.f25619m;
                if (i3 == 7 || i3 == 8) {
                    int position = byteBuffer.position();
                    i = ((((byteBuffer2.get(position + 5) & 252) >> 2) | ((byteBuffer2.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i3 == 5) {
                    int i4 = zzati.f25547d;
                    i = 1536;
                } else if (i3 == 6) {
                    i = zzati.m42418a(byteBuffer);
                } else {
                    throw new IllegalStateException("Unexpected audio encoding: " + i3);
                }
                this.f25589H = i;
            }
            if (this.f25623q != null) {
                if (!m42460w()) {
                    return false;
                }
                this.f25614h.add(new zzauc(this.f25623q, Math.max(0, j3), m42454q(m42455r()), (zzaub) null));
                this.f25623q = null;
                m42457t();
            }
            if (this.f25590I == 0) {
                this.f25591J = Math.max(0, j3);
                this.f25590I = 1;
            } else {
                long j5 = this.f25591J;
                if (this.f25620n) {
                    j2 = this.f25585D;
                } else {
                    j2 = this.f25584C / ((long) this.f25583B);
                }
                long q = j5 + m42454q(j2);
                if (this.f25590I == 1 && Math.abs(q - j3) > 200000) {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + q + ", got " + j3 + "]");
                    this.f25590I = 2;
                }
                if (this.f25590I == 2) {
                    this.f25591J += j3 - q;
                    this.f25590I = 1;
                    ((zzauh) this.f25610d).f25641a.f25648W = true;
                }
            }
            if (this.f25620n) {
                this.f25585D += (long) this.f25589H;
            } else {
                this.f25584C += (long) byteBuffer.remaining();
            }
            this.f25597P = byteBuffer2;
        }
        if (this.f25620n) {
            m42463z(this.f25597P, j3);
        } else {
            m42456s(j3);
        }
        if (this.f25597P.hasRemaining()) {
            return false;
        }
        this.f25597P = null;
        return true;
    }

    /* renamed from: n */
    public final boolean mo42040n() {
        if (m42461x()) {
            if (m42455r() > this.f25613g.mo42020a()) {
                return true;
            }
            if (m42462y() && this.f25615i.getPlayState() == 2 && this.f25615i.getPlaybackHeadPosition() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo42041o() {
        return !m42461x() || (this.f25602U && !mo42040n());
    }
}
