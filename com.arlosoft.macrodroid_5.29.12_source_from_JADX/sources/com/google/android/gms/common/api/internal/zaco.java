package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import com.google.android.gms.internal.base.zat;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaco {

    /* renamed from: a */
    private static final ExecutorService f3421a = zat.m55868a().mo48609b(new NumberedThreadFactory("GAC_Transform"), 1);

    /* renamed from: a */
    public static ExecutorService m4166a() {
        return f3421a;
    }
}
