package com.arlosoft.macrodroid.videos.data;

import com.arlosoft.macrodroid.common.DontObfuscate;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: VideoInfo.kt */
public final class VideoInfo {
    private final String description;
    private final String image;
    private final boolean isOfficial;
    private final String title;
    private final String url;
    private final String user;

    public VideoInfo(String str, String str2, String str3, String str4, boolean z, String str5) {
        C13706o.m87929f(str, "user");
        C13706o.m87929f(str2, "url");
        C13706o.m87929f(str3, "title");
        C13706o.m87929f(str4, "description");
        C13706o.m87929f(str5, "image");
        this.user = str;
        this.url = str2;
        this.title = str3;
        this.description = str4;
        this.isOfficial = z;
        this.image = str5;
    }

    public static /* synthetic */ VideoInfo copy$default(VideoInfo videoInfo, String str, String str2, String str3, String str4, boolean z, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoInfo.user;
        }
        if ((i & 2) != 0) {
            str2 = videoInfo.url;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = videoInfo.title;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = videoInfo.description;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            z = videoInfo.isOfficial;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str5 = videoInfo.image;
        }
        return videoInfo.copy(str, str6, str7, str8, z2, str5);
    }

    public final String component1() {
        return this.user;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final boolean component5() {
        return this.isOfficial;
    }

    public final String component6() {
        return this.image;
    }

    public final VideoInfo copy(String str, String str2, String str3, String str4, boolean z, String str5) {
        C13706o.m87929f(str, "user");
        C13706o.m87929f(str2, "url");
        C13706o.m87929f(str3, "title");
        C13706o.m87929f(str4, "description");
        C13706o.m87929f(str5, "image");
        return new VideoInfo(str, str2, str3, str4, z, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfo)) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) obj;
        return C13706o.m87924a(this.user, videoInfo.user) && C13706o.m87924a(this.url, videoInfo.url) && C13706o.m87924a(this.title, videoInfo.title) && C13706o.m87924a(this.description, videoInfo.description) && this.isOfficial == videoInfo.isOfficial && C13706o.m87924a(this.image, videoInfo.image);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode = ((((((this.user.hashCode() * 31) + this.url.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31;
        boolean z = this.isOfficial;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.image.hashCode();
    }

    public final boolean isOfficial() {
        return this.isOfficial;
    }

    public String toString() {
        return "VideoInfo(user=" + this.user + ", url=" + this.url + ", title=" + this.title + ", description=" + this.description + ", isOfficial=" + this.isOfficial + ", image=" + this.image + ')';
    }
}
