package com.arlosoft.macrodroid.homescreen.tiles;

import android.app.Activity;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.data.BasicTile;
import com.arlosoft.macrodroid.data.HomeTile;
import com.arlosoft.macrodroid.homescreen.C4762j;
import com.arlosoft.macrodroid.remoteconfig.C5070a;
import kotlin.jvm.internal.C13706o;
import p198z1.C10433a;

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.m */
/* compiled from: HomeScreenTileFactory.kt */
public final class C4811m {

    /* renamed from: a */
    private final Activity f12062a;

    /* renamed from: b */
    private final C4762j f12063b;

    /* renamed from: c */
    private final C5070a f12064c;

    /* renamed from: d */
    private final C4083b f12065d;

    public C4811m(Activity activity, C4762j jVar, C5070a aVar, C4083b bVar) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(jVar, "homeScreenNavigator");
        C13706o.m87929f(aVar, "remoteConfig");
        C13706o.m87929f(bVar, "premiumStatusHandler");
        this.f12062a = activity;
        this.f12063b = jVar;
        this.f12064c = aVar;
        this.f12065d = bVar;
    }

    /* renamed from: a */
    public final C10433a mo29345a(HomeTile homeTile) {
        C13706o.m87929f(homeTile, "tile");
        if (homeTile instanceof BasicTile) {
            long tileId = homeTile.getTileId();
            if (tileId == 1) {
                Activity activity = this.f12062a;
                C13706o.m87927d(activity, "null cannot be cast to non-null type com.arlosoft.macrodroid.homescreen.HomeScreenNavigator");
                return new C4815p(activity, (C4762j) activity);
            } else if (tileId == 2) {
                return new C4798b(this.f12062a, this.f12064c, this.f12065d);
            } else {
                if (tileId == 4) {
                    Activity activity2 = this.f12062a;
                    C13706o.m87927d(activity2, "null cannot be cast to non-null type com.arlosoft.macrodroid.homescreen.HomeScreenNavigator");
                    return new C4821v(activity2, (C4762j) activity2);
                } else if (tileId == 5) {
                    return new C4807k(this.f12062a);
                } else {
                    if (tileId == 6) {
                        return new C4812n(this.f12062a);
                    }
                    if (tileId == 7) {
                        return new C4825z(this.f12062a);
                    }
                    if (tileId == 8) {
                        return new C4822w(this.f12062a);
                    }
                    if (tileId == 9) {
                        return new C4810l(this.f12062a, this.f12063b);
                    }
                    if (tileId == 10) {
                        return new C4802f(this.f12062a, this.f12063b);
                    }
                    if (tileId == 11) {
                        return new C4823x(this.f12062a);
                    }
                    if (tileId == 12) {
                        return new C4824y(this.f12062a);
                    }
                    if (tileId == 13) {
                        return new C4800d(this.f12062a);
                    }
                    if (tileId == 14) {
                        return new C4803g(this.f12062a, this.f12063b);
                    }
                    if (tileId == 15) {
                        return new C4820u(this.f12062a, this.f12063b);
                    }
                    if (tileId == 16) {
                        return new C4801e(this.f12062a, this.f12063b);
                    }
                    if (tileId == 17) {
                        return new C4817r(this.f12062a, this.f12063b);
                    }
                    if (tileId == 18) {
                        return new C4799c(this.f12062a, this.f12064c, this.f12065d);
                    }
                    if (tileId == 19) {
                        return new C4816q(this.f12062a, this.f12063b);
                    }
                    if (tileId == 20) {
                        return new C4818s(this.f12062a, this.f12063b);
                    }
                    if (tileId == 21) {
                        return new C4813o(this.f12062a, this.f12063b);
                    }
                    if (tileId == 22) {
                        return new C4819t(this.f12062a, this.f12063b);
                    }
                    if (tileId == 23) {
                        return new C4789a(this.f12062a);
                    }
                    if (tileId == 24) {
                        return new C4790a0(this.f12062a);
                    }
                    if (tileId == 25) {
                        return new C4804h(this.f12062a, this.f12063b);
                    }
                    throw new IllegalArgumentException("Illegal tileid: " + homeTile.getTileId());
                }
            }
        } else {
            throw new IllegalArgumentException("Unkown tile: " + homeTile);
        }
    }
}
