package com.arlosoft.macrodroid.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* compiled from: InfoCardPreference.kt */
public final class InfoCardPreference extends Preference {

    /* renamed from: a */
    private String f12845a;

    /* renamed from: c */
    private String f12846c;

    /* renamed from: d */
    private View.OnClickListener f12847d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InfoCardPreference(Context context) {
        this(context, (AttributeSet) null, 0, 0, 14, (C13695i) null);
        C13706o.m87929f(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InfoCardPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, (C13695i) null);
        C13706o.m87929f(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InfoCardPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, (C13695i) null);
        C13706o.m87929f(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfoCardPreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, C13695i iVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* renamed from: b */
    public final void mo30099b(String str, String str2, View.OnClickListener onClickListener) {
        C13706o.m87929f(str, "titleText");
        C13706o.m87929f(str2, "descriptionText");
        C13706o.m87929f(onClickListener, "clickListener");
        this.f12845a = str;
        this.f12846c = str2;
        this.f12847d = onClickListener;
    }

    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        C13706o.m87929f(preferenceViewHolder, "viewholder");
        super.onBindViewHolder(preferenceViewHolder);
        View findViewById = preferenceViewHolder.findViewById(C17532R$id.infoCardGotIt);
        C13706o.m87927d(findViewById, "null cannot be cast to non-null type android.widget.Button");
        View findViewById2 = preferenceViewHolder.findViewById(C17532R$id.infoCardTitle);
        C13706o.m87927d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = preferenceViewHolder.findViewById(C17532R$id.infoCardDetail);
        C13706o.m87927d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View view = preferenceViewHolder.itemView;
        C13706o.m87927d(view, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        CardView cardView = (CardView) view;
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(2130968851, typedValue, true);
        cardView.setCardBackgroundColor(typedValue.data);
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(C17529R$dimen.margin_small);
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        C13706o.m87927d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(dimensionPixelOffset);
        layoutParams2.setMarginEnd(dimensionPixelOffset);
        ((TextView) findViewById2).setText(this.f12845a);
        ((TextView) findViewById3).setText(this.f12846c);
        ((Button) findViewById).setOnClickListener(this.f12847d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfoCardPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C13706o.m87929f(context, "context");
    }
}
