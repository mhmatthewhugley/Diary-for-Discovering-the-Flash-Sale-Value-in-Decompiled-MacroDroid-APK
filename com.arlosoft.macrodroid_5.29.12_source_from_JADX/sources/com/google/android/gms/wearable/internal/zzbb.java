package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.wearable.Channel;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final /* synthetic */ class zzbb implements PendingResultUtil.ResultConverter {

    /* renamed from: a */
    public static final /* synthetic */ zzbb f48158a = new zzbb();

    private /* synthetic */ zzbb() {
    }

    /* renamed from: a */
    public final Object mo20769a(Result result) {
        return ((Channel.GetOutputStreamResult) result).getOutputStream();
    }
}
