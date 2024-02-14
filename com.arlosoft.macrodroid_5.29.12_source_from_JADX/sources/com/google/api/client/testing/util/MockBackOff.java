package com.google.api.client.testing.util;

import com.google.api.client.util.BackOff;
import com.google.api.client.util.Beta;
import java.io.IOException;

@Beta
public class MockBackOff implements BackOff {

    /* renamed from: a */
    private long f52718a;

    /* renamed from: b */
    private int f52719b = 10;

    /* renamed from: c */
    private int f52720c;

    /* renamed from: a */
    public long mo60663a() throws IOException {
        int i = this.f52720c;
        if (i < this.f52719b) {
            long j = this.f52718a;
            if (j != -1) {
                this.f52720c = i + 1;
                return j;
            }
        }
        return -1;
    }

    public void reset() throws IOException {
        this.f52720c = 0;
    }
}
