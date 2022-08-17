/*
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.
    For example, 121 is a palindrome while 123 is not.
*/

class Solution {
    public boolean isPalindrome(int x) {
        
        // Convert x to a string
        String split = Integer.toString(x);

        // Create a new int array to store x
        int [] palindrome = new int [split.length()];
        
        // traverse through array storing chars
        for (int i = 0; i < split.length(); i++){
            palindrome[i] = split.charAt(i)-'0';
        }
        
        // set j to be equal to the last index of our array
        int j = palindrome.length -1;
        
        // incrementing from index 0, if i is equal to j (last index) -> decrement j and increment i
        for (int i = 0; i < palindrome.length;i++){
          if (palindrome[i] == palindrome[j]){
              j--;
              continue;
          }else{
              return false;
          }
        }
        
        // if we reach here, our int is a palindrome
        return true;       
    }
}
