package com.google.mlkit.common.sdkinternal.model;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import java.io.File;
import java.util.concurrent.Executor;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public abstract class LegacyModelMigrator {
    @NonNull
    @KeepForSdk

    /* renamed from: a */
    protected final ModelFileHelper f56346a;

    /* renamed from: b */
    private final TaskCompletionSource f56347b = new TaskCompletionSource();

    /* renamed from: c */
    private final Context f56348c;

    /* renamed from: d */
    private final Executor f56349d;

    @KeepForSdk
    protected LegacyModelMigrator(@NonNull Context context, @NonNull ModelFileHelper modelFileHelper) {
        this.f56348c = context;
        this.f56346a = modelFileHelper;
        this.f56349d = MLTaskExecutor.m79034f();
    }

    @KeepForSdk
    /* renamed from: a */
    protected static void m79084a(@NonNull File file) {
        File[] listFiles = file.listFiles();
        if ((listFiles == null || listFiles.length == 0) && !file.delete()) {
            Log.e("MlKitLegacyMigration", "Error deleting model directory ".concat(String.valueOf(file)));
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static boolean m79085e(@androidx.annotation.NonNull java.lang.String r3) {
        /*
            java.lang.String r0 = "\\+"
            r1 = -1
            java.lang.String[] r3 = r3.split(r0, r1)
            int r0 = r3.length
            r1 = 0
            r2 = 2
            if (r0 == r2) goto L_0x000d
            return r1
        L_0x000d:
            r0 = r3[r1]     // Catch:{ IllegalArgumentException -> 0x0019 }
            com.google.android.gms.common.util.Base64Utils.m4852b(r0)     // Catch:{ IllegalArgumentException -> 0x0019 }
            r0 = 1
            r3 = r3[r0]     // Catch:{  }
            com.google.android.gms.common.util.Base64Utils.m4852b(r3)     // Catch:{  }
            return r0
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.LegacyModelMigrator.m79085e(java.lang.String):boolean");
    }

    @KeepForSdk
    @VisibleForTesting
    /* renamed from: g */
    public static void m79086g(@NonNull File file, @NonNull File file2) {
        if (file.exists()) {
            if (!file2.exists() && !file.renameTo(file2)) {
                String valueOf = String.valueOf(file);
                String valueOf2 = String.valueOf(file2);
                Log.e("MlKitLegacyMigration", "Error moving model file " + valueOf + " to " + valueOf2);
            }
            if (file.exists() && !file.delete()) {
                Log.e("MlKitLegacyMigration", "Error deleting model file ".concat(String.valueOf(file)));
            }
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    @VisibleForTesting
    /* renamed from: b */
    public abstract String mo64583b();

    @NonNull
    @KeepForSdk
    @VisibleForTesting
    /* renamed from: c */
    public File mo64584c() {
        return new File(this.f56348c.getNoBackupFilesDir(), mo64583b());
    }

    @NonNull
    @KeepForSdk
    /* renamed from: d */
    public Task<Void> mo64585d() {
        return this.f56347b.mo56137a();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: f */
    public abstract void mo64586f(@NonNull File file);

    @KeepForSdk
    /* renamed from: h */
    public void mo64587h() {
        this.f56349d.execute(new zza(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo64588i() {
        File c = mo64584c();
        File[] listFiles = c.listFiles();
        if (listFiles != null) {
            for (File f : listFiles) {
                mo64586f(f);
            }
            m79084a(c);
        }
        this.f56347b.mo56139c(null);
    }
}
