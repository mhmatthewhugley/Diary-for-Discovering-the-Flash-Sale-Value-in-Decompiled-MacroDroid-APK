package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

class ViewOffsetHelper {

    /* renamed from: a */
    private final View f48648a;

    /* renamed from: b */
    private int f48649b;

    /* renamed from: c */
    private int f48650c;

    /* renamed from: d */
    private int f48651d;

    /* renamed from: e */
    private int f48652e;

    /* renamed from: f */
    private boolean f48653f = true;

    /* renamed from: g */
    private boolean f48654g = true;

    public ViewOffsetHelper(View view) {
        this.f48648a = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56795a() {
        View view = this.f48648a;
        ViewCompat.offsetTopAndBottom(view, this.f48651d - (view.getTop() - this.f48649b));
        View view2 = this.f48648a;
        ViewCompat.offsetLeftAndRight(view2, this.f48652e - (view2.getLeft() - this.f48650c));
    }

    /* renamed from: b */
    public int mo56796b() {
        return this.f48649b;
    }

    /* renamed from: c */
    public int mo56797c() {
        return this.f48651d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo56798d() {
        this.f48649b = this.f48648a.getTop();
        this.f48650c = this.f48648a.getLeft();
    }

    /* renamed from: e */
    public boolean mo56799e(int i) {
        if (!this.f48654g || this.f48652e == i) {
            return false;
        }
        this.f48652e = i;
        mo56795a();
        return true;
    }

    /* renamed from: f */
    public boolean mo56800f(int i) {
        if (!this.f48653f || this.f48651d == i) {
            return false;
        }
        this.f48651d = i;
        mo56795a();
        return true;
    }
}
