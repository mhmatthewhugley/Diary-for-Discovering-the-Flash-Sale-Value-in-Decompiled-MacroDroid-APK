package p189x2;

import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.arlosoft.macrodroid.C17532R$id;
import kotlin.jvm.internal.C13706o;
import p268g8.C12316b;

/* renamed from: x2.a */
/* compiled from: TaskerPluginHelper.kt */
public final class C10356a extends C12316b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10356a(View view) {
        super(view);
        C13706o.m87929f(view, "itemView");
    }

    /* renamed from: w */
    public final void mo41022w(String str) {
        C13706o.m87929f(str, "packageName");
        PackageManager packageManager = this.itemView.getContext().getPackageManager();
        String obj = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
        Drawable applicationIcon = packageManager.getApplicationIcon(str);
        C13706o.m87928e(applicationIcon, "packageManager.getApplicationIcon(packageName)");
        ((ImageView) this.itemView.findViewById(C17532R$id.appIcon)).setImageDrawable(applicationIcon);
        ((TextView) this.itemView.findViewById(C17532R$id.appName)).setText(obj);
    }
}
