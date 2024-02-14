package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.HashMap;
import java.util.Map;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class RemoteModelLoader {

    /* renamed from: a */
    private static final GmsLogger f56389a = new GmsLogger("RemoteModelLoader", "");
    @GuardedBy("RemoteModelLoader.class")

    /* renamed from: b */
    private static final Map f56390b = new HashMap();
}
