package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p218bc.C11136k;
import p297ja.C13328m;
import p297ja.C13337s;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z */
/* compiled from: InlineClassRepresentation.kt */
public final class C14157z<Type extends C11136k> extends C13960g1<Type> {

    /* renamed from: a */
    private final C16157f f62776a;

    /* renamed from: b */
    private final Type f62777b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14157z(C16157f fVar, Type type) {
        super((C13695i) null);
        C13706o.m87929f(fVar, "underlyingPropertyName");
        C13706o.m87929f(type, "underlyingType");
        this.f62776a = fVar;
        this.f62777b = type;
    }

    /* renamed from: a */
    public List<C13328m<C16157f, Type>> mo72299a() {
        return C13612s.m87736e(C13337s.m85692a(this.f62776a, this.f62777b));
    }

    /* renamed from: c */
    public final C16157f mo72668c() {
        return this.f62776a;
    }

    /* renamed from: d */
    public final Type mo72669d() {
        return this.f62777b;
    }
}
