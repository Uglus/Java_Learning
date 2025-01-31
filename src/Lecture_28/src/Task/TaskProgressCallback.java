package Lecture_28.src.Task;

import Lecture_28.src.TaskFactory;

public interface TaskProgressCallback {

    public void updateTask(Task oldTask, Task newTask);

    class Base implements TaskProgressCallback{
        private final TaskFactory factory;

        public Base(TaskFactory factory){
            this.factory = factory;
        }

        @Override
        public void updateTask(Task oldTask, Task newTask) {
            factory.updateTask(oldTask,newTask);
        }
    }

}
