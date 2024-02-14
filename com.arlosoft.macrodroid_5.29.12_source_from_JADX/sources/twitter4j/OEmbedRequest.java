package twitter4j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class OEmbedRequest implements Serializable {
    private static final long serialVersionUID = 7454130135274547901L;
    private Align align = Align.NONE;
    private boolean hideMedia = true;
    private boolean hideThread = true;
    private String lang;
    private int maxWidth;
    private boolean omitScript = false;
    private String[] related = new String[0];
    private final long statusId;
    private final String url;

    public enum Align {
        LEFT,
        CENTER,
        RIGHT,
        NONE
    }

    public OEmbedRequest(long j, String str) {
        this.statusId = j;
        this.url = str;
    }

    private void appendParameter(String str, String str2, List<HttpParameter> list) {
        if (str2 != null) {
            list.add(new HttpParameter(str, str2));
        }
    }

    public OEmbedRequest HideMedia(boolean z) {
        this.hideMedia = z;
        return this;
    }

    public OEmbedRequest HideThread(boolean z) {
        this.hideThread = z;
        return this;
    }

    public OEmbedRequest MaxWidth(int i) {
        this.maxWidth = i;
        return this;
    }

    public OEmbedRequest align(Align align2) {
        this.align = align2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public HttpParameter[] asHttpParameterArray() {
        ArrayList arrayList = new ArrayList(12);
        appendParameter("id", this.statusId, (List<HttpParameter>) arrayList);
        appendParameter("url", this.url, (List<HttpParameter>) arrayList);
        appendParameter("maxwidth", (long) this.maxWidth, (List<HttpParameter>) arrayList);
        arrayList.add(new HttpParameter("hide_media", this.hideMedia));
        arrayList.add(new HttpParameter("hide_thread", this.hideThread));
        arrayList.add(new HttpParameter("omit_script", this.omitScript));
        arrayList.add(new HttpParameter("align", this.align.name().toLowerCase()));
        String[] strArr = this.related;
        if (strArr.length > 0) {
            appendParameter("related", StringUtil.join(strArr), (List<HttpParameter>) arrayList);
        }
        appendParameter("lang", this.lang, (List<HttpParameter>) arrayList);
        return (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OEmbedRequest.class != obj.getClass()) {
            return false;
        }
        OEmbedRequest oEmbedRequest = (OEmbedRequest) obj;
        if (this.hideMedia != oEmbedRequest.hideMedia || this.hideThread != oEmbedRequest.hideThread || this.maxWidth != oEmbedRequest.maxWidth || this.omitScript != oEmbedRequest.omitScript || this.statusId != oEmbedRequest.statusId || this.align != oEmbedRequest.align) {
            return false;
        }
        String str = this.lang;
        if (str == null ? oEmbedRequest.lang != null : !str.equals(oEmbedRequest.lang)) {
            return false;
        }
        if (!Arrays.equals(this.related, oEmbedRequest.related)) {
            return false;
        }
        String str2 = this.url;
        String str3 = oEmbedRequest.url;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public int hashCode() {
        long j = this.statusId;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.url;
        int i2 = 0;
        int hashCode = (((((((((i + (str != null ? str.hashCode() : 0)) * 31) + this.maxWidth) * 31) + (this.hideMedia ? 1 : 0)) * 31) + (this.hideThread ? 1 : 0)) * 31) + (this.omitScript ? 1 : 0)) * 31;
        Align align2 = this.align;
        int hashCode2 = (hashCode + (align2 != null ? align2.hashCode() : 0)) * 31;
        String[] strArr = this.related;
        int hashCode3 = (hashCode2 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String str2 = this.lang;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode3 + i2;
    }

    public OEmbedRequest lang(String str) {
        this.lang = str;
        return this;
    }

    public OEmbedRequest omitScript(boolean z) {
        this.omitScript = z;
        return this;
    }

    public OEmbedRequest related(String[] strArr) {
        this.related = strArr;
        return this;
    }

    public void setAlign(Align align2) {
        this.align = align2;
    }

    public void setHideMedia(boolean z) {
        this.hideMedia = z;
    }

    public void setHideThread(boolean z) {
        this.hideThread = z;
    }

    public void setLang(String str) {
        this.lang = str;
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    public void setOmitScript(boolean z) {
        this.omitScript = z;
    }

    public void setRelated(String[] strArr) {
        this.related = strArr;
    }

    public String toString() {
        List list;
        StringBuilder sb = new StringBuilder();
        sb.append("OEmbedRequest{statusId=");
        sb.append(this.statusId);
        sb.append(", url='");
        sb.append(this.url);
        sb.append('\'');
        sb.append(", maxWidth=");
        sb.append(this.maxWidth);
        sb.append(", hideMedia=");
        sb.append(this.hideMedia);
        sb.append(", hideThread=");
        sb.append(this.hideThread);
        sb.append(", omitScript=");
        sb.append(this.omitScript);
        sb.append(", align=");
        sb.append(this.align);
        sb.append(", related=");
        String[] strArr = this.related;
        if (strArr == null) {
            list = null;
        } else {
            list = Arrays.asList(strArr);
        }
        sb.append(list);
        sb.append(", lang='");
        sb.append(this.lang);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    private void appendParameter(String str, long j, List<HttpParameter> list) {
        if (0 <= j) {
            list.add(new HttpParameter(str, String.valueOf(j)));
        }
    }
}
