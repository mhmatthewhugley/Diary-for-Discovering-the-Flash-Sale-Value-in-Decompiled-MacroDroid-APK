package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.util.zzas;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdvb extends FrameLayout {

    /* renamed from: a */
    private final zzas f33207a;

    public zzdvb(Context context, @NonNull View view, @NonNull zzas zzas) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f33207a = zzas;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f33207a.mo20288m(motionEvent);
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof zzcmp)) {
                arrayList.add((zzcmp) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzcmp) arrayList.get(i2)).destroy();
        }
    }
}
