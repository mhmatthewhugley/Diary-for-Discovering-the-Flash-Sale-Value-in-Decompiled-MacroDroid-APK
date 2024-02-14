package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnectorImpl;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.events.Subscriber;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
public final /* synthetic */ class zzb implements ComponentFactory {

    /* renamed from: a */
    public static final /* synthetic */ zzb f53804a = new zzb();

    private /* synthetic */ zzb() {
    }

    /* renamed from: a */
    public final Object mo16829a(ComponentContainer componentContainer) {
        return AnalyticsConnectorImpl.m74463h((FirebaseApp) componentContainer.mo22868a(FirebaseApp.class), (Context) componentContainer.mo22868a(Context.class), (Subscriber) componentContainer.mo22868a(Subscriber.class));
    }
}
