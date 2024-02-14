package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzgb implements NodeApi.GetConnectedNodesResult {

    /* renamed from: a */
    private final Status f48326a;

    /* renamed from: c */
    private final List f48327c;

    public zzgb(Status status, List list) {
        this.f48326a = status;
        this.f48327c = list;
    }

    public final Status getStatus() {
        return this.f48326a;
    }

    /* renamed from: s */
    public final List<Node> mo56224s() {
        return this.f48327c;
    }
}
