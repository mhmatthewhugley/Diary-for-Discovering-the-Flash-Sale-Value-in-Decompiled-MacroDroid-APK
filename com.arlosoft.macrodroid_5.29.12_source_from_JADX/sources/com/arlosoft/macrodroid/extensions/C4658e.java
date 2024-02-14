package com.arlosoft.macrodroid.extensions;

import kotlin.jvm.internal.C13706o;
import p352oe.C15858d;
import p352oe.C15861e;
import p352oe.C15864f;
import p352oe.C15890p;

/* renamed from: com.arlosoft.macrodroid.extensions.e */
/* compiled from: LongExtensions.kt */
public final class C4658e {
    /* renamed from: a */
    public static final long m18118a(long j) {
        return j * ((long) 86400000);
    }

    /* renamed from: b */
    public static final C15861e m18119b(long j) {
        C15861e u0 = C15864f.m95602e0(C15858d.m95506E(j), C15890p.m95826w()).mo75726L();
        C13706o.m87928e(u0, "ofInstant(Instant.ofEpoc…mDefault()).toLocalDate()");
        return u0;
    }

    /* renamed from: c */
    public static final C15864f m18120c(long j) {
        C15864f e0 = C15864f.m95602e0(C15858d.m95506E(j), C15890p.m95826w());
        C13706o.m87928e(e0, "ofInstant(Instant.ofEpoc…, ZoneId.systemDefault())");
        return e0;
    }
}
