package com.google.android.gms.nearby.messages.internal;

import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzl extends zzc {
    /* renamed from: d */
    public final Short mo56019d() {
        byte[] c = mo55984c();
        if (c.length >= 18) {
            return Short.valueOf(ByteBuffer.wrap(c).getShort(16));
        }
        return null;
    }

    /* renamed from: e */
    public final Short mo56020e() {
        byte[] c = mo55984c();
        if (c.length == 20) {
            return Short.valueOf(ByteBuffer.wrap(c).getShort(18));
        }
        return null;
    }

    /* renamed from: f */
    public final UUID mo56021f() {
        ByteBuffer wrap = ByteBuffer.wrap(mo55984c());
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    public final String toString() {
        String obj = mo56021f().toString();
        Short d = mo56019d();
        Short e = mo56020e();
        return "IBeaconIdPrefix{proximityUuid=" + obj + ", major=" + d + ", minor=" + e + "}";
    }
}
