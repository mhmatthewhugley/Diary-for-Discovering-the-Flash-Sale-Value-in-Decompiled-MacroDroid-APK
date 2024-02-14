package com.google.api.client.googleapis.notifications;

import com.google.api.client.util.Beta;

@Beta
public class TypedNotification<T> extends AbstractNotification {

    /* renamed from: i */
    private T f52340i;

    public String toString() {
        return super.mo60293a().mo60778a("content", this.f52340i).toString();
    }
}
