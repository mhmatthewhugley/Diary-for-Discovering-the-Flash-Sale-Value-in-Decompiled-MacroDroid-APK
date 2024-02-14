package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.arlosoft.macrodroid.geofences.GeofenceInfo;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class zag implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static zag m4633b(Activity activity, @Nullable Intent intent, int i) {
        return new zad(intent, activity, i);
    }

    /* renamed from: c */
    public static zag m4634c(@NonNull LifecycleFragment lifecycleFragment, @Nullable Intent intent, int i) {
        return new zaf(intent, lifecycleFragment, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo21751a();

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo21751a();
        } catch (ActivityNotFoundException e) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains(GeofenceInfo.GEOFENCE_GENERIC_ID)) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
