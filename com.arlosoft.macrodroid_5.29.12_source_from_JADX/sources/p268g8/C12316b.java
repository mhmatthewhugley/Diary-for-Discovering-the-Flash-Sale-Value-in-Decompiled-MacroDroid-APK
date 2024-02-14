package p268g8;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p249e8.C12174c;

/* renamed from: g8.b */
/* compiled from: GroupViewHolder */
public abstract class C12316b extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a */
    private C12174c f58994a;

    public C12316b(View view) {
        super(view);
        view.setOnClickListener(this);
    }

    public void onClick(View view) {
        C12174c cVar = this.f58994a;
        if (cVar == null) {
            return;
        }
        if (cVar.mo67376o(getAdapterPosition())) {
            mo68637t();
        } else {
            mo68638u();
        }
    }

    /* renamed from: t */
    public void mo68637t() {
    }

    /* renamed from: u */
    public void mo68638u() {
    }

    /* renamed from: v */
    public void mo68639v(C12174c cVar) {
        this.f58994a = cVar;
    }
}
