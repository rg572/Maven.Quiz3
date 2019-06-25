package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private List<Lab> labs;

    public Student() {
        labs = new ArrayList<>();
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for(Lab lab : labs){
            if(lab.getName().equals(labName)){
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        for(Lab lab : labs){
            if(lab.getName().equals(labName)){
                lab.setStatus(labStatus);
                return;
            }
        }
        throw new UnsupportedOperationException();
    }

    public void forkLab(Lab lab) {
        labs.add(lab);
        lab.setStatus(LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        for(Lab lab : labs){
            if(lab.getName().equals(labName)){
                return lab.getStatus();
            }
        }
        return null;
    }

    @Override
    public String toString(){
        StringBuilder sbuild = new StringBuilder();
        for(int i = labs.size()-1; i >= 0; i--){
            sbuild.append(labs.get(i).getName()).append(" > ").append(labs.get(i).getStatus().toString());
            if(i != 0) {
                sbuild.append("\n");
            }
        }

        return sbuild.toString();
    }
}
