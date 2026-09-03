//Two Objects, Two Separate States
import java.util.*;
class HostelRoom
{
    String roomNo;
    int occupied;
    public static void main(String[] args)
    {
        HostelRoom room1 = new HostelRoom();
        HostelRoom room2 = new HostelRoom();
        room1.roomNo = "C-101";
        room2.roomNo = "C-102";
        room1.occupied = 3;
        room2.occupied = 0;
        System.out.println(room1.roomNo + " occupied = " + room1.occupied);
        System.out.println(room2.roomNo + " occupied = " + room2.occupied);
    }
}