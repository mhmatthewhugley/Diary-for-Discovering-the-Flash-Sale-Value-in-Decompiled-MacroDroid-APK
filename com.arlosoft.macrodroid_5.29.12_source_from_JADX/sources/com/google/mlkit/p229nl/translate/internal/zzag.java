package com.google.mlkit.p229nl.translate.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover;
import java.io.File;

/* renamed from: com.google.mlkit.nl.translate.internal.zzag */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzag implements RemoteModelFileMover {

    /* renamed from: c */
    private static final GmsLogger f56479c = new GmsLogger("TranslateModelMover", "");

    /* renamed from: a */
    private final MlKitContext f56480a;

    /* renamed from: b */
    private final String f56481b;

    zzag(@NonNull MlKitContext mlKitContext, @NonNull String str) {
        this.f56480a = mlKitContext;
        this.f56481b = str;
    }

    @Nullable
    /* renamed from: a */
    public final File mo64512a(File file) throws MlKitException {
        File b = mo64662b();
        if (file.renameTo(b)) {
            f56479c.mo21702b("TranslateModelMover", "Rename to serving model successfully");
            b.setExecutable(false);
            b.setWritable(false);
            return b;
        }
        GmsLogger gmsLogger = f56479c;
        gmsLogger.mo21702b("TranslateModelMover", "Rename to serving model failed, remove the temp file.");
        if (file.delete()) {
            return null;
        }
        gmsLogger.mo21702b("TranslateModelMover", "Failed to delete the temp file: ".concat(String.valueOf(file.getAbsolutePath())));
        return null;
    }

    /* renamed from: b */
    public final File mo64662b() throws MlKitException {
        ModelFileHelper modelFileHelper = new ModelFileHelper(this.f56480a);
        File e = modelFileHelper.mo64593e(this.f56481b, ModelType.TRANSLATE);
        return new File(e, String.valueOf(modelFileHelper.mo64592d(e) + 1));
    }
}
