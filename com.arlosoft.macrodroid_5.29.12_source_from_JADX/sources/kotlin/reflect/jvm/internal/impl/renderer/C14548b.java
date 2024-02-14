package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import org.apache.commons.p353io.FilenameUtils;
import p362pb.C16153d;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.renderer.b */
/* compiled from: ClassifierNamePolicy.kt */
public interface C14548b {

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.b$a */
    /* compiled from: ClassifierNamePolicy.kt */
    public static final class C14549a implements C14548b {

        /* renamed from: a */
        public static final C14549a f63474a = new C14549a();

        private C14549a() {
        }

        /* renamed from: a */
        public String mo73526a(C13961h hVar, C14552c cVar) {
            C13706o.m87929f(hVar, "classifier");
            C13706o.m87929f(cVar, "renderer");
            if (hVar instanceof C13950e1) {
                C16157f name = ((C13950e1) hVar).getName();
                C13706o.m87928e(name, "classifier.name");
                return cVar.mo73531v(name, false);
            }
            C16153d m = C14650d.m91626m(hVar);
            C13706o.m87928e(m, "getFqName(classifier)");
            return cVar.mo73530u(m);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.b$b */
    /* compiled from: ClassifierNamePolicy.kt */
    public static final class C14550b implements C14548b {

        /* renamed from: a */
        public static final C14550b f63475a = new C14550b();

        private C14550b() {
        }

        /* renamed from: a */
        public String mo73526a(C13961h hVar, C14552c cVar) {
            boolean z;
            C13706o.m87929f(hVar, "classifier");
            C13706o.m87929f(cVar, "renderer");
            if (hVar instanceof C13950e1) {
                C16157f name = ((C13950e1) hVar).getName();
                C13706o.m87928e(name, "classifier.name");
                return cVar.mo73531v(name, false);
            }
            ArrayList arrayList = new ArrayList();
            C14064m mVar = hVar;
            do {
                arrayList.add(mVar.getName());
                C14064m b = mVar.mo62163b();
                z = b instanceof C13948e;
                mVar = b;
            } while (z);
            return C14594n.m91451c(C13626z.m87803H(arrayList));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.b$c */
    /* compiled from: ClassifierNamePolicy.kt */
    public static final class C14551c implements C14548b {

        /* renamed from: a */
        public static final C14551c f63476a = new C14551c();

        private C14551c() {
        }

        /* renamed from: b */
        private final String m91133b(C13961h hVar) {
            C16157f name = hVar.getName();
            C13706o.m87928e(name, "descriptor.name");
            String b = C14594n.m91450b(name);
            if (hVar instanceof C13950e1) {
                return b;
            }
            C14064m b2 = hVar.mo62163b();
            C13706o.m87928e(b2, "descriptor.containingDeclaration");
            String c = m91134c(b2);
            if (c == null || C13706o.m87924a(c, "")) {
                return b;
            }
            return c + FilenameUtils.EXTENSION_SEPARATOR + b;
        }

        /* renamed from: c */
        private final String m91134c(C14064m mVar) {
            if (mVar instanceof C13948e) {
                return m91133b((C13961h) mVar);
            }
            if (!(mVar instanceof C14050k0)) {
                return null;
            }
            C16153d j = ((C14050k0) mVar).mo72551e().mo78566j();
            C13706o.m87928e(j, "descriptor.fqName.toUnsafe()");
            return C14594n.m91449a(j);
        }

        /* renamed from: a */
        public String mo73526a(C13961h hVar, C14552c cVar) {
            C13706o.m87929f(hVar, "classifier");
            C13706o.m87929f(cVar, "renderer");
            return m91133b(hVar);
        }
    }

    /* renamed from: a */
    String mo73526a(C13961h hVar, C14552c cVar);
}
