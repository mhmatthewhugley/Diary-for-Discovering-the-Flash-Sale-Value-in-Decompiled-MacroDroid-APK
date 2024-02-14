package com.google.android.gms.nearby.exposurenotification;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.nearby.zzsq;
import java.io.File;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class DiagnosisKeyFileProvider {

    /* renamed from: a */
    private int f47514a = 0;

    /* renamed from: b */
    private final List f47515b;

    public DiagnosisKeyFileProvider(@NonNull List<File> list) {
        this.f47515b = zzsq.m63013p(list);
    }

    @NonNull
    /* renamed from: a */
    public final File mo55767a() {
        int i = this.f47514a + 1;
        this.f47514a = i;
        return (File) this.f47515b.get(i - 1);
    }

    /* renamed from: b */
    public final boolean mo55768b() {
        return this.f47515b.size() > this.f47514a;
    }
}
