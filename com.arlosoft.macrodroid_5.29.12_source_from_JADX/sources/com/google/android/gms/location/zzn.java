package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzn implements Comparator<ActivityTransition> {
    zzn() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        Preconditions.m4488k(activityTransition);
        Preconditions.m4488k(activityTransition2);
        int l2 = activityTransition.mo54125l2();
        int l22 = activityTransition2.mo54125l2();
        if (l2 != l22) {
            return l2 >= l22 ? 1 : -1;
        }
        int m2 = activityTransition.mo54126m2();
        int m22 = activityTransition2.mo54126m2();
        if (m2 == m22) {
            return 0;
        }
        if (m2 < m22) {
            return -1;
        }
        return 1;
    }
}
