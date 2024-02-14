package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;

@WorkerThread
@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class ModelLoader {

    /* renamed from: a */
    private static final GmsLogger f56355a = new GmsLogger("ModelLoader", "");

    @KeepForSdk
    /* compiled from: com.google.mlkit:common@@18.5.0 */
    public interface ModelContentHandler {
    }

    @KeepForSdk
    /* compiled from: com.google.mlkit:common@@18.5.0 */
    public interface ModelLoadingLogger {
    }

    @KeepForSdk
    /* compiled from: com.google.mlkit:common@@18.5.0 */
    protected enum ModelLoadingState {
        NO_MODEL_LOADED,
        REMOTE_MODEL_LOADED,
        LOCAL_MODEL_LOADED
    }
}
