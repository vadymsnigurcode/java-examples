package com.example.data.generate;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class StringGenerate {
    final String loweCaseChars = "abcdefghijklmnopqrstuvwxyz";
    final String figures = "12345674890";
    private String lexicon = "";

    final java.util.Random rand = new java.util.Random();

    // consider using a Map<String,Boolean> to say whether the identifier is being used or not
    final Set<String> identifiers = new HashSet<String>();
    private final int stringGeneratedLength;

    public StringGenerate() {
        this.stringGeneratedLength = 5;
        this.lexicon = getLexicon(new CharsType[]{CharsType.ALL});
    }

    public StringGenerate(int charsCount) {
        this.stringGeneratedLength = charsCount;
        this.lexicon = getLexicon(new CharsType[]{CharsType.ALL});
    }

    public StringGenerate(int stringGeneratedLength, CharsType[] charsTypes) {
        this.stringGeneratedLength = stringGeneratedLength;
        if (charsTypes == null || charsTypes.length == 0) {
            lexicon = getLexicon(new CharsType[]{CharsType.ALL});
        } else {
            lexicon = getLexicon(charsTypes);
        }
    }

    public String GenerateRandomString() {
        StringBuilder builder = new StringBuilder();
        while (builder.toString().length() == 0) {
            //int length = rand.nextInt(stringGeneratedLength) + stringGeneratedLength;
            int length = stringGeneratedLength;
            for (int i = 0; i < length; i++) {
                builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
            }
            if (identifiers.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        //System.out.println(builder);
        return builder.toString();
    }

    public String getLexicon(CharsType[] charsTypes) {
        StringBuilder stringBuilder = new StringBuilder();
        for (CharsType charType:charsTypes) {
            switch (charType) {
                case LOWERCASE_CHARS: {
                    stringBuilder.append(loweCaseChars);
                    break;
                }
                case FIGURES: {
                    stringBuilder.append(figures);
                    break;
                }
                case CAPITALIZED_CHARS: {
                    stringBuilder.append(loweCaseChars.toUpperCase(Locale.ROOT));
                    break;
                }
                default: {
                    stringBuilder.append(loweCaseChars);
                    stringBuilder.append(figures);
                    stringBuilder.append(loweCaseChars.toUpperCase(Locale.ROOT));
                    break;
                }
            }
        }
        return stringBuilder.toString();
    }

    public enum CharsType {
        FIGURES,
        CAPITALIZED_CHARS,
        LOWERCASE_CHARS,
        ALL;
    }
}
