package p244dd;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p226cd.C11179b;
import p226cd.C11185c0;
import p226cd.C11199o;
import p226cd.C11206t;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a0\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\bH\u0000\" \u0010\u0013\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo71668d2 = {"Lcd/t;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "b", "Lcd/b;", "", "newline", "", "c", "Lcd/o;", "options", "selectTruncated", "d", "HEX_DIGIT_BYTES", "[B", "a", "()[B", "getHEX_DIGIT_BYTES$annotations", "()V", "okio"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* renamed from: dd.a */
/* compiled from: -Buffer.kt */
public final class C12012a {

    /* renamed from: a */
    private static final byte[] f58215a = C11185c0.m75078a("0123456789abcdef");

    /* renamed from: a */
    public static final byte[] m82451a() {
        return f58215a;
    }

    /* renamed from: b */
    public static final boolean m82452b(C11206t tVar, int i, byte[] bArr, int i2, int i3) {
        C13706o.m87929f(tVar, "segment");
        C13706o.m87929f(bArr, "bytes");
        int i4 = tVar.f54144c;
        byte[] bArr2 = tVar.f54142a;
        while (i2 < i3) {
            if (i == i4) {
                tVar = tVar.f54147f;
                C13706o.m87926c(tVar);
                byte[] bArr3 = tVar.f54142a;
                int i5 = tVar.f54143b;
                bArr2 = bArr3;
                i = i5;
                i4 = tVar.f54144c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: c */
    public static final String m82453c(C11179b bVar, long j) {
        C13706o.m87929f(bVar, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (bVar.mo62435h(j2) == ((byte) 13)) {
                String A = bVar.mo62395A(j2);
                bVar.skip(2);
                return A;
            }
        }
        String A2 = bVar.mo62395A(j);
        bVar.skip(1);
        return A2;
    }

    /* renamed from: d */
    public static final int m82454d(C11179b bVar, C11199o oVar, boolean z) {
        int i;
        int i2;
        int i3;
        C11206t tVar;
        int i4;
        C11179b bVar2 = bVar;
        C13706o.m87929f(bVar2, "<this>");
        C13706o.m87929f(oVar, "options");
        C11206t tVar2 = bVar2.f54090a;
        if (tVar2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = tVar2.f54142a;
        int i5 = tVar2.f54143b;
        int i6 = tVar2.f54144c;
        int[] h = oVar.mo62536h();
        C11206t tVar3 = tVar2;
        int i7 = 0;
        int i8 = -1;
        loop0:
        while (true) {
            int i9 = i7 + 1;
            int i10 = h[i7];
            int i11 = i9 + 1;
            int i12 = h[i9];
            if (i12 != -1) {
                i8 = i12;
            }
            if (tVar3 == null) {
                break;
            }
            if (i10 < 0) {
                int i13 = i11 + (i10 * -1);
                while (true) {
                    int i14 = i5 + 1;
                    int i15 = i11 + 1;
                    if ((bArr[i5] & 255) != h[i11]) {
                        return i8;
                    }
                    boolean z2 = i15 == i13;
                    if (i14 == i6) {
                        C13706o.m87926c(tVar3);
                        C11206t tVar4 = tVar3.f54147f;
                        C13706o.m87926c(tVar4);
                        i4 = tVar4.f54143b;
                        byte[] bArr2 = tVar4.f54142a;
                        i3 = tVar4.f54144c;
                        if (tVar4 != tVar2) {
                            byte[] bArr3 = bArr2;
                            tVar = tVar4;
                            bArr = bArr3;
                        } else if (!z2) {
                            break loop0;
                        } else {
                            bArr = bArr2;
                            tVar = null;
                        }
                    } else {
                        C11206t tVar5 = tVar3;
                        i3 = i6;
                        i4 = i14;
                        tVar = tVar5;
                    }
                    if (z2) {
                        i2 = h[i15];
                        i = i4;
                        i6 = i3;
                        tVar3 = tVar;
                        break;
                    }
                    i5 = i4;
                    i6 = i3;
                    i11 = i15;
                    tVar3 = tVar;
                }
            } else {
                i = i5 + 1;
                byte b = bArr[i5] & 255;
                int i16 = i11 + i10;
                while (i11 != i16) {
                    if (b == h[i11]) {
                        i2 = h[i11 + i10];
                        if (i == i6) {
                            tVar3 = tVar3.f54147f;
                            C13706o.m87926c(tVar3);
                            i = tVar3.f54143b;
                            bArr = tVar3.f54142a;
                            i6 = tVar3.f54144c;
                            if (tVar3 == tVar2) {
                                tVar3 = null;
                            }
                        }
                    } else {
                        i11++;
                    }
                }
                return i8;
            }
            if (i2 >= 0) {
                return i2;
            }
            i7 = -i2;
            i5 = i;
        }
        if (z) {
            return -2;
        }
        return i8;
    }

    /* renamed from: e */
    public static /* synthetic */ int m82455e(C11179b bVar, C11199o oVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m82454d(bVar, oVar, z);
    }
}
