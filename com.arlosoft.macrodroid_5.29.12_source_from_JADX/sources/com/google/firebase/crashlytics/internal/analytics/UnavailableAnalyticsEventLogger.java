package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;

public class UnavailableAnalyticsEventLogger implements AnalyticsEventLogger {
    /* renamed from: a */
    public void mo22940a(@NonNull String str, @Nullable Bundle bundle) {
        Logger.m6525f().mo22954b("Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
    }
}
