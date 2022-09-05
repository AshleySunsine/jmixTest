package ru.sgt.jmixtest.screen.task;

import io.jmix.ui.screen.*;
import ru.sgt.jmixtest.entity.Task;

@UiController("Task_.browse")
@UiDescriptor("task-browse.xml")
@LookupComponent("tasksTable")
public class TaskBrowse extends StandardLookup<Task> {
}