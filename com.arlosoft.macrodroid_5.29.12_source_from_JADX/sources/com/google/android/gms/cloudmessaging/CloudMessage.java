package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class CloudMessage extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<CloudMessage> CREATOR = new zza();
    @SafeParcelable.Field
    @NonNull

    /* renamed from: a */
    Intent f2962a;

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    public @interface MessagePriority {
    }

    @SafeParcelable.Constructor
    public CloudMessage(@SafeParcelable.Param @NonNull Intent intent) {
        this.f2962a = intent;
    }

    @NonNull
    /* renamed from: l2 */
    public Intent mo21067l2() {
        return this.f2962a;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f2962a, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
