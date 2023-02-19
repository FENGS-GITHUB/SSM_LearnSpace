package DI_by_xml.fengs.SchoolInfo;

public class School {
    String SchoolName;
    String SchoolAddress;
    String SchoolLevel;

    @Override
    public String toString() {
        return "学校信息:" +'\n'+
                "   SchoolName=" + SchoolName + '\n' +
                "   SchoolAddress=" + SchoolAddress + '\n' +
                "   SchoolLevel=" + SchoolLevel + '\n';
    }

    public School() {
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public String getSchoolAddress() {
        return SchoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        SchoolAddress = schoolAddress;
    }

    public String getSchoolLevel() {
        return SchoolLevel;
    }

    public void setSchoolLevel(String schoolLevel) {
        SchoolLevel = schoolLevel;
    }
}
