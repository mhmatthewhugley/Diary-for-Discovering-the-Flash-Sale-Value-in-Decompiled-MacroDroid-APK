package com.google.common.graph;

import com.google.common.annotations.Beta;
import java.util.Set;

@Beta
@ElementTypesAreNonnullByDefault
public abstract class AbstractGraph<N> extends AbstractBaseGraph<N> implements Graph<N> {
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Iterable mo36813a(Object obj) {
        return mo36813a(obj);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ Set mo36814b() {
        return super.mo36814b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Graph)) {
            return false;
        }
        Graph graph = (Graph) obj;
        if (mo36841d() != graph.mo36841d() || !mo36843f().equals(graph.mo36843f()) || !mo36814b().equals(graph.mo36814b())) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public /* bridge */ /* synthetic */ int mo36815g(Object obj) {
        return super.mo36815g(obj);
    }

    public final int hashCode() {
        return mo36814b().hashCode();
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ int mo36816i(Object obj) {
        return super.mo36816i(obj);
    }

    /* renamed from: j */
    public /* bridge */ /* synthetic */ int mo36817j(Object obj) {
        return super.mo36817j(obj);
    }

    /* renamed from: k */
    public /* bridge */ /* synthetic */ Set mo36818k(Object obj) {
        return super.mo36818k(obj);
    }

    public String toString() {
        boolean d = mo36841d();
        boolean e = mo36842e();
        String valueOf = String.valueOf(mo36843f());
        String valueOf2 = String.valueOf(mo36814b());
        StringBuilder sb = new StringBuilder(valueOf.length() + 59 + valueOf2.length());
        sb.append("isDirected: ");
        sb.append(d);
        sb.append(", allowsSelfLoops: ");
        sb.append(e);
        sb.append(", nodes: ");
        sb.append(valueOf);
        sb.append(", edges: ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
