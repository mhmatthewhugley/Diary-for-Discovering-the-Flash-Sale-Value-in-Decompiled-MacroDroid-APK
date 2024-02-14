package com.melnykov.fab;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.melnykov.fab.a */
/* compiled from: RecyclerViewScrollDetector */
abstract class C11706a extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    private int f57541a;

    C11706a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo65792a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo65793b();

    /* renamed from: c */
    public void mo65798c(int i) {
        this.f57541a = i;
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (!(Math.abs(i2) > this.f57541a)) {
            return;
        }
        if (i2 > 0) {
            mo65793b();
        } else {
            mo65792a();
        }
    }
}
