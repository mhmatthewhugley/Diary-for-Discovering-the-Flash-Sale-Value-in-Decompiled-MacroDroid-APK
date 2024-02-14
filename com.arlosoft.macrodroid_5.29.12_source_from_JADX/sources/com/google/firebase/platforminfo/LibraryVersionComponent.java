package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;

public class LibraryVersionComponent {

    public interface VersionExtractor<T> {
        /* renamed from: a */
        String mo62042a(T t);
    }

    private LibraryVersionComponent() {
    }

    /* renamed from: b */
    public static Component<?> m77170b(String str, String str2) {
        return Component.m6345j(LibraryVersion.m77166a(str, str2), LibraryVersion.class);
    }

    /* renamed from: c */
    public static Component<?> m77171c(String str, VersionExtractor<Context> versionExtractor) {
        return Component.m6346k(LibraryVersion.class).mo22880b(Dependency.m6427j(Context.class)).mo22884f(new C11327b(str, versionExtractor)).mo22882d();
    }
}
