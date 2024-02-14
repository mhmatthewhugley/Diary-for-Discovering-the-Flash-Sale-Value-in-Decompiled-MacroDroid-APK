package com.google.api.client.util;

import java.io.IOException;

public class ExponentialBackOff implements BackOff {

    /* renamed from: a */
    private int f52784a;

    /* renamed from: b */
    private final int f52785b;

    /* renamed from: c */
    private final double f52786c;

    /* renamed from: d */
    private final double f52787d;

    /* renamed from: e */
    private final int f52788e;

    /* renamed from: f */
    long f52789f;

    /* renamed from: g */
    private final int f52790g;

    /* renamed from: h */
    private final NanoClock f52791h;

    public static class Builder {

        /* renamed from: a */
        int f52792a = 500;

        /* renamed from: b */
        double f52793b = 0.5d;

        /* renamed from: c */
        double f52794c = 1.5d;

        /* renamed from: d */
        int f52795d = 60000;

        /* renamed from: e */
        int f52796e = 900000;

        /* renamed from: f */
        NanoClock f52797f = NanoClock.f52824a;

        /* renamed from: a */
        public ExponentialBackOff mo60741a() {
            return new ExponentialBackOff(this);
        }
    }

    public ExponentialBackOff() {
        this(new Builder());
    }

    /* renamed from: c */
    static int m72669c(double d, double d2, int i) {
        double d3 = (double) i;
        double d4 = d * d3;
        double d5 = d3 - d4;
        return (int) (d5 + (d2 * (((d3 + d4) - d5) + 1.0d)));
    }

    /* renamed from: d */
    private void m72670d() {
        int i = this.f52784a;
        int i2 = this.f52788e;
        double d = this.f52787d;
        if (((double) i) >= ((double) i2) / d) {
            this.f52784a = i2;
        } else {
            this.f52784a = (int) (((double) i) * d);
        }
    }

    /* renamed from: a */
    public long mo60663a() throws IOException {
        if (mo60740b() > ((long) this.f52790g)) {
            return -1;
        }
        int c = m72669c(this.f52786c, Math.random(), this.f52784a);
        m72670d();
        return (long) c;
    }

    /* renamed from: b */
    public final long mo60740b() {
        return (this.f52791h.mo60777b() - this.f52789f) / 1000000;
    }

    public final void reset() {
        this.f52784a = this.f52785b;
        this.f52789f = this.f52791h.mo60777b();
    }

    protected ExponentialBackOff(Builder builder) {
        int i = builder.f52792a;
        this.f52785b = i;
        double d = builder.f52793b;
        this.f52786c = d;
        double d2 = builder.f52794c;
        this.f52787d = d2;
        int i2 = builder.f52795d;
        this.f52788e = i2;
        int i3 = builder.f52796e;
        this.f52790g = i3;
        this.f52791h = builder.f52797f;
        boolean z = true;
        Preconditions.m72713a(i > 0);
        Preconditions.m72713a(0.0d <= d && d < 1.0d);
        Preconditions.m72713a(d2 >= 1.0d);
        Preconditions.m72713a(i2 >= i);
        Preconditions.m72713a(i3 <= 0 ? false : z);
        reset();
    }
}
