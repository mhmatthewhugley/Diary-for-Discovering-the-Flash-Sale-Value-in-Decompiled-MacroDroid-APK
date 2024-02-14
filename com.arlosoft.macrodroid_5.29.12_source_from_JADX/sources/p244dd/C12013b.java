package p244dd;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p226cd.C11179b;
import p226cd.C11188e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0007\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002\u001a\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003H\u0002\" \u0010\u000f\u001a\u00020\u000e8\u0000X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, mo71668d2 = {"Lcd/e;", "Lcd/b;", "buffer", "", "offset", "byteCount", "Lja/u;", "d", "", "c", "e", "", "s", "codePointCount", "", "HEX_DIGIT_CHARS", "[C", "f", "()[C", "getHEX_DIGIT_CHARS$annotations", "()V", "okio"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* renamed from: dd.b */
/* compiled from: -ByteString.kt */
public final class C12013b {

    /* renamed from: a */
    private static final char[] f58216a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0044 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0160 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x007c A[EDGE_INSN: B:264:0x007c->B:51:0x007c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x00d3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0205 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m82458c(byte[] r19, int r20) {
        /*
            r0 = r19
            r1 = r20
            int r2 = r0.length
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0008:
            if (r4 >= r2) goto L_0x0218
            byte r7 = r0[r4]
            r8 = 159(0x9f, float:2.23E-43)
            r9 = 127(0x7f, float:1.78E-43)
            r10 = 31
            r11 = 13
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 10
            r14 = 65536(0x10000, float:9.18355E-41)
            r16 = -1
            r17 = 1
            if (r7 < 0) goto L_0x0085
            int r18 = r6 + 1
            if (r6 != r1) goto L_0x0026
            return r5
        L_0x0026:
            if (r7 == r13) goto L_0x0042
            if (r7 == r11) goto L_0x0042
            if (r7 < 0) goto L_0x0030
            if (r7 > r10) goto L_0x0030
            r6 = 1
            goto L_0x0031
        L_0x0030:
            r6 = 0
        L_0x0031:
            if (r6 != 0) goto L_0x003f
            if (r9 > r7) goto L_0x0039
            if (r7 > r8) goto L_0x0039
            r6 = 1
            goto L_0x003a
        L_0x0039:
            r6 = 0
        L_0x003a:
            if (r6 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r6 = 0
            goto L_0x0040
        L_0x003f:
            r6 = 1
        L_0x0040:
            if (r6 != 0) goto L_0x0044
        L_0x0042:
            if (r7 != r12) goto L_0x0045
        L_0x0044:
            return r16
        L_0x0045:
            if (r7 >= r14) goto L_0x0049
            r6 = 1
            goto L_0x004a
        L_0x0049:
            r6 = 2
        L_0x004a:
            int r5 = r5 + r6
            int r4 = r4 + 1
        L_0x004d:
            r6 = r18
            if (r4 >= r2) goto L_0x0008
            byte r7 = r0[r4]
            if (r7 < 0) goto L_0x0008
            int r7 = r4 + 1
            byte r4 = r0[r4]
            int r18 = r6 + 1
            if (r6 != r1) goto L_0x005e
            return r5
        L_0x005e:
            if (r4 == r13) goto L_0x007a
            if (r4 == r11) goto L_0x007a
            if (r4 < 0) goto L_0x0068
            if (r4 > r10) goto L_0x0068
            r6 = 1
            goto L_0x0069
        L_0x0068:
            r6 = 0
        L_0x0069:
            if (r6 != 0) goto L_0x0077
            if (r9 > r4) goto L_0x0071
            if (r4 > r8) goto L_0x0071
            r6 = 1
            goto L_0x0072
        L_0x0071:
            r6 = 0
        L_0x0072:
            if (r6 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r6 = 0
            goto L_0x0078
        L_0x0077:
            r6 = 1
        L_0x0078:
            if (r6 != 0) goto L_0x007c
        L_0x007a:
            if (r4 != r12) goto L_0x007d
        L_0x007c:
            return r16
        L_0x007d:
            if (r4 >= r14) goto L_0x0081
            r4 = 1
            goto L_0x0082
        L_0x0081:
            r4 = 2
        L_0x0082:
            int r5 = r5 + r4
            r4 = r7
            goto L_0x004d
        L_0x0085:
            int r3 = r7 >> 5
            r15 = -2
            r14 = 128(0x80, float:1.794E-43)
            if (r3 != r15) goto L_0x00e3
            int r3 = r4 + 1
            if (r2 > r3) goto L_0x0094
            if (r6 != r1) goto L_0x0093
            return r5
        L_0x0093:
            return r16
        L_0x0094:
            byte r7 = r0[r4]
            byte r3 = r0[r3]
            r15 = r3 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x009e
            r15 = 1
            goto L_0x009f
        L_0x009e:
            r15 = 0
        L_0x009f:
            if (r15 != 0) goto L_0x00a5
            if (r6 != r1) goto L_0x00a4
            return r5
        L_0x00a4:
            return r16
        L_0x00a5:
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r7 = r7 << 6
            r3 = r3 ^ r7
            if (r3 >= r14) goto L_0x00b0
            if (r6 != r1) goto L_0x00af
            return r5
        L_0x00af:
            return r16
        L_0x00b0:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x00b5
            return r5
        L_0x00b5:
            if (r3 == r13) goto L_0x00d1
            if (r3 == r11) goto L_0x00d1
            if (r3 < 0) goto L_0x00bf
            if (r3 > r10) goto L_0x00bf
            r6 = 1
            goto L_0x00c0
        L_0x00bf:
            r6 = 0
        L_0x00c0:
            if (r6 != 0) goto L_0x00ce
            if (r9 > r3) goto L_0x00c8
            if (r3 > r8) goto L_0x00c8
            r6 = 1
            goto L_0x00c9
        L_0x00c8:
            r6 = 0
        L_0x00c9:
            if (r6 == 0) goto L_0x00cc
            goto L_0x00ce
        L_0x00cc:
            r6 = 0
            goto L_0x00cf
        L_0x00ce:
            r6 = 1
        L_0x00cf:
            if (r6 != 0) goto L_0x00d3
        L_0x00d1:
            if (r3 != r12) goto L_0x00d4
        L_0x00d3:
            return r16
        L_0x00d4:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x00da
            r15 = 1
            goto L_0x00db
        L_0x00da:
            r15 = 2
        L_0x00db:
            int r5 = r5 + r15
            ja.u r3 = p297ja.C13339u.f61331a
            int r4 = r4 + 2
        L_0x00e0:
            r6 = r7
            goto L_0x0008
        L_0x00e3:
            int r3 = r7 >> 4
            r12 = 57343(0xdfff, float:8.0355E-41)
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r3 != r15) goto L_0x016f
            int r3 = r4 + 2
            if (r2 > r3) goto L_0x00f5
            if (r6 != r1) goto L_0x00f4
            return r5
        L_0x00f4:
            return r16
        L_0x00f5:
            byte r7 = r0[r4]
            int r15 = r4 + 1
            byte r15 = r0[r15]
            r9 = r15 & 192(0xc0, float:2.69E-43)
            if (r9 != r14) goto L_0x0101
            r9 = 1
            goto L_0x0102
        L_0x0101:
            r9 = 0
        L_0x0102:
            if (r9 != 0) goto L_0x0108
            if (r6 != r1) goto L_0x0107
            return r5
        L_0x0107:
            return r16
        L_0x0108:
            byte r3 = r0[r3]
            r9 = r3 & 192(0xc0, float:2.69E-43)
            if (r9 != r14) goto L_0x0110
            r9 = 1
            goto L_0x0111
        L_0x0110:
            r9 = 0
        L_0x0111:
            if (r9 != 0) goto L_0x0117
            if (r6 != r1) goto L_0x0116
            return r5
        L_0x0116:
            return r16
        L_0x0117:
            r9 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r9
            int r9 = r15 << 6
            r3 = r3 ^ r9
            int r7 = r7 << 12
            r3 = r3 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r3 >= r7) goto L_0x0129
            if (r6 != r1) goto L_0x0128
            return r5
        L_0x0128:
            return r16
        L_0x0129:
            if (r8 > r3) goto L_0x012f
            if (r3 > r12) goto L_0x012f
            r7 = 1
            goto L_0x0130
        L_0x012f:
            r7 = 0
        L_0x0130:
            if (r7 == 0) goto L_0x0136
            if (r6 != r1) goto L_0x0135
            return r5
        L_0x0135:
            return r16
        L_0x0136:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x013b
            return r5
        L_0x013b:
            if (r3 == r13) goto L_0x015b
            if (r3 == r11) goto L_0x015b
            if (r3 < 0) goto L_0x0145
            if (r3 > r10) goto L_0x0145
            r6 = 1
            goto L_0x0146
        L_0x0145:
            r6 = 0
        L_0x0146:
            if (r6 != 0) goto L_0x0158
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 > r3) goto L_0x0152
            r6 = 159(0x9f, float:2.23E-43)
            if (r3 > r6) goto L_0x0152
            r6 = 1
            goto L_0x0153
        L_0x0152:
            r6 = 0
        L_0x0153:
            if (r6 == 0) goto L_0x0156
            goto L_0x0158
        L_0x0156:
            r6 = 0
            goto L_0x0159
        L_0x0158:
            r6 = 1
        L_0x0159:
            if (r6 != 0) goto L_0x0160
        L_0x015b:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x0161
        L_0x0160:
            return r16
        L_0x0161:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x0167
            r15 = 1
            goto L_0x0168
        L_0x0167:
            r15 = 2
        L_0x0168:
            int r5 = r5 + r15
            ja.u r3 = p297ja.C13339u.f61331a
            int r4 = r4 + 3
            goto L_0x00e0
        L_0x016f:
            int r3 = r7 >> 3
            if (r3 != r15) goto L_0x0214
            int r3 = r4 + 3
            if (r2 > r3) goto L_0x017b
            if (r6 != r1) goto L_0x017a
            return r5
        L_0x017a:
            return r16
        L_0x017b:
            byte r7 = r0[r4]
            int r9 = r4 + 1
            byte r9 = r0[r9]
            r15 = r9 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x0187
            r15 = 1
            goto L_0x0188
        L_0x0187:
            r15 = 0
        L_0x0188:
            if (r15 != 0) goto L_0x018e
            if (r6 != r1) goto L_0x018d
            return r5
        L_0x018d:
            return r16
        L_0x018e:
            int r15 = r4 + 2
            byte r15 = r0[r15]
            r10 = r15 & 192(0xc0, float:2.69E-43)
            if (r10 != r14) goto L_0x0198
            r10 = 1
            goto L_0x0199
        L_0x0198:
            r10 = 0
        L_0x0199:
            if (r10 != 0) goto L_0x019f
            if (r6 != r1) goto L_0x019e
            return r5
        L_0x019e:
            return r16
        L_0x019f:
            byte r3 = r0[r3]
            r10 = r3 & 192(0xc0, float:2.69E-43)
            if (r10 != r14) goto L_0x01a7
            r10 = 1
            goto L_0x01a8
        L_0x01a7:
            r10 = 0
        L_0x01a8:
            if (r10 != 0) goto L_0x01ae
            if (r6 != r1) goto L_0x01ad
            return r5
        L_0x01ad:
            return r16
        L_0x01ae:
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r10
            int r10 = r15 << 6
            r3 = r3 ^ r10
            int r9 = r9 << 12
            r3 = r3 ^ r9
            int r7 = r7 << 18
            r3 = r3 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r7) goto L_0x01c4
            if (r6 != r1) goto L_0x01c3
            return r5
        L_0x01c3:
            return r16
        L_0x01c4:
            if (r8 > r3) goto L_0x01ca
            if (r3 > r12) goto L_0x01ca
            r7 = 1
            goto L_0x01cb
        L_0x01ca:
            r7 = 0
        L_0x01cb:
            if (r7 == 0) goto L_0x01d1
            if (r6 != r1) goto L_0x01d0
            return r5
        L_0x01d0:
            return r16
        L_0x01d1:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r7) goto L_0x01d9
            if (r6 != r1) goto L_0x01d8
            return r5
        L_0x01d8:
            return r16
        L_0x01d9:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x01de
            return r5
        L_0x01de:
            if (r3 == r13) goto L_0x0200
            if (r3 == r11) goto L_0x0200
            if (r3 < 0) goto L_0x01ea
            r6 = 31
            if (r3 > r6) goto L_0x01ea
            r6 = 1
            goto L_0x01eb
        L_0x01ea:
            r6 = 0
        L_0x01eb:
            if (r6 != 0) goto L_0x01fd
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 > r3) goto L_0x01f7
            r6 = 159(0x9f, float:2.23E-43)
            if (r3 > r6) goto L_0x01f7
            r6 = 1
            goto L_0x01f8
        L_0x01f7:
            r6 = 0
        L_0x01f8:
            if (r6 == 0) goto L_0x01fb
            goto L_0x01fd
        L_0x01fb:
            r6 = 0
            goto L_0x01fe
        L_0x01fd:
            r6 = 1
        L_0x01fe:
            if (r6 != 0) goto L_0x0205
        L_0x0200:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x0206
        L_0x0205:
            return r16
        L_0x0206:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x020c
            r15 = 1
            goto L_0x020d
        L_0x020c:
            r15 = 2
        L_0x020d:
            int r5 = r5 + r15
            ja.u r3 = p297ja.C13339u.f61331a
            int r4 = r4 + 4
            goto L_0x00e0
        L_0x0214:
            if (r6 != r1) goto L_0x0217
            return r5
        L_0x0217:
            return r16
        L_0x0218:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p244dd.C12013b.m82458c(byte[], int):int");
    }

    /* renamed from: d */
    public static final void m82459d(C11188e eVar, C11179b bVar, int i, int i2) {
        C13706o.m87929f(eVar, "<this>");
        C13706o.m87929f(bVar, "buffer");
        bVar.write(eVar.mo62498i(), i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final int m82460e(char c) {
        boolean z = true;
        if ('0' <= c && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (!('a' <= c && c <= 'f')) {
            c2 = 'A';
            if ('A' > c || c > 'F') {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(C13706o.m87936m("Unexpected hex digit: ", Character.valueOf(c)));
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: f */
    public static final char[] m82461f() {
        return f58216a;
    }
}
