package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zzi implements DynamiteModule.VersionPolicy {
    zzi() {
    }

    /* renamed from: a */
    public final DynamiteModule.VersionPolicy.SelectionResult mo22055a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.f4058a = iVersions.mo22057b(context, str);
        int a = iVersions.mo22056a(context, str, true);
        selectionResult.f4059b = a;
        int i = selectionResult.f4058a;
        if (i == 0) {
            if (a == 0) {
                selectionResult.f4060c = 0;
                return selectionResult;
            }
            i = 0;
        }
        if (i >= a) {
            selectionResult.f4060c = -1;
        } else {
            selectionResult.f4060c = 1;
        }
        return selectionResult;
    }
}
