package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p218bc.C11136k;
import p297ja.C13328m;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h0 */
/* compiled from: MultiFieldValueClassRepresentation.kt */
public final class C13962h0<Type extends C11136k> extends C13960g1<Type> {

    /* renamed from: a */
    private final List<C13328m<C16157f, Type>> f62433a;

    /* renamed from: b */
    private final Map<C16157f, Type> f62434b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13962h0(List<? extends C13328m<C16157f, ? extends Type>> list) {
        super((C13695i) null);
        C13706o.m87929f(list, "underlyingPropertyNamesToTypes");
        this.f62433a = list;
        Map<C16157f, Type> r = C13615t0.m87768r(mo72299a());
        if (r.size() == mo72299a().size()) {
            this.f62434b = r;
            return;
        }
        throw new IllegalArgumentException("Some properties have the same names".toString());
    }

    /* renamed from: a */
    public List<C13328m<C16157f, Type>> mo72299a() {
        return this.f62433a;
    }
}
