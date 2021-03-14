package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTest {

    @Test
    void addition(){
        int add_1 = 5;
        int add_2 = 6;
        Sample sample = new Sample();
        int add = sample.op(Sample.Operation.ADD,add_1,add_2);
        Assertions.assertThat(add).isEqualTo(11);
    }

    @Test
    void multiplication(){
        int mult_1 = 6;
        int mult_2 = 5;
        Sample sample = new Sample();
        int mult = sample.op(Sample.Operation.MULT,mult_1,mult_2);
        Assertions.assertThat(mult).isEqualTo(30);
    }
}
