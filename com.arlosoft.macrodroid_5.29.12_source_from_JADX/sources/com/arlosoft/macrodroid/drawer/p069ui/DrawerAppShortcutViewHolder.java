package com.arlosoft.macrodroid.drawer.p069ui;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import p149q1.C8153b;
import p149q1.C8155d;
import p319lc.C15626c;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerAppShortcutViewHolder */
public class DrawerAppShortcutViewHolder extends C4490d {
    @BindView(2131361989)
    TextView appName;
    @BindView(2131362592)
    ImageView dragHandle;

    /* renamed from: e */
    private C8155d f11349e;
    @BindView(2131362906)
    ImageView icon;

    public DrawerAppShortcutViewHolder(@NonNull View view, C4481a aVar, int i) {
        super(view, aVar);
        ButterKnife.bind((Object) this, view);
        this.appName.setTextSize(2, (float) i);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: A */
    public TextView[] mo28842A() {
        return new TextView[]{this.appName};
    }

    /* renamed from: D */
    public void mo28843D(@NonNull C8153b bVar, boolean z) {
        super.mo28843D(bVar, z);
        if (bVar instanceof C8155d) {
            this.icon.setVisibility(bVar.hideIcon() ? 8 : 0);
            C8155d dVar = (C8155d) bVar;
            this.f11349e = dVar;
            this.appName.setText(dVar.getText());
            mo28889H(this.icon);
            if (bVar.getImageResourceName() != null) {
                mo28888G(this.icon, bVar, C17530R$drawable.launcher_no_border);
            } else {
                try {
                    this.icon.setImageDrawable(mo28895x().getPackageManager().getApplicationIcon(this.f11349e.getPackageName()));
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            mo28887F(this.f11349e.getColor());
            if (z) {
                this.dragHandle.setVisibility(0);
                mo28890I(this.dragHandle);
                return;
            }
            this.dragHandle.setVisibility(8);
            return;
        }
        throw new IllegalArgumentException("DrawerItemAppShortcut required");
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131363108})
    public void handleClick() {
        if (this.f11349e.isValid()) {
            mo28894w();
            Intent launchIntentForPackage = mo28895x().getPackageManager().getLaunchIntentForPackage(this.f11349e.getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addFlags(2097152);
                launchIntentForPackage.addFlags(268435456);
                mo28895x().startActivity(launchIntentForPackage);
                return;
            }
            C15626c.makeText(mo28895x().getApplicationContext(), C17541R$string.app_not_found, 0).show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public ImageView[] mo28845z() {
        return new ImageView[]{this.icon};
    }
}
