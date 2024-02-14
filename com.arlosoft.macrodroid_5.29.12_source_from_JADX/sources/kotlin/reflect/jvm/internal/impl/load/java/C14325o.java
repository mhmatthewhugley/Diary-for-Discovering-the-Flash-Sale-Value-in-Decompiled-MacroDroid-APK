package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p288ib.C12492g;
import p288ib.C12507u;
import p362pb.C16151b;
import p362pb.C16152c;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.o */
/* compiled from: JavaClassFinder.kt */
public interface C14325o {

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.o$a */
    /* compiled from: JavaClassFinder.kt */
    public static final class C14326a {
        /* renamed from: a */
        public static /* synthetic */ C12507u m90245a(C14325o oVar, C16152c cVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                return oVar.mo67425c(cVar, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findPackage");
        }
    }

    /* renamed from: a */
    C12492g mo67423a(C14327b bVar);

    /* renamed from: b */
    Set<String> mo67424b(C16152c cVar);

    /* renamed from: c */
    C12507u mo67425c(C16152c cVar, boolean z);

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.o$b */
    /* compiled from: JavaClassFinder.kt */
    public static final class C14327b {

        /* renamed from: a */
        private final C16151b f63103a;

        /* renamed from: b */
        private final byte[] f63104b;

        /* renamed from: c */
        private final C12492g f63105c;

        public C14327b(C16151b bVar, byte[] bArr, C12492g gVar) {
            C13706o.m87929f(bVar, "classId");
            this.f63103a = bVar;
            this.f63104b = bArr;
            this.f63105c = gVar;
        }

        /* renamed from: a */
        public final C16151b mo72967a() {
            return this.f63103a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14327b)) {
                return false;
            }
            C14327b bVar = (C14327b) obj;
            return C13706o.m87924a(this.f63103a, bVar.f63103a) && C13706o.m87924a(this.f63104b, bVar.f63104b) && C13706o.m87924a(this.f63105c, bVar.f63105c);
        }

        public int hashCode() {
            int hashCode = this.f63103a.hashCode() * 31;
            byte[] bArr = this.f63104b;
            int i = 0;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            C12492g gVar = this.f63105c;
            if (gVar != null) {
                i = gVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "Request(classId=" + this.f63103a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f63104b) + ", outerClass=" + this.f63105c + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C14327b(C16151b bVar, byte[] bArr, C12492g gVar, int i, C13695i iVar) {
            this(bVar, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? null : gVar);
        }
    }
}
