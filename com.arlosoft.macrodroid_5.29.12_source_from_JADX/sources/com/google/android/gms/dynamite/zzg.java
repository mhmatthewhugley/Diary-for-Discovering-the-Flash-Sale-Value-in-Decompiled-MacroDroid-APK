package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zzg implements DynamiteModule.VersionPolicy {
    zzg() {
    }

    /* renamed from: a */
    public final DynamiteModule.VersionPolicy.SelectionResult mo22055a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int b = iVersions.mo22057b(context, str);
        selectionResult.f4058a = b;
        if (b != 0) {
            selectionResult.f4060c = -1;
        } else {
            int a = iVersions.mo22056a(context, str, true);
            selectionResult.f4059b = a;
            if (a != 0) {
                selectionResult.f4060c = 1;
            }
        }
        return selectionResult;
    }
}
