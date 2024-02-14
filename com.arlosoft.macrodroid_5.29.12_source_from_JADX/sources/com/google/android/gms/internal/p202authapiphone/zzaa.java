package com.google.android.gms.internal.p202authapiphone;

import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzaa */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public final class zzaa {

    /* renamed from: a */
    public static final Feature f39096a;

    /* renamed from: b */
    public static final Feature f39097b;

    /* renamed from: c */
    public static final Feature f39098c;

    /* renamed from: d */
    public static final Feature[] f39099d;

    static {
        Feature feature = new Feature("sms_code_autofill", 2);
        f39096a = feature;
        Feature feature2 = new Feature("sms_retrieve", 1);
        f39097b = feature2;
        Feature feature3 = new Feature("user_consent", 3);
        f39098c = feature3;
        f39099d = new Feature[]{feature, feature2, feature3};
    }
}
