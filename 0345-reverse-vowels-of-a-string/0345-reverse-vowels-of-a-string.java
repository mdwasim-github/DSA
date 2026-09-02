class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int[] ls = new int[s.length()];
        int count = 0; 
        int index = 0; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || 
                arr[i] == 'O' || arr[i] == 'U' ||
                arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || 
                arr[i] == 'o' || arr[i] == 'u') {
                ls[count] = i;
                index++;
                count++;
            }
        }
        for (int i = 0; i < index / 2; i++) {
            char temp = arr[ls[i]];
            int last = ls[index - i - 1];
            arr[ls[i]] = arr[last];
            arr[last] = temp;
        }
        return new String(arr);
    }
}