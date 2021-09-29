package com.example.demo.generate;

import com.example.data.generate.FakePersonGenerate;
import com.example.data.generate.StringGenerate;
import org.junit.jupiter.api.Test;

public class StringGenerateTests {

    @Test
    public void testGenerateStringDefaultFiveChars() {
        StringGenerate stringGenerate = new StringGenerate();
        for (int i = 0; i < 5; i++) {
            System.out.println(stringGenerate.GenerateRandomString());
        }
    }

    @Test
    public void testGenerateStringTenChars() {
        StringGenerate stringGenerate = new StringGenerate(10);
        for (int i = 0; i < 5; i++) {
            System.out.println(stringGenerate.GenerateRandomString());
        }
    }

    @Test
    public void testGenerateStringTenUpperChars() {
        StringGenerate stringGenerate = new StringGenerate(10,new StringGenerate.CharsType[]{StringGenerate.CharsType.CAPITALIZED_CHARS});
        for (int i = 0; i < 5; i++) {
            System.out.println(stringGenerate.GenerateRandomString());
        }
    }

    @Test
    public void testGenerateStringTenUpperCharsAndFigures() {
        StringGenerate stringGenerate = new StringGenerate(
                10,
                new StringGenerate.CharsType[]{
                        StringGenerate.CharsType.LOWERCASE_CHARS,
                        StringGenerate.CharsType.FIGURES
                });
        for (int i = 0; i < 5; i++) {
            System.out.println(stringGenerate.GenerateRandomString());
        }
    }

    @Test
    public void testGenerateStringTenFigures() {
        StringGenerate stringGenerate = new StringGenerate(
                10,
                new StringGenerate.CharsType[]{
                        StringGenerate.CharsType.FIGURES
                });
        for (int i = 0; i < 5; i++) {
            System.out.println(stringGenerate.GenerateRandomString());
        }
    }

    @Test
    public void testGeneratePerson() {
        FakePersonGenerate fakePersonGenerate = new FakePersonGenerate();
        fakePersonGenerate.GenerateRandomPerson();
    }
}
