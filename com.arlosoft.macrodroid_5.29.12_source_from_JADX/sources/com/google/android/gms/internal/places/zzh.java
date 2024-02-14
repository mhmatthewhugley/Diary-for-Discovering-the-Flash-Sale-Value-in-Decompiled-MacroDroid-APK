package com.google.android.gms.internal.places;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataBufferSafeParcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.location.places.PlacesStatusCodes;

@ShowFirstParty
@Deprecated
public final class zzh extends DataBufferSafeParcelable<zzi> implements Result {

    /* renamed from: f */
    private final Status f45455f;

    public zzh(DataHolder dataHolder) {
        this(dataHolder, PlacesStatusCodes.m64717b(dataHolder.mo21571p2()));
    }

    public final Status getStatus() {
        return this.f45455f;
    }

    private zzh(DataHolder dataHolder, Status status) {
        super(dataHolder, zzi.CREATOR);
        Preconditions.m4478a(dataHolder == null || dataHolder.mo21571p2() == status.mo21294n2());
        this.f45455f = status;
    }
}
