package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.3 */
abstract class zzs {
    zzs() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract zzs mo59980a(@SplitInstallErrorCode int i);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract zzs mo59981b(Map map);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract zzt mo59982c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract Map mo59983d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final zzt mo59998e() {
        mo59981b(Collections.unmodifiableMap(mo59983d()));
        return mo59982c();
    }
}
