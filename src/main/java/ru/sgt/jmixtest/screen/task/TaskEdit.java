package ru.sgt.jmixtest.screen.task;

import io.jmix.ui.screen.*;
import ru.sgt.jmixtest.entity.Task;

@UiController("Task_.edit")
@UiDescriptor("task-edit.xml")
@EditedEntityContainer("taskDc")
public class TaskEdit extends StandardEditor<Task> {
}