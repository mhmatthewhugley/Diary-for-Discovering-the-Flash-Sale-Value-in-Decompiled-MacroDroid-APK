package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class SubscribeRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<SubscribeRequest> CREATOR = new zzcd();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: A */
    public final byte[] f47682A;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: B */
    public final boolean f47683B;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: C */
    public final zzab f47684C;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: D */
    public final boolean f47685D;
    @SafeParcelable.Field
    @NonNull
    @Deprecated

    /* renamed from: E */
    public final ClientAppContext f47686E;
    @SafeParcelable.Field

    /* renamed from: F */
    public final boolean f47687F;
    @SafeParcelable.Field

    /* renamed from: G */
    public final int f47688G;
    @SafeParcelable.Field

    /* renamed from: H */
    public final int f47689H;
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f47690a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    public final zzo f47691c;
    @SafeParcelable.Field
    @NonNull

    /* renamed from: d */
    public final Strategy f47692d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final zzr f47693f;
    @SafeParcelable.Field
    @NonNull

    /* renamed from: g */
    public final MessageFilter f47694g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    public final PendingIntent f47695o;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: p */
    public final int f47696p;
    @SafeParcelable.Field
    @Deprecated
    @Nullable

    /* renamed from: s */
    public final String f47697s;
    @SafeParcelable.Field
    @Deprecated
    @Nullable

    /* renamed from: z */
    public final String f47698z;

    /* JADX WARNING: type inference failed for: r1v14, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SubscribeRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param int r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r12, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.NonNull com.google.android.gms.nearby.messages.Strategy r13, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.NonNull android.os.IBinder r14, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.NonNull com.google.android.gms.nearby.messages.MessageFilter r15, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.app.PendingIntent r16, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param int r17, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable java.lang.String r18, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable java.lang.String r19, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable byte[] r20, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param boolean r21, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r22, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param boolean r23, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable com.google.android.gms.nearby.messages.internal.ClientAppContext r24, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param boolean r25, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param int r26, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param int r27) {
        /*
            r10 = this;
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r10.<init>()
            r7 = r11
            r0.f47690a = r7
            r7 = 0
            if (r1 != 0) goto L_0x0016
            r8 = r7
            goto L_0x0028
        L_0x0016:
            java.lang.String r8 = "com.google.android.gms.nearby.messages.internal.IMessageListener"
            android.os.IInterface r8 = r12.queryLocalInterface(r8)
            boolean r9 = r8 instanceof com.google.android.gms.nearby.messages.internal.zzo
            if (r9 == 0) goto L_0x0023
            com.google.android.gms.nearby.messages.internal.zzo r8 = (com.google.android.gms.nearby.messages.internal.zzo) r8
            goto L_0x0028
        L_0x0023:
            com.google.android.gms.nearby.messages.internal.zzm r8 = new com.google.android.gms.nearby.messages.internal.zzm
            r8.<init>(r12)
        L_0x0028:
            r0.f47691c = r8
            r1 = r13
            r0.f47692d = r1
            if (r2 != 0) goto L_0x0031
            r1 = r7
            goto L_0x0043
        L_0x0031:
            java.lang.String r1 = "com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback"
            android.os.IInterface r1 = r14.queryLocalInterface(r1)
            boolean r8 = r1 instanceof com.google.android.gms.nearby.messages.internal.zzr
            if (r8 == 0) goto L_0x003e
            com.google.android.gms.nearby.messages.internal.zzr r1 = (com.google.android.gms.nearby.messages.internal.zzr) r1
            goto L_0x0043
        L_0x003e:
            com.google.android.gms.nearby.messages.internal.zzp r1 = new com.google.android.gms.nearby.messages.internal.zzp
            r1.<init>(r14)
        L_0x0043:
            r0.f47693f = r1
            r1 = r15
            r0.f47694g = r1
            r1 = r16
            r0.f47695o = r1
            r1 = r17
            r0.f47696p = r1
            r0.f47697s = r3
            r0.f47698z = r4
            r1 = r20
            r0.f47682A = r1
            r1 = r21
            r0.f47683B = r1
            if (r5 != 0) goto L_0x005f
            goto L_0x0072
        L_0x005f:
            java.lang.String r1 = "com.google.android.gms.nearby.messages.internal.ISubscribeCallback"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.nearby.messages.internal.zzab
            if (r2 == 0) goto L_0x006d
            r7 = r1
            com.google.android.gms.nearby.messages.internal.zzab r7 = (com.google.android.gms.nearby.messages.internal.zzab) r7
            goto L_0x0072
        L_0x006d:
            com.google.android.gms.nearby.messages.internal.zzz r7 = new com.google.android.gms.nearby.messages.internal.zzz
            r7.<init>(r5)
        L_0x0072:
            r0.f47684C = r7
            r0.f47685D = r6
            r1 = r24
            com.google.android.gms.nearby.messages.internal.ClientAppContext r1 = com.google.android.gms.nearby.messages.internal.ClientAppContext.m66435l2(r1, r4, r3, r6)
            r0.f47686E = r1
            r1 = r25
            r0.f47687F = r1
            r1 = r26
            r0.f47688G = r1
            r1 = r27
            r0.f47689H = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.messages.internal.SubscribeRequest.<init>(int, android.os.IBinder, com.google.android.gms.nearby.messages.Strategy, android.os.IBinder, com.google.android.gms.nearby.messages.MessageFilter, android.app.PendingIntent, int, java.lang.String, java.lang.String, byte[], boolean, android.os.IBinder, boolean, com.google.android.gms.nearby.messages.internal.ClientAppContext, boolean, int, int):void");
    }

    @NonNull
    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.f47691c);
        String valueOf2 = String.valueOf(this.f47692d);
        String valueOf3 = String.valueOf(this.f47693f);
        String valueOf4 = String.valueOf(this.f47694g);
        String valueOf5 = String.valueOf(this.f47695o);
        byte[] bArr = this.f47682A;
        if (bArr == null) {
            str = null;
        } else {
            str = "<" + bArr.length + " bytes>";
        }
        return "SubscribeRequest{messageListener=" + valueOf + ", strategy=" + valueOf2 + ", callback=" + valueOf3 + ", filter=" + valueOf4 + ", pendingIntent=" + valueOf5 + ", hint=" + str + ", subscribeCallback=" + String.valueOf(this.f47684C) + ", useRealClientApiKey=" + this.f47685D + ", clientAppContext=" + String.valueOf(this.f47686E) + ", isDiscardPendingIntent=" + this.f47687F + ", zeroPartyPackageName=" + this.f47697s + ", realClientPackageName=" + this.f47698z + ", isIgnoreNearbyPermission=" + this.f47683B + ", callingContext=" + this.f47689H + "}";
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f47690a);
        zzo zzo = this.f47691c;
        IBinder iBinder3 = null;
        if (zzo == null) {
            iBinder = null;
        } else {
            iBinder = zzo.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 2, iBinder, false);
        SafeParcelWriter.m4584v(parcel, 3, this.f47692d, i, false);
        zzr zzr = this.f47693f;
        if (zzr == null) {
            iBinder2 = null;
        } else {
            iBinder2 = zzr.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 4, iBinder2, false);
        SafeParcelWriter.m4584v(parcel, 5, this.f47694g, i, false);
        SafeParcelWriter.m4584v(parcel, 6, this.f47695o, i, false);
        SafeParcelWriter.m4576n(parcel, 7, this.f47696p);
        SafeParcelWriter.m4586x(parcel, 8, this.f47697s, false);
        SafeParcelWriter.m4586x(parcel, 9, this.f47698z, false);
        SafeParcelWriter.m4569g(parcel, 10, this.f47682A, false);
        SafeParcelWriter.m4565c(parcel, 11, this.f47683B);
        zzab zzab = this.f47684C;
        if (zzab != null) {
            iBinder3 = zzab.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 12, iBinder3, false);
        SafeParcelWriter.m4565c(parcel, 13, this.f47685D);
        SafeParcelWriter.m4584v(parcel, 14, this.f47686E, i, false);
        SafeParcelWriter.m4565c(parcel, 15, this.f47687F);
        SafeParcelWriter.m4576n(parcel, 16, this.f47688G);
        SafeParcelWriter.m4576n(parcel, 17, this.f47689H);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public SubscribeRequest(@Nullable IBinder iBinder, @NonNull Strategy strategy, @NonNull IBinder iBinder2, @NonNull MessageFilter messageFilter, @Nullable PendingIntent pendingIntent, @Nullable byte[] bArr, @Nullable IBinder iBinder3, boolean z, int i, int i2) {
        this(3, iBinder, strategy, iBinder2, messageFilter, pendingIntent, 0, (String) null, (String) null, (byte[]) null, false, iBinder3, false, (ClientAppContext) null, false, 0, i2);
    }
}
