package com.google.mlkit.common.sdkinternal.model;

import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.mlkit_common.zziy;
import com.google.android.gms.internal.mlkit_common.zzje;
import com.google.android.gms.internal.mlkit_common.zzmt;
import com.google.android.gms.internal.mlkit_common.zznb;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.internal.model.ModelUtils;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.google.mlkit.common.sdkinternal.model.ModelValidator;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class RemoteModelFileManager {

    /* renamed from: h */
    private static final GmsLogger f56381h = new GmsLogger("RemoteModelFileManager", "");

    /* renamed from: a */
    private final MlKitContext f56382a;

    /* renamed from: b */
    private final String f56383b;

    /* renamed from: c */
    private final ModelType f56384c;
    @Nullable

    /* renamed from: d */
    private final ModelValidator f56385d;

    /* renamed from: e */
    private final RemoteModelFileMover f56386e;

    /* renamed from: f */
    private final SharedPrefManager f56387f;

    /* renamed from: g */
    private final ModelFileHelper f56388g;

    public RemoteModelFileManager(@NonNull MlKitContext mlKitContext, @NonNull RemoteModel remoteModel, @Nullable ModelValidator modelValidator, @NonNull ModelFileHelper modelFileHelper, @NonNull RemoteModelFileMover remoteModelFileMover) {
        String str;
        this.f56382a = mlKitContext;
        ModelType d = remoteModel.mo64531d();
        this.f56384c = d;
        if (d == ModelType.TRANSLATE) {
            str = remoteModel.mo64530c();
        } else {
            str = remoteModel.mo64532e();
        }
        this.f56383b = str;
        this.f56385d = modelValidator;
        this.f56387f = SharedPrefManager.m79063f(mlKitContext);
        this.f56388g = modelFileHelper;
        this.f56386e = remoteModelFileMover;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public File mo64614a(boolean z) {
        return this.f56388g.mo64594f(this.f56383b, this.f56384c, z);
    }

    @WorkerThread
    @Nullable
    @KeepForSdk
    /* renamed from: b */
    public synchronized File mo64615b(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull String str, @NonNull RemoteModel remoteModel) throws MlKitException {
        File file;
        FileOutputStream fileOutputStream;
        MlKitException mlKitException;
        ModelValidator modelValidator;
        file = new File(this.f56388g.mo64597i(this.f56383b, this.f56384c), "to_be_validated_model.tmp");
        ModelValidator.ValidationResult validationResult = null;
        try {
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            try {
                fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = autoCloseInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                autoCloseInputStream.close();
                boolean b = ModelUtils.m78983b(file, str);
                if (b && (modelValidator = this.f56385d) != null) {
                    validationResult = modelValidator.mo64600a(file, remoteModel);
                    if (validationResult.mo64601a().equals(ModelValidator.ValidationResult.ErrorCode.TFLITE_VERSION_INCOMPATIBLE)) {
                        String a = CommonUtils.m79028a(this.f56382a.mo64554b());
                        this.f56387f.mo64579m(remoteModel, str, a);
                        GmsLogger gmsLogger = f56381h;
                        gmsLogger.mo21702b("RemoteModelFileManager", "Model is not compatible. Model hash: ".concat(String.valueOf(str)));
                        gmsLogger.mo21702b("RemoteModelFileManager", "The current app version is: ".concat(String.valueOf(a)));
                    }
                }
                if (b) {
                    if (validationResult == null || validationResult.mo64602b()) {
                    }
                }
                if (!b) {
                    f56381h.mo21702b("RemoteModelFileManager", "Hash does not match with expected: ".concat(String.valueOf(str)));
                    zznb.m61542b("common").mo52012f(zzmt.m61529g(), remoteModel, zziy.MODEL_HASH_MISMATCH, true, this.f56384c, zzje.SUCCEEDED);
                    mlKitException = new MlKitException("Hash does not match with expected", 102);
                } else {
                    mlKitException = new MlKitException("Model is not compatible with TFLite run time", 100);
                }
                if (!file.delete()) {
                    f56381h.mo21702b("RemoteModelFileManager", "Failed to delete the temp file: ".concat(String.valueOf(file.getAbsolutePath())));
                }
                throw mlKitException;
            } catch (Throwable th) {
                autoCloseInputStream.close();
                throw th;
            }
        } catch (IOException e) {
            f56381h.mo21704d("RemoteModelFileManager", "Failed to copy downloaded model file to private folder: ".concat(e.toString()));
            return null;
        } catch (Throwable th2) {
            zze.m79137a(th, th2);
        }
        return this.f56386e.mo64512a(file);
        throw th;
    }
}
