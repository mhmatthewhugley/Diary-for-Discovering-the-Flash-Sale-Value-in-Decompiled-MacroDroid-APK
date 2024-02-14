package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.mail.UIDFolder;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzajk {
    /* renamed from: a */
    public static long m41598a(ByteBuffer byteBuffer) {
        m41604g(byteBuffer);
        return m41602e(byteBuffer, byteBuffer.position() + 16);
    }

    /* renamed from: b */
    public static long m41599b(ByteBuffer byteBuffer) {
        m41604g(byteBuffer);
        return m41602e(byteBuffer, byteBuffer.position() + 12);
    }

    /* renamed from: c */
    static Pair m41600c(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair f = m41603f(randomAccessFile, 0);
        if (f != null) {
            return f;
        }
        return m41603f(randomAccessFile, 65535);
    }

    /* renamed from: d */
    public static void m41601d(ByteBuffer byteBuffer, long j) {
        m41604g(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j < 0 || j > UIDFolder.MAXUID) {
            throw new IllegalArgumentException("uint32 value of out range: " + j);
        }
        byteBuffer.putInt(byteBuffer.position() + position, (int) j);
    }

    /* renamed from: e */
    private static long m41602e(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & UIDFolder.MAXUID;
    }

    /* renamed from: f */
    private static Pair m41603f(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i2;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min((long) i, -22 + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - ((long) allocate.capacity());
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        m41604g(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i3 = capacity2 - 22;
            int min = Math.min(i3, 65535);
            int i4 = 0;
            while (true) {
                if (i4 >= min) {
                    break;
                }
                i2 = i3 - i4;
                if (allocate.getInt(i2) == 101010256 && ((char) allocate.getShort(i2 + 20)) == i4) {
                    break;
                }
                i4++;
            }
        }
        i2 = -1;
        if (i2 == -1) {
            return null;
        }
        allocate.position(i2);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + ((long) i2)));
    }

    /* renamed from: g */
    private static void m41604g(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
