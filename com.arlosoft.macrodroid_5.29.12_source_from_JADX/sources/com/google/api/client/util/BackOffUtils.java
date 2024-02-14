package com.google.api.client.util;

import java.io.IOException;

@Beta
public final class BackOffUtils {
    private BackOffUtils() {
    }

    /* renamed from: a */
    public static boolean m72633a(Sleeper sleeper, BackOff backOff) throws InterruptedException, IOException {
        long a = backOff.mo60663a();
        if (a == -1) {
            return false;
        }
        sleeper.mo60665a(a);
        return true;
    }
}
