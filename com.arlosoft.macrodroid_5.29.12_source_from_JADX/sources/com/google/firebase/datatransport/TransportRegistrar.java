package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import p015b6.C1406a;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.m6343c(TransportFactory.class).mo22885h(LIBRARY_NAME).mo22880b(Dependency.m6427j(Context.class)).mo22884f(C1406a.f746a).mo22882d(), LibraryVersionComponent.m77170b(LIBRARY_NAME, "18.1.7")});
    }
}
