package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzfth implements Iterable {

    /* renamed from: a */
    final /* synthetic */ CharSequence f36355a;

    /* renamed from: c */
    final /* synthetic */ zzftk f36356c;

    zzfth(zzftk zzftk, CharSequence charSequence) {
        this.f36356c = zzftk;
        this.f36355a = charSequence;
    }

    public final Iterator iterator() {
        return this.f36356c.m50966g(this.f36355a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(zzfsn.m50926a(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append(", ");
                    sb.append(zzfsn.m50926a(it.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
