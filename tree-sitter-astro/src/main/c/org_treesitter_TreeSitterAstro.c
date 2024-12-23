
#include <jni.h>
void *tree_sitter_astro();
/*
 * Class:     org_treesitter_TreeSitterAstro
 * Method:    tree_sitter_astro
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_treesitter_TreeSitterAstro_tree_1sitter_1astro
  (JNIEnv *env, jclass clz){
   return (jlong) tree_sitter_astro();
}
