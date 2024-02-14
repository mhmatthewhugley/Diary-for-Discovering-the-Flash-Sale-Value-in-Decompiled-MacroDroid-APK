package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final /* synthetic */ class zab implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ zab f3817a = new zab();

    private /* synthetic */ zab() {
    }

    public final int compare(Object obj, Object obj2) {
        Feature feature = (Feature) obj;
        Feature feature2 = (Feature) obj2;
        Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
        if (!feature.getName().equals(feature2.getName())) {
            return feature.getName().compareTo(feature2.getName());
        }
        return (feature.mo21147l2() > feature2.mo21147l2() ? 1 : (feature.mo21147l2() == feature2.mo21147l2() ? 0 : -1));
    }
}
