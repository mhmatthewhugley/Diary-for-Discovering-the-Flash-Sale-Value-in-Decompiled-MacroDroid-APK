package com.arlosoft.macrodroid.templatestore.p071ui.subscription;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.extensions.C4657d;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.c */
/* compiled from: SwipteToDeleteCallback.kt */
public class C5350c extends ItemTouchHelper.SimpleCallback {

    /* renamed from: a */
    private final Drawable f13205a;

    /* renamed from: b */
    private final int f13206b;

    /* renamed from: c */
    private final C16265l<Integer, C13339u> f13207c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5350c(Drawable drawable, int i, C16265l<? super Integer, C13339u> lVar) {
        super(0, i);
        C13706o.m87929f(drawable, "deleteIcon");
        C13706o.m87929f(lVar, "itemDeletedHandler");
        this.f13205a = drawable;
        this.f13206b = i;
        this.f13207c = lVar;
    }

    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        int i2;
        int i3;
        C13706o.m87929f(canvas, "c");
        C13706o.m87929f(recyclerView, "recyclerView");
        C13706o.m87929f(viewHolder, "viewHolder");
        super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
        View view = viewHolder.itemView;
        C13706o.m87928e(view, "viewHolder.itemView");
        int b = C4657d.m18117b(8);
        int top = view.getTop() + ((view.getHeight() - this.f13205a.getIntrinsicHeight()) / 2);
        int intrinsicHeight = this.f13205a.getIntrinsicHeight() + top;
        if (this.f13206b == 8) {
            i2 = view.getLeft() + b;
            i3 = view.getLeft() + b + this.f13205a.getIntrinsicWidth();
        } else {
            int right = view.getRight() - b;
            i2 = (view.getRight() - b) - this.f13205a.getIntrinsicWidth();
            i3 = right;
        }
        this.f13205a.setBounds(i2, top, i3, intrinsicHeight);
        this.f13205a.draw(canvas);
    }

    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        C13706o.m87929f(recyclerView, "recyclerView");
        C13706o.m87929f(viewHolder, "viewHolder");
        C13706o.m87929f(viewHolder2, TypedValues.Attributes.S_TARGET);
        return false;
    }

    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        C13706o.m87929f(viewHolder, "viewHolder");
        if (i == 4 || i == 8) {
            this.f13207c.invoke(Integer.valueOf(viewHolder.getBindingAdapterPosition()));
        }
    }
}
