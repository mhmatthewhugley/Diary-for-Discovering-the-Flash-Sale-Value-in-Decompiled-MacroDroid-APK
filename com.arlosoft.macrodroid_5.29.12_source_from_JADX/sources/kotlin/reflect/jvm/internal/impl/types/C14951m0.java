package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13918e;
import kotlin.reflect.jvm.internal.impl.renderer.C14552c;
import p218bc.C11136k;
import p218bc.C11137l;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.m0 */
/* compiled from: KotlinType.kt */
public abstract class C14951m0 extends C14967q1 implements C11136k, C11137l {
    public C14951m0() {
        super((C13695i) null);
    }

    /* renamed from: U0 */
    public abstract C14951m0 mo73022U0(boolean z);

    /* renamed from: V0 */
    public abstract C14951m0 mo73023V0(C14830a1 a1Var);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (C13915c s : getAnnotations()) {
            StringBuilder unused = C15173s.m93619i(sb, "[", C14552c.m91136s(C14552c.f63486j, s, (C13918e) null, 2, (Object) null), "] ");
        }
        sb.append(mo73702N0());
        if (!mo73700L0().isEmpty()) {
            Appendable unused2 = C13566b0.m87430e0(mo73700L0(), sb, ", ", "<", ">", 0, (CharSequence) null, (C16265l) null, 112, (Object) null);
        }
        if (mo73021O0()) {
            sb.append("?");
        }
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
