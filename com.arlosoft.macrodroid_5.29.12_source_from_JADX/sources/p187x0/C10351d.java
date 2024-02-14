package p187x0;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.common.C4013g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: x0.d */
/* compiled from: ApplicationAdapter */
public class C10351d extends BaseAdapter implements Filterable {

    /* renamed from: a */
    private final C10353b f23557a;

    /* renamed from: c */
    private final Set<C4013g> f23558c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<C4013g> f23559d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<C4013g> f23560f;

    /* renamed from: g */
    private Context f23561g;

    /* renamed from: o */
    private PackageManager f23562o;

    /* renamed from: x0.d$a */
    /* compiled from: ApplicationAdapter */
    class C10352a extends C10354e {

        /* renamed from: a */
        boolean f23563a = false;

        C10352a() {
        }

        /* renamed from: a */
        public final void mo41019a(CharSequence charSequence, boolean z) {
            this.f23563a = z;
            filter(charSequence);
        }

        /* access modifiers changed from: protected */
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = new ArrayList();
            int size = C10351d.this.f23559d.size();
            for (int i = 0; i < size; i++) {
                C4013g gVar = (C4013g) C10351d.this.f23559d.get(i);
                if ((charSequence == null || charSequence.toString().length() == 0 || gVar.f10396a.toLowerCase().contains(charSequence.toString().toLowerCase())) && (this.f23563a || gVar.f10398c)) {
                    arrayList.add(gVar);
                }
            }
            filterResults.count = arrayList.size();
            filterResults.values = arrayList;
            return filterResults;
        }

        /* access modifiers changed from: protected */
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            List unused = C10351d.this.f23560f = (List) filterResults.values;
            C10351d.this.notifyDataSetChanged();
        }
    }

    /* renamed from: x0.d$b */
    /* compiled from: ApplicationAdapter */
    public interface C10353b {
        /* renamed from: a */
        void mo26324a(C4013g gVar);
    }

    public C10351d(@NonNull Activity activity, @NonNull List<C4013g> list, @Nullable List<Boolean> list2, @Nullable C10353b bVar) {
        this.f23557a = bVar;
        this.f23561g = activity.getApplicationContext();
        if (list2 != null) {
            this.f23558c = new HashSet();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list2.get(i).booleanValue()) {
                    this.f23558c.add(list.get(i));
                }
            }
        } else {
            this.f23558c = null;
        }
        this.f23562o = this.f23561g.getPackageManager();
        this.f23559d = list;
        this.f23560f = new ArrayList(this.f23559d);
    }

    /* renamed from: f */
    private void m40645f(int i, View view) {
        C4013g gVar = (C4013g) getItem(i);
        TextView textView = (TextView) view.findViewById(C17532R$id.app_name);
        TextView textView2 = (TextView) view.findViewById(C17532R$id.app_package);
        ImageView imageView = (ImageView) view.findViewById(C17532R$id.app_icon);
        CheckBox checkBox = (CheckBox) view.findViewById(2131362229);
        if (this.f23558c == null) {
            checkBox.setVisibility(8);
            view.setOnClickListener(new C17506b(this, gVar));
        } else {
            checkBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            checkBox.setChecked(this.f23558c.contains(gVar));
            checkBox.setOnCheckedChangeListener(new C17507c(this, gVar));
            view.setOnClickListener(new C17505a(checkBox));
        }
        textView.setText(gVar.f10396a);
        textView2.setText(gVar.f10397b);
        m40650m(imageView, gVar.f10397b);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m40646i(C4013g gVar, View view) {
        C10353b bVar = this.f23557a;
        if (bVar != null) {
            bVar.mo26324a(gVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m40647j(C4013g gVar, CompoundButton compoundButton, boolean z) {
        if (z) {
            this.f23558c.add(gVar);
        } else {
            this.f23558c.remove(gVar);
        }
    }

    /* renamed from: l */
    private View m40649l(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.app_list_item, viewGroup, false);
    }

    /* renamed from: m */
    private void m40650m(ImageView imageView, String str) {
        try {
            imageView.setImageDrawable(this.f23562o.getApplicationIcon(str));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    public List<C4013g> mo41012g() {
        return new ArrayList(this.f23558c);
    }

    public int getCount() {
        return this.f23560f.size();
    }

    public Object getItem(int i) {
        return this.f23560f.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = m40649l(viewGroup);
        }
        m40645f(i, view);
        return view;
    }

    /* renamed from: h */
    public C10354e getFilter() {
        return new C10352a();
    }
}
