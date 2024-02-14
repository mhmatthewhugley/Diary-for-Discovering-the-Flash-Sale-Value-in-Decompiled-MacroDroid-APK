package com.arlosoft.macrodroid.triggers.activities.selecticon;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p113j3.C13287k;
import p113j3.C13288l;

public class SelectIconAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    private final ThreadPoolExecutor f13896a = new ThreadPoolExecutor(8, 8, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: b */
    private List<Integer> f13897b;

    /* renamed from: c */
    private List<String> f13898c;

    /* renamed from: d */
    private List<String> f13899d;

    /* renamed from: e */
    private final IconSelectFragment f13900e;

    /* renamed from: f */
    private Resources f13901f;

    static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131363057)
        ImageView icon;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f13902a;

        @UiThread
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f13902a = viewHolder;
            viewHolder.icon = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.list_item_icon_image, "field 'icon'", ImageView.class);
        }

        @CallSuper
        public void unbind() {
            ViewHolder viewHolder = this.f13902a;
            if (viewHolder != null) {
                this.f13902a = null;
                viewHolder.icon = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public SelectIconAdapter(IconSelectFragment iconSelectFragment, List<Integer> list, List<String> list2, List<String> list3) {
        this.f13900e = iconSelectFragment;
        this.f13897b = list;
        this.f13898c = list2;
        this.f13899d = list3;
        try {
            if (list2.size() > 1 && this.f13898c.get(0).equals(this.f13898c.get(1))) {
                this.f13901f = iconSelectFragment.getActivity().getPackageManager().getResourcesForApplication(this.f13898c.get(0));
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        java.lang.System.gc();
        r2 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0030 */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m23983G(java.lang.String r2, java.lang.String r3, int r4, com.arlosoft.macrodroid.triggers.activities.selecticon.SelectIconAdapter.ViewHolder r5) {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.f13901f     // Catch:{ OutOfMemoryError -> 0x0030 }
            if (r0 == 0) goto L_0x0011
            java.lang.String r4 = "drawable"
            int r2 = r0.getIdentifier(r2, r4, r3)     // Catch:{ OutOfMemoryError -> 0x0030 }
            android.content.res.Resources r3 = r1.f13901f     // Catch:{ OutOfMemoryError -> 0x0030 }
            android.graphics.drawable.Drawable r2 = r3.getDrawable(r2)     // Catch:{ OutOfMemoryError -> 0x0030 }
            goto L_0x0034
        L_0x0011:
            com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r2 = r1.f13900e     // Catch:{ OutOfMemoryError -> 0x0030 }
            androidx.fragment.app.FragmentActivity r2 = r2.getActivity()     // Catch:{ OutOfMemoryError -> 0x0030 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ OutOfMemoryError -> 0x0030 }
            android.content.res.Resources r2 = r2.getResourcesForApplication(r3)     // Catch:{ OutOfMemoryError -> 0x0030 }
            java.util.List<java.lang.Integer> r3 = r1.f13897b     // Catch:{ OutOfMemoryError -> 0x0030 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ OutOfMemoryError -> 0x0030 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ OutOfMemoryError -> 0x0030 }
            int r3 = r3.intValue()     // Catch:{ OutOfMemoryError -> 0x0030 }
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)     // Catch:{ OutOfMemoryError -> 0x0030 }
            goto L_0x0034
        L_0x0030:
            java.lang.System.gc()     // Catch:{ Exception -> 0x0044 }
            r2 = 0
        L_0x0034:
            if (r2 == 0) goto L_0x0044
            com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r3 = r1.f13900e     // Catch:{ Exception -> 0x0044 }
            androidx.fragment.app.FragmentActivity r3 = r3.getActivity()     // Catch:{ Exception -> 0x0044 }
            com.arlosoft.macrodroid.triggers.activities.selecticon.b r4 = new com.arlosoft.macrodroid.triggers.activities.selecticon.b     // Catch:{ Exception -> 0x0044 }
            r4.<init>(r5, r2)     // Catch:{ Exception -> 0x0044 }
            r3.runOnUiThread(r4)     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.activities.selecticon.SelectIconAdapter.m23983G(java.lang.String, java.lang.String, int, com.arlosoft.macrodroid.triggers.activities.selecticon.SelectIconAdapter$ViewHolder):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m23984H(int i, View view) {
        this.f13900e.mo31733B0(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ boolean m23985I(int i, View view) {
        this.f13900e.mo31734q0(i);
        return true;
    }

    /* renamed from: J */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        if (this.f13898c.size() != 0 && this.f13899d.size() != 0 && i < this.f13898c.size() && i < this.f13899d.size()) {
            String str = this.f13898c.get(i);
            String str2 = this.f13899d.get(i);
            if (str == null) {
                try {
                    viewHolder.icon.setImageDrawable(this.f13900e.getResources().getDrawable(this.f13897b.get(i).intValue()));
                } catch (Exception unused) {
                }
            } else if (str.equals("UserIcon")) {
                viewHolder.icon.setImageBitmap(BitmapFactory.decodeFile(str2));
            } else {
                viewHolder.icon.setImageDrawable((Drawable) null);
                this.f13896a.execute(new C5860c(this, str2, str, i, viewHolder));
            }
            viewHolder.icon.setOnClickListener(new C13287k(this, i));
            viewHolder.icon.setOnLongClickListener(new C13288l(this, i));
        }
    }

    /* renamed from: K */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.list_item_icon_selection, viewGroup, false));
    }

    /* renamed from: L */
    public void mo31745L(List<Integer> list, List<String> list2, List<String> list3) {
        this.f13897b = list;
        this.f13898c = list2;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f13897b.size();
    }
}
