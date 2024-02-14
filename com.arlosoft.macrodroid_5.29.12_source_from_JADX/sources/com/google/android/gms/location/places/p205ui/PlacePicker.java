package com.google.android.gms.location.places.p205ui;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;

@Deprecated
/* renamed from: com.google.android.gms.location.places.ui.PlacePicker */
public class PlacePicker extends zzb {

    /* renamed from: com.google.android.gms.location.places.ui.PlacePicker$IntentBuilder */
    public static class IntentBuilder extends zzc {
        public IntentBuilder() {
            super("com.google.android.gms.location.places.ui.PICK_PLACE");
            this.f46035a.putExtra("gmscore_client_jar_version", GoogleApiAvailability.f3058d);
        }

        /* renamed from: a */
        public Intent mo54347a(Activity activity) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
            return super.mo54347a(activity);
        }
    }

    private PlacePicker() {
    }
}
