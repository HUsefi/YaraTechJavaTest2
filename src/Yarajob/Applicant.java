package Yarajob;

public  class Applicant {
    private  String name;
    private  Long numberId;
    private  int workExperiences;

    public  String showInfo(){
         return "name=" + getName() + ", numberId="
                 + getNumberId() + ", workExperiences=" + getWorkExperiences() ;
    }


    public String getName() {
        return name;
    }

    public void setName(String name)  {
        this.name = name;
    }

    public Long getNumberId() {
        return numberId;
    }

    public void setNumberId(Long numberId)  {
        this.numberId = numberId;
    }

    public int getWorkExperiences()  {
        return workExperiences;
    }

    public void setWorkExperiences(int workExperiences) {
        this.workExperiences = workExperiences;
    }
}
