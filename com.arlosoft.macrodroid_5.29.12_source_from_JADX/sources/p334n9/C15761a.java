package p334n9;

import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import p286i9.C12454b;

/* renamed from: n9.a */
/* compiled from: ContentViewHolder */
abstract class C15761a extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private int f65103a;

    /* renamed from: c */
    private View f65104c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C15761a(View view, C12454b bVar, boolean z) {
        super(z ? new FrameLayout(view.getContext()) : view);
        this.f65103a = -1;
        if (z) {
            this.itemView.setLayoutParams(bVar.mo68943I().getLayoutManager().generateLayoutParams(view.getLayoutParams()));
            ((FrameLayout) this.itemView).addView(view);
            float elevation = ViewCompat.getElevation(view);
            if (elevation > 0.0f) {
                ViewCompat.setBackground(this.itemView, view.getBackground());
                ViewCompat.setElevation(this.itemView, elevation);
            }
            this.f65104c = view;
        }
    }

    /* renamed from: t */
    public View mo75399t() {
        View view = this.f65104c;
        return view != null ? view : this.itemView;
    }

    /* renamed from: u */
    public final int mo75400u() {
        int adapterPosition = getAdapterPosition();
        return adapterPosition == -1 ? this.f65103a : adapterPosition;
    }
}
