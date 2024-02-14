package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.lang.Thread;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class UncaughtExceptionHandlers {

    @VisibleForTesting
    static final class Exiter implements Thread.UncaughtExceptionHandler {

        /* renamed from: c */
        private static final Logger f53705c = Logger.getLogger(Exiter.class.getName());

        /* renamed from: a */
        private final Runtime f53706a;

        public void uncaughtException(Thread thread, Throwable th) {
            try {
                f53705c.log(Level.SEVERE, String.format(Locale.ROOT, "Caught an exception in %s.  Shutting down.", new Object[]{thread}), th);
            } catch (Throwable th2) {
                this.f53706a.exit(1);
                throw th2;
            }
            this.f53706a.exit(1);
        }
    }

    private UncaughtExceptionHandlers() {
    }
}
