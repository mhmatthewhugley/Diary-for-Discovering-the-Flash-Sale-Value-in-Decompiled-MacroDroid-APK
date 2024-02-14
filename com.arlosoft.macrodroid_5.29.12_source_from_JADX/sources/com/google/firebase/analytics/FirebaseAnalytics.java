package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.work.WorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.internal.zzhy;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
public final class FirebaseAnalytics {

    /* renamed from: b */
    private static volatile FirebaseAnalytics f53776b;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzef f53777a;

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
    public enum ConsentStatus {
        GRANTED,
        DENIED
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
    public enum ConsentType {
        AD_STORAGE,
        ANALYTICS_STORAGE
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
    public static class Event {
        protected Event() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
    public static class Param {
        protected Param() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
    public static class UserProperty {
        protected UserProperty() {
        }
    }

    public FirebaseAnalytics(zzef zzef) {
        Preconditions.m4488k(zzef);
        this.f53777a = zzef;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f53776b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f53776b == null) {
                    f53776b = new FirebaseAnalytics(zzef.m59630u(context, (String) null, (String) null, (String) null, (Bundle) null));
                }
            }
        }
        return f53776b;
    }

    @Keep
    @Nullable
    public static zzhy getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        zzef u = zzef.m59630u(context, (String) null, (String) null, (String) null, bundle);
        if (u == null) {
            return null;
        }
        return new zzd(u);
    }

    /* renamed from: a */
    public void mo61989a(@Size(max = 40, min = 1) @NonNull String str, @Nullable Bundle bundle) {
        this.f53777a.mo50858L(str, bundle);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.m66663b(FirebaseInstallations.m76612p().getId(), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @MainThread
    @Deprecated
    @Keep
    public void setCurrentScreen(@NonNull Activity activity, @Size(max = 36, min = 1) @Nullable String str, @Size(max = 36, min = 1) @Nullable String str2) {
        this.f53777a.mo50864e(activity, str, str2);
    }
}
