package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.errorprone.annotations.DoNotMock;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@DoNotMock
public abstract class Escaper {

    /* renamed from: a */
    private final Function<String, String> f17348a = new C7151a(this);

    protected Escaper() {
    }

    /* renamed from: a */
    public abstract String mo36786a(String str);
}
