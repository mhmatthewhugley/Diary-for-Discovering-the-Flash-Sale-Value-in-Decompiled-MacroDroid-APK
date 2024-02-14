package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzcg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcg> CREATOR = new zzch();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f47808a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    public final zzo f47809c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final zzr f47810d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    public final PendingIntent f47811f;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: g */
    public final int f47812g;
    @SafeParcelable.Field
    @Deprecated
    @Nullable

    /* renamed from: o */
    public final String f47813o;
    @SafeParcelable.Field
    @Deprecated
    @Nullable

    /* renamed from: p */
    public final String f47814p;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: s */
    public final boolean f47815s;
    @SafeParcelable.Field
    @Deprecated
    @Nullable

    /* renamed from: z */
    public final ClientAppContext f47816z;

    @VisibleForTesting(otherwise = 3)
    @SafeParcelable.Constructor
    public zzcg(@SafeParcelable.Param int i, @SafeParcelable.Param @Nullable IBinder iBinder, @SafeParcelable.Param IBinder iBinder2, @SafeParcelable.Param @Nullable PendingIntent pendingIntent, @SafeParcelable.Param int i2, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param boolean z, @SafeParcelable.Param @Nullable ClientAppContext clientAppContext) {
        zzo zzo;
        this.f47808a = i;
        zzr zzr = null;
        if (iBinder == null) {
            zzo = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            zzo = queryLocalInterface instanceof zzo ? (zzo) queryLocalInterface : new zzm(iBinder);
        }
        this.f47809c = zzo;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzr = queryLocalInterface2 instanceof zzr ? (zzr) queryLocalInterface2 : new zzp(iBinder2);
        }
        this.f47810d = zzr;
        this.f47811f = pendingIntent;
        this.f47812g = i2;
        this.f47813o = str;
        this.f47814p = str2;
        this.f47815s = z;
        this.f47816z = ClientAppContext.m66435l2(clientAppContext, str2, str, z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f47808a);
        zzo zzo = this.f47809c;
        if (zzo == null) {
            iBinder = null;
        } else {
            iBinder = zzo.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 2, iBinder, false);
        SafeParcelWriter.m4575m(parcel, 3, this.f47810d.asBinder(), false);
        SafeParcelWriter.m4584v(parcel, 4, this.f47811f, i, false);
        SafeParcelWriter.m4576n(parcel, 5, this.f47812g);
        SafeParcelWriter.m4586x(parcel, 6, this.f47813o, false);
        SafeParcelWriter.m4586x(parcel, 7, this.f47814p, false);
        SafeParcelWriter.m4565c(parcel, 8, this.f47815s);
        SafeParcelWriter.m4584v(parcel, 9, this.f47816z, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public zzcg(IBinder iBinder, IBinder iBinder2, @Nullable PendingIntent pendingIntent) {
        this(1, iBinder, iBinder2, pendingIntent, 0, (String) null, (String) null, false, (ClientAppContext) null);
    }
}
