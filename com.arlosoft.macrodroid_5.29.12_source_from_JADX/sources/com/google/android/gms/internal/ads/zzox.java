package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzox extends zzod {

    /* renamed from: i */
    private static final int f38116i = Float.floatToIntBits(Float.NaN);

    zzox() {
    }

    /* renamed from: n */
    private static void m54471n(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (floatToIntBits == f38116i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    /* renamed from: b */
    public final void mo47874b(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f38025b.f37947c;
        if (i2 == 536870912) {
            byteBuffer2 = mo47957i((i / 3) * 4);
            while (position < limit) {
                m54471n(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = mo47957i(i);
            while (position < limit) {
                m54471n((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    /* renamed from: h */
    public final zzne mo47956h(zzne zzne) throws zznf {
        int i = zzne.f37947c;
        if (zzen.m49182u(i)) {
            return i != 4 ? new zzne(zzne.f37945a, zzne.f37946b, 4) : zzne.f37944e;
        }
        throw new zznf(zzne);
    }
}
