package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.types.C14889d1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14846f;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.a */
/* compiled from: ClassicTypeCheckerState.kt */
public final class C14838a {
    /* renamed from: a */
    public static final C14889d1 m92432a(boolean z, boolean z2, C14839b bVar, C14846f fVar, C14849g gVar) {
        C13706o.m87929f(bVar, "typeSystemContext");
        C13706o.m87929f(fVar, "kotlinTypePreparator");
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        return new C14889d1(z, z2, true, bVar, fVar, gVar);
    }

    /* renamed from: b */
    public static /* synthetic */ C14889d1 m92433b(boolean z, boolean z2, C14839b bVar, C14846f fVar, C14849g gVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            bVar = C14865q.f63991a;
        }
        if ((i & 8) != 0) {
            fVar = C14846f.C14847a.f63968a;
        }
        if ((i & 16) != 0) {
            gVar = C14849g.C14850a.f63969a;
        }
        return m92432a(z, z2, bVar, fVar, gVar);
    }
}
