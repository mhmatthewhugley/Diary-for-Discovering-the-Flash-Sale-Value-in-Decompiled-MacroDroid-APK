package com.google.android.gms.signin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class SignInOptions implements Api.ApiOptions.Optional {
    @NonNull

    /* renamed from: A */
    public static final SignInOptions f47937A = new SignInOptions(false, false, (String) null, false, (String) null, (String) null, false, (Long) null, (Long) null, (zaf) null);

    /* renamed from: a */
    private final boolean f47938a = false;

    /* renamed from: c */
    private final boolean f47939c = false;
    @Nullable

    /* renamed from: d */
    private final String f47940d = null;

    /* renamed from: f */
    private final boolean f47941f = false;
    @Nullable

    /* renamed from: g */
    private final String f47942g = null;
    @Nullable

    /* renamed from: o */
    private final String f47943o = null;

    /* renamed from: p */
    private final boolean f47944p = false;
    @Nullable

    /* renamed from: s */
    private final Long f47945s = null;
    @Nullable

    /* renamed from: z */
    private final Long f47946z = null;

    /* synthetic */ SignInOptions(boolean z, boolean z2, String str, boolean z3, String str2, String str3, boolean z4, Long l, Long l2, zaf zaf) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignInOptions)) {
            return false;
        }
        boolean z = ((SignInOptions) obj).f47938a;
        return Objects.m4470a((Object) null, (Object) null) && Objects.m4470a((Object) null, (Object) null) && Objects.m4470a((Object) null, (Object) null) && Objects.m4470a((Object) null, (Object) null) && Objects.m4470a((Object) null, (Object) null);
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.m4471b(bool, bool, null, bool, bool, null, null, null, null);
    }
}
