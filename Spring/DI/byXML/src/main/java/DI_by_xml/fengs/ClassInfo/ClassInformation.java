package DI_by_xml.fengs.ClassInfo;

public class ClassInformation {
    String MonitorName;
    int No;

    @Override
    public String toString() {
        return "班级信息:" + '\n'+
                "   班任=" + MonitorName + '\n' +
                "   班级号=" + No + '\n'
                ;
    }

    public ClassInformation() {
        System.out.println("装载了一个Class信息对象");
    }

    public String getMonitorName() {
        return MonitorName;
    }

    public void setMonitorName(String monitorName) {
        MonitorName = monitorName;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }
}
