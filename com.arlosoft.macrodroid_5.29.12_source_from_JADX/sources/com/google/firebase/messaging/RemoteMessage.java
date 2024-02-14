package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new RemoteMessageCreator();
    @SafeParcelable.Field

    /* renamed from: a */
    Bundle f55015a;

    /* renamed from: c */
    private Map<String, String> f55016c;

    public static class Builder {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    public static class Notification {
    }

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param Bundle bundle) {
        this.f55015a = bundle;
    }

    @NonNull
    /* renamed from: l2 */
    public Map<String, String> mo63392l2() {
        if (this.f55016c == null) {
            this.f55016c = Constants.MessagePayloadKeys.m76808a(this.f55015a);
        }
        return this.f55016c;
    }

    @Nullable
    /* renamed from: m2 */
    public String mo63393m2() {
        return this.f55015a.getString(TypedValues.Transition.S_FROM);
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        RemoteMessageCreator.m76995c(this, parcel, i);
    }
}
