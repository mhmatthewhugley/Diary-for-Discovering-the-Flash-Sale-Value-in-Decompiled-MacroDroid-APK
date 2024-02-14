package com.google.android.gms.location.places.p205ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;

/* renamed from: com.google.android.gms.location.places.ui.zzc */
public class zzc {

    /* renamed from: a */
    protected final Intent f46035a;

    public zzc(String str) {
        Intent intent = new Intent(str);
        this.f46035a = intent;
        intent.setPackage("com.google.android.gms");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Intent mo54347a(Activity activity) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        Resources.Theme theme = activity.getTheme();
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        if (theme.resolveAttribute(16843827, typedValue, true) && !this.f46035a.hasExtra("primary_color")) {
            this.f46035a.putExtra("primary_color", typedValue.data);
        }
        if (theme.resolveAttribute(16843828, typedValue2, true) && !this.f46035a.hasExtra("primary_color_dark")) {
            this.f46035a.putExtra("primary_color_dark", typedValue2.data);
        }
        GoogleApiAvailability.m3521q().mo21176n(activity, GooglePlayServicesUtilLight.f3065a);
        return this.f46035a;
    }
}
