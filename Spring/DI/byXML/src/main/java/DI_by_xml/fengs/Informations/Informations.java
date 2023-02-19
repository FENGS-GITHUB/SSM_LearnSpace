package DI_by_xml.fengs.Informations;

import DI_by_xml.fengs.ClassInfo.ClassInformation;
import DI_by_xml.fengs.SchoolInfo.School;

public class Informations {

    public Informations(){

    }
    public Informations(ClassInformation classInfo, School schoolInfo, int ID, String lastName, String firstName) {
        ClassInfo = classInfo;
        SchoolInfo = schoolInfo;
        this.ID = ID;
        LastName = lastName;
        FirstName = firstName;
    }

    ClassInformation ClassInfo;
    School SchoolInfo;

    @Override
    public String toString() {
        return "信息:"
                + '\n' +
                "   ID=" + ID + '\n' +
                "   名=" + LastName + '\n' +
                "   姓=" + FirstName + '\n'
                +
                 ClassInfo +
                 SchoolInfo +
                '\n'
                ;
    }

    int ID;
    String LastName;
    String FirstName;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }




    public School getSchoolInfo() {
        return SchoolInfo;
    }

    public void setSchoolInfo(School schoolInfo) {
        SchoolInfo = schoolInfo;
    }

    public ClassInformation getClassInfo() {
        return ClassInfo;
    }

    public void setClassInfo(ClassInformation classInfo) {
        ClassInfo = classInfo;
    }
}
