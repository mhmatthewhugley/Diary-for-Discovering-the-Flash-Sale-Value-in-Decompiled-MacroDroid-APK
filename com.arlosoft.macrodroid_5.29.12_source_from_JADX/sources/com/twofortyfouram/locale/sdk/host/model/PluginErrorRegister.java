package com.twofortyfouram.locale.sdk.host.model;

import androidx.annotation.NonNull;
import p276h8.C12406a;
import p285i8.C12447a;

public enum PluginErrorRegister implements IPluginError {
    ACTIVITY_REQUIRES_PERMISSION("The Activity requires a permission that is not granted to the host.  To resolve this issue, remove the permission attribute from the Activity's entry in the Android Manifest.", true),
    ACTIVITY_NOT_ENABLED("The Activity is disabled.  To resolve this issue, remove enabled=\"false\" from the Activity element in the Android Manifest.", true),
    ACTIVITY_NOT_EXPORTED("The Activity is not exported.  To resolve this issue, remove exported=\"false\" from the Activity element in the Android Manifest.", true),
    INSTALL_LOCATION_BAD("Plug-ins must be installed on internal storage.  To resolve this issue, set installLocation=\"internalOnly\" in the AndroidManifest", false),
    RECEIVER_REQUIRES_PERMISSION("The BroadcastReceiver requires a permission that is not granted to the host.  To resolve this issue, remove the permission attribute from the BroadcastReceiver's entry in the Android Manifest.", true),
    APPLICATION_NOT_ENABLED("The Application is disabled.  To resolve this issue, remove enabled=\"false\" from the Application element in the Android Manifest.", true),
    RECEIVER_NOT_ENABLED("The BroadcastReceiver is disabled.  To resolve this issue, remove enabled=\"false\" from the BroadcastReceiver element in the Android Manifest.", true),
    RECEIVER_NOT_EXPORTED("The BroadcastReceiver is not exported.  To resolve this issue, remove exported=\"false\" from the BroadcastReceiver element in the Android Manifest.", true),
    RECEIVER_DUPLICATE(C12447a.m83390g("The plug-in has multiple BroadcastReceivers for the plug-in Intent action.  To resolve this issue, each plug-in must only have a single BroadcastReceiver for %s and/or %s", "com.twofortyfouram.locale.intent.action.QUERY_CONDITION", "com.twofortyfouram.locale.intent.action.FIRE_SETTING"), true),
    MISSING_RECEIVER(C12447a.m83390g("The plug-in has no BroadcastReceivers for the plug-in Intent action.  To resolve this issue, each plug-in must have a single BroadcastReceiver for %s and/or %s", "com.twofortyfouram.locale.intent.action.QUERY_CONDITION", "com.twofortyfouram.locale.intent.action.FIRE_SETTING"), true);
    
    @NonNull
    private final String mDeveloperExplanation;
    private final boolean mIsFatal;

    private PluginErrorRegister(@NonNull String str, boolean z) {
        C12406a.m83260d(str, "developerExplanation");
        this.mDeveloperExplanation = str;
        this.mIsFatal = z;
    }

    @NonNull
    public String getDeveloperExplanation() {
        return this.mDeveloperExplanation;
    }

    public boolean isFatal() {
        return this.mIsFatal;
    }
}
