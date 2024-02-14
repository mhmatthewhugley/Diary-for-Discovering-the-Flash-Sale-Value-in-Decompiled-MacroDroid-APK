package com.google.android.datatransport.runtime.time;

import android.os.SystemClock;

public class UptimeClock implements Clock {
    /* renamed from: a */
    public long mo19627a() {
        return SystemClock.elapsedRealtime();
    }
}
