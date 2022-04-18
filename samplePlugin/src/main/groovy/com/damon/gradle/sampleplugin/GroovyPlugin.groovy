package com.damon.gradle.sampleplugin;

import org.gradle.api.Plugin
import org.gradle.api.Project

class GroovyPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task("GroovyPlugin"){
            doLast {
                println "from GroovyPlugin"
            }
        }
    }
}