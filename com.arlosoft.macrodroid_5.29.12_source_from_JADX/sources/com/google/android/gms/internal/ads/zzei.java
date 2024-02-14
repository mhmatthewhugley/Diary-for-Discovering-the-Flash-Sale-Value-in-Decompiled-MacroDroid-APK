package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzei implements zzdm {
    @Nullable

    /* renamed from: a */
    private Message f34076a;
    @Nullable

    /* renamed from: b */
    private zzej f34077b;

    private zzei() {
    }

    /* synthetic */ zzei(zzeh zzeh) {
    }

    /* renamed from: c */
    private final void m48862c() {
        this.f34076a = null;
        this.f34077b = null;
        zzej.m48937b(this);
    }

    /* renamed from: a */
    public final zzei mo45315a(Message message, zzej zzej) {
        this.f34076a = message;
        this.f34077b = zzej;
        return this;
    }

    /* renamed from: b */
    public final boolean mo45316b(Handler handler) {
        Message message = this.f34076a;
        Objects.requireNonNull(message);
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        m48862c();
        return sendMessageAtFrontOfQueue;
    }

    public final void zza() {
        Message message = this.f34076a;
        Objects.requireNonNull(message);
        message.sendToTarget();
        m48862c();
    }
}
