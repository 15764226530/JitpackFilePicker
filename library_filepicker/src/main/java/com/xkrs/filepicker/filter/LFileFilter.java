package com.xkrs.filepicker.filter;

import java.io.File;
import java.io.FileFilter;

public class LFileFilter implements FileFilter {
    private String[] mTypes;

    public LFileFilter(String[] types) {
        this.mTypes = types;
    }

    @Override
    public boolean accept(File file) {
        if (file.isDirectory()) {
            return true;
        }
        if (mTypes != null && mTypes.length > 0) {
            for (String mType : mTypes) {
                if (file.getName().endsWith(mType.toLowerCase()) || file.getName().endsWith(mType.toUpperCase())) {
                    return true;
                }
            }
        } else {
            return true;
        }
        return false;
    }
}
