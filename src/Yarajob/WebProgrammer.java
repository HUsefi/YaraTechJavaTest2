package Yarajob;

public class WebProgrammer extends Applicant {
    private String jobPosition;
    private String languageProgramming;


    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getLanguageProgramming() {
        return languageProgramming;
    }

    public void setLanguageProgramming(String languageProgramming) {
        this.languageProgramming = languageProgramming;
    }

    public String toString() {
        return "\n"+"WebProgrammer : "+super.showInfo()+", jobPosition"+ getJobPosition()+
                ", languageProgramming = "+ getLanguageProgramming()+".\t\t";
    }

}
