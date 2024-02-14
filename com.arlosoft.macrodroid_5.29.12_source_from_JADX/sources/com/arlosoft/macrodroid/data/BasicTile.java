package com.arlosoft.macrodroid.data;

import com.arlosoft.macrodroid.common.DontObfuscate;
import kotlin.jvm.internal.C13695i;
import p014b3.C1405a;

@DontObfuscate
/* compiled from: HomeScreenTileConfig.kt */
public final class BasicTile extends HomeTile {
    private final long tileId;

    public BasicTile() {
        this(0, 1, (C13695i) null);
    }

    public BasicTile(long j) {
        super(HomeTile.TILE_TYPE_BASIC);
        this.tileId = j;
    }

    public static /* synthetic */ BasicTile copy$default(BasicTile basicTile, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = basicTile.getTileId();
        }
        return basicTile.copy(j);
    }

    public final long component1() {
        return getTileId();
    }

    public final BasicTile copy(long j) {
        return new BasicTile(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BasicTile) && getTileId() == ((BasicTile) obj).getTileId();
    }

    public long getTileId() {
        return this.tileId;
    }

    public int hashCode() {
        return C1405a.m633a(getTileId());
    }

    public String toString() {
        return "BasicTile(tileId=" + getTileId() + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasicTile(long j, int i, C13695i iVar) {
        this((i & 1) != 0 ? 0 : j);
    }
}
