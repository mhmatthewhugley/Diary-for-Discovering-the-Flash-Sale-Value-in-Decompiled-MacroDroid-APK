package com.google.firebase.firestore.core;

import java.util.Comparator;

/* compiled from: View */
final /* synthetic */ class View$$Lambda$1 implements Comparator {

    /* renamed from: a */
    private final View f6040a;

    private View$$Lambda$1(View view) {
        this.f6040a = view;
    }

    /* renamed from: a */
    public static Comparator m8263a(View view) {
        return new View$$Lambda$1(view);
    }

    public int compare(Object obj, Object obj2) {
        return View.m8250j(this.f6040a, (DocumentViewChange) obj, (DocumentViewChange) obj2);
    }
}
