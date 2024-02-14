package p247e6;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import p258f6.C12238b;

/* renamed from: e6.j */
/* compiled from: DraggingItemInfo */
public class C12153j {

    /* renamed from: a */
    public final int f58499a;

    /* renamed from: b */
    public final int f58500b;

    /* renamed from: c */
    public final long f58501c;

    /* renamed from: d */
    public final int f58502d;

    /* renamed from: e */
    public final int f58503e;

    /* renamed from: f */
    public final int f58504f;

    /* renamed from: g */
    public final int f58505g;

    /* renamed from: h */
    public final Rect f58506h;

    /* renamed from: i */
    public final int f58507i;

    public C12153j(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, int i2) {
        this.f58499a = viewHolder.itemView.getWidth();
        this.f58500b = viewHolder.itemView.getHeight();
        this.f58501c = viewHolder.getItemId();
        int left = viewHolder.itemView.getLeft();
        this.f58502d = left;
        int top = viewHolder.itemView.getTop();
        this.f58503e = top;
        this.f58504f = i - left;
        this.f58505g = i2 - top;
        Rect rect = new Rect();
        this.f58506h = rect;
        C12238b.m82894n(viewHolder.itemView, rect);
        this.f58507i = C12238b.m82900t(viewHolder);
    }

    /* renamed from: a */
    public static C12153j m82711a(C12153j jVar, RecyclerView.ViewHolder viewHolder) {
        return new C12153j(jVar, viewHolder);
    }

    private C12153j(C12153j jVar, RecyclerView.ViewHolder viewHolder) {
        this.f58501c = jVar.f58501c;
        int width = viewHolder.itemView.getWidth();
        this.f58499a = width;
        int height = viewHolder.itemView.getHeight();
        this.f58500b = height;
        this.f58506h = new Rect(jVar.f58506h);
        this.f58507i = C12238b.m82900t(viewHolder);
        this.f58502d = jVar.f58502d;
        this.f58503e = jVar.f58503e;
        float f = ((float) width) * 0.5f;
        float f2 = ((float) height) * 0.5f;
        float f3 = (float) jVar.f58504f;
        float f4 = (float) jVar.f58505g;
        float f5 = (f3 - (((float) jVar.f58499a) * 0.5f)) + f;
        float f6 = (f4 - (((float) jVar.f58500b) * 0.5f)) + f2;
        if (f5 >= 0.0f && f5 < ((float) width)) {
            f = f5;
        }
        this.f58504f = (int) f;
        if (f6 >= 0.0f && f6 < ((float) height)) {
            f2 = f6;
        }
        this.f58505g = (int) f2;
    }
}
