package com.twofortyfouram.locale.sdk.host.model;

import androidx.annotation.NonNull;
import p276h8.C12406a;
import p285i8.C12447a;

public enum PluginErrorEdit implements IPluginError {
    ACTIVITY_NOT_FOUND_EXCEPTION("The Activity could not be found.  To resolve this issue, make sure the plug-in package is still installed.", true),
    BLURB_MISSING(C12447a.m83390g("%s is missing.  To resolve this issue, put the blurb extra in the Activity result Intent.", "com.twofortyfouram.locale.intent.extra.BLURB"), true),
    BUNDLE_TOO_LARGE(C12447a.m83390g("%s is larger than the allowed maximum of %d bytes.  To resolve this issue, store less data in the Bundle.", "com.twofortyfouram.locale.intent.extra.BUNDLE", Integer.valueOf(PluginInstanceData.MAXIMUM_BUNDLE_SIZE_BYTES)), true),
    BUNDLE_MISSING(C12447a.m83390g("Extra %s is required.  To resolve this issue, put the Bundle extra in the Activity result Intent.", "com.twofortyfouram.locale.intent.extra.BUNDLE"), true),
    BUNDLE_NOT_SERIALIZABLE(C12447a.m83390g("%s could not be serialized.  To resolve this issue, be sure the Bundle doesn't contain Parcelable or private Serializable subclasses", "com.twofortyfouram.locale.intent.extra.BUNDLE"), true),
    INTENT_NULL("Activity result Intent is null.  To resolve this issue, the child Activity needs to call setResult(RESULT_OK, Intent) or setResult(RESULT_CANCELED) before finishing.", true),
    PRIVATE_SERIALIZABLE("Intent or Bundle contains a private Serializable subclass which is not known to this app's classloader.  To resolve this issue, the DO NOT place a private Serializable subclass in Intents sent across processes.", true),
    SECURITY_EXCEPTION("The Activity could not be launched because of a security error.  To resolve this issue, make sure the Activity is exported and does not require a permission.", true),
    UNKNOWN_ACTIVITY_RESULT_CODE("Plug-ins must return one of the result codes ACTIVITY.RESULT_OK or ACTIVITY.RESULT_CANCELED", true);
    
    @NonNull
    private final String mDeveloperExplanation;
    private final boolean mIsFatal;

    private PluginErrorEdit(@NonNull String str, boolean z) {
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
