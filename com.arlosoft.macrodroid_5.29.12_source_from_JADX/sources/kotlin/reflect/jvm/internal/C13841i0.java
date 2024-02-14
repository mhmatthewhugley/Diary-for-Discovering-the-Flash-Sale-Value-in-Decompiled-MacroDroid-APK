package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13703l;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13717z;
import kotlin.reflect.jvm.internal.calls.C13732b;
import kotlin.reflect.jvm.internal.impl.builtins.C13859i;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C13871c;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13913a;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14088d;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14091e;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14100l;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14112p;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14459q;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14466s;
import kotlin.reflect.jvm.internal.impl.protobuf.C14516o;
import kotlin.reflect.jvm.internal.impl.resolve.C14654f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14610a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14612b;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14622j;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14623k;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14636q;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14642s;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14720d0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14794k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14798m;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14814w;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14750f;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import org.apache.commons.p353io.FilenameUtils;
import p242db.C11991b;
import p242db.C11994e;
import p242db.C11995f;
import p242db.C12001k;
import p242db.C12003l;
import p297ja.C13328m;
import p297ja.C13337s;
import p308kb.C13481i;
import p308kb.C13494n;
import p308kb.C13519s;
import p327mb.C15712a;
import p327mb.C15719c;
import p327mb.C15724g;
import p327mb.C15725h;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16153d;
import p362pb.C16157f;
import p370qa.C16269p;
import p389sb.C16519a;
import p433xa.C16874c;
import p433xa.C16888n;
import p433xa.C16894r;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a(\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002\u001a.\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a\u0014\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0000\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0000\u001a\u0012\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u0012H\u0000\u001a\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002\u001a\u000e\u0010\u0018\u001a\u0004\u0018\u00010\u0014*\u00020\u0017H\u0002\u001a\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a*\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001e*\u0004\u0018\u00010\u001aH\u0000\u001a\u0014\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010 *\u0004\u0018\u00010\u001aH\u0000\u001a\u0012\u0010$\u001a\u0004\u0018\u00010\u001a2\u0006\u0010#\u001a\u00020\"H\u0000\u001ai\u00104\u001a\u00028\u0001\"\b\b\u0000\u0010&*\u00020%\"\b\b\u0001\u0010(*\u00020'2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010*\u001a\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000101H\u0000¢\u0006\u0004\b4\u00105\u001a'\u00109\u001a\u00028\u0000\"\u0004\b\u0000\u001062\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000007H\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\"\u0018\u0010?\u001a\u00020<*\u00020;8@X\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>\"\u001a\u0010C\u001a\u0004\u0018\u00010@*\u00020'8@X\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B\u0002\u0007\n\u0005\b20\u0001¨\u0006D"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "Ljava/lang/Class;", "o", "Ljava/lang/ClassLoader;", "classLoader", "Lpb/b;", "kotlinClassId", "", "arrayDimensions", "l", "", "packageName", "className", "k", "e", "Lkotlin/reflect/jvm/internal/impl/descriptors/u;", "Lxa/r;", "p", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;", "", "", "d", "r", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;", "n", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/g;", "", "q", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/b;", "a", "Lkotlin/reflect/jvm/internal/j;", "b", "Lkotlin/reflect/jvm/internal/v;", "c", "Ljava/lang/reflect/Type;", "type", "f", "Lkotlin/reflect/jvm/internal/impl/protobuf/o;", "M", "Lkotlin/reflect/jvm/internal/impl/descriptors/a;", "D", "moduleAnchor", "proto", "Lmb/c;", "nameResolver", "Lmb/g;", "typeTable", "Lmb/a;", "metadataVersion", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/w;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lqa/p;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(Lqa/a;)Ljava/lang/Object;", "Lxa/n;", "", "j", "(Lxa/n;)Z", "isInlineClassType", "Lkotlin/reflect/jvm/internal/impl/descriptors/w0;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.i0 */
/* compiled from: util.kt */
public final class C13841i0 {

    /* renamed from: a */
    private static final C16152c f62059a = new C16152c("kotlin.jvm.JvmStatic");

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.i0$a */
    /* compiled from: util.kt */
    public /* synthetic */ class C13842a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62060a;

        static {
            int[] iArr = new int[C13859i.values().length];
            iArr[C13859i.BOOLEAN.ordinal()] = 1;
            iArr[C13859i.CHAR.ordinal()] = 2;
            iArr[C13859i.BYTE.ordinal()] = 3;
            iArr[C13859i.SHORT.ordinal()] = 4;
            iArr[C13859i.INT.ordinal()] = 5;
            iArr[C13859i.FLOAT.ordinal()] = 6;
            iArr[C13859i.LONG.ordinal()] = 7;
            iArr[C13859i.DOUBLE.ordinal()] = 8;
            f62060a = iArr;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [boolean[], char[], byte[], short[]], vars: [r7v10 ?, r7v1 ?, r7v11 ?, r7v12 ?, r7v13 ?, r7v14 ?, r7v15 ?, r7v16 ?, r7v17 ?, r7v18 ?, r7v19 ?, r7v20 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: a */
    private static final java.lang.Object m88196a(kotlin.reflect.jvm.internal.impl.resolve.constants.C14612b r6, java.lang.ClassLoader r7) {
        /*
            boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14799n
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r6
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.n r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14799n) r0
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            if (r0 == 0) goto L_0x0245
            kotlin.reflect.jvm.internal.impl.types.e0 r0 = r0.mo73997c()
            if (r0 != 0) goto L_0x0014
            goto L_0x0245
        L_0x0014:
            java.lang.Object r2 = r6.mo73727b()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.C13616u.m87774u(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x0029:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x003d
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r4 = (kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g) r4
            java.lang.Object r4 = m88212q(r4, r7)
            r3.add(r4)
            goto L_0x0029
        L_0x003d:
            kotlin.reflect.jvm.internal.impl.builtins.i r2 = kotlin.reflect.jvm.internal.impl.builtins.C13853h.m88246N(r0)
            if (r2 != 0) goto L_0x0045
            r2 = -1
            goto L_0x004d
        L_0x0045:
            int[] r4 = kotlin.reflect.jvm.internal.C13841i0.C13842a.f62060a
            int r2 = r2.ordinal()
            r2 = r4[r2]
        L_0x004d:
            r4 = 0
            switch(r2) {
                case -1: goto L_0x0167;
                case 0: goto L_0x0051;
                case 1: goto L_0x0145;
                case 2: goto L_0x0123;
                case 3: goto L_0x0101;
                case 4: goto L_0x00df;
                case 5: goto L_0x00bd;
                case 6: goto L_0x009b;
                case 7: goto L_0x0079;
                case 8: goto L_0x0057;
                default: goto L_0x0051;
            }
        L_0x0051:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x0057:
            java.lang.Object r6 = r6.mo73727b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            double[] r7 = new double[r6]
        L_0x0063:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Double"
            kotlin.jvm.internal.C13706o.m87927d(r0, r1)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x0063
        L_0x0079:
            java.lang.Object r6 = r6.mo73727b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            long[] r7 = new long[r6]
        L_0x0085:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Long"
            kotlin.jvm.internal.C13706o.m87927d(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x0085
        L_0x009b:
            java.lang.Object r6 = r6.mo73727b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            float[] r7 = new float[r6]
        L_0x00a7:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Float"
            kotlin.jvm.internal.C13706o.m87927d(r0, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x00a7
        L_0x00bd:
            java.lang.Object r6 = r6.mo73727b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            int[] r7 = new int[r6]
        L_0x00c9:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.C13706o.m87927d(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x00c9
        L_0x00df:
            java.lang.Object r6 = r6.mo73727b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            short[] r7 = new short[r6]
        L_0x00eb:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Short"
            kotlin.jvm.internal.C13706o.m87927d(r0, r1)
            java.lang.Short r0 = (java.lang.Short) r0
            short r0 = r0.shortValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x00eb
        L_0x0101:
            java.lang.Object r6 = r6.mo73727b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            byte[] r7 = new byte[r6]
        L_0x010d:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Byte"
            kotlin.jvm.internal.C13706o.m87927d(r0, r1)
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x010d
        L_0x0123:
            java.lang.Object r6 = r6.mo73727b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            char[] r7 = new char[r6]
        L_0x012f:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Char"
            kotlin.jvm.internal.C13706o.m87927d(r0, r1)
            java.lang.Character r0 = (java.lang.Character) r0
            char r0 = r0.charValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x012f
        L_0x0145:
            java.lang.Object r6 = r6.mo73727b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            boolean[] r7 = new boolean[r6]
        L_0x0151:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Boolean"
            kotlin.jvm.internal.C13706o.m87927d(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x0151
        L_0x0167:
            boolean r2 = kotlin.reflect.jvm.internal.impl.builtins.C13853h.m88255c0(r0)
            if (r2 == 0) goto L_0x022a
            java.util.List r0 = r0.mo73700L0()
            java.lang.Object r0 = kotlin.collections.C13566b0.m87446u0(r0)
            kotlin.reflect.jvm.internal.impl.types.g1 r0 = (kotlin.reflect.jvm.internal.impl.types.C14926g1) r0
            kotlin.reflect.jvm.internal.impl.types.e0 r0 = r0.getType()
            java.lang.String r2 = "type.arguments.single().type"
            kotlin.jvm.internal.C13706o.m87928e(r0, r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r0.mo73702N0()
            kotlin.reflect.jvm.internal.impl.descriptors.h r2 = r2.mo62183c()
            boolean r5 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13948e
            if (r5 == 0) goto L_0x018f
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r2
            goto L_0x0190
        L_0x018f:
            r2 = r1
        L_0x0190:
            if (r2 == 0) goto L_0x020f
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.C13853h.m88277u0(r0)
            if (r0 == 0) goto L_0x01b6
            java.lang.Object r6 = r6.mo73727b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            java.lang.String[] r7 = new java.lang.String[r6]
        L_0x01a4:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.C13706o.m87927d(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x01a4
        L_0x01b6:
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.C13853h.m88265k0(r2)
            if (r0 == 0) goto L_0x01da
            java.lang.Object r6 = r6.mo73727b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            java.lang.Class[] r7 = new java.lang.Class[r6]
        L_0x01c8:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<*>"
            kotlin.jvm.internal.C13706o.m87927d(r0, r1)
            java.lang.Class r0 = (java.lang.Class) r0
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x01c8
        L_0x01da:
            pb.b r0 = p389sb.C16519a.m98614g(r2)
            if (r0 == 0) goto L_0x020e
            r2 = 4
            java.lang.Class r7 = m88208m(r7, r0, r4, r2, r1)
            if (r7 != 0) goto L_0x01e8
            goto L_0x020e
        L_0x01e8:
            java.lang.Object r6 = r6.mo73727b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r7, r6)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>"
            kotlin.jvm.internal.C13706o.m87927d(r6, r7)
            r7 = r6
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            int r6 = r3.size()
        L_0x0202:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x0202
        L_0x020d:
            return r7
        L_0x020e:
            return r1
        L_0x020f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Not a class type: "
            r7.append(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x022a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Not an array type: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L_0x0245:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.C13841i0.m88196a(kotlin.reflect.jvm.internal.impl.resolve.constants.b, java.lang.ClassLoader):java.lang.Object");
    }

    /* renamed from: b */
    public static final C15047j m88197b(Object obj) {
        C15047j jVar = obj instanceof C15047j ? (C15047j) obj : null;
        if (jVar != null) {
            return jVar;
        }
        C13703l lVar = obj instanceof C13703l ? (C13703l) obj : null;
        C16874c compute = lVar != null ? lVar.compute() : null;
        if (compute instanceof C15047j) {
            return (C15047j) compute;
        }
        return null;
    }

    /* renamed from: c */
    public static final C15085v<?> m88198c(Object obj) {
        C15085v<?> vVar = obj instanceof C15085v ? (C15085v) obj : null;
        if (vVar != null) {
            return vVar;
        }
        C13717z zVar = obj instanceof C13717z ? (C13717z) obj : null;
        C16874c compute = zVar != null ? zVar.compute() : null;
        if (compute instanceof C15085v) {
            return (C15085v) compute;
        }
        return null;
    }

    /* renamed from: d */
    public static final List<Annotation> m88199d(C13913a aVar) {
        C13706o.m87929f(aVar, "<this>");
        C13921g<C13915c> annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (C13915c cVar : annotations) {
            C14158z0 source = cVar.getSource();
            Annotation annotation = null;
            if (source instanceof C11991b) {
                annotation = ((C11991b) source).mo67420d();
            } else if (source instanceof C12003l.C12004a) {
                C14112p d = ((C12003l.C12004a) source).mo67446c();
                C14091e eVar = d instanceof C14091e ? (C14091e) d : null;
                if (eVar != null) {
                    annotation = eVar.mo72608N();
                }
            } else {
                annotation = m88209n(cVar);
            }
            if (annotation != null) {
                arrayList.add(annotation);
            }
        }
        return m88213r(arrayList);
    }

    /* renamed from: e */
    public static final Class<?> m88200e(Class<?> cls) {
        C13706o.m87929f(cls, "<this>");
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: f */
    public static final Object m88201f(Type type) {
        C13706o.m87929f(type, "type");
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (C13706o.m87924a(type, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (C13706o.m87924a(type, Character.TYPE)) {
            return 0;
        }
        if (C13706o.m87924a(type, Byte.TYPE)) {
            return (byte) 0;
        }
        if (C13706o.m87924a(type, Short.TYPE)) {
            return (short) 0;
        }
        if (C13706o.m87924a(type, Integer.TYPE)) {
            return 0;
        }
        if (C13706o.m87924a(type, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (C13706o.m87924a(type, Long.TYPE)) {
            return 0L;
        }
        if (C13706o.m87924a(type, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (C13706o.m87924a(type, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    /* renamed from: g */
    public static final <M extends C14516o, D extends C13908a> D m88202g(Class<?> cls, M m, C15719c cVar, C15724g gVar, C15712a aVar, C16269p<? super C14814w, ? super M, ? extends D> pVar) {
        List<C13519s> t0;
        M m2 = m;
        C16269p<? super C14814w, ? super M, ? extends D> pVar2 = pVar;
        Class<?> cls2 = cls;
        C13706o.m87929f(cls, "moduleAnchor");
        C13706o.m87929f(m, "proto");
        C13706o.m87929f(cVar, "nameResolver");
        C13706o.m87929f(gVar, "typeTable");
        C13706o.m87929f(aVar, "metadataVersion");
        C13706o.m87929f(pVar2, "createDescriptor");
        C12001k a = C13721b0.m87962a(cls);
        if (m2 instanceof C13481i) {
            t0 = ((C13481i) m2).mo71275s0();
        } else if (m2 instanceof C13494n) {
            t0 = ((C13494n) m2).mo71369t0();
        } else {
            throw new IllegalStateException(("Unsupported message: " + m).toString());
        }
        List<C13519s> list = t0;
        C14794k a2 = a.mo67441a();
        C13958g0 b = a.mo67442b();
        C15725h b2 = C15725h.f65073b.mo75168b();
        C13706o.m87928e(list, "typeParameters");
        return (C13908a) pVar2.invoke(new C14814w(new C14798m(a2, cVar, b, gVar, b2, aVar, (C14750f) null, (C14720d0) null, list)), m);
    }

    /* renamed from: h */
    public static final C14146w0 m88203h(C13908a aVar) {
        C13706o.m87929f(aVar, "<this>");
        if (aVar.mo72231L() == null) {
            return null;
        }
        C14064m b = aVar.mo62163b();
        C13706o.m87927d(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((C13948e) b).mo72283J0();
    }

    /* renamed from: i */
    public static final C16152c m88204i() {
        return f62059a;
    }

    /* renamed from: j */
    public static final boolean m88205j(C16888n nVar) {
        C14900e0 l;
        C13706o.m87929f(nVar, "<this>");
        C15097x xVar = nVar instanceof C15097x ? (C15097x) nVar : null;
        return (xVar == null || (l = xVar.mo74393l()) == null || !C14654f.m91644c(l)) ? false : true;
    }

    /* renamed from: k */
    private static final Class<?> m88206k(ClassLoader classLoader, String str, String str2, int i) {
        if (C13706o.m87924a(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        String str3 = str + FilenameUtils.EXTENSION_SEPARATOR + C15176v.m93629D(str2, FilenameUtils.EXTENSION_SEPARATOR, '$', false, 4, (Object) null);
        if (i > 0) {
            str3 = C15176v.m93626A("[", i) + 'L' + str3 + ';';
        }
        return C11994e.m82405a(classLoader, str3);
    }

    /* renamed from: l */
    private static final Class<?> m88207l(ClassLoader classLoader, C16151b bVar, int i) {
        C13871c cVar = C13871c.f62112a;
        C16153d j = bVar.mo78544b().mo78566j();
        C13706o.m87928e(j, "kotlinClassId.asSingleFqName().toUnsafe()");
        C16151b n = cVar.mo72174n(j);
        if (n != null) {
            bVar = n;
        }
        String b = bVar.mo78549h().mo78556b();
        C13706o.m87928e(b, "javaClassId.packageFqName.asString()");
        String b2 = bVar.mo78551i().mo78556b();
        C13706o.m87928e(b2, "javaClassId.relativeClassName.asString()");
        return m88206k(classLoader, b, b2, i);
    }

    /* renamed from: m */
    static /* synthetic */ Class m88208m(ClassLoader classLoader, C16151b bVar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m88207l(classLoader, bVar, i);
    }

    /* renamed from: n */
    private static final Annotation m88209n(C13915c cVar) {
        C13948e e = C16519a.m98612e(cVar);
        Class<?> o = e != null ? m88210o(e) : null;
        if (!(o instanceof Class)) {
            o = null;
        }
        if (o == null) {
            return null;
        }
        Set<Map.Entry<C16157f, C14617g<?>>> entrySet = cVar.mo72240a().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : entrySet) {
            C16157f fVar = (C16157f) entry.getKey();
            ClassLoader classLoader = o.getClassLoader();
            C13706o.m87928e(classLoader, "annotationClass.classLoader");
            Object q = m88212q((C14617g) entry.getValue(), classLoader);
            C13328m a = q != null ? C13337s.m85692a(fVar.mo78583d(), q) : null;
            if (a != null) {
                arrayList.add(a);
            }
        }
        return (Annotation) C13732b.m87991g(o, C13615t0.m87768r(arrayList), (List) null, 4, (Object) null);
    }

    /* renamed from: o */
    public static final Class<?> m88210o(C13948e eVar) {
        C13706o.m87929f(eVar, "<this>");
        C14158z0 source = eVar.getSource();
        C13706o.m87928e(source, "source");
        if (source instanceof C14466s) {
            C14459q d = ((C14466s) source).mo73205d();
            C13706o.m87927d(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((C11995f) d).mo67430e();
        } else if (source instanceof C12003l.C12004a) {
            C14112p d2 = ((C12003l.C12004a) source).mo67446c();
            C13706o.m87927d(d2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((C14100l) d2).mo72583b();
        } else {
            C16151b g = C16519a.m98614g(eVar);
            if (g == null) {
                return null;
            }
            return m88207l(C14088d.m89402f(eVar.getClass()), g, 0);
        }
    }

    /* renamed from: p */
    public static final C16894r m88211p(C14141u uVar) {
        C13706o.m87929f(uVar, "<this>");
        if (C13706o.m87924a(uVar, C14127t.f62754e)) {
            return C16894r.PUBLIC;
        }
        if (C13706o.m87924a(uVar, C14127t.f62752c)) {
            return C16894r.PROTECTED;
        }
        if (C13706o.m87924a(uVar, C14127t.f62753d)) {
            return C16894r.INTERNAL;
        }
        if (C13706o.m87924a(uVar, C14127t.f62750a) ? true : C13706o.m87924a(uVar, C14127t.f62751b)) {
            return C16894r.PRIVATE;
        }
        return null;
    }

    /* renamed from: q */
    private static final Object m88212q(C14617g<?> gVar, ClassLoader classLoader) {
        if (gVar instanceof C14610a) {
            return m88209n((C13915c) ((C14610a) gVar).mo73727b());
        }
        if (gVar instanceof C14612b) {
            return m88196a((C14612b) gVar, classLoader);
        }
        if (gVar instanceof C14622j) {
            C13328m mVar = (C13328m) ((C14622j) gVar).mo73727b();
            C16157f fVar = (C16157f) mVar.mo70153b();
            Class m = m88208m(classLoader, (C16151b) mVar.mo70152a(), 0, 4, (Object) null);
            if (m != null) {
                return C13831h0.m88165a(m, fVar.mo78583d());
            }
            return null;
        } else if (gVar instanceof C14636q) {
            C14636q.C14638b bVar = (C14636q.C14638b) ((C14636q) gVar).mo73727b();
            if (bVar instanceof C14636q.C14638b.C14640b) {
                C14636q.C14638b.C14640b bVar2 = (C14636q.C14638b.C14640b) bVar;
                return m88207l(classLoader, bVar2.mo73755b(), bVar2.mo73754a());
            } else if (bVar instanceof C14636q.C14638b.C14639a) {
                C13961h c = ((C14636q.C14638b.C14639a) bVar).mo73750a().mo73702N0().mo62183c();
                C13948e eVar = c instanceof C13948e ? (C13948e) c : null;
                if (eVar != null) {
                    return m88210o(eVar);
                }
                return null;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (gVar instanceof C14623k ? true : gVar instanceof C14642s) {
                return null;
            }
            return gVar.mo73727b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.util.List<java.lang.annotation.Annotation> m88213r(java.util.List<? extends java.lang.annotation.Annotation> r7) {
        /*
            boolean r0 = r7 instanceof java.util.Collection
            java.lang.String r1 = "Container"
            r2 = 0
            if (r0 == 0) goto L_0x000f
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x000f
        L_0x000d:
            r0 = 0
            goto L_0x0032
        L_0x000f:
            java.util.Iterator r0 = r7.iterator()
        L_0x0013:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x000d
            java.lang.Object r3 = r0.next()
            java.lang.annotation.Annotation r3 = (java.lang.annotation.Annotation) r3
            xa.d r3 = p361pa.C16147a.m96967a(r3)
            java.lang.Class r3 = p361pa.C16147a.m96968b(r3)
            java.lang.String r3 = r3.getSimpleName()
            boolean r3 = kotlin.jvm.internal.C13706o.m87924a(r3, r1)
            if (r3 == 0) goto L_0x0013
            r0 = 1
        L_0x0032:
            if (r0 == 0) goto L_0x0086
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x003d:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0085
            java.lang.Object r3 = r7.next()
            java.lang.annotation.Annotation r3 = (java.lang.annotation.Annotation) r3
            xa.d r4 = p361pa.C16147a.m96967a(r3)
            java.lang.Class r4 = p361pa.C16147a.m96968b(r4)
            java.lang.String r5 = r4.getSimpleName()
            boolean r5 = kotlin.jvm.internal.C13706o.m87924a(r5, r1)
            if (r5 == 0) goto L_0x007d
            java.lang.Class<kotlin.jvm.internal.g0> r5 = kotlin.jvm.internal.C13692g0.class
            java.lang.annotation.Annotation r5 = r4.getAnnotation(r5)
            if (r5 == 0) goto L_0x007d
            java.lang.Class[] r5 = new java.lang.Class[r2]
            java.lang.String r6 = "value"
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r6, r5)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Object r3 = r4.invoke(r3, r5)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>"
            kotlin.jvm.internal.C13706o.m87927d(r3, r4)
            java.lang.annotation.Annotation[] r3 = (java.lang.annotation.Annotation[]) r3
            java.util.List r3 = kotlin.collections.C13593l.m87557d(r3)
            goto L_0x0081
        L_0x007d:
            java.util.List r3 = kotlin.collections.C13612s.m87736e(r3)
        L_0x0081:
            boolean unused = kotlin.collections.C13624y.m87797z(r0, r3)
            goto L_0x003d
        L_0x0085:
            r7 = r0
        L_0x0086:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.C13841i0.m88213r(java.util.List):java.util.List");
    }
}
