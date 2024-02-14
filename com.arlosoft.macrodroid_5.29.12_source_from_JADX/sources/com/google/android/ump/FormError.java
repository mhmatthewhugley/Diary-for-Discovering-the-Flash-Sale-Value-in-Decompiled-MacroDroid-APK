package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public class FormError {

    /* renamed from: a */
    private final int f51998a;

    /* renamed from: b */
    private final String f51999b;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    public @interface ErrorCode {
    }

    public FormError(int i, @RecentlyNonNull String str) {
        this.f51998a = i;
        this.f51999b = str;
    }
}
