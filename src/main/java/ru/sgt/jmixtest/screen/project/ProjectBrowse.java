package ru.sgt.jmixtest.screen.project;

import io.jmix.ui.screen.*;
import ru.sgt.jmixtest.entity.Project;

@UiController("Project.browse")
@UiDescriptor("project-browse.xml")
@LookupComponent("projectsTable")
public class ProjectBrowse extends StandardLookup<Project> {
}