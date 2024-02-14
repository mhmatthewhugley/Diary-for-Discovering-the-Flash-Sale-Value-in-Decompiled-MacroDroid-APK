package androidx.core.view;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: androidx.core.view.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0497c implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ DragStartHelper f503a;

    public /* synthetic */ C0497c(DragStartHelper dragStartHelper) {
        this.f503a = dragStartHelper;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f503a.onTouch(view, motionEvent);
    }
}
