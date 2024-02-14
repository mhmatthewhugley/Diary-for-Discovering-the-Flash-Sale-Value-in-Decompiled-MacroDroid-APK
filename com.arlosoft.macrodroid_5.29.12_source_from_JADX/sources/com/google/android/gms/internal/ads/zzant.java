package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzant {

    /* renamed from: a */
    static boolean f24985a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static MessageDigest f24986b;

    /* renamed from: c */
    private static final Object f24987c = new Object();

    /* renamed from: d */
    private static final Object f24988d = new Object();

    /* renamed from: e */
    static final CountDownLatch f24989e = new CountDownLatch(1);

    /* renamed from: a */
    static String m41984a(zzana zzana, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArr;
        byte[] p = zzana.mo47050p();
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27284w2)).booleanValue()) {
            Vector b = m41985b(p, 255);
            if (b == null || b.size() == 0) {
                bArr = m41990g(m41989f(4096).mo47050p(), str, true);
            } else {
                zzanm F = zzann.m41973F();
                int size = b.size();
                for (int i = 0; i < size; i++) {
                    F.mo41753n(zzgpw.m52564R(m41990g((byte[]) b.get(i), str, false)));
                }
                F.mo41754o(zzgpw.m52564R(m41988e(p)));
                bArr = ((zzann) F.mo47341h()).mo47050p();
            }
        } else if (zzaqf.f25307a != null) {
            byte[] a = zzaqf.f25307a.mo46661a(p, str != null ? str.getBytes() : new byte[0]);
            zzanm F2 = zzann.m41973F();
            F2.mo41753n(zzgpw.m52564R(a));
            F2.mo41755u(3);
            bArr = ((zzann) F2.mo47341h()).mo47050p();
        } else {
            throw new GeneralSecurityException();
        }
        return zzanp.m41981a(bArr, true);
    }

    /* renamed from: b */
    static Vector m41985b(byte[] bArr, int i) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i2 = (length + 254) / 255;
        Vector vector = new Vector();
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
                i3++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* renamed from: d */
    static void m41987d() {
        synchronized (f24988d) {
            if (!f24985a) {
                f24985a = true;
                new Thread(new zzans((zzanr) null)).start();
            }
        }
    }

    /* renamed from: e */
    public static byte[] m41988e(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        synchronized (f24987c) {
            m41987d();
            MessageDigest messageDigest = null;
            try {
                if (f24989e.await(2, TimeUnit.SECONDS)) {
                    MessageDigest messageDigest2 = f24986b;
                    if (messageDigest2 != null) {
                        messageDigest = messageDigest2;
                    }
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest != null) {
                messageDigest.reset();
                messageDigest.update(bArr);
                digest = f24986b.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }

    /* renamed from: f */
    static zzana m41989f(int i) {
        zzamk f0 = zzana.m41917f0();
        f0.mo41703v(4096);
        return (zzana) f0.mo47341h();
    }

    /* renamed from: g */
    private static byte[] m41990g(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArr2;
        int i = true != z ? 255 : 239;
        if (bArr.length > i) {
            bArr = m41989f(4096).mo47050p();
        }
        int length = bArr.length;
        if (length < i) {
            byte[] bArr3 = new byte[(i - length)];
            new SecureRandom().nextBytes(bArr3);
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).put(bArr3).array();
        } else {
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).array();
        }
        if (z) {
            bArr2 = ByteBuffer.allocate(256).put(m41988e(bArr2)).put(bArr2).array();
        }
        byte[] bArr4 = new byte[256];
        zzanu[] zzanuArr = new zzaot().f25029G2;
        int length2 = zzanuArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            zzanuArr[i2].mo41759a(bArr2, bArr4);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzgpd(str.getBytes("UTF-8")).mo47042a(bArr4);
        }
        return bArr4;
    }
}
