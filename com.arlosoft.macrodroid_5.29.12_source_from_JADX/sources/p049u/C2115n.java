package p049u;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p012b0.C1397a;

/* renamed from: u.n */
/* compiled from: BaseAnimatableValue */
abstract class C2115n<V, O> implements C2114m<V, O> {

    /* renamed from: a */
    final List<C1397a<V>> f6539a;

    C2115n(V v) {
        this(Collections.singletonList(new C1397a(v)));
    }

    /* renamed from: b */
    public List<C1397a<V>> mo24229b() {
        return this.f6539a;
    }

    /* renamed from: h */
    public boolean mo24230h() {
        return this.f6539a.isEmpty() || (this.f6539a.size() == 1 && this.f6539a.get(0).mo16815h());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f6539a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f6539a.toArray()));
        }
        return sb.toString();
    }

    C2115n(List<C1397a<V>> list) {
        this.f6539a = list;
    }
}
