package com.google.firebase.firestore.core;

import com.google.firebase.firestore.ListenerRegistration;

public class ListenerRegistrationImpl implements ListenerRegistration {

    /* renamed from: a */
    private final FirestoreClient f5935a;

    /* renamed from: b */
    private final QueryListener f5936b;

    /* renamed from: c */
    private final AsyncEventListener<ViewSnapshot> f5937c;

    public void remove() {
        this.f5937c.mo23808c();
        this.f5935a.mo23870v(this.f5936b);
    }
}
