package com.android.multidex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

class FolderPathElement implements ClassPathElement {
    private File baseFolder;

    public FolderPathElement(File file) {
        this.baseFolder = file;
    }

    private void collect(File file, String str, ArrayList<String> arrayList) {
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                collect(file2, str + '/' + file2.getName(), arrayList);
            } else {
                arrayList.add(str + '/' + file2.getName());
            }
        }
    }

    public void close() {
    }

    public Iterable<String> list() {
        ArrayList arrayList = new ArrayList();
        collect(this.baseFolder, "", arrayList);
        return arrayList;
    }

    public InputStream open(String str) throws FileNotFoundException {
        return new FileInputStream(new File(this.baseFolder, str.replace('/', File.separatorChar)));
    }
}
