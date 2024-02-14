package com.google.mlkit.p229nl.translate.internal;

import androidx.annotation.Nullable;
import java.io.File;

/* renamed from: com.google.mlkit.nl.translate.internal.zzp */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzp {
    @Nullable

    /* renamed from: a */
    String f56533a;
    @Nullable

    /* renamed from: b */
    String f56534b;
    @Nullable

    /* renamed from: c */
    String f56535c;

    /* renamed from: d */
    final /* synthetic */ TranslateJni f56536d;

    /* synthetic */ zzp(TranslateJni translateJni, zzo zzo) {
        this.f56536d = translateJni;
    }

    @Nullable
    /* renamed from: b */
    private static final String m79235b(File file) {
        if (!file.exists()) {
            return null;
        }
        return file.getPath();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo64688a(String str, String str2, String str3) {
        this.f56536d.f56441d.mo64660a(str2, str3);
        File file = new File(str, zzaf.m79192d(str2, str3));
        File file2 = new File(str, zzaf.m79191c(str2, str3));
        File file3 = new File(str, zzaf.m79193e(str2, str3));
        this.f56533a = m79235b(file);
        this.f56534b = m79235b(file2);
        this.f56535c = m79235b(file3);
    }
}
