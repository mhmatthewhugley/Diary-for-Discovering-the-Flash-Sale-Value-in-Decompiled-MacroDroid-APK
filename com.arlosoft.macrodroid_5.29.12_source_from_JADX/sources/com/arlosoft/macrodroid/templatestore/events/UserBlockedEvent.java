package com.arlosoft.macrodroid.templatestore.events;

/* compiled from: UserBlockedEvent.kt */
public final class UserBlockedEvent {

    /* renamed from: a */
    private final int f13050a;

    public UserBlockedEvent(int i) {
        this.f13050a = i;
    }

    /* renamed from: a */
    public final int mo30174a() {
        return this.f13050a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserBlockedEvent) && this.f13050a == ((UserBlockedEvent) obj).f13050a;
    }

    public int hashCode() {
        return this.f13050a;
    }

    public String toString() {
        return "UserBlockedEvent(userId=" + this.f13050a + ')';
    }
}
