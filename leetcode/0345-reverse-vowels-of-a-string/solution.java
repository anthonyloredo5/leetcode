class Solution {
    public String reverseVowels(String s) {
        // COnvert the string to a char array to allow modification
        char[] arr = s.toCharArray();

        // Initialize two pointers
        int left = 0;
        int right = arr.length - 1;

        //Start the two -pointer approauch 
        while (left < right) {
            // Move the left pointer to the next vowel
            while (left < right && !isVowel(arr[left])) {
                left++;
            }

            // Move the right pointer to the previous vowel
            while (left < right && !isVowel(arr[right])) {
                right--;
            }

            // If both left and right are vowels, swap them
            if (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                //Move pinters inward 
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    private static boolean isVowel(char c) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');
        return vowels.contains(c);
    }
}
