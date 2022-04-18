package com.damon.gradle.sampleplugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class JavaPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getTasks().register("JavaPlugin", (task) -> task.doLast((it) -> System.out.println("from JavaPlugin")));
    }
}
