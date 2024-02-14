package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.messaging.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11297a implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ EnhancedIntentService f55079a;

    /* renamed from: c */
    public final /* synthetic */ Intent f55080c;

    public /* synthetic */ C11297a(EnhancedIntentService enhancedIntentService, Intent intent) {
        this.f55079a = enhancedIntentService;
        this.f55080c = intent;
    }

    /* renamed from: a */
    public final void mo21120a(Task task) {
        this.f55079a.m76818h(this.f55080c, task);
    }
}
