package p080e0;

import android.accounts.Account;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.arlosoft.macrodroid.C17535R$layout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: e0.b */
/* compiled from: AccountAdapter */
public class C7262b extends BaseAdapter {

    /* renamed from: a */
    private final C7263a f17692a;

    /* renamed from: c */
    private List<Account> f17693c;

    /* renamed from: d */
    private Map<Account, String> f17694d;

    /* renamed from: f */
    private PackageManager f17695f;

    /* renamed from: e0.b$a */
    /* compiled from: AccountAdapter */
    public interface C7263a {
        /* renamed from: a */
        void mo27078a(Account account, String str);
    }

    public C7262b(@NonNull Activity activity, @NonNull Map<Account, String> map, @Nullable C7263a aVar) {
        this.f17692a = aVar;
        this.f17694d = map;
        this.f17693c = new ArrayList(map.keySet());
        this.f17695f = activity.getApplicationContext().getPackageManager();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.content.pm.ApplicationInfo} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m29980b(int r7, android.view.View r8) {
        /*
            r6 = this;
            java.lang.Object r7 = r6.getItem(r7)
            android.accounts.Account r7 = (android.accounts.Account) r7
            r0 = 2131361844(0x7f0a0034, float:1.8343452E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2131361989(0x7f0a00c5, float:1.8343746E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 2131361987(0x7f0a00c3, float:1.8343742E38)
            android.view.View r2 = r8.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            java.lang.String r3 = r7.name
            r0.setText(r3)
            java.util.Map<android.accounts.Account, java.lang.String> r0 = r6.f17694d
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            r3 = 0
            if (r0 == 0) goto L_0x004c
            android.content.pm.PackageManager r4 = r6.f17695f     // Catch:{ NameNotFoundException -> 0x0039 }
            r5 = 0
            android.content.pm.ApplicationInfo r3 = r4.getApplicationInfo(r0, r5)     // Catch:{ NameNotFoundException -> 0x0039 }
            goto L_0x003a
        L_0x0039:
        L_0x003a:
            if (r3 == 0) goto L_0x0043
            android.content.pm.PackageManager r4 = r6.f17695f
            java.lang.CharSequence r3 = r4.getApplicationLabel(r3)
            goto L_0x0044
        L_0x0043:
            r3 = r0
        L_0x0044:
            java.lang.String r3 = (java.lang.String) r3
            r1.setText(r3)
            r6.m29983e(r2, r0)
        L_0x004c:
            e0.a r1 = new e0.a
            r1.<init>(r6, r7, r3, r0)
            r8.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p080e0.C7262b.m29980b(int, android.view.View):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m29981c(Account account, String str, String str2, View view) {
        C7263a aVar = this.f17692a;
        if (aVar != null) {
            if (str == null) {
                str = str2;
            }
            aVar.mo27078a(account, str);
        }
    }

    /* renamed from: d */
    private View m29982d(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.list_item_account, viewGroup, false);
    }

    /* renamed from: e */
    private void m29983e(ImageView imageView, String str) {
        try {
            imageView.setImageDrawable(this.f17695f.getApplicationIcon(str));
        } catch (Exception unused) {
        }
    }

    public int getCount() {
        return this.f17693c.size();
    }

    public Object getItem(int i) {
        return this.f17693c.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = m29982d(viewGroup);
        }
        m29980b(i, view);
        return view;
    }
}
