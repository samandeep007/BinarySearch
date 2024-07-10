public class FindSmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));

    }

    static char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;
        while(start<=end){
            int midpoint = start + (end-start) / 2;
            if(letters[midpoint]>target){
                end = midpoint - 1;
            }
            else{
                start = midpoint + 1;
            }
        }
        return letters[start%letters.length];
    }
}
