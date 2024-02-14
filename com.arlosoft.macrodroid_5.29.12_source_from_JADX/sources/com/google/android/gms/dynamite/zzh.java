package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zzh implements DynamiteModule.VersionPolicy {
    zzh() {
    }

    /* renamed from: a */
    public final DynamiteModule.VersionPolicy.SelectionResult mo22055a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int a = iVersions.mo22056a(context, str, false);
        selectionResult.f4059b = a;
        if (a == 0) {
            selectionResult.f4060c = 0;
        } else {
            selectionResult.f4060c = 1;
        }
        return selectionResult;
    }
}
