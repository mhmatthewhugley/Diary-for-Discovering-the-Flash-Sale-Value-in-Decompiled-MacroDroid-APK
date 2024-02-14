package com.google.firebase.tracing;

import android.os.Trace;

public final class FirebaseTrace {
    private FirebaseTrace() {
    }

    /* renamed from: a */
    public static void m77682a() {
        Trace.endSection();
    }

    /* renamed from: b */
    public static void m77683b(String str) {
        Trace.beginSection(str);
    }
}
