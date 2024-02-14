package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.biometric.auth.C0271a;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceConnection;

class WithinAppServiceBinder extends Binder {

    /* renamed from: a */
    private final IntentHandler f55070a;

    interface IntentHandler {
        /* renamed from: a */
        Task<Void> mo63333a(Intent intent);
    }

    WithinAppServiceBinder(IntentHandler intentHandler) {
        this.f55070a = intentHandler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo63442c(WithinAppServiceConnection.BindRequest bindRequest) {
        if (Binder.getCallingUid() == Process.myUid()) {
            Log.isLoggable("FirebaseMessaging", 3);
            this.f55070a.mo63333a(bindRequest.f55077a).mo23703d(C0271a.f317a, new C11298a0(bindRequest));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
