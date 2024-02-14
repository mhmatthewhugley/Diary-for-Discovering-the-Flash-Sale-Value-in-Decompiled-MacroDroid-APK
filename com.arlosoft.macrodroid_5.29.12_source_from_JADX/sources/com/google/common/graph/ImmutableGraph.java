package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.Immutable;
import java.util.Set;

@ElementTypesAreNonnullByDefault
@Immutable
@Beta
public class ImmutableGraph<N> extends ForwardingGraph<N> {

    /* renamed from: a */
    private final BaseGraph<N> f17445a;

    public static class Builder<N> {
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Set mo36813a(Object obj) {
        return super.mo36813a(obj);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ Set mo36840c(Object obj) {
        return super.mo36840c(obj);
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ boolean mo36841d() {
        return super.mo36841d();
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ boolean mo36842e() {
        return super.mo36842e();
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ Set mo36843f() {
        return super.mo36843f();
    }

    /* renamed from: g */
    public /* bridge */ /* synthetic */ int mo36815g(Object obj) {
        return super.mo36815g(obj);
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ Set mo36844h(Object obj) {
        return super.mo36844h(obj);
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

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public BaseGraph<N> mo36903q() {
        return this.f17445a;
    }
}
