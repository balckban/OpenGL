cmake_minimum_required(VERSION 3.22.1)

add_library(GLRender SHARED src/main/cpp/GLRender.cpp)

target_link_libraries(GLRender -lGLESv1_CM -lGLESv2 log)