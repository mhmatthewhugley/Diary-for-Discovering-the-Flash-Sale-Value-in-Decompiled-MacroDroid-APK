package com.google.firebase.messaging;

import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.RequestDeduplicator;
import com.google.firebase.messaging.Store;

/* renamed from: com.google.firebase.messaging.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11311l implements RequestDeduplicator.GetTokenRequest {

    /* renamed from: a */
    public final /* synthetic */ FirebaseMessaging f55101a;

    /* renamed from: b */
    public final /* synthetic */ String f55102b;

    /* renamed from: c */
    public final /* synthetic */ Store.Token f55103c;

    public /* synthetic */ C11311l(FirebaseMessaging firebaseMessaging, String str, Store.Token token) {
        this.f55101a = firebaseMessaging;
        this.f55102b = str;
        this.f55103c = token;
    }

    public final Task start() {
        return this.f55101a.m76867w(this.f55102b, this.f55103c);
    }
}
