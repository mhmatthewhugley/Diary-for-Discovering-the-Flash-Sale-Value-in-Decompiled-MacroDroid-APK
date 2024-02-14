package p226cd;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p226cd.C11179b;
import p244dd.C12013b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000:\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0000\u001a\f\u0010\t\u001a\u00020\b*\u00020\bH\u0000\u001a0\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0000\u001a\f\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0000\u001a\f\u0010\u0012\u001a\u00020\u0010*\u00020\bH\u0000\u001a\u0014\u0010\u0015\u001a\u00020\b*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0000¨\u0006\u0016"}, mo71668d2 = {"", "size", "offset", "byteCount", "Lja/u;", "b", "", "e", "", "d", "", "a", "aOffset", "bOffset", "", "", "", "f", "g", "Lcd/e;", "position", "c", "okio"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* renamed from: cd.d0 */
/* compiled from: -Util.kt */
public final class C11187d0 {

    /* renamed from: a */
    private static final C11179b.C11180a f54102a = new C11179b.C11180a();

    /* renamed from: b */
    private static final int f54103b = -1234567890;

    /* renamed from: a */
    public static final boolean m75096a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        C13706o.m87929f(bArr, "a");
        C13706o.m87929f(bArr2, "b");
        if (i3 <= 0) {
            return true;
        }
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
            if (i5 >= i3) {
                return true;
            }
            i4 = i5;
        }
    }

    /* renamed from: b */
    public static final void m75097b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* renamed from: c */
    public static final int m75098c(C11188e eVar, int i) {
        C13706o.m87929f(eVar, "<this>");
        return i == f54103b ? eVar.mo62485C() : i;
    }

    /* renamed from: d */
    public static final int m75099d(int i) {
        return ((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: e */
    public static final short m75100e(short s) {
        short s2 = s & 65535;
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    /* renamed from: f */
    public static final String m75101f(byte b) {
        return C15176v.m93637r(new char[]{C12013b.m82461f()[(b >> 4) & 15], C12013b.m82461f()[b & 15]});
    }

    /* renamed from: g */
    public static final String m75102g(int i) {
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {C12013b.m82461f()[(i >> 28) & 15], C12013b.m82461f()[(i >> 24) & 15], C12013b.m82461f()[(i >> 20) & 15], C12013b.m82461f()[(i >> 16) & 15], C12013b.m82461f()[(i >> 12) & 15], C12013b.m82461f()[(i >> 8) & 15], C12013b.m82461f()[(i >> 4) & 15], C12013b.m82461f()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return C15176v.m93638s(cArr, i2, 8);
    }
}
