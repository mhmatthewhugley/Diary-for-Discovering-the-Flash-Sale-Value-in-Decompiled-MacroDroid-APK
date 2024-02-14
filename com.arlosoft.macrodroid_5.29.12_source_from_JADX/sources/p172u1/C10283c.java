package p172u1;

import android.util.SparseArray;
import com.arlosoft.macrodroid.action.UiInteractionConfiguration;
import com.arlosoft.macrodroid.action.textmanipulation.C3489a;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.data.BasicTile;
import com.arlosoft.macrodroid.data.CustomTile;
import com.arlosoft.macrodroid.data.HomeTile;
import com.arlosoft.macrodroid.macro.C4921g;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.variables.VariableValue;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import p149q1.C8153b;
import p149q1.C8154c;
import p149q1.C8155d;
import p149q1.C8156e;
import p149q1.C8157f;
import p149q1.C8158g;
import p149q1.C8159h;
import p149q1.C8160i;
import p149q1.C8161j;
import p149q1.C8162k;
import p181w0.C10326a;

/* renamed from: u1.c */
/* compiled from: GsonUtils */
public class C10283c {

    /* renamed from: a */
    private static final GsonBuilder f23435a = new GsonBuilder().mo64011j();

    /* renamed from: u1.c$a */
    /* compiled from: GsonUtils */
    class C10284a extends TypeToken<SparseArray<VariableValue>> {
        C10284a() {
        }
    }

    /* renamed from: a */
    public static Gson m40411a() {
        return f23435a.mo64007f(m40412b()).mo64004c();
    }

    /* renamed from: b */
    public static C10285d<C8153b> m40412b() {
        return C10285d.m40421f(C8153b.class, "type").mo40899h(C8156e.class, C8156e.ITEM_TYPE).mo40899h(C8157f.class, C8157f.ITEM_TYPE).mo40899h(C8154c.class, C8154c.ITEM_TYPE).mo40899h(C8160i.class, C8160i.ITEM_TYPE).mo40899h(C8162k.class, C8162k.ITEM_TYPE).mo40899h(C8155d.class, C8155d.ITEM_TYPE).mo40899h(C8161j.class, C8161j.ITEM_TYPE).mo40899h(C8158g.class, C8158g.ITEM_TYPE).mo40899h(C8159h.class, C8159h.ITEM_TYPE);
    }

    /* renamed from: c */
    public static GsonBuilder m40413c() {
        return m40414d(true, true);
    }

    /* renamed from: d */
    public static GsonBuilder m40414d(boolean z, boolean z2) {
        new C10284a().mo61492m();
        GsonBuilder i = new GsonBuilder().mo64005d(128, 8).mo64007f(C3489a.m14479a()).mo64006e(UiInteractionConfiguration.class, new C10289f()).mo64006e(VariableValue.class, new C10282b()).mo64006e(VariableValue.class, new C10281a()).mo64007f(C10287e.f23443a).mo64008g().mo64003a(new C10326a()).mo64010i();
        if (z) {
            i.mo64007f(m40412b());
        }
        if (z2) {
            i.mo64007f(m40415e());
        }
        return i;
    }

    /* renamed from: e */
    public static C10285d<HomeTile> m40415e() {
        return C10285d.m40421f(HomeTile.class, "tileType").mo40899h(BasicTile.class, HomeTile.TILE_TYPE_BASIC).mo40899h(CustomTile.class, HomeTile.TILE_TYPE_CUSTOM);
    }

    /* renamed from: f */
    public static Gson m40416f() {
        return m40413c().mo64006e(ActionBlock.class, new C4921g(MacroDroidApplication.m14845u(), true, true, true)).mo64006e(Macro.class, new C4921g(MacroDroidApplication.m14845u(), true, true, true)).mo64004c();
    }
}
