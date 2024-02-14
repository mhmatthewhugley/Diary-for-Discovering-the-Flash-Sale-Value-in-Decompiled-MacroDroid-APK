package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.Store;

/* renamed from: com.google.firebase.messaging.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11307h implements SuccessContinuation {

    /* renamed from: a */
    public final /* synthetic */ FirebaseMessaging f55095a;

    /* renamed from: b */
    public final /* synthetic */ String f55096b;

    /* renamed from: c */
    public final /* synthetic */ Store.Token f55097c;

    public /* synthetic */ C11307h(FirebaseMessaging firebaseMessaging, String str, Store.Token token) {
        this.f55095a = firebaseMessaging;
        this.f55096b = str;
        this.f55097c = token;
    }

    /* renamed from: a */
    public final Task mo21121a(Object obj) {
        return this.f55095a.m76868x(this.f55096b, this.f55097c, (String) obj);
    }
}
