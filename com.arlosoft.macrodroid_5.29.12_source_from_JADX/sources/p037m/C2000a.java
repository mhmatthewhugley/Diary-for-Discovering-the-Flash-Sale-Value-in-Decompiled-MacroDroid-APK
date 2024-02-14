package p037m;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.R$id;
import java.util.ArrayList;
import p037m.C2009f;
import p039n.C2037b;
import p040o.C2039a;

/* renamed from: m.a */
/* compiled from: DefaultRvAdapter */
class C2000a extends RecyclerView.Adapter<C2002b> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2009f f6102a;
    @LayoutRes

    /* renamed from: b */
    private final int f6103b;

    /* renamed from: c */
    private final C2007e f6104c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2003c f6105d;

    /* renamed from: m.a$a */
    /* compiled from: DefaultRvAdapter */
    static /* synthetic */ class C2001a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6106a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                m.f$k[] r0 = p037m.C2009f.C2021k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6106a = r0
                m.f$k r1 = p037m.C2009f.C2021k.SINGLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6106a     // Catch:{ NoSuchFieldError -> 0x001d }
                m.f$k r1 = p037m.C2009f.C2021k.MULTI     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p037m.C2000a.C2001a.<clinit>():void");
        }
    }

    /* renamed from: m.a$b */
    /* compiled from: DefaultRvAdapter */
    static class C2002b extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        /* renamed from: a */
        final CompoundButton f6107a;

        /* renamed from: c */
        final TextView f6108c;

        /* renamed from: d */
        final C2000a f6109d;

        C2002b(View view, C2000a aVar) {
            super(view);
            this.f6107a = (CompoundButton) view.findViewById(R$id.md_control);
            this.f6108c = (TextView) view.findViewById(R$id.md_title);
            this.f6109d = aVar;
            view.setOnClickListener(this);
            if (aVar.f6102a.f6134d.f6155E != null) {
                view.setOnLongClickListener(this);
            }
        }

        public void onClick(View view) {
            if (this.f6109d.f6105d != null && getAdapterPosition() != -1) {
                CharSequence charSequence = null;
                if (this.f6109d.f6102a.f6134d.f6209l != null && getAdapterPosition() < this.f6109d.f6102a.f6134d.f6209l.size()) {
                    charSequence = this.f6109d.f6102a.f6134d.f6209l.get(getAdapterPosition());
                }
                View view2 = view;
                this.f6109d.f6105d.mo24048a(this.f6109d.f6102a, view2, getAdapterPosition(), charSequence, false);
            }
        }

        public boolean onLongClick(View view) {
            if (this.f6109d.f6105d == null || getAdapterPosition() == -1) {
                return false;
            }
            CharSequence charSequence = null;
            if (this.f6109d.f6102a.f6134d.f6209l != null && getAdapterPosition() < this.f6109d.f6102a.f6134d.f6209l.size()) {
                charSequence = this.f6109d.f6102a.f6134d.f6209l.get(getAdapterPosition());
            }
            return this.f6109d.f6105d.mo24048a(this.f6109d.f6102a, view, getAdapterPosition(), charSequence, true);
        }
    }

    /* renamed from: m.a$c */
    /* compiled from: DefaultRvAdapter */
    interface C2003c {
        /* renamed from: a */
        boolean mo24048a(C2009f fVar, View view, int i, CharSequence charSequence, boolean z);
    }

    C2000a(C2009f fVar, @LayoutRes int i) {
        this.f6102a = fVar;
        this.f6103b = i;
        this.f6104c = fVar.f6134d.f6197f;
    }

    /* renamed from: D */
    private boolean m8345D() {
        return this.f6102a.mo24065p().mo24090j().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* renamed from: H */
    private void m8346H(ViewGroup viewGroup) {
        ((LinearLayout) viewGroup).setGravity(this.f6104c.mo24057b() | 16);
        if (viewGroup.getChildCount() != 2) {
            return;
        }
        if (this.f6104c == C2007e.END && !m8345D() && (viewGroup.getChildAt(0) instanceof CompoundButton)) {
            CompoundButton compoundButton = (CompoundButton) viewGroup.getChildAt(0);
            viewGroup.removeView(compoundButton);
            TextView textView = (TextView) viewGroup.getChildAt(0);
            viewGroup.removeView(textView);
            textView.setPadding(textView.getPaddingRight(), textView.getPaddingTop(), textView.getPaddingLeft(), textView.getPaddingBottom());
            viewGroup.addView(textView);
            viewGroup.addView(compoundButton);
        } else if (this.f6104c == C2007e.START && m8345D() && (viewGroup.getChildAt(1) instanceof CompoundButton)) {
            CompoundButton compoundButton2 = (CompoundButton) viewGroup.getChildAt(1);
            viewGroup.removeView(compoundButton2);
            TextView textView2 = (TextView) viewGroup.getChildAt(0);
            viewGroup.removeView(textView2);
            textView2.setPadding(textView2.getPaddingRight(), textView2.getPaddingTop(), textView2.getPaddingRight(), textView2.getPaddingBottom());
            viewGroup.addView(compoundButton2);
            viewGroup.addView(textView2);
        }
    }

    /* renamed from: E */
    public void onBindViewHolder(C2002b bVar, int i) {
        View view = bVar.itemView;
        boolean h = C2039a.m8438h(Integer.valueOf(i), this.f6102a.f6134d.f6176P);
        int a = h ? C2039a.m8431a(this.f6102a.f6134d.f6200g0, 0.4f) : this.f6102a.f6134d.f6200g0;
        bVar.itemView.setEnabled(!h);
        int i2 = C2001a.f6106a[this.f6102a.f6132K.ordinal()];
        if (i2 == 1) {
            RadioButton radioButton = (RadioButton) bVar.f6107a;
            C2009f.C2014d dVar = this.f6102a.f6134d;
            boolean z = dVar.f6173N == i;
            ColorStateList colorStateList = dVar.f6227u;
            if (colorStateList != null) {
                C2037b.m8428g(radioButton, colorStateList);
            } else {
                C2037b.m8427f(radioButton, dVar.f6225t);
            }
            radioButton.setChecked(z);
            radioButton.setEnabled(!h);
        } else if (i2 == 2) {
            CheckBox checkBox = (CheckBox) bVar.f6107a;
            boolean contains = this.f6102a.f6133L.contains(Integer.valueOf(i));
            C2009f.C2014d dVar2 = this.f6102a.f6134d;
            ColorStateList colorStateList2 = dVar2.f6227u;
            if (colorStateList2 != null) {
                C2037b.m8425d(checkBox, colorStateList2);
            } else {
                C2037b.m8424c(checkBox, dVar2.f6225t);
            }
            checkBox.setChecked(contains);
            checkBox.setEnabled(!h);
        }
        bVar.f6108c.setText(this.f6102a.f6134d.f6209l.get(i));
        bVar.f6108c.setTextColor(a);
        C2009f fVar = this.f6102a;
        fVar.mo24060B(bVar.f6108c, fVar.f6134d.f6178R);
        ViewGroup viewGroup = (ViewGroup) view;
        m8346H(viewGroup);
        int[] iArr = this.f6102a.f6134d.f6228u0;
        if (iArr != null) {
            if (i < iArr.length) {
                view.setId(iArr[i]);
            } else {
                view.setId(-1);
            }
        }
        if (viewGroup.getChildCount() != 2) {
            return;
        }
        if (viewGroup.getChildAt(0) instanceof CompoundButton) {
            viewGroup.getChildAt(0).setBackground((Drawable) null);
        } else if (viewGroup.getChildAt(1) instanceof CompoundButton) {
            viewGroup.getChildAt(1).setBackground((Drawable) null);
        }
    }

    /* renamed from: F */
    public C2002b onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f6103b, viewGroup, false);
        C2039a.m8450t(inflate, this.f6102a.mo24068s());
        return new C2002b(inflate, this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo24045G(C2003c cVar) {
        this.f6105d = cVar;
    }

    public int getItemCount() {
        ArrayList<CharSequence> arrayList = this.f6102a.f6134d.f6209l;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }
}
