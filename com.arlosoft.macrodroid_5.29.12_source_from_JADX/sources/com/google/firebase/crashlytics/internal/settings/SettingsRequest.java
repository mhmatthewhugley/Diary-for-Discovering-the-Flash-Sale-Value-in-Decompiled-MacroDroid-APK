package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.InstallIdProvider;

class SettingsRequest {

    /* renamed from: a */
    public final String f5507a;

    /* renamed from: b */
    public final String f5508b;

    /* renamed from: c */
    public final String f5509c;

    /* renamed from: d */
    public final String f5510d;

    /* renamed from: e */
    public final InstallIdProvider f5511e;

    /* renamed from: f */
    public final String f5512f;

    /* renamed from: g */
    public final String f5513g;

    /* renamed from: h */
    public final String f5514h;

    /* renamed from: i */
    public final int f5515i;

    public SettingsRequest(String str, String str2, String str3, String str4, InstallIdProvider installIdProvider, String str5, String str6, String str7, int i) {
        this.f5507a = str;
        this.f5508b = str2;
        this.f5509c = str3;
        this.f5510d = str4;
        this.f5511e = installIdProvider;
        this.f5512f = str5;
        this.f5513g = str6;
        this.f5514h = str7;
        this.f5515i = i;
    }
}
