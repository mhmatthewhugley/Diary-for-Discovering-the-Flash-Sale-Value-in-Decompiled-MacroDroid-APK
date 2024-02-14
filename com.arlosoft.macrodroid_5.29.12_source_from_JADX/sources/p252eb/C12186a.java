package p252eb;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import p263fb.C12252a;
import p263fb.C12253b;
import p263fb.C12254c;
import p263fb.C12257e;
import p263fb.C12259f;
import p362pb.C16157f;

/* renamed from: eb.a */
/* compiled from: utils.kt */
public final class C12186a {
    /* renamed from: a */
    public static final void m82847a(C12254c cVar, C12253b bVar, C13948e eVar, C16157f fVar) {
        C12252a location;
        C13706o.m87929f(cVar, "<this>");
        C13706o.m87929f(bVar, TypedValues.Transition.S_FROM);
        C13706o.m87929f(eVar, "scopeOwner");
        C13706o.m87929f(fVar, "name");
        if (cVar != C12254c.C12255a.f58865a && (location = bVar.getLocation()) != null) {
            C12257e position = cVar.mo68581a() ? location.getPosition() : C12257e.f58890a.mo68586a();
            String a = location.mo68578a();
            String b = C14650d.m91626m(eVar).mo78568b();
            C13706o.m87928e(b, "getFqName(scopeOwner).asString()");
            C12259f fVar2 = C12259f.CLASSIFIER;
            String d = fVar.mo78583d();
            C13706o.m87928e(d, "name.asString()");
            cVar.mo68582b(a, position, b, fVar2, d);
        }
    }

    /* renamed from: b */
    public static final void m82848b(C12254c cVar, C12253b bVar, C14050k0 k0Var, C16157f fVar) {
        C13706o.m87929f(cVar, "<this>");
        C13706o.m87929f(bVar, TypedValues.Transition.S_FROM);
        C13706o.m87929f(k0Var, "scopeOwner");
        C13706o.m87929f(fVar, "name");
        String b = k0Var.mo72551e().mo78556b();
        C13706o.m87928e(b, "scopeOwner.fqName.asString()");
        String d = fVar.mo78583d();
        C13706o.m87928e(d, "name.asString()");
        m82849c(cVar, bVar, b, d);
    }

    /* renamed from: c */
    public static final void m82849c(C12254c cVar, C12253b bVar, String str, String str2) {
        C12252a location;
        C13706o.m87929f(cVar, "<this>");
        C13706o.m87929f(bVar, TypedValues.Transition.S_FROM);
        C13706o.m87929f(str, "packageFqName");
        C13706o.m87929f(str2, "name");
        if (cVar != C12254c.C12255a.f58865a && (location = bVar.getLocation()) != null) {
            cVar.mo68582b(location.mo68578a(), cVar.mo68581a() ? location.getPosition() : C12257e.f58890a.mo68586a(), str, C12259f.PACKAGE, str2);
        }
    }
}
