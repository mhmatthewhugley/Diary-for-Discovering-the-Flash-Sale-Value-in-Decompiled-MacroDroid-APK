package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Supplier;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public class HashBasedTable<R, C, V> extends StandardTable<R, C, V> {
    private static final long serialVersionUID = 0;

    private static class Factory<C, V> implements Supplier<Map<C, V>>, Serializable {
        private static final long serialVersionUID = 0;
        final int expectedSize;

        /* renamed from: a */
        public Map<C, V> get() {
            return Maps.m28061D(this.expectedSize);
        }
    }

    /* renamed from: B */
    public /* bridge */ /* synthetic */ Map mo35268B(Object obj) {
        return super.mo35268B(obj);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo34713b(Object obj, Object obj2) {
        return super.mo34713b(obj, obj2);
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ Object mo34718e(Object obj, Object obj2) {
        return super.mo34718e(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: j */
    public /* bridge */ /* synthetic */ Map mo34741j() {
        return super.mo34741j();
    }

    /* renamed from: l */
    public /* bridge */ /* synthetic */ Map mo34742l() {
        return super.mo34742l();
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ Set mo34723m() {
        return super.mo34723m();
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ Map mo35269n(Object obj) {
        return super.mo35269n(obj);
    }

    /* renamed from: p */
    public /* bridge */ /* synthetic */ Set mo35270p() {
        return super.mo35270p();
    }

    /* renamed from: q */
    public /* bridge */ /* synthetic */ boolean mo35271q(Object obj) {
        return super.mo35271q(obj);
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    /* renamed from: t */
    public /* bridge */ /* synthetic */ boolean mo35272t(Object obj) {
        return super.mo35272t(obj);
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    @CanIgnoreReturnValue
    /* renamed from: x */
    public /* bridge */ /* synthetic */ Object mo35273x(Object obj, Object obj2, Object obj3) {
        return super.mo35273x(obj, obj2, obj3);
    }

    @CanIgnoreReturnValue
    /* renamed from: y */
    public /* bridge */ /* synthetic */ Object mo35274y(Object obj, Object obj2) {
        return super.mo35274y(obj, obj2);
    }
}
