package databases;

import entities.Member;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberDatabase {

    public List<Member> databaseOfMembers() {
        return new ArrayList<>(Arrays.asList(
                new Member("1", "Arun", "Bangalore", "9353925080"),
                new Member("2", "Harsha", "Bijapur", "7458215487"),
                new Member("3", "Kiran", "Naragund", "9358925080"),
                new Member("4", "Divya", "Hubballi", "9685425080"),
                new Member("5", "Sandeep", "Davanagere", "9353525080")
        ));
    }
}
