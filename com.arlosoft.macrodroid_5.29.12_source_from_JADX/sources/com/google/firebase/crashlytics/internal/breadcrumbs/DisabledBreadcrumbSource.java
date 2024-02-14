package com.google.firebase.crashlytics.internal.breadcrumbs;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;

public class DisabledBreadcrumbSource implements BreadcrumbSource {
    /* renamed from: a */
    public void mo22941a(@Nullable BreadcrumbHandler breadcrumbHandler) {
        Logger.m6525f().mo22954b("Could not register handler for breadcrumbs events.");
    }
}
