package com.google.firebase.crashlytics.internal.common;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

class CLSUUID {

    /* renamed from: a */
    private static final AtomicLong f4881a = new AtomicLong(0);

    /* renamed from: b */
    private static String f4882b;

    CLSUUID(IdManager idManager) {
        byte[] bArr = new byte[10];
        m6575e(bArr);
        m6574d(bArr);
        m6573c(bArr);
        String A = CommonUtils.m6576A(idManager.mo23049a());
        String v = CommonUtils.m6599v(bArr);
        Locale locale = Locale.US;
        f4882b = String.format(locale, "%s%s%s%s", new Object[]{v.substring(0, 12), v.substring(12, 16), v.subSequence(16, 20), A.substring(0, 12)}).toUpperCase(locale);
    }

    /* renamed from: a */
    private static byte[] m6571a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    private static byte[] m6572b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    private void m6573c(byte[] bArr) {
        byte[] b = m6572b((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b[0];
        bArr[9] = b[1];
    }

    /* renamed from: d */
    private void m6574d(byte[] bArr) {
        byte[] b = m6572b(f4881a.incrementAndGet());
        bArr[6] = b[0];
        bArr[7] = b[1];
    }

    /* renamed from: e */
    private void m6575e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a = m6571a(time / 1000);
        bArr[0] = a[0];
        bArr[1] = a[1];
        bArr[2] = a[2];
        bArr[3] = a[3];
        byte[] b = m6572b(time % 1000);
        bArr[4] = b[0];
        bArr[5] = b[1];
    }

    public String toString() {
        return f4882b;
    }
}
