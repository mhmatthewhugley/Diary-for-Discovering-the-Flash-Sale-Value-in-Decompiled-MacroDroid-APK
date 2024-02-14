package com.google.api.client.auth.openidconnect;

import com.google.api.client.util.Beta;
import com.google.api.client.util.Clock;
import java.util.Collection;
import java.util.Collections;

@Beta
public class IdTokenVerifier {

    /* renamed from: a */
    private final Clock f52211a;

    /* renamed from: b */
    private final long f52212b;

    /* renamed from: c */
    private final Collection<String> f52213c;

    /* renamed from: d */
    private final Collection<String> f52214d;

    @Beta
    public static class Builder {

        /* renamed from: a */
        Clock f52215a = Clock.f52755a;

        /* renamed from: b */
        long f52216b = 300;

        /* renamed from: c */
        Collection<String> f52217c;

        /* renamed from: d */
        Collection<String> f52218d;
    }

    public IdTokenVerifier() {
        this(new Builder());
    }

    protected IdTokenVerifier(Builder builder) {
        this.f52211a = builder.f52215a;
        this.f52212b = builder.f52216b;
        Collection<String> collection = builder.f52217c;
        Collection<String> collection2 = null;
        this.f52213c = collection == null ? null : Collections.unmodifiableCollection(collection);
        Collection<String> collection3 = builder.f52218d;
        this.f52214d = collection3 != null ? Collections.unmodifiableCollection(collection3) : collection2;
    }
}
