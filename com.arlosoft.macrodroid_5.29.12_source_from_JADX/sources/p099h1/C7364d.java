package p099h1;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.arlosoft.macrodroid.common.C4001c1;
import java.util.List;

/* renamed from: h1.d */
/* compiled from: SelectableItemCategory */
public class C7364d implements Comparable<C7364d> {

    /* renamed from: a */
    private String f18007a;
    @DrawableRes

    /* renamed from: c */
    private int f18008c;

    /* renamed from: d */
    private List<C4001c1> f18009d;

    public C7364d(String str, @DrawableRes int i, List<C4001c1> list) {
        this.f18007a = str;
        this.f18008c = i;
        this.f18009d = list;
    }

    /* renamed from: b */
    public int compareTo(@NonNull C7364d dVar) {
        return this.f18007a.compareTo(dVar.f18007a);
    }

    /* renamed from: d */
    public String mo37343d() {
        return this.f18007a;
    }

    @DrawableRes
    /* renamed from: e */
    public int mo37344e() {
        return this.f18008c;
    }

    /* renamed from: f */
    public List<C4001c1> mo37345f() {
        return this.f18009d;
    }

    /* renamed from: g */
    public void mo37346g(List<C4001c1> list) {
        this.f18009d = list;
    }
}
