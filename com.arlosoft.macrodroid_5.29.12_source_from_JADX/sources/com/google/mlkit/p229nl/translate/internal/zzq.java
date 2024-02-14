package com.google.mlkit.p229nl.translate.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.mlkit_translate.zzv;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.LegacyModelMigrator;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import java.io.File;

/* renamed from: com.google.mlkit.nl.translate.internal.zzq */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzq extends LegacyModelMigrator {
    public zzq(Context context, ModelFileHelper modelFileHelper) {
        super(context, modelFileHelper);
    }

    /* renamed from: j */
    private final void m79237j(File file) {
        String name = file.getName();
        try {
            if (zzad.m79190g(name).length == 2 && file.isDirectory()) {
                try {
                    File e = this.f56346a.mo64593e(name, ModelType.TRANSLATE);
                    zzv a = zzad.m79184a(name);
                    int size = a.size();
                    for (int i = 0; i < size; i++) {
                        String str = (String) a.get(i);
                        LegacyModelMigrator.m79086g(new File(file, str), new File(e, str));
                    }
                    LegacyModelMigrator.m79084a(file);
                } catch (MlKitException e2) {
                    Log.e("TranslateMigrator", "Error creating model directory for ".concat(String.valueOf(name)), e2);
                }
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo64583b() {
        return "com.google.firebase.ml.translate.models";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo64586f(File file) {
        File[] listFiles;
        if (LegacyModelMigrator.m79085e(file.getName()) && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File j : listFiles) {
                m79237j(j);
            }
            LegacyModelMigrator.m79084a(file);
        }
    }
}
