import java.util.*;

// Q.1) Find next greater element using loop. Time Complexity -> O(n^2) & Space Complexity -> O(1)
// Q.2) Find next greater element using stack. Time Complexity -> O(n) & Space Complexity -> O(n)
// Q.3) Given a series of N daily price quotes for a stack, we need to calculate the span of the stock's price for all N days
// The span of the stock's price in one day is the maximum number of consecutive days(starting from that day going backward)
// for which the stock price was less than or equal to the price of that day.(Previous greater element)
public class NextGreaterElement {   // For Q.3 it is Previous greater element
    public static void main(String[] args) {
//        int [] arr= {1,3,2,1,8,6,3,4};            // Q.1
//        int [] res = new int[arr.length];         // Q.1
//        for(int i = 0;i < arr.length;i++){        // Q.1
//            res[i] = -1;                          // Q.1
//            for (int j = i + 1;j < arr.length;j++){ // Q.1
//                if(arr[j] > arr[i]){              // Q.1
//                    res[i] = arr[j];              // Q.1
//                    break;                        // Q.1
//                }                                 // Q.1
//            }                                     // Q.1
//        }                                         // Q.1
//        for (int i = 0;i < arr.length;i++){       // Q.1
//            System.out.print(arr[i] + " ");       // Q.1
//        }                                         // Q.1
//        System.out.println();                     // Q.1
//        for (int i = 0;i < res.length;i++){       // Q.1
//            System.out.print(res[i] + " ");       // Q.1
//        }                                         // Q.1


//        int [] arr= {1,3,2,1,8,6,3,4};              // Q.2
//        int [] res = new int[arr.length];           // Q.2
//        Stack<Integer> st = new Stack<>();          // Q.2
//        res[res.length - 1] = -1;                   // Q.2
//        st.push(arr[arr.length - 1]);               // Q.2
//        for(int i = arr.length - 2;i >= 0;i--){     // Q.2
//            while (st.size() > 0 && st.peek() < arr[i]){   // Q.2
//                st.pop();                          // Q.2
//            }                                     // Q.2
//            if(st.size() == 0){                   // Q.2
//                res[i] = -1;                      // Q.2
//            }                                     // Q.2
//            else {                                // Q.2
//                res[i] = st.peek();               // Q.2
//            }                                     // Q.2
//            st.push(arr[i]);                      // Q.2
//        }                                         // Q.2
//        for (int i = 0;i < arr.length;i++){       // Q.2
//            System.out.print(arr[i] + " ");       // Q.2
//        }                                         // Q.2
//        System.out.println();                     // Q.2
//        for (int i = 0;i < res.length;i++){       // Q.2
//           System.out.print(res[i] + " ");       // Q.2
//        }                                        // Q.2


        int [] price= {100 ,80 ,60 ,70 ,60 ,75 ,85}; // Q.3
        int [] res = new int[price.length];         // Q.3
        res[0] = 1;                                 // Q.3
        Stack<Integer> st = new Stack<>();          // Q.3
        st.push(0);                            // Q.3
        for(int i = 1;i < price.length;i++){        // Q.3
            while(st.size() > 0 && price[i] >= price[st.peek()]){   // Q.3
                st.pop();                           // Q.3
            }                                       // Q.3
            if(st.size() == 0){                     // Q.3
                res[i] = i + 1;                     // Q.3
            }                                       // Q.3
            else{                                   // Q.3
                res[i] = i - st.peek();             // Q.3
            }                                       // Q.3
            st.push(i);                             // Q.3
        }                                           // Q.3
        for (int i = 0;i < price.length;i++){       // Q.3
            System.out.print(price[i] + " ");       // Q.3
        }                                         // Q.3
        System.out.println();                     // Q.3
        for (int i = 0;i < res.length;i++){       // Q.3
            System.out.print(res[i] + " ");       // Q.3
        }                                        // Q.3
    }
}
