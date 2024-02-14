package p421w7;

import androidx.work.WorkRequest;
import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;
import com.sun.mail.util.MailLogger;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Level;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: w7.b */
/* compiled from: Ntlm */
public class C16777b {

    /* renamed from: l */
    private static final byte[] f67741l = {0, 0, 0, 0, 0, 0};

    /* renamed from: m */
    private static final byte[] f67742m = {0, 0, 0, 0};

    /* renamed from: n */
    private static char[] f67743n = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    private byte[] f67744a;

    /* renamed from: b */
    private byte[] f67745b;

    /* renamed from: c */
    private SecretKeyFactory f67746c;

    /* renamed from: d */
    private Cipher f67747d;

    /* renamed from: e */
    private C16776a f67748e;

    /* renamed from: f */
    private String f67749f;

    /* renamed from: g */
    private String f67750g;

    /* renamed from: h */
    private String f67751h;

    /* renamed from: i */
    private String f67752i;

    /* renamed from: j */
    private Mac f67753j;

    /* renamed from: k */
    private MailLogger f67754k;

    public C16777b(String str, String str2, String str3, String str4, MailLogger mailLogger) {
        int indexOf = str2.indexOf(46);
        str2 = indexOf != -1 ? str2.substring(0, indexOf) : str2;
        int indexOf2 = str3.indexOf(92);
        if (indexOf2 != -1) {
            str = str3.substring(0, indexOf2).toUpperCase(Locale.ENGLISH);
            str3 = str3.substring(indexOf2 + 1);
        } else if (str == null) {
            str = "";
        }
        this.f67750g = str;
        this.f67749f = str2;
        this.f67751h = str3;
        this.f67752i = str4;
        this.f67754k = mailLogger.getLogger(getClass(), "DEBUG NTLM");
        m99502i();
    }

    /* renamed from: a */
    private byte[] m99496a() throws GeneralSecurityException {
        byte[] bArr;
        byte[] bArr2 = {75, 71, 83, Framer.ENTER_FRAME_PREFIX, 64, 35, 36, 37};
        try {
            bArr = this.f67752i.toUpperCase(Locale.ENGLISH).getBytes("iso-8859-1");
        } catch (UnsupportedEncodingException unused) {
            bArr = null;
        }
        int i = 14;
        byte[] bArr3 = new byte[14];
        int length = this.f67752i.length();
        if (length <= 14) {
            i = length;
        }
        System.arraycopy(bArr, 0, bArr3, 0, i);
        DESKeySpec dESKeySpec = new DESKeySpec(m99503j(bArr3, 0));
        DESKeySpec dESKeySpec2 = new DESKeySpec(m99503j(bArr3, 7));
        SecretKey generateSecret = this.f67746c.generateSecret(dESKeySpec);
        SecretKey generateSecret2 = this.f67746c.generateSecret(dESKeySpec2);
        this.f67747d.init(1, generateSecret);
        byte[] doFinal = this.f67747d.doFinal(bArr2, 0, 8);
        this.f67747d.init(1, generateSecret2);
        byte[] doFinal2 = this.f67747d.doFinal(bArr2, 0, 8);
        byte[] bArr4 = new byte[21];
        System.arraycopy(doFinal, 0, bArr4, 0, 8);
        System.arraycopy(doFinal2, 0, bArr4, 8, 8);
        return bArr4;
    }

    /* renamed from: b */
    private byte[] m99497b() throws GeneralSecurityException {
        byte[] bArr;
        try {
            bArr = this.f67752i.getBytes("UnicodeLittleUnmarked");
        } catch (UnsupportedEncodingException unused) {
            bArr = null;
        }
        byte[] bArr2 = new byte[21];
        System.arraycopy(this.f67748e.mo79759d(bArr), 0, bArr2, 0, 16);
        return bArr2;
    }

    /* renamed from: c */
    private byte[] m99498c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        DESKeySpec dESKeySpec = new DESKeySpec(m99503j(bArr, 0));
        DESKeySpec dESKeySpec2 = new DESKeySpec(m99503j(bArr, 7));
        DESKeySpec dESKeySpec3 = new DESKeySpec(m99503j(bArr, 14));
        SecretKey generateSecret = this.f67746c.generateSecret(dESKeySpec);
        SecretKey generateSecret2 = this.f67746c.generateSecret(dESKeySpec2);
        SecretKey generateSecret3 = this.f67746c.generateSecret(dESKeySpec3);
        this.f67747d.init(1, generateSecret);
        byte[] doFinal = this.f67747d.doFinal(bArr2, 0, 8);
        this.f67747d.init(1, generateSecret2);
        byte[] doFinal2 = this.f67747d.doFinal(bArr2, 0, 8);
        this.f67747d.init(1, generateSecret3);
        byte[] doFinal3 = this.f67747d.doFinal(bArr2, 0, 8);
        byte[] bArr3 = new byte[24];
        System.arraycopy(doFinal, 0, bArr3, 0, 8);
        System.arraycopy(doFinal2, 0, bArr3, 8, 8);
        System.arraycopy(doFinal3, 0, bArr3, 16, 8);
        return bArr3;
    }

    /* renamed from: d */
    private byte[] m99499d(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        byte[] bArr4;
        try {
            bArr4 = (this.f67751h.toUpperCase(Locale.ENGLISH) + this.f67750g).getBytes("UnicodeLittleUnmarked");
        } catch (UnsupportedEncodingException unused) {
            bArr4 = null;
        }
        byte[] h = m99501h(bArr, bArr4);
        byte[] bArr5 = new byte[(bArr2.length + 8)];
        System.arraycopy(bArr3, 0, bArr5, 0, 8);
        System.arraycopy(bArr2, 0, bArr5, 8, bArr2.length);
        byte[] bArr6 = new byte[(bArr2.length + 16)];
        System.arraycopy(m99501h(h, bArr5), 0, bArr6, 0, 16);
        System.arraycopy(bArr2, 0, bArr6, 16, bArr2.length);
        return bArr6;
    }

    /* renamed from: e */
    private void m99500e(byte[] bArr, int i, String str, String str2) {
        try {
            byte[] bytes = str.getBytes(str2);
            System.arraycopy(bytes, 0, bArr, i, bytes.length);
        } catch (UnsupportedEncodingException unused) {
        }
    }

    /* renamed from: h */
    private byte[] m99501h(byte[] bArr, byte[] bArr2) {
        try {
            if (this.f67753j == null) {
                this.f67753j = Mac.getInstance("HmacMD5");
            }
            int i = 16;
            try {
                byte[] bArr3 = new byte[16];
                if (bArr.length <= 16) {
                    i = bArr.length;
                }
                System.arraycopy(bArr, 0, bArr3, 0, i);
                this.f67753j.init(new SecretKeySpec(bArr3, "HmacMD5"));
                return this.f67753j.doFinal(bArr2);
            } catch (RuntimeException | InvalidKeyException unused) {
                return null;
            }
        } catch (NoSuchAlgorithmException unused2) {
            throw new AssertionError();
        }
    }

    /* renamed from: i */
    private void m99502i() {
        byte[] bArr = new byte[256];
        this.f67744a = bArr;
        this.f67745b = new byte[512];
        System.arraycopy(new byte[]{78, 84, 76, 77, 83, 83, 80, 0, 1}, 0, bArr, 0, 9);
        System.arraycopy(new byte[]{78, 84, 76, 77, 83, 83, 80, 0, 3}, 0, this.f67745b, 0, 9);
        try {
            this.f67746c = SecretKeyFactory.getInstance("DES");
            this.f67747d = Cipher.getInstance("DES/ECB/NoPadding");
            this.f67748e = new C16776a();
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
    }

    /* renamed from: j */
    private byte[] m99503j(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] < 0 ? bArr[i2] + 256 : bArr[i2];
        }
        int i3 = i + 0;
        int i4 = i + 1;
        int i5 = i + 2;
        int i6 = i + 3;
        int i7 = i + 4;
        int i8 = i + 5;
        int i9 = i + 6;
        return new byte[]{(byte) iArr[i3], (byte) (((iArr[i3] << 7) & 255) | (iArr[i4] >> 1)), (byte) (((iArr[i4] << 6) & 255) | (iArr[i5] >> 2)), (byte) (((iArr[i5] << 5) & 255) | (iArr[i6] >> 3)), (byte) (((iArr[i6] << 4) & 255) | (iArr[i7] >> 4)), (byte) (((iArr[i7] << 3) & 255) | (iArr[i8] >> 5)), (byte) (((iArr[i8] << 2) & 255) | (iArr[i9] >> 6)), (byte) ((iArr[i9] << 1) & 255)};
    }

    /* renamed from: k */
    private static int m99504k(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: l */
    private static int m99505l(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: m */
    private static String m99506m(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 3);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(f67743n[(bArr[i] >> 4) & 15]);
            sb.append(f67743n[bArr[i] & 15]);
            sb.append(' ');
        }
        return sb.toString();
    }

    /* renamed from: n */
    private void m99507n(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    /* renamed from: o */
    private void m99508o(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
    }

    /* renamed from: f */
    public String mo79760f(int i, boolean z) {
        int length = this.f67750g.length();
        int i2 = i | 41475;
        if (length != 0) {
            i2 |= 4096;
        }
        if (z) {
            i2 |= 524288;
        }
        m99507n(this.f67744a, 12, i2);
        byte[] bArr = this.f67744a;
        bArr[28] = 32;
        m99508o(bArr, 16, length);
        m99508o(this.f67744a, 18, length);
        int length2 = this.f67749f.length();
        m99508o(this.f67744a, 24, length2);
        m99508o(this.f67744a, 26, length2);
        m99500e(this.f67744a, 32, this.f67749f, "iso-8859-1");
        int i3 = length2 + 32;
        m99500e(this.f67744a, i3, this.f67750g, "iso-8859-1");
        m99507n(this.f67744a, 20, i3);
        int i4 = i3 + length;
        byte[] bArr2 = new byte[i4];
        System.arraycopy(this.f67744a, 0, bArr2, 0, i4);
        if (this.f67754k.isLoggable(Level.FINE)) {
            MailLogger mailLogger = this.f67754k;
            mailLogger.fine("type 1 message: " + m99506m(bArr2));
        }
        try {
            return new String(BASE64EncoderStream.encode(bArr2), "iso-8859-1");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public String mo79761g(String str) {
        byte[] bArr;
        int i;
        byte[] bArr2;
        byte[] bArr3;
        try {
            bArr = BASE64DecoderStream.decode(str.getBytes("us-ascii"));
        } catch (UnsupportedEncodingException unused) {
            bArr = null;
        }
        try {
            if (this.f67754k.isLoggable(Level.FINE)) {
                MailLogger mailLogger = this.f67754k;
                mailLogger.fine("type 2 message: " + m99506m(bArr));
            }
            byte[] bArr4 = new byte[8];
            System.arraycopy(bArr, 24, bArr4, 0, 8);
            int length = this.f67751h.length() * 2;
            m99508o(this.f67745b, 36, length);
            m99508o(this.f67745b, 38, length);
            int length2 = this.f67750g.length() * 2;
            m99508o(this.f67745b, 28, length2);
            m99508o(this.f67745b, 30, length2);
            int length3 = this.f67749f.length() * 2;
            m99508o(this.f67745b, 44, length3);
            m99508o(this.f67745b, 46, length3);
            m99500e(this.f67745b, 64, this.f67750g, "UnicodeLittleUnmarked");
            m99507n(this.f67745b, 32, 64);
            int i2 = length2 + 64;
            m99500e(this.f67745b, i2, this.f67751h, "UnicodeLittleUnmarked");
            m99507n(this.f67745b, 40, i2);
            int i3 = i2 + length;
            m99500e(this.f67745b, i3, this.f67749f, "UnicodeLittleUnmarked");
            m99507n(this.f67745b, 48, i3);
            int i4 = i3 + length3;
            int k = m99504k(bArr, 20);
            if ((524288 & k) != 0) {
                this.f67754k.fine("Using NTLMv2");
                byte[] bArr5 = new byte[8];
                new Random().nextBytes(bArr5);
                byte[] b = m99497b();
                byte[] d = m99499d(b, bArr5, bArr4);
                byte[] bArr6 = new byte[0];
                if ((k & 8388608) != 0) {
                    int l = m99505l(bArr, 40);
                    bArr6 = new byte[l];
                    System.arraycopy(bArr, m99504k(bArr, 44), bArr6, 0, l);
                }
                byte[] bArr7 = new byte[(bArr6.length + 32)];
                bArr7[0] = 1;
                bArr7[1] = 1;
                System.arraycopy(f67741l, 0, bArr7, 2, 6);
                long currentTimeMillis = (System.currentTimeMillis() + 11644473600000L) * WorkRequest.MIN_BACKOFF_MILLIS;
                for (int i5 = 0; i5 < 8; i5++) {
                    bArr7[i5 + 8] = (byte) ((int) (currentTimeMillis & 255));
                    currentTimeMillis >>= 8;
                }
                System.arraycopy(bArr5, 0, bArr7, 16, 8);
                byte[] bArr8 = f67742m;
                System.arraycopy(bArr8, 0, bArr7, 24, 4);
                System.arraycopy(bArr6, 0, bArr7, 28, bArr6.length);
                System.arraycopy(bArr8, 0, bArr7, bArr6.length + 28, 4);
                bArr3 = m99499d(b, bArr7, bArr4);
                bArr2 = d;
                i = 557569;
            } else {
                byte[] c = m99498c(m99496a(), bArr4);
                bArr3 = m99498c(m99497b(), bArr4);
                bArr2 = c;
                i = 33281;
            }
            System.arraycopy(bArr2, 0, this.f67745b, i4, bArr2.length);
            m99508o(this.f67745b, 12, bArr2.length);
            m99508o(this.f67745b, 14, bArr2.length);
            m99507n(this.f67745b, 16, i4);
            int i6 = i4 + 24;
            System.arraycopy(bArr3, 0, this.f67745b, i6, bArr3.length);
            m99508o(this.f67745b, 20, bArr3.length);
            m99508o(this.f67745b, 22, bArr3.length);
            m99507n(this.f67745b, 24, i6);
            int length4 = i6 + bArr3.length;
            m99508o(this.f67745b, 56, length4);
            byte[] bArr9 = new byte[length4];
            System.arraycopy(this.f67745b, 0, bArr9, 0, length4);
            m99507n(this.f67745b, 60, i);
            if (this.f67754k.isLoggable(Level.FINE)) {
                MailLogger mailLogger2 = this.f67754k;
                mailLogger2.fine("type 3 message: " + m99506m(bArr9));
            }
            try {
                return new String(BASE64EncoderStream.encode(bArr9), "iso-8859-1");
            } catch (UnsupportedEncodingException unused2) {
                return null;
            }
        } catch (GeneralSecurityException e) {
            this.f67754k.log(Level.FINE, "GeneralSecurityException", (Throwable) e);
            return "";
        }
    }
}
