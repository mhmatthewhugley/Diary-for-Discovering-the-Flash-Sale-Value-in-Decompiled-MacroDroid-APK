package com.google.android.gms.wearable;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.wearable.internal.zzah;
import com.google.android.gms.wearable.internal.zzau;
import com.google.android.gms.wearable.internal.zzce;
import com.google.android.gms.wearable.internal.zzct;
import com.google.android.gms.wearable.internal.zzfl;
import com.google.android.gms.wearable.internal.zzgd;
import com.google.android.gms.wearable.internal.zzh;
import com.google.android.gms.wearable.internal.zzhk;
import com.google.android.gms.wearable.internal.zziw;
import com.google.android.gms.wearable.internal.zzk;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public class Wearable {
    @NonNull
    @Deprecated

    /* renamed from: a */
    public static final DataApi f48091a = new zzct();
    @NonNull
    @Deprecated

    /* renamed from: b */
    public static final CapabilityApi f48092b = new zzah();
    @NonNull
    @Deprecated

    /* renamed from: c */
    public static final MessageApi f48093c = new zzfl();
    @NonNull
    @Deprecated

    /* renamed from: d */
    public static final NodeApi f48094d = new zzgd();
    @NonNull
    @Deprecated

    /* renamed from: e */
    public static final ChannelApi f48095e = new zzau();
    @NonNull
    @Deprecated

    /* renamed from: f */
    public static final Api<WearableOptions> f48096f;

    /* renamed from: g */
    private static final Api.ClientKey f48097g;

    /* renamed from: h */
    private static final Api.AbstractClientBuilder f48098h;
    @ShowFirstParty
    @Deprecated

    /* renamed from: i */
    public static final zzk f48099i = new zzk();
    @ShowFirstParty
    @Deprecated

    /* renamed from: j */
    public static final zzh f48100j = new zzh();
    @ShowFirstParty
    @Deprecated

    /* renamed from: k */
    public static final zzce f48101k = new zzce();
    @ShowFirstParty
    @Deprecated

    /* renamed from: l */
    public static final zzhk f48102l = new zzhk();
    @ShowFirstParty
    @Deprecated

    /* renamed from: m */
    public static final zziw f48103m = new zziw();

    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public static final class WearableOptions implements Api.ApiOptions.Optional {

        /* renamed from: c */
        static final WearableOptions f48104c = new WearableOptions(new Builder());

        /* renamed from: a */
        private final Looper f48105a;

        /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
        public static class Builder {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public Looper f48106a;
        }

        private WearableOptions(Builder builder) {
            this.f48105a = builder.f48106a;
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof WearableOptions;
        }

        public int hashCode() {
            return Objects.m4471b(WearableOptions.class);
        }
    }

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f48097g = clientKey;
        zzh zzh = new zzh();
        f48098h = zzh;
        f48096f = new Api<>("Wearable.API", zzh, clientKey);
    }

    private Wearable() {
    }
}
