#include <string.h>
#include <jni.h>

jstring Java_com_yoyoflash_hello_1jni_MainActivity_stringFromJNI(JNIEnv* env,
		jobject thiz) {
	return (*env)->NewStringUTF(env, "Hello from JNI haha 中文!");
}
