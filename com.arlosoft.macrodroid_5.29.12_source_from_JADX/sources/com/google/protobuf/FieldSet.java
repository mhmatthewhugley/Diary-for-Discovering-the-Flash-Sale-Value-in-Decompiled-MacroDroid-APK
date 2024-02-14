package com.google.protobuf;

import com.google.protobuf.FieldSet.FieldDescriptorLite;
import com.google.protobuf.Internal;
import com.google.protobuf.LazyField;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class FieldSet<T extends FieldDescriptorLite<T>> {

    /* renamed from: d */
    private static final FieldSet f56833d = new FieldSet(true);

    /* renamed from: a */
    private final SmallSortedMap<T, Object> f56834a;

    /* renamed from: b */
    private boolean f56835b;

    /* renamed from: c */
    private boolean f56836c;

    /* renamed from: com.google.protobuf.FieldSet$1 */
    static /* synthetic */ class C115861 {

        /* renamed from: a */
        static final /* synthetic */ int[] f56837a;

        /* renamed from: b */
        static final /* synthetic */ int[] f56838b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56838b = r0
                r1 = 1
                com.google.protobuf.WireFormat$FieldType r2 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f56838b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r3 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f56838b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r4 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f56838b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r5 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f56838b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r6 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f56838b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r7 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f56838b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r8 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f56838b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r9 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f56838b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f56838b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f56838b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f56838b     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f56838b     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f56838b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f56838b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f56838b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f56838b     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f56838b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                com.google.protobuf.WireFormat$JavaType[] r9 = com.google.protobuf.WireFormat.JavaType.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f56837a = r9
                com.google.protobuf.WireFormat$JavaType r10 = com.google.protobuf.WireFormat.JavaType.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f56837a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                com.google.protobuf.WireFormat$JavaType r9 = com.google.protobuf.WireFormat.JavaType.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f56837a     // Catch:{ NoSuchFieldError -> 0x00fd }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f56837a     // Catch:{ NoSuchFieldError -> 0x0107 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f56837a     // Catch:{ NoSuchFieldError -> 0x0111 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f56837a     // Catch:{ NoSuchFieldError -> 0x011b }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f56837a     // Catch:{ NoSuchFieldError -> 0x0125 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f56837a     // Catch:{ NoSuchFieldError -> 0x012f }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f56837a     // Catch:{ NoSuchFieldError -> 0x0139 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.FieldSet.C115861.<clinit>():void");
        }
    }

    static final class Builder<T extends FieldDescriptorLite<T>> {

        /* renamed from: a */
        private SmallSortedMap<T, Object> f56839a;

        /* renamed from: b */
        private boolean f56840b;

        private Builder() {
            this(SmallSortedMap.m81211q(16));
        }

        private Builder(SmallSortedMap<T, Object> smallSortedMap) {
            this.f56839a = smallSortedMap;
            this.f56840b = true;
        }
    }

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        /* renamed from: D */
        WireFormat.FieldType mo65142D();

        /* renamed from: M */
        WireFormat.JavaType mo65143M();

        /* renamed from: O */
        boolean mo65144O();

        /* renamed from: c */
        int mo65145c();

        /* renamed from: f0 */
        MessageLite.Builder mo65146f0(MessageLite.Builder builder, MessageLite messageLite);

        /* renamed from: u */
        boolean mo65147u();
    }

    private FieldSet() {
        this.f56834a = SmallSortedMap.m81211q(16);
    }

    /* renamed from: A */
    static void m80573A(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (C115861.f56838b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.mo65034g1(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.mo65040k1(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.mo65048q1(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.mo65017D1(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.mo65047p1(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.mo65038j1(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.mo65036i1(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.mo65027c1(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.mo65044n1((MessageLite) obj);
                return;
            case 10:
                codedOutputStream.mo65053t1((MessageLite) obj);
                return;
            case 11:
                if (obj instanceof ByteString) {
                    codedOutputStream.mo65032f1((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.mo65012A1((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof ByteString) {
                    codedOutputStream.mo65032f1((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.mo65029d1((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.mo65016C1(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.mo65056w1(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.mo65058x1(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.mo65059y1(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.mo65060z1(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof Internal.EnumLite) {
                    codedOutputStream.mo65035h1(((Internal.EnumLite) obj).mo60052c());
                    return;
                } else {
                    codedOutputStream.mo65035h1(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: c */
    private static Object m80574c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: d */
    static int m80575d(WireFormat.FieldType fieldType, int i, Object obj) {
        int N0 = CodedOutputStream.m80093N0(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            N0 *= 2;
        }
        return N0 + m80576e(fieldType, obj);
    }

    /* renamed from: e */
    static int m80576e(WireFormat.FieldType fieldType, Object obj) {
        switch (C115861.f56838b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.m80110b0(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m80118j0(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m80125q0(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m80097R0(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m80123o0(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m80116h0(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m80114f0(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m80102W(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m80120l0((MessageLite) obj);
            case 10:
                if (obj instanceof LazyField) {
                    return CodedOutputStream.m80128t0((LazyField) obj);
                }
                return CodedOutputStream.m80133y0((MessageLite) obj);
            case 11:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.m80107Z((ByteString) obj);
                }
                return CodedOutputStream.m80092M0((String) obj);
            case 12:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.m80107Z((ByteString) obj);
                }
                return CodedOutputStream.m80103X((byte[]) obj);
            case 13:
                return CodedOutputStream.m80095P0(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.m80084E0(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m80086G0(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m80088I0(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.m80090K0(((Long) obj).longValue());
            case 18:
                if (obj instanceof Internal.EnumLite) {
                    return CodedOutputStream.m80112d0(((Internal.EnumLite) obj).mo60052c());
                }
                return CodedOutputStream.m80112d0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m80577f(FieldDescriptorLite<?> fieldDescriptorLite, Object obj) {
        WireFormat.FieldType D = fieldDescriptorLite.mo65142D();
        int c = fieldDescriptorLite.mo65145c();
        if (!fieldDescriptorLite.mo65147u()) {
            return m80575d(D, c, obj);
        }
        int i = 0;
        if (fieldDescriptorLite.mo65144O()) {
            for (Object e : (List) obj) {
                i += m80576e(D, e);
            }
            return CodedOutputStream.m80093N0(c) + i + CodedOutputStream.m80082C0(i);
        }
        for (Object d : (List) obj) {
            i += m80575d(D, c, d);
        }
        return i;
    }

    /* renamed from: h */
    public static <T extends FieldDescriptorLite<T>> FieldSet<T> m80578h() {
        return f56833d;
    }

    /* renamed from: k */
    private int m80579k(Map.Entry<T, Object> entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (fieldDescriptorLite.mo65143M() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.mo65147u() || fieldDescriptorLite.mo65144O()) {
            return m80577f(fieldDescriptorLite, value);
        }
        if (value instanceof LazyField) {
            return CodedOutputStream.m80126r0(((FieldDescriptorLite) entry.getKey()).mo65145c(), (LazyField) value);
        }
        return CodedOutputStream.m80130v0(((FieldDescriptorLite) entry.getKey()).mo65145c(), (MessageLite) value);
    }

    /* renamed from: m */
    static int m80580m(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.mo65549d();
    }

    /* renamed from: q */
    private static <T extends FieldDescriptorLite<T>> boolean m80581q(Map.Entry<T, Object> entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.mo65143M() == WireFormat.JavaType.MESSAGE) {
            if (fieldDescriptorLite.mo65147u()) {
                for (MessageLite a : (List) entry.getValue()) {
                    if (!a.mo65172a()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof MessageLite) {
                    if (!((MessageLite) value).mo65172a()) {
                        return false;
                    }
                } else if (value instanceof LazyField) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: r */
    private static boolean m80582r(WireFormat.FieldType fieldType, Object obj) {
        Internal.m80732a(obj);
        switch (C115861.f56837a[fieldType.mo65548b().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof ByteString) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof Internal.EnumLite)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof MessageLite) || (obj instanceof LazyField)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: v */
    private void m80583v(Map.Entry<T, Object> entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).mo65254f();
        }
        if (fieldDescriptorLite.mo65147u()) {
            Object i = mo65132i(fieldDescriptorLite);
            if (i == null) {
                i = new ArrayList();
            }
            for (Object c : (List) value) {
                ((List) i).add(m80574c(c));
            }
            this.f56834a.put(fieldDescriptorLite, i);
        } else if (fieldDescriptorLite.mo65143M() == WireFormat.JavaType.MESSAGE) {
            Object i2 = mo65132i(fieldDescriptorLite);
            if (i2 == null) {
                this.f56834a.put(fieldDescriptorLite, m80574c(value));
                return;
            }
            this.f56834a.put(fieldDescriptorLite, fieldDescriptorLite.mo65146f0(((MessageLite) i2).mo65173b(), (MessageLite) value).build());
        } else {
            this.f56834a.put(fieldDescriptorLite, m80574c(value));
        }
    }

    /* renamed from: w */
    public static <T extends FieldDescriptorLite<T>> FieldSet<T> m80584w() {
        return new FieldSet<>();
    }

    /* renamed from: y */
    private void m80585y(WireFormat.FieldType fieldType, Object obj) {
        if (!m80582r(fieldType, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    /* renamed from: z */
    static void m80586z(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.mo65042l1(i, (MessageLite) obj);
            return;
        }
        codedOutputStream.mo65014B1(i, m80580m(fieldType, false));
        m80573A(codedOutputStream, fieldType, obj);
    }

    /* renamed from: a */
    public void mo65126a(T t, Object obj) {
        List list;
        if (t.mo65147u()) {
            m80585y(t.mo65142D(), obj);
            Object i = mo65132i(t);
            if (i == null) {
                list = new ArrayList();
                this.f56834a.put(t, list);
            } else {
                list = (List) i;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public FieldSet<T> clone() {
        FieldSet<T> w = m80584w();
        for (int i = 0; i < this.f56834a.mo65395k(); i++) {
            Map.Entry<T, Object> j = this.f56834a.mo65394j(i);
            w.mo65141x((FieldDescriptorLite) j.getKey(), j.getValue());
        }
        for (Map.Entry next : this.f56834a.mo65397m()) {
            w.mo65141x((FieldDescriptorLite) next.getKey(), next.getValue());
        }
        w.f56836c = this.f56836c;
        return w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldSet)) {
            return false;
        }
        return this.f56834a.equals(((FieldSet) obj).f56834a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Iterator<Map.Entry<T, Object>> mo65130g() {
        if (this.f56836c) {
            return new LazyField.LazyIterator(this.f56834a.mo65392h().iterator());
        }
        return this.f56834a.mo65392h().iterator();
    }

    public int hashCode() {
        return this.f56834a.hashCode();
    }

    /* renamed from: i */
    public Object mo65132i(T t) {
        Object obj = this.f56834a.get(t);
        return obj instanceof LazyField ? ((LazyField) obj).mo65254f() : obj;
    }

    /* renamed from: j */
    public int mo65133j() {
        int i = 0;
        for (int i2 = 0; i2 < this.f56834a.mo65395k(); i2++) {
            i += m80579k(this.f56834a.mo65394j(i2));
        }
        for (Map.Entry<T, Object> k : this.f56834a.mo65397m()) {
            i += m80579k(k);
        }
        return i;
    }

    /* renamed from: l */
    public int mo65134l() {
        int i = 0;
        for (int i2 = 0; i2 < this.f56834a.mo65395k(); i2++) {
            Map.Entry<T, Object> j = this.f56834a.mo65394j(i2);
            i += m80577f((FieldDescriptorLite) j.getKey(), j.getValue());
        }
        for (Map.Entry next : this.f56834a.mo65397m()) {
            i += m80577f((FieldDescriptorLite) next.getKey(), next.getValue());
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo65135n() {
        return this.f56834a.isEmpty();
    }

    /* renamed from: o */
    public boolean mo65136o() {
        return this.f56835b;
    }

    /* renamed from: p */
    public boolean mo65137p() {
        for (int i = 0; i < this.f56834a.mo65395k(); i++) {
            if (!m80581q(this.f56834a.mo65394j(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> q : this.f56834a.mo65397m()) {
            if (!m80581q(q)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public Iterator<Map.Entry<T, Object>> mo65138s() {
        if (this.f56836c) {
            return new LazyField.LazyIterator(this.f56834a.entrySet().iterator());
        }
        return this.f56834a.entrySet().iterator();
    }

    /* renamed from: t */
    public void mo65139t() {
        if (!this.f56835b) {
            this.f56834a.mo65399p();
            this.f56835b = true;
        }
    }

    /* renamed from: u */
    public void mo65140u(FieldSet<T> fieldSet) {
        for (int i = 0; i < fieldSet.f56834a.mo65395k(); i++) {
            m80583v(fieldSet.f56834a.mo65394j(i));
        }
        for (Map.Entry<T, Object> v : fieldSet.f56834a.mo65397m()) {
            m80583v(v);
        }
    }

    /* renamed from: x */
    public void mo65141x(T t, Object obj) {
        if (!t.mo65147u()) {
            m80585y(t.mo65142D(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object y : arrayList) {
                m80585y(t.mo65142D(), y);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof LazyField) {
            this.f56836c = true;
        }
        this.f56834a.put(t, obj);
    }

    private FieldSet(boolean z) {
        this(SmallSortedMap.m81211q(0));
        mo65139t();
    }

    private FieldSet(SmallSortedMap<T, Object> smallSortedMap) {
        this.f56834a = smallSortedMap;
        mo65139t();
    }
}
