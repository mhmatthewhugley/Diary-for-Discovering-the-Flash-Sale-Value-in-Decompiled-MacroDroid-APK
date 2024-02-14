package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zzl implements DynamiteModule.VersionPolicy {
    zzl() {
    }

    /* renamed from: a */
    public final DynamiteModule.VersionPolicy.SelectionResult mo22055a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        int i;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int b = iVersions.mo22057b(context, str);
        selectionResult.f4058a = b;
        int i2 = 0;
        if (b != 0) {
            i = iVersions.mo22056a(context, str, false);
            selectionResult.f4059b = i;
        } else {
            i = iVersions.mo22056a(context, str, true);
            selectionResult.f4059b = i;
        }
        int i3 = selectionResult.f4058a;
        if (i3 != 0) {
            i2 = i3;
        } else if (i == 0) {
            selectionResult.f4060c = 0;
            return selectionResult;
        }
        if (i >= i2) {
            selectionResult.f4060c = 1;
        } else {
            selectionResult.f4060c = -1;
        }
        return selectionResult;
    }
}
