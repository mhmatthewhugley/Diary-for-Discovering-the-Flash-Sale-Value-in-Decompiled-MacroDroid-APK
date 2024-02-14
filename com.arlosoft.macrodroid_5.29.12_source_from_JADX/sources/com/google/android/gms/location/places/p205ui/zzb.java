package com.google.android.gms.location.places.p205ui;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.internal.PlaceEntity;

/* renamed from: com.google.android.gms.location.places.ui.zzb */
class zzb {
    zzb() {
    }

    /* renamed from: a */
    public static Place m64806a(Context context, Intent intent) {
        Preconditions.m4489l(intent, "intent must not be null");
        Preconditions.m4489l(context, "context must not be null");
        return (Place) SafeParcelableSerializer.m4590b(intent, "selected_place", PlaceEntity.CREATOR);
    }

    /* renamed from: b */
    public static Status m64807b(Context context, Intent intent) {
        Preconditions.m4489l(intent, "intent must not be null");
        Preconditions.m4489l(context, "context must not be null");
        return (Status) SafeParcelableSerializer.m4590b(intent, NotificationCompat.CATEGORY_STATUS, Status.CREATOR);
    }
}
