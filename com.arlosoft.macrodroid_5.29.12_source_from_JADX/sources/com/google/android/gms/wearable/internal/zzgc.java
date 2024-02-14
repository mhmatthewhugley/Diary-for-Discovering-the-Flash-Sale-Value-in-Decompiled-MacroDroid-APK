package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzgc implements NodeApi.GetLocalNodeResult {

    /* renamed from: a */
    private final Status f48328a;

    /* renamed from: c */
    private final Node f48329c;

    public zzgc(Status status, Node node) {
        this.f48328a = status;
        this.f48329c = node;
    }

    /* renamed from: D0 */
    public final Node mo56225D0() {
        return this.f48329c;
    }

    public final Status getStatus() {
        return this.f48328a;
    }
}
