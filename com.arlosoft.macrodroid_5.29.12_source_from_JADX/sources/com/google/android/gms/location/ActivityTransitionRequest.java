package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new zzo();
    @NonNull

    /* renamed from: g */
    public static final Comparator<ActivityTransition> f45797g = new zzn();
    @SafeParcelable.Field

    /* renamed from: a */
    private final List<ActivityTransition> f45798a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final String f45799c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final List<ClientIdentity> f45800d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private String f45801f;

    @SafeParcelable.Constructor
    public ActivityTransitionRequest(@SafeParcelable.Param @NonNull List<ActivityTransition> list, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable List<ClientIdentity> list2, @SafeParcelable.Param @Nullable String str2) {
        List<ClientIdentity> list3;
        Preconditions.m4489l(list, "transitions can't be null");
        Preconditions.m4479b(list.size() > 0, "transitions can't be empty.");
        Preconditions.m4488k(list);
        TreeSet treeSet = new TreeSet(f45797g);
        for (ActivityTransition next : list) {
            Preconditions.m4479b(treeSet.add(next), String.format("Found duplicated transition: %s.", new Object[]{next}));
        }
        this.f45798a = Collections.unmodifiableList(list);
        this.f45799c = str;
        if (list2 == null) {
            list3 = Collections.emptyList();
        } else {
            list3 = Collections.unmodifiableList(list2);
        }
        this.f45800d = list3;
        this.f45801f = str2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            return Objects.m4470a(this.f45798a, activityTransitionRequest.f45798a) && Objects.m4470a(this.f45799c, activityTransitionRequest.f45799c) && Objects.m4470a(this.f45801f, activityTransitionRequest.f45801f) && Objects.m4470a(this.f45800d, activityTransitionRequest.f45800d);
        }
    }

    public int hashCode() {
        int hashCode = this.f45798a.hashCode() * 31;
        String str = this.f45799c;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<ClientIdentity> list = this.f45800d;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f45801f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    @NonNull
    public String toString() {
        String valueOf = String.valueOf(this.f45798a);
        String str = this.f45799c;
        String valueOf2 = String.valueOf(this.f45800d);
        String str2 = this.f45801f;
        int length = valueOf.length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + valueOf2.length() + String.valueOf(str2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append("', mClients=");
        sb.append(valueOf2);
        sb.append(", mAttributionTag=");
        sb.append(str2);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.m4488k(parcel);
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4558B(parcel, 1, this.f45798a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f45799c, false);
        SafeParcelWriter.m4558B(parcel, 3, this.f45800d, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f45801f, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
