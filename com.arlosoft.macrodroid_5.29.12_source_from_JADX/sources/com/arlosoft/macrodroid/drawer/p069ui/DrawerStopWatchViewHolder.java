package com.arlosoft.macrodroid.drawer.p069ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.arlosoft.macrodroid.C17530R$drawable;
import p149q1.C8153b;
import p149q1.C8160i;
import p183w2.C10330a;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerStopWatchViewHolder */
public class DrawerStopWatchViewHolder extends C4490d {
    @BindView(2131362245)
    ImageView clearButton;
    @BindView(2131362592)
    ImageView dragHandle;

    /* renamed from: e */
    private C8160i f11398e;

    /* renamed from: f */
    private boolean f11399f;
    @BindView(2131362906)
    ImageView icon;
    @BindView(2131363513)
    ImageView playPauseButton;
    @BindView(2131363887)
    TextView stopWatchName;
    @BindView(2131363888)
    TextView stopWatchTime;

    public DrawerStopWatchViewHolder(@NonNull View view, C4481a aVar, int i) {
        super(view, aVar);
        ButterKnife.bind((Object) this, view);
        float f = (float) i;
        this.stopWatchName.setTextSize(2, f);
        this.stopWatchTime.setTextSize(2, f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public TextView[] mo28842A() {
        return new TextView[]{this.stopWatchName, this.stopWatchTime};
    }

    /* renamed from: D */
    public void mo28843D(@NonNull C8153b bVar, boolean z) {
        super.mo28843D(bVar, z);
        if (bVar instanceof C8160i) {
            int i = 8;
            this.icon.setVisibility(bVar.hideIcon() ? 8 : 0);
            this.f11398e = (C8160i) bVar;
            mo28888G(this.icon, bVar, C17530R$drawable.ic_timer_white_24dp);
            mo28887F(this.f11398e.getColor());
            this.stopWatchName.setText(this.f11398e.getName());
            this.stopWatchName.setVisibility(this.f11398e.getHideName() ? 8 : 0);
            mo28847E();
            mo28890I(this.dragHandle);
            if (z) {
                this.dragHandle.setVisibility(0);
                mo28890I(this.dragHandle);
            } else {
                this.dragHandle.setVisibility(8);
            }
            boolean isValid = this.f11398e.isValid();
            this.playPauseButton.setVisibility(isValid ? 0 : 8);
            this.clearButton.setVisibility(isValid ? 0 : 8);
            TextView textView = this.stopWatchTime;
            if (isValid) {
                i = 0;
            }
            textView.setVisibility(i);
            return;
        }
        throw new IllegalArgumentException("DrawerItemStopwatch required");
    }

    /* renamed from: E */
    public void mo28847E() {
        boolean f = C10330a.m40554f(this.itemView.getContext(), this.f11398e.getStopwatchName());
        this.f11399f = f;
        this.icon.setAlpha(f ? 1.0f : 0.5f);
        this.playPauseButton.setImageResource(this.f11399f ? C17530R$drawable.ic_pause_white_24dp : C17530R$drawable.ic_play_white_24dp);
        mo28891J(this.playPauseButton);
        this.stopWatchTime.setText(C10330a.m40551c(C10330a.m40552d(this.itemView.getContext(), this.f11398e.getStopwatchName())));
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131362245})
    public void onClearButton() {
        C10330a.m40556h(this.itemView.getContext(), this.f11398e.getStopwatchName());
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131363513})
    public void onPlayPauseClicked() {
        if (this.f11399f) {
            C10330a.m40555g(this.itemView.getContext(), this.f11398e.getStopwatchName());
        } else {
            C10330a.m40558j(this.itemView.getContext(), this.f11398e.getStopwatchName());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public ImageView[] mo28845z() {
        return new ImageView[]{this.icon, this.playPauseButton, this.clearButton};
    }
}
