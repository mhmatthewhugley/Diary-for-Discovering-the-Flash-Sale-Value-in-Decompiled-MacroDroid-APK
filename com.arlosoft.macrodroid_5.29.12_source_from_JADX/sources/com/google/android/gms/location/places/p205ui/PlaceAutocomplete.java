package com.google.android.gms.location.places.p205ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLngBounds;

@Deprecated
/* renamed from: com.google.android.gms.location.places.ui.PlaceAutocomplete */
public class PlaceAutocomplete extends zzb {

    /* renamed from: com.google.android.gms.location.places.ui.PlaceAutocomplete$IntentBuilder */
    public static class IntentBuilder extends zzc {
        public IntentBuilder(int i) {
            super("com.google.android.gms.location.places.ui.AUTOCOMPLETE");
            this.f46035a.putExtra("gmscore_client_jar_version", GoogleApiAvailability.f3058d);
            this.f46035a.putExtra("mode", i);
            this.f46035a.putExtra("origin", 2);
        }

        /* renamed from: a */
        public Intent mo54347a(Activity activity) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
            return super.mo54347a(activity);
        }

        /* renamed from: b */
        public IntentBuilder mo54348b(@Nullable LatLngBounds latLngBounds) {
            if (latLngBounds != null) {
                this.f46035a.putExtra("bounds", latLngBounds);
            } else {
                this.f46035a.removeExtra("bounds");
            }
            return this;
        }

        /* renamed from: c */
        public IntentBuilder mo54349c(@Nullable AutocompleteFilter autocompleteFilter) {
            if (autocompleteFilter != null) {
                this.f46035a.putExtra("filter", autocompleteFilter);
            } else {
                this.f46035a.removeExtra("filter");
            }
            return this;
        }

        /* renamed from: d */
        public final IntentBuilder mo54350d(int i) {
            this.f46035a.putExtra("origin", 1);
            return this;
        }

        /* renamed from: e */
        public final IntentBuilder mo54351e(@Nullable String str) {
            if (str != null) {
                this.f46035a.putExtra("initial_query", str);
            } else {
                this.f46035a.removeExtra("initial_query");
            }
            return this;
        }
    }

    private PlaceAutocomplete() {
    }

    /* renamed from: a */
    public static Place m64786a(Context context, Intent intent) {
        return zzb.m64806a(context, intent);
    }

    /* renamed from: b */
    public static Status m64787b(Context context, Intent intent) {
        return zzb.m64807b(context, intent);
    }
}
