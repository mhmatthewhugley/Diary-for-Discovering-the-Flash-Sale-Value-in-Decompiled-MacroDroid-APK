package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.HashMap;
import java.util.Map;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class CustomModelLoader {

    /* renamed from: a */
    private static final GmsLogger f56344a = new GmsLogger("CustomModelLoader", "");
    @GuardedBy("CustomModelLoader.class")

    /* renamed from: b */
    private static final Map f56345b = new HashMap();

    @KeepForSdk
    /* compiled from: com.google.mlkit:common@@18.5.0 */
    public interface CustomModelLoaderHelper {
    }
}
