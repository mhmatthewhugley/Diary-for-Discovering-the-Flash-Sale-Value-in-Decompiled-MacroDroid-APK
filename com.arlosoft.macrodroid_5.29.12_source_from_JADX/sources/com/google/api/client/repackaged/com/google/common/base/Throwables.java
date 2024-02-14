package com.google.api.client.repackaged.com.google.common.base;

public final class Throwables {
    private Throwables() {
    }

    /* renamed from: a */
    public static RuntimeException m72515a(Throwable th) {
        m72517c((Throwable) Preconditions.m72472e(th));
        throw new RuntimeException(th);
    }

    /* renamed from: b */
    public static <X extends Throwable> void m72516b(Throwable th, Class<X> cls) throws Throwable {
        if (th != null && cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    /* renamed from: c */
    public static void m72517c(Throwable th) {
        m72516b(th, Error.class);
        m72516b(th, RuntimeException.class);
    }
}
