package com.google.android.gms.internal.p203authapi;

import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.internal.auth-api.zzay */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzay {

    /* renamed from: a */
    public static final Feature f39137a;

    /* renamed from: b */
    public static final Feature f39138b;

    /* renamed from: c */
    private static final Feature f39139c;

    /* renamed from: d */
    private static final Feature f39140d;

    /* renamed from: e */
    public static final Feature f39141e;

    /* renamed from: f */
    public static final Feature f39142f;

    /* renamed from: g */
    private static final Feature f39143g;

    /* renamed from: h */
    public static final Feature[] f39144h;

    static {
        Feature feature = new Feature("auth_api_credentials_begin_sign_in", 4);
        f39137a = feature;
        Feature feature2 = new Feature("auth_api_credentials_sign_out", 2);
        f39138b = feature2;
        Feature feature3 = new Feature("auth_api_credentials_authorize", 1);
        f39139c = feature3;
        Feature feature4 = new Feature("auth_api_credentials_revoke_access", 1);
        f39140d = feature4;
        Feature feature5 = new Feature("auth_api_credentials_save_password", 3);
        f39141e = feature5;
        Feature feature6 = new Feature("auth_api_credentials_get_sign_in_intent", 3);
        f39142f = feature6;
        Feature feature7 = new Feature("auth_api_credentials_save_account_linking_token", 2);
        f39143g = feature7;
        f39144h = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7};
    }
}
