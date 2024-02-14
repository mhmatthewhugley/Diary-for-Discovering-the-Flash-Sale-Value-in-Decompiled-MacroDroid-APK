package com.arlosoft.macrodroid.drawer.p069ui;

import android.content.pm.PackageManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.arlosoft.macrodroid.C17530R$drawable;
import p149q1.C8153b;
import p149q1.C8158g;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerOpenShortcutViewHolder */
public class DrawerOpenShortcutViewHolder extends C4490d {
    @BindView(2131361989)
    TextView appName;
    @BindView(2131362592)
    ImageView dragHandle;

    /* renamed from: e */
    private C8158g f11366e;
    @BindView(2131362906)
    ImageView icon;

    public DrawerOpenShortcutViewHolder(@NonNull View view, C4481a aVar, int i) {
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
        if (bVar instanceof C8158g) {
            this.icon.setVisibility(bVar.hideIcon() ? 8 : 0);
            C8158g gVar = (C8158g) bVar;
            this.f11366e = gVar;
            this.appName.setText(gVar.getText());
            mo28889H(this.icon);
            if (bVar.getImageResourceName() != null) {
                mo28888G(this.icon, bVar, C17530R$drawable.launcher_no_border);
            } else {
                try {
                    this.icon.setImageDrawable(mo28895x().getPackageManager().getApplicationIcon(this.f11366e.getPackageName()));
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            mo28887F(this.f11366e.getColor());
            if (z) {
                this.dragHandle.setVisibility(0);
                mo28890I(this.dragHandle);
                return;
            }
            this.dragHandle.setVisibility(8);
            return;
        }
        throw new IllegalArgumentException("DrawerItemOpenShortcut required");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        com.arlosoft.macrodroid.common.C4061t1.m16023v(mo28895x(), mo28895x().getString(com.arlosoft.macrodroid.C17541R$string.action_launch_failed_to_launch) + " " + r5.f11366e.getName(), mo28895x().getString(com.arlosoft.macrodroid.C17541R$string.action_launch_shortcut_been_removed), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0070, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0071, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007f, code lost:
        p112j2.C7439d0.m30909o0(mo28895x(), "android.permission.CALL_PHONE", (java.lang.String) null, true, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0089, code lost:
        com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g("Failed to launch shortcut, MacroDroid may need a permission: " + r3.toString());
        p319lc.C15626c.m94876a(mo28895x().getApplicationContext(), r3.toString(), 1).show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:3:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0089  */
    @butterknife.OnClick({2131363108})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleClick() {
        /*
            r5 = this;
            java.lang.String r0 = "android.intent.action.CALL"
            q1.g r1 = r5.f11366e
            boolean r1 = r1.isValid()
            if (r1 == 0) goto L_0x00b4
            r5.mo28894w()
            r1 = 0
            q1.g r2 = r5.f11366e     // Catch:{ SecurityException -> 0x0070, Exception -> 0x0037 }
            java.lang.String r2 = r2.getIntent()     // Catch:{ SecurityException -> 0x0070, Exception -> 0x0037 }
            android.content.Intent r2 = android.content.Intent.getIntent(r2)     // Catch:{ SecurityException -> 0x0070, Exception -> 0x0037 }
            java.lang.String r3 = r2.getAction()     // Catch:{ SecurityException -> 0x0035, Exception -> 0x0037 }
            java.lang.String r4 = "android.intent.action.CALL_PRIVILEGED"
            boolean r3 = r3.equals(r4)     // Catch:{ SecurityException -> 0x0035, Exception -> 0x0037 }
            if (r3 == 0) goto L_0x0027
            r2.setAction(r0)     // Catch:{ SecurityException -> 0x0035, Exception -> 0x0037 }
        L_0x0027:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r3)     // Catch:{ SecurityException -> 0x0035, Exception -> 0x0037 }
            android.content.Context r3 = r5.mo28895x()     // Catch:{ SecurityException -> 0x0035, Exception -> 0x0037 }
            r3.startActivity(r2)     // Catch:{ SecurityException -> 0x0035, Exception -> 0x0037 }
            goto L_0x00b4
        L_0x0035:
            r3 = move-exception
            goto L_0x0072
        L_0x0037:
            android.content.Context r0 = r5.mo28895x()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r2 = r5.mo28895x()
            r3 = 2131951963(0x7f13015b, float:1.9540355E38)
            java.lang.String r2 = r2.getString(r3)
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            q1.g r2 = r5.f11366e
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.content.Context r2 = r5.mo28895x()
            r3 = 2131951967(0x7f13015f, float:1.9540363E38)
            java.lang.String r2 = r2.getString(r3)
            r3 = 0
            com.arlosoft.macrodroid.common.C4061t1.m16023v(r0, r1, r2, r3)
            goto L_0x00b4
        L_0x0070:
            r3 = move-exception
            r2 = r1
        L_0x0072:
            r4 = 1
            if (r2 == 0) goto L_0x0089
            java.lang.String r2 = r2.getAction()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0089
            android.content.Context r0 = r5.mo28895x()
            java.lang.String r2 = "android.permission.CALL_PHONE"
            p112j2.C7439d0.m30909o0(r0, r2, r1, r4, r4)
            goto L_0x00b4
        L_0x0089:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to launch shortcut, MacroDroid may need a permission: "
            r0.append(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            android.content.Context r0 = r5.mo28895x()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = r3.toString()
            lc.c r0 = p319lc.C15626c.m94876a(r0, r1, r4)
            r0.show()
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.drawer.p069ui.DrawerOpenShortcutViewHolder.handleClick():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public ImageView[] mo28845z() {
        return new ImageView[]{this.icon};
    }
}
