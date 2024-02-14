package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private final ExecutorService f2963a;

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    public static final class IntentActionKeys {
        private IntentActionKeys() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    public static final class IntentKeys {
        private IntentKeys() {
        }
    }

    public CloudMessagingReceiver() {
        zze.m55870a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f2963a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @WorkerThread
    /* renamed from: e */
    private final int m3425e(@NonNull Context context, @NonNull Intent intent) {
        Task<Void> task;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            task = Tasks.m66667f(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            task = zzs.m3463b(context).mo21115c(2, bundle);
        }
        int b = mo21070b(context, new CloudMessage(intent));
        try {
            Tasks.m66663b(task, TimeUnit.SECONDS.toMillis(1), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Message ack failed: ");
            sb.append(valueOf);
            Log.w("CloudMessagingReceiver", sb.toString());
        }
        return b;
    }

    @WorkerThread
    /* renamed from: f */
    private final int m3426f(@NonNull Context context, @NonNull Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            mo21071c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: a */
    public Executor mo21069a() {
        return this.f2963a;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: b */
    public abstract int mo21070b(@NonNull Context context, @NonNull CloudMessage cloudMessage);

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: c */
    public void mo21071c(@NonNull Context context, @NonNull Bundle bundle) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo21072d(@NonNull Intent intent, @NonNull Context context, boolean z, @NonNull BroadcastReceiver.PendingResult pendingResult) {
        int i;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                i = m3426f(context, intent2);
            } else {
                i = m3425e(context, intent);
            }
            if (z) {
                pendingResult.setResultCode(i);
            }
        } finally {
            pendingResult.finish();
        }
    }

    public final void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (intent != null) {
            mo21069a().execute(new zze(this, intent, context, isOrderedBroadcast(), goAsync()));
        }
    }
}
