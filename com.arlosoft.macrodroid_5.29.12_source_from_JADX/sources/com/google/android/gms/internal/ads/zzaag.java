package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaag {
    /* renamed from: a */
    public static List m40919a(byte[] bArr) {
        byte b = bArr[11];
        byte b2 = bArr[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m40921c(m40920b((long) (((b & 255) << 8) | (b2 & 255)))));
        arrayList.add(m40921c(m40920b(3840)));
        return arrayList;
    }

    /* renamed from: b */
    private static long m40920b(long j) {
        return (j * 1000000000) / 48000;
    }

    /* renamed from: c */
    private static byte[] m40921c(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
