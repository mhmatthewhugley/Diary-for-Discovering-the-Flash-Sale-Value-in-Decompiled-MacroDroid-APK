package com.google.firebase.tracing;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import java.util.ArrayList;
import java.util.List;
import p020c6.C1430a;

public class ComponentMonitor implements ComponentRegistrarProcessor {
    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ Object m77680c(String str, Component component, ComponentContainer componentContainer) {
        try {
            FirebaseTrace.m77683b(str);
            return component.mo22871f().mo16829a(componentContainer);
        } finally {
            FirebaseTrace.m77682a();
        }
    }

    /* renamed from: a */
    public List<Component<?>> mo22893a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (Component next : componentRegistrar.getComponents()) {
            String g = next.mo22872g();
            if (g != null) {
                next = next.mo22878r(new C1430a(g, next));
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
