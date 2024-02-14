package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaq implements PendingResultUtil.ResultConverter {

    /* renamed from: a */
    final /* synthetic */ Response f3725a;

    zaq(Response response) {
        this.f3725a = response;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20769a(Result result) {
        this.f3725a.mo21279f(result);
        return this.f3725a;
    }
}
