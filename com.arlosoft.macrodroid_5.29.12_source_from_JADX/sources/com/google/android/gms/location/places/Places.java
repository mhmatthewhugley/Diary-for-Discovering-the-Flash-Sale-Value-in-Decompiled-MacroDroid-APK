package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.location.places.internal.zzae;
import com.google.android.gms.location.places.internal.zzaf;
import com.google.android.gms.location.places.internal.zzh;
import com.google.android.gms.location.places.internal.zzq;
import com.google.android.gms.location.places.internal.zzs;
import com.google.android.gms.location.places.internal.zzz;

@Deprecated
public class Places {

    /* renamed from: a */
    private static final Api.ClientKey<zzq> f45926a;

    /* renamed from: b */
    private static final Api.ClientKey<zzae> f45927b;

    /* renamed from: c */
    public static final Api<PlacesOptions> f45928c;

    /* renamed from: d */
    public static final Api<PlacesOptions> f45929d;
    @Deprecated

    /* renamed from: e */
    public static final GeoDataApi f45930e = new zzh();
    @Deprecated

    /* renamed from: f */
    public static final PlaceDetectionApi f45931f = new zzz();

    static {
        Api.ClientKey<zzq> clientKey = new Api.ClientKey<>();
        f45926a = clientKey;
        Api.ClientKey<zzae> clientKey2 = new Api.ClientKey<>();
        f45927b = clientKey2;
        f45928c = new Api<>("Places.GEO_DATA_API", new zzs(), clientKey);
        f45929d = new Api<>("Places.PLACE_DETECTION_API", new zzaf(), clientKey2);
    }

    private Places() {
    }
}
