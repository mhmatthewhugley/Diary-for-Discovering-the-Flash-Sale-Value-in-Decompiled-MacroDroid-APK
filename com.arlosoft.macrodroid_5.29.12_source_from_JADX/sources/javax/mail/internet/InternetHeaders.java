package javax.mail.internet;

import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.PropUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.mail.Header;
import javax.mail.MessagingException;
import org.apache.commons.p353io.IOUtils;
import org.apache.http.protocol.HTTP;

public class InternetHeaders {
    private static final boolean ignoreWhitespaceLines = PropUtil.getBooleanSystemProperty("mail.mime.ignorewhitespacelines", false);
    protected List<InternetHeader> headers;

    static class MatchEnum {

        /* renamed from: e */
        private Iterator<InternetHeader> f61341e;
        private boolean match;
        private String[] names;
        private InternetHeader next_header = null;
        private boolean want_line;

        MatchEnum(List<InternetHeader> list, String[] strArr, boolean z, boolean z2) {
            this.f61341e = list.iterator();
            this.names = strArr;
            this.match = z;
            this.want_line = z2;
        }

        private InternetHeader nextMatch() {
            while (this.f61341e.hasNext()) {
                InternetHeader next = this.f61341e.next();
                if (next.line != null) {
                    if (this.names != null) {
                        int i = 0;
                        while (true) {
                            String[] strArr = this.names;
                            if (i < strArr.length) {
                                if (!strArr[i].equalsIgnoreCase(next.getName())) {
                                    i++;
                                } else if (this.match) {
                                    return next;
                                }
                            } else if (!this.match) {
                                return next;
                            }
                        }
                    } else if (this.match) {
                        return null;
                    } else {
                        return next;
                    }
                }
            }
            return null;
        }

        public boolean hasMoreElements() {
            if (this.next_header == null) {
                this.next_header = nextMatch();
            }
            return this.next_header != null;
        }

        public Object nextElement() {
            if (this.next_header == null) {
                this.next_header = nextMatch();
            }
            InternetHeader internetHeader = this.next_header;
            if (internetHeader != null) {
                this.next_header = null;
                if (this.want_line) {
                    return internetHeader.line;
                }
                return new Header(internetHeader.getName(), internetHeader.getValue());
            }
            throw new NoSuchElementException("No more headers");
        }
    }

    static class MatchHeaderEnum extends MatchEnum implements Enumeration<Header> {
        MatchHeaderEnum(List<InternetHeader> list, String[] strArr, boolean z) {
            super(list, strArr, z, false);
        }

        public Header nextElement() {
            return (Header) super.nextElement();
        }
    }

    static class MatchStringEnum extends MatchEnum implements Enumeration<String> {
        MatchStringEnum(List<InternetHeader> list, String[] strArr, boolean z) {
            super(list, strArr, z, true);
        }

        public String nextElement() {
            return (String) super.nextElement();
        }
    }

    public InternetHeaders() {
        ArrayList arrayList = new ArrayList(40);
        this.headers = arrayList;
        arrayList.add(new InternetHeader("Return-Path", (String) null));
        this.headers.add(new InternetHeader("Received", (String) null));
        this.headers.add(new InternetHeader("Resent-Date", (String) null));
        this.headers.add(new InternetHeader("Resent-From", (String) null));
        this.headers.add(new InternetHeader("Resent-Sender", (String) null));
        this.headers.add(new InternetHeader("Resent-To", (String) null));
        this.headers.add(new InternetHeader("Resent-Cc", (String) null));
        this.headers.add(new InternetHeader("Resent-Bcc", (String) null));
        this.headers.add(new InternetHeader("Resent-Message-Id", (String) null));
        this.headers.add(new InternetHeader(HTTP.DATE_HEADER, (String) null));
        this.headers.add(new InternetHeader("From", (String) null));
        this.headers.add(new InternetHeader("Sender", (String) null));
        this.headers.add(new InternetHeader("Reply-To", (String) null));
        this.headers.add(new InternetHeader("To", (String) null));
        this.headers.add(new InternetHeader("Cc", (String) null));
        this.headers.add(new InternetHeader("Bcc", (String) null));
        this.headers.add(new InternetHeader("Message-Id", (String) null));
        this.headers.add(new InternetHeader("In-Reply-To", (String) null));
        this.headers.add(new InternetHeader("References", (String) null));
        this.headers.add(new InternetHeader("Subject", (String) null));
        this.headers.add(new InternetHeader("Comments", (String) null));
        this.headers.add(new InternetHeader("Keywords", (String) null));
        this.headers.add(new InternetHeader("Errors-To", (String) null));
        this.headers.add(new InternetHeader("MIME-Version", (String) null));
        this.headers.add(new InternetHeader("Content-Type", (String) null));
        this.headers.add(new InternetHeader("Content-Transfer-Encoding", (String) null));
        this.headers.add(new InternetHeader("Content-MD5", (String) null));
        this.headers.add(new InternetHeader(":", (String) null));
        this.headers.add(new InternetHeader("Content-Length", (String) null));
        this.headers.add(new InternetHeader("Status", (String) null));
    }

    private static final boolean isEmpty(String str) {
        return str.length() == 0 || (ignoreWhitespaceLines && str.trim().length() == 0);
    }

    public void addHeader(String str, String str2) {
        int size = this.headers.size();
        boolean z = str.equalsIgnoreCase("Received") || str.equalsIgnoreCase("Return-Path");
        if (z) {
            size = 0;
        }
        for (int size2 = this.headers.size() - 1; size2 >= 0; size2--) {
            InternetHeader internetHeader = this.headers.get(size2);
            if (str.equalsIgnoreCase(internetHeader.getName())) {
                if (z) {
                    size = size2;
                } else {
                    this.headers.add(size2 + 1, new InternetHeader(str, str2));
                    return;
                }
            }
            if (!z && internetHeader.getName().equals(":")) {
                size = size2;
            }
        }
        this.headers.add(size, new InternetHeader(str, str2));
    }

    public void addHeaderLine(String str) {
        try {
            char charAt = str.charAt(0);
            if (charAt != ' ') {
                if (charAt != 9) {
                    this.headers.add(new InternetHeader(str));
                    return;
                }
            }
            List<InternetHeader> list = this.headers;
            InternetHeader internetHeader = list.get(list.size() - 1);
            internetHeader.line += IOUtils.LINE_SEPARATOR_WINDOWS + str;
        } catch (StringIndexOutOfBoundsException | NoSuchElementException unused) {
        }
    }

    public Enumeration<String> getAllHeaderLines() {
        return getNonMatchingHeaderLines((String[]) null);
    }

    public Enumeration<Header> getAllHeaders() {
        return new MatchHeaderEnum(this.headers, (String[]) null, false);
    }

    public String[] getHeader(String str) {
        ArrayList arrayList = new ArrayList();
        for (InternetHeader next : this.headers) {
            if (str.equalsIgnoreCase(next.getName()) && next.line != null) {
                arrayList.add(next.getValue());
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public Enumeration<String> getMatchingHeaderLines(String[] strArr) {
        return new MatchStringEnum(this.headers, strArr, true);
    }

    public Enumeration<Header> getMatchingHeaders(String[] strArr) {
        return new MatchHeaderEnum(this.headers, strArr, true);
    }

    public Enumeration<String> getNonMatchingHeaderLines(String[] strArr) {
        return new MatchStringEnum(this.headers, strArr, false);
    }

    public Enumeration<Header> getNonMatchingHeaders(String[] strArr) {
        return new MatchHeaderEnum(this.headers, strArr, false);
    }

    public void load(InputStream inputStream) throws MessagingException {
        load(inputStream, false);
    }

    public void removeHeader(String str) {
        for (int i = 0; i < this.headers.size(); i++) {
            InternetHeader internetHeader = this.headers.get(i);
            if (str.equalsIgnoreCase(internetHeader.getName())) {
                internetHeader.line = null;
            }
        }
    }

    public void setHeader(String str, String str2) {
        int indexOf;
        int i = 0;
        boolean z = false;
        while (i < this.headers.size()) {
            InternetHeader internetHeader = this.headers.get(i);
            if (str.equalsIgnoreCase(internetHeader.getName())) {
                if (!z) {
                    String str3 = internetHeader.line;
                    if (str3 == null || (indexOf = str3.indexOf(58)) < 0) {
                        internetHeader.line = str + ": " + str2;
                    } else {
                        internetHeader.line = internetHeader.line.substring(0, indexOf + 1) + " " + str2;
                    }
                    z = true;
                } else {
                    this.headers.remove(i);
                    i--;
                }
            }
            i++;
        }
        if (!z) {
            addHeader(str, str2);
        }
    }

    public void load(InputStream inputStream, boolean z) throws MessagingException {
        LineInputStream lineInputStream = new LineInputStream(inputStream, z);
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        String str = null;
        while (true) {
            try {
                String readLine = lineInputStream.readLine();
                if (readLine == null || (!readLine.startsWith(" ") && !readLine.startsWith("\t"))) {
                    if (str != null) {
                        addHeaderLine(str);
                    } else if (sb.length() > 0) {
                        addHeaderLine(sb.toString());
                        sb.setLength(0);
                    }
                    str = readLine;
                } else {
                    if (str != null) {
                        sb.append(str);
                        str = null;
                    }
                    if (z2) {
                        String trim = readLine.trim();
                        if (trim.length() > 0) {
                            sb.append(trim);
                        }
                    } else {
                        if (sb.length() > 0) {
                            sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
                        }
                        sb.append(readLine);
                    }
                }
                if (readLine != null && !isEmpty(readLine)) {
                    z2 = false;
                } else {
                    return;
                }
            } catch (IOException e) {
                throw new MessagingException("Error in input stream", e);
            }
        }
    }

    protected static final class InternetHeader extends Header {
        String line;

        public InternetHeader(String str) {
            super("", "");
            int indexOf = str.indexOf(58);
            if (indexOf < 0) {
                this.name = str.trim();
            } else {
                this.name = str.substring(0, indexOf).trim();
            }
            this.line = str;
        }

        public String getValue() {
            char charAt;
            int indexOf = this.line.indexOf(58);
            if (indexOf < 0) {
                return this.line;
            }
            while (true) {
                indexOf++;
                if (indexOf >= this.line.length() || !((charAt = this.line.charAt(indexOf)) == ' ' || charAt == 9 || charAt == 13 || charAt == 10)) {
                }
            }
            return this.line.substring(indexOf);
        }

        public InternetHeader(String str, String str2) {
            super(str, "");
            if (str2 != null) {
                this.line = str + ": " + str2;
                return;
            }
            this.line = null;
        }
    }

    public String getHeader(String str, String str2) {
        String[] header = getHeader(str);
        if (header == null) {
            return null;
        }
        if (header.length == 1 || str2 == null) {
            return header[0];
        }
        StringBuilder sb = new StringBuilder(header[0]);
        for (int i = 1; i < header.length; i++) {
            sb.append(str2);
            sb.append(header[i]);
        }
        return sb.toString();
    }

    public InternetHeaders(InputStream inputStream) throws MessagingException {
        this(inputStream, false);
    }

    public InternetHeaders(InputStream inputStream, boolean z) throws MessagingException {
        this.headers = new ArrayList(40);
        load(inputStream, z);
    }
}
