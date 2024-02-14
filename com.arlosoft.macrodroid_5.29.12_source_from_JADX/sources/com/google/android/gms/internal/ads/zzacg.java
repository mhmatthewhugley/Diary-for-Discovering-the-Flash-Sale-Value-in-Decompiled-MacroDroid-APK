package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzacg {

    /* renamed from: a */
    private final ByteArrayOutputStream f23913a;

    /* renamed from: b */
    private final DataOutputStream f23914b;

    public zzacg() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f23913a = byteArrayOutputStream;
        this.f23914b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    private static void m41044b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: a */
    public final byte[] mo41265a(zzacf zzacf) {
        this.f23913a.reset();
        try {
            m41044b(this.f23914b, zzacf.f23907a);
            String str = zzacf.f23908c;
            if (str == null) {
                str = "";
            }
            m41044b(this.f23914b, str);
            this.f23914b.writeLong(zzacf.f23909d);
            this.f23914b.writeLong(zzacf.f23910f);
            this.f23914b.write(zzacf.f23911g);
            this.f23914b.flush();
            return this.f23913a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
