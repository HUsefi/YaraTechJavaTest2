package Yarajob;

public class PhoneProgrammer extends Applicant {
    private String jobPosition;
    private int numberReleasedApp;

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public int getNumberReleasedApp() {
        return numberReleasedApp;
    }

    public void setNumberReleasedApp(int numberReleasedApp) {
        this.numberReleasedApp = numberReleasedApp;
    }


    public String toString() {
        return "\n"+ "PhoneProgrammer : "+super.showInfo()+", jobPosition"+ getJobPosition()+
                ", numberReleasedApp = "+ getNumberReleasedApp()+".\t\t";
    }

}
