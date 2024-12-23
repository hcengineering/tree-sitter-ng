
package org.treesitter;

import org.treesitter.utils.NativeUtils;

public class TreeSitterAstro extends TSLanguage {

    static {
        NativeUtils.loadLib("lib/tree-sitter-astro");
    }
    private native static long tree_sitter_astro();

    public TreeSitterAstro() {
        super(tree_sitter_astro());
    }

    private TreeSitterAstro(long ptr) {
        super(ptr);
    }

    @Override
    public TSLanguage copy() {
        return new TreeSitterAstro(copyPtr());
    }
}
