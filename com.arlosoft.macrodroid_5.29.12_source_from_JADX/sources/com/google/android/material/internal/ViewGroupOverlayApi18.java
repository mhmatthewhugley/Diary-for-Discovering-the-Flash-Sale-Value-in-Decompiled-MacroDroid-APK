package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.ViewGroupOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
class ViewGroupOverlayApi18 implements ViewGroupOverlayImpl {

    /* renamed from: a */
    private final ViewGroupOverlay f49666a;

    public void add(@NonNull Drawable drawable) {
        this.f49666a.add(drawable);
    }

    public void remove(@NonNull Drawable drawable) {
        this.f49666a.remove(drawable);
    }
}
