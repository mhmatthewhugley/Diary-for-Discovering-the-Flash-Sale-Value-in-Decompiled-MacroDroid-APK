package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.arlosoft.macrodroid.data.HomeTile;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelType;
import java.io.File;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class ModelFileHelper {

    /* renamed from: b */
    private static final GmsLogger f56350b = new GmsLogger("ModelFileHelper", "");
    @VisibleForTesting
    @NonNull

    /* renamed from: c */
    public static final String f56351c = String.format("com.google.mlkit.%s.models", new Object[]{"translate"});
    @VisibleForTesting
    @NonNull

    /* renamed from: d */
    public static final String f56352d = String.format("com.google.mlkit.%s.models", new Object[]{HomeTile.TILE_TYPE_CUSTOM});
    @VisibleForTesting

    /* renamed from: e */
    static final String f56353e = String.format("com.google.mlkit.%s.models", new Object[]{"base"});

    /* renamed from: a */
    private final MlKitContext f56354a;

    public ModelFileHelper(@NonNull MlKitContext mlKitContext) {
        this.f56354a = mlKitContext;
    }

    @WorkerThread
    /* renamed from: k */
    private final File m79093k(@NonNull String str, @NonNull ModelType modelType, boolean z) throws MlKitException {
        File f = mo64594f(str, modelType, z);
        if (!f.exists()) {
            f56350b.mo21702b("ModelFileHelper", "model folder does not exist, creating one: ".concat(String.valueOf(f.getAbsolutePath())));
            if (!f.mkdirs()) {
                throw new MlKitException("Failed to create model folder: ".concat(String.valueOf(f)), 13);
            }
        } else if (!f.isDirectory()) {
            throw new MlKitException("Can not create model folder, since an existing file has the same name: ".concat(String.valueOf(f)), 6);
        }
        return f;
    }

    @WorkerThread
    @KeepForSdk
    /* renamed from: a */
    public synchronized void mo64589a(@NonNull ModelType modelType, @NonNull String str) {
        mo64590b(mo64594f(str, modelType, false));
        mo64590b(mo64594f(str, modelType, true));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r5 != false) goto L_0x002c;
     */
    @androidx.annotation.WorkerThread
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo64590b(@androidx.annotation.Nullable java.io.File r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8.isDirectory()
            r2 = 1
            if (r1 == 0) goto L_0x002c
            java.io.File[] r1 = r8.listFiles()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.m4488k(r1)
            java.io.File[] r1 = (java.io.File[]) r1
            int r3 = r1.length
            r4 = 0
            r5 = 1
        L_0x0018:
            if (r4 >= r3) goto L_0x002a
            r6 = r1[r4]
            if (r5 == 0) goto L_0x0026
            boolean r5 = r7.mo64590b(r6)
            if (r5 == 0) goto L_0x0026
            r5 = 1
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            int r4 = r4 + 1
            goto L_0x0018
        L_0x002a:
            if (r5 == 0) goto L_0x0033
        L_0x002c:
            boolean r8 = r8.delete()
            if (r8 == 0) goto L_0x0033
            return r2
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.ModelFileHelper.mo64590b(java.io.File):boolean");
    }

    @WorkerThread
    @KeepForSdk
    /* renamed from: c */
    public void mo64591c(@NonNull String str, @NonNull ModelType modelType) throws MlKitException {
        File k = m79093k(str, modelType, true);
        if (!mo64590b(k)) {
            f56350b.mo21704d("ModelFileHelper", "Failed to delete the temp labels file directory: ".concat(String.valueOf(k != null ? k.getAbsolutePath() : null)));
        }
    }

    @WorkerThread
    @KeepForSdk
    /* renamed from: d */
    public int mo64592d(@NonNull File file) {
        File[] listFiles = file.listFiles();
        int i = -1;
        if (!(listFiles == null || (r1 = listFiles.length) == 0)) {
            for (File file2 : listFiles) {
                try {
                    i = Math.max(i, Integer.parseInt(file2.getName()));
                } catch (NumberFormatException unused) {
                    f56350b.mo21702b("ModelFileHelper", "Contains non-integer file name ".concat(String.valueOf(file2.getName())));
                }
            }
        }
        return i;
    }

    @WorkerThread
    @NonNull
    @KeepForSdk
    /* renamed from: e */
    public File mo64593e(@NonNull String str, @NonNull ModelType modelType) throws MlKitException {
        return m79093k(str, modelType, false);
    }

    @WorkerThread
    @NonNull
    @KeepForSdk
    /* renamed from: f */
    public File mo64594f(@NonNull String str, @NonNull ModelType modelType, boolean z) {
        String str2;
        ModelType modelType2 = ModelType.UNKNOWN;
        int ordinal = modelType.ordinal();
        if (ordinal == 1) {
            str2 = f56353e;
        } else if (ordinal == 2) {
            str2 = f56351c;
        } else if (ordinal == 4) {
            str2 = f56352d;
        } else {
            String name = modelType.name();
            throw new IllegalArgumentException("Unknown model type " + name + ". Cannot find a dir to store the downloaded model.");
        }
        File file = new File(this.f56354a.mo64554b().getNoBackupFilesDir(), str2);
        if (z) {
            file = new File(file, "temp");
        }
        return new File(file, str);
    }

    @WorkerThread
    @NonNull
    @KeepForSdk
    /* renamed from: g */
    public File mo64595g(@NonNull String str, @NonNull ModelType modelType, @NonNull String str2) throws MlKitException {
        File k = m79093k(str, modelType, true);
        if (!k.exists() || !k.isFile() || k.delete()) {
            if (!k.exists()) {
                f56350b.mo21702b("ModelFileHelper", "Temp labels folder does not exist, creating one: ".concat(String.valueOf(k.getAbsolutePath())));
                if (!k.mkdirs()) {
                    throw new MlKitException("Failed to create a directory to hold the AutoML model's labels file.", 13);
                }
            }
            return new File(k, str2);
        }
        throw new MlKitException("Failed to delete the temp labels file: ".concat(String.valueOf(k.getAbsolutePath())), 13);
    }

    @WorkerThread
    @KeepForSdk
    /* renamed from: h */
    public boolean mo64596h(@NonNull String str, @NonNull ModelType modelType) throws MlKitException {
        String j;
        if (modelType == ModelType.UNKNOWN || (j = mo64598j(str, modelType)) == null) {
            return false;
        }
        File file = new File(j);
        if (!file.exists()) {
            return false;
        }
        File file2 = new File(file, "model.tflite");
        f56350b.mo21706f("ModelFileHelper", "Model file path: ".concat(String.valueOf(file2.getAbsolutePath())));
        return file2.exists();
    }

    @WorkerThread
    @NonNull
    /* renamed from: i */
    public final File mo64597i(@NonNull String str, @NonNull ModelType modelType) throws MlKitException {
        return m79093k(str, modelType, true);
    }

    @WorkerThread
    @Nullable
    /* renamed from: j */
    public final String mo64598j(@NonNull String str, @NonNull ModelType modelType) throws MlKitException {
        File e = mo64593e(str, modelType);
        int d = mo64592d(e);
        if (d == -1) {
            return null;
        }
        String absolutePath = e.getAbsolutePath();
        return absolutePath + "/" + d;
    }
}
