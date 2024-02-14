package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;

class CreationContextFactory {

    /* renamed from: a */
    private final Context f1394a;

    /* renamed from: b */
    private final Clock f1395b;

    /* renamed from: c */
    private final Clock f1396c;

    CreationContextFactory(Context context, @WallTime Clock clock, @Monotonic Clock clock2) {
        this.f1394a = context;
        this.f1395b = clock;
        this.f1396c = clock2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public CreationContext mo19489a(String str) {
        return CreationContext.m1307a(this.f1394a, this.f1395b, this.f1396c, str);
    }
}
