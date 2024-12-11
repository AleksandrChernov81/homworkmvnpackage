package ru.netology.nomworkmvnpackge.nomworkmvnpackgemvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.nomworkmvnpackge.nomworkmvnpackgemvn.services.VacationService;


public class VacationTest {

@ParameterizedTest
@CsvFileSource(files="src/test/resources/vacation.csv")
//@CsvSource
 //       ({"3,10000,3000,20000",
//     "2,100000,60000,150000"})

    public void testCalc(int expected, int income, int expenses, int threshold) {

    VacationService service = new VacationService();
    int actual = service.calculate(income, expenses, threshold);
    Assertions.assertEquals(expected, actual);

    }
}
