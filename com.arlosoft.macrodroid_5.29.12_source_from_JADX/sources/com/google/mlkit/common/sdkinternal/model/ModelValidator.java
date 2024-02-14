package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.common.model.RemoteModel;
import java.io.File;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public interface ModelValidator {

    @KeepForSdk
    /* compiled from: com.google.mlkit:common@@18.5.0 */
    public static class ValidationResult {
        @NonNull
        @KeepForSdk

        /* renamed from: c */
        public static final ValidationResult f56360c = new ValidationResult(ErrorCode.OK, (String) null);

        /* renamed from: a */
        private final ErrorCode f56361a;
        @Nullable

        /* renamed from: b */
        private final String f56362b;

        @KeepForSdk
        /* compiled from: com.google.mlkit:common@@18.5.0 */
        public enum ErrorCode {
            OK,
            TFLITE_VERSION_INCOMPATIBLE,
            MODEL_FORMAT_INVALID
        }

        @KeepForSdk
        public ValidationResult(@NonNull ErrorCode errorCode, @Nullable String str) {
            this.f56361a = errorCode;
            this.f56362b = str;
        }

        @NonNull
        @KeepForSdk
        /* renamed from: a */
        public ErrorCode mo64601a() {
            return this.f56361a;
        }

        @KeepForSdk
        /* renamed from: b */
        public boolean mo64602b() {
            return this.f56361a == ErrorCode.OK;
        }
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    ValidationResult mo64600a(@NonNull File file, @NonNull RemoteModel remoteModel);
}
