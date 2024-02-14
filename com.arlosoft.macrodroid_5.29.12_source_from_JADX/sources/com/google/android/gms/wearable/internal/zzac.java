package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.CapabilityInfo;
import com.google.android.gms.wearable.Node;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzac implements CapabilityInfo {

    /* renamed from: a */
    private final String f48120a;

    /* renamed from: c */
    private final Set f48121c;

    public zzac(CapabilityInfo capabilityInfo) {
        String name = capabilityInfo.getName();
        Set<Node> s = capabilityInfo.mo56178s();
        this.f48120a = name;
        this.f48121c = s;
    }

    public final String getName() {
        return this.f48120a;
    }

    /* renamed from: s */
    public final Set<Node> mo56178s() {
        return this.f48121c;
    }
}
