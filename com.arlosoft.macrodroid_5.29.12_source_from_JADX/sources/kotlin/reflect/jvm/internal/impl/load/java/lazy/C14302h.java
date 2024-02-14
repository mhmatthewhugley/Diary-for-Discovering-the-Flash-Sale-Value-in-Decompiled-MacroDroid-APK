package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Map;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14297m;
import p272gc.C12338a;
import p288ib.C12512y;
import p288ib.C12513z;
import p370qa.C16265l;
import p442yb.C17005h;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.h */
/* compiled from: resolvers.kt */
public final class C14302h implements C14306k {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C14301g f63066a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C14064m f63067b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f63068c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map<C12512y, Integer> f63069d;

    /* renamed from: e */
    private final C17005h<C12512y, C14297m> f63070e;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.h$a */
    /* compiled from: resolvers.kt */
    static final class C14303a extends C13708q implements C16265l<C12512y, C14297m> {
        final /* synthetic */ C14302h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14303a(C14302h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* renamed from: a */
        public final C14297m invoke(C12512y yVar) {
            C13706o.m87929f(yVar, "typeParameter");
            Integer num = (Integer) this.this$0.f63069d.get(yVar);
            if (num == null) {
                return null;
            }
            C14302h hVar = this.this$0;
            return new C14297m(C14222a.m89815h(C14222a.m89809b(hVar.f63066a, hVar), hVar.f63067b.getAnnotations()), yVar, hVar.f63068c + num.intValue(), hVar.f63067b);
        }
    }

    public C14302h(C14301g gVar, C14064m mVar, C12513z zVar, int i) {
        C13706o.m87929f(gVar, "c");
        C13706o.m87929f(mVar, "containingDeclaration");
        C13706o.m87929f(zVar, "typeParameterOwner");
        this.f63066a = gVar;
        this.f63067b = mVar;
        this.f63068c = i;
        this.f63069d = C12338a.m83074d(zVar.getTypeParameters());
        this.f63070e = gVar.mo72918e().mo80217b(new C14303a(this));
    }

    /* renamed from: a */
    public C13950e1 mo72921a(C12512y yVar) {
        C13706o.m87929f(yVar, "javaTypeParameter");
        C14297m invoke = this.f63070e.invoke(yVar);
        return invoke != null ? invoke : this.f63066a.mo72919f().mo72921a(yVar);
    }
}
