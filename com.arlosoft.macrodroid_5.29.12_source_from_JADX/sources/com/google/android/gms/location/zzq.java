package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzq implements Comparator<DetectedActivity> {
    zzq() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        DetectedActivity detectedActivity2 = (DetectedActivity) obj2;
        Preconditions.m4488k(detectedActivity);
        Preconditions.m4488k(detectedActivity2);
        int compareTo = Integer.valueOf(detectedActivity2.mo54146l2()).compareTo(Integer.valueOf(detectedActivity.mo54146l2()));
        return compareTo == 0 ? Integer.valueOf(detectedActivity.mo54147m2()).compareTo(Integer.valueOf(detectedActivity2.mo54147m2())) : compareTo;
    }
}
