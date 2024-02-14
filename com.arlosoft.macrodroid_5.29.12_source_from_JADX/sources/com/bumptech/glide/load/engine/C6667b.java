package com.bumptech.glide.load.engine;

/* renamed from: com.bumptech.glide.load.engine.b */
/* compiled from: CallbackException */
final class C6667b extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    C6667b(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
