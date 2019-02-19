package com.lachlanlindsay.cs.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UniqueEmails {
    public int numUniqueEmails(String[] emails) {
        if (emails == null || emails.length < 1) {
            return 0;
        }
        if (emails.length == 1) {
            return 1;
        }

        HashSet unique = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");
            String localPart = parts[0];
            String domain = parts[1];
            HashSet<Character> knownChars = new HashSet<>();
            knownChars.add('x' );
            unique.add(localPart.replaceAll("\\.", "")
                    .replaceAll("\\+.+", "") + domain);
            ArrayList<Integer> objects = new ArrayList<>();
            Arrays.sort(objects.toArray());
        }

        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());

        return unique.size();
    }
}
