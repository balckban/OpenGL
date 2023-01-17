
#include "com_example_opengl_GLRender.h"
#include "GLES/gl.h"
#include "GLES2/gl2.h"
#include "CCNDKLogDef.h"

extern "C" {

void Java_com_example_opengl_GLRender_ndkInitGl
        (JNIEnv *env, jobject obj) {
    glClearColor(1.0, 0.0, 0.0, 1.0);
    glClearDepthf(0);
    glEnable(GL_DEPTH_TEST);
    glDepthFunc(GL_LEQUAL);
    LOGW("init");
}

void Java_com_example_opengl_GLRender_ndkPaintGl
        (JNIEnv *env, jobject obj) {
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
    glLoadIdentity();
}


void Java_com_example_opengl_GLRender_ndkResizeGl
        (JNIEnv *env, jobject obj, jint width, jint height) {
    //
    glViewport(0, 0, width, height);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    glOrthof(-1, 1, 1, -1, 0.1, 1000);


}

}