package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.messaging.z */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11325z implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ Intent f55178a;

    public /* synthetic */ C11325z(Intent intent) {
        this.f55178a = intent;
    }

    /* renamed from: a */
    public final void mo21120a(Task task) {
        WakeLockHolder.m77080c(this.f55178a);
    }
}
