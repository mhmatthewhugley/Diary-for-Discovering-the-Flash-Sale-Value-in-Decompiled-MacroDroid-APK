package p095g4;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: g4.d */
/* compiled from: GifHeaderParser */
public class C7337d {

    /* renamed from: a */
    private final byte[] f17968a = new byte[256];

    /* renamed from: b */
    private ByteBuffer f17969b;

    /* renamed from: c */
    private C7336c f17970c;

    /* renamed from: d */
    private int f17971d = 0;

    /* renamed from: b */
    private boolean m30306b() {
        return this.f17970c.f17956b != 0;
    }

    /* renamed from: d */
    private int m30307d() {
        try {
            return this.f17969b.get() & 255;
        } catch (Exception unused) {
            this.f17970c.f17956b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    private void m30308e() {
        this.f17970c.f17958d.f17944a = m30317n();
        this.f17970c.f17958d.f17945b = m30317n();
        this.f17970c.f17958d.f17946c = m30317n();
        this.f17970c.f17958d.f17947d = m30317n();
        int d = m30307d();
        boolean z = false;
        boolean z2 = (d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        C7335b bVar = this.f17970c.f17958d;
        if ((d & 64) != 0) {
            z = true;
        }
        bVar.f17948e = z;
        if (z2) {
            bVar.f17954k = m30310g(pow);
        } else {
            bVar.f17954k = null;
        }
        this.f17970c.f17958d.f17953j = this.f17969b.position();
        m30320r();
        if (!m30306b()) {
            C7336c cVar = this.f17970c;
            cVar.f17957c++;
            cVar.f17959e.add(cVar.f17958d);
        }
    }

    /* renamed from: f */
    private void m30309f() {
        int d = m30307d();
        this.f17971d = d;
        if (d > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.f17971d;
                    if (i < i3) {
                        i2 = i3 - i;
                        this.f17969b.get(this.f17968a, i, i2);
                        i += i2;
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error Reading Block n: ");
                        sb.append(i);
                        sb.append(" count: ");
                        sb.append(i2);
                        sb.append(" blockSize: ");
                        sb.append(this.f17971d);
                    }
                    this.f17970c.f17956b = 1;
                    return;
                }
            }
        }
    }

    @Nullable
    /* renamed from: g */
    private int[] m30310g(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f17969b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.f17970c.f17956b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    private void m30311h() {
        m30312i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    private void m30312i(int i) {
        boolean z = false;
        while (!z && !m30306b() && this.f17970c.f17957c <= i) {
            int d = m30307d();
            if (d == 33) {
                int d2 = m30307d();
                if (d2 == 1) {
                    m30319q();
                } else if (d2 == 249) {
                    this.f17970c.f17958d = new C7335b();
                    m30313j();
                } else if (d2 == 254) {
                    m30319q();
                } else if (d2 != 255) {
                    m30319q();
                } else {
                    m30309f();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f17968a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m30316m();
                    } else {
                        m30319q();
                    }
                }
            } else if (d == 44) {
                C7336c cVar = this.f17970c;
                if (cVar.f17958d == null) {
                    cVar.f17958d = new C7335b();
                }
                m30308e();
            } else if (d != 59) {
                this.f17970c.f17956b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: j */
    private void m30313j() {
        m30307d();
        int d = m30307d();
        C7335b bVar = this.f17970c.f17958d;
        int i = (d & 28) >> 2;
        bVar.f17950g = i;
        boolean z = true;
        if (i == 0) {
            bVar.f17950g = 1;
        }
        if ((d & 1) == 0) {
            z = false;
        }
        bVar.f17949f = z;
        int n = m30317n();
        if (n < 2) {
            n = 10;
        }
        C7335b bVar2 = this.f17970c.f17958d;
        bVar2.f17952i = n * 10;
        bVar2.f17951h = m30307d();
        m30307d();
    }

    /* renamed from: k */
    private void m30314k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m30307d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f17970c.f17956b = 1;
            return;
        }
        m30315l();
        if (this.f17970c.f17962h && !m30306b()) {
            C7336c cVar = this.f17970c;
            cVar.f17955a = m30310g(cVar.f17963i);
            C7336c cVar2 = this.f17970c;
            cVar2.f17966l = cVar2.f17955a[cVar2.f17964j];
        }
    }

    /* renamed from: l */
    private void m30315l() {
        this.f17970c.f17960f = m30317n();
        this.f17970c.f17961g = m30317n();
        int d = m30307d();
        C7336c cVar = this.f17970c;
        cVar.f17962h = (d & 128) != 0;
        cVar.f17963i = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        this.f17970c.f17964j = m30307d();
        this.f17970c.f17965k = m30307d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m30316m() {
        /*
            r3 = this;
        L_0x0000:
            r3.m30309f()
            byte[] r0 = r3.f17968a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x001b
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            g4.c r2 = r3.f17970c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.f17967m = r0
        L_0x001b:
            int r0 = r3.f17971d
            if (r0 <= 0) goto L_0x0025
            boolean r0 = r3.m30306b()
            if (r0 == 0) goto L_0x0000
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p095g4.C7337d.m30316m():void");
    }

    /* renamed from: n */
    private int m30317n() {
        return this.f17969b.getShort();
    }

    /* renamed from: o */
    private void m30318o() {
        this.f17969b = null;
        Arrays.fill(this.f17968a, (byte) 0);
        this.f17970c = new C7336c();
        this.f17971d = 0;
    }

    /* renamed from: q */
    private void m30319q() {
        int d;
        do {
            d = m30307d();
            this.f17969b.position(Math.min(this.f17969b.position() + d, this.f17969b.limit()));
        } while (d > 0);
    }

    /* renamed from: r */
    private void m30320r() {
        m30307d();
        m30319q();
    }

    /* renamed from: a */
    public void mo37317a() {
        this.f17969b = null;
        this.f17970c = null;
    }

    @NonNull
    /* renamed from: c */
    public C7336c mo37318c() {
        if (this.f17969b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m30306b()) {
            return this.f17970c;
        } else {
            m30314k();
            if (!m30306b()) {
                m30311h();
                C7336c cVar = this.f17970c;
                if (cVar.f17957c < 0) {
                    cVar.f17956b = 1;
                }
            }
            return this.f17970c;
        }
    }

    /* renamed from: p */
    public C7337d mo37319p(@NonNull ByteBuffer byteBuffer) {
        m30318o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f17969b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f17969b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
