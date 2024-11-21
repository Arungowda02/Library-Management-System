package main_class;

import entities.Fine;
import entities.Member;

import java.time.LocalDate;

import static static_variables.StaticVariables.membersDatabase;

public class fineMain {
    public static void main(String[] args) {
        Member member = membersDatabase.stream().toList().get(0);
//        Fine fine = new Fine("11", member, 10.0, LocalDate.of(2024, 11, 1));
//        fine.calculateFine(LocalDate.of(2024, 11, 5), LocalDate.of(2024, 11, 15));
//        fine.markAsPaid();
//        fine.calculateFine(LocalDate.of(2024, 11, 5), LocalDate.of(2024, 11, 15));

    }
}
