package codeacademy;

import java.util.Date;

public class Employee {
    private String personalCode;
    private String name;
    private String lastName;
    private Date worksFrom;
    private Date birthday;
    private String occupation;
    private String department;
    private Integer projectId;

    public Employee(
            String personalCode,
            String name,
            String lastName,
            Date worksFrom,
            Date birthday,
            String occupation,
            String department,
            Integer projectId
    ) {
        this.personalCode = personalCode;
        this.name = name;
        this.lastName = lastName;
        this.worksFrom = worksFrom;
        this.birthday = birthday;
        this.occupation = occupation;
        this.department = department;
        this.projectId = projectId;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getWorksFrom() {
        return worksFrom;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getDepartment() {
        return department;
    }

    public Integer getProjectId() {
        return projectId;
    }
}
