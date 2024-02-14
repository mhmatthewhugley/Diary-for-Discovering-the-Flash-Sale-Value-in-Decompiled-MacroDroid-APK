package com.google.android.play.core.appupdate;

import androidx.annotation.NonNull;
import com.google.android.play.core.install.model.AppUpdateType;

/* compiled from: com.google.android.play:core@@1.10.3 */
public abstract class AppUpdateOptions {

    /* compiled from: com.google.android.play:core@@1.10.3 */
    public static abstract class Builder {
        @NonNull
        /* renamed from: a */
        public abstract AppUpdateOptions mo59545a();

        @NonNull
        /* renamed from: b */
        public abstract Builder mo59546b(boolean z);
    }

    @NonNull
    /* renamed from: c */
    public static AppUpdateOptions m70405c(@AppUpdateType int i) {
        return m70406d(i).mo59545a();
    }

    @NonNull
    /* renamed from: d */
    public static Builder m70406d(@AppUpdateType int i) {
        zzu zzu = new zzu();
        zzu.mo59561c(i);
        zzu.mo59546b(false);
        return zzu;
    }

    /* renamed from: a */
    public abstract boolean mo59543a();

    @AppUpdateType
    /* renamed from: b */
    public abstract int mo59544b();
}
