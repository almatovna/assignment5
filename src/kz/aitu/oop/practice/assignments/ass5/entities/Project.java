package kz.aitu.oop.practice.assignments.ass5.entities;

public class Project extends Programmer{
    private int id;
    private String projectName;
    private String organization;
    private int price;

    public Project(String name, String surname, String projectName, String organization, int price) {
        super(name, surname);
        setProjectName(projectName);
        setOrganization(organization);
        setPrice(price);
    }
    public Project(int id, String name, String surname, String projectName, String organization, int price) {
        super(name, surname);
        setProjectName(projectName);
        setOrganization(organization);
        setPrice(price);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProjectName() {
        return projectName;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getOrganization() {
        return organization;
    }
    public void setOrganization(String organization) {
        this.organization = organization;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                "programmer name='" + super.getName() + '\'' +
                "programmer surname='" + super.getSurname() + '\'' +
                ", organization='" + organization + '\'' +
                ", price=" + price +
                '}';
    }
}
