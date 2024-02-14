package com.google.firebase.firestore.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ResourcePath extends BasePath<ResourcePath> {

    /* renamed from: c */
    public static final ResourcePath f54467c = new ResourcePath(Collections.emptyList());

    private ResourcePath(List<String> list) {
        super(list);
    }

    /* renamed from: s */
    public static ResourcePath m75902s(List<String> list) {
        return list.isEmpty() ? f54467c : new ResourcePath(list);
    }

    /* renamed from: t */
    public static ResourcePath m75903t(String str) {
        if (!str.contains("//")) {
            String[] split = str.split("/");
            ArrayList arrayList = new ArrayList(split.length);
            for (String str2 : split) {
                if (!str2.isEmpty()) {
                    arrayList.add(str2);
                }
            }
            return new ResourcePath(arrayList);
        }
        throw new IllegalArgumentException("Invalid path (" + str + "). Paths must not contain // in them.");
    }

    /* renamed from: e */
    public String mo62797e() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f54436a.size(); i++) {
            if (i > 0) {
                sb.append("/");
            }
            sb.append(this.f54436a.get(i));
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public ResourcePath mo62800g(List<String> list) {
        return new ResourcePath(list);
    }
}
