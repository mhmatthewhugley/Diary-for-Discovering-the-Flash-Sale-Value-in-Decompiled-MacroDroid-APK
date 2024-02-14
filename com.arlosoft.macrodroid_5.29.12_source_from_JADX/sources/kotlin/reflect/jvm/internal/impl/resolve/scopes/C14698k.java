package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import p263fb.C12253b;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.k */
/* compiled from: ResolutionScope.kt */
public interface C14698k {

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.k$a */
    /* compiled from: ResolutionScope.kt */
    public static final class C14699a {
        /* renamed from: a */
        public static /* synthetic */ Collection m91887a(C14698k kVar, C14683d dVar, C16265l<C16157f, Boolean> lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    dVar = C14683d.f63699o;
                }
                if ((i & 2) != 0) {
                    lVar = C14692h.f63722a.mo73822a();
                }
                return kVar.mo72405g(dVar, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
        }
    }

    /* renamed from: e */
    C13961h mo72800e(C16157f fVar, C12253b bVar);

    /* renamed from: g */
    Collection<C14064m> mo72405g(C14683d dVar, C16265l<? super C16157f, Boolean> lVar);
}
