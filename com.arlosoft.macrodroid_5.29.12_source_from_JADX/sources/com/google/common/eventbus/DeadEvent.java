package com.google.common.eventbus;

import androidx.core.app.NotificationCompat;
import com.google.common.base.MoreObjects;

@ElementTypesAreNonnullByDefault
public class DeadEvent {

    /* renamed from: a */
    private final Object f17359a;

    /* renamed from: b */
    private final Object f17360b;

    public String toString() {
        return MoreObjects.m5334c(this).mo22194d("source", this.f17359a).mo22194d(NotificationCompat.CATEGORY_EVENT, this.f17360b).toString();
    }
}
