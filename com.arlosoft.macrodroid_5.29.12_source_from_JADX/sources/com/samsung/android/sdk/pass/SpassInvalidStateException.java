package com.samsung.android.sdk.pass;

public class SpassInvalidStateException extends IllegalStateException {
    public static final int STATUS_OPERATION_DENIED = 1;

    /* renamed from: a */
    private int f57588a;

    public SpassInvalidStateException(String str, int i) {
        super(str);
        this.f57588a = i;
    }

    public int getType() {
        return this.f57588a;
    }
}
