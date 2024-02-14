package com.google.api.client.http;

import com.google.api.client.util.Beta;
import com.google.api.client.util.ExponentialBackOff;
import java.io.IOException;

@Beta
@Deprecated
public class ExponentialBackOffPolicy implements BackOffPolicy {

    /* renamed from: a */
    private final ExponentialBackOff f52404a;

    @Beta
    @Deprecated
    public static class Builder {

        /* renamed from: a */
        final ExponentialBackOff.Builder f52405a = new ExponentialBackOff.Builder();

        protected Builder() {
        }
    }

    public ExponentialBackOffPolicy() {
        this(new Builder());
    }

    /* renamed from: a */
    public long mo60348a() throws IOException {
        return this.f52404a.mo60663a();
    }

    /* renamed from: b */
    public boolean mo60349b(int i) {
        return i == 500 || i == 503;
    }

    public final void reset() {
        this.f52404a.reset();
    }

    protected ExponentialBackOffPolicy(Builder builder) {
        this.f52404a = builder.f52405a.mo60741a();
    }
}
