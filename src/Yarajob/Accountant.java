package Yarajob;
public class Accountant extends Applicant {
    private static String lastDegree;

    public void setLastDegree(String lastDegree) {
        this.lastDegree = lastDegree;
    }
    public String getLastDegree() {
        return lastDegree;
    }

       public String toString() {
            return "Accountant : "+super.showInfo()+", lastDegree = "+ getLastDegree()+".\t\t";
}

}
