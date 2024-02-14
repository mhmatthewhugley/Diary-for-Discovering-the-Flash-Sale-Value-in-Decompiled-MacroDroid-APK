package com.google.android.gms.common.server.response;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.Stack;

@ShowFirstParty
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class FastParser<T extends FastJsonResponse> {

    /* renamed from: g */
    private static final char[] f3872g = {'u', 'l', 'l'};

    /* renamed from: h */
    private static final char[] f3873h = {'r', 'u', 'e'};

    /* renamed from: i */
    private static final char[] f3874i = {'r', 'u', 'e', '\"'};

    /* renamed from: j */
    private static final char[] f3875j = {'a', 'l', 's', 'e'};

    /* renamed from: k */
    private static final char[] f3876k = {'a', 'l', 's', 'e', '\"'};

    /* renamed from: l */
    private static final char[] f3877l = {10};

    /* renamed from: m */
    private static final zai f3878m = new zaa();

    /* renamed from: n */
    private static final zai f3879n = new zab();

    /* renamed from: o */
    private static final zai f3880o = new zac();

    /* renamed from: p */
    private static final zai f3881p = new zad();

    /* renamed from: q */
    private static final zai f3882q = new zae();

    /* renamed from: r */
    private static final zai f3883r = new zaf();

    /* renamed from: s */
    private static final zai f3884s = new zag();

    /* renamed from: t */
    private static final zai f3885t = new zah();

    /* renamed from: a */
    private final char[] f3886a = new char[1];

    /* renamed from: b */
    private final char[] f3887b = new char[32];

    /* renamed from: c */
    private final char[] f3888c = new char[1024];

    /* renamed from: d */
    private final StringBuilder f3889d = new StringBuilder(32);

    /* renamed from: e */
    private final StringBuilder f3890e = new StringBuilder(1024);

    /* renamed from: f */
    private final Stack f3891f = new Stack();

    @ShowFirstParty
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class ParseException extends Exception {
    }
}
