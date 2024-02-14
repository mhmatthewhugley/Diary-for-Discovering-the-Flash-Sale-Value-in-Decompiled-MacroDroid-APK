package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.MessagingAnalytics;
import java.util.concurrent.ExecutionException;

public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    /* renamed from: g */
    private static Intent m76576g(@NonNull Context context, @NonNull String str, @NonNull Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: b */
    public int mo21070b(@NonNull Context context, @NonNull CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.m66662a(new FcmBroadcastProcessor(context).mo63334i(cloudMessage.mo21067l2()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: c */
    public void mo21071c(@NonNull Context context, @NonNull Bundle bundle) {
        Intent g = m76576g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (MessagingAnalytics.m76920A(g)) {
            MessagingAnalytics.m76940s(g);
        }
    }
}
