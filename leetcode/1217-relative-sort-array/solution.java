class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int a=0;
        for(int i=0; i<arr2.length; i++){
            for(int j=a;j<arr1.length;j++){
                if(arr1[j]==arr2[i]){
                    int temp = arr1[j];
                    arr1[j] = arr1[a];
                    arr1[a] = temp;
                    a++;
                } 
            }
        } 

        int[] carry = new int[arr1.length-a];
        int c=a;
        for(int i=0;i<carry.length;i++){
            carry[i]=arr1[c++];
        }  
        Arrays.sort(carry);
        c=0;
        for(int i=a;i<arr1.length;i++){
            arr1[i]=carry[c++];
        }

        return arr1;
    }
}
