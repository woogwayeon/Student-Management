package StudentManagement;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Member> arrayList = new ArrayList<Member>();
        MemberMenu memberMenu = new MemberMenu();

        memberMenu.menuProcess(arrayList);

    } // main()
}// Main


