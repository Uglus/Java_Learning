package Lecture_26.src;

public class Task {

    private final int id;
    private final Status status;
    private final String description;
    private final String designlink;
    private final String testCase;
    private final String buildLink;

    public Task(int id, Status status, String description, String designlink, String testCase, String buildLink) {
        this.id = id;
        this.status = status;
        this.description = description;
        this.designlink = designlink;
        this.testCase = testCase;
        this.buildLink = buildLink;
    }

    enum Status {
        ASSEMBLING_REQUIREMENTS,
        READY_TO_DO,
        IN_PROGRESS,
        READY_FOR_TESTING,
        DONE
    }
}
