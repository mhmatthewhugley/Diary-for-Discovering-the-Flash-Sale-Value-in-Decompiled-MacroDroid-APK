package com.google.android.gms.location.places;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.location.places.internal.zzak;
import com.google.android.gms.location.places.internal.zzam;
import java.util.Comparator;

@Deprecated
public class PlaceLikelihoodBuffer extends AbstractDataBuffer<PlaceLikelihood> implements Result {

    /* renamed from: o */
    private static final Comparator<zzak> f45908o = new zzj();

    /* renamed from: c */
    private final String f45909c;

    /* renamed from: d */
    private final int f45910d;

    /* renamed from: f */
    private final Status f45911f;

    /* renamed from: g */
    private final boolean f45912g;

    public PlaceLikelihoodBuffer(DataHolder dataHolder, int i) {
        this(dataHolder, false, i);
    }

    /* renamed from: h */
    public static int m64710h(Bundle bundle) {
        return bundle.getInt("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY");
    }

    /* renamed from: c */
    public PlaceLikelihood get(int i) {
        return new zzam(this.f3506a, i);
    }

    public Status getStatus() {
        return this.f45911f;
    }

    @ShowFirstParty
    public String toString() {
        return Objects.m4472c(this).mo21720a(NotificationCompat.CATEGORY_STATUS, getStatus()).mo21720a("attributions", this.f45909c).toString();
    }

    private PlaceLikelihoodBuffer(DataHolder dataHolder, boolean z, int i) {
        super(dataHolder);
        this.f45911f = PlacesStatusCodes.m64717b(dataHolder.mo21571p2());
        switch (i) {
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
                this.f45910d = i;
                this.f45912g = false;
                if (dataHolder.mo21570o2() != null) {
                    this.f45909c = dataHolder.mo21570o2().getString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY");
                    return;
                } else {
                    this.f45909c = null;
                    return;
                }
            default:
                StringBuilder sb = new StringBuilder(27);
                sb.append("invalid source: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
