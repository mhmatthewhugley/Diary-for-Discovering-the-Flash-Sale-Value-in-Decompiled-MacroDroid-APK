package com.google.firebase.crashlytics.internal.common;

public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: id */
    private final int f5002id;

    private DeliveryMechanism(int i) {
        this.f5002id = i;
    }

    /* renamed from: b */
    public static DeliveryMechanism m6740b(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    /* renamed from: d */
    public int mo23046d() {
        return this.f5002id;
    }

    public String toString() {
        return Integer.toString(this.f5002id);
    }
}
