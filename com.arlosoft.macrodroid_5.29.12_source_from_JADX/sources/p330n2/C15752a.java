package p330n2;

import com.arlosoft.macrodroid.powermenu.PowerMenuService;
import java.util.List;
import java.util.concurrent.Flow;

/* renamed from: n2.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C15752a implements Flow.Publisher {

    /* renamed from: a */
    public final /* synthetic */ List f65089a;

    public /* synthetic */ C15752a(List list) {
        this.f65089a = list;
    }

    public final void subscribe(Flow.Subscriber subscriber) {
        PowerMenuService.m19506b(this.f65089a, subscriber);
    }
}
