package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzayn implements zzavi {

    /* renamed from: a */
    private final zzayk f26296a = new zzayk();

    /* renamed from: b */
    private final zzayj f26297b = new zzayj();

    /* renamed from: c */
    private final zzbak f26298c = new zzbak(32);

    /* renamed from: d */
    private final AtomicInteger f26299d = new AtomicInteger();

    /* renamed from: e */
    private zzayl f26300e;

    /* renamed from: f */
    private zzayl f26301f;

    /* renamed from: g */
    private zzasw f26302g;

    /* renamed from: h */
    private zzasw f26303h;

    /* renamed from: i */
    private long f26304i;

    /* renamed from: j */
    private int f26305j = 65536;

    /* renamed from: k */
    private zzaym f26306k;

    /* renamed from: l */
    private final zzazp f26307l;

    public zzayn(zzazp zzazp, byte[] bArr) {
        this.f26307l = zzazp;
        zzayl zzayl = new zzayl(0, 65536);
        this.f26300e = zzayl;
        this.f26301f = zzayl;
    }

    /* renamed from: o */
    private final int m42825o(int i) {
        if (this.f26305j == 65536) {
            this.f26305j = 0;
            zzayl zzayl = this.f26301f;
            if (zzayl.f26293c) {
                this.f26301f = zzayl.f26295e;
            }
            zzayl zzayl2 = this.f26301f;
            zzazj b = this.f26307l.mo42288b();
            zzayl zzayl3 = new zzayl(this.f26301f.f26292b, 65536);
            zzayl2.f26294d = b;
            zzayl2.f26295e = zzayl3;
            zzayl2.f26293c = true;
        }
        return Math.min(i, 65536 - this.f26305j);
    }

    /* renamed from: p */
    private final void m42826p() {
        this.f26296a.mo42237g();
        zzayl zzayl = this.f26300e;
        if (zzayl.f26293c) {
            zzayl zzayl2 = this.f26301f;
            int i = (zzayl2.f26293c ? 1 : 0) + (((int) (zzayl2.f26291a - zzayl.f26291a)) / 65536);
            zzazj[] zzazjArr = new zzazj[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzazjArr[i2] = zzayl.f26294d;
                zzayl.f26294d = null;
                zzayl = zzayl.f26295e;
            }
            this.f26307l.mo42290d(zzazjArr);
        }
        zzayl zzayl3 = new zzayl(0, 65536);
        this.f26300e = zzayl3;
        this.f26301f = zzayl3;
        this.f26304i = 0;
        this.f26305j = 65536;
        this.f26307l.mo42293g();
    }

    /* renamed from: q */
    private final void m42827q(long j) {
        while (true) {
            zzayl zzayl = this.f26300e;
            if (j >= zzayl.f26292b) {
                this.f26307l.mo42289c(zzayl.f26294d);
                zzayl zzayl2 = this.f26300e;
                zzayl2.f26294d = null;
                this.f26300e = zzayl2.f26295e;
            } else {
                return;
            }
        }
    }

    /* renamed from: r */
    private final void m42828r() {
        if (!this.f26299d.compareAndSet(1, 0)) {
            m42826p();
        }
    }

    /* renamed from: s */
    private final void m42829s(long j, byte[] bArr, int i) {
        m42827q(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.f26300e.f26291a);
            int min = Math.min(i - i2, 65536 - i3);
            zzazj zzazj = this.f26300e.f26294d;
            System.arraycopy(zzazj.f26349a, i3, bArr, i2, min);
            j += (long) min;
            i2 += min;
            if (j == this.f26300e.f26292b) {
                this.f26307l.mo42289c(zzazj);
                zzayl zzayl = this.f26300e;
                zzayl.f26294d = null;
                this.f26300e = zzayl.f26295e;
            }
        }
    }

    /* renamed from: t */
    private final boolean m42830t() {
        return this.f26299d.compareAndSet(0, 1);
    }

    /* renamed from: a */
    public final void mo42114a(long j, int i, int i2, int i3, zzavh zzavh) {
        if (m42830t()) {
            try {
                this.f26296a.mo42238h(j, i, this.f26304i - ((long) i2), i2, zzavh);
            } finally {
                m42828r();
            }
        } else {
            long j2 = j;
            this.f26296a.mo42239i(j);
        }
    }

    /* renamed from: b */
    public final void mo42115b(zzbak zzbak, int i) {
        if (m42830t()) {
            while (i > 0) {
                int o = m42825o(i);
                zzbak.mo42331q(this.f26301f.f26294d.f26349a, this.f26305j, o);
                this.f26305j += o;
                this.f26304i += (long) o;
                i -= o;
            }
            m42828r();
            return;
        }
        zzbak.mo42337w(i);
    }

    /* renamed from: c */
    public final int mo42116c(zzauy zzauy, int i, boolean z) throws IOException, InterruptedException {
        if (!m42830t()) {
            int b = zzauy.mo42094b(i);
            if (b != -1) {
                return b;
            }
            throw new EOFException();
        }
        try {
            int a = zzauy.mo42093a(this.f26301f.f26294d.f26349a, this.f26305j, m42825o(i));
            if (a != -1) {
                this.f26305j += a;
                this.f26304i += (long) a;
                return a;
            }
            throw new EOFException();
        } finally {
            m42828r();
        }
    }

    /* renamed from: d */
    public final void mo42117d(zzasw zzasw) {
        zzasw zzasw2 = zzasw == null ? null : zzasw;
        boolean k = this.f26296a.mo42241k(zzasw2);
        this.f26303h = zzasw;
        zzaym zzaym = this.f26306k;
        if (zzaym != null && k) {
            zzaym.mo42214i(zzasw2);
        }
    }

    /* renamed from: e */
    public final int mo42243e() {
        return this.f26296a.mo42231a();
    }

    /* renamed from: f */
    public final int mo42244f(zzasx zzasx, zzaur zzaur, boolean z, boolean z2, long j) {
        int i;
        zzaur zzaur2 = zzaur;
        int b = this.f26296a.mo42232b(zzasx, zzaur, z, z2, this.f26302g, this.f26297b);
        if (b == -5) {
            this.f26302g = zzasx.f25531a;
            return -5;
        } else if (b != -4) {
            return -3;
        } else {
            if (!zzaur.mo42069f()) {
                if (zzaur2.f25710d < j) {
                    zzaur2.mo42064a(Integer.MIN_VALUE);
                }
                if (zzaur.mo42075i()) {
                    zzayj zzayj = this.f26297b;
                    long j2 = zzayj.f26271b;
                    this.f26298c.mo42333s(1);
                    m42829s(j2, this.f26298c.f26406a, 1);
                    long j3 = j2 + 1;
                    byte b2 = this.f26298c.f26406a[0];
                    byte b3 = b2 & 128;
                    byte b4 = b2 & Byte.MAX_VALUE;
                    zzaup zzaup = zzaur2.f25708b;
                    if (zzaup.f25693a == null) {
                        zzaup.f25693a = new byte[16];
                    }
                    m42829s(j3, zzaup.f25693a, b4);
                    long j4 = j3 + ((long) b4);
                    if (b3 != 0) {
                        this.f26298c.mo42333s(2);
                        m42829s(j4, this.f26298c.f26406a, 2);
                        j4 += 2;
                        i = this.f26298c.mo42324j();
                    } else {
                        i = 1;
                    }
                    zzaup zzaup2 = zzaur2.f25708b;
                    int[] iArr = zzaup2.f25696d;
                    if (iArr == null || iArr.length < i) {
                        iArr = new int[i];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = zzaup2.f25697e;
                    if (iArr3 == null || iArr3.length < i) {
                        iArr3 = new int[i];
                    }
                    int[] iArr4 = iArr3;
                    if (b3 != 0) {
                        int i2 = i * 6;
                        this.f26298c.mo42333s(i2);
                        m42829s(j4, this.f26298c.f26406a, i2);
                        j4 += (long) i2;
                        this.f26298c.mo42336v(0);
                        for (int i3 = 0; i3 < i; i3++) {
                            iArr2[i3] = this.f26298c.mo42324j();
                            iArr4[i3] = this.f26298c.mo42323i();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = zzayj.f26270a - ((int) (j4 - zzayj.f26271b));
                    }
                    zzavh zzavh = zzayj.f26273d;
                    zzaup zzaup3 = zzaur2.f25708b;
                    zzaup3.mo42072b(i, iArr2, iArr4, zzavh.f25738b, zzaup3.f25693a, 1);
                    long j5 = zzayj.f26271b;
                    int i4 = (int) (j4 - j5);
                    zzayj.f26271b = j5 + ((long) i4);
                    zzayj.f26270a -= i4;
                }
                zzaur2.mo42074h(this.f26297b.f26270a);
                zzayj zzayj2 = this.f26297b;
                long j6 = zzayj2.f26271b;
                ByteBuffer byteBuffer = zzaur2.f25709c;
                int i5 = zzayj2.f26270a;
                m42827q(j6);
                while (i5 > 0) {
                    int i6 = (int) (j6 - this.f26300e.f26291a);
                    int min = Math.min(i5, 65536 - i6);
                    zzazj zzazj = this.f26300e.f26294d;
                    byteBuffer.put(zzazj.f26349a, i6, min);
                    j6 += (long) min;
                    i5 -= min;
                    if (j6 == this.f26300e.f26292b) {
                        this.f26307l.mo42289c(zzazj);
                        zzayl zzayl = this.f26300e;
                        zzayl.f26294d = null;
                        this.f26300e = zzayl.f26295e;
                    }
                }
                m42827q(this.f26297b.f26272c);
            }
            return -4;
        }
    }

    /* renamed from: g */
    public final long mo42245g() {
        return this.f26296a.mo42233c();
    }

    /* renamed from: h */
    public final zzasw mo42246h() {
        return this.f26296a.mo42236f();
    }

    /* renamed from: i */
    public final void mo42247i() {
        if (this.f26299d.getAndSet(2) == 0) {
            m42826p();
        }
    }

    /* renamed from: j */
    public final void mo42248j(boolean z) {
        int andSet = this.f26299d.getAndSet(true != z ? 2 : 0);
        m42826p();
        this.f26296a.mo42240j();
        if (andSet == 2) {
            this.f26302g = null;
        }
    }

    /* renamed from: k */
    public final void mo42249k(zzaym zzaym) {
        this.f26306k = zzaym;
    }

    /* renamed from: l */
    public final void mo42250l() {
        long d = this.f26296a.mo42234d();
        if (d != -1) {
            m42827q(d);
        }
    }

    /* renamed from: m */
    public final boolean mo42251m() {
        return this.f26296a.mo42242l();
    }

    /* renamed from: n */
    public final boolean mo42252n(long j, boolean z) {
        long e = this.f26296a.mo42235e(j, z);
        if (e == -1) {
            return false;
        }
        m42827q(e);
        return true;
    }
}
