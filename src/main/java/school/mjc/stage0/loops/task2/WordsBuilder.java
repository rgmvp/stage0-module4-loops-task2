package school.mjc.stage0.loops.task2;

import java.sql.SQLOutput;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int i =0;
        String s;
        while (i < chars.length ){
            s = String.valueOf(new StringBuilder().append(chars[i]));
            i++;
        }
        System.out.println(s);

    }
}
