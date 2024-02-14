package com.google.mlkit.common.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover;
import java.io.File;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class zza implements RemoteModelFileMover {

    /* renamed from: c */
    private static final GmsLogger f56244c = new GmsLogger("CustomModelFileMover", "");

    /* renamed from: a */
    private final String f56245a;

    /* renamed from: b */
    private final ModelFileHelper f56246b;

    public zza(@NonNull MlKitContext mlKitContext, @NonNull String str) {
        this.f56245a = str;
        this.f56246b = new ModelFileHelper(mlKitContext);
    }

    /* renamed from: b */
    private static boolean m78991b(File file, File file2) {
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = file2.getAbsolutePath();
        if (file.renameTo(file2)) {
            f56244c.mo21702b("CustomModelFileMover", String.format("Moved file from %s to %s successfully", new Object[]{absolutePath, absolutePath2}));
            file2.setExecutable(false);
            file2.setWritable(false);
            return true;
        }
        GmsLogger gmsLogger = f56244c;
        gmsLogger.mo21702b("CustomModelFileMover", String.format("Move file to %s failed, remove the temp file %s.", new Object[]{absolutePath2, absolutePath}));
        if (!file.delete()) {
            gmsLogger.mo21702b("CustomModelFileMover", "Failed to delete the temp file: ".concat(String.valueOf(absolutePath)));
        }
        return false;
    }

    @Nullable
    /* renamed from: a */
    public final File mo64512a(File file) throws MlKitException {
        File file2;
        ModelFileHelper modelFileHelper = this.f56246b;
        String str = this.f56245a;
        ModelType modelType = ModelType.CUSTOM;
        File e = modelFileHelper.mo64593e(str, modelType);
        File file3 = new File(new File(e, String.valueOf(this.f56246b.mo64592d(e) + 1)), "model.tflite");
        File parentFile = file3.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            ((File) Preconditions.m4488k(parentFile)).mkdirs();
        }
        File file4 = null;
        if (!m78991b(file, file3)) {
            return null;
        }
        File g = this.f56246b.mo64595g(this.f56245a, modelType, "labels.txt");
        if (g.exists()) {
            file2 = new File(parentFile, "labels.txt");
            if (!m78991b(g, file2)) {
                return null;
            }
        } else {
            file2 = null;
        }
        File g2 = this.f56246b.mo64595g(this.f56245a, modelType, "manifest.json");
        if (g2.exists()) {
            File file5 = new File(parentFile, "manifest.json");
            if (!m78991b(g2, file5)) {
                return null;
            }
            file4 = file5;
        }
        return (file2 == null && file4 == null) ? file3 : parentFile;
    }
}
