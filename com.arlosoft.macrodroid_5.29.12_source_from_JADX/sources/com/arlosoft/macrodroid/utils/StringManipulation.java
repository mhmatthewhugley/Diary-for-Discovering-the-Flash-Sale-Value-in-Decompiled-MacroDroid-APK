package com.arlosoft.macrodroid.utils;

import android.app.Activity;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.util.Pair;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4023j0;
import java.util.ArrayList;
import java.util.List;

public class StringManipulation {

    /* renamed from: a */
    private static Pair<String, String> f14944a = new Pair<>("{left(x,text)}", "Takes the leftmost 'x' character from the text");

    /* renamed from: b */
    private static Pair<String, String> f14945b = new Pair<>("{right(x,text)}", "Takes the righmost 'x' characters from the text");

    /* renamed from: c */
    private static Pair<String, String> f14946c = new Pair<>("{replace(original,new)}", "Replaces all instances of the original string with the new string");

    /* renamed from: d */
    private static List<Pair<String, String>> f14947d;

    public static class StringManipOptionsAdapter extends RecyclerView.Adapter<ViewHolder> {

        /* renamed from: a */
        private final List<Pair<String, String>> f14948a;

        /* renamed from: b */
        private final C4023j0.C4028e f14949b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final Dialog f14950c;

        class ViewHolder extends RecyclerView.ViewHolder {
            @BindView(2131363891)
            TextView description;
            @BindView(2131362571)
            View divider;
            @BindView(2131363892)
            ViewGroup entry;
            @BindView(2131363893)
            TextView text;

            public ViewHolder(View view) {
                super(view);
                ButterKnife.bind((Object) this, view);
            }

            /* access modifiers changed from: private */
            /* renamed from: v */
            public /* synthetic */ void m24592v(C4023j0.C4028e eVar, Pair pair, View view) {
                if (eVar != null) {
                    eVar.mo25564a(new C4023j0.C4029f((String) pair.first, ""));
                }
                StringManipOptionsAdapter.this.f14950c.dismiss();
            }

            /* renamed from: u */
            public void mo32415u(Pair<String, String> pair, boolean z, C4023j0.C4028e eVar) {
                this.text.setText((CharSequence) pair.first);
                this.description.setText((CharSequence) pair.second);
                this.entry.setOnClickListener(new C6393i1(this, eVar, pair));
                this.divider.setVisibility(z ? 8 : 0);
            }
        }

        public class ViewHolder_ViewBinding implements Unbinder {

            /* renamed from: a */
            private ViewHolder f14952a;

            @UiThread
            public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
                this.f14952a = viewHolder;
                viewHolder.entry = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.string_manipulation_entry, "field 'entry'", ViewGroup.class);
                viewHolder.text = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.string_manipulation_text, "field 'text'", TextView.class);
                viewHolder.description = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.string_manipulation_description, "field 'description'", TextView.class);
                viewHolder.divider = Utils.findRequiredView(view, C17532R$id.divider, "field 'divider'");
            }

            @CallSuper
            public void unbind() {
                ViewHolder viewHolder = this.f14952a;
                if (viewHolder != null) {
                    this.f14952a = null;
                    viewHolder.entry = null;
                    viewHolder.text = null;
                    viewHolder.description = null;
                    viewHolder.divider = null;
                    return;
                }
                throw new IllegalStateException("Bindings already cleared.");
            }
        }

        public StringManipOptionsAdapter(List<Pair<String, String>> list, Dialog dialog, C4023j0.C4028e eVar) {
            this.f14948a = list;
            this.f14949b = eVar;
            this.f14950c = dialog;
        }

        /* renamed from: C */
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            Pair pair = this.f14948a.get(i);
            boolean z = true;
            if (i != getItemCount() - 1) {
                z = false;
            }
            viewHolder.mo32415u(pair, z, this.f14949b);
        }

        /* renamed from: D */
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.list_item_string_manipulation, viewGroup, false));
        }

        public int getItemCount() {
            return this.f14948a.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f14947d = arrayList;
        arrayList.add(f14944a);
        f14947d.add(f14945b);
        f14947d.add(f14946c);
    }

    /* renamed from: a */
    public static void m24587a(Activity activity, int i, C4023j0.C4028e eVar) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(activity, i);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_string_manipulation);
        appCompatDialog.setTitle((int) C17541R$string.select_option);
        RecyclerView recyclerView = (RecyclerView) appCompatDialog.findViewById(2131363593);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setAdapter(new StringManipOptionsAdapter(f14947d, appCompatDialog, eVar));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        appCompatDialog.show();
        appCompatDialog.getWindow().setAttributes(layoutParams);
    }
}
