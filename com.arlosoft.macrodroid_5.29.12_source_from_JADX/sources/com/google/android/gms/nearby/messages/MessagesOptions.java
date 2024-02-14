package com.google.android.gms.nearby.messages;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class MessagesOptions implements Api.ApiOptions.Optional {
    @Nullable

    /* renamed from: a */
    public final String f47642a;

    /* renamed from: c */
    public final int f47643c;
    @NonNull

    /* renamed from: d */
    public final String f47644d;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static class Builder {

        /* renamed from: a */
        private int f47645a = -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessagesOptions)) {
            return false;
        }
        MessagesOptions messagesOptions = (MessagesOptions) obj;
        String str = messagesOptions.f47642a;
        return Objects.m4470a((Object) null, (Object) null) && Objects.m4470a((Object) null, (Object) null) && Objects.m4470a((Object) null, (Object) null) && this.f47643c == messagesOptions.f47643c;
    }

    public final int hashCode() {
        return Objects.m4471b(null, Boolean.FALSE, null, null, Integer.valueOf(this.f47643c));
    }
}
