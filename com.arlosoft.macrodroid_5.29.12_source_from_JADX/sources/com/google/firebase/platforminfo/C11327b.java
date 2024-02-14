package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.LibraryVersionComponent;

/* renamed from: com.google.firebase.platforminfo.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11327b implements ComponentFactory {

    /* renamed from: a */
    public final /* synthetic */ String f55186a;

    /* renamed from: b */
    public final /* synthetic */ LibraryVersionComponent.VersionExtractor f55187b;

    public /* synthetic */ C11327b(String str, LibraryVersionComponent.VersionExtractor versionExtractor) {
        this.f55186a = str;
        this.f55187b = versionExtractor;
    }

    /* renamed from: a */
    public final Object mo16829a(ComponentContainer componentContainer) {
        return LibraryVersion.m77166a(this.f55186a, this.f55187b.mo62042a((Context) componentContainer.mo22868a(Context.class)));
    }
}
