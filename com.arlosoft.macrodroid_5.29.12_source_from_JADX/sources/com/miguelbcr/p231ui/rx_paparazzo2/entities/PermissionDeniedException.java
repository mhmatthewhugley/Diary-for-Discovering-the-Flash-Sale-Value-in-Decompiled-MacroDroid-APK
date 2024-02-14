package com.miguelbcr.p231ui.rx_paparazzo2.entities;

/* renamed from: com.miguelbcr.ui.rx_paparazzo2.entities.PermissionDeniedException */
public class PermissionDeniedException extends RuntimeException {
    private int code;

    public PermissionDeniedException(int i) {
        this.code = i;
    }

    /* renamed from: a */
    public int mo65799a() {
        return this.code;
    }
}
