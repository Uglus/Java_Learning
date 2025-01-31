package Lecture_28.src.Task;

import Lecture_28.src.TaskFactory;

public interface TaskProgressCallback {

    public void updateTask(Task task);

    class Base implements TaskProgressCallback{
        private final TaskFactory factory;

        public Base(TaskFactory factory){
            this.factory = factory;
        }

        @Override
        public void updateTask(Task task) {
            factory.updateTask(task);
        }
    }

}
