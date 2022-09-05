package ru.sgt.jmixtest.screen.project;

import io.jmix.ui.screen.*;
import ru.sgt.jmixtest.entity.Project;

@UiController("Project.edit")
@UiDescriptor("project-edit.xml")
@EditedEntityContainer("projectDc")
public class ProjectEdit extends StandardEditor<Project> {
}