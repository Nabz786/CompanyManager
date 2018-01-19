
public class PatientLocation {
    private illnessDepartment illnessDepartment;
    private int roomNum;

    public PatientLocation(illnessDepartment illnessDepartment, int roomNum){
        this.illnessDepartment = illnessDepartment;
        this.roomNum = roomNum;
    }

    public void setRoomNum(int roomNum){
        this.roomNum = roomNum;
    }

    public int getRoomNum(){
        return roomNum;
    }

    public void setIllnessDepartment(illnessDepartment illnessDepartment){
        this.illnessDepartment = illnessDepartment;
    }

    public illnessDepartment getIllnessDepartment(){
        return illnessDepartment;
    }
}
