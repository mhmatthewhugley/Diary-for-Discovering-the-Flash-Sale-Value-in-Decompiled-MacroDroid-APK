package com.arlosoft.macrodroid.videos.data;

import com.arlosoft.macrodroid.common.DontObfuscate;
import java.util.List;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: VideosData.kt */
public final class VideosData {
    private final List<VideoInfo> videoList;

    public VideosData(List<VideoInfo> list) {
        C13706o.m87929f(list, "videoList");
        this.videoList = list;
    }

    public static /* synthetic */ VideosData copy$default(VideosData videosData, List<VideoInfo> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = videosData.videoList;
        }
        return videosData.copy(list);
    }

    public final List<VideoInfo> component1() {
        return this.videoList;
    }

    public final VideosData copy(List<VideoInfo> list) {
        C13706o.m87929f(list, "videoList");
        return new VideosData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideosData) && C13706o.m87924a(this.videoList, ((VideosData) obj).videoList);
    }

    public final List<VideoInfo> getVideoList() {
        return this.videoList;
    }

    public int hashCode() {
        return this.videoList.hashCode();
    }

    public String toString() {
        return "VideosData(videoList=" + this.videoList + ')';
    }
}
