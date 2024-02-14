package p397ta;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p433xa.C16887m;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\u00020\u000b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000f\u001a\u00028\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0012\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo71668d2 = {"Lta/b;", "V", "Lta/d;", "", "Lxa/m;", "property", "oldValue", "newValue", "", "d", "(Lxa/m;Ljava/lang/Object;Ljava/lang/Object;)Z", "Lja/u;", "c", "(Lxa/m;Ljava/lang/Object;Ljava/lang/Object;)V", "thisRef", "a", "(Ljava/lang/Object;Lxa/m;)Ljava/lang/Object;", "value", "b", "(Ljava/lang/Object;Lxa/m;Ljava/lang/Object;)V", "initialValue", "<init>", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: ta.b */
/* compiled from: ObservableProperty.kt */
public abstract class C16603b<V> implements C16605d<Object, V> {

    /* renamed from: a */
    private V f67430a;

    public C16603b(V v) {
        this.f67430a = v;
    }

    /* renamed from: a */
    public V mo32407a(Object obj, C16887m<?> mVar) {
        C13706o.m87929f(mVar, "property");
        return this.f67430a;
    }

    /* renamed from: b */
    public void mo79447b(Object obj, C16887m<?> mVar, V v) {
        C13706o.m87929f(mVar, "property");
        V v2 = this.f67430a;
        if (mo73686d(mVar, v2, v)) {
            this.f67430a = v;
            mo79448c(mVar, v2, v);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo79448c(C16887m<?> mVar, V v, V v2) {
        C13706o.m87929f(mVar, "property");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo73686d(C16887m<?> mVar, V v, V v2) {
        C13706o.m87929f(mVar, "property");
        return true;
    }
}
