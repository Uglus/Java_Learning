package Lecture_26_repeat;

public interface DataCallback<T extends Successful,E extends Failure> {

    void returnSuccess(T dataContainer);

    void returnError(E errorInfo);

    class Base implements DataCallback<DataContainer,ErrorInfo>{
        private final Log log;

        public Base(Log log) {
            this.log = log;
        }

        @Override
        public void returnSuccess(DataContainer dataContainer) {
            dataContainer.show();
        }

        @Override
        public void returnError(ErrorInfo errorInfo) {
            errorInfo.log(log);
        }
    }
}

interface Successful {}

interface Failure{}
