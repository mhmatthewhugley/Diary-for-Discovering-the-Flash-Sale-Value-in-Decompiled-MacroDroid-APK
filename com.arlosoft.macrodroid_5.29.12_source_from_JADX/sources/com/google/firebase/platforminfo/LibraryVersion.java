package com.google.firebase.platforminfo;

import com.google.auto.value.AutoValue;

@AutoValue
abstract class LibraryVersion {
    LibraryVersion() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public static LibraryVersion m77166a(String str, String str2) {
        return new AutoValue_LibraryVersion(str, str2);
    }

    /* renamed from: b */
    public abstract String mo63494b();

    /* renamed from: c */
    public abstract String mo63495c();
}
