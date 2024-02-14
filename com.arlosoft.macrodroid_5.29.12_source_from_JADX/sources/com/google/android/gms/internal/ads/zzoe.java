package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzoe extends zzod {
    @Nullable

    /* renamed from: i */
    private int[] f38032i;
    @Nullable

    /* renamed from: j */
    private int[] f38033j;

    zzoe() {
    }

    /* renamed from: b */
    public final void mo47874b(ByteBuffer byteBuffer) {
        int[] iArr = this.f38033j;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer i = mo47957i(((limit - position) / this.f38025b.f37948d) * this.f38026c.f37948d);
        while (position < limit) {
            for (int i2 : iArr) {
                i.putShort(byteBuffer.getShort(i2 + i2 + position));
            }
            position += this.f38025b.f37948d;
        }
        byteBuffer.position(limit);
        i.flip();
    }

    /* renamed from: h */
    public final zzne mo47956h(zzne zzne) throws zznf {
        int[] iArr = this.f38032i;
        if (iArr == null) {
            return zzne.f37944e;
        }
        if (zzne.f37947c == 2) {
            boolean z = zzne.f37946b != iArr.length;
            int i = 0;
            while (true) {
                int length = iArr.length;
                if (i >= length) {
                    return z ? new zzne(zzne.f37945a, length, 2) : zzne.f37944e;
                }
                int i2 = iArr[i];
                if (i2 < zzne.f37946b) {
                    z |= i2 != i;
                    i++;
                } else {
                    throw new zznf(zzne);
                }
            }
        } else {
            throw new zznf(zzne);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo47958j() {
        this.f38033j = this.f38032i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo47960l() {
        this.f38033j = null;
        this.f38032i = null;
    }

    /* renamed from: n */
    public final void mo47962n(@Nullable int[] iArr) {
        this.f38032i = iArr;
    }
}
