package com.arlosoft.macrodroid.data;

import android.os.Build;
import com.arlosoft.macrodroid.common.DontObfuscate;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: HomeScreenTileConfig.kt */
public final class HomeScreenTileConfig {
    public static final C4358a Companion = new C4358a((C13695i) null);
    public static final String HOME_SCREEN_TILES_CACHE = "HomeScreenTiles";
    public static final String HOME_SCREEN_TILES_KEY = "HomeScreenTiles";
    private final List<HomeTile> tiles;

    /* renamed from: com.arlosoft.macrodroid.data.HomeScreenTileConfig$a */
    /* compiled from: HomeScreenTileConfig.kt */
    public static final class C4358a {
        private C4358a() {
        }

        public /* synthetic */ C4358a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final HomeScreenTileConfig mo28524a() {
            BasicTile[] basicTileArr = new BasicTile[21];
            basicTileArr[0] = new BasicTile(2);
            basicTileArr[1] = new BasicTile(18);
            basicTileArr[2] = new BasicTile(5);
            basicTileArr[3] = new BasicTile(23);
            basicTileArr[4] = new BasicTile(6);
            basicTileArr[5] = new BasicTile(7);
            basicTileArr[6] = new BasicTile(8);
            basicTileArr[7] = new BasicTile(9);
            basicTileArr[8] = new BasicTile(10);
            basicTileArr[9] = new BasicTile(11);
            basicTileArr[10] = new BasicTile(24);
            basicTileArr[11] = new BasicTile(20);
            basicTileArr[12] = new BasicTile(21);
            basicTileArr[13] = new BasicTile(25);
            basicTileArr[14] = new BasicTile(22);
            basicTileArr[15] = new BasicTile(12);
            basicTileArr[16] = new BasicTile(13);
            basicTileArr[17] = new BasicTile(14);
            basicTileArr[18] = new BasicTile(Build.VERSION.SDK_INT >= 24 ? 15 : 19);
            basicTileArr[19] = new BasicTile(16);
            basicTileArr[20] = new BasicTile(17);
            return new HomeScreenTileConfig(C13614t.m87751m(basicTileArr));
        }
    }

    public HomeScreenTileConfig(List<? extends HomeTile> list) {
        C13706o.m87929f(list, "tiles");
        this.tiles = list;
    }

    public static /* synthetic */ HomeScreenTileConfig copy$default(HomeScreenTileConfig homeScreenTileConfig, List<HomeTile> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = homeScreenTileConfig.tiles;
        }
        return homeScreenTileConfig.copy(list);
    }

    public final List<HomeTile> component1() {
        return this.tiles;
    }

    public final HomeScreenTileConfig copy(List<? extends HomeTile> list) {
        C13706o.m87929f(list, "tiles");
        return new HomeScreenTileConfig(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HomeScreenTileConfig) && C13706o.m87924a(this.tiles, ((HomeScreenTileConfig) obj).tiles);
    }

    public final List<HomeTile> getTiles() {
        return this.tiles;
    }

    public int hashCode() {
        return this.tiles.hashCode();
    }

    public String toString() {
        return "HomeScreenTileConfig(tiles=" + this.tiles + ')';
    }
}
