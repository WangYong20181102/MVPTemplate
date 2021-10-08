package com.github.wangyong20181102.mvptemplate.services

import com.intellij.openapi.project.Project
import com.github.wangyong20181102.mvptemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
