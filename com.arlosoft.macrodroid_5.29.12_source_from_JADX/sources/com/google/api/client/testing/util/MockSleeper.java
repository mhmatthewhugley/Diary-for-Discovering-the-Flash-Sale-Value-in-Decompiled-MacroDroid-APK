package com.google.api.client.testing.util;

import com.google.api.client.util.Beta;
import com.google.api.client.util.Sleeper;

@Beta
public class MockSleeper implements Sleeper {

    /* renamed from: b */
    private int f52721b;

    /* renamed from: c */
    private long f52722c;

    /* renamed from: a */
    public void mo60665a(long j) throws InterruptedException {
        this.f52721b++;
        this.f52722c = j;
    }
}
