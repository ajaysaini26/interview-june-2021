package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
                int temp=0;
                int last = arr[arr.length-1];
                for(int i=arr.length-1 ;i>0;i--){
                    temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }

                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i] + " ");
                }
            }

  }

