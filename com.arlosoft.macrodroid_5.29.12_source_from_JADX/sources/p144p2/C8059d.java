package p144p2;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;

/* renamed from: p2.d */
/* compiled from: QuickSettingsArrayAdapter */
public class C8059d extends ArrayAdapter<String> {

    /* renamed from: a */
    private boolean[] f19653a;

    public C8059d(@NonNull Context context, @NonNull String[] strArr, boolean[] zArr) {
        super(context, C17535R$layout.single_choice_list_item, strArr);
        this.f19653a = zArr;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        TextView textView = (TextView) view2.findViewById(16908308);
        if (!this.f19653a[i]) {
            textView.setText(Html.fromHtml(textView.getText() + "<br/><small>" + getContext().getString(C17541R$string.disabled) + "</small></br>"));
        }
        return view2;
    }
}
