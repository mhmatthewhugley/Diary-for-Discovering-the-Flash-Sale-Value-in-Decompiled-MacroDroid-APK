package p426wc;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p226cd.C11188e;
import p372qc.C16279b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¨\u0006\u0010"}, mo71668d2 = {"Lwc/d;", "", "", "inbound", "", "streamId", "length", "type", "flags", "", "c", "b", "(I)Ljava/lang/String;", "a", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: wc.d */
/* compiled from: Http2.kt */
public final class C16801d {

    /* renamed from: a */
    public static final C11188e f67830a = C11188e.f54104d.mo62513c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    private static final String[] f67831b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    private static final String[] f67832c = new String[64];

    /* renamed from: d */
    private static final String[] f67833d;

    /* renamed from: e */
    public static final C16801d f67834e = new C16801d();

    static {
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            C13706o.m87928e(binaryString, "Integer.toBinaryString(it)");
            strArr[i] = C15176v.m93629D(C16279b.m97663q("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        f67833d = strArr;
        String[] strArr2 = f67832c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i2 = 0; i2 < 1; i2++) {
            int i3 = iArr[i2];
            String[] strArr3 = f67832c;
            strArr3[i3 | 8] = C13706o.m87936m(strArr3[i3], "|PADDED");
        }
        String[] strArr4 = f67832c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 < 1; i6++) {
                int i7 = iArr[i6];
                String[] strArr5 = f67832c;
                int i8 = i7 | i5;
                strArr5[i8] = strArr5[i7] + "|" + strArr5[i5];
                strArr5[i8 | 8] = strArr5[i7] + "|" + strArr5[i5] + "|PADDED";
            }
        }
        int length = f67832c.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr6 = f67832c;
            if (strArr6[i9] == null) {
                strArr6[i9] = f67833d[i9];
            }
        }
    }

    private C16801d() {
    }

    /* renamed from: a */
    public final String mo79809a(int i, int i2) {
        String str;
        if (i2 == 0) {
            return "";
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4 || i == 6) {
                if (i2 == 1) {
                    return "ACK";
                }
                return f67833d[i2];
            } else if (!(i == 7 || i == 8)) {
                String[] strArr = f67832c;
                if (i2 < strArr.length) {
                    str = strArr[i2];
                    C13706o.m87926c(str);
                } else {
                    str = f67833d[i2];
                }
                String str2 = str;
                if (i != 5 || (i2 & 4) == 0) {
                    return (i != 0 || (i2 & 32) == 0) ? str2 : C15176v.m93630E(str2, "PRIORITY", "COMPRESSED", false, 4, (Object) null);
                }
                return C15176v.m93630E(str2, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
            }
        }
        return f67833d[i2];
    }

    /* renamed from: b */
    public final String mo79810b(int i) {
        String[] strArr = f67831b;
        if (i < strArr.length) {
            return strArr[i];
        }
        return C16279b.m97663q("0x%02x", Integer.valueOf(i));
    }

    /* renamed from: c */
    public final String mo79811c(boolean z, int i, int i2, int i3, int i4) {
        return C16279b.m97663q("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), mo79810b(i3), mo79809a(i3, i4));
    }
}
