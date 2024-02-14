package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public class ActivityTransitionResult extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new zzp();
    @SafeParcelable.Field

    /* renamed from: a */
    private final List<ActivityTransitionEvent> f45802a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private Bundle f45803c;

    public ActivityTransitionResult(@SafeParcelable.Param @NonNull List<ActivityTransitionEvent> list) {
        this.f45803c = null;
        Preconditions.m4489l(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                Preconditions.m4478a(list.get(i).mo54132m2() >= list.get(i + -1).mo54132m2());
            }
        }
        this.f45802a = Collections.unmodifiableList(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f45802a.equals(((ActivityTransitionResult) obj).f45802a);
    }

    public int hashCode() {
        return this.f45802a.hashCode();
    }

    @NonNull
    /* renamed from: l2 */
    public List<ActivityTransitionEvent> mo54142l2() {
        return this.f45802a;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.m4488k(parcel);
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4558B(parcel, 1, mo54142l2(), false);
        SafeParcelWriter.m4567e(parcel, 2, this.f45803c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @ShowFirstParty
    @SafeParcelable.Constructor
    public ActivityTransitionResult(@SafeParcelable.Param @NonNull List<ActivityTransitionEvent> list, @SafeParcelable.Param @Nullable Bundle bundle) {
        this(list);
        this.f45803c = bundle;
    }
}
