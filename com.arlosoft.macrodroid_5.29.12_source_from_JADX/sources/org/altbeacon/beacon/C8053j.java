package org.altbeacon.beacon;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.C13708q;
import p297ja.C13321g;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028FX\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R'\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00028FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007¨\u0006\u0010"}, mo71668d2 = {"Lorg/altbeacon/beacon/j;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/MutableLiveData;", "", "regionState$delegate", "Lja/g;", "g", "()Landroidx/lifecycle/MutableLiveData;", "regionState", "", "Lorg/altbeacon/beacon/Beacon;", "rangedBeacons$delegate", "f", "rangedBeacons", "<init>", "()V", "android-beacon-library_release"}, mo71669k = 1, mo71670mv = {1, 4, 2})
/* renamed from: org.altbeacon.beacon.j */
/* compiled from: RegionViewModel.kt */
public final class C8053j extends ViewModel {

    /* renamed from: a */
    private final C13321g f19644a = C13323i.m85669b(C8055b.f19647a);

    /* renamed from: b */
    private final C13321g f19645b = C13323i.m85669b(C8054a.f19646a);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "Lorg/altbeacon/beacon/Beacon;", "a", "()Landroidx/lifecycle/MutableLiveData;"}, mo71669k = 3, mo71670mv = {1, 4, 2})
    /* renamed from: org.altbeacon.beacon.j$a */
    /* compiled from: RegionViewModel.kt */
    static final class C8054a extends C13708q implements C16254a<MutableLiveData<Collection<? extends Beacon>>> {

        /* renamed from: a */
        public static final C8054a f19646a = new C8054a();

        C8054a() {
            super(0);
        }

        /* renamed from: a */
        public final MutableLiveData<Collection<Beacon>> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "a", "()Landroidx/lifecycle/MutableLiveData;"}, mo71669k = 3, mo71670mv = {1, 4, 2})
    /* renamed from: org.altbeacon.beacon.j$b */
    /* compiled from: RegionViewModel.kt */
    static final class C8055b extends C13708q implements C16254a<MutableLiveData<Integer>> {

        /* renamed from: a */
        public static final C8055b f19647a = new C8055b();

        C8055b() {
            super(0);
        }

        /* renamed from: a */
        public final MutableLiveData<Integer> invoke() {
            return new MutableLiveData<>();
        }
    }

    /* renamed from: f */
    public final MutableLiveData<Collection<Beacon>> mo38059f() {
        return (MutableLiveData) this.f19645b.getValue();
    }

    /* renamed from: g */
    public final MutableLiveData<Integer> mo38060g() {
        return (MutableLiveData) this.f19644a.getValue();
    }
}
