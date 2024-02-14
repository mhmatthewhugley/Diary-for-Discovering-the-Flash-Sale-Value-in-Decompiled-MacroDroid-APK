package com.getpebble.android.kit;

import android.net.Uri;
import java.util.UUID;

/* renamed from: com.getpebble.android.kit.a */
/* compiled from: Constants */
public final class C6909a {

    /* renamed from: a */
    public static final UUID f16157a = UUID.fromString("4dab81a6-d2fc-458a-992c-7a1f3b96a970");

    /* renamed from: b */
    public static final UUID f16158b = UUID.fromString("cf1e816a-9db0-4511-bbb8-f60c48ca8fac");

    /* renamed from: c */
    static final Uri f16159c = Uri.parse("content://com.getpebble.android.provider/state");

    /* renamed from: d */
    static final Uri f16160d = Uri.parse("content://com.getpebble.android.provider.basalt/state");

    /* renamed from: com.getpebble.android.kit.a$a */
    /* compiled from: Constants */
    public enum C6910a {
        BYTES(0),
        UINT(2),
        INT(3),
        INVALID(255);
        
        public final byte ord;

        private C6910a(int i) {
            this.ord = (byte) i;
        }

        /* renamed from: b */
        public static C6910a m26100b(byte b) {
            for (C6910a aVar : values()) {
                if (aVar.ord == b) {
                    return aVar;
                }
            }
            return null;
        }
    }
}
