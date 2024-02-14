package com.google.android.gms.internal.nearby;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzta implements Appendable {

    /* renamed from: a */
    int f45123a = 2;

    /* renamed from: c */
    final /* synthetic */ Appendable f45124c;

    /* renamed from: d */
    final /* synthetic */ String f45125d = ":";

    zzta(int i, Appendable appendable, String str) {
        this.f45124c = appendable;
    }

    public final Appendable append(char c) throws IOException {
        if (this.f45123a == 0) {
            this.f45124c.append(this.f45125d);
            this.f45123a = 2;
        }
        this.f45124c.append(c);
        this.f45123a--;
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    public final Appendable append(CharSequence charSequence, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
