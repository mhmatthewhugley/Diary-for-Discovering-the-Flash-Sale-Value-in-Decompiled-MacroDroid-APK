package p305k8;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;

/* renamed from: k8.d */
/* compiled from: BundleScrubber */
public final class C13419d {
    @CheckResult
    /* renamed from: a */
    public static boolean m85855a(@Nullable Intent intent) {
        if (intent == null) {
            return false;
        }
        boolean b = m85856b(intent.getExtras());
        if (!b) {
            return b;
        }
        intent.replaceExtras(new Bundle());
        return b;
    }

    @CheckResult
    /* renamed from: b */
    public static boolean m85856b(@Nullable Bundle bundle) {
        if (bundle != null) {
            try {
                bundle.containsKey((String) null);
            } catch (Exception unused) {
                bundle.clear();
                return true;
            }
        }
        return false;
    }
}
