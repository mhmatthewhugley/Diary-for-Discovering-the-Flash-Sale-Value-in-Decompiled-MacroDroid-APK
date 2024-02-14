package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zzv implements Iterable {

    /* renamed from: a */
    final /* synthetic */ CharSequence f39303a;

    /* renamed from: c */
    final /* synthetic */ zzx f39304c;

    public final Iterator iterator() {
        return this.f39304c.m55930d(this.f39303a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(zzq.m55916a(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append(", ");
                    sb.append(zzq.m55916a(it.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
