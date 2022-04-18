package com.damon.gradle.sampleplugin
;

import org.gradle.api.Plugin
import org.gradle.api.Project

class BuildSrcPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task("BuildSrcPlugin"){
            doLast {
                println "from BuildSrcPlugin"
            }
        }
    }
}