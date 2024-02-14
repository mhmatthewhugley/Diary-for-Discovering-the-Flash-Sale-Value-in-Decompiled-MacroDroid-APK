package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p218bc.C11136k;
import p297ja.C13328m;
import p297ja.C13337s;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.g1 */
/* compiled from: ValueClassRepresentation.kt */
public abstract class C13960g1<Type extends C11136k> {
    private C13960g1() {
    }

    public /* synthetic */ C13960g1(C13695i iVar) {
        this();
    }

    /* renamed from: a */
    public abstract List<C13328m<C16157f, Type>> mo72299a();

    /* renamed from: b */
    public final <Other extends C11136k> C13960g1<Other> mo72300b(C16265l<? super Type, ? extends Other> lVar) {
        C13706o.m87929f(lVar, "transform");
        if (this instanceof C14157z) {
            C14157z zVar = (C14157z) this;
            return new C14157z(zVar.mo72668c(), (C11136k) lVar.invoke(zVar.mo72669d()));
        } else if (this instanceof C13962h0) {
            List<C13328m> a = mo72299a();
            ArrayList arrayList = new ArrayList(C13616u.m87774u(a, 10));
            for (C13328m mVar : a) {
                arrayList.add(C13337s.m85692a((C16157f) mVar.mo70152a(), lVar.invoke((C11136k) mVar.mo70153b())));
            }
            return new C13962h0(arrayList);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
