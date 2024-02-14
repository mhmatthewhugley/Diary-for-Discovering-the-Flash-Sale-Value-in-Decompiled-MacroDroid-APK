package com.google.api.client.util;

public final class Joiner {

    /* renamed from: a */
    private final com.google.api.client.repackaged.com.google.common.base.Joiner f52812a;

    private Joiner(com.google.api.client.repackaged.com.google.common.base.Joiner joiner) {
        this.f52812a = joiner;
    }

    /* renamed from: b */
    public static Joiner m72699b(char c) {
        return new Joiner(com.google.api.client.repackaged.com.google.common.base.Joiner.m72454g(c));
    }

    /* renamed from: a */
    public final String mo60765a(Iterable<?> iterable) {
        return this.f52812a.mo60604e(iterable);
    }
}
