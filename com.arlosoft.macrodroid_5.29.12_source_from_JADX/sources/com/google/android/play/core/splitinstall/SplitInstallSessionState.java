package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
public abstract class SplitInstallSessionState {
    /* renamed from: b */
    public static SplitInstallSessionState m71110b(int i, @SplitInstallSessionStatus int i2, @SplitInstallErrorCode int i3, long j, long j2, List<String> list, List<String> list2) {
        if (i2 != 8) {
            return new zza(i, i2, i3, j, j2, list, list2, (PendingIntent) null, (List) null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    /* renamed from: n */
    public static SplitInstallSessionState m71111n(Bundle bundle) {
        return new zza(bundle.getInt("session_id"), bundle.getInt(NotificationCompat.CATEGORY_STATUS), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    /* renamed from: a */
    public abstract long mo59964a();

    @SplitInstallErrorCode
    /* renamed from: c */
    public abstract int mo59965c();

    /* renamed from: d */
    public boolean mo59966d() {
        int i = mo59971i();
        return i == 0 || i == 5 || i == 6 || i == 7;
    }

    @NonNull
    /* renamed from: e */
    public List<String> mo59967e() {
        return mo59973k() != null ? new ArrayList(mo59973k()) : new ArrayList();
    }

    @NonNull
    /* renamed from: f */
    public List<String> mo59968f() {
        if (mo59974l() != null) {
            return new ArrayList(mo59974l());
        }
        return new ArrayList();
    }

    @Deprecated
    @Nullable
    /* renamed from: g */
    public abstract PendingIntent mo59969g();

    /* renamed from: h */
    public abstract int mo59970h();

    @SplitInstallSessionStatus
    /* renamed from: i */
    public abstract int mo59971i();

    /* renamed from: j */
    public abstract long mo59972j();

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: k */
    public abstract List mo59973k();

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: l */
    public abstract List mo59974l();

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: m */
    public abstract List mo59975m();
}
