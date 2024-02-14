package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzn {

    /* renamed from: f */
    private static final Uri f3764f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    @Nullable

    /* renamed from: a */
    private final String f3765a;
    @Nullable

    /* renamed from: b */
    private final String f3766b;
    @Nullable

    /* renamed from: c */
    private final ComponentName f3767c;

    /* renamed from: d */
    private final int f3768d;

    /* renamed from: e */
    private final boolean f3769e;

    public zzn(ComponentName componentName, int i) {
        this.f3765a = null;
        this.f3766b = null;
        Preconditions.m4488k(componentName);
        this.f3767c = componentName;
        this.f3768d = i;
        this.f3769e = false;
    }

    /* renamed from: a */
    public final int mo21811a() {
        return this.f3768d;
    }

    @Nullable
    /* renamed from: b */
    public final ComponentName mo21812b() {
        return this.f3767c;
    }

    /* renamed from: c */
    public final Intent mo21813c(Context context) {
        Bundle bundle;
        if (this.f3765a == null) {
            return new Intent().setComponent(this.f3767c);
        }
        Intent intent = null;
        if (this.f3769e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f3765a);
            try {
                bundle = context.getContentResolver().call(f3764f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f3765a)));
            }
        }
        if (intent != null) {
            return intent;
        }
        return new Intent(this.f3765a).setPackage(this.f3766b);
    }

    @Nullable
    /* renamed from: d */
    public final String mo21814d() {
        return this.f3766b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzn)) {
            return false;
        }
        zzn zzn = (zzn) obj;
        return Objects.m4470a(this.f3765a, zzn.f3765a) && Objects.m4470a(this.f3766b, zzn.f3766b) && Objects.m4470a(this.f3767c, zzn.f3767c) && this.f3768d == zzn.f3768d && this.f3769e == zzn.f3769e;
    }

    public final int hashCode() {
        return Objects.m4471b(this.f3765a, this.f3766b, this.f3767c, Integer.valueOf(this.f3768d), Boolean.valueOf(this.f3769e));
    }

    public final String toString() {
        String str = this.f3765a;
        if (str != null) {
            return str;
        }
        Preconditions.m4488k(this.f3767c);
        return this.f3767c.flattenToString();
    }

    public zzn(String str, String str2, int i, boolean z) {
        Preconditions.m4484g(str);
        this.f3765a = str;
        Preconditions.m4484g(str2);
        this.f3766b = str2;
        this.f3767c = null;
        this.f3768d = i;
        this.f3769e = z;
    }
}
