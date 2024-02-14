package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import java.util.Iterator;
import java.util.Set;

public class DefaultUserAgentPublisher implements UserAgentPublisher {

    /* renamed from: a */
    private final String f55181a;

    /* renamed from: b */
    private final GlobalLibraryVersionRegistrar f55182b;

    DefaultUserAgentPublisher(Set<LibraryVersion> set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.f55181a = m77161e(set);
        this.f55182b = globalLibraryVersionRegistrar;
    }

    /* renamed from: c */
    public static Component<UserAgentPublisher> m77159c() {
        return Component.m6343c(UserAgentPublisher.class).mo22880b(Dependency.m6429l(LibraryVersion.class)).mo22884f(C11326a.f55185a).mo22882d();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ UserAgentPublisher m77160d(ComponentContainer componentContainer) {
        return new DefaultUserAgentPublisher(componentContainer.mo22869c(LibraryVersion.class), GlobalLibraryVersionRegistrar.m77163a());
    }

    /* renamed from: e */
    private static String m77161e(Set<LibraryVersion> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<LibraryVersion> it = set.iterator();
        while (it.hasNext()) {
            LibraryVersion next = it.next();
            sb.append(next.mo63494b());
            sb.append('/');
            sb.append(next.mo63495c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo63499a() {
        if (this.f55182b.mo63500b().isEmpty()) {
            return this.f55181a;
        }
        return this.f55181a + ' ' + m77161e(this.f55182b.mo63500b());
    }
}
