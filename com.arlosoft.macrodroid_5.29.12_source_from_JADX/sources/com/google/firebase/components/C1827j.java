package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import java.util.Map;

/* renamed from: com.google.firebase.components.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1827j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Map.Entry f4821a;

    /* renamed from: c */
    public final /* synthetic */ Event f4822c;

    public /* synthetic */ C1827j(Map.Entry entry, Event event) {
        this.f4821a = entry;
        this.f4822c = event;
    }

    public final void run() {
        ((EventHandler) this.f4821a.getKey()).mo23662a(this.f4822c);
    }
}
