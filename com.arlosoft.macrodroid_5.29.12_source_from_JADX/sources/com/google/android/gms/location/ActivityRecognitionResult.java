package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.lang.reflect.Array;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new zzk();
    @SafeParcelable.Field

    /* renamed from: a */
    List<DetectedActivity> f45785a;
    @SafeParcelable.Field

    /* renamed from: c */
    long f45786c;
    @SafeParcelable.Field

    /* renamed from: d */
    long f45787d;
    @SafeParcelable.Field

    /* renamed from: f */
    int f45788f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    Bundle f45789g;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public ActivityRecognitionResult(@SafeParcelable.Param @NonNull List<DetectedActivity> list, @SafeParcelable.Param long j, @SafeParcelable.Param long j2, @SafeParcelable.Param int i, @SafeParcelable.Param @Nullable Bundle bundle) {
        boolean z = true;
        Preconditions.m4479b(list != null && list.size() > 0, "Must have at least 1 detected activity");
        Preconditions.m4479b((j <= 0 || j2 <= 0) ? false : z, "Must set times");
        this.f45785a = list;
        this.f45786c = j;
        this.f45787d = j2;
        this.f45788f = i;
        this.f45789g = bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    @androidx.annotation.Nullable
    /* renamed from: l2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.location.ActivityRecognitionResult m64627l2(@androidx.annotation.NonNull android.content.Intent r3) {
        /*
            boolean r0 = m64628n2(r3)
            r1 = 0
            if (r0 != 0) goto L_0x0009
        L_0x0007:
            r0 = r1
            goto L_0x002b
        L_0x0009:
            android.os.Bundle r0 = r3.getExtras()
            if (r0 != 0) goto L_0x0010
            goto L_0x0007
        L_0x0010:
            java.lang.String r2 = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT"
            java.lang.Object r0 = r0.get(r2)
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L_0x0025
            byte[] r0 = (byte[]) r0
            android.os.Parcelable$Creator<com.google.android.gms.location.ActivityRecognitionResult> r2 = CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.m4589a(r0, r2)
            com.google.android.gms.location.ActivityRecognitionResult r0 = (com.google.android.gms.location.ActivityRecognitionResult) r0
            goto L_0x002b
        L_0x0025:
            boolean r2 = r0 instanceof com.google.android.gms.location.ActivityRecognitionResult
            if (r2 == 0) goto L_0x0007
            com.google.android.gms.location.ActivityRecognitionResult r0 = (com.google.android.gms.location.ActivityRecognitionResult) r0
        L_0x002b:
            if (r0 == 0) goto L_0x002e
            return r0
        L_0x002e:
            java.util.List r3 = m64629o2(r3)
            if (r3 == 0) goto L_0x0048
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x003b
            goto L_0x0048
        L_0x003b:
            int r0 = r3.size()
            int r0 = r0 + -1
            java.lang.Object r3 = r3.get(r0)
            com.google.android.gms.location.ActivityRecognitionResult r3 = (com.google.android.gms.location.ActivityRecognitionResult) r3
            return r3
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.ActivityRecognitionResult.m64627l2(android.content.Intent):com.google.android.gms.location.ActivityRecognitionResult");
    }

    /* renamed from: n2 */
    public static boolean m64628n2(@Nullable Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        List<ActivityRecognitionResult> o2 = m64629o2(intent);
        return o2 != null && !o2.isEmpty();
    }

    @Nullable
    /* renamed from: o2 */
    public static List<ActivityRecognitionResult> m64629o2(@NonNull Intent intent) {
        if (intent != null && intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST")) {
            return SafeParcelableSerializer.m4592d(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
        }
        return null;
    }

    /* renamed from: p2 */
    private static boolean m64630p2(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        int length;
        if (bundle == null) {
            return bundle2 == null;
        }
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!m64630p2(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (obj.getClass().isArray()) {
                if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                    int i = 0;
                    while (i < length) {
                        if (Objects.m4470a(Array.get(obj, i), Array.get(obj2, i))) {
                            i++;
                        }
                    }
                    continue;
                }
                return false;
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    @ShowFirstParty
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            return this.f45786c == activityRecognitionResult.f45786c && this.f45787d == activityRecognitionResult.f45787d && this.f45788f == activityRecognitionResult.f45788f && Objects.m4470a(this.f45785a, activityRecognitionResult.f45785a) && m64630p2(this.f45789g, activityRecognitionResult.f45789g);
        }
    }

    @ShowFirstParty
    public final int hashCode() {
        return Objects.m4471b(Long.valueOf(this.f45786c), Long.valueOf(this.f45787d), Integer.valueOf(this.f45788f), this.f45785a, this.f45789g);
    }

    @NonNull
    /* renamed from: m2 */
    public List<DetectedActivity> mo54120m2() {
        return this.f45785a;
    }

    @NonNull
    public String toString() {
        String valueOf = String.valueOf(this.f45785a);
        long j = this.f45786c;
        long j2 = this.f45787d;
        StringBuilder sb = new StringBuilder(valueOf.length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(valueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4558B(parcel, 1, this.f45785a, false);
        SafeParcelWriter.m4581s(parcel, 2, this.f45786c);
        SafeParcelWriter.m4581s(parcel, 3, this.f45787d);
        SafeParcelWriter.m4576n(parcel, 4, this.f45788f);
        SafeParcelWriter.m4567e(parcel, 5, this.f45789g, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
