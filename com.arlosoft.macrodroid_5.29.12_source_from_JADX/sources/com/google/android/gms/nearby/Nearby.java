package com.google.android.gms.nearby;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.nearby.zzi;
import com.google.android.gms.internal.nearby.zzih;
import com.google.android.gms.internal.nearby.zzji;
import com.google.android.gms.internal.nearby.zzl;
import com.google.android.gms.internal.nearby.zzry;
import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.connection.ConnectionsClient;
import com.google.android.gms.nearby.connection.ConnectionsOptions;
import com.google.android.gms.nearby.messages.Messages;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.internal.zzbx;
import com.google.android.gms.nearby.messages.internal.zzby;
import com.google.android.gms.nearby.messages.zzc;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class Nearby {
    @NonNull
    @Deprecated

    /* renamed from: a */
    public static final Api<ConnectionsOptions> f47361a = new Api<>("Nearby.CONNECTIONS_API", zzji.f44806b, zzji.f44805a);
    @NonNull
    @Deprecated

    /* renamed from: b */
    public static final Connections f47362b = new zzji();
    @NonNull
    @Deprecated

    /* renamed from: c */
    public static final Api<MessagesOptions> f47363c = new Api<>("Nearby.MESSAGES_API", zzbx.f47780c, zzbx.f47779b);
    @NonNull
    @Deprecated

    /* renamed from: d */
    public static final Messages f47364d = zzbx.f47778a;
    @ShowFirstParty

    /* renamed from: e */
    public static final zzc f47365e = new zzby();
    @ShowFirstParty
    @NonNull
    @Deprecated

    /* renamed from: f */
    public static final Api f47366f = new Api("Nearby.BOOTSTRAP_API", zzl.f44848b, zzl.f44847a);
    @ShowFirstParty
    @Deprecated

    /* renamed from: g */
    public static final zzi f47367g = new zzl();

    private Nearby() {
    }

    @NonNull
    /* renamed from: a */
    public static final ConnectionsClient m66236a(@NonNull Context context) {
        Preconditions.m4489l(context, "Context must not be null");
        return new zzih(context, (ConnectionsOptions) null);
    }

    /* renamed from: b */
    public static boolean m66237b(@NonNull Context context) {
        if (Wrappers.m4929a(context).mo21958a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
            return zzry.m62972b(context.getContentResolver(), "gms:nearby:requires_gms_check", true);
        }
        return true;
    }
}
