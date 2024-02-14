package com.google.android.play.core.internal;

import androidx.annotation.GuardedBy;
import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzaf {
    @GuardedBy("this")

    /* renamed from: a */
    protected final Set f51658a = new HashSet();

    /* renamed from: a */
    public final synchronized void mo59804a(Object obj) {
        for (StateUpdatedListener a : this.f51658a) {
            a.mo59589a(obj);
        }
    }
}
