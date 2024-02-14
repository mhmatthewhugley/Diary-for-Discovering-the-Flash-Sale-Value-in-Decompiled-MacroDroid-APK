package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Map;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
@Immutable
public final class ImmutableClassToInstanceMap<B> extends ForwardingMap<Class<? extends B>, B> implements ClassToInstanceMap<B>, Serializable {

    /* renamed from: a */
    private static final ImmutableClassToInstanceMap<Object> f16640a = new ImmutableClassToInstanceMap<>(ImmutableMap.m27352m());
    private final ImmutableMap<Class<? extends B>, B> delegate;

    public static final class Builder<B> {

        /* renamed from: a */
        private final ImmutableMap.Builder<Class<? extends B>, B> f16641a = ImmutableMap.m27348a();
    }

    private ImmutableClassToInstanceMap(ImmutableMap<Class<? extends B>, B> immutableMap) {
        this.delegate = immutableMap;
    }

    /* renamed from: V */
    public static <B> ImmutableClassToInstanceMap<B> m27276V() {
        return f16640a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public Map<Class<? extends B>, B> mo22325Q() {
        return this.delegate;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return isEmpty() ? m27276V() : this;
    }
}
