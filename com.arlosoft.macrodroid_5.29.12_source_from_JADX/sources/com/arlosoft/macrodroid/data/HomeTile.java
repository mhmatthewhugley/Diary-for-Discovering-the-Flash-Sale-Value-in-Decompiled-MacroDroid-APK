package com.arlosoft.macrodroid.data;

import com.arlosoft.macrodroid.common.DontObfuscate;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: HomeScreenTileConfig.kt */
public abstract class HomeTile {
    public static final C4359a Companion = new C4359a((C13695i) null);
    public static final String TILE_TYPE_BASIC = "basic";
    public static final String TILE_TYPE_CUSTOM = "custom";
    private final String tileType;

    /* renamed from: com.arlosoft.macrodroid.data.HomeTile$a */
    /* compiled from: HomeScreenTileConfig.kt */
    public static final class C4359a {
        private C4359a() {
        }

        public /* synthetic */ C4359a(C13695i iVar) {
            this();
        }
    }

    public HomeTile(String str) {
        C13706o.m87929f(str, "tileType");
        this.tileType = str;
    }

    public abstract long getTileId();
}
