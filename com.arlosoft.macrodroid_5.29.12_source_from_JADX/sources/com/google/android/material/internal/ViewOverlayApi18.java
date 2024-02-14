package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
class ViewOverlayApi18 implements ViewOverlayImpl {

    /* renamed from: a */
    private final ViewOverlay f49673a;

    ViewOverlayApi18(@NonNull View view) {
        this.f49673a = view.getOverlay();
    }

    public void add(@NonNull Drawable drawable) {
        this.f49673a.add(drawable);
    }

    public void remove(@NonNull Drawable drawable) {
        this.f49673a.remove(drawable);
    }
}
