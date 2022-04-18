package com.damon.gradle.sampleplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class KTPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.register("KTPlugin") {
            it.doLast {
                println("from KTPlugin ")
            }
        }
    }
}