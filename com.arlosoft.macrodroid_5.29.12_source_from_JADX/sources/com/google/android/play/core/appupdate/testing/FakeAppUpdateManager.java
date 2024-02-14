package com.google.android.play.core.appupdate.testing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.Nullable;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;
import com.google.android.play.core.install.model.UpdateAvailability;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
public class FakeAppUpdateManager implements AppUpdateManager {

    /* renamed from: a */
    private final Context f51108a;

    /* renamed from: b */
    private final List f51109b;
    @InstallStatus

    /* renamed from: c */
    private int f51110c;
    @InstallErrorCode

    /* renamed from: d */
    private int f51111d;

    /* renamed from: e */
    private boolean f51112e;

    /* renamed from: f */
    private int f51113f;
    @Nullable

    /* renamed from: g */
    private Integer f51114g;

    /* renamed from: h */
    private int f51115h;

    /* renamed from: i */
    private long f51116i;

    /* renamed from: j */
    private long f51117j;

    /* renamed from: k */
    private boolean f51118k;

    /* renamed from: l */
    private boolean f51119l;
    @AppUpdateType
    @Nullable

    /* renamed from: m */
    private Integer f51120m;

    /* renamed from: c */
    private static int m70411c() {
        return Build.VERSION.SDK_INT >= 23 ? 67108864 : 0;
    }

    @UpdateAvailability
    /* renamed from: d */
    private final int m70412d() {
        if (!this.f51112e) {
            return 1;
        }
        int i = this.f51110c;
        return (i == 0 || i == 4 || i == 5 || i == 6) ? 2 : 3;
    }

    /* renamed from: e */
    private final boolean m70413e(AppUpdateInfo appUpdateInfo, AppUpdateOptions appUpdateOptions) {
        if (!appUpdateInfo.mo59536b(appUpdateOptions) && (!AppUpdateOptions.m70405c(appUpdateOptions.mo59544b()).equals(appUpdateOptions) || !appUpdateInfo.mo59535a(appUpdateOptions.mo59544b()))) {
            return false;
        }
        if (appUpdateOptions.mo59544b() == 1) {
            this.f51119l = true;
            this.f51120m = 1;
        } else {
            this.f51118k = true;
            this.f51120m = 0;
        }
        return true;
    }

    /* renamed from: a */
    public Task<AppUpdateInfo> mo59541a() {
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent3;
        PendingIntent pendingIntent4;
        PendingIntent pendingIntent5;
        PendingIntent pendingIntent6;
        int i = this.f51111d;
        if (i != 0) {
            return Tasks.m71249b(new InstallException(i));
        }
        if (m70412d() == 2) {
            if (this.f51109b.contains(0)) {
                pendingIntent6 = PendingIntent.getBroadcast(this.f51108a, 0, new Intent(), m70411c());
                pendingIntent5 = PendingIntent.getBroadcast(this.f51108a, 0, new Intent(), m70411c());
            } else {
                pendingIntent6 = null;
                pendingIntent5 = null;
            }
            if (this.f51109b.contains(1)) {
                PendingIntent broadcast = PendingIntent.getBroadcast(this.f51108a, 0, new Intent(), m70411c());
                pendingIntent3 = pendingIntent6;
                pendingIntent2 = PendingIntent.getBroadcast(this.f51108a, 0, new Intent(), m70411c());
                pendingIntent4 = broadcast;
            } else {
                pendingIntent3 = pendingIntent6;
                pendingIntent4 = null;
                pendingIntent2 = null;
            }
            pendingIntent = pendingIntent5;
        } else {
            pendingIntent4 = null;
            pendingIntent3 = null;
            pendingIntent2 = null;
            pendingIntent = null;
        }
        return Tasks.m71250c(AppUpdateInfo.m70394e(this.f51108a.getPackageName(), this.f51113f, m70412d(), this.f51110c, this.f51114g, this.f51115h, this.f51116i, this.f51117j, 0, 0, pendingIntent4, pendingIntent3, pendingIntent2, pendingIntent));
    }

    /* renamed from: b */
    public boolean mo59542b(AppUpdateInfo appUpdateInfo, @AppUpdateType int i, Activity activity, int i2) {
        return m70413e(appUpdateInfo, AppUpdateOptions.m70406d(i).mo59545a());
    }
}
