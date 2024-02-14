package p020c6;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.tracing.ComponentMonitor;

/* renamed from: c6.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1430a implements ComponentFactory {

    /* renamed from: a */
    public final /* synthetic */ String f766a;

    /* renamed from: b */
    public final /* synthetic */ Component f767b;

    public /* synthetic */ C1430a(String str, Component component) {
        this.f766a = str;
        this.f767b = component;
    }

    /* renamed from: a */
    public final Object mo16829a(ComponentContainer componentContainer) {
        return ComponentMonitor.m77680c(this.f766a, this.f767b, componentContainer);
    }
}
