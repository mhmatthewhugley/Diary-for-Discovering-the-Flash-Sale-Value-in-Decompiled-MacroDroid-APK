package com.jaredrummler.android.colorpicker;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;

/* renamed from: com.jaredrummler.android.colorpicker.b */
/* compiled from: ColorPaletteAdapter */
class C11675b extends BaseAdapter {

    /* renamed from: a */
    final C11676a f57434a;

    /* renamed from: c */
    final int[] f57435c;

    /* renamed from: d */
    int f57436d;

    /* renamed from: f */
    int f57437f;

    /* renamed from: com.jaredrummler.android.colorpicker.b$a */
    /* compiled from: ColorPaletteAdapter */
    interface C11676a {
        /* renamed from: f */
        void mo65709f(int i);
    }

    /* renamed from: com.jaredrummler.android.colorpicker.b$b */
    /* compiled from: ColorPaletteAdapter */
    private final class C11677b {

        /* renamed from: a */
        View f57438a;

        /* renamed from: b */
        ColorPanelView f57439b;

        /* renamed from: c */
        ImageView f57440c;

        /* renamed from: d */
        int f57441d;

        /* renamed from: com.jaredrummler.android.colorpicker.b$b$a */
        /* compiled from: ColorPaletteAdapter */
        class C11678a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f57443a;

            C11678a(int i) {
                this.f57443a = i;
            }

            public void onClick(View view) {
                C11675b bVar = C11675b.this;
                int i = bVar.f57436d;
                int i2 = this.f57443a;
                if (i != i2) {
                    bVar.f57436d = i2;
                    bVar.notifyDataSetChanged();
                }
                C11675b bVar2 = C11675b.this;
                bVar2.f57434a.mo65709f(bVar2.f57435c[this.f57443a]);
            }
        }

        /* renamed from: com.jaredrummler.android.colorpicker.b$b$b */
        /* compiled from: ColorPaletteAdapter */
        class C11679b implements View.OnLongClickListener {
            C11679b() {
            }

            public boolean onLongClick(View view) {
                C11677b.this.f57439b.mo65650d();
                return true;
            }
        }

        C11677b(Context context) {
            int i;
            if (C11675b.this.f57437f == 0) {
                i = R$layout.cpv_color_item_square;
            } else {
                i = R$layout.cpv_color_item_circle;
            }
            View inflate = View.inflate(context, i, (ViewGroup) null);
            this.f57438a = inflate;
            this.f57439b = (ColorPanelView) inflate.findViewById(R$id.cpv_color_panel_view);
            this.f57440c = (ImageView) this.f57438a.findViewById(R$id.cpv_color_image_view);
            this.f57441d = this.f57439b.getBorderColor();
            this.f57438a.setTag(this);
        }

        /* renamed from: a */
        private void m81789a(int i) {
            C11675b bVar = C11675b.this;
            if (i != bVar.f57436d || ColorUtils.calculateLuminance(bVar.f57435c[i]) < 0.65d) {
                this.f57440c.setColorFilter((ColorFilter) null);
            } else {
                this.f57440c.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
            }
        }

        /* renamed from: b */
        private void m81790b(int i) {
            this.f57439b.setOnClickListener(new C11678a(i));
            this.f57439b.setOnLongClickListener(new C11679b());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo65710c(int i) {
            int i2 = C11675b.this.f57435c[i];
            int alpha = Color.alpha(i2);
            this.f57439b.setColor(i2);
            this.f57440c.setImageResource(C11675b.this.f57436d == i ? R$drawable.cpv_preset_checked : 0);
            if (alpha == 255) {
                m81789a(i);
            } else if (alpha <= 165) {
                this.f57439b.setBorderColor(i2 | ViewCompat.MEASURED_STATE_MASK);
                this.f57440c.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
            } else {
                this.f57439b.setBorderColor(this.f57441d);
                this.f57440c.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            }
            m81790b(i);
        }
    }

    C11675b(C11676a aVar, int[] iArr, int i, int i2) {
        this.f57434a = aVar;
        this.f57435c = iArr;
        this.f57436d = i;
        this.f57437f = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo65704a() {
        this.f57436d = -1;
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f57435c.length;
    }

    public Object getItem(int i) {
        return Integer.valueOf(this.f57435c[i]);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        C11677b bVar;
        if (view == null) {
            bVar = new C11677b(viewGroup.getContext());
            view2 = bVar.f57438a;
        } else {
            view2 = view;
            bVar = (C11677b) view.getTag();
        }
        bVar.mo65710c(i);
        return view2;
    }
}
