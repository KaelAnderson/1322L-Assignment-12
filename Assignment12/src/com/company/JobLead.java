package com.company;

public class JobLead {
    private String companyName;
    private String contactName;
    private String contactPhone;
    private String jobTitle;
    private String jobDescription;


    JobLead(){}
    JobLead(String inputcompanyName, String inputcontactName, String inputcontactPhone, String inputjobTitle, String inputjobDescription){
        companyName = inputcompanyName;
        contactName = inputcontactName;
        contactPhone = inputcontactPhone;
        jobTitle = inputjobTitle;
        jobDescription = inputjobDescription;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getContactName() {
        return contactName;
    }
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    public String getContactPhone() {
        return contactPhone;
    }
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
    public String getJobDescription() {
        return jobDescription;
    }
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    @Override
    public String toString() {
        return ("companyName:" + companyName + "\n" +
                "contactName:" + contactName + "\n" +
                "contactPhone:" + contactPhone + "\n" +
                "jobTitle:" + jobTitle + "\n" +
                "jobDescription:" + jobDescription);
    }
}
