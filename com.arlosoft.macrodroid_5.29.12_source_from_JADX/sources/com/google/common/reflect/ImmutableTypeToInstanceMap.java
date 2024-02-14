package com.google.common.reflect;

import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.util.Map;

@ElementTypesAreNonnullByDefault
public final class ImmutableTypeToInstanceMap<B> extends ForwardingMap<TypeToken<? extends B>, B> implements TypeToInstanceMap<B> {

    /* renamed from: a */
    private final ImmutableMap<TypeToken<? extends B>, B> f53276a;

    public static final class Builder<B> {

        /* renamed from: a */
        private final ImmutableMap.Builder<TypeToken<? extends B>, B> f53277a = ImmutableMap.m27348a();

        private Builder() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public Map<TypeToken<? extends B>, B> mo22325Q() {
        return this.f53276a;
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    /* renamed from: V */
    public B put(TypeToken<? extends B> typeToken, B b) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall
    @Deprecated
    public void putAll(Map<? extends TypeToken<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException();
    }
}
