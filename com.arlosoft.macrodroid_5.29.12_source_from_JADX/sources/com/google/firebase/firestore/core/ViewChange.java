package com.google.firebase.firestore.core;

import java.util.List;

public class ViewChange {

    /* renamed from: a */
    private final ViewSnapshot f6041a;

    /* renamed from: b */
    private final List<LimboDocumentChange> f6042b;

    public ViewChange(ViewSnapshot viewSnapshot, List<LimboDocumentChange> list) {
        this.f6041a = viewSnapshot;
        this.f6042b = list;
    }

    /* renamed from: a */
    public List<LimboDocumentChange> mo23978a() {
        return this.f6042b;
    }

    /* renamed from: b */
    public ViewSnapshot mo23979b() {
        return this.f6041a;
    }
}
