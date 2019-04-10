package challenges;

public class NumberFive {

    /**
     * Two strings, word1 and word2, are called anagrams if they contain all the same characters in the same
     * frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
     *
     * Example:
     * word 1 - cat
     * word 2 - act
     * true
     *
     * Example:
     * word 1 - cat
     * word 2 - acT
     * true
     *
     * Example:
     * word 1 - cat
     * word 2 - actt
     * false
     *
     * Example:
     * word 1 - cat
     * word 2 - acts
     * false
     *
     * @return true if word1 and word2 are case-insensitive anagrams, false otherwise.
     */
    public boolean isAnagram(String word1, String word2)
    {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        char[] breakUp1 = word1.toCharArray();
        char[] breakUp2 = word2.toCharArray();
        if(breakUp1.length==breakUp2.length)
        {
            if(word1==word2)
            {
                return true;
            }
            for (int i = 0; i < breakUp1.length; i++)
            {
                char letter = breakUp1[i];
                for (int j = 0; j < breakUp2.length; j++)
                {
                    char letter2 = breakUp2[j];
                    if(letter == letter2)
                    {
                        breakUp2[j] = '-';
                        break;
                    }
                }
            }
        }
        for(int p = 0; p < breakUp2.length; p++)
        {
            if(breakUp2[p]!='-')
                return false;
        }
        return true;
    }
}
