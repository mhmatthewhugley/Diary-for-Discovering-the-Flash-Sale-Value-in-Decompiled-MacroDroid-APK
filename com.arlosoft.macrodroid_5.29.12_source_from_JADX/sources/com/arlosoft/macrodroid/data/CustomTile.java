package com.arlosoft.macrodroid.data;

import com.arlosoft.macrodroid.common.DontObfuscate;
import p014b3.C1405a;

@DontObfuscate
/* compiled from: HomeScreenTileConfig.kt */
public final class CustomTile extends HomeTile {
    private final long tileId;

    public CustomTile(long j) {
        super(HomeTile.TILE_TYPE_CUSTOM);
        this.tileId = j;
    }

    public static /* synthetic */ CustomTile copy$default(CustomTile customTile, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = customTile.getTileId();
        }
        return customTile.copy(j);
    }

    public final long component1() {
        return getTileId();
    }

    public final CustomTile copy(long j) {
        return new CustomTile(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CustomTile) && getTileId() == ((CustomTile) obj).getTileId();
    }

    public long getTileId() {
        return this.tileId;
    }

    public int hashCode() {
        return C1405a.m633a(getTileId());
    }

    public String toString() {
        return "CustomTile(tileId=" + getTileId() + ')';
    }
}
