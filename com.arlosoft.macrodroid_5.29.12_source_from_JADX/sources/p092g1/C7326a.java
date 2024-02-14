package p092g1;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import java.util.List;

/* renamed from: g1.a */
/* compiled from: CalendarArrayAdapter */
public class C7326a extends ArrayAdapter<C7327b> {

    /* renamed from: a */
    private List<C7327b> f17926a;

    /* renamed from: c */
    private Activity f17927c;

    public C7326a(Activity activity, List<C7327b> list) {
        super(activity, 17367043, list);
        this.f17926a = list;
        this.f17927c = activity;
    }

    /* renamed from: a */
    public C7327b getItem(int i) {
        return this.f17926a.get(i);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return getView(i, view, viewGroup);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f17927c.getLayoutInflater().inflate(C17535R$layout.list_item_calendar_entry, viewGroup, false);
        }
        C7327b a = getItem(i);
        ((TextView) view.findViewById(C17532R$id.calendar_account)).setText(a.f17930d);
        ((TextView) view.findViewById(C17532R$id.calendar_name)).setText(a.f17929c);
        return view;
    }
}
