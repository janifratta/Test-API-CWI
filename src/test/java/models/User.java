package models;

public class User {
    private String name;
    private String job;

    // Construtor
    public User(String name, String job) {
        this.name = name;
        this.job = job;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
