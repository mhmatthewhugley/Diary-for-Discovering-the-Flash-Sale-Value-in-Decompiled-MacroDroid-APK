package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14147x;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import org.apache.commons.p353io.FilenameUtils;
import p297ja.C13328m;
import p297ja.C13337s;
import p362pb.C16151b;
import p362pb.C16157f;
import p450zb.C17087j;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.j */
/* compiled from: constantValues.kt */
public final class C14622j extends C14617g<C13328m<? extends C16151b, ? extends C16157f>> {

    /* renamed from: b */
    private final C16151b f63619b;

    /* renamed from: c */
    private final C16157f f63620c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14622j(C16151b bVar, C16157f fVar) {
        super(C13337s.m85692a(bVar, fVar));
        C13706o.m87929f(bVar, "enumClassId");
        C13706o.m87929f(fVar, "enumEntryName");
        this.f63619b = bVar;
        this.f63620c = fVar;
    }

    /* renamed from: a */
    public C14900e0 mo73715a(C13958g0 g0Var) {
        C13706o.m87929f(g0Var, "module");
        C13948e a = C14147x.m89564a(g0Var, this.f63619b);
        C14951m0 m0Var = null;
        if (a != null) {
            if (!C14650d.m91601A(a)) {
                a = null;
            }
            if (a != null) {
                m0Var = a.mo72274p();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        C17087j jVar = C17087j.ERROR_ENUM_TYPE;
        String bVar = this.f63619b.toString();
        C13706o.m87928e(bVar, "enumClassId.toString()");
        String fVar = this.f63620c.toString();
        C13706o.m87928e(fVar, "enumEntryName.toString()");
        return C17088k.m100540d(jVar, bVar, fVar);
    }

    /* renamed from: c */
    public final C16157f mo73735c() {
        return this.f63620c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f63619b.mo78552j());
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(this.f63620c);
        return sb.toString();
    }
}
