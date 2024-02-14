package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

public class FirebaseMessagingService extends EnhancedIntentService {

    /* renamed from: o */
    private static final Queue<String> f54998o = new ArrayDeque(10);

    /* renamed from: l */
    private boolean m76889l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = f54998o;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Received duplicate message: ");
            sb.append(str);
            return true;
        }
    }

    /* renamed from: m */
    private void m76890m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (NotificationParams.m76958t(extras)) {
            NotificationParams notificationParams = new NotificationParams(extras);
            ExecutorService e = FcmExecutors.m76840e();
            try {
                if (!new DisplayNotification(this, notificationParams, e).mo63325a()) {
                    e.shutdown();
                    if (MessagingAnalytics.m76920A(intent)) {
                        MessagingAnalytics.m76941t(intent);
                    }
                } else {
                    return;
                }
            } finally {
                e.shutdown();
            }
        }
        mo27667q(new RemoteMessage(extras));
    }

    /* renamed from: n */
    private String m76891n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    /* renamed from: o */
    private void m76892o(Intent intent) {
        if (!m76889l(intent.getStringExtra("google.message_id"))) {
            m76893u(intent);
        }
    }

    /* renamed from: u */
    private void m76893u(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        char c = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                mo63357p();
                return;
            case 1:
                MessagingAnalytics.m76943v(intent);
                m76890m(intent);
                return;
            case 2:
                mo63359t(m76891n(intent), new SendException(intent.getStringExtra("error")));
                return;
            case 3:
                mo63358r(intent.getStringExtra("google.message_id"));
                return;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                return;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Intent mo63326e(Intent intent) {
        return ServiceStarter.m77003b().mo63401c();
    }

    /* renamed from: f */
    public void mo63327f(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            m76892o(intent);
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            mo27668s(intent.getStringExtra("token"));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown intent action: ");
            sb.append(intent.getAction());
        }
    }

    @WorkerThread
    /* renamed from: p */
    public void mo63357p() {
    }

    @WorkerThread
    /* renamed from: q */
    public void mo27667q(@NonNull RemoteMessage remoteMessage) {
    }

    @WorkerThread
    /* renamed from: r */
    public void mo63358r(@NonNull String str) {
    }

    @WorkerThread
    /* renamed from: s */
    public void mo27668s(@NonNull String str) {
    }

    @WorkerThread
    /* renamed from: t */
    public void mo63359t(@NonNull String str, @NonNull Exception exc) {
    }
}
