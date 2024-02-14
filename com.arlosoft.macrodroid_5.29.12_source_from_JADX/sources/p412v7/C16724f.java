package p412v7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Hashtable;
import java.util.StringTokenizer;

/* renamed from: v7.f */
/* compiled from: MimeTypeFile */
public class C16724f {

    /* renamed from: a */
    private String f67666a = null;

    /* renamed from: b */
    private Hashtable f67667b = new Hashtable();

    public C16724f(String str) throws IOException {
        this.f67666a = str;
        FileReader fileReader = new FileReader(new File(this.f67666a));
        try {
            m99286d(new BufferedReader(fileReader));
        } finally {
            try {
                fileReader.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    private void m99286d(BufferedReader bufferedReader) throws IOException {
        String str;
        String readLine;
        loop0:
        while (true) {
            str = null;
            while (true) {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break loop0;
                }
                if (str != null) {
                    readLine = str + readLine;
                }
                int length = readLine.length();
                if (readLine.length() <= 0) {
                    break;
                }
                int i = length - 1;
                if (readLine.charAt(i) != '\\') {
                    break;
                }
                str = readLine.substring(0, i);
            }
            m99287e(readLine);
        }
        if (str != null) {
            m99287e(str);
        }
    }

    /* renamed from: e */
    private void m99287e(String str) {
        String trim = str.trim();
        if (trim.length() != 0 && trim.charAt(0) != '#') {
            if (trim.indexOf(61) > 0) {
                C16719a aVar = new C16719a(trim);
                String str2 = null;
                while (aVar.mo79636a()) {
                    String b = aVar.mo79637b();
                    String b2 = (!aVar.mo79636a() || !aVar.mo79637b().equals("=") || !aVar.mo79636a()) ? null : aVar.mo79637b();
                    if (b2 == null) {
                        if (C16720b.m99260a()) {
                            C16720b.m99261b("Bad .mime.types entry: " + trim);
                            return;
                        }
                        return;
                    } else if (b.equals("type")) {
                        str2 = b2;
                    } else if (b.equals("exts")) {
                        StringTokenizer stringTokenizer = new StringTokenizer(b2, ",");
                        while (stringTokenizer.hasMoreTokens()) {
                            String nextToken = stringTokenizer.nextToken();
                            C16723e eVar = new C16723e(str2, nextToken);
                            this.f67667b.put(nextToken, eVar);
                            if (C16720b.m99260a()) {
                                C16720b.m99261b("Added: " + eVar.toString());
                            }
                        }
                    }
                }
                return;
            }
            StringTokenizer stringTokenizer2 = new StringTokenizer(trim);
            if (stringTokenizer2.countTokens() != 0) {
                String nextToken2 = stringTokenizer2.nextToken();
                while (stringTokenizer2.hasMoreTokens()) {
                    String nextToken3 = stringTokenizer2.nextToken();
                    C16723e eVar2 = new C16723e(nextToken2, nextToken3);
                    this.f67667b.put(nextToken3, eVar2);
                    if (C16720b.m99260a()) {
                        C16720b.m99261b("Added: " + eVar2.toString());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo79649a(String str) {
        try {
            m99286d(new BufferedReader(new StringReader(str)));
        } catch (IOException unused) {
        }
    }

    /* renamed from: b */
    public String mo79650b(String str) {
        C16723e c = mo79651c(str);
        if (c != null) {
            return c.mo79647a();
        }
        return null;
    }

    /* renamed from: c */
    public C16723e mo79651c(String str) {
        return (C16723e) this.f67667b.get(str);
    }

    public C16724f(InputStream inputStream) throws IOException {
        m99286d(new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1")));
    }

    public C16724f() {
    }
}
