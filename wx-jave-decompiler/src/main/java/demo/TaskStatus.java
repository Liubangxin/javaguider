package demo;

public enum TaskStatus {
    NEW {
        @Override
        void updateStatus() {
            System.out.println("new");
        }
    },
    UNDEFINED {
        @Override
        void updateStatus() {
            System.out.println("undefined");
        }
    };

    abstract void updateStatus();

}
