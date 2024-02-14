package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.IntentSender;
import androidx.annotation.NonNull;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.tasks.Task;

/* compiled from: com.google.android.play:core@@1.10.3 */
public interface AppUpdateManager {
    @NonNull
    /* renamed from: a */
    Task<AppUpdateInfo> mo59541a();

    /* renamed from: b */
    boolean mo59542b(@NonNull AppUpdateInfo appUpdateInfo, @AppUpdateType int i, @NonNull Activity activity, int i2) throws IntentSender.SendIntentException;
}
