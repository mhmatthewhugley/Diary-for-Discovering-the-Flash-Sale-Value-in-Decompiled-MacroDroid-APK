package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C14492g.C14494b;
import kotlin.reflect.jvm.internal.impl.protobuf.C14503i;
import kotlin.reflect.jvm.internal.impl.protobuf.C14506j;
import kotlin.reflect.jvm.internal.impl.protobuf.C14516o;
import kotlin.reflect.jvm.internal.impl.protobuf.C14539w;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g */
/* compiled from: FieldSet */
final class C14492g<FieldDescriptorType extends C14494b<FieldDescriptorType>> {

    /* renamed from: d */
    private static final C14492g f63354d = new C14492g(true);

    /* renamed from: a */
    private final C14527t<FieldDescriptorType, Object> f63355a = C14527t.m91080n(16);

    /* renamed from: b */
    private boolean f63356b;

    /* renamed from: c */
    private boolean f63357c = false;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g$a */
    /* compiled from: FieldSet */
    static /* synthetic */ class C14493a {

        /* renamed from: a */
        static final /* synthetic */ int[] f63358a;

        /* renamed from: b */
        static final /* synthetic */ int[] f63359b;

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
                kotlin.reflect.jvm.internal.impl.protobuf.w$b[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f63359b = r0
                r1 = 1
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r2 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f63359b     // Catch:{ NoSuchFieldError -> 0x001d }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r3 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f63359b     // Catch:{ NoSuchFieldError -> 0x0028 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r4 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f63359b     // Catch:{ NoSuchFieldError -> 0x0033 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r5 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f63359b     // Catch:{ NoSuchFieldError -> 0x003e }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r6 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f63359b     // Catch:{ NoSuchFieldError -> 0x0049 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r7 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f63359b     // Catch:{ NoSuchFieldError -> 0x0054 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r8 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f63359b     // Catch:{ NoSuchFieldError -> 0x0060 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r9 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f63359b     // Catch:{ NoSuchFieldError -> 0x006c }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.STRING     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f63359b     // Catch:{ NoSuchFieldError -> 0x0078 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.BYTES     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f63359b     // Catch:{ NoSuchFieldError -> 0x0084 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f63359b     // Catch:{ NoSuchFieldError -> 0x0090 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f63359b     // Catch:{ NoSuchFieldError -> 0x009c }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f63359b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.SINT32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f63359b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.SINT64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f63359b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.GROUP     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f63359b     // Catch:{ NoSuchFieldError -> 0x00cc }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f63359b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                kotlin.reflect.jvm.internal.impl.protobuf.w$c[] r9 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14546c.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f63358a = r9
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r10 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14546c.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f63358a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r9 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14546c.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f63358a     // Catch:{ NoSuchFieldError -> 0x00fd }
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r1 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14546c.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f63358a     // Catch:{ NoSuchFieldError -> 0x0107 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r1 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14546c.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f63358a     // Catch:{ NoSuchFieldError -> 0x0111 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r1 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14546c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f63358a     // Catch:{ NoSuchFieldError -> 0x011b }
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r1 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14546c.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f63358a     // Catch:{ NoSuchFieldError -> 0x0125 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r1 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14546c.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f63358a     // Catch:{ NoSuchFieldError -> 0x012f }
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r1 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14546c.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f63358a     // Catch:{ NoSuchFieldError -> 0x0139 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r1 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14546c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C14492g.C14493a.<clinit>():void");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g$b */
    /* compiled from: FieldSet */
    public interface C14494b<T extends C14494b<T>> extends Comparable<T> {
        /* renamed from: D */
        C14539w.C14541b mo73379D();

        /* renamed from: M */
        C14539w.C14546c mo73380M();

        /* renamed from: O */
        boolean mo73381O();

        /* renamed from: c */
        int mo73382c();

        /* renamed from: e1 */
        C14516o.C14517a mo73383e1(C14516o.C14517a aVar, C14516o oVar);

        /* renamed from: u */
        boolean mo73384u();
    }

    private C14492g() {
    }

    /* renamed from: c */
    private Object m90914c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: d */
    private static int m90915d(C14539w.C14541b bVar, int i, Object obj) {
        int D = CodedOutputStream.m90726D(i);
        if (bVar == C14539w.C14541b.GROUP) {
            D *= 2;
        }
        return D + m90916e(bVar, obj);
    }

    /* renamed from: e */
    private static int m90916e(C14539w.C14541b bVar, Object obj) {
        switch (C14493a.f63359b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.m90739g(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m90745m(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m90749q(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m90728F(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m90748p(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m90743k(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m90742j(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m90734b(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m90725C((String) obj);
            case 10:
                if (obj instanceof C14485d) {
                    return CodedOutputStream.m90737e((C14485d) obj);
                }
                return CodedOutputStream.m90735c((byte[]) obj);
            case 11:
                return CodedOutputStream.m90727E(((Integer) obj).intValue());
            case 12:
                return CodedOutputStream.m90756x(((Integer) obj).intValue());
            case 13:
                return CodedOutputStream.m90757y(((Long) obj).longValue());
            case 14:
                return CodedOutputStream.m90758z(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m90724B(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m90746n((C14516o) obj);
            case 17:
                if (obj instanceof C14506j) {
                    return CodedOutputStream.m90750r((C14506j) obj);
                }
                return CodedOutputStream.m90752t((C14516o) obj);
            case 18:
                if (obj instanceof C14503i.C14504a) {
                    return CodedOutputStream.m90741i(((C14503i.C14504a) obj).mo71084c());
                }
                return CodedOutputStream.m90741i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m90917f(C14494b<?> bVar, Object obj) {
        C14539w.C14541b D = bVar.mo73379D();
        int c = bVar.mo73382c();
        if (!bVar.mo73384u()) {
            return m90915d(D, c, obj);
        }
        int i = 0;
        if (bVar.mo73381O()) {
            for (Object e : (List) obj) {
                i += m90916e(D, e);
            }
            return CodedOutputStream.m90726D(c) + i + CodedOutputStream.m90754v(i);
        }
        for (Object d : (List) obj) {
            i += m90915d(D, c, d);
        }
        return i;
    }

    /* renamed from: g */
    public static <T extends C14494b<T>> C14492g<T> m90918g() {
        return f63354d;
    }

    /* renamed from: l */
    static int m90919l(C14539w.C14541b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.mo73522d();
    }

    /* renamed from: o */
    private boolean m90920o(Map.Entry<FieldDescriptorType, Object> entry) {
        C14494b bVar = (C14494b) entry.getKey();
        if (bVar.mo73380M() == C14539w.C14546c.MESSAGE) {
            if (bVar.mo73384u()) {
                for (C14516o a : (List) entry.getValue()) {
                    if (!a.mo71013a()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C14516o) {
                    if (!((C14516o) value).mo71013a()) {
                        return false;
                    }
                } else if (value instanceof C14506j) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: s */
    private void m90921s(Map.Entry<FieldDescriptorType, Object> entry) {
        C14494b bVar = (C14494b) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C14506j) {
            value = ((C14506j) value).mo73407e();
        }
        if (bVar.mo73384u()) {
            Object h = mo73369h(bVar);
            if (h == null) {
                h = new ArrayList();
            }
            for (Object c : (List) value) {
                ((List) h).add(m90914c(c));
            }
            this.f63355a.mo73471o(bVar, h);
        } else if (bVar.mo73380M() == C14539w.C14546c.MESSAGE) {
            Object h2 = mo73369h(bVar);
            if (h2 == null) {
                this.f63355a.mo73471o(bVar, m90914c(value));
                return;
            }
            this.f63355a.mo73471o(bVar, bVar.mo73383e1(((C14516o) h2).mo71014b(), (C14516o) value).build());
        } else {
            this.f63355a.mo73471o(bVar, m90914c(value));
        }
    }

    /* renamed from: t */
    public static <T extends C14494b<T>> C14492g<T> m90922t() {
        return new C14492g<>();
    }

    /* renamed from: u */
    public static Object m90923u(C14488e eVar, C14539w.C14541b bVar, boolean z) throws IOException {
        switch (C14493a.f63359b[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(eVar.mo73348m());
            case 2:
                return Float.valueOf(eVar.mo73352q());
            case 3:
                return Long.valueOf(eVar.mo73355t());
            case 4:
                return Long.valueOf(eVar.mo73337M());
            case 5:
                return Integer.valueOf(eVar.mo73354s());
            case 6:
                return Long.valueOf(eVar.mo73351p());
            case 7:
                return Integer.valueOf(eVar.mo73350o());
            case 8:
                return Boolean.valueOf(eVar.mo73346k());
            case 9:
                if (z) {
                    return eVar.mo73334J();
                }
                return eVar.mo73333I();
            case 10:
                return eVar.mo73347l();
            case 11:
                return Integer.valueOf(eVar.mo73336L());
            case 12:
                return Integer.valueOf(eVar.mo73329E());
            case 13:
                return Long.valueOf(eVar.mo73330F());
            case 14:
                return Integer.valueOf(eVar.mo73331G());
            case 15:
                return Long.valueOf(eVar.mo73332H());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C14506j) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C14503i.C14504a) == false) goto L_0x0030;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m90924w(kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b r2, java.lang.Object r3) {
        /*
            java.util.Objects.requireNonNull(r3)
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.C14492g.C14493a.f63358a
            kotlin.reflect.jvm.internal.impl.protobuf.w$c r2 = r2.mo73521b()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0042;
                case 2: goto L_0x003f;
                case 3: goto L_0x003c;
                case 4: goto L_0x0039;
                case 5: goto L_0x0036;
                case 6: goto L_0x0033;
                case 7: goto L_0x0027;
                case 8: goto L_0x001e;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0044
        L_0x0015:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C14516o
            if (r2 != 0) goto L_0x0031
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C14506j
            if (r2 == 0) goto L_0x0030
            goto L_0x0031
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0031
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C14503i.C14504a
            if (r2 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0027:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C14485d
            if (r2 != 0) goto L_0x0031
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            r1 = r0
            goto L_0x0044
        L_0x0033:
            boolean r1 = r3 instanceof java.lang.String
            goto L_0x0044
        L_0x0036:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L_0x0044
        L_0x0039:
            boolean r1 = r3 instanceof java.lang.Double
            goto L_0x0044
        L_0x003c:
            boolean r1 = r3 instanceof java.lang.Float
            goto L_0x0044
        L_0x003f:
            boolean r1 = r3 instanceof java.lang.Long
            goto L_0x0044
        L_0x0042:
            boolean r1 = r3 instanceof java.lang.Integer
        L_0x0044:
            if (r1 == 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C14492g.m90924w(kotlin.reflect.jvm.internal.impl.protobuf.w$b, java.lang.Object):void");
    }

    /* renamed from: x */
    private static void m90925x(CodedOutputStream codedOutputStream, C14539w.C14541b bVar, int i, Object obj) throws IOException {
        if (bVar == C14539w.C14541b.GROUP) {
            codedOutputStream.mo73248Y(i, (C14516o) obj);
            return;
        }
        codedOutputStream.mo73272w0(i, m90919l(bVar, false));
        m90926y(codedOutputStream, bVar, obj);
    }

    /* renamed from: y */
    private static void m90926y(CodedOutputStream codedOutputStream, C14539w.C14541b bVar, Object obj) throws IOException {
        switch (C14493a.f63359b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.mo73241R(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.mo73247X(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.mo73252c0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.mo73275z0(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.mo73251b0(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.mo73245V(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.mo73244U(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.mo73236M(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.mo73271v0((String) obj);
                return;
            case 10:
                if (obj instanceof C14485d) {
                    codedOutputStream.mo73239P((C14485d) obj);
                    return;
                } else {
                    codedOutputStream.mo73237N((byte[]) obj);
                    return;
                }
            case 11:
                codedOutputStream.mo73274y0(((Integer) obj).intValue());
                return;
            case 12:
                codedOutputStream.mo73266q0(((Integer) obj).intValue());
                return;
            case 13:
                codedOutputStream.mo73267r0(((Long) obj).longValue());
                return;
            case 14:
                codedOutputStream.mo73268s0(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.mo73270u0(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.mo73249Z((C14516o) obj);
                return;
            case 17:
                codedOutputStream.mo73254e0((C14516o) obj);
                return;
            case 18:
                if (obj instanceof C14503i.C14504a) {
                    codedOutputStream.mo73243T(((C14503i.C14504a) obj).mo71084c());
                    return;
                } else {
                    codedOutputStream.mo73243T(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: z */
    public static void m90927z(C14494b<?> bVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        C14539w.C14541b D = bVar.mo73379D();
        int c = bVar.mo73382c();
        if (bVar.mo73384u()) {
            List<Object> list = (List) obj;
            if (bVar.mo73381O()) {
                codedOutputStream.mo73272w0(c, 2);
                int i = 0;
                for (Object e : list) {
                    i += m90916e(D, e);
                }
                codedOutputStream.mo73264o0(i);
                for (Object y : list) {
                    m90926y(codedOutputStream, D, y);
                }
                return;
            }
            for (Object x : list) {
                m90925x(codedOutputStream, D, c, x);
            }
        } else if (obj instanceof C14506j) {
            m90925x(codedOutputStream, D, c, ((C14506j) obj).mo73407e());
        } else {
            m90925x(codedOutputStream, D, c, obj);
        }
    }

    /* renamed from: a */
    public void mo73366a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (fielddescriptortype.mo73384u()) {
            m90924w(fielddescriptortype.mo73379D(), obj);
            Object h = mo73369h(fielddescriptortype);
            if (h == null) {
                list = new ArrayList();
                this.f63355a.mo73471o(fielddescriptortype, list);
            } else {
                list = (List) h;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public C14492g<FieldDescriptorType> clone() {
        C14492g<FieldDescriptorType> t = m90922t();
        for (int i = 0; i < this.f63355a.mo73467i(); i++) {
            Map.Entry<FieldDescriptorType, Object> h = this.f63355a.mo73466h(i);
            t.mo73378v((C14494b) h.getKey(), h.getValue());
        }
        for (Map.Entry next : this.f63355a.mo73468j()) {
            t.mo73378v((C14494b) next.getKey(), next.getValue());
        }
        t.f63357c = this.f63357c;
        return t;
    }

    /* renamed from: h */
    public Object mo73369h(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f63355a.get(fielddescriptortype);
        return obj instanceof C14506j ? ((C14506j) obj).mo73407e() : obj;
    }

    /* renamed from: i */
    public Object mo73370i(FieldDescriptorType fielddescriptortype, int i) {
        if (fielddescriptortype.mo73384u()) {
            Object h = mo73369h(fielddescriptortype);
            if (h != null) {
                return ((List) h).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: j */
    public int mo73371j(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.mo73384u()) {
            Object h = mo73369h(fielddescriptortype);
            if (h == null) {
                return 0;
            }
            return ((List) h).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: k */
    public int mo73372k() {
        int i = 0;
        for (int i2 = 0; i2 < this.f63355a.mo73467i(); i2++) {
            Map.Entry<FieldDescriptorType, Object> h = this.f63355a.mo73466h(i2);
            i += m90917f((C14494b) h.getKey(), h.getValue());
        }
        for (Map.Entry next : this.f63355a.mo73468j()) {
            i += m90917f((C14494b) next.getKey(), next.getValue());
        }
        return i;
    }

    /* renamed from: m */
    public boolean mo73373m(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.mo73384u()) {
            return this.f63355a.get(fielddescriptortype) != null;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    /* renamed from: n */
    public boolean mo73374n() {
        for (int i = 0; i < this.f63355a.mo73467i(); i++) {
            if (!m90920o(this.f63355a.mo73466h(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> o : this.f63355a.mo73468j()) {
            if (!m90920o(o)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public Iterator<Map.Entry<FieldDescriptorType, Object>> mo73375p() {
        if (this.f63357c) {
            return new C14506j.C14509c(this.f63355a.entrySet().iterator());
        }
        return this.f63355a.entrySet().iterator();
    }

    /* renamed from: q */
    public void mo73376q() {
        if (!this.f63356b) {
            this.f63355a.mo73470m();
            this.f63356b = true;
        }
    }

    /* renamed from: r */
    public void mo73377r(C14492g<FieldDescriptorType> gVar) {
        for (int i = 0; i < gVar.f63355a.mo73467i(); i++) {
            m90921s(gVar.f63355a.mo73466h(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> s : gVar.f63355a.mo73468j()) {
            m90921s(s);
        }
    }

    /* renamed from: v */
    public void mo73378v(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo73384u()) {
            m90924w(fielddescriptortype.mo73379D(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object w : arrayList) {
                m90924w(fielddescriptortype.mo73379D(), w);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C14506j) {
            this.f63357c = true;
        }
        this.f63355a.mo73471o(fielddescriptortype, obj);
    }

    private C14492g(boolean z) {
        mo73376q();
    }
}
