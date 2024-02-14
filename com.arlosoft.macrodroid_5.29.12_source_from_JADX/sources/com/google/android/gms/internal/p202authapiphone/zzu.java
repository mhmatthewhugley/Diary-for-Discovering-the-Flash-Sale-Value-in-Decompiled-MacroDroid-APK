package com.google.android.gms.internal.p202authapiphone;

import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzu */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public final class zzu extends SmsRetrieverClient {
    public zzu(Context context) {
        super(context);
    }

    /* renamed from: G */
    public final Task<Void> mo20951G() {
        return mo21235u(TaskApiCall.m3866c().mo21406b(new zzx(this)).mo21408d(zzaa.f39097b).mo21405a());
    }
}
