package kotlin.jvm.internal;

import p433xa.C16874c;
import p433xa.C16880i;
import p433xa.C16885l;

/* renamed from: kotlin.jvm.internal.r */
/* compiled from: MutablePropertyReference1 */
public abstract class C13709r extends C13711t implements C16880i {
    public C13709r() {
    }

    /* access modifiers changed from: protected */
    public C16874c computeReflected() {
        return C13687e0.m87871e(this);
    }

    /* renamed from: f */
    public C16885l.C16886a mo71963f() {
        return ((C16880i) getReflected()).mo71963f();
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public C13709r(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
