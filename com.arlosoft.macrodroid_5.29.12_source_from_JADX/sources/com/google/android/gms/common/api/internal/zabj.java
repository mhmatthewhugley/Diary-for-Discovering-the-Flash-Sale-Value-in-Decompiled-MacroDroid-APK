package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import com.google.android.gms.internal.base.zat;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zabj {

    /* renamed from: a */
    private static final ExecutorService f3363a = zat.m55868a().mo48608a(2, new NumberedThreadFactory("GAC_Executor"), 2);

    /* renamed from: a */
    public static ExecutorService m4076a() {
        return f3363a;
    }
}
