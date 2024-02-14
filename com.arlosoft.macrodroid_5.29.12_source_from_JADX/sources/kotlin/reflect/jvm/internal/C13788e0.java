package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.renderer.C14552c;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p362pb.C16157f;
import p370qa.C16265l;
import p433xa.C16881j;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0007\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001f"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/e0;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Lkotlin/reflect/jvm/internal/impl/descriptors/w0;", "receiver", "Lja/u;", "a", "Lkotlin/reflect/jvm/internal/impl/descriptors/a;", "callable", "b", "descriptor", "", "c", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "g", "Lkotlin/reflect/jvm/internal/impl/descriptors/y;", "d", "invoke", "e", "Lkotlin/reflect/jvm/internal/p;", "parameter", "f", "Lkotlin/reflect/jvm/internal/impl/types/e0;", "type", "h", "Lkotlin/reflect/jvm/internal/impl/renderer/c;", "Lkotlin/reflect/jvm/internal/impl/renderer/c;", "renderer", "<init>", "()V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.e0 */
/* compiled from: ReflectionObjectRenderer.kt */
public final class C13788e0 {

    /* renamed from: a */
    public static final C13788e0 f62008a = new C13788e0();

    /* renamed from: b */
    private static final C14552c f62009b = C14552c.f63483g;

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.e0$a */
    /* compiled from: ReflectionObjectRenderer.kt */
    public /* synthetic */ class C13789a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62010a;

        static {
            int[] iArr = new int[C16881j.C16882a.values().length];
            iArr[C16881j.C16882a.EXTENSION_RECEIVER.ordinal()] = 1;
            iArr[C16881j.C16882a.INSTANCE.ordinal()] = 2;
            iArr[C16881j.C16882a.VALUE.ordinal()] = 3;
            f62010a = iArr;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/i1;", "kotlin.jvm.PlatformType", "it", "", "a", "(Lkotlin/reflect/jvm/internal/impl/descriptors/i1;)Ljava/lang/CharSequence;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.e0$b */
    /* compiled from: ReflectionObjectRenderer.kt */
    static final class C13790b extends C13708q implements C16265l<C13966i1, CharSequence> {

        /* renamed from: a */
        public static final C13790b f62011a = new C13790b();

        C13790b() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C13966i1 i1Var) {
            C13788e0 e0Var = C13788e0.f62008a;
            C14900e0 type = i1Var.getType();
            C13706o.m87928e(type, "it.type");
            return e0Var.mo72030h(type);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/i1;", "kotlin.jvm.PlatformType", "it", "", "a", "(Lkotlin/reflect/jvm/internal/impl/descriptors/i1;)Ljava/lang/CharSequence;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.e0$c */
    /* compiled from: ReflectionObjectRenderer.kt */
    static final class C13791c extends C13708q implements C16265l<C13966i1, CharSequence> {

        /* renamed from: a */
        public static final C13791c f62012a = new C13791c();

        C13791c() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C13966i1 i1Var) {
            C13788e0 e0Var = C13788e0.f62008a;
            C14900e0 type = i1Var.getType();
            C13706o.m87928e(type, "it.type");
            return e0Var.mo72030h(type);
        }
    }

    private C13788e0() {
    }

    /* renamed from: a */
    private final void m88074a(StringBuilder sb, C14146w0 w0Var) {
        if (w0Var != null) {
            C14900e0 type = w0Var.getType();
            C13706o.m87928e(type, "receiver.type");
            sb.append(mo72030h(type));
            sb.append(".");
        }
    }

    /* renamed from: b */
    private final void m88075b(StringBuilder sb, C13908a aVar) {
        C14146w0 h = C13841i0.m88203h(aVar);
        C14146w0 P = aVar.mo72232P();
        m88074a(sb, h);
        boolean z = (h == null || P == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        m88074a(sb, P);
        if (z) {
            sb.append(")");
        }
    }

    /* renamed from: c */
    private final String m88076c(C13908a aVar) {
        if (aVar instanceof C14140t0) {
            return mo72029g((C14140t0) aVar);
        }
        if (aVar instanceof C14154y) {
            return mo72026d((C14154y) aVar);
        }
        throw new IllegalStateException(("Illegal callable: " + aVar).toString());
    }

    /* renamed from: d */
    public final String mo72026d(C14154y yVar) {
        C13706o.m87929f(yVar, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        C13788e0 e0Var = f62008a;
        e0Var.m88075b(sb, yVar);
        C14552c cVar = f62009b;
        C16157f name = yVar.getName();
        C13706o.m87928e(name, "descriptor.name");
        sb.append(cVar.mo73531v(name, true));
        List<C13966i1> g = yVar.mo72235g();
        C13706o.m87928e(g, "descriptor.valueParameters");
        Appendable unused = C13566b0.m87430e0(g, sb, ", ", "(", ")", 0, (CharSequence) null, C13790b.f62011a, 48, (Object) null);
        sb.append(": ");
        C14900e0 returnType = yVar.getReturnType();
        C13706o.m87926c(returnType);
        sb.append(e0Var.mo72030h(returnType));
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: e */
    public final String mo72027e(C14154y yVar) {
        C13706o.m87929f(yVar, "invoke");
        StringBuilder sb = new StringBuilder();
        C13788e0 e0Var = f62008a;
        e0Var.m88075b(sb, yVar);
        List<C13966i1> g = yVar.mo72235g();
        C13706o.m87928e(g, "invoke.valueParameters");
        Appendable unused = C13566b0.m87430e0(g, sb, ", ", "(", ")", 0, (CharSequence) null, C13791c.f62012a, 48, (Object) null);
        sb.append(" -> ");
        C14900e0 returnType = yVar.getReturnType();
        C13706o.m87926c(returnType);
        sb.append(e0Var.mo72030h(returnType));
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: f */
    public final String mo72028f(C15070p pVar) {
        C13706o.m87929f(pVar, "parameter");
        StringBuilder sb = new StringBuilder();
        int i = C13789a.f62010a[pVar.mo74344h().ordinal()];
        if (i == 1) {
            sb.append("extension receiver parameter");
        } else if (i == 2) {
            sb.append("instance parameter");
        } else if (i == 3) {
            sb.append("parameter #" + pVar.mo74348m() + ' ' + pVar.getName());
        }
        sb.append(" of ");
        sb.append(f62008a.m88076c(pVar.mo74346i().mo72037v()));
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: g */
    public final String mo72029g(C14140t0 t0Var) {
        C13706o.m87929f(t0Var, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(t0Var.mo72440N() ? "var " : "val ");
        C13788e0 e0Var = f62008a;
        e0Var.m88075b(sb, t0Var);
        C14552c cVar = f62009b;
        C16157f name = t0Var.getName();
        C13706o.m87928e(name, "descriptor.name");
        sb.append(cVar.mo73531v(name, true));
        sb.append(": ");
        C14900e0 type = t0Var.getType();
        C13706o.m87928e(type, "descriptor.type");
        sb.append(e0Var.mo72030h(type));
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: h */
    public final String mo72030h(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "type");
        return f62009b.mo73532w(e0Var);
    }
}
