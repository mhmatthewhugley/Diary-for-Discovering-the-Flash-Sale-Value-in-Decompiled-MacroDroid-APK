package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.InstallStatus;
import com.google.android.play.core.install.model.UpdateAvailability;

/* compiled from: com.google.android.play:core@@1.10.3 */
public class AppUpdateInfo {
    @NonNull

    /* renamed from: a */
    private final String f51093a;

    /* renamed from: b */
    private final int f51094b;
    @UpdateAvailability

    /* renamed from: c */
    private final int f51095c;
    @InstallStatus

    /* renamed from: d */
    private final int f51096d;
    @Nullable

    /* renamed from: e */
    private final Integer f51097e;

    /* renamed from: f */
    private final int f51098f;

    /* renamed from: g */
    private final long f51099g;

    /* renamed from: h */
    private final long f51100h;

    /* renamed from: i */
    private final long f51101i;

    /* renamed from: j */
    private final long f51102j;
    @Nullable

    /* renamed from: k */
    private final PendingIntent f51103k;
    @Nullable

    /* renamed from: l */
    private final PendingIntent f51104l;
    @Nullable

    /* renamed from: m */
    private final PendingIntent f51105m;
    @Nullable

    /* renamed from: n */
    private final PendingIntent f51106n;

    /* renamed from: o */
    private boolean f51107o = false;

    private AppUpdateInfo(@NonNull String str, int i, @UpdateAvailability int i2, @InstallStatus int i3, @Nullable Integer num, int i4, long j, long j2, long j3, long j4, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable PendingIntent pendingIntent3, @Nullable PendingIntent pendingIntent4) {
        this.f51093a = str;
        this.f51094b = i;
        this.f51095c = i2;
        this.f51096d = i3;
        this.f51097e = num;
        this.f51098f = i4;
        this.f51099g = j;
        this.f51100h = j2;
        this.f51101i = j3;
        this.f51102j = j4;
        this.f51103k = pendingIntent;
        this.f51104l = pendingIntent2;
        this.f51105m = pendingIntent3;
        this.f51106n = pendingIntent4;
    }

    /* renamed from: e */
    public static AppUpdateInfo m70394e(@NonNull String str, int i, @UpdateAvailability int i2, @InstallStatus int i3, @Nullable Integer num, int i4, long j, long j2, long j3, long j4, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable PendingIntent pendingIntent3, @Nullable PendingIntent pendingIntent4) {
        return new AppUpdateInfo(str, i, i2, i3, num, i4, j, j2, j3, j4, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4);
    }

    /* renamed from: h */
    private final boolean m70395h(AppUpdateOptions appUpdateOptions) {
        return appUpdateOptions.mo59543a() && this.f51101i <= this.f51102j;
    }

    /* renamed from: a */
    public boolean mo59535a(@AppUpdateType int i) {
        return mo59538d(AppUpdateOptions.m70405c(i)) != null;
    }

    /* renamed from: b */
    public boolean mo59536b(@NonNull AppUpdateOptions appUpdateOptions) {
        return mo59538d(appUpdateOptions) != null;
    }

    @UpdateAvailability
    /* renamed from: c */
    public int mo59537c() {
        return this.f51095c;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: d */
    public final PendingIntent mo59538d(AppUpdateOptions appUpdateOptions) {
        if (appUpdateOptions.mo59544b() == 0) {
            PendingIntent pendingIntent = this.f51104l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (m70395h(appUpdateOptions)) {
                return this.f51106n;
            }
            return null;
        }
        if (appUpdateOptions.mo59544b() == 1) {
            PendingIntent pendingIntent2 = this.f51103k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (m70395h(appUpdateOptions)) {
                return this.f51105m;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo59539f() {
        this.f51107o = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo59540g() {
        return this.f51107o;
    }
}
